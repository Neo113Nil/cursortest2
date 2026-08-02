package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3Config;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.header.NavigationSliderV3HeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.separator.NavigationSliderV3SeparatorViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/di/NavSliderV3WidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3Config;", "headerViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/header/NavigationSliderV3HeaderViewMapper;", "rowViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3RowViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/separator/NavigationSliderV3SeparatorViewMapper;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavSliderV3WidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull NavigationSliderV3Config config, @NotNull NavigationSliderV3HeaderViewMapper headerViewMapper, @NotNull NavigationSliderV3RowViewMapper rowViewMapper, @NotNull NavigationSliderV3SeparatorViewMapper separatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(rowViewMapper, "rowViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        return new Widget2(config.getVertical(), "navigationSlider", config, new ViewMapper2[]{headerViewMapper, rowViewMapper, separatorViewMapper});
    }
}
