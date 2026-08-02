package ru.ozon.app.android.regulardraw.widgets.daily.presentation.compose;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.u3;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import V1.h;
import WZ.t;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import e1.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.button.compose.MorkovskShadowButtonKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.app.android.regulardraw.utils.AnalyticsKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.daily.data.DailyVO;
import ru.ozon.uni.atoms.af.AtomAction;
import u0.E;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "DailyRewardsWidgetComposable", "(Lru/ozon/app/android/regulardraw/widgets/daily/data/DailyVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "", "images", "Landroidx/compose/ui/e;", "modifier", "RewardsList", "(Ljava/util/List;Landroidx/compose/ui/e;LS0/k;II)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DailyRewardsWidgetComposableKt {
    public static final void DailyRewardsWidgetComposable(@NotNull DailyVO state, @NotNull Function1<? super AtomAction, Unit> onAtomAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j11;
        boolean z11;
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(-481314128);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAtomAction) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int i15 = ((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp;
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(1184866410);
            if (tokenizedEvent != null) {
                AnalyticsKt.AnalyticsViewEventsEffect(tokenizedEvent, u11, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            C5194q a11 = C5193p.a(C5179b.n(-19), InterfaceC6250b.a.g(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
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
            String bannerImage = state.getBannerImage();
            e j12 = T.j(j.a(aVar, 1.0f), 0.0f, i15 >= 375 ? 24 : 8, 0.0f, 0.0f, 13);
            j11 = C7807Z.f72253g;
            Ag0.e.a(bannerImage, a0.o(PreviewKt.m942previewBackgroundRPmYEkk(j12, j11, u11, 48), 305, 156), null, null, null, 0.0f, null, u11, 3072, 244);
            e t2 = a0.t(DailyRewardsBackgroundKt.dailyRewardsBackground(aVar), 0.0f, i15 >= 375 ? 351 : 339, 1);
            float f11 = i15 >= 375 ? 16 : 10;
            float f12 = 16;
            e i16 = T.i(t2, f11, f12, f11, f11);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, i16);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g11 = b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, g11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            u3.b(state.getTitle(), null, G1.b.a(u11, R$color.daily_rewards_title_color), 0L, null, 0L, h.a(3), 0L, 0, false, 0, 0, null, RegularDrawTypographyKt.getText_16_18_W500(), u11, 0, 0, 65018);
            u11 = u11;
            RewardsList(state.getDailyList(), T.j(aVar, 0.0f, f12, 0.0f, 0.0f, 13), u11, 48, 0);
            E.a(u11, a0.f(aVar, f12));
            u11.o(819462970);
            if (state.getTimer() != null) {
                z11 = false;
                i13 = 32;
                DailyRewardsTimerKt.DailyRewardsTimer(state.getTimer(), onAtomAction, T.j(aVar, 0.0f, 0.0f, 0.0f, 4, 7), u11, (i14 & 112) | 384, 0);
            } else {
                z11 = false;
                i13 = 32;
            }
            u11.k();
            MorkovskShadowButtonDTO button = state.getButton();
            u11.o(819473994);
            boolean z12 = (i14 & 112) == i13 ? true : z11;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new DailyRewardsWidgetComposableKt$DailyRewardsWidgetComposable$2$2$1$1(onAtomAction);
                u11.x(C11);
            }
            u11.k();
            MorkovskShadowButtonKt.m913MorkovskShadowButton942rkJo(button, null, 0.0f, (Function1) C11, u11, 0, 6);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DailyRewardsWidgetComposableKt$DailyRewardsWidgetComposable$3(state, onAtomAction, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RewardsList(List<String> list, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-471267296);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(list) ? 4 : 2) | i11;
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
            e eVar2 = eVar;
            B.a(eVar2, C5179b.n(4), C5179b.n(10), 4, 0, null, a1.c.c(1823517531, new DailyRewardsWidgetComposableKt$RewardsList$1(list), u11), u11, ((i13 >> 3) & 14) | 1576368, 48);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DailyRewardsWidgetComposableKt$RewardsList$2(list, eVar, i11, i12));
        }
    }
}
