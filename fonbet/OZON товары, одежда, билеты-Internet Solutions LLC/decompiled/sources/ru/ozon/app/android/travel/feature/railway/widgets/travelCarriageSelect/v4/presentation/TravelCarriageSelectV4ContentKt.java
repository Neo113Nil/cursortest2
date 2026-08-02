package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
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
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7829k0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.presentation.TravelCarriageSelectV4VI;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v4.view.TravelCarriageSelectV4DetailsViewKt;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardComposeVO;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardComposeViewKt;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;", "item", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "TravelCarriageSelectV4Content", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v4/presentation/TravelCarriageSelectV4VI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV4ContentKt {
    public static final void TravelCarriageSelectV4Content(@NotNull TravelCarriageSelectV4VI item, @NotNull Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        boolean z11;
        e.a aVar;
        Function1<? super b, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(974412981);
        int i14 = (i11 & 6) == 0 ? (u11.F(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            Object parent = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getParent();
            Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setBackground(null);
            t tokenizedEvent = item.getTokenizedEvent();
            u11.o(669095397);
            if (tokenizedEvent != null) {
                l lVar = (l) u11.m(f.e());
                AbstractC5434v.a aVar2 = AbstractC5434v.a.ON_RESUME;
                u11.o(1007265599);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new TravelCarriageSelectV4ContentKt$TravelCarriageSelectV4Content$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar2, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e.a aVar3 = e.f40358c0;
            float f7 = 1.0f;
            e e11 = a0.e(aVar3, 1.0f);
            Paddings paddings = Paddings.PADDING_200;
            e j11 = T.j(e11, 0.0f, 0.0f, 0.0f, paddings.m1867getDpD9Ej5fM(), 7);
            CornerRadius cornerRadius = CornerRadius.RADIUS_600;
            e a11 = C6988h.a(j11, h.b(cornerRadius.m1866getDpD9Ej5fM()));
            boolean z12 = item.getAction() != null;
            u11.o(669109087);
            int i15 = i14 & 112;
            boolean F12 = u11.F(item) | (i15 == 32);
            Object C12 = u11.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new TravelCarriageSelectV4ContentKt$TravelCarriageSelectV4Content$2$1(item, actionHandler);
                u11.x(C12);
            }
            u11.k();
            e b11 = androidx.compose.foundation.e.b(androidx.compose.foundation.i.c(a11, z12, null, null, (Function0) C12, 6), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1(), h.b(cornerRadius.m1866getDpD9Ej5fM()));
            Paddings paddings2 = Paddings.PADDING_500;
            e f11 = T.f(b11, paddings2.m1867getDpD9Ej5fM());
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, f11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            e c11 = GZ.e.c(u11, f12, aVar3, 1.0f);
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, c11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e a15 = c9891d.a(aVar3, 1.0f, true);
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f14 = c.f(u11, a15);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, h12);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(item.getName(), c9891d.a(aVar3, 1.0f, false), u11, 0, 0);
            TextDTO type = item.getType();
            u11.o(1682823673);
            if (type != null) {
                DsTextAtomKt.DsTextAtom(type, null, u11, 0, 2);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            BadgeDTO typeBadge = item.getTypeBadge();
            u11.o(1682825724);
            if (typeBadge == null) {
                i12 = 0;
            } else {
                E.a(u11, a0.r(aVar3, Paddings.PADDING_250.m1867getDpD9Ej5fM()));
                i12 = 0;
                DsBadgeAtomKt.DsBadgeAtom(typeBadge, null, null, u11, 0, 6);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            E.a(u11, a0.r(aVar3, Paddings.PADDING_300.m1867getDpD9Ej5fM()));
            DsTextAtomKt.DsTextAtom(item.getNumber(), null, u11, i12, 2);
            u11.f();
            E.a(u11, a0.f(aVar3, Paddings.PADDING_100.m1867getDpD9Ej5fM()));
            e e12 = a0.e(aVar3, 1.0f);
            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, i12);
            int I14 = u11.I();
            A0 d14 = u11.d();
            e f15 = c.f(u11, e12);
            Function0 a17 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a17);
            } else {
                u11.e();
            }
            Function2 h13 = Cm.e.h(u11, b14, u11, d14);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                a.d(I14, u11, I14, h13);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(item.getSeatsCount(), null, u11, i12, 2);
            TextDTO seatsDetails = item.getSeatsDetails();
            u11.o(1807508656);
            if (seatsDetails != null) {
                E.a(u11, a0.r(aVar3, paddings.m1867getDpD9Ej5fM()));
                DsTextAtomKt.DsTextAtom(seatsDetails, null, u11, i12, 2);
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            E.a(u11, a0.f(aVar3, paddings2.m1867getDpD9Ej5fM()));
            u11.o(1007322638);
            int i16 = i12;
            for (Object obj : item.getStoreys()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C7714v.O0();
                    throw null;
                }
                TravelCarriageSelectV4VI.StoreyVI storeyVI = (TravelCarriageSelectV4VI.StoreyVI) obj;
                e.a aVar4 = e.f40358c0;
                e e13 = a0.e(aVar4, f7);
                C5194q a18 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, i12);
                int I15 = u11.I();
                A0 d15 = u11.d();
                e f16 = c.f(u11, e13);
                Function0 a19 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a19);
                } else {
                    u11.e();
                }
                Function2 g11 = K00.b.g(u11, a18, u11, d15);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                    a.d(I15, u11, I15, g11);
                }
                U7.i.b(u11, f16, 1682851229);
                if (i16 != 0) {
                    E.a(u11, a0.f(aVar4, Paddings.PADDING_500.m1867getDpD9Ej5fM()));
                }
                u11.k();
                TextDTO name = storeyVI.getName();
                u11.o(1682854300);
                if (name == null) {
                    z11 = false;
                } else {
                    z11 = false;
                    DsTextAtomKt.DsTextAtom(name, null, u11, 0, 2);
                    E.a(u11, a0.f(aVar4, Paddings.PADDING_200.m1867getDpD9Ej5fM()));
                    Unit unit5 = Unit.f71690a;
                }
                u11.k();
                u11.o(1682859222);
                if (storeyVI.getDarkSchemeImage() == null || storeyVI.getLightSchemeImage() == null) {
                    aVar = aVar4;
                } else {
                    InterfaceC7829k0 darkSchemeImage = ThemeExtKt.isDarkThemeActive(context) ? storeyVI.getDarkSchemeImage() : storeyVI.getLightSchemeImage();
                    e f17 = a0.f(a0.e(aVar4, 1.0f), 50);
                    InterfaceC7829k0 interfaceC7829k0 = darkSchemeImage;
                    aVar = aVar4;
                    C8366G.b(interfaceC7829k0, f17, null, u11, 432, 248);
                }
                u11.k();
                DisclaimerDTO noStoreysInfo = storeyVI.getNoStoreysInfo();
                u11.o(1682874194);
                if (noStoreysInfo != null) {
                    DsDisclaimerAtomKt.DsDisclaimerAtom(noStoreysInfo, a0.e(aVar, 1.0f), null, u11, DisclaimerDTO.$stable | 48, 4);
                    Unit unit6 = Unit.f71690a;
                }
                u11.k();
                u11.f();
                i16 = i17;
                i12 = 0;
                f7 = 1.0f;
            }
            u11.k();
            e.a aVar5 = e.f40358c0;
            Paddings paddings3 = Paddings.PADDING_400;
            E.a(u11, a0.f(aVar5, paddings3.m1867getDpD9Ej5fM()));
            TravelCarriageSelectV4DetailsViewKt.TravelCarriageSelectV4DetailsView(item.getDetails(), function1, u11, i15);
            E.a(u11, a0.f(aVar5, paddings3.m1867getDpD9Ej5fM()));
            e e14 = a0.e(aVar5, 1.0f);
            Y b15 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I16 = u11.I();
            A0 d16 = u11.d();
            e f18 = c.f(u11, e14);
            Function0 a21 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a21);
            } else {
                u11.e();
            }
            Function2 h14 = Cm.e.h(u11, b15, u11, d16);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I16))) {
                a.d(I16, u11, I16, h14);
            }
            F1.b(u11, f18, InterfaceC2801g.a.f());
            e a22 = c9891d.a(aVar5, 1.0f, true);
            Y b16 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I17 = u11.I();
            A0 d17 = u11.d();
            e f19 = c.f(u11, a22);
            Function0 a23 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a23);
            } else {
                u11.e();
            }
            Function2 h15 = Cm.e.h(u11, b16, u11, d17);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I17))) {
                a.d(I17, u11, I17, h15);
            }
            F1.b(u11, f19, InterfaceC2801g.a.f());
            PriceCardComposeVO discountPriceCard = item.getPriceBlock().getDiscountPriceCard();
            u11.o(1682893375);
            if (discountPriceCard == null) {
                i13 = i15;
            } else {
                i13 = i15;
                PriceCardComposeViewKt.PriceCardComposeView(discountPriceCard, function1, null, u11, PriceCardComposeVO.$stable | i15, 4);
                E.a(u11, a0.r(aVar5, Paddings.PADDING_700.m1867getDpD9Ej5fM()));
                Unit unit7 = Unit.f71690a;
            }
            u11.k();
            actionHandler = function1;
            PriceCardComposeViewKt.PriceCardComposeView(item.getPriceBlock().getOriginalPriceCard(), actionHandler, null, u11, PriceCardComposeVO.$stable | i13, 4);
            u11.f();
            BadgeDTO bonusBadge = item.getBonusBadge();
            u11.o(1807571420);
            if (bonusBadge != null) {
                E.a(u11, a0.r(aVar5, Paddings.PADDING_300.m1867getDpD9Ej5fM()));
                DsBadgeAtomKt.DsBadgeAtom(bonusBadge, null, null, u11, 0, 6);
                Unit unit8 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TravelCarriageSelectV4ContentKt$TravelCarriageSelectV4Content$4(item, actionHandler, i11));
        }
    }
}
