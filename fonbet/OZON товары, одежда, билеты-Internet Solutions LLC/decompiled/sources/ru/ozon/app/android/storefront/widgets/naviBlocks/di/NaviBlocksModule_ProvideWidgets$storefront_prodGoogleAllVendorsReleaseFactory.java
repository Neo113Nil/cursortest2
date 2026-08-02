package ru.ozon.app.android.storefront.widgets.naviBlocks.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksConfig;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew.CoupleNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.lastempty.LastEmptyNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframe.OneFrameNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframeNew.OneFrameNaviBlockViewMapperNew;

/* loaded from: classes7.dex */
public final class NaviBlocksModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(NaviBlocksModule naviBlocksModule, NaviBlocksConfig naviBlocksConfig, OneFrameNaviBlockViewMapper oneFrameNaviBlockViewMapper, CarouselNaviBlockViewMapper carouselNaviBlockViewMapper, CoupleNaviBlockViewMapper coupleNaviBlockViewMapper, OneFrameNaviBlockViewMapperNew oneFrameNaviBlockViewMapperNew, CarouselNaviBlockViewMapperNew carouselNaviBlockViewMapperNew, CoupleNaviBlockViewMapperNew coupleNaviBlockViewMapperNew, LastEmptyNaviBlockViewMapper lastEmptyNaviBlockViewMapper) {
        Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease = naviBlocksModule.provideWidgets$storefront_prodGoogleAllVendorsRelease(naviBlocksConfig, oneFrameNaviBlockViewMapper, carouselNaviBlockViewMapper, coupleNaviBlockViewMapper, oneFrameNaviBlockViewMapperNew, carouselNaviBlockViewMapperNew, coupleNaviBlockViewMapperNew, lastEmptyNaviBlockViewMapper);
        j.d(provideWidgets$storefront_prodGoogleAllVendorsRelease);
        return provideWidgets$storefront_prodGoogleAllVendorsRelease;
    }
}
