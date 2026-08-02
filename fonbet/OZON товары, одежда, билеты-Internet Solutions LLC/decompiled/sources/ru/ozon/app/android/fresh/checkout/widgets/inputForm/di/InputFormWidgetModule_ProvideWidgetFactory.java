package ru.ozon.app.android.fresh.checkout.widgets.inputForm.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.data.InputFormConfig;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormViewMapper;

/* loaded from: classes6.dex */
public final class InputFormWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(InputFormConfig inputFormConfig, InputFormViewMapper inputFormViewMapper) {
        Widget2 provideWidget = InputFormWidgetModule.INSTANCE.provideWidget(inputFormConfig, inputFormViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
