package ru.ozon.app.android.tabbar.miniapp.fresh;

import He.b;
import Ib.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepositoryImpl;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigRepository;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;", "freshTabBarApi", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "mapper", "LIb/a;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshDefaultTabs;", "defaultTabs", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;LIb/a;)V", "", "", "freshCategory", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "getNewTabsData", "(Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getDefaultTabs", "()Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "LIb/a;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FreshTabConfigRepositoryImpl implements FreshTabConfigRepository {

    @NotNull
    private final a<FreshDefaultTabs> defaultTabs;

    @NotNull
    private final FreshTabBarApi freshTabBarApi;

    @NotNull
    private final FreshTabConfigMapper mapper;

    public FreshTabConfigRepositoryImpl(@NotNull FreshTabBarApi freshTabBarApi, @NotNull FreshTabConfigMapper mapper, @NotNull a<FreshDefaultTabs> defaultTabs) {
        Intrinsics.checkNotNullParameter(freshTabBarApi, "freshTabBarApi");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(defaultTabs, "defaultTabs");
        this.freshTabBarApi = freshTabBarApi;
        this.mapper = mapper;
        this.defaultTabs = defaultTabs;
    }

    @Override // ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository
    @NotNull
    public FreshTabData getDefaultTabs() {
        return this.defaultTabs.get().getData();
    }

    @Override // ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabConfigRepository
    public Object getNewTabsData(@NotNull Map<String, String> map, @NotNull d<? super FreshTabData> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new FreshTabConfigRepositoryImpl$getNewTabsData$2(this, map, null), dVar);
    }
}
