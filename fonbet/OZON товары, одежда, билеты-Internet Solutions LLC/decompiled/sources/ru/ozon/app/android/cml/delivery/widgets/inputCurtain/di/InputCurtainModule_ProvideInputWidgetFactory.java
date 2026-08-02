package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.data.InputCurtainConfig;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class InputCurtainModule_ProvideInputWidgetFactory implements e<Widget2> {
    public static Widget2 provideInputWidget(InputCurtainConfig inputCurtainConfig, InputCurtainViewMapper inputCurtainViewMapper) {
        Widget2 provideInputWidget = InputCurtainModule.INSTANCE.provideInputWidget(inputCurtainConfig, inputCurtainViewMapper);
        j.d(provideInputWidget);
        return provideInputWidget;
    }
}
