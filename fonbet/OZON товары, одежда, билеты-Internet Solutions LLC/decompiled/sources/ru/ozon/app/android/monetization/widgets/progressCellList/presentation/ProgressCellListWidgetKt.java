package ru.ozon.app.android.monetization.widgets.progressCellList.presentation;

import A0.h;
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
import U7.i;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.progressCellList.presentation.ProgressCellListVO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO;", "state", "", "ProgressCellListWidget", "(Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO;LS0/k;I)V", "", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;", "cells", "ProgressCellList", "(Ljava/util/List;LS0/k;I)V", "ProgressCell", "(Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressCellVO;LS0/k;I)V", "Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;", "progressBar", "ProgressBar", "(Lru/ozon/app/android/monetization/widgets/progressCellList/presentation/ProgressCellListVO$ProgressBarVO;LS0/k;I)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProgressCellListWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressBar(ProgressCellListVO.ProgressBarVO progressBarVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(1899723094);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(progressBarVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(progressBarVO.getProgressBackgroundColor(), u11, 0);
            u11.o(-232834621);
            long bgOverlap = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgOverlap() : c7807z.w();
            u11.k();
            AbstractC7799Q abstractC7799Q = TokenParserKt.tokenToGradient(progressBarVO.getProgressGradient(), u11, 0);
            u11.o(-232831023);
            if (abstractC7799Q == null) {
                abstractC7799Q = TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrSocialPrimary(), u11, UniGradientToken.$stable);
            }
            u11.k();
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.f(a0.e(T.j(aVar, 0.0f, Paddings.PADDING_350.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), 1.0f), 4), bgOverlap, y0.a());
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
            C5185h.a(androidx.compose.foundation.e.a(a0.c(a0.e(aVar, progressBarVO.getProgress())), abstractC7799Q, h.b(CornerRadius.RADIUS_200.m1866getDpD9Ej5fM()), 4), u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProgressCellListWidgetKt$ProgressBar$2(progressBarVO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressCell(ProgressCellListVO.ProgressCellVO progressCellVO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        int i13;
        C3969l u11 = interfaceC3967k.u(657217714);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(progressCellVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(progressCellVO.getBackgroundColor(), u11, 0);
            u11.o(1399641284);
            long bgSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary() : c7807z.w();
            u11.k();
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(T.h(aVar, Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, 2), 1.0f), h.b(CornerRadius.RADIUS_550.m1866getDpD9Ej5fM())), bgSecondary, y0.a());
            Paddings paddings = Paddings.PADDING_300;
            e j11 = T.j(b11, 0.0f, paddings.m1867getDpD9Ej5fM(), 0.0f, progressCellVO.getProgressBar() == null ? paddings.m1867getDpD9Ej5fM() : 0, 5);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, j11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Paddings paddings2 = Paddings.PADDING_350;
            float m1867getDpD9Ej5fM = paddings2.m1867getDpD9Ej5fM();
            Paddings paddings3 = Paddings.PADDING_600;
            e e11 = a0.e(T.j(aVar, m1867getDpD9Ej5fM, 0.0f, paddings3.m1867getDpD9Ej5fM(), 0.0f, 10), 1.0f);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, e11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            IconDTO icon = progressCellVO.getIcon();
            u11.o(-867489361);
            if (icon == null) {
                i13 = 48;
            } else {
                float m1867getDpD9Ej5fM2 = paddings.m1867getDpD9Ej5fM();
                i13 = 48;
                DsIconAtomKt.DsIconAtom(progressCellVO.getIcon(), T.j(aVar, 0.0f, 0.0f, m1867getDpD9Ej5fM2, 0.0f, 11), u11, IconDTO.$stable, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(progressCellVO.getTitle(), a0.e(aVar, 1.0f), u11, i13, 0);
            u11.f();
            List<BadgeDTO> badges = progressCellVO.getBadges();
            u11.o(60705192);
            if (badges != null) {
                e i14 = T.i(aVar, paddings2.m1867getDpD9Ej5fM(), Paddings.PADDING_250.m1867getDpD9Ej5fM(), paddings3.m1867getDpD9Ej5fM(), Paddings.PADDING_100.m1867getDpD9Ej5fM());
                Y b13 = X.b(C5179b.n(DsSpacings.INSTANCE.m1861getDp8D9Ej5fM()), InterfaceC6250b.a.l(), u11, 0);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f12 = c.f(u11, i14);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 h12 = Cm.e.h(u11, b13, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, h12);
                }
                i.b(u11, f12, 1097506622);
                Iterator<T> it = badges.iterator();
                while (it.hasNext()) {
                    DsBadgeAtomKt.DsBadgeAtom((BadgeDTO) it.next(), null, null, u11, 0, 6);
                }
                u11.k();
                u11.f();
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            ProgressCellListVO.ProgressBarVO progressBar = progressCellVO.getProgressBar();
            u11.o(60725287);
            if (progressBar != null) {
                ProgressBar(progressCellVO.getProgressBar(), u11, 0);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProgressCellListWidgetKt$ProgressCell$2(progressCellVO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressCellList(List<ProgressCellListVO.ProgressCellVO> list, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1736893178);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            int i13 = C5179b.f39454h;
            C5179b.i n11 = C5179b.n(DsSpacings.INSTANCE.m1861getDp8D9Ej5fM());
            e.a aVar = e.f40358c0;
            C5194q a11 = C5193p.a(n11, InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, aVar);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            i.b(u11, f7, -76636424);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ProgressCell((ProgressCellListVO.ProgressCellVO) it.next(), u11, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProgressCellListWidgetKt$ProgressCellList$2(list, i11));
        }
    }

    public static final void ProgressCellListWidget(@NotNull ProgressCellListVO state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(-1917304682);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_START;
            u11.o(-1252162499);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ProgressCellListWidgetKt$ProgressCellListWidget$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            ProgressCellList(state.getProgressCellList(), u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ProgressCellListWidgetKt$ProgressCellListWidget$2(state, i11));
        }
    }
}
