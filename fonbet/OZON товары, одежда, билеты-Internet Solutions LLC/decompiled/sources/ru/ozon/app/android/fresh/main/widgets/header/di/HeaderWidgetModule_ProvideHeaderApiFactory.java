package ru.ozon.app.android.fresh.main.widgets.header.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderViewMapper;

/* loaded from: classes6.dex */
public final class HeaderWidgetModule_ProvideHeaderApiFactory implements e<HeaderApi> {
    public static HeaderApi provideHeaderApi(HeaderWidgetModule headerWidgetModule, HeaderViewMapper headerViewMapper) {
        HeaderApi provideHeaderApi = headerWidgetModule.provideHeaderApi(headerViewMapper);
        j.d(provideHeaderApi);
        return provideHeaderApi;
    }
}
