package ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e3.C6285b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7795M;
import l1.C7807Z;
import l1.C7809a0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.presentation.StickyBadgeInfoV2VO;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;", "state", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "", "StickyBadgeInfoV2Widget", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;LS0/k;I)V", "StickyBadgeInfoV2Content", "(Lru/ozon/app/android/checkoutcomposer/stickyBadgeInfoV2/presentation/StickyBadgeInfoV2VO;LS0/k;I)V", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyBadgeInfoV2WidgetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void StickyBadgeInfoV2Content(StickyBadgeInfoV2VO stickyBadgeInfoV2VO, InterfaceC3967k interfaceC3967k, int i11) {
        C7795M a11;
        h dp;
        h dp2;
        h dp3;
        h dp4;
        C3969l u11 = interfaceC3967k.u(1533048605);
        if ((((i11 & 6) == 0 ? (u11.F(stickyBadgeInfoV2VO) ? 4 : 2) | i11 : i11) & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = e.f40358c0;
            e x11 = a0.x(aVar, InterfaceC6250b.a.k(), 2);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            e j11 = T.j(x11, dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, dsSpacings.m1861getDp8D9Ej5fM(), dsSpacings.m1861getDp8D9Ej5fM(), 2);
            C7807Z c7807z = TokenParserKt.tokenToColor(stickyBadgeInfoV2VO.getBackgroundColor(), u11, 0);
            u11.o(1973920217);
            long bgPositivePrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPositivePrimary() : c7807z.w();
            u11.k();
            e b11 = androidx.compose.foundation.e.b(j11, bgPositivePrimary, A0.h.a(ResourceExtKt.toPxF(stickyBadgeInfoV2VO.getCornerRadius().getPx())));
            CommonCellSettings.LayoutPadding leftPadding = stickyBadgeInfoV2VO.getPaddings().getLeftPadding();
            float m1838getDp0D9Ej5fM = (leftPadding == null || (dp4 = CommonCellSettingsKt.getDp(leftPadding)) == null) ? dsSpacings.m1838getDp0D9Ej5fM() : dp4.d();
            CommonCellSettings.LayoutPadding topPadding = stickyBadgeInfoV2VO.getPaddings().getTopPadding();
            float m1838getDp0D9Ej5fM2 = (topPadding == null || (dp3 = CommonCellSettingsKt.getDp(topPadding)) == null) ? dsSpacings.m1838getDp0D9Ej5fM() : dp3.d();
            CommonCellSettings.LayoutPadding rightPadding = stickyBadgeInfoV2VO.getPaddings().getRightPadding();
            float m1838getDp0D9Ej5fM3 = (rightPadding == null || (dp2 = CommonCellSettingsKt.getDp(rightPadding)) == null) ? dsSpacings.m1838getDp0D9Ej5fM() : dp2.d();
            CommonCellSettings.LayoutPadding bottomPadding = stickyBadgeInfoV2VO.getPaddings().getBottomPadding();
            e i12 = T.i(b11, m1838getDp0D9Ej5fM, m1838getDp0D9Ej5fM2, m1838getDp0D9Ej5fM3, (bottomPadding == null || (dp = CommonCellSettingsKt.getDp(bottomPadding)) == null) ? dsSpacings.m1838getDp0D9Ej5fM() : dp.d());
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, i12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f11 = c.f(u11, aVar);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            TextDTO startText = stickyBadgeInfoV2VO.getStartText();
            u11.o(-1532273363);
            if (startText != null) {
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                DsTextAtomKt.DsTextAtom(stickyBadgeInfoV2VO.getStartText(), T.j(new LayoutWeightElement(1.0f, false), 0.0f, 0.0f, dsSpacings.m1847getDp2D9Ej5fM(), 0.0f, 11), u11, 0, 0);
            }
            u11.k();
            List<StickyBadgeInfoV2VO.BankImage> images = stickyBadgeInfoV2VO.getImages();
            u11.o(-1532264336);
            if (images != null) {
                for (StickyBadgeInfoV2VO.BankImage bankImage : images) {
                    e.a aVar2 = e.f40358c0;
                    DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                    e n11 = a0.n(T.j(aVar2, 0.0f, 0.0f, dsSpacings2.m1847getDp2D9Ej5fM(), 0.0f, 11), dsSpacings2.m1845getDp16D9Ej5fM());
                    PikazonImagePainter a14 = f.a(bankImage.getImageUrl(), null, null, null, u11, 0, 14);
                    String tintColor = bankImage.getTintColor();
                    u11.o(-1532254217);
                    if (tintColor == null) {
                        a11 = null;
                    } else {
                        C7807Z c7807z2 = TokenParserKt.tokenToColor(tintColor, u11, 0);
                        u11.o(975215857);
                        long bgPositivePrimary2 = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPositivePrimary() : c7807z2.w();
                        u11.k();
                        a11 = C7809a0.a.a(5, bgPositivePrimary2);
                    }
                    u11.k();
                    C3969l c3969l = u11;
                    C8366G.a(a14, null, n11, null, null, 0.0f, a11, c3969l, 48, 56);
                    u11 = c3969l;
                }
            }
            u11.k();
            u11.f();
            TextDTO endText = stickyBadgeInfoV2VO.getEndText();
            u11.o(1433771989);
            if (endText != null) {
                DsTextAtomKt.DsTextAtom(stickyBadgeInfoV2VO.getEndText(), null, u11, 0, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new StickyBadgeInfoV2WidgetKt$StickyBadgeInfoV2Content$2(stickyBadgeInfoV2VO, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void StickyBadgeInfoV2Widget(@NotNull StickyBadgeInfoV2VO state, @NotNull TotalVisibilityViewModel totalVisibilityViewModel, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        C3969l u11 = interfaceC3967k.u(-1262609078);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(totalVisibilityViewModel) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else if (!((Boolean) C6285b.a(totalVisibilityViewModel.isVisibleFlow(), Boolean.FALSE, u11, 48).getValue()).booleanValue()) {
            StickyBadgeInfoV2Content(state, u11, i12 & 14);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new StickyBadgeInfoV2WidgetKt$StickyBadgeInfoV2Widget$1(state, totalVisibilityViewModel, i11));
        }
    }
}
