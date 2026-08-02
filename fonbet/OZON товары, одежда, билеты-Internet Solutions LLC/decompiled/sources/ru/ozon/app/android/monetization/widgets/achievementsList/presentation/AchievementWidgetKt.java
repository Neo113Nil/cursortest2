package ru.ozon.app.android.monetization.widgets.achievementsList.presentation;

import A0.h;
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
import Tg.b;
import android.content.Context;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import e1.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.achievementsList.presentation.AchievementVO;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;", "state", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "AchievementWidget", "(Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;", "progressBar", "AchievementProgressBar", "(Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$ProgressBarVO;LS0/k;I)V", "Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;", "level", "Landroidx/compose/ui/e;", "modifier", "AchievementLevel", "(Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementVO$LevelVO;Landroidx/compose/ui/e;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AchievementWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AchievementLevel(AchievementVO.LevelVO levelVO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-361265157);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(levelVO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            C7807Z c7807z = TokenParserKt.tokenToColor(levelVO.getBorderColor(), u11, 0);
            u11.o(1933167163);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(levelVO.getBackgroundColor(), u11, 0);
            u11.o(1933170049);
            long bgAquaPrimary = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgAquaPrimary() : c7807z2.w();
            u11.k();
            e b11 = androidx.compose.foundation.e.b(T.f(androidx.compose.foundation.e.b(a0.b(a0.v(eVar, null, 3), 0.0f, 26, 1), layerFloor1, h.b(CornerRadius.RADIUS_300.m1866getDpD9Ej5fM())), Paddings.PADDING_100.m1867getDpD9Ej5fM()), bgAquaPrimary, h.b(CornerRadius.RADIUS_250.m1866getDpD9Ej5fM()));
            V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
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
            float f13 = 5;
            DsTextAtomKt.DsTextAtom(levelVO.getText(), T.j(e.f40358c0, f13, 0.0f, f13, 0.0f, 10), u11, 48, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementWidgetKt$AchievementLevel$2(levelVO, eVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AchievementProgressBar(AchievementVO.ProgressBarVO progressBarVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1584438836);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(progressBarVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(progressBarVO.getProgressBackgroundColor(), u11, 0);
            u11.o(-423712755);
            long bgOverlap = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgOverlap() : c7807z.w();
            u11.k();
            AbstractC7799Q abstractC7799Q = TokenParserKt.tokenToGradient(progressBarVO.getProgressGradient(), u11, 0);
            u11.o(-423709157);
            if (abstractC7799Q == null) {
                abstractC7799Q = TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrSocialPrimary(), u11, UniGradientToken.$stable);
            }
            u11.k();
            e.a aVar = e.f40358c0;
            e f7 = a0.f(a0.r(T.j(aVar, 0.0f, Paddings.PADDING_250.m1867getDpD9Ej5fM(), 0.0f, Paddings.PADDING_200.m1867getDpD9Ej5fM(), 5), 80), 4);
            CornerRadius cornerRadius = CornerRadius.RADIUS_200;
            e b11 = androidx.compose.foundation.e.b(f7, bgOverlap, h.b(cornerRadius.m1866getDpD9Ej5fM()));
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, b11);
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
            C5185h.a(androidx.compose.foundation.e.a(a0.c(a0.e(aVar, progressBarVO.getProgress())), abstractC7799Q, h.b(cornerRadius.m1866getDpD9Ej5fM()), 4), u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementWidgetKt$AchievementProgressBar$2(progressBarVO, i11));
        }
    }

    public static final void AchievementWidget(@NotNull AchievementVO state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(748489762);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(state) : u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e f7 = T.f(a0.e(a0.u(aVar, 3), 1.0f), Paddings.PADDING_200.m1867getDpD9Ej5fM());
            u11.o(526291124);
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(state)));
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AchievementWidgetKt$AchievementWidget$1$1(state, actionHandler);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(f7, null, null, false, null, null, (Function0) C11, 28);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            e c11 = GZ.e.c(u11, f11, aVar, 1.0f);
            V f12 = C5185h.f(InterfaceC6250b.a.m(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, c11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C8366G.a(f.a(ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d())) ? state.getImages().getDarkThemeImageLink() : state.getImages().getDefaultImageLink(), null, null, null, u11, 0, 14), null, C5182e.a(a0.e(T.j(aVar, 0.0f, Paddings.PADDING_400.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), 1.0f), 1.0f, false), null, null, 0.0f, null, u11, 48, 120);
            u11 = u11;
            AchievementVO.LevelVO level = state.getLevel();
            u11.o(-394016015);
            if (level == null) {
                i13 = 0;
            } else {
                i13 = 0;
                AchievementLevel(level, j.a(aVar, 1.0f), u11, 48, 0);
            }
            u11.k();
            u11.f();
            if (state.getProgressBar() != null) {
                u11.o(863537494);
                AchievementProgressBar(state.getProgressBar(), u11, i13);
                u11.k();
            } else {
                u11.o(863608484);
                u0.E.a(u11, a0.f(aVar, Paddings.PADDING_450.m1867getDpD9Ej5fM()));
                u11.k();
            }
            DsTextAtomKt.DsTextAtom(state.getTitle(), a0.b(aVar, 0.0f, 32, 1), u11, 48, i13);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementWidgetKt$AchievementWidget$3(state, actionHandler, i11));
        }
    }
}
