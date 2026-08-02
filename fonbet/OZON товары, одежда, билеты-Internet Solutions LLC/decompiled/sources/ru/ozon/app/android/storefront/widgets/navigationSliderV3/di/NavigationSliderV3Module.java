package ru.ozon.app.android.storefront.widgets.navigationSliderV3.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3Config;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3ScrollableViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.core.NavigationSliderV3ViewMapper;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV3/di/NavigationSliderV3Module;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3Config;", "sliderViewMapper", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3ViewMapper;", "scrollableSliderViewMapper", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/core/NavigationSliderV3ScrollableViewMapper;", "provideWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV3Module {

    @NotNull
    public static final NavigationSliderV3Module INSTANCE = new NavigationSliderV3Module();

    private NavigationSliderV3Module() {
    }

    @NotNull
    public final Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease(@NotNull NavigationSliderV3Config config, @NotNull NavigationSliderV3ViewMapper sliderViewMapper, @NotNull NavigationSliderV3ScrollableViewMapper scrollableSliderViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sliderViewMapper, "sliderViewMapper");
        Intrinsics.checkNotNullParameter(scrollableSliderViewMapper, "scrollableSliderViewMapper");
        return new Widget2("cms", "navigationSlider", config, new ViewMapper2[]{sliderViewMapper, scrollableSliderViewMapper});
    }
}
