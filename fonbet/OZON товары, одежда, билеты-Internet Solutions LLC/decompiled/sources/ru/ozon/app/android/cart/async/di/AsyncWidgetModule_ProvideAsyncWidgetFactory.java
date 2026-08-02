package ru.ozon.app.android.cart.async.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.cart.async.core.AsyncConfig;
import ru.ozon.app.android.cart.async.presentation.AsyncViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes11.dex */
public final class AsyncWidgetModule_ProvideAsyncWidgetFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideAsyncWidget(AsyncWidgetModule asyncWidgetModule, AsyncConfig asyncConfig, AsyncViewMapper asyncViewMapper) {
        Set<Widget2> provideAsyncWidget = asyncWidgetModule.provideAsyncWidget(asyncConfig, asyncViewMapper);
        j.d(provideAsyncWidget);
        return provideAsyncWidget;
    }
}
