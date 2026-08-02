package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Z1.d;
import a1.c;
import android.view.View;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d2.C6041S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C7990g;
import m0.C8004n;
import m0.G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniThemeKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "dto", "", "isVisible", "Landroid/view/View;", "anchorView", "Ld2/S;", "properties", "Lkotlin/Function0;", "", "onDismissRequest", "onCloseClick", "CartButtonV5Tooltip", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;ZLandroid/view/View;Ld2/S;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "", "alpha", "currentIsVisible", "isTooltipVisible", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5TooltipKt {
    public static final void CartButtonV5Tooltip(CartButtonV5DTO.CartButton.Button.Tooltip tooltip, boolean z11, @NotNull View anchorView, @NotNull C6041S properties, Function0<Unit> function0, @NotNull Function0<Unit> onCloseClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        TooltipDTO tooltip2;
        int i13;
        int i14;
        int i15;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        C3969l u11 = interfaceC3967k.u(656775321);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(tooltip) : u11.F(tooltip) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(anchorView) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(properties) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(onCloseClick) ? 131072 : 65536;
        }
        int i16 = i12;
        if ((i16 & 74899) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            if (tooltip == null || (tooltip2 = tooltip.getTooltip()) == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new CartButtonV5TooltipKt$CartButtonV5Tooltip$tooltip$1(tooltip, z11, anchorView, properties, function0, onCloseClick, i11));
                    return;
                }
                return;
            }
            d dVar = (d) u11.m(K0.e());
            TooltipDTO.BeakPosition beakPosition = tooltip2.getBeakPosition();
            if (beakPosition == null) {
                beakPosition = TooltipDTO.INSTANCE.getDefaultBeakPosition();
            }
            UniPaddingToken leftMargin = tooltip2.getLeftMargin();
            if (leftMargin == null) {
                leftMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            int Y02 = dVar.Y0(TokensExtKt.getDp(leftMargin));
            UniPaddingToken rightMargin = tooltip2.getRightMargin();
            if (rightMargin == null) {
                rightMargin = TooltipDTO.INSTANCE.getDefaultRightMargin();
            }
            int Y03 = dVar.Y0(TokensExtKt.getDp(rightMargin));
            u11.o(-1378347193);
            boolean n11 = u11.n(anchorView) | u11.n(beakPosition) | u11.r(Y02) | u11.r(Y03);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                i13 = 32;
                i14 = 4;
                i15 = 16384;
                CartButtonV5TooltipPositionProvider cartButtonV5TooltipPositionProvider = new CartButtonV5TooltipPositionProvider(anchorView, beakPosition, Y02, Y03, UiExtKt.toPx(8));
                u11.x(cartButtonV5TooltipPositionProvider);
                C11 = cartButtonV5TooltipPositionProvider;
            } else {
                i13 = 32;
                i14 = 4;
                i15 = 16384;
            }
            CartButtonV5TooltipPositionProvider cartButtonV5TooltipPositionProvider2 = (CartButtonV5TooltipPositionProvider) C11;
            u11.k();
            Boolean valueOf = Boolean.valueOf(z11);
            u11.o(-1378335553);
            boolean z12 = ((i16 & 112) == i13) | ((i16 & 14) == i14 || ((i16 & 8) != 0 && u11.F(tooltip))) | ((i16 & 57344) == i15);
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CartButtonV5TooltipKt$CartButtonV5Tooltip$1$1(z11, tooltip, function0, null);
                u11.x(C12);
            }
            u11.k();
            TooltipDTO.Companion companion = TooltipDTO.INSTANCE;
            Q.g(valueOf, tooltip, (Function2) C12, u11);
            A1 b11 = C7990g.b(z11 ? 1.0f : 0.0f, C8004n.d(tooltip.getAnimationDuration(), 0, G.a(), 2), "CartButtonV5TooltipAlpha", u11, 3072, 20);
            c3969l = u11;
            InterfaceC3978p0 l11 = n1.l(Boolean.valueOf(z11), c3969l);
            c3969l.o(-1378319932);
            Object C13 = c3969l.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = n1.e(new CartButtonV5TooltipKt$CartButtonV5Tooltip$isTooltipVisible$2$1(l11, b11));
                c3969l.x(C13);
            }
            c3969l.k();
            if (CartButtonV5Tooltip$lambda$7((A1) C13)) {
                UniThemeKt.UniTheme(false, c.c(-1737964293, new CartButtonV5TooltipKt$CartButtonV5Tooltip$2(cartButtonV5TooltipPositionProvider2, b11, tooltip2, properties, function0, onCloseClick), c3969l), c3969l, 48, 1);
            }
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new CartButtonV5TooltipKt$CartButtonV5Tooltip$3(tooltip, z11, anchorView, properties, function0, onCloseClick, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CartButtonV5Tooltip$lambda$4(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CartButtonV5Tooltip$lambda$5(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean CartButtonV5Tooltip$lambda$7(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
