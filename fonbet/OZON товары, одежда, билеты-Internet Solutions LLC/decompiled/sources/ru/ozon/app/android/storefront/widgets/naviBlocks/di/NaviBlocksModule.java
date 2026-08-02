package ru.ozon.app.android.storefront.widgets.naviBlocks.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksConfig;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew.CoupleNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.lastempty.LastEmptyNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carousel.CarouselNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.carouselNew.CarouselNaviBlockViewMapperNew;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframe.OneFrameNaviBlockViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframeNew.OneFrameNaviBlockViewMapperNew;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/di/NaviBlocksModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "naviBlocksConfig", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksConfig;", "oneFrameNaviBlockViewMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/oneframe/OneFrameNaviBlockViewMapper;", "carouselNaviBlockViewMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carousel/CarouselNaviBlockViewMapper;", "coupleNaviBlockViewMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockViewMapper;", "oneFrameNaviBlockViewMapperNew", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/oneframeNew/OneFrameNaviBlockViewMapperNew;", "carouselNaviBlockViewMapperNew", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/carouselNew/CarouselNaviBlockViewMapperNew;", "coupleNaviBlockViewMapperNew", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/coupleNew/CoupleNaviBlockViewMapperNew;", "lastEmptyNaviBlockViewMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/lastempty/LastEmptyNaviBlockViewMapper;", "provideWidgets$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NaviBlocksModule {
    @NotNull
    public final Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(@NotNull NaviBlocksConfig naviBlocksConfig, @NotNull OneFrameNaviBlockViewMapper oneFrameNaviBlockViewMapper, @NotNull CarouselNaviBlockViewMapper carouselNaviBlockViewMapper, @NotNull CoupleNaviBlockViewMapper coupleNaviBlockViewMapper, @NotNull OneFrameNaviBlockViewMapperNew oneFrameNaviBlockViewMapperNew, @NotNull CarouselNaviBlockViewMapperNew carouselNaviBlockViewMapperNew, @NotNull CoupleNaviBlockViewMapperNew coupleNaviBlockViewMapperNew, @NotNull LastEmptyNaviBlockViewMapper lastEmptyNaviBlockViewMapper) {
        Intrinsics.checkNotNullParameter(naviBlocksConfig, "naviBlocksConfig");
        Intrinsics.checkNotNullParameter(oneFrameNaviBlockViewMapper, "oneFrameNaviBlockViewMapper");
        Intrinsics.checkNotNullParameter(carouselNaviBlockViewMapper, "carouselNaviBlockViewMapper");
        Intrinsics.checkNotNullParameter(coupleNaviBlockViewMapper, "coupleNaviBlockViewMapper");
        Intrinsics.checkNotNullParameter(oneFrameNaviBlockViewMapperNew, "oneFrameNaviBlockViewMapperNew");
        Intrinsics.checkNotNullParameter(carouselNaviBlockViewMapperNew, "carouselNaviBlockViewMapperNew");
        Intrinsics.checkNotNullParameter(coupleNaviBlockViewMapperNew, "coupleNaviBlockViewMapperNew");
        Intrinsics.checkNotNullParameter(lastEmptyNaviBlockViewMapper, "lastEmptyNaviBlockViewMapper");
        return e0.h(new Widget2("cms", "naviBlocks", naviBlocksConfig, new ViewMapper2[]{oneFrameNaviBlockViewMapper, carouselNaviBlockViewMapper, coupleNaviBlockViewMapper, oneFrameNaviBlockViewMapperNew, carouselNaviBlockViewMapperNew, coupleNaviBlockViewMapperNew, lastEmptyNaviBlockViewMapper}));
    }
}
