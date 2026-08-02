package ru.ozon.app.android.tabbar.data.local;

import Bc.q;
import Fr.f;
import Hc.AbstractC3137a;
import Lm0.a;
import Nc.C3669c;
import OJ.b;
import android.annotation.SuppressLint;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import io.reactivex.y;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.local.TabConfigCacheImpl;
import sc.C9653a;
import zc.C11049k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ!\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/tabbar/data/local/TabConfigCacheImpl;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/tabbar/data/local/TabConfigLocalDataSource;", "tabConfigLocalDataSource", "<init>", "(Lru/ozon/app/android/tabbar/data/local/TabConfigLocalDataSource;)V", "", "", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "tabConfigs", "", "storeInMemoryCache", "(Ljava/util/Map;)V", "getCachedTabConfigs", "()Ljava/util/Map;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "config", "saveConfig", "(Ljava/lang/String;Lru/ozon/app/android/tabbar/data/TabConfigResponse;)V", "retrieveInMemoryCacheTabConfigs", "Lio/reactivex/y;", "retrieveCacheTabConfigs", "()Lio/reactivex/y;", "Lru/ozon/app/android/tabbar/data/local/TabConfigLocalDataSource;", "Ljava/util/concurrent/ConcurrentHashMap;", "configCache", "Ljava/util/concurrent/ConcurrentHashMap;", "LNc/c;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;", "kotlin.jvm.PlatformType", "saveConfigListener", "LNc/c;", "Lio/reactivex/p;", "connectableConfigRetreiver", "Lio/reactivex/p;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes7.dex */
public final class TabConfigCacheImpl implements TabConfigCache {

    @NotNull
    private final ConcurrentHashMap<String, TabConfigResponse> configCache;

    @NotNull
    private final p<Map<String, TabConfigResponse>> connectableConfigRetreiver;

    @NotNull
    private final C3669c<TabConfigCacheModel> saveConfigListener;

    @NotNull
    private final TabConfigLocalDataSource tabConfigLocalDataSource;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/tabbar/data/local/TabConfigCacheModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.data.local.TabConfigCacheImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<TabConfigCacheModel, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TabConfigCacheModel tabConfigCacheModel) {
            invoke2(tabConfigCacheModel);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TabConfigCacheModel tabConfigCacheModel) {
            TabConfigLocalDataSource tabConfigLocalDataSource = TabConfigCacheImpl.this.tabConfigLocalDataSource;
            Intrinsics.f(tabConfigCacheModel);
            tabConfigLocalDataSource.save(tabConfigCacheModel);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.data.local.TabConfigCacheImpl$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    public TabConfigCacheImpl(@NotNull TabConfigLocalDataSource tabConfigLocalDataSource) {
        Intrinsics.checkNotNullParameter(tabConfigLocalDataSource, "tabConfigLocalDataSource");
        this.tabConfigLocalDataSource = tabConfigLocalDataSource;
        this.configCache = new ConcurrentHashMap<>();
        C3669c<TabConfigCacheModel> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.saveConfigListener = d11;
        AbstractC3137a replay = p.fromCallable(new Callable() { // from class: WL.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map connectableConfigRetreiver$lambda$1;
                connectableConfigRetreiver$lambda$1 = TabConfigCacheImpl.connectableConfigRetreiver$lambda$1(TabConfigCacheImpl.this);
                return connectableConfigRetreiver$lambda$1;
            }
        }).subscribeOn(Mc.a.b()).replay(1);
        replay.getClass();
        C11049k c11049k = new C11049k(replay, C9653a.g());
        Intrinsics.checkNotNullExpressionValue(c11049k, "autoConnect(...)");
        this.connectableConfigRetreiver = c11049k;
        d11.observeOn(Mc.a.b()).subscribe(new b(new AnonymousClass1()), new f(new AnonymousClass2(a.f17149a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map connectableConfigRetreiver$lambda$1(TabConfigCacheImpl tabConfigCacheImpl) {
        Map<String, TabConfigResponse> retrieveTabConfigs = tabConfigCacheImpl.tabConfigLocalDataSource.retrieveTabConfigs();
        tabConfigCacheImpl.storeInMemoryCache(retrieveTabConfigs);
        return retrieveTabConfigs;
    }

    private final void storeInMemoryCache(Map<String, TabConfigResponse> tabConfigs) {
        this.configCache.clear();
        this.configCache.putAll(tabConfigs);
    }

    @Override // ru.ozon.app.android.tabbar.data.local.TabConfigCache
    @NotNull
    public Map<String, TabConfigResponse> getCachedTabConfigs() {
        Map<String, TabConfigResponse> retrieveInMemoryCacheTabConfigs = retrieveInMemoryCacheTabConfigs();
        if (retrieveInMemoryCacheTabConfigs != null) {
            return retrieveInMemoryCacheTabConfigs;
        }
        Map<String, TabConfigResponse> retrieveTabConfigs = this.tabConfigLocalDataSource.retrieveTabConfigs();
        storeInMemoryCache(retrieveTabConfigs);
        return retrieveTabConfigs;
    }

    @Override // ru.ozon.app.android.tabbar.data.local.TabConfigCache
    public TabConfigResponse getConfig(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.configCache.get(name);
    }

    @Override // ru.ozon.app.android.tabbar.data.local.TabConfigCache
    @NotNull
    public y<Map<String, TabConfigResponse>> retrieveCacheTabConfigs() {
        Map<String, TabConfigResponse> retrieveInMemoryCacheTabConfigs = retrieveInMemoryCacheTabConfigs();
        if (retrieveInMemoryCacheTabConfigs != null) {
            q f7 = y.f(retrieveInMemoryCacheTabConfigs);
            Intrinsics.checkNotNullExpressionValue(f7, "just(...)");
            return f7;
        }
        y<Map<String, TabConfigResponse>> firstOrError = this.connectableConfigRetreiver.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "firstOrError(...)");
        return firstOrError;
    }

    @Override // ru.ozon.app.android.tabbar.data.local.TabConfigCache
    public Map<String, TabConfigResponse> retrieveInMemoryCacheTabConfigs() {
        ConcurrentHashMap<String, TabConfigResponse> concurrentHashMap = this.configCache;
        if (concurrentHashMap.isEmpty()) {
            return null;
        }
        return concurrentHashMap;
    }

    @Override // ru.ozon.app.android.tabbar.data.local.TabConfigCache
    public void saveConfig(@NotNull String name, @NotNull TabConfigResponse config) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        this.saveConfigListener.onNext(new TabConfigCacheModel(name, config));
        this.configCache.put(name, config);
    }
}
