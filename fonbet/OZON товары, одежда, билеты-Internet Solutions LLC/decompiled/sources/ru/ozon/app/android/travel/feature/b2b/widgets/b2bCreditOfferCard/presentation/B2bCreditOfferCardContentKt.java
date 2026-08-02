package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import U7.i;
import WZ.t;
import android.content.Context;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b1.C5503f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.presentation.B2bCreditOfferCardVI;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import u0.E;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aG\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00052\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005H\u0003¢\u0006\u0004\b\u001d\u0010\u0010¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onProcessViewEvent", "B2bCreditOfferCardContent", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "BadgeList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "DescriptionSection", "(Lru/ozon/uni/atoms/data/text/TextDTO;LS0/k;I)V", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;", "progressBarVI", "Landroid/content/Context;", "context", "ProgressBarSection", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/presentation/B2bCreditOfferCardVI$ProgressBarVI;Landroid/content/Context;LS0/k;I)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "ActionButtonsSection", "", "isActionFired", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bCreditOfferCardContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ActionButtonsSection(List<ButtonV3DTO> list, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        Function1<? super AtomAction, Unit> function12;
        C3969l u11 = interfaceC3967k.u(1567394132);
        int i12 = (i11 & 6) == 0 ? (u11.F(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            if (list.isEmpty()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new B2bCreditOfferCardContentKt$ActionButtonsSection$1(list, function1, i11));
                    return;
                }
                return;
            }
            e.a aVar = e.f40358c0;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            E.a(u11, a0.f(aVar, dsSpacings.m1845getDp16D9Ej5fM()));
            e e11 = a0.e(aVar, 1.0f);
            int i13 = C5179b.f39454h;
            int i14 = 0;
            C5194q a11 = C5193p.a(C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), InterfaceC6250b.a.k(), u11, 0);
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
            i.b(u11, f7, 1084544541);
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj;
                u11.G(-1119646975, u11.C0(Integer.valueOf(i14), buttonV3DTO));
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO, a0.e(e.f40358c0, 1.0f), false, function1, u11, ((i12 << 6) & 7168) | 48, 4);
                u11.J();
                i14 = i15;
            }
            function12 = function1;
            u11.k();
            u11.f();
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new B2bCreditOfferCardContentKt$ActionButtonsSection$3(list, function12, i11));
        }
    }

    public static final void B2bCreditOfferCardContent(@NotNull B2bCreditOfferCardVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> onProcessViewEvent, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onProcessViewEvent, "onProcessViewEvent");
        C3969l u11 = interfaceC3967k.u(645260053);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onProcessViewEvent) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            t viewEvent = state.getViewEvent();
            u11.o(-878582463);
            if (viewEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1710989252);
                boolean F11 = ((i13 & 896) == 256) | u11.F(viewEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$1$1$1(onProcessViewEvent, viewEvent);
                    u11.x(C11);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            Object[] objArr = {Long.valueOf(state.getId())};
            u11.o(-878577176);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$isActionFired$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C12, u11, 3072, 6);
            Long valueOf = Long.valueOf(state.getId());
            u11.o(-878573628);
            int i14 = i13 & 112;
            boolean n11 = u11.n(interfaceC3978p0) | ((i13 & 14) == 4) | (i14 == 32);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$2$1(state, actionHandler, interfaceC3978p0, null);
                u11.x(C13);
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C13);
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
            BadgeList(state.getBottomBadgeList(), actionHandler, u11, i14);
            DescriptionSection(state.getDescription(), u11, 0);
            ProgressBarSection(state.getProgressBar(), context, u11, 0);
            ActionButtonsSection(state.getButtonList(), actionHandler, u11, i14);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new B2bCreditOfferCardContentKt$B2bCreditOfferCardContent$4(state, actionHandler, onProcessViewEvent, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B2bCreditOfferCardContent$lambda$3(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2bCreditOfferCardContent$lambda$4(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeList(List<BadgeDTO> list, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-242551447);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (list.isEmpty()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new B2bCreditOfferCardContentKt$BadgeList$1(list, function1, i11));
                    return;
                }
                return;
            }
            e e11 = a0.e(e.f40358c0, 1.0f);
            int i13 = C5179b.f39454h;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            B.a(e11, C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), C5179b.n(dsSpacings.m1861getDp8D9Ej5fM()), 0, 0, null, a1.c.c(-2117784156, new B2bCreditOfferCardContentKt$BadgeList$2(list, function1), u11), u11, 1572870, 56);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new B2bCreditOfferCardContentKt$BadgeList$3(list, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DescriptionSection(TextDTO textDTO, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(599258154);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (textDTO == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new B2bCreditOfferCardContentKt$DescriptionSection$1(textDTO, i11));
                    return;
                }
                return;
            }
            DsTextAtomKt.DsTextAtom(textDTO, null, u11, i12 & 14, 2);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new B2bCreditOfferCardContentKt$DescriptionSection$2(textDTO, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressBarSection(B2bCreditOfferCardVI.ProgressBarVI progressBarVI, Context context, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(944186570);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(progressBarVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(context) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (progressBarVI == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new B2bCreditOfferCardContentKt$ProgressBarSection$1(progressBarVI, context, i11));
                    return;
                }
                return;
            }
            float d11 = h.d(progressBarVI.getPercent() / 100.0f, 0.0f, 1.0f);
            String backgroundColor = progressBarVI.getBackgroundColor();
            u11.o(-732807926);
            boolean n11 = u11.n(backgroundColor);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = C7807Z.m(C7811b0.b(StyleParser.INSTANCE.parseColor(context, progressBarVI.getBackgroundColor(), UniColors.BG_ACTION_SECONDARY.getResId())));
                u11.x(C11);
            }
            long w11 = ((C7807Z) C11).w();
            u11.k();
            String color = progressBarVI.getColor();
            u11.o(-732801930);
            boolean n12 = u11.n(color);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = C7807Z.m(C7811b0.b(StyleParser.INSTANCE.parseColor(context, progressBarVI.getColor(), UniColors.BG_POSITIVE_PRIMARY.getResId())));
                u11.x(C12);
            }
            long w12 = ((C7807Z) C12).w();
            u11.k();
            e f7 = a0.f(a0.e(e.f40358c0, 1.0f), progressBarVI.getHeight() != null ? r1.intValue() : DsSpacings.INSTANCE.m1861getDp8D9Ej5fM());
            u11.o(-732792038);
            boolean s11 = u11.s(w11) | u11.s(w12) | u11.q(d11);
            Object C13 = u11.C();
            if (s11 || C13 == InterfaceC3967k.a.a()) {
                B2bCreditOfferCardContentKt$ProgressBarSection$2$1 b2bCreditOfferCardContentKt$ProgressBarSection$2$1 = new B2bCreditOfferCardContentKt$ProgressBarSection$2$1(w11, w12, d11);
                u11.x(b2bCreditOfferCardContentKt$ProgressBarSection$2$1);
                C13 = b2bCreditOfferCardContentKt$ProgressBarSection$2$1;
            }
            u11.k();
            C5185h.a(androidx.compose.ui.draw.c.b(f7, (Function1) C13), u11, 0);
        }
        J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new B2bCreditOfferCardContentKt$ProgressBarSection$3(progressBarVI, context, i11));
        }
    }
}
