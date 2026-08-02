package org.objectweb.asm.tree;

import org.objectweb.asm.MethodVisitor;

/* loaded from: classes10.dex */
public class ParameterNode {
    public int access;
    public String name;

    public ParameterNode(String str, int i) {
        this.name = str;
        this.access = i;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
