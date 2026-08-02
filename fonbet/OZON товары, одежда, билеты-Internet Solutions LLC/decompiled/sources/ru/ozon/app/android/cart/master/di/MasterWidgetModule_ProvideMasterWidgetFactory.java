package ru.ozon.app.android.cart.master.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.emptyoverlay.presentation.EmptyOverlayViewMapper;
import ru.ozon.app.android.cart.master.data.MasterConfig;
import ru.ozon.app.android.cart.master.presentation.MasterViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final class MasterWidgetModule_ProvideMasterWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideMasterWidget(MasterWidgetModule masterWidgetModule, MasterConfig masterConfig, MasterViewMapper masterViewMapper, EmptyOverlayViewMapper emptyOverlayViewMapper, FeatureChecker featureChecker) {
        Set<Widget2> provideMasterWidget = masterWidgetModule.provideMasterWidget(masterConfig, masterViewMapper, emptyOverlayViewMapper, featureChecker);
        j.d(provideMasterWidget);
        return provideMasterWidget;
    }
}
