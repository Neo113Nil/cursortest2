package ru.ozon.app.android.cml.delivery.widgets.secureDeal.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.data.SecureDealConfig;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation.SecureDealViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class SecureDealModule_ProvideSecureDealWidgetFactory implements e<Widget2> {
    public static Widget2 provideSecureDealWidget(SecureDealConfig secureDealConfig, SecureDealViewMapper secureDealViewMapper) {
        Widget2 provideSecureDealWidget = SecureDealModule.INSTANCE.provideSecureDealWidget(secureDealConfig, secureDealViewMapper);
        j.d(provideSecureDealWidget);
        return provideSecureDealWidget;
    }
}
