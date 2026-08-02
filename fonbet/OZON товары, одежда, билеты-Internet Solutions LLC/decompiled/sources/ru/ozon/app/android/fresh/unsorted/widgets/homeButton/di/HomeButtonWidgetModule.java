package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.data.HomeButtonConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/di/HomeButtonWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "homeButtonConfig", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/data/HomeButtonConfig;", "homeButtonViewMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewMapper;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeButtonWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull HomeButtonConfig homeButtonConfig, @NotNull HomeButtonViewMapper homeButtonViewMapper) {
        Intrinsics.checkNotNullParameter(homeButtonConfig, "homeButtonConfig");
        Intrinsics.checkNotNullParameter(homeButtonViewMapper, "homeButtonViewMapper");
        return new Widget2(homeButtonConfig.getVertical(), "homeButton", homeButtonConfig, new ViewMapper2[]{homeButtonViewMapper});
    }
}
