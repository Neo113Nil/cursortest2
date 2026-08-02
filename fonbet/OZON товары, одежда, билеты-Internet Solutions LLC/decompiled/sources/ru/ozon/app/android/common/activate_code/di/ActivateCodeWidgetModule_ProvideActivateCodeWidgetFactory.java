package ru.ozon.app.android.common.activate_code.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.activate_code.ActivateCodeViewMapper;
import ru.ozon.app.android.common.activate_code.core.ActivateCodeConfig;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class ActivateCodeWidgetModule_ProvideActivateCodeWidgetFactory implements e<Widget> {
    public static Widget provideActivateCodeWidget(ActivateCodeWidgetModule activateCodeWidgetModule, ActivateCodeConfig activateCodeConfig, ActivateCodeViewMapper activateCodeViewMapper) {
        Widget provideActivateCodeWidget = activateCodeWidgetModule.provideActivateCodeWidget(activateCodeConfig, activateCodeViewMapper);
        j.d(provideActivateCodeWidget);
        return provideActivateCodeWidget;
    }
}
