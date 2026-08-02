package ru.ozon.app.android.partpayment.formpage.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.formpage.FormPageConfig;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper;

/* loaded from: classes6.dex */
public final class FormPageModule_Companion_ProvideFormPageWidgetFactory implements e<Widget> {
    public static Widget provideFormPageWidget(FormPageConfig formPageConfig, FormPageViewMapper formPageViewMapper) {
        Widget provideFormPageWidget = FormPageModule.INSTANCE.provideFormPageWidget(formPageConfig, formPageViewMapper);
        j.d(provideFormPageWidget);
        return provideFormPageWidget;
    }
}
