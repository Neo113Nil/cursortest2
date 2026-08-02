package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;", "state", "Lkotlin/Function0;", "", "onButtonClick", "WholeSaleOverlayButtonComposable", "(Lru/ozon/app/android/pdp/widgets/wholeSaleModal3P/presentation/wholeSaleButton/WholeSaleModalButtonVI;Lkotlin/jvm/functions/Function0;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WholeSaleOverlayButtonComposableKt {
    public static final void WholeSaleOverlayButtonComposable(@NotNull WholeSaleModalButtonVI state, @NotNull Function0<Unit> onButtonClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        C3969l u11 = interfaceC3967k.u(-1186816088);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onButtonClick) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar, C7811b0.b(ThemeExtKt.themeColor(context, R$attr.layerFloor1)), y0.a());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            ButtonV3DTO button = state.getButton();
            Paddings paddings = Paddings.PADDING_500;
            e e11 = a0.e(T.i(aVar, paddings.m1867getDpD9Ej5fM(), Paddings.PADDING_300.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM()), 1.0f);
            u11.o(-1391320919);
            boolean z11 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new WholeSaleOverlayButtonComposableKt$WholeSaleOverlayButtonComposable$1$1$1(onButtonClick);
                u11.x(C11);
            }
            u11.k();
            DsButtonAtomKt.DsButtonAtom(button, e11, false, (Function1) C11, u11, 0, 4);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new WholeSaleOverlayButtonComposableKt$WholeSaleOverlayButtonComposable$2(state, onButtonClick, i11));
        }
    }
}
