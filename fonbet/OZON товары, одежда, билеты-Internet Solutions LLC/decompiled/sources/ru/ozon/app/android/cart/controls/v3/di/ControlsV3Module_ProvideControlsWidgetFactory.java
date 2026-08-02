package ru.ozon.app.android.cart.controls.v3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cart.controls.v3.data.ControlsV3Config;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ControlsV3Module_ProvideControlsWidgetFactory implements e<Widget2> {
    public static Widget2 provideControlsWidget(ControlsV3Module controlsV3Module, ControlsV3Config controlsV3Config, ControlsV3ViewMapper controlsV3ViewMapper) {
        Widget2 provideControlsWidget = controlsV3Module.provideControlsWidget(controlsV3Config, controlsV3ViewMapper);
        j.d(provideControlsWidget);
        return provideControlsWidget;
    }
}
