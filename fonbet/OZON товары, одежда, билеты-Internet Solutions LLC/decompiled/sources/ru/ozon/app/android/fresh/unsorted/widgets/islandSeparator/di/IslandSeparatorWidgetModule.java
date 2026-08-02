package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.data.IslandSeparatorConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.presentation.IslandSeparatorViewMapper;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/di/IslandSeparatorWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "islandSeparatorConfig", "Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/data/IslandSeparatorConfig;", "islandSeparatorViewMapper", "Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/presentation/IslandSeparatorViewMapper;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull IslandSeparatorConfig islandSeparatorConfig, @NotNull IslandSeparatorViewMapper islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(islandSeparatorConfig, "islandSeparatorConfig");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2(islandSeparatorConfig.getVertical(), "islandSeparator", islandSeparatorConfig, new ViewMapper2[]{islandSeparatorViewMapper});
    }
}
