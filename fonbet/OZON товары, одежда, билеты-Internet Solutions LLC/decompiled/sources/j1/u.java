package j1;

import D1.AbstractC2813m;
import D1.C2809k;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u {

    static final class a extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f68741b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean i11 = y.i(focusTargetNode, 7);
            return Boolean.valueOf(i11 != null ? i11.booleanValue() : false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0082, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(@NotNull t tVar) {
        e.c node = tVar.getNode();
        U0.b bVar = null;
        while (true) {
            int i11 = 0;
            if (node == null) {
                if (!tVar.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                U0.b bVar2 = new U0.b(new e.c[16]);
                e.c child$ui_release = tVar.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    C2809k.a(bVar2, tVar.getNode());
                } else {
                    bVar2.b(child$ui_release);
                }
                while (bVar2.p()) {
                    e.c cVar = (e.c) Pk0.b.b(1, bVar2);
                    if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        C2809k.a(bVar2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            }
                            if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                U0.b bVar3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        if (y.c((FocusTargetNode) cVar)) {
                                        }
                                    } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                        int i12 = 0;
                                        for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVar = J12;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new U0.b(new e.c[16]);
                                                    }
                                                    if (cVar != null) {
                                                        bVar3.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar3.b(J12);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVar = C2809k.b(bVar3);
                                }
                            } else {
                                cVar = cVar.getChild$ui_release();
                            }
                        }
                    }
                }
                return false;
            }
            if (node instanceof FocusTargetNode) {
                if (y.c((FocusTargetNode) node)) {
                    break;
                }
            } else if ((node.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (node instanceof AbstractC2813m)) {
                for (e.c J13 = ((AbstractC2813m) node).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                    if ((J13.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        i11++;
                        if (i11 == 1) {
                            node = J13;
                        } else {
                            if (bVar == null) {
                                bVar = new U0.b(new e.c[16]);
                            }
                            if (node != null) {
                                bVar.b(node);
                                node = null;
                            }
                            bVar.b(J13);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            node = C2809k.b(bVar);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0098, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(@NotNull t tVar) {
        e.c node = tVar.getNode();
        U0.b bVar = null;
        while (true) {
            int i11 = 0;
            a aVar = a.f68741b;
            if (node == null) {
                if (!tVar.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                U0.b bVar2 = new U0.b(new e.c[16]);
                e.c child$ui_release = tVar.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    C2809k.a(bVar2, tVar.getNode());
                } else {
                    bVar2.b(child$ui_release);
                }
                while (bVar2.p()) {
                    e.c cVar = (e.c) Pk0.b.b(1, bVar2);
                    if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        C2809k.a(bVar2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            }
                            if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                U0.b bVar3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                        if (!focusTargetNode.N1().c()) {
                                            return androidx.compose.ui.focus.n.f(focusTargetNode, 7, aVar);
                                        }
                                        Boolean i12 = y.i(focusTargetNode, 7);
                                        if (i12 != null) {
                                            return i12.booleanValue();
                                        }
                                        return false;
                                    }
                                    if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                        int i13 = 0;
                                        for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    cVar = J12;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new U0.b(new e.c[16]);
                                                    }
                                                    if (cVar != null) {
                                                        bVar3.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar3.b(J12);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    cVar = C2809k.b(bVar3);
                                }
                            } else {
                                cVar = cVar.getChild$ui_release();
                            }
                        }
                    }
                }
                return false;
            }
            if (node instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                if (!focusTargetNode2.N1().c()) {
                    return androidx.compose.ui.focus.n.f(focusTargetNode2, 7, aVar);
                }
                Boolean i14 = y.i(focusTargetNode2, 7);
                if (i14 != null) {
                    return i14.booleanValue();
                }
                return false;
            }
            if ((node.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (node instanceof AbstractC2813m)) {
                for (e.c J13 = ((AbstractC2813m) node).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                    if ((J13.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        i11++;
                        if (i11 == 1) {
                            node = J13;
                        } else {
                            if (bVar == null) {
                                bVar = new U0.b(new e.c[16]);
                            }
                            if (node != null) {
                                bVar.b(node);
                                node = null;
                            }
                            bVar.b(J13);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            node = C2809k.b(bVar);
        }
    }
}
