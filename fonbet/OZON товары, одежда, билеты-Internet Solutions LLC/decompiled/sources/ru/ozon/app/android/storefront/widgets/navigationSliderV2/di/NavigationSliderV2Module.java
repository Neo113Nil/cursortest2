package ru.ozon.app.android.storefront.widgets.navigationSliderV2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.navigationSliderCompose.NavigationSliderComposeViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2Config;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ScrollableViewMapper;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.core.NavigationSliderV2ViewMapper;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/di/NavigationSliderV2Module;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "navigationSliderV2Config", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2Config;", "navigationSliderV2ViewMapper", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ViewMapper;", "navigationSliderV2ScrollableViewMapper", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/core/NavigationSliderV2ScrollableViewMapper;", "provideWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV2Module {

    @NotNull
    public static final NavigationSliderV2Module INSTANCE = new NavigationSliderV2Module();

    private NavigationSliderV2Module() {
    }

    @NotNull
    public final Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease(@NotNull NavigationSliderV2Config navigationSliderV2Config, @NotNull NavigationSliderV2ViewMapper navigationSliderV2ViewMapper, @NotNull NavigationSliderV2ScrollableViewMapper navigationSliderV2ScrollableViewMapper) {
        Intrinsics.checkNotNullParameter(navigationSliderV2Config, "navigationSliderV2Config");
        Intrinsics.checkNotNullParameter(navigationSliderV2ViewMapper, "navigationSliderV2ViewMapper");
        Intrinsics.checkNotNullParameter(navigationSliderV2ScrollableViewMapper, "navigationSliderV2ScrollableViewMapper");
        return new Widget2("cms", "navigationSlider", navigationSliderV2Config, new ViewMapper2[]{navigationSliderV2ViewMapper, navigationSliderV2ScrollableViewMapper, new NavigationSliderComposeViewMapper()});
    }
}
