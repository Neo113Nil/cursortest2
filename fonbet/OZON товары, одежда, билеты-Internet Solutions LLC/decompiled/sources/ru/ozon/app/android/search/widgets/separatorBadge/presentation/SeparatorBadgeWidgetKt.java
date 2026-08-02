package ru.ozon.app.android.search.widgets.separatorBadge.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.separatorBadge.data.SeparatorBadgeDTO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "item", "", "SeparatorBadgeWidget", "(Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "LZ1/h;", "height", "Divider-RFCenO8", "(Landroidx/compose/ui/e;JFLS0/k;I)V", "Divider", "search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SeparatorBadgeWidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Divider-RFCenO8, reason: not valid java name */
    public static final void m989DividerRFCenO8(e eVar, long j11, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(-329369671);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f7) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            b11 = androidx.compose.foundation.e.b(a0.f(eVar, f7), j11, y0.a());
            C5185h.a(b11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SeparatorBadgeWidgetKt$Divider$1(eVar, j11, f7, i11));
        }
    }

    public static final void SeparatorBadgeWidget(@NotNull SeparatorBadgeVI item, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(1862334173);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getBackgroundColor(), u11, 0);
            u11.o(1305182440);
            long layerFloor0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor0() : c7807z.w();
            u11.k();
            SeparatorBadgeDTO.SeparatorSettingsDTO separator = item.getSeparator();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(separator != null ? separator.getColor() : null, u11, 0);
            u11.o(1305185388);
            long graphicNeutral = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral() : c7807z2.w();
            u11.k();
            float height = item.getSeparator() != null ? r6.getHeight() : 1;
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = item.getTokenizedEvent();
            u11.o(1305192490);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1174566747);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new SeparatorBadgeWidgetKt$SeparatorBadgeWidget$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            e.a aVar2 = e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.e(aVar2, 1.0f), layerFloor0, y0.a());
            e i13 = T.i(b11, item.getHorizontalPadding().m1867getDpD9Ej5fM(), item.getTopPadding().m1867getDpD9Ej5fM(), item.getHorizontalPadding().m1867getDpD9Ej5fM(), item.getBottomPadding().m1867getDpD9Ej5fM());
            Y b12 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, i13);
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
            C9891D c9891d = C9891D.f99599a;
            long j11 = graphicNeutral;
            float f11 = height;
            m989DividerRFCenO8(c9891d.a(aVar2, 1.0f, true), j11, f11, u11, 0);
            DsBadgeAtomKt.DsBadgeAtom(item.getBadge(), null, null, u11, 0, 6);
            u11 = u11;
            m989DividerRFCenO8(c9891d.a(aVar2, 1.0f, true), j11, f11, u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SeparatorBadgeWidgetKt$SeparatorBadgeWidget$3(item, i11));
        }
    }
}
