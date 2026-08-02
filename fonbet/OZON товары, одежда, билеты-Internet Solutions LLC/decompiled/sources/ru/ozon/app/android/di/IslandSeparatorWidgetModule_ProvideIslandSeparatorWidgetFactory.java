package ru.ozon.app.android.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.android.composerCommonViewKit.islandSeparator.core.IslandSeparatorConfig;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.overlayIslandSeparator.OverlayIslandSeparatorViewMapper;
import ru.ozon.app.android.stickyIslandSeparator.StickyIslandSeparatorViewMapper;

/* loaded from: classes6.dex */
public final class IslandSeparatorWidgetModule_ProvideIslandSeparatorWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideIslandSeparatorWidget(IslandSeparatorWidgetModule islandSeparatorWidgetModule, IslandSeparatorConfig islandSeparatorConfig, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, OverlayIslandSeparatorViewMapper overlayIslandSeparatorViewMapper, StickyIslandSeparatorViewMapper stickyIslandSeparatorViewMapper) {
        Set<Widget2> provideIslandSeparatorWidget = islandSeparatorWidgetModule.provideIslandSeparatorWidget(islandSeparatorConfig, commonIslandSeparatorViewMapper2, overlayIslandSeparatorViewMapper, stickyIslandSeparatorViewMapper);
        j.d(provideIslandSeparatorWidget);
        return provideIslandSeparatorWidget;
    }
}
