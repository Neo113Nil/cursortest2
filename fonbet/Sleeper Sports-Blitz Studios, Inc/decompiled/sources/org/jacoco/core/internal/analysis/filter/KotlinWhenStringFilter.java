package org.jacoco.core.internal.analysis.filter;

import java.util.HashSet;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/* loaded from: classes10.dex */
public final class KotlinWhenStringFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Matcher matcher = new Matcher();
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }

    private static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
        
            r7 = r7 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            LabelNode labelNode;
            int size;
            if (25 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
            nextIsSwitch();
            if (this.cursor == null) {
                return;
            }
            this.vars.put("s", (VarInsnNode) abstractInsnNode);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2.getOpcode() == 171) {
                LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) this.cursor;
                labelNode = lookupSwitchInsnNode.dflt;
                size = lookupSwitchInsnNode.labels.size();
            } else {
                TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) this.cursor;
                labelNode = tableSwitchInsnNode.dflt;
                size = tableSwitchInsnNode.labels.size();
            }
            if (size == 0) {
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(skipNonOpcodes(labelNode));
            int i = 1;
            while (i <= size) {
                while (true) {
                    nextIsVar(25, "s");
                    nextIs(18);
                    nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                    nextIs(153);
                    JumpInsnNode jumpInsnNode = (JumpInsnNode) this.cursor;
                    next();
                    if (this.cursor == null) {
                        return;
                    }
                    if (this.cursor.getOpcode() == 167) {
                        hashSet.add(skipNonOpcodes(((JumpInsnNode) this.cursor).label));
                        if (jumpInsnNode.label == labelNode) {
                            break;
                        }
                    } else {
                        if (i != size || jumpInsnNode.label != labelNode) {
                            return;
                        }
                        hashSet.add(this.cursor);
                        this.cursor = jumpInsnNode;
                    }
                }
            }
            iFilterOutput.ignore(abstractInsnNode2.getNext(), this.cursor);
            iFilterOutput.replaceBranches(abstractInsnNode2, hashSet);
        }
    }
}
