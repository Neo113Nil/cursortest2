package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.data.InstallmentPurchaseV4DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation.InstallmentPurchaseV4VI;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "InstallmentPurchaseWidget", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "InstallmentPurchaseV4Content", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPurchaseWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstallmentPurchaseV4Content(InstallmentPurchaseV4VI installmentPurchaseV4VI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        ImageDTO image;
        Unit unit;
        int i13;
        C3969l u11 = interfaceC3967k.u(889520611);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(installmentPurchaseV4VI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(installmentPurchaseV4VI.getBackgroundColor(), u11, 0);
            u11.o(-922901457);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            e.a aVar = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar, 1.0f), clearLightKey0, y0.a());
            e j11 = T.j(b11, Paddings.PADDING_500.m1867getDpD9Ej5fM(), 0.0f, Paddings.PADDING_400.m1867getDpD9Ej5fM(), 0.0f, 10);
            TestInfo testInfo = installmentPurchaseV4VI.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a11 = Q1.a(j11, automatizationId);
            u11.o(-922887279);
            boolean F11 = ((i12 & 112) == 32) | u11.F(installmentPurchaseV4VI);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new InstallmentPurchaseWidgetKt$InstallmentPurchaseV4Content$1$1(installmentPurchaseV4VI, function1);
                u11.x(C11);
            }
            u11.k();
            e b12 = i.b(a11, null, null, false, null, null, (Function0) C11, 28);
            Y b13 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            e a13 = c9891d.a(aVar, 1.0f, true);
            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, a13);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            InstallmentPurchaseV4DTO.Image image2 = installmentPurchaseV4VI.getImage();
            u11.o(-783369685);
            if (image2 == null) {
                unit = null;
            } else {
                if (!p.a(u11) || (image = image2.getDarkImage()) == null) {
                    image = image2.getImage();
                }
                DsImageAtomKt.DsImageAtom(image, null, u11, 0, 2);
                unit = Unit.f71690a;
            }
            u11.k();
            u11.o(-783369844);
            if (unit == null) {
                BadgeDTO badge = installmentPurchaseV4VI.getBadge();
                u11.o(-783364154);
                if (badge == null) {
                    i13 = 1;
                } else {
                    i13 = 1;
                    DsBadgeAtomKt.DsBadgeAtom(badge, a0.t(aVar, 0.0f, 150, 1), null, u11, 48, 4);
                    Unit unit2 = Unit.f71690a;
                }
                u11.k();
            } else {
                i13 = 1;
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(installmentPurchaseV4VI.getText(), c9891d.a(aVar, 1.0f, false), u11, 0, 0);
            InstallmentPurchaseV4VI.GradientBadge gradientBadge = installmentPurchaseV4VI.getGradientBadge();
            u11.o(-783352306);
            if (gradientBadge != null) {
                GradientBadgeComposableKt.GradientBadgeComposable(null, gradientBadge, u11, 0, i13);
                Unit unit3 = Unit.f71690a;
            }
            u11.k();
            u11.f();
            IconDTO icon = installmentPurchaseV4VI.getIcon();
            u11.o(-257714918);
            if (icon != null) {
                DsIconAtomKt.DsIconAtom(installmentPurchaseV4VI.getIcon(), T.j(aVar, 8, 0.0f, 0.0f, 0.0f, 14), u11, IconDTO.$stable | 48, 0);
                Unit unit4 = Unit.f71690a;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentPurchaseWidgetKt$InstallmentPurchaseV4Content$3(installmentPurchaseV4VI, function1, i11));
        }
    }

    public static final void InstallmentPurchaseWidget(@NotNull InstallmentPurchaseV4VI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1239476260);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(560880314);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1975938251);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new InstallmentPurchaseWidgetKt$InstallmentPurchaseWidget$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            InstallmentPurchaseV4Content(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentPurchaseWidgetKt$InstallmentPurchaseWidget$2(state, actionHandler, i11));
        }
    }
}
