package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import Jb.e;

/* loaded from: classes13.dex */
public final class ClearSearchTextViewModel_Factory implements e<ClearSearchTextViewModel> {

    private static final class InstanceHolder {
        private static final ClearSearchTextViewModel_Factory INSTANCE = new ClearSearchTextViewModel_Factory();
    }

    public static ClearSearchTextViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ClearSearchTextViewModel newInstance() {
        return new ClearSearchTextViewModel();
    }

    @Override // Pc.a
    public ClearSearchTextViewModel get() {
        return newInstance();
    }
}
