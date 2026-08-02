package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.SecureDealCurtainConfig;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class SecureDealCurtainModule_ProvideSecureDealCurtainWidgetFactory implements e<Widget2> {
    public static Widget2 provideSecureDealCurtainWidget(SecureDealCurtainConfig secureDealCurtainConfig, SecureDealDataViewMapper secureDealDataViewMapper, SecureDealButtonsViewMapper secureDealButtonsViewMapper) {
        Widget2 provideSecureDealCurtainWidget = SecureDealCurtainModule.INSTANCE.provideSecureDealCurtainWidget(secureDealCurtainConfig, secureDealDataViewMapper, secureDealButtonsViewMapper);
        j.d(provideSecureDealCurtainWidget);
        return provideSecureDealCurtainWidget;
    }
}
