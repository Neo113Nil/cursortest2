package j1;

import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import J0.C3349u1;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68721a;

        static {
            int[] iArr = new int[w.values().length];
            try {
                iArr[w.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f68721a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0090, code lost:
    
        continue;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w a(@NotNull e eVar) {
        w O12;
        e.c node = eVar.getNode();
        U0.b bVar = null;
        while (true) {
            int i11 = 0;
            if (node == null) {
                if (!eVar.getNode().isAttached()) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                U0.b bVar2 = new U0.b(new e.c[16]);
                e.c child$ui_release = eVar.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    C2809k.a(bVar2, eVar.getNode());
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
                                        w O13 = ((FocusTargetNode) cVar).O1();
                                        int i12 = a.f68721a[O13.ordinal()];
                                        if (i12 == 1 || i12 == 2 || i12 == 3) {
                                            return O13;
                                        }
                                    } else if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
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
                return w.Inactive;
            }
            if (node instanceof FocusTargetNode) {
                O12 = ((FocusTargetNode) node).O1();
                int i14 = a.f68721a[O12.ordinal()];
                if (i14 == 1 || i14 == 2 || i14 == 3) {
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
        return O12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void b(@NotNull FocusTargetNode focusTargetNode) {
        C2804h0 c02;
        e.c node = focusTargetNode.getNode();
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c node2 = focusTargetNode.getNode();
        H f7 = C2809k.f(focusTargetNode);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 5120) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & 5120) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & 4096) != 0) {
                            AbstractC2813m abstractC2813m = node2;
                            ?? r42 = 0;
                            while (abstractC2813m != 0) {
                                if (abstractC2813m instanceof e) {
                                    e eVar = (e) abstractC2813m;
                                    eVar.L(a(eVar));
                                } else if ((abstractC2813m.getKindSet$ui_release() & 4096) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r42 = r42;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 4096) != 0) {
                                            i11++;
                                            r42 = r42;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r42.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r42.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r42 = r42;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC2813m = C2809k.b(r42);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            node2 = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
    }
}
