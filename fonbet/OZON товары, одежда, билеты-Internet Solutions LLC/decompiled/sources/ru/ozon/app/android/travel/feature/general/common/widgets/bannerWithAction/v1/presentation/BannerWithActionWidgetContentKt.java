package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation;

import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import Pk0.h;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.Q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8385f;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionVO;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "BannerWithActionWidgetContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;", "rightBlock", "RightBlock-3KdReyg", "(Landroid/content/Context;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO$RightBlockVO;LS0/k;I)V", "RightBlock", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerWithActionWidgetContentKt {
    public static final void BannerWithActionWidgetContent(@NotNull BannerWithActionVO state, @NotNull Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        boolean z11;
        e.a aVar;
        Function1<? super AtomAction, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1860404510);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.F(state) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(266656820);
            if (tokenizedEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
                u11.o(1971003041);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new BannerWithActionWidgetContentKt$BannerWithActionWidgetContent$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar2, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            Object b11 = h.b(u11, 266664366);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = Float.valueOf(ResourceExtKt.toPxF(Paddings.PADDING_100.getPx(), context));
                u11.x(b11);
            }
            float floatValue = ((Number) b11).floatValue();
            u11.k();
            u11.o(266666714);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = Float.valueOf(state.getCornerRadius());
                u11.x(C12);
            }
            float floatValue2 = ((Number) C12).floatValue();
            u11.k();
            u11.o(266668449);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = Float.valueOf(floatValue2 - floatValue);
                u11.x(C13);
            }
            float floatValue3 = ((Number) C13).floatValue();
            u11.k();
            C7807Z c7807z = TokenParserKt.tokenToColor(state.getBackgroundColor(), u11, 0);
            u11.o(266670594);
            long bgActionPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActionPrimary() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(state.getBorderColor(), u11, 0);
            u11.o(266673594);
            long textPrimary = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z2.w();
            u11.k();
            long bgActionSecondary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgActionSecondary();
            String borderColor = state.getBorderColor();
            if (borderColor != null) {
                z11 = borderColor.length() > 0;
            } else {
                z11 = false;
            }
            e.a aVar3 = e.f40358c0;
            e b12 = androidx.compose.foundation.e.b(C6988h.a(T.i(a0.e(aVar3, 1.0f), state.getMargins().getStart().m1867getDpD9Ej5fM(), state.getMargins().getTop().m1867getDpD9Ej5fM(), state.getMargins().getEnd().m1867getDpD9Ej5fM(), state.getMargins().getBottom().m1867getDpD9Ej5fM()), A0.h.a(floatValue2)), bgActionPrimary, A0.h.a(floatValue2));
            if (z11) {
                b12 = C8385f.c(Paddings.PADDING_100.m1867getDpD9Ej5fM(), textPrimary, b12, A0.h.a(floatValue3));
            }
            e eVar = b12;
            u11.o(266701058);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = p.a();
                u11.x(C14);
            }
            q qVar = (q) C14;
            u11.k();
            InterfaceC8369J f7 = Q.f(3, bgActionSecondary);
            u11.o(266705091);
            boolean F12 = u11.F(state) | ((i13 & 112) == 32);
            Object C15 = u11.C();
            if (F12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new BannerWithActionWidgetContentKt$BannerWithActionWidgetContent$4$1(state, actionHandler);
                u11.x(C15);
            }
            u11.k();
            e b13 = androidx.compose.foundation.i.b(eVar, qVar, f7, false, null, null, (Function0) C15, 28);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), true);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, b13);
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
            e e11 = a0.e(aVar3, 1.0f);
            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, e11);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e j11 = T.j(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), state.getLeftBlock().getSettings().getLeftPadding().m1867getDpD9Ej5fM(), state.getLeftBlock().getSettings().getTopPadding().m1867getDpD9Ej5fM(), 0.0f, state.getLeftBlock().getSettings().getBottomPadding().m1867getDpD9Ej5fM(), 4);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f15 = c.f(u11, j11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, g10);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(state.getLeftBlock().getTitle(), null, u11, 0, 2);
            TextDTO subtitle = state.getLeftBlock().getSubtitle();
            u11.o(-409304793);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(subtitle, null, u11, 0, 2);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            ButtonV3DTO actionButton = state.getLeftBlock().getActionButton();
            u11.o(-409299685);
            if (actionButton == null) {
                aVar = aVar3;
            } else {
                int i14 = (i13 << 6) & 7168;
                aVar = aVar3;
                DsButtonAtomKt.DsButtonAtom(actionButton, null, false, actionHandler, u11, i14, 6);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            m1205RightBlock3KdReyg(context, state.getRightBlock(), u11, ThemeImageV2VO.$stable << 3);
            u11.f();
            IconButtonV3DTO closeButton = state.getCloseButton();
            u11.o(1971090349);
            if (closeButton == null) {
                actionHandler = function1;
            } else {
                e a15 = c5187j.a(aVar, InterfaceC6250b.a.n());
                Paddings paddings = Paddings.PADDING_500;
                actionHandler = function1;
                DsIconButtonAtomKt.DsIconButtonAtom(closeButton, T.j(a15, 0.0f, paddings.m1867getDpD9Ej5fM(), paddings.m1867getDpD9Ej5fM(), 0.0f, 9), false, actionHandler, u11, IconButtonV3DTO.$stable | ((i13 << 6) & 7168), 4);
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BannerWithActionWidgetContentKt$BannerWithActionWidgetContent$6(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RightBlock-3KdReyg, reason: not valid java name */
    public static final void m1205RightBlock3KdReyg(Context context, BannerWithActionVO.RightBlockVO rightBlockVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(587820955);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(context) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(rightBlockVO) : u11.F(rightBlockVO) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            ThemeImageV2VO image = rightBlockVO != null ? rightBlockVO.getImage() : null;
            if (image != null) {
                DsImageAtomKt.DsImageAtom(ThemeExtKt.isDarkThemeActive(context) ? image.getDark() : image.getLight(), null, u11, 0, 2);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BannerWithActionWidgetContentKt$RightBlock$2(context, rightBlockVO, i11));
        }
    }
}
