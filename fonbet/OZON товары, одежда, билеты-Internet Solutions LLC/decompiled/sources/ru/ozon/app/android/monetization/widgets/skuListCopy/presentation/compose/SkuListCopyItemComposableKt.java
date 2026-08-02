package ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.compose;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemVI;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "SkuListCopyItemComposable", "(Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SkuListCopyItemComposableKt {
    public static final void SkuListCopyItemComposable(@NotNull SkuListItemVI state, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        String str;
        Function1<? super AtomAction, Unit> onAtomAction = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(1780037593);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAtomAction) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            float f7 = 16;
            float f11 = 8;
            e j11 = T.j(a0.e(aVar, 1.0f), f7, f11, f7, 0.0f, 8);
            float f12 = 1;
            C7807Z c7807z = TokenParserKt.tokenToColor(UniColors.LAYER_SURFACE.getToken(), u11, 0);
            e j12 = T.j(C8385f.c(f12, c7807z != null ? c7807z.w() : C7807Z.f72259m, j11, h.b(20)), 0.0f, 0.0f, 0.0f, f11, 7);
            u11.o(298510940);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = SkuListCopyItemComposableKt$SkuListCopyItemComposable$1$1.INSTANCE;
                u11.x(C11);
            }
            u11.k();
            e c11 = o.c(j12, false, (Function1) C11);
            TestInfo testInfo = state.getTestInfo();
            if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
                str = "skuListItemRoot";
            }
            e a11 = Q1.a(c11, str);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            DsCellAtomKt.DsCellAtom(state.getSkuCell(), Q1.a(aVar, "skuItemCell"), onAtomAction, u11, CellDTO.$stable | 48 | ((i13 << 3) & 896), 0);
            u11 = u11;
            e h11 = T.h(a0.e(aVar, 1.0f), f11, 0.0f, 2);
            Y b11 = X.b(C5179b.n(f11), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, h11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            int i14 = ((i13 << 6) & 7168) | 48;
            DsButtonAtomKt.DsButtonAtom(state.getSkuButton(), Q1.a(a0.e(aVar, 0.5f), "skuItemSkuButton"), false, function1, u11, i14, 4);
            onAtomAction = function1;
            DsButtonAtomKt.DsButtonAtom(state.getLinkButton(), Q1.a(a0.e(aVar, 1.0f), "skuItemLinkButton"), false, onAtomAction, u11, i14, 4);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SkuListCopyItemComposableKt$SkuListCopyItemComposable$3(state, onAtomAction, i11));
        }
    }
}
