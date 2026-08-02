package ru.ozon.app.android.pdp.widgets.cfboCell.presentation;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import G1.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.UniColors;
import u0.E;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0002H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cfboCell/presentation/CfboCellVI;", "state", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "Lru/ozon/uni/atoms/af/AtomAction;", "onClick", "CfboCellComposable", "(Lru/ozon/app/android/pdp/widgets/cfboCell/presentation/CfboCellVI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CfboCellComposableKt {
    public static final void CfboCellComposable(@NotNull CfboCellVI state, @NotNull Function1<? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(4357779);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
            u11.o(63692005);
            boolean F11 = ((i12 & 112) == 32) | u11.F(state);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CfboCellComposableKt$CfboCellComposable$1$1(state, onView);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(aVar2, b.a(u11, UniColors.LAYER_FLOOR_0.getResId()), y0.a());
            e b12 = androidx.compose.foundation.e.b(T.h(b11, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 0.0f, 2), b.a(u11, UniColors.LAYER_FLOOR_1.getResId()), h.b(CornerRadius.RADIUS_500.m1866getDpD9Ej5fM()));
            u11.o(63709895);
            boolean F12 = ((i12 & 896) == 256) | u11.F(state);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new CfboCellComposableKt$CfboCellComposable$2$1(state, onClick);
                u11.x(C12);
            }
            u11.k();
            e b13 = androidx.compose.foundation.i.b(b12, null, null, false, null, null, (Function0) C12, 28);
            Paddings paddings = Paddings.PADDING_400;
            e j11 = T.j(b13, 0.0f, 0.0f, paddings.m1867getDpD9Ej5fM(), 0.0f, 11);
            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b14, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsImageAtomKt.DsImageAtom(state.getImage(), null, u11, 0, 2);
            E.a(u11, a0.r(aVar2, Paddings.PADDING_250.m1867getDpD9Ej5fM()));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, layoutWeightElement);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            DsTextAtomKt.DsTextAtom(state.getSubtitle(), null, u11, 0, 2);
            u11.f();
            E.a(u11, a0.r(aVar2, paddings.m1867getDpD9Ej5fM()));
            DsBadgeAtomKt.DsBadgeAtom(state.getBadge(), null, null, u11, 0, 6);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CfboCellComposableKt$CfboCellComposable$4(state, onView, onClick, i11));
        }
    }
}
