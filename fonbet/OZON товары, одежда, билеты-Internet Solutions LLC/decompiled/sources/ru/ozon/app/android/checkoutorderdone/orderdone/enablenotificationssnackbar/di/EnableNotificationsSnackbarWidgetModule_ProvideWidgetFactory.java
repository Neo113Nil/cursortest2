package ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarConfig;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class EnableNotificationsSnackbarWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(EnableNotificationsSnackbarWidgetModule enableNotificationsSnackbarWidgetModule, EnableNotificationsSnackbarConfig enableNotificationsSnackbarConfig, EnableNotificationsSnackbarWidgetViewMapper enableNotificationsSnackbarWidgetViewMapper) {
        Widget2 provideWidget = enableNotificationsSnackbarWidgetModule.provideWidget(enableNotificationsSnackbarConfig, enableNotificationsSnackbarWidgetViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
