package ru.ozon.app.android.session.mySettingsHeader.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.mySettingsHeader.data.MySettingsHeaderConfig;
import ru.ozon.app.android.session.mySettingsHeader.mapper.MySettingsHeaderViewMapper;

/* loaded from: classes7.dex */
public final class MySettingsHeaderWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(MySettingsHeaderConfig mySettingsHeaderConfig, MySettingsHeaderViewMapper mySettingsHeaderViewMapper) {
        Widget2 provideWidget = MySettingsHeaderWidgetModule.INSTANCE.provideWidget(mySettingsHeaderConfig, mySettingsHeaderViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
