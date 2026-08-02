package ru.ozon.app.android.monetization.widgets.achievementDetails.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import android.content.Context;
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
import androidx.lifecycle.AbstractC5434v;
import e1.InterfaceC6250b;
import e1.j;
import e3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.achievementDetails.presentation.AchievementDetailsVO;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004\u001a!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO;", "state", "", "AchievementDetailsWidget", "(Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO;LS0/k;I)V", "AchievementDetailsContent", "Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;", "level", "Landroidx/compose/ui/e;", "modifier", "AchievementLevel", "(Lru/ozon/app/android/monetization/widgets/achievementDetails/presentation/AchievementDetailsVO$LevelVO;Landroidx/compose/ui/e;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AchievementDetailsWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AchievementDetailsContent(AchievementDetailsVO achievementDetailsVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-314144855);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(achievementDetailsVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e g10 = T.g(aVar, Paddings.PADDING_500.m1867getDpD9Ej5fM(), Paddings.PADDING_200.m1867getDpD9Ej5fM());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, g10);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = achievementDetailsVO.getTitle();
            u11.o(337411593);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(achievementDetailsVO.getTitle(), T.j(aVar, 0.0f, 0.0f, 0.0f, Paddings.PADDING_600.m1867getDpD9Ej5fM(), 7), u11, 0, 0);
            }
            u11.k();
            e v11 = a0.v(aVar, null, 3);
            V f11 = C5185h.f(InterfaceC6250b.a.m(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f12 = c.f(u11, v11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C8366G.a(f.a(ThemeExtKt.isDarkThemeActive((Context) u11.m(AndroidCompositionLocals_androidKt.d())) ? achievementDetailsVO.getImages().getDarkThemeImageLink() : achievementDetailsVO.getImages().getDefaultImageLink(), null, null, null, u11, 0, 14), null, C5182e.a(a0.f(T.j(aVar, 0.0f, Paddings.PADDING_600.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), 270), 1.0f, false), null, InterfaceC2547p.a.d(), 0.0f, null, u11, 24624, 104);
            u11 = u11;
            AchievementDetailsVO.LevelVO level = achievementDetailsVO.getLevel();
            u11.o(-1568529837);
            if (level != null) {
                AchievementLevel(level, j.a(aVar, 1.0f), u11, 48, 0);
            }
            u11.k();
            u11.f();
            TextDTO subtitle = achievementDetailsVO.getSubtitle();
            u11.o(337446185);
            if (subtitle != null) {
                DsTextAtomKt.DsTextAtom(achievementDetailsVO.getSubtitle(), T.j(aVar, 0.0f, 36, 0.0f, 0.0f, 13), u11, 48, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementDetailsWidgetKt$AchievementDetailsContent$2(achievementDetailsVO, i11));
        }
    }

    public static final void AchievementDetailsWidget(@NotNull AchievementDetailsVO state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-1643505258);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(b00.f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
            u11.o(-865099383);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new AchievementDetailsWidgetKt$AchievementDetailsWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            AchievementDetailsContent(state, u11, i12 & 14);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementDetailsWidgetKt$AchievementDetailsWidget$2(state, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AchievementLevel(AchievementDetailsVO.LevelVO levelVO, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1127035462);
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
            u11.o(-342457684);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(levelVO.getBackgroundColor(), u11, 0);
            u11.o(-342454798);
            long bgAquaPrimary = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgAquaPrimary() : c7807z2.w();
            u11.k();
            e b11 = androidx.compose.foundation.e.b(T.f(androidx.compose.foundation.e.b(a0.b(a0.v(eVar, null, 3), 0.0f, 44, 1), layerFloor1, h.b(CornerRadius.RADIUS_450.m1866getDpD9Ej5fM())), 3), bgAquaPrimary, h.b(CornerRadius.RADIUS_400.m1866getDpD9Ej5fM()));
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
            DsTextAtomKt.DsTextAtom(levelVO.getText(), T.h(e.f40358c0, Paddings.PADDING_300.m1867getDpD9Ej5fM(), 0.0f, 2), u11, 0, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new AchievementDetailsWidgetKt$AchievementLevel$2(levelVO, eVar, i11, i12));
        }
    }
}
