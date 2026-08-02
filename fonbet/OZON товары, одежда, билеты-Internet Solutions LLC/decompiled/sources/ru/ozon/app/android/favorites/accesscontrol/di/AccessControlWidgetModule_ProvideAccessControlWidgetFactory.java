package ru.ozon.app.android.favorites.accesscontrol.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlConfig;
import ru.ozon.app.android.favorites.accesscontrol.presentation.item.AccessControlViewMapper;
import ru.ozon.app.android.favorites.accesscontrol.presentation.users.AccessControlUserViewMapper;

/* loaded from: classes6.dex */
public final class AccessControlWidgetModule_ProvideAccessControlWidgetFactory implements e<Widget2> {
    public static Widget2 provideAccessControlWidget(AccessControlConfig accessControlConfig, AccessControlViewMapper accessControlViewMapper, AccessControlUserViewMapper accessControlUserViewMapper) {
        Widget2 provideAccessControlWidget = AccessControlWidgetModule.provideAccessControlWidget(accessControlConfig, accessControlViewMapper, accessControlUserViewMapper);
        j.d(provideAccessControlWidget);
        return provideAccessControlWidget;
    }
}
