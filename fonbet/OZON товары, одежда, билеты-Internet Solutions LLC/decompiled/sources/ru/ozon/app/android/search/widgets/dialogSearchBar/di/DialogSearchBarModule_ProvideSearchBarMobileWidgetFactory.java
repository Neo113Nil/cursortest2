package ru.ozon.app.android.search.widgets.dialogSearchBar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarViewMapper;

/* loaded from: classes7.dex */
public final class DialogSearchBarModule_ProvideSearchBarMobileWidgetFactory implements e<Widget2> {
    public static Widget2 provideSearchBarMobileWidget(DialogSearchBarConfig dialogSearchBarConfig, DialogSearchBarViewMapper dialogSearchBarViewMapper) {
        Widget2 provideSearchBarMobileWidget = DialogSearchBarModule.INSTANCE.provideSearchBarMobileWidget(dialogSearchBarConfig, dialogSearchBarViewMapper);
        j.d(provideSearchBarMobileWidget);
        return provideSearchBarMobileWidget;
    }
}
