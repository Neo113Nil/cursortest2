package ru.ozon.app.android.common.tabs.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.common.tabs.core.TabsV2Config;
import ru.ozon.app.android.common.tabs.core.TabsV2StickyViewMapper;
import ru.ozon.app.android.common.tabs.core.TabsV2ViewMapper;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/common/tabs/di/TabsV2Module;", "", "<init>", "()V", "provideTabsV2Widget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/common/tabs/core/TabsV2Config;", "viewMapper", "Lru/ozon/app/android/common/tabs/core/TabsV2ViewMapper;", "stickyViewMapper", "Lru/ozon/app/android/common/tabs/core/TabsV2StickyViewMapper;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabsV2Module {

    @NotNull
    public static final TabsV2Module INSTANCE = new TabsV2Module();

    private TabsV2Module() {
    }

    @NotNull
    public static final Widget provideTabsV2Widget(@NotNull TabsV2Config config, @NotNull TabsV2ViewMapper viewMapper, @NotNull TabsV2StickyViewMapper stickyViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(stickyViewMapper, "stickyViewMapper");
        return new Widget("common", DynamicElementDTO.TABS, config, new WidgetViewMapper[]{viewMapper, stickyViewMapper});
    }
}
