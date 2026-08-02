package ru.ozon.app.android.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.core.IslandSeparatorConfig;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.overlayIslandSeparator.OverlayIslandSeparatorViewMapper;
import ru.ozon.app.android.stickyIslandSeparator.StickyIslandSeparatorViewMapper;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/di/IslandSeparatorWidgetModule;", "", "<init>", "()V", "provideIslandSeparatorWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorConfig;", "viewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "overlayViewMapper", "Lru/ozon/app/android/overlayIslandSeparator/OverlayIslandSeparatorViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/stickyIslandSeparator/StickyIslandSeparatorViewMapper;", "island-separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorWidgetModule {
    @NotNull
    public final Set<Widget2> provideIslandSeparatorWidget(@NotNull IslandSeparatorConfig config, @NotNull CommonIslandSeparatorViewMapper2 viewMapper, @NotNull OverlayIslandSeparatorViewMapper overlayViewMapper, @NotNull StickyIslandSeparatorViewMapper stickyViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(overlayViewMapper, "overlayViewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        return e0.h(new Widget2("common", "islandSeparator", config, new ViewMapper2[]{viewMapper, overlayViewMapper, stickyViewMapper}));
    }
}
