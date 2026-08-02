package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation;

import Pk0.h;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S1.p;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ComposeExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation.InstallmentPurchaseV4VI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "badge", "", "GradientBadgeComposable", "(Landroidx/compose/ui/e;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;LS0/k;II)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GradientBadgeComposableKt {
    public static final void GradientBadgeComposable(e eVar, @NotNull InstallmentPurchaseV4VI.GradientBadge badge, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        e eVar3;
        e eVar4;
        int i14;
        C3969l c3969l;
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(badge, "badge");
        C3969l u11 = interfaceC3967k.u(-987469898);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((2 & i12) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(badge) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
            eVar3 = eVar2;
        } else {
            eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = badge.getTokenizedEvent();
            u11.o(-1024339716);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1509684855);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new GradientBadgeComposableKt$GradientBadgeComposable$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            float m1866getDpD9Ej5fM = CornerRadius.RADIUS_350.m1866getDpD9Ej5fM();
            boolean a11 = p.a(u11);
            C7807Z c7807z = TokenParserKt.tokenToColor(badge.getBackgroundColor(), u11, 0);
            u11.o(-1024331650);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            Object b11 = h.b(u11, -1024328643);
            if (b11 == InterfaceC3967k.a.a()) {
                InstallmentPurchaseV4VI.Gradient gradient = badge.getGradient();
                if (gradient != null) {
                    b11 = AbstractC7799Q.a.d(AbstractC7799Q.Companion, a11 ? gradient.getDarkValues() : gradient.getLightValues(), 0L, 0L, 14);
                } else {
                    b11 = new K0(clearLightKey0);
                }
                u11.x(b11);
            }
            u11.k();
            TextDTO text = badge.getText();
            u11.o(-1024315161);
            e a12 = androidx.compose.foundation.e.a(eVar3, (AbstractC7799Q) b11, A0.h.b(m1866getDpD9Ej5fM), 4);
            if (badge.getAnimationTimer() != null) {
                float pxF = ResourceExtKt.toPxF(16);
                float pxF2 = ResourceExtKt.toPxF(8);
                Integer animationTimer = badge.getAnimationTimer();
                i14 = 0;
                textDTO = text;
                eVar4 = ComposeExtKt.m875shimmeryBXNGS4(a12, 1000, m1866getDpD9Ej5fM, pxF, pxF2, animationTimer != null ? animationTimer.intValue() : 0, a11, null, null, 0.2f, u11, 805306416, 192);
                c3969l = u11;
            } else {
                eVar4 = a12;
                i14 = 0;
                c3969l = u11;
                textDTO = text;
            }
            c3969l.k();
            DsTextAtomKt.DsTextAtom(textDTO, T.g(eVar4, Paddings.PADDING_250.m1867getDpD9Ej5fM(), Paddings.PADDING_100.m1867getDpD9Ej5fM()), c3969l, i14, i14);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new GradientBadgeComposableKt$GradientBadgeComposable$3(eVar3, badge, i11, i12));
        }
    }
}
