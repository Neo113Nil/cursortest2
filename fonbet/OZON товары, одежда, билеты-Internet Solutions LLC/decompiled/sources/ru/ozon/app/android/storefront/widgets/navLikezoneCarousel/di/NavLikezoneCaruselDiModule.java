package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.NavLikezoneCaruselConfig;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.multi.NavLikezoneCaruselMultiViewMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.single.NavLikezoneCaruselSingleViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/di/NavLikezoneCaruselDiModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "navLikezoneCaruselConfig", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/NavLikezoneCaruselConfig;", "navLikezoneCaruselMultiViewMapper", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/multi/NavLikezoneCaruselMultiViewMapper;", "navLikezoneCaruselSingleViewMapper", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/core/single/NavLikezoneCaruselSingleViewMapper;", "provideWidgets$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavLikezoneCaruselDiModule {
    @NotNull
    public final Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(@NotNull NavLikezoneCaruselConfig navLikezoneCaruselConfig, @NotNull NavLikezoneCaruselMultiViewMapper navLikezoneCaruselMultiViewMapper, @NotNull NavLikezoneCaruselSingleViewMapper navLikezoneCaruselSingleViewMapper) {
        Intrinsics.checkNotNullParameter(navLikezoneCaruselConfig, "navLikezoneCaruselConfig");
        Intrinsics.checkNotNullParameter(navLikezoneCaruselMultiViewMapper, "navLikezoneCaruselMultiViewMapper");
        Intrinsics.checkNotNullParameter(navLikezoneCaruselSingleViewMapper, "navLikezoneCaruselSingleViewMapper");
        return e0.h(new Widget2("shell", "navLikezoneCarousel", navLikezoneCaruselConfig, new ViewMapper2[]{navLikezoneCaruselMultiViewMapper, navLikezoneCaruselSingleViewMapper}));
    }
}
