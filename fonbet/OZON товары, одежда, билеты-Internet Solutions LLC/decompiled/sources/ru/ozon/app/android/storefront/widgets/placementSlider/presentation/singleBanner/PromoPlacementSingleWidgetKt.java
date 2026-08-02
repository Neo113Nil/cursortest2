package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.singleBanner;

import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.l;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerItemKt;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.utils.UniTestTagsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "banner", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "PromoPlacementSingleWidget", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "LZ1/h;", "SINGLE_BANNER_HORIZONTAL_PADDING", "F", "", "isWidgetVisible", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPlacementSingleWidgetKt {
    private static final float SINGLE_BANNER_HORIZONTAL_PADDING = 12;

    public static final void PromoPlacementSingleWidget(@NotNull BannerVO banner, @NotNull PromoPlacementViewModel viewModel, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        BannerVO bannerVO;
        PromoPlacementViewModel promoPlacementViewModel;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-656526492);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(banner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            bannerVO = banner;
            promoPlacementViewModel = viewModel;
            function1 = actionHandler;
        } else {
            u11.o(36752658);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(36757499);
            boolean F11 = u11.F(banner) | u11.F(lVar);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$1$1(banner, lVar);
                u11.x(C12);
            }
            u11.k();
            i.a(aVar, null, (Function0) C12, u11, 6);
            Boolean valueOf = Boolean.valueOf(PromoPlacementSingleWidget$lambda$1(interfaceC3978p0));
            u11.o(36762411);
            boolean F12 = ((i12 & 896) == 256) | u11.F(viewModel) | u11.F(banner);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                bannerVO = banner;
                Object promoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1 = new PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1(viewModel, bannerVO, actionHandler, interfaceC3978p0, null);
                promoPlacementViewModel = viewModel;
                function1 = actionHandler;
                u11.x(promoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1);
                C13 = promoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1;
            } else {
                bannerVO = banner;
                promoPlacementViewModel = viewModel;
                function1 = actionHandler;
            }
            u11.k();
            Q.g(valueOf, bannerVO, (Function2) C13, u11);
            e h11 = T.h(e.f40358c0, SINGLE_BANNER_HORIZONTAL_PADDING, 0.0f, 2);
            u11.o(36773066);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = new PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$3$1(interfaceC3978p0);
                u11.x(C14);
            }
            u11.k();
            BannerItemKt.BannerItem(bannerVO, function1, UniTestTagsKt.uniResourceIdTestTag(ru.ozon.composer.compose.widget.scrollable.f.b(h11, (Function1) C14), "promoPlacementContainer", u11, 54), u11, (i12 & 14) | ((i12 >> 3) & 112), 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$4(bannerVO, promoPlacementViewModel, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PromoPlacementSingleWidget$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PromoPlacementSingleWidget$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
