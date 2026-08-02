package ru.ozon.app.android.session.editUserFullName.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameConfig;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameViewMapper;

/* loaded from: classes7.dex */
public final class EditUserFullNameModule_ProvideWidgetFactory implements e<Widget> {
    public static Widget provideWidget(EditUserFullNameConfig editUserFullNameConfig, EditUserFullNameViewMapper editUserFullNameViewMapper) {
        Widget provideWidget = EditUserFullNameModule.provideWidget(editUserFullNameConfig, editUserFullNameViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
