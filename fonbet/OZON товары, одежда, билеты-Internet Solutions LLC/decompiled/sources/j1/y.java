package j1;

import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import D1.s0;
import J0.C3349u1;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class y {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68746a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f68747b;

        static {
            int[] iArr = new int[j1.b.values().length];
            try {
                iArr[j1.b.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.b.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.b.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.b.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f68746a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[w.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f68747b = iArr2;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f68748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f68748b = focusTargetNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FocusTargetNode focusTargetNode = this.f68748b;
            if (focusTargetNode.getNode().isAttached()) {
                f.b(focusTargetNode);
            }
            return Unit.f71690a;
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z11) {
        FocusTargetNode e11 = androidx.compose.ui.focus.k.e(focusTargetNode);
        if (e11 != null) {
            return b(e11, z11);
        }
        return true;
    }

    public static final boolean b(@NotNull FocusTargetNode focusTargetNode, boolean z11) {
        int i11 = a.f68747b[focusTargetNode.O1().ordinal()];
        if (i11 == 1) {
            focusTargetNode.S1(w.Inactive);
            f.b(focusTargetNode);
            return true;
        }
        if (i11 == 2) {
            if (z11) {
                focusTargetNode.S1(w.Inactive);
                f.b(focusTargetNode);
            }
            return z11;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return true;
            }
            throw new Sc.o();
        }
        if (!a(focusTargetNode, z11)) {
            return false;
        }
        focusTargetNode.S1(w.Inactive);
        f.b(focusTargetNode);
        return true;
    }

    public static final boolean c(@NotNull FocusTargetNode focusTargetNode) {
        boolean z11;
        x b11 = ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode)).q()).b();
        try {
            z11 = b11.f68745c;
            if (z11) {
                x.b(b11);
            }
            x.a(b11);
            int i11 = a.f68747b[focusTargetNode.O1().ordinal()];
            boolean z12 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        throw new Sc.o();
                    }
                    z12 = false;
                } else {
                    focusTargetNode.S1(w.Active);
                    f.b(focusTargetNode);
                }
            }
            return z12;
        } finally {
            x.c(b11);
        }
    }

    private static final void d(FocusTargetNode focusTargetNode) {
        s0.a(focusTargetNode, new z(focusTargetNode));
        int i11 = a.f68747b[focusTargetNode.O1().ordinal()];
        if (i11 == 3 || i11 == 4) {
            focusTargetNode.S1(w.Active);
        }
    }

    @NotNull
    public static final j1.b e(@NotNull FocusTargetNode focusTargetNode, int i11) {
        boolean z11;
        r rVar;
        r rVar2;
        int i12 = a.f68747b[focusTargetNode.O1().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return j1.b.Cancelled;
            }
            if (i12 == 3) {
                FocusTargetNode e11 = androidx.compose.ui.focus.k.e(focusTargetNode);
                if (e11 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                j1.b e12 = e(e11, i11);
                j1.b bVar = j1.b.None;
                if (e12 == bVar) {
                    e12 = null;
                }
                if (e12 != null) {
                    return e12;
                }
                z11 = focusTargetNode.f40384a;
                if (z11) {
                    return bVar;
                }
                focusTargetNode.f40384a = true;
                try {
                    r invoke = focusTargetNode.N1().h().invoke(c.a(i11));
                    rVar = r.f68738b;
                    if (invoke == rVar) {
                        return bVar;
                    }
                    rVar2 = r.f68739c;
                    if (invoke == rVar2) {
                        return j1.b.Cancelled;
                    }
                    return invoke.c(q.f68737b) ? j1.b.Redirected : j1.b.RedirectCancelled;
                } finally {
                    focusTargetNode.f40384a = false;
                }
            }
            if (i12 != 4) {
                throw new Sc.o();
            }
        }
        return j1.b.None;
    }

    private static final j1.b f(FocusTargetNode focusTargetNode, int i11) {
        boolean z11;
        r rVar;
        r rVar2;
        z11 = focusTargetNode.f40385b;
        if (!z11) {
            focusTargetNode.f40385b = true;
            try {
                r invoke = focusTargetNode.N1().g().invoke(c.a(i11));
                rVar = r.f68738b;
                if (invoke != rVar) {
                    rVar2 = r.f68739c;
                    if (invoke == rVar2) {
                        return j1.b.Cancelled;
                    }
                    return invoke.c(q.f68737b) ? j1.b.Redirected : j1.b.RedirectCancelled;
                }
            } finally {
                focusTargetNode.f40385b = false;
            }
        }
        return j1.b.None;
    }

    @NotNull
    public static final j1.b g(@NotNull FocusTargetNode focusTargetNode, int i11) {
        e.c cVar;
        C2804h0 c02;
        int i12 = a.f68747b[focusTargetNode.O1().ordinal()];
        if (i12 == 1 || i12 == 2) {
            return j1.b.None;
        }
        if (i12 == 3) {
            FocusTargetNode e11 = androidx.compose.ui.focus.k.e(focusTargetNode);
            if (e11 != null) {
                return e(e11, i11);
            }
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        if (i12 != 4) {
            throw new Sc.o();
        }
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        H f7 = C2809k.f(focusTargetNode);
        loop0: while (true) {
            if (f7 == null) {
                cVar = null;
                break;
            }
            if ((C3349u1.c(f7) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        cVar = parent$ui_release;
                        U0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar instanceof AbstractC2813m)) {
                                int i13 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            cVar = J12;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new U0.b(new e.c[16]);
                                            }
                                            if (cVar != null) {
                                                bVar.b(cVar);
                                                cVar = null;
                                            }
                                            bVar.b(J12);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            cVar = C2809k.b(bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
        if (focusTargetNode2 == null) {
            return j1.b.None;
        }
        int i14 = a.f68747b[focusTargetNode2.O1().ordinal()];
        if (i14 == 1) {
            return f(focusTargetNode2, i11);
        }
        if (i14 == 2) {
            return j1.b.Cancelled;
        }
        if (i14 == 3) {
            return g(focusTargetNode2, i11);
        }
        if (i14 != 4) {
            throw new Sc.o();
        }
        j1.b g10 = g(focusTargetNode2, i11);
        j1.b bVar2 = g10 != j1.b.None ? g10 : null;
        return bVar2 == null ? f(focusTargetNode2, i11) : bVar2;
    }

    public static final boolean h(@NotNull FocusTargetNode focusTargetNode) {
        e.c cVar;
        C2804h0 c02;
        int i11 = a.f68747b[focusTargetNode.O1().ordinal()];
        boolean z11 = true;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                if (a(focusTargetNode, false)) {
                    d(focusTargetNode);
                }
                z11 = false;
            } else {
                if (i11 != 4) {
                    throw new Sc.o();
                }
                if (!focusTargetNode.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
                H f7 = C2809k.f(focusTargetNode);
                loop0: while (true) {
                    cVar = null;
                    if (f7 == null) {
                        break;
                    }
                    if ((C3349u1.c(f7) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                e.c cVar2 = parent$ui_release;
                                U0.b bVar = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof FocusTargetNode) {
                                        cVar = cVar2;
                                        break loop0;
                                    }
                                    if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar2 instanceof AbstractC2813m)) {
                                        int i12 = 0;
                                        for (e.c J12 = ((AbstractC2813m) cVar2).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                            if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    cVar2 = J12;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new U0.b(new e.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        bVar.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    bVar.b(J12);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    cVar2 = C2809k.b(bVar);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    f7 = f7.g0();
                    parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                if (focusTargetNode2 != null) {
                    w O12 = focusTargetNode2.O1();
                    z11 = j(focusTargetNode2, focusTargetNode);
                    if (z11 && O12 != focusTargetNode2.O1()) {
                        f.b(focusTargetNode2);
                    }
                } else {
                    if (((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode)).q()).q()) {
                        d(focusTargetNode);
                    }
                    z11 = false;
                }
            }
        }
        if (z11) {
            f.b(focusTargetNode);
        }
        return z11;
    }

    public static final Boolean i(@NotNull FocusTargetNode focusTargetNode, int i11) {
        boolean z11;
        U0.b bVar;
        Boolean valueOf;
        x b11 = ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode)).q()).b();
        b bVar2 = new b(focusTargetNode);
        try {
            z11 = b11.f68745c;
            if (z11) {
                x.b(b11);
            }
            x.a(b11);
            bVar = b11.f68744b;
            bVar.b(bVar2);
            int i12 = a.f68746a[g(focusTargetNode, i11).ordinal()];
            if (i12 == 1) {
                valueOf = Boolean.valueOf(h(focusTargetNode));
            } else if (i12 != 2) {
                if (i12 != 3 && i12 != 4) {
                    throw new Sc.o();
                }
                valueOf = null;
            } else {
                valueOf = Boolean.TRUE;
            }
            return valueOf;
        } finally {
            x.c(b11);
        }
    }

    private static final boolean j(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        e.c cVar;
        e.c cVar2;
        C2804h0 c02;
        C2804h0 c03;
        if (!focusTargetNode2.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode2.getNode().getParent$ui_release();
        H f7 = C2809k.f(focusTargetNode2);
        loop0: while (true) {
            cVar = null;
            if (f7 == null) {
                cVar2 = null;
                break;
            }
            if ((C3349u1.c(f7) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        cVar2 = parent$ui_release;
                        U0.b bVar = null;
                        while (cVar2 != null) {
                            if (cVar2 instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((cVar2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar2 instanceof AbstractC2813m)) {
                                int i11 = 0;
                                for (e.c J12 = ((AbstractC2813m) cVar2).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                    if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar2 = J12;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new U0.b(new e.c[16]);
                                            }
                                            if (cVar2 != null) {
                                                bVar.b(cVar2);
                                                cVar2 = null;
                                            }
                                            bVar.b(J12);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar2 = C2809k.b(bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c03 = f7.c0()) == null) ? null : c03.m();
        }
        if (!Intrinsics.d(cVar2, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i12 = a.f68747b[focusTargetNode.O1().ordinal()];
        if (i12 == 1) {
            d(focusTargetNode2);
            focusTargetNode.S1(w.ActiveParent);
            return true;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    throw new Sc.o();
                }
                if (!focusTargetNode.getNode().isAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                e.c parent$ui_release2 = focusTargetNode.getNode().getParent$ui_release();
                H f11 = C2809k.f(focusTargetNode);
                loop4: while (true) {
                    if (f11 == null) {
                        break;
                    }
                    if ((C3349u1.c(f11) & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                e.c cVar3 = parent$ui_release2;
                                U0.b bVar2 = null;
                                while (cVar3 != null) {
                                    if (cVar3 instanceof FocusTargetNode) {
                                        cVar = cVar3;
                                        break loop4;
                                    }
                                    if ((cVar3.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0 && (cVar3 instanceof AbstractC2813m)) {
                                        int i13 = 0;
                                        for (e.c J13 = ((AbstractC2813m) cVar3).J1(); J13 != null; J13 = J13.getChild$ui_release()) {
                                            if ((J13.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    cVar3 = J13;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new U0.b(new e.c[16]);
                                                    }
                                                    if (cVar3 != null) {
                                                        bVar2.b(cVar3);
                                                        cVar3 = null;
                                                    }
                                                    bVar2.b(J13);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    cVar3 = C2809k.b(bVar2);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    f11 = f11.g0();
                    parent$ui_release2 = (f11 == null || (c02 = f11.c0()) == null) ? null : c02.m();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar;
                if (focusTargetNode3 == null && ((FocusOwnerImpl) ((AndroidComposeView) C2809k.g(focusTargetNode)).q()).q()) {
                    d(focusTargetNode2);
                    focusTargetNode.S1(w.ActiveParent);
                    return true;
                }
                if (focusTargetNode3 != null && j(focusTargetNode3, focusTargetNode)) {
                    boolean j11 = j(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.O1() != w.ActiveParent) {
                        throw new IllegalStateException("Deactivated node is focused");
                    }
                    if (j11) {
                        f.b(focusTargetNode3);
                    }
                    return j11;
                }
            } else {
                if (androidx.compose.ui.focus.k.e(focusTargetNode) == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                if (a(focusTargetNode, false)) {
                    d(focusTargetNode2);
                    return true;
                }
            }
        }
        return false;
    }
}
