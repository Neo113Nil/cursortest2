package ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.Q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.BlockV5VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5VO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "NaviBlocksV5ComposeWidget", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "item", "BlockV5", "(Landroidx/compose/ui/e;Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV5ComposeWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BlockV5(e eVar, BlockV5VO blockV5VO, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(1696644371);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(blockV5VO) : u11.F(blockV5VO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(eVar, 1.0f), h.b(16)), UniCompositionLocalKt.getThemedColor(blockV5VO.getBackgroundColor(), u11, UniColorToken.$stable), y0.a());
            boolean z11 = blockV5VO.getAction() != null;
            InterfaceC8369J f7 = Q.f(6, 0L);
            u11.o(384300108);
            boolean z12 = ((i12 & 112) == 32 || ((i12 & 64) != 0 && u11.F(blockV5VO))) | ((i12 & 896) == 256);
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new NaviBlocksV5ComposeWidgetKt$BlockV5$1$1(blockV5VO, function1);
                u11.x(C11);
            }
            u11.k();
            e f11 = T.f(i.b(b11, null, f7, z11, null, null, (Function0) C11, 24), 12);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, f11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            DsIconAtomKt.DsIconAtom(blockV5VO.getIcon(), null, u11, IconDTO.$stable, 2);
            e.a aVar = e.f40358c0;
            E.a(u11, a0.r(aVar, 4));
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, aVar);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            float f14 = 2;
            E.a(u11, a0.f(aVar, f14));
            DsTextAtomKt.DsTextAtom(blockV5VO.getTitle(), null, u11, 0, 2);
            E.a(u11, a0.f(aVar, f14));
            DsTextAtomKt.DsTextAtom(blockV5VO.getSubtitle(), null, u11, 0, 2);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new NaviBlocksV5ComposeWidgetKt$BlockV5$3(eVar, blockV5VO, function1, i11));
        }
    }

    public static final void NaviBlocksV5ComposeWidget(@NotNull NaviBlocksV5VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1381098370);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            UniColorToken backgroundColor = state.getBackgroundColor();
            int i13 = UniColorToken.$stable;
            long themedColor = UniCompositionLocalKt.getThemedColor(backgroundColor, u11, i13);
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(2012887767);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new NaviBlocksV5ComposeWidgetKt$NaviBlocksV5ComposeWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), themedColor, y0.a());
            e h11 = T.h(b11, state.getHorizontalMargin(), 0.0f, 2);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h12);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e a12 = c9891d.a(aVar2, 0.5f, true);
            BlockV5VO leftBlock = state.getLeftBlock();
            int i14 = ((i12 << 3) & 896) | (((i13 | IconDTO.$stable) | AtomAction.$stable) << 3);
            BlockV5(a12, leftBlock, actionHandler, u11, i14);
            E.a(u11, a0.r(aVar2, state.getBlockMargin()));
            BlockV5(c9891d.a(aVar2, 0.5f, true), state.getRightBlock(), actionHandler, u11, i14);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new NaviBlocksV5ComposeWidgetKt$NaviBlocksV5ComposeWidget$3(state, actionHandler, i11));
        }
    }
}
