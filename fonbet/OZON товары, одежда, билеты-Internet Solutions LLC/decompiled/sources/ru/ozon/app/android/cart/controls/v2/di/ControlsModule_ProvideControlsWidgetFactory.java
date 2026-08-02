package ru.ozon.app.android.cart.controls.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.controls.v2.data.ControlsConfig;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ControlsModule_ProvideControlsWidgetFactory implements e<Widget2> {
    public static Widget2 provideControlsWidget(ControlsModule controlsModule, ControlsConfig controlsConfig, ControlsViewMapper controlsViewMapper) {
        Widget2 provideControlsWidget = controlsModule.provideControlsWidget(controlsConfig, controlsViewMapper);
        j.d(provideControlsWidget);
        return provideControlsWidget;
    }
}
