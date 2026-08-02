package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes2.dex */
/* synthetic */ class ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1$1$1 extends C7735q implements InterfaceC6511n<Integer, Boolean, BannerVO, AtomAction> {
    ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1$1$1(Object obj) {
        super(3, obj, PromoPlacementViewModel.class, "onPageChanged", "onPageChanged(IZLru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;)Lru/ozon/uni/atoms/af/AtomAction;", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ AtomAction invoke(Integer num, Boolean bool, BannerVO bannerVO) {
        return invoke(num.intValue(), bool.booleanValue(), bannerVO);
    }

    public final AtomAction invoke(int i11, boolean z11, BannerVO p22) {
        Intrinsics.checkNotNullParameter(p22, "p2");
        return ((PromoPlacementViewModel) this.receiver).onPageChanged(i11, z11, p22);
    }
}
