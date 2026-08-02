package ru.ozon.app.android.search.widgets.history.catalog.data;

import Jb.e;

/* loaded from: classes13.dex */
public final class SearchHistoryMapper_Factory implements e<SearchHistoryMapper> {

    private static final class InstanceHolder {
        private static final SearchHistoryMapper_Factory INSTANCE = new SearchHistoryMapper_Factory();
    }

    public static SearchHistoryMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SearchHistoryMapper newInstance() {
        return new SearchHistoryMapper();
    }

    @Override // Pc.a
    public SearchHistoryMapper get() {
        return newInstance();
    }
}
