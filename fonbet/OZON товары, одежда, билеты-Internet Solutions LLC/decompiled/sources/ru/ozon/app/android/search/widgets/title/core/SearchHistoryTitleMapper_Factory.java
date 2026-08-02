package ru.ozon.app.android.search.widgets.title.core;

import Jb.e;

/* loaded from: classes13.dex */
public final class SearchHistoryTitleMapper_Factory implements e<SearchHistoryTitleMapper> {

    private static final class InstanceHolder {
        private static final SearchHistoryTitleMapper_Factory INSTANCE = new SearchHistoryTitleMapper_Factory();
    }

    public static SearchHistoryTitleMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SearchHistoryTitleMapper newInstance() {
        return new SearchHistoryTitleMapper();
    }

    @Override // Pc.a
    public SearchHistoryTitleMapper get() {
        return newInstance();
    }
}
