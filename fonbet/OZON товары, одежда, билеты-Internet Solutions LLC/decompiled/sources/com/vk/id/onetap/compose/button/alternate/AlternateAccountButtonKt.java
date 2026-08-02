package com.vk.id.onetap.compose.button.alternate;

import B0.C2510t;
import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import P1.F;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import a1.c;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material3.d;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vk.id.onetap.common.alternate.style.InternalVKIDAlternateAccountButtonStyle;
import com.vk.id.onetap.compose.R$string;
import com.vk.id.onetap.compose.button.alternate.AlternateAccountButtonKt;
import com.vk.id.onetap.compose.button.alternate.style.AlternateAccountButtonBackgroundStyleKt;
import com.vk.id.onetap.compose.button.alternate.style.AlternateAccountButtonTextStyleKt;
import com.vk.id.onetap.compose.button.auth.VKIDButtonState;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonBorderStyleKt;
import com.vk.id.onetap.compose.button.auth.style.VKIDButtonRippleStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonCornersStyleKt;
import com.vk.id.onetap.compose.onetap.style.OneTapButtonSizeStyleKt;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l0.H;
import org.jetbrains.annotations.NotNull;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;", "vkidButtonState", "Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;", "style", "Lkotlin/Function0;", "", "onClick", "", "largeText", "AdaptiveAlternateAccountButton", "(Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;Lkotlin/jvm/functions/Function0;ZLS0/k;II)V", "Landroidx/compose/ui/e;", "modifier", "", "textResId", "AlternateAccountButton", "(Landroidx/compose/ui/e;Lcom/vk/id/onetap/common/alternate/style/InternalVKIDAlternateAccountButtonStyle;ILkotlin/jvm/functions/Function0;LS0/k;II)V", "onetap-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AlternateAccountButtonKt {
    public static final void AdaptiveAlternateAccountButton(@NotNull final VKIDButtonState vkidButtonState, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle, @NotNull final Function0<Unit> onClick, final boolean z11, InterfaceC3967k interfaceC3967k, final int i11, final int i12) {
        int i13;
        final InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle2;
        int i14;
        Intrinsics.checkNotNullParameter(vkidButtonState, "vkidButtonState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1128749082);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(vkidButtonState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
                if (u11.n(internalVKIDAlternateAccountButtonStyle2)) {
                    i14 = 32;
                    i13 |= i14;
                }
            } else {
                internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
            }
            i14 = 16;
            i13 |= i14;
        } else {
            internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.p(z11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
                int i15 = i12 & 2;
            } else if ((i12 & 2) != 0) {
                internalVKIDAlternateAccountButtonStyle2 = new InternalVKIDAlternateAccountButtonStyle.Light(null, null, 3, null);
            }
            u11.j0();
            G.c(!vkidButtonState.getUserLoadFailed$onetap_compose_release(), T.j(e.f40358c0, 0.0f, 12, 0.0f, 0.0f, 13), null, null, null, c.c(1414193730, new InterfaceC6511n<H, InterfaceC3967k, Integer, Unit>() { // from class: com.vk.id.onetap.compose.button.alternate.AlternateAccountButtonKt$AdaptiveAlternateAccountButton$1
                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k2, Integer num) {
                    invoke(h11, interfaceC3967k2, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k2, int i16) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (z11) {
                        interfaceC3967k2.o(-907439940);
                        AlternateAccountButtonKt.AlternateAccountButton(null, internalVKIDAlternateAccountButtonStyle2, R$string.vkid_auth_use_another_account, onClick, interfaceC3967k2, 0, 1);
                        interfaceC3967k2.k();
                    } else {
                        interfaceC3967k2.o(-907241354);
                        AlternateAccountButtonKt.AlternateAccountButton(null, internalVKIDAlternateAccountButtonStyle2, R$string.vkid_auth_use_another_account_short, onClick, interfaceC3967k2, 0, 1);
                        interfaceC3967k2.k();
                    }
                }
            }, u11), u11, 196656, 28);
        }
        final InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle3 = internalVKIDAlternateAccountButtonStyle2;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: wa.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AdaptiveAlternateAccountButton$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    int i16 = i11;
                    int i17 = i12;
                    AdaptiveAlternateAccountButton$lambda$0 = AlternateAccountButtonKt.AdaptiveAlternateAccountButton$lambda$0(VKIDButtonState.this, internalVKIDAlternateAccountButtonStyle3, onClick, z11, i16, i17, (InterfaceC3967k) obj, intValue);
                    return AdaptiveAlternateAccountButton$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdaptiveAlternateAccountButton$lambda$0(VKIDButtonState vKIDButtonState, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle, Function0 function0, boolean z11, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13) {
        AdaptiveAlternateAccountButton(vKIDButtonState, internalVKIDAlternateAccountButtonStyle, function0, z11, interfaceC3967k, C2652m.e(i11 | 1), i12);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AlternateAccountButton(e eVar, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle, final int i11, final Function0<Unit> function0, InterfaceC3967k interfaceC3967k, final int i12, final int i13) {
        final e eVar2;
        int i14;
        InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle2;
        Function0<Unit> function02;
        e eVar3;
        F f7;
        int i15;
        C3969l u11 = interfaceC3967k.u(979903613);
        int i16 = i13 & 1;
        if (i16 != 0) {
            i14 = i12 | 6;
            eVar2 = eVar;
        } else if ((i12 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i12;
        } else {
            eVar2 = eVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if ((i13 & 2) == 0) {
                internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
                if (u11.n(internalVKIDAlternateAccountButtonStyle2)) {
                    i15 = 32;
                    i14 |= i15;
                }
            } else {
                internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
            }
            i15 = 16;
            i14 |= i15;
        } else {
            internalVKIDAlternateAccountButtonStyle2 = internalVKIDAlternateAccountButtonStyle;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i12 & 3072) == 0) {
                i14 |= u11.F(function02) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i12 & 1) == 0 || u11.w0()) {
                eVar3 = i16 != 0 ? e.f40358c0 : eVar2;
                if ((i13 & 2) != 0) {
                    internalVKIDAlternateAccountButtonStyle2 = new InternalVKIDAlternateAccountButtonStyle.Light(null, null, 3, null);
                }
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            u11.j0();
            e background = AlternateAccountButtonBackgroundStyleKt.background(C6988h.b(OneTapButtonCornersStyleKt.clip(OneTapButtonSizeStyleKt.height(VKIDButtonBorderStyleKt.border(a0.e(Q1.a(eVar3, "sign_in_to_another_account"), 1.0f), internalVKIDAlternateAccountButtonStyle2.getBorderStyle(), internalVKIDAlternateAccountButtonStyle2.getCornersStyle()), internalVKIDAlternateAccountButtonStyle2.getSizeStyle()), internalVKIDAlternateAccountButtonStyle2.getCornersStyle())), internalVKIDAlternateAccountButtonStyle2.getBackgroundStyle());
            u11.o(-447176618);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = p.a();
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(background, (q) C11, d.c(VKIDButtonRippleStyleKt.asColor(internalVKIDAlternateAccountButtonStyle2.getRippleStyle())), false, null, null, function02, 28);
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            String a12 = G1.i.a(u11, i11);
            long asColorResource = AlternateAccountButtonTextStyleKt.asColorResource(internalVKIDAlternateAccountButtonStyle2.getTextStyle(), u11, 0);
            long asFontSize = OneTapButtonSizeStyleKt.asFontSize(internalVKIDAlternateAccountButtonStyle2.getSizeStyle());
            long asLineHeight = OneTapButtonSizeStyleKt.asLineHeight(internalVKIDAlternateAccountButtonStyle2.getSizeStyle());
            f7 = F.f21510h;
            C2510t.b(a12, null, new K1.T(asColorResource, asFontSize, f7, null, 0L, 3, asLineHeight, null, 0, 16613368), null, 0, false, 0, 0, null, u11, 0, 506);
            u11.f();
            eVar2 = eVar3;
        }
        final InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle3 = internalVKIDAlternateAccountButtonStyle2;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new Function2() { // from class: wa.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AlternateAccountButton$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    int i17 = i12;
                    int i18 = i13;
                    AlternateAccountButton$lambda$3 = AlternateAccountButtonKt.AlternateAccountButton$lambda$3(e.this, internalVKIDAlternateAccountButtonStyle3, i11, function0, i17, i18, (InterfaceC3967k) obj, intValue);
                    return AlternateAccountButton$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlternateAccountButton$lambda$3(e eVar, InternalVKIDAlternateAccountButtonStyle internalVKIDAlternateAccountButtonStyle, int i11, Function0 function0, int i12, int i13, InterfaceC3967k interfaceC3967k, int i14) {
        AlternateAccountButton(eVar, internalVKIDAlternateAccountButtonStyle, i11, function0, interfaceC3967k, C2652m.e(i12 | 1), i13);
        return Unit.f71690a;
    }
}
