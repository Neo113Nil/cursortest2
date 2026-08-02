package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.presentation;

import A0.g;
import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.presentation.B2bFinanceInfoVI;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000e\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "B2bFinanceInfoContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;", "cards", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "settings", "CardList", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "card", "Landroidx/compose/ui/e;", "modifier", "CardItem", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "LA0/g;", "CardShape", "LA0/g;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFinanceInfoContentKt {

    @NotNull
    private static final g CardShape = h.b(DsSpacings.INSTANCE.m1850getDp24D9Ej5fM());

    public static final void B2bFinanceInfoContent(@NotNull B2bFinanceInfoVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-395228782);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.o(-1981863985);
            l lVar = ((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
            u11.k();
            t viewEvent = state.getViewEvent();
            u11.o(-1981859810);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(869647276);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2bFinanceInfoContentKt$B2bFinanceInfoContent$1$1$1(lVar, viewEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e e11 = a0.e(e.f40358c0, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e g10 = T.g(e11, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, g10);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
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
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            u11.o(869657982);
            if (!state.getCardList().isEmpty()) {
                CardList(state.getCardList(), state.getCardListSettings(), actionHandler, u11, (i12 << 3) & 896);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceInfoContentKt$B2bFinanceInfoContent$3(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardItem(B2bFinanceInfoVI.CardItemVI cardItemVI, B2bFinanceInfoVI.CardListSettingsVI cardListSettingsVI, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean z11;
        Object C11;
        int I11;
        int I12;
        C3969l u11 = interfaceC3967k.u(-830157892);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? u11.n(cardItemVI) : u11.F(cardItemVI) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(cardListSettingsVI) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i14 != 0) {
                    eVar2 = e.f40358c0;
                }
                if (cardListSettingsVI != null || (r7 = cardListSettingsVI.getHorizontalPaddings()) == null) {
                    Paddings paddings = Paddings.PADDING_500;
                }
                float m1867getDpD9Ej5fM = paddings.m1867getDpD9Ej5fM();
                if (cardListSettingsVI != null || (r10 = cardListSettingsVI.getVerticalPaddings()) == null) {
                    Paddings paddings2 = Paddings.PADDING_500;
                }
                float m1867getDpD9Ej5fM2 = paddings2.m1867getDpD9Ej5fM();
                long bgPrimary = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary();
                g gVar = CardShape;
                e a11 = C6988h.a(androidx.compose.foundation.e.b(eVar2, bgPrimary, gVar), gVar);
                boolean z12 = cardItemVI.getAction() == null;
                u11.o(-1112006841);
                z11 = ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.F(cardItemVI))) | ((i13 & 896) == 256);
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2bFinanceInfoContentKt$CardItem$1$1(cardItemVI, function1);
                    u11.x(C11);
                }
                u11.k();
                e g10 = T.g(androidx.compose.foundation.i.c(a11, z12, null, null, (Function0) C11, 6), m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2);
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, g10);
                Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a13);
                }
                Function2 g11 = b.g(u11, a12, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                e.a aVar = e.f40358c0;
                e e11 = a0.e(aVar, 1.0f);
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f11 = c.f(u11, e11);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a14);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h11);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                TextDTO topText = cardItemVI.getTopText();
                if (1.0f > 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                DsTextAtomKt.DsTextAtom(topText, new LayoutWeightElement(1.0f, false), u11, 0, 0);
                IconDTO topTextIcon = cardItemVI.getTopTextIcon();
                u11.o(-854226511);
                if (topTextIcon != null) {
                    DsIconAtomKt.DsIconAtom(topTextIcon, T.j(aVar, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14), u11, IconDTO.$stable, 0);
                }
                u11.k();
                u11.f();
                DsTextAtomKt.DsTextAtom(cardItemVI.getBottomText(), T.j(aVar, 0.0f, DsSpacings.INSTANCE.m1854getDp4D9Ej5fM(), 0.0f, 0.0f, 13), u11, 0, 0);
                u11.f();
            } else {
                u11.j();
            }
            e eVar3 = eVar2;
            J0 m02 = u11.m0();
            if (m02 != null) {
                m02.G(new B2bFinanceInfoContentKt$CardItem$3(cardItemVI, cardListSettingsVI, function1, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        if (cardListSettingsVI != null) {
        }
        Paddings paddings3 = Paddings.PADDING_500;
        float m1867getDpD9Ej5fM3 = paddings3.m1867getDpD9Ej5fM();
        if (cardListSettingsVI != null) {
        }
        Paddings paddings22 = Paddings.PADDING_500;
        float m1867getDpD9Ej5fM22 = paddings22.m1867getDpD9Ej5fM();
        long bgPrimary2 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary();
        g gVar2 = CardShape;
        e a112 = C6988h.a(androidx.compose.foundation.e.b(eVar2, bgPrimary2, gVar2), gVar2);
        if (cardItemVI.getAction() == null) {
        }
        u11.o(-1112006841);
        z11 = ((i13 & 14) != 4 || ((i13 & 8) != 0 && u11.F(cardItemVI))) | ((i13 & 896) == 256);
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new B2bFinanceInfoContentKt$CardItem$1$1(cardItemVI, function1);
        u11.x(C11);
        u11.k();
        e g102 = T.g(androidx.compose.foundation.i.c(a112, z12, null, null, (Function0) C11, 6), m1867getDpD9Ej5fM3, m1867getDpD9Ej5fM22);
        C5194q a122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, g102);
        Function0 a132 = Fr.g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g112 = b.g(u11, a122, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g112);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        e.a aVar2 = e.f40358c0;
        e e112 = a0.e(aVar2, 1.0f);
        Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I12 = u11.I();
        A0 d122 = u11.d();
        e f112 = c.f(u11, e112);
        Function0 a142 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d122);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h112);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        TextDTO topText2 = cardItemVI.getTopText();
        if (1.0f > 0.0d) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardList(List<B2bFinanceInfoVI.CardItemVI> list, B2bFinanceInfoVI.CardListSettingsVI cardListSettingsVI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        Paddings paddings;
        B2bFinanceInfoVI.CardListSettingsVI cardListSettingsVI2 = cardListSettingsVI;
        Function1<? super AtomAction, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(2041248220);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.n(cardListSettingsVI2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (cardListSettingsVI2 == null || (paddings = cardListSettingsVI2.getGap()) == null) {
                paddings = Paddings.PADDING_300;
            }
            float m1867getDpD9Ej5fM = paddings.m1867getDpD9Ej5fM();
            u11.o(-1035916612);
            boolean n11 = u11.n(list);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = C7714v.y(list, 2);
                u11.x(C11);
            }
            List list2 = (List) C11;
            u11.k();
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            int i14 = 0;
            C5194q a11 = C5193p.a(C5179b.n(m1867getDpD9Ej5fM), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
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
            if (list.size() == 1) {
                u11.o(-761681766);
                CardItem((B2bFinanceInfoVI.CardItemVI) C7714v.K(list), cardListSettingsVI2, function12, a0.e(aVar, 1.0f), u11, IconDTO.$stable | AtomAction.$stable | 3072 | (i13 & 112) | (i13 & 896), 0);
                u11.k();
                cardListSettingsVI2 = cardListSettingsVI;
                function12 = function1;
            } else {
                u11.o(-761434603);
                int i15 = 0;
                for (Object obj : list2) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    List list3 = (List) obj;
                    e e12 = a0.e(e.f40358c0, 1.0f);
                    Y b11 = X.b(C5179b.n(m1867getDpD9Ej5fM), InterfaceC6250b.a.l(), u11, i14);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f11 = c.f(u11, e12);
                    Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    C9891D c9891d = C9891D.f99599a;
                    u11.o(1640173304);
                    int i17 = i14;
                    for (Object obj2 : list3) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        B2bFinanceInfoVI.CardItemVI cardItemVI = (B2bFinanceInfoVI.CardItemVI) obj2;
                        u11.G(1766646406, u11.C0(Integer.valueOf(i17), u11.C0(Integer.valueOf(i15), cardItemVI)));
                        CardItem(cardItemVI, cardListSettingsVI, function1, c9891d.a(e.f40358c0, 1.0f, true), u11, (i13 & 896) | IconDTO.$stable | AtomAction.$stable | (i13 & 112), 0);
                        u11.J();
                        c9891d = c9891d;
                        i17 = i18;
                    }
                    C9891D c9891d2 = c9891d;
                    u11.k();
                    int size = 2 - list3.size();
                    u11.o(1640189618);
                    for (int i19 = 0; i19 < size; i19++) {
                        E.a(u11, c9891d2.a(e.f40358c0, 1.0f, true));
                    }
                    u11.k();
                    u11.f();
                    i15 = i16;
                    i14 = 0;
                }
                cardListSettingsVI2 = cardListSettingsVI;
                function12 = function1;
                u11.k();
            }
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceInfoContentKt$CardList$2(list, cardListSettingsVI2, function12, i11));
        }
    }
}
