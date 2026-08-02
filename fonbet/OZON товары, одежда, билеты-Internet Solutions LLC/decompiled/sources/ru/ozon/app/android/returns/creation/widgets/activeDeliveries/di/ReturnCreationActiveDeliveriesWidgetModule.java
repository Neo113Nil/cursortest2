package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.core.ReturnCreationActiveDeliveriesConfig;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.element.viewMapper.ElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.header.viewMapper.HeaderViewMapper;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.presentation.sticky.viewMapper.StickyViewMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/di/ReturnCreationActiveDeliveriesWidgetModule;", "", "<init>", "()V", "provideActiveDeliveriesWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/core/ReturnCreationActiveDeliveriesConfig;", "headerViewMapper", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/header/viewMapper/HeaderViewMapper;", "elementViewMapper", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/element/viewMapper/ElementViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/presentation/sticky/viewMapper/StickyViewMapper;", "islandSeparatorViewMapper2", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationActiveDeliveriesWidgetModule {
    @NotNull
    public final Widget2 provideActiveDeliveriesWidget(@NotNull ReturnCreationActiveDeliveriesConfig config, @NotNull HeaderViewMapper headerViewMapper, @NotNull ElementViewMapper elementViewMapper, @NotNull StickyViewMapper stickyViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper2) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(elementViewMapper, "elementViewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper2, "islandSeparatorViewMapper2");
        return new Widget2("rms", "returnCreationActiveDeliveries", config, new ViewMapper2[]{headerViewMapper, elementViewMapper, stickyViewMapper, islandSeparatorViewMapper2});
    }
}
