package ru.ozon.app.android.tabbar.miniapp.fresh;

import Jb.e;
import Pc.a;

/* loaded from: classes7.dex */
public final class FreshTabConfigMapper_Factory implements e<FreshTabConfigMapper> {
    private final a<FreshTabIdMapper> freshTabIdMapperProvider;

    public FreshTabConfigMapper_Factory(a<FreshTabIdMapper> aVar) {
        this.freshTabIdMapperProvider = aVar;
    }

    public static FreshTabConfigMapper_Factory create(a<FreshTabIdMapper> aVar) {
        return new FreshTabConfigMapper_Factory(aVar);
    }

    public static FreshTabConfigMapper newInstance(FreshTabIdMapper freshTabIdMapper) {
        return new FreshTabConfigMapper(freshTabIdMapper);
    }

    @Override // Pc.a
    public FreshTabConfigMapper get() {
        return newInstance(this.freshTabIdMapperProvider.get());
    }
}
