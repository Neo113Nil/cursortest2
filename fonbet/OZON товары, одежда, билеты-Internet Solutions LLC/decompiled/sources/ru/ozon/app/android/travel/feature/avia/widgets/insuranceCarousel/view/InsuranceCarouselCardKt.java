package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import A0.b;
import A0.c;
import A0.g;
import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.price.DsPriceAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;", "card", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InsuranceCarouselCard", "(Landroidx/compose/ui/e;Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "InsuranceCarouselCardDescription", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselCardKt {
    public static final void InsuranceCarouselCard(e eVar, @NotNull InsuranceCarouselVI.InsuranceCarouselCardVI card, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e eVar3;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-506366971);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(card) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar3 = eVar2;
        } else {
            eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
            float m1847getDp2D9Ej5fM = card.getIsSelected() ? DsSpacings.INSTANCE.m1847getDp2D9Ej5fM() : DsSpacings.INSTANCE.m1839getDp1D9Ej5fM();
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i15 = UniTheme.$stable;
            long layerFloor1 = uniTheme.getColors(u11, i15).getLayerFloor1();
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            b b11 = c.b(dsSpacings.m1845getDp16D9Ej5fM());
            int i16 = h.f162b;
            e b12 = androidx.compose.foundation.e.b(eVar3, layerFloor1, new g(b11, b11, b11, b11));
            C7807Z parseColorToken = TokenParserKt.parseColorToken(card.getBorderColor(), u11, 0);
            u11.o(1967817041);
            long graphicNeutral = parseColorToken == null ? uniTheme.getColors(u11, i15).getGraphicNeutral() : parseColorToken.w();
            u11.k();
            b b13 = c.b(dsSpacings.m1845getDp16D9Ej5fM());
            e f7 = T.f(C8385f.c(m1847getDp2D9Ej5fM, graphicNeutral, b12, new g(b13, b13, b13, b13)), dsSpacings.m1845getDp16D9Ej5fM());
            C5194q a11 = C5193p.a(C5179b.d(), InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, f7);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            InsuranceCarouselCardDescription(card, actionHandler, u11, (i13 >> 3) & 126);
            DsButtonAtomKt.DsButtonAtom(card.getButton(), a0.e(T.j(e.f40358c0, 0.0f, dsSpacings.m1844getDp14D9Ej5fM(), 0.0f, 0.0f, 13), 1.0f), false, actionHandler, u11, (i13 << 3) & 7168, 4);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselCardKt$InsuranceCarouselCard$2(eVar3, card, actionHandler, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InsuranceCarouselCardDescription(InsuranceCarouselVI.InsuranceCarouselCardVI insuranceCarouselCardVI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1869125190);
        int i12 = (i11 & 6) == 0 ? (u11.F(insuranceCarouselCardVI) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            u11.o(293820477);
            boolean F11 = u11.F(insuranceCarouselCardVI) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new InsuranceCarouselCardKt$InsuranceCarouselCardDescription$1$1(insuranceCarouselCardVI, function1);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(aVar, null, null, false, null, null, (Function0) C11, 28);
            TestInfo testInfo = insuranceCarouselCardVI.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a11 = Q1.a(b11, automatizationId);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, a11);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(insuranceCarouselCardVI.getTitle(), null, u11, 0, 2);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            E.a(u11, a0.f(aVar, dsSpacings.m1854getDp4D9Ej5fM()));
            Y b12 = X.b(C5179b.n(dsSpacings.m1854getDp4D9Ej5fM()), InterfaceC6250b.a.a(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = androidx.compose.ui.c.f(u11, aVar);
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
            F1.b(u11, f11, InterfaceC2801g.a.f());
            PriceDTO subtitlePrice = insuranceCarouselCardVI.getSubtitlePrice();
            u11.o(-211205915);
            if (subtitlePrice != null) {
                DsPriceAtomKt.DsPriceAtom(null, subtitlePrice, u11, PriceDTO.$stable << 3, 1);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            TextDTO subtitleText = insuranceCarouselCardVI.getSubtitleText();
            u11.o(-211203068);
            if (subtitleText != null) {
                DsTextAtomKt.DsTextAtom(subtitleText, null, u11, 0, 2);
                Unit unit2 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            e j11 = T.j(aVar, 0.0f, dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 0.0f, 13);
            C5194q a15 = C5193p.a(C5179b.n(dsSpacings.m1854getDp4D9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
            int I13 = u11.I();
            A0 d13 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, j11);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 g11 = K00.b.g(u11, a15, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                a.d(I13, u11, I13, g11);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            u11.o(-211194803);
            List<CellDTO> benefits = insuranceCarouselCardVI.getBenefits();
            int size = benefits.size();
            for (int i13 = 0; i13 < size; i13++) {
                CellDTO cellDTO = benefits.get(i13);
                u11.G(180896053, cellDTO);
                DsCellAtomKt.DsCellAtom(cellDTO, null, null, u11, CellDTO.$stable, 6);
                u11.J();
            }
            u11.k();
            u11.f();
            BadgeDTO badge = insuranceCarouselCardVI.getBadge();
            u11.o(-698751414);
            if (badge != null) {
                DsBadgeAtomKt.DsBadgeAtom(badge, T.j(e.f40358c0, 0.0f, DsSpacings.INSTANCE.m1861getDp8D9Ej5fM(), 0.0f, 0.0f, 13), function1, u11, (i12 << 3) & 896, 0);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InsuranceCarouselCardKt$InsuranceCarouselCardDescription$3(insuranceCarouselCardVI, function1, i11));
        }
    }
}
