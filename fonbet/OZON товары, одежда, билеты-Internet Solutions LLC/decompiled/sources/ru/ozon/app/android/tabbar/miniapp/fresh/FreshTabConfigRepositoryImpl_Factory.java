package ru.ozon.app.android.tabbar.miniapp.fresh;

import Jb.d;
import Jb.e;
import Pc.a;

/* loaded from: classes7.dex */
public final class FreshTabConfigRepositoryImpl_Factory implements e<FreshTabConfigRepositoryImpl> {
    private final a<FreshDefaultTabs> defaultTabsProvider;
    private final a<FreshTabBarApi> freshTabBarApiProvider;
    private final a<FreshTabConfigMapper> mapperProvider;

    public FreshTabConfigRepositoryImpl_Factory(a<FreshTabBarApi> aVar, a<FreshTabConfigMapper> aVar2, a<FreshDefaultTabs> aVar3) {
        this.freshTabBarApiProvider = aVar;
        this.mapperProvider = aVar2;
        this.defaultTabsProvider = aVar3;
    }

    public static FreshTabConfigRepositoryImpl_Factory create(a<FreshTabBarApi> aVar, a<FreshTabConfigMapper> aVar2, a<FreshDefaultTabs> aVar3) {
        return new FreshTabConfigRepositoryImpl_Factory(aVar, aVar2, aVar3);
    }

    public static FreshTabConfigRepositoryImpl newInstance(FreshTabBarApi freshTabBarApi, FreshTabConfigMapper freshTabConfigMapper, Ib.a<FreshDefaultTabs> aVar) {
        return new FreshTabConfigRepositoryImpl(freshTabBarApi, freshTabConfigMapper, aVar);
    }

    @Override // Pc.a
    public FreshTabConfigRepositoryImpl get() {
        return newInstance(this.freshTabBarApiProvider.get(), this.mapperProvider.get(), d.a(this.defaultTabsProvider));
    }
}
