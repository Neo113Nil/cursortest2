package j1;

import B1.C2545n;
import B1.InterfaceC2544m;
import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import J0.C3349u1;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7237a {
    public static final <T> T a(@NotNull FocusTargetNode focusTargetNode, int i11, @NotNull Function1<? super InterfaceC2544m.a, ? extends T> function1) {
        int i12;
        e.c cVar;
        InterfaceC2544m interfaceC2544m;
        C2804h0 c02;
        if (!focusTargetNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        H f7 = C2809k.f(focusTargetNode);
        loop0: while (true) {
            i12 = 1;
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
        if ((focusTargetNode2 != null && Intrinsics.d((InterfaceC2544m) focusTargetNode2.G(C2545n.a()), (InterfaceC2544m) focusTargetNode.G(C2545n.a()))) || (interfaceC2544m = (InterfaceC2544m) focusTargetNode.G(C2545n.a())) == null) {
            return null;
        }
        int i14 = 5;
        if (i11 != 5) {
            i14 = 6;
            if (i11 != 6) {
                i14 = 3;
                if (i11 != 3) {
                    i14 = 4;
                    if (i11 != 4) {
                        i14 = 2;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            return (T) interfaceC2544m.a(i12, function1);
                        }
                    }
                }
            }
        }
        i12 = i14;
        return (T) interfaceC2544m.a(i12, function1);
    }
}
