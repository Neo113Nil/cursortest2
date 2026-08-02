package ru.ozon.app.android.storefront.widgets.financeWidget.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.FinanceWidgetConfig;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.carousel.CarouselCardViewMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.couple.CoupleCardViewMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.single.SingleCardViewMapper;

/* loaded from: classes7.dex */
public final class FinanceWidgetModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(FinanceWidgetModule financeWidgetModule, FinanceWidgetConfig financeWidgetConfig, SingleCardViewMapper singleCardViewMapper, CoupleCardViewMapper coupleCardViewMapper, CarouselCardViewMapper carouselCardViewMapper) {
        Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease = financeWidgetModule.provideWidgets$storefront_prodGoogleAllVendorsRelease(financeWidgetConfig, singleCardViewMapper, coupleCardViewMapper, carouselCardViewMapper);
        j.d(provideWidgets$storefront_prodGoogleAllVendorsRelease);
        return provideWidgets$storefront_prodGoogleAllVendorsRelease;
    }
}
