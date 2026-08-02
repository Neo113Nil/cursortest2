package ru.ozon.app.android.storefront.widgets.naviGrid.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.NaviGridConfig;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.accent.NaviGridAccentViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.horizontalPair.NaviGridHorizontalPairViewMapper;
import ru.ozon.app.android.storefront.widgets.naviGrid.core.verticalCouple.NaviGridVerticalCoupleViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/di/NaviGridModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "naviGridConfig", "Lru/ozon/app/android/storefront/widgets/naviGrid/core/NaviGridConfig;", "naviGridHorizontalPairViewMapper", "Lru/ozon/app/android/storefront/widgets/naviGrid/core/horizontalPair/NaviGridHorizontalPairViewMapper;", "naviGridAccentViewMapper", "Lru/ozon/app/android/storefront/widgets/naviGrid/core/accent/NaviGridAccentViewMapper;", "naviGridVerticalCoupleViewMapper", "Lru/ozon/app/android/storefront/widgets/naviGrid/core/verticalCouple/NaviGridVerticalCoupleViewMapper;", "provideWidgets$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NaviGridModule {
    @NotNull
    public final Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(@NotNull NaviGridConfig naviGridConfig, @NotNull NaviGridHorizontalPairViewMapper naviGridHorizontalPairViewMapper, @NotNull NaviGridAccentViewMapper naviGridAccentViewMapper, @NotNull NaviGridVerticalCoupleViewMapper naviGridVerticalCoupleViewMapper) {
        Intrinsics.checkNotNullParameter(naviGridConfig, "naviGridConfig");
        Intrinsics.checkNotNullParameter(naviGridHorizontalPairViewMapper, "naviGridHorizontalPairViewMapper");
        Intrinsics.checkNotNullParameter(naviGridAccentViewMapper, "naviGridAccentViewMapper");
        Intrinsics.checkNotNullParameter(naviGridVerticalCoupleViewMapper, "naviGridVerticalCoupleViewMapper");
        return e0.h(new Widget2("cms", "naviGrid", naviGridConfig, new ViewMapper2[]{naviGridHorizontalPairViewMapper, naviGridAccentViewMapper, naviGridVerticalCoupleViewMapper}));
    }
}
