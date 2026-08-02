package ru.ozon.app.android.search.widgets.searchCategoryHeader.data;

import Jb.e;

/* loaded from: classes13.dex */
public final class SearchCategoryHeaderMapper_Factory implements e<SearchCategoryHeaderMapper> {

    private static final class InstanceHolder {
        private static final SearchCategoryHeaderMapper_Factory INSTANCE = new SearchCategoryHeaderMapper_Factory();
    }

    public static SearchCategoryHeaderMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SearchCategoryHeaderMapper newInstance() {
        return new SearchCategoryHeaderMapper();
    }

    @Override // Pc.a
    public SearchCategoryHeaderMapper get() {
        return newInstance();
    }
}
