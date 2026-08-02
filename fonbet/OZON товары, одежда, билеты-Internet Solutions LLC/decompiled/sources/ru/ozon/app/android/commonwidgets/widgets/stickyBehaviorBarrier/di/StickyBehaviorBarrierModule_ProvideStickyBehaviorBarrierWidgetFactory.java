package ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.data.StickyBehaviorBarrierConfig;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.presentation.StickyBehaviorBarrierViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class StickyBehaviorBarrierModule_ProvideStickyBehaviorBarrierWidgetFactory implements e<Widget> {
    public static Widget provideStickyBehaviorBarrierWidget(StickyBehaviorBarrierConfig stickyBehaviorBarrierConfig, StickyBehaviorBarrierViewMapper stickyBehaviorBarrierViewMapper) {
        Widget provideStickyBehaviorBarrierWidget = StickyBehaviorBarrierModule.provideStickyBehaviorBarrierWidget(stickyBehaviorBarrierConfig, stickyBehaviorBarrierViewMapper);
        j.d(provideStickyBehaviorBarrierWidget);
        return provideStickyBehaviorBarrierWidget;
    }
}
