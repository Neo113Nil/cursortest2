package ru.ozon.app.android.fakeOzon.tab;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;

/* loaded from: classes12.dex */
public final class FakeMainTabConfigMapper_Factory implements e<FakeMainTabConfigMapper> {
    private final a<TabConfigProvider> tabConfigProvider;

    public FakeMainTabConfigMapper_Factory(a<TabConfigProvider> aVar) {
        this.tabConfigProvider = aVar;
    }

    public static FakeMainTabConfigMapper_Factory create(a<TabConfigProvider> aVar) {
        return new FakeMainTabConfigMapper_Factory(aVar);
    }

    public static FakeMainTabConfigMapper newInstance(TabConfigProvider tabConfigProvider) {
        return new FakeMainTabConfigMapper(tabConfigProvider);
    }

    @Override // Pc.a
    public FakeMainTabConfigMapper get() {
        return newInstance(this.tabConfigProvider.get());
    }
}
