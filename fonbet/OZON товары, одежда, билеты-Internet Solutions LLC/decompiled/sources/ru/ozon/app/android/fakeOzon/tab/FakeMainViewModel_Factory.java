package ru.ozon.app.android.fakeOzon.tab;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;

/* loaded from: classes12.dex */
public final class FakeMainViewModel_Factory implements e<FakeMainViewModel> {
    private final a<TabConfigManager> managerProvider;
    private final a<FakeMainTabConfigMapper> mapperProvider;
    private final a<TabConfigRepository> repositoryProvider;

    public FakeMainViewModel_Factory(a<FakeMainTabConfigMapper> aVar, a<TabConfigRepository> aVar2, a<TabConfigManager> aVar3) {
        this.mapperProvider = aVar;
        this.repositoryProvider = aVar2;
        this.managerProvider = aVar3;
    }

    public static FakeMainViewModel_Factory create(a<FakeMainTabConfigMapper> aVar, a<TabConfigRepository> aVar2, a<TabConfigManager> aVar3) {
        return new FakeMainViewModel_Factory(aVar, aVar2, aVar3);
    }

    public static FakeMainViewModel newInstance(FakeMainTabConfigMapper fakeMainTabConfigMapper, TabConfigRepository tabConfigRepository, TabConfigManager tabConfigManager) {
        return new FakeMainViewModel(fakeMainTabConfigMapper, tabConfigRepository, tabConfigManager);
    }

    @Override // Pc.a
    public FakeMainViewModel get() {
        return newInstance(this.mapperProvider.get(), this.repositoryProvider.get(), this.managerProvider.get());
    }
}
