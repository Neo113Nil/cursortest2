package ru.ozon.app.android.cabinet.activationtitle.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleConfig;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class ActivationTitleModule_Companion_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(ActivationTitleConfig activationTitleConfig, ActivationTitleViewMapper activationTitleViewMapper) {
        Widget provideWidget = ActivationTitleModule.INSTANCE.provideWidget(activationTitleConfig, activationTitleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
