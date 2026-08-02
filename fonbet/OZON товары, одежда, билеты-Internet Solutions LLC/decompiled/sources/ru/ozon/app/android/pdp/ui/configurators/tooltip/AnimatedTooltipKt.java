package ru.ozon.app.android.pdp.ui.configurators.tooltip;

import B1.B;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import i1.C6981a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.U0;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipAtomKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\b\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/tooltip/ActiveTooltip;", "activeTooltip", "Lkotlin/Function0;", "", "onDismiss", "", "dismissOnBackPress", "dismissOnClickOutside", "AnimatedTooltip", "(Lru/ozon/app/android/pdp/ui/configurators/tooltip/ActiveTooltip;Lkotlin/jvm/functions/Function0;ZZLS0/k;II)V", "", "alpha", "configurators_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimatedTooltipKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedTooltip(ActiveTooltip activeTooltip, @NotNull Function0<Unit> onDismiss, boolean z11, boolean z12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        D0 g10;
        ActiveTooltip activeTooltip2;
        boolean z17;
        boolean z18;
        J0 m02;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        C3969l u11 = interfaceC3967k.u(-690321481);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(activeTooltip) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(onDismiss) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            z13 = z11;
            i13 |= u11.p(z13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z14 = z12;
                i13 |= u11.p(z14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    z15 = i15 != 0 ? false : z13;
                    z16 = i14 != 0 ? false : z14;
                    g10 = H0.g(activeTooltip, "TooltipTransition", u11, (i13 & 14) | 48);
                    AnimatedTooltipKt$AnimatedTooltip$alpha$2 animatedTooltipKt$AnimatedTooltip$alpha$2 = AnimatedTooltipKt$AnimatedTooltip$alpha$2.INSTANCE;
                    U0 b11 = W0.b();
                    ActiveTooltip activeTooltip3 = (ActiveTooltip) g10.h();
                    u11.o(1022737842);
                    float f7 = activeTooltip3 != null ? 1.0f : 0.0f;
                    u11.k();
                    Float valueOf = Float.valueOf(f7);
                    ActiveTooltip activeTooltip4 = (ActiveTooltip) g10.n();
                    u11.o(1022737842);
                    float f11 = activeTooltip4 != null ? 1.0f : 0.0f;
                    u11.k();
                    D0.d d11 = H0.d(g10, valueOf, Float.valueOf(f11), animatedTooltipKt$AnimatedTooltip$alpha$2.invoke((AnimatedTooltipKt$AnimatedTooltip$alpha$2) g10.m(), (D0.b) u11, (C3969l) 0), b11, u11, 196608);
                    activeTooltip2 = (ActiveTooltip) g10.n();
                    if (activeTooltip2 == null) {
                        activeTooltip2 = (ActiveTooltip) g10.h();
                    }
                    if ((g10.h() == null || g10.n() != null) && activeTooltip2 != null) {
                        e a11 = C6981a.a(e.f40358c0, AnimatedTooltip$lambda$1(d11));
                        TooltipDTO dto = activeTooltip2.getDto();
                        B anchor = activeTooltip2.getAnchor();
                        int i16 = i13;
                        DsTooltipAtomKt.DsTooltipAtom(dto, a11, anchor, new C6041S(9, z15, z16), onDismiss, onDismiss, u11, ((i16 << 12) & 458752) | TooltipDTO.$stable | ((i16 << 9) & 57344), 0);
                        u11 = u11;
                    }
                    z17 = z15;
                    z18 = z16;
                } else {
                    u11.j();
                    z17 = z13;
                    z18 = z14;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new AnimatedTooltipKt$AnimatedTooltip$1(activeTooltip, onDismiss, z17, z18, i11, i12));
                    return;
                }
                return;
            }
            z14 = z12;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            g10 = H0.g(activeTooltip, "TooltipTransition", u11, (i13 & 14) | 48);
            AnimatedTooltipKt$AnimatedTooltip$alpha$2 animatedTooltipKt$AnimatedTooltip$alpha$22 = AnimatedTooltipKt$AnimatedTooltip$alpha$2.INSTANCE;
            U0 b112 = W0.b();
            ActiveTooltip activeTooltip32 = (ActiveTooltip) g10.h();
            u11.o(1022737842);
            if (activeTooltip32 != null) {
            }
            u11.k();
            Float valueOf2 = Float.valueOf(f7);
            ActiveTooltip activeTooltip42 = (ActiveTooltip) g10.n();
            u11.o(1022737842);
            if (activeTooltip42 != null) {
            }
            u11.k();
            D0.d d112 = H0.d(g10, valueOf2, Float.valueOf(f11), animatedTooltipKt$AnimatedTooltip$alpha$22.invoke((AnimatedTooltipKt$AnimatedTooltip$alpha$2) g10.m(), (D0.b) u11, (C3969l) 0), b112, u11, 196608);
            activeTooltip2 = (ActiveTooltip) g10.n();
            if (activeTooltip2 == null) {
            }
            if (g10.h() == null) {
            }
            e a112 = C6981a.a(e.f40358c0, AnimatedTooltip$lambda$1(d112));
            TooltipDTO dto2 = activeTooltip2.getDto();
            B anchor2 = activeTooltip2.getAnchor();
            int i162 = i13;
            DsTooltipAtomKt.DsTooltipAtom(dto2, a112, anchor2, new C6041S(9, z15, z16), onDismiss, onDismiss, u11, ((i162 << 12) & 458752) | TooltipDTO.$stable | ((i162 << 9) & 57344), 0);
            u11 = u11;
            z17 = z15;
            z18 = z16;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        z13 = z11;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        z14 = z12;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        g10 = H0.g(activeTooltip, "TooltipTransition", u11, (i13 & 14) | 48);
        AnimatedTooltipKt$AnimatedTooltip$alpha$2 animatedTooltipKt$AnimatedTooltip$alpha$222 = AnimatedTooltipKt$AnimatedTooltip$alpha$2.INSTANCE;
        U0 b1122 = W0.b();
        ActiveTooltip activeTooltip322 = (ActiveTooltip) g10.h();
        u11.o(1022737842);
        if (activeTooltip322 != null) {
        }
        u11.k();
        Float valueOf22 = Float.valueOf(f7);
        ActiveTooltip activeTooltip422 = (ActiveTooltip) g10.n();
        u11.o(1022737842);
        if (activeTooltip422 != null) {
        }
        u11.k();
        D0.d d1122 = H0.d(g10, valueOf22, Float.valueOf(f11), animatedTooltipKt$AnimatedTooltip$alpha$222.invoke((AnimatedTooltipKt$AnimatedTooltip$alpha$2) g10.m(), (D0.b) u11, (C3969l) 0), b1122, u11, 196608);
        activeTooltip2 = (ActiveTooltip) g10.n();
        if (activeTooltip2 == null) {
        }
        if (g10.h() == null) {
        }
        e a1122 = C6981a.a(e.f40358c0, AnimatedTooltip$lambda$1(d1122));
        TooltipDTO dto22 = activeTooltip2.getDto();
        B anchor22 = activeTooltip2.getAnchor();
        int i1622 = i13;
        DsTooltipAtomKt.DsTooltipAtom(dto22, a1122, anchor22, new C6041S(9, z15, z16), onDismiss, onDismiss, u11, ((i1622 << 12) & 458752) | TooltipDTO.$stable | ((i1622 << 9) & 57344), 0);
        u11 = u11;
        z17 = z15;
        z18 = z16;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final float AnimatedTooltip$lambda$1(A1<Float> a12) {
        return a12.getValue().floatValue();
    }
}
