package ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.header;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
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
import l1.C7811b0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bUpcomingTrips.presentation.header.B2BUpcomingTripsHeaderVI;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.E;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "B2BUpcomingTripsHeaderContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI$Header;", CommentV3DTO.HEADER_FIELD_NAME, "SectionHeader", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bUpcomingTrips/presentation/header/B2BUpcomingTripsHeaderVI$Header;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class B2BUpcomingTripsHeaderContentKt {
    public static final void B2BUpcomingTripsHeaderContent(@NotNull B2BUpcomingTripsHeaderVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(530824968);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            t tokenizedEvent = item.getTokenizedEvent();
            u11.o(716624568);
            if (tokenizedEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1787203694);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2BUpcomingTripsHeaderContentKt$B2BUpcomingTripsHeaderContent$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            SectionHeader(item.getHeader(), actionHandler, u11, i12 & 112);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2BUpcomingTripsHeaderContentKt$B2BUpcomingTripsHeaderContent$2(item, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SectionHeader(B2BUpcomingTripsHeaderVI.Header header, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function12;
        C3969l u11 = interfaceC3967k.u(-713114815);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(header) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            int themeColor = ThemeExtKt.themeColor((Context) u11.m(AndroidCompositionLocals_androidKt.d()), R$attr.layerFloor1);
            e.a aVar = e.f40358c0;
            CornerRadius cornerRadius = CornerRadius.RADIUS_500;
            b11 = androidx.compose.foundation.e.b(C6988h.a(aVar, h.d(cornerRadius.m1866getDpD9Ej5fM(), cornerRadius.m1866getDpD9Ej5fM(), 0.0f, 0.0f, 12)), C7811b0.b(themeColor), y0.a());
            e e11 = a0.e(T.f(b11, Paddings.PADDING_500.m1867getDpD9Ej5fM()), 1.0f);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
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
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = header.getTitle();
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(title, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), u11, 0, 0);
            E.a(u11, a0.r(aVar, 2));
            BadgeDTO badge = header.getBadge();
            u11.o(-592966532);
            if (badge == null) {
                function12 = function1;
            } else {
                function12 = function1;
                DsBadgeAtomKt.DsBadgeAtom(header.getBadge(), null, function12, u11, (i12 << 3) & 896, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2BUpcomingTripsHeaderContentKt$SectionHeader$2(header, function12, i11));
        }
    }
}
