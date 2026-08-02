package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.I1;
import J0.T0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aG\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;", "iconButtonStyle", "", "isFocused", "isEnabled", "showLoader", "Lkotlin/Function0;", "", "onClick", "IconLoaderButton", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;ZZZLkotlin/jvm/functions/Function0;LS0/k;II)V", "chat_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IconLoaderButtonKt {
    public static final void IconLoaderButton(e eVar, @NotNull IconButtonStyle iconButtonStyle, boolean z11, boolean z12, boolean z13, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e b11;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(iconButtonStyle, "iconButtonStyle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(1176174750);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(iconButtonStyle) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.p(z13) ? 16384 : 8192;
        }
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i13 |= u11.F(onClick) ? 131072 : 65536;
        }
        if ((74899 & i13) == 74898 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
            u11.o(-1859412234);
            boolean z14 = (i13 & 896) == 256;
            Object C11 = u11.C();
            if (z14 || C11 == InterfaceC3967k.a.a()) {
                C11 = C7807Z.m(z11 ? iconButtonStyle.getFocusedColor() : iconButtonStyle.getUnfocusedColor());
                u11.x(C11);
            }
            long w11 = ((C7807Z) C11).w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.v(eVar3, null, 3), h.e()), z11 ? iconButtonStyle.getBackgroundFocusedColor() : iconButtonStyle.getBackgroundUnfocusedColor(), y0.a());
            u11.o(-1859393714);
            boolean z15 = ((i13 & 7168) == 2048) | ((i13 & 458752) == 131072);
            Object C12 = u11.C();
            if (z15 || C12 == InterfaceC3967k.a.a()) {
                C12 = new IconLoaderButtonKt$IconLoaderButton$1$1(z12, onClick);
                u11.x(C12);
            }
            u11.k();
            e f7 = T.f(i.b(b11, null, null, false, null, null, (Function0) C12, 28), iconButtonStyle.getIconMargin());
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, f7);
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
            C5187j c5187j = C5187j.f39515a;
            if (z13) {
                u11.o(602396155);
                c3969l = u11;
                I1.a(a0.n(e.f40358c0, iconButtonStyle.getIconSize()), w11, iconButtonStyle.getLoaderWidth(), 0L, 0, c3969l, 0, 24);
                c3969l.k();
            } else {
                c3969l = u11;
                c3969l.o(602632096);
                e a12 = c5187j.a(a0.n(e.f40358c0, iconButtonStyle.getIconSize()), InterfaceC6250b.a.e());
                UniTheme.INSTANCE.getIcons();
                c3969l.B(-512511069);
                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_arrow_up_filled, "ic_s_arrow_up_filled", c3969l, 48);
                c3969l.K();
                T0.a(uniPainterResource, null, a12, w11, u11, 48);
                c3969l.k();
            }
            c3969l.f();
            eVar2 = eVar3;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new IconLoaderButtonKt$IconLoaderButton$3(eVar2, iconButtonStyle, z11, z12, z13, onClick, i11, i12));
        }
    }
}
