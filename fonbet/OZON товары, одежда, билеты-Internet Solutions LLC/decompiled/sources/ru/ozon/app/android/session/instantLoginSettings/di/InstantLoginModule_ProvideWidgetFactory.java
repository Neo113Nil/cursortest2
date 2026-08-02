package ru.ozon.app.android.session.instantLoginSettings.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.instantLoginSettings.InstantLoginSettingsConfig;
import ru.ozon.app.android.session.instantLoginSettings.ui.InstantLoginSettingsViewMapper;

/* loaded from: classes7.dex */
public final class InstantLoginModule_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(InstantLoginSettingsConfig instantLoginSettingsConfig, InstantLoginSettingsViewMapper instantLoginSettingsViewMapper) {
        Widget provideWidget = InstantLoginModule.INSTANCE.provideWidget(instantLoginSettingsConfig, instantLoginSettingsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
