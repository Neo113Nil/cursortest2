package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation;

import B1.C2533b;
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
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0017\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "B2bFinanceCardContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "amount", "additionalAmount", "AmountRow", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LS0/k;I)V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "", "hasButtons", "BadgeList", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "ButtonList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFinanceCardContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void AmountRow(TextDTO textDTO, TextDTO textDTO2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(792413293);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(textDTO2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            e e11 = a0.e(e.f40358c0, 1.0f);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, e11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            DsTextAtomKt.DsTextAtom(textDTO, new WithAlignmentLineElement(C2533b.a()), u11, i12 & 14, 0);
            u11.o(373695015);
            if (textDTO2 != null) {
                DsTextAtomKt.DsTextAtom(textDTO2, new WithAlignmentLineElement(C2533b.a()), u11, 0, 0);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceCardContentKt$AmountRow$2(textDTO, textDTO2, i11));
        }
    }

    public static final void B2bFinanceCardContent(@NotNull B2bFinanceCardVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(311944726);
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
            u11.o(-1886356725);
            l lVar = ((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
            u11.k();
            t viewEvent = state.getViewEvent();
            u11.o(-1886352550);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(638508264);
                boolean F11 = u11.F(lVar) | u11.F(viewEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2bFinanceCardContentKt$B2bFinanceCardContent$1$1$1(lVar, viewEvent);
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
            DsTextAtomKt.DsTextAtom(state.getTitle(), null, u11, 0, 2);
            AmountRow(state.getAmount(), state.getAdditionalAmount(), u11, 0);
            BadgeList(state.getBadgeList(), !state.getButtonList().isEmpty(), actionHandler, u11, (i12 << 3) & 896);
            ButtonList(state.getButtonList(), actionHandler, u11, i12 & 112);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceCardContentKt$B2bFinanceCardContent$3(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeList(List<BadgeDTO> list, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1338428197);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                BadgeDTO badgeDTO = (BadgeDTO) obj;
                float m1861getDp8D9Ej5fM = (i14 != C7714v.P(list) || z11) ? DsSpacings.INSTANCE.m1861getDp8D9Ej5fM() : DsSpacings.INSTANCE.m1838getDp0D9Ej5fM();
                u11.G(-1560912042, u11.C0(Integer.valueOf(i14), badgeDTO));
                DsBadgeAtomKt.DsBadgeAtom(badgeDTO, T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, m1861getDp8D9Ej5fM, 7), function1, u11, i13 & 896, 0);
                u11.J();
                i14 = i15;
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceCardContentKt$BadgeList$2(list, z11, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonList(List<ButtonV3DTO> list, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(207005438);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj;
                float m1838getDp0D9Ej5fM = i14 == C7714v.P(list) ? DsSpacings.INSTANCE.m1838getDp0D9Ej5fM() : DsSpacings.INSTANCE.m1861getDp8D9Ej5fM();
                u11.G(1777577761, u11.C0(Integer.valueOf(i14), buttonV3DTO));
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO, T.j(a0.e(e.f40358c0, 1.0f), 0.0f, 0.0f, 0.0f, m1838getDp0D9Ej5fM, 7), false, function1, u11, (i13 << 6) & 7168, 4);
                u11.J();
                i14 = i15;
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bFinanceCardContentKt$ButtonList$2(list, function1, i11));
        }
    }
}
