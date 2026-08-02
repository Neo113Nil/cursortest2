package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.data.ExpressNavigationSliderV2Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.header.ExpressNavigationSliderV2HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items.ExpressNavigationSliderV2ItemsViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.separator.ExpressNavigationSliderV2SeparatorViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/di/ExpressNavigationSliderWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "navigationSliderV2Config", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/data/ExpressNavigationSliderV2Config;", "navigationSliderV2HeaderViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/header/ExpressNavigationSliderV2HeaderViewMapper;", "navigationSliderV2SeparatorViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/separator/ExpressNavigationSliderV2SeparatorViewMapper;", "navigationSliderV2ItemsViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsViewMapper;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpressNavigationSliderWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull ExpressNavigationSliderV2Config navigationSliderV2Config, @NotNull ExpressNavigationSliderV2HeaderViewMapper navigationSliderV2HeaderViewMapper, @NotNull ExpressNavigationSliderV2SeparatorViewMapper navigationSliderV2SeparatorViewMapper, @NotNull ExpressNavigationSliderV2ItemsViewMapper navigationSliderV2ItemsViewMapper) {
        Intrinsics.checkNotNullParameter(navigationSliderV2Config, "navigationSliderV2Config");
        Intrinsics.checkNotNullParameter(navigationSliderV2HeaderViewMapper, "navigationSliderV2HeaderViewMapper");
        Intrinsics.checkNotNullParameter(navigationSliderV2SeparatorViewMapper, "navigationSliderV2SeparatorViewMapper");
        Intrinsics.checkNotNullParameter(navigationSliderV2ItemsViewMapper, "navigationSliderV2ItemsViewMapper");
        return new Widget2("express", "navigationSlider", navigationSliderV2Config, new ViewMapper2[]{navigationSliderV2SeparatorViewMapper, navigationSliderV2HeaderViewMapper, navigationSliderV2ItemsViewMapper});
    }
}
