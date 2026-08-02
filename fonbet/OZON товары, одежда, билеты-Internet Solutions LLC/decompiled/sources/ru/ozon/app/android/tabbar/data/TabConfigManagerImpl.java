package ru.ozon.app.android.tabbar.data;

import Bc.j;
import Bc.q;
import Bc.r;
import Lm0.a;
import Nc.C3667a;
import Ol.b;
import VL.c;
import VL.d;
import VL.e;
import VL.f;
import android.annotation.SuppressLint;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.u;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qc.o;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.data.TabConfigManagerImpl;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.event.TabUpdateCompleteEvent;
import ru.ozon.app.android.tabbar.domain.mapper.TabConfigMapper;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import sc.C9653a;
import tc.InterfaceC9801c;
import xc.i;
import xc.l;
import xc.m;
import zc.C11038g0;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u00020\u00112\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010'\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0015H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020$00H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010?\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010)0)0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R8\u0010C\u001a&\u0012\f\u0012\n >*\u0004\u0018\u00010\u000e0\u000e >*\u0012\u0012\f\u0012\n >*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigManagerImpl;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "updateDelegate", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "repository", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "cache", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "configProvider", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "<init>", "(Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/tabbar/data/TabConfigRepository;Lru/ozon/app/android/tabbar/data/local/TabConfigCache;Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "", "configName", "Lio/reactivex/y;", "Lru/ozon/app/android/tabbar/data/TabConfig;", "loadCachedConfig", "(Ljava/lang/String;)Lio/reactivex/y;", "miniAppName", "Lio/reactivex/p;", "loadTabConfig", "(Ljava/lang/String;)Lio/reactivex/p;", "T", "Lio/reactivex/k;", "ignoreError", "(Lio/reactivex/y;)Lio/reactivex/k;", "", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "configs", "mapCachedConfig", "(Ljava/util/Map;Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfig;", "response", "", "isFirstRemoteLoading", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "mapConfig", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "formConfigNameWithTeenMode", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;", "observeTabConfigChanged", "()Lio/reactivex/p;", "getInMemoryCachedConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfig;", "getDefaultConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "", "getCachedConfigs", "()Ljava/util/List;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Lru/ozon/app/android/tabbar/domain/mapper/TabConfigMapper;", "mapper", "Lru/ozon/app/android/tabbar/domain/mapper/TabConfigMapper;", "Ljava/util/concurrent/ConcurrentHashMap;", "localConfigs", "Ljava/util/concurrent/ConcurrentHashMap;", "LNc/a;", "kotlin.jvm.PlatformType", "updateTabConfigListener", "LNc/a;", "", "", "remoteLoadedConfigNames", "Ljava/util/Set;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes7.dex */
public final class TabConfigManagerImpl implements TabConfigManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final TabConfigCache cache;

    @NotNull
    private final TabConfigProvider configProvider;

    @NotNull
    private final ConcurrentHashMap<String, TabConfig> localConfigs;

    @NotNull
    private final TabConfigMapper mapper;
    private final Set<String> remoteLoadedConfigNames;

    @NotNull
    private final TabConfigRepository repository;

    @NotNull
    private final TeensModeService teensModeService;

    @NotNull
    private final C3667a<TabUpdateCompleteEvent> updateTabConfigListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "miniAppName", "Lio/reactivex/u;", "Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/u;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.tabbar.data.TabConfigManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, u<? extends TabUpdateCompleteEvent>> {

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/tabbar/data/TabConfig;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/tabbar/data/TabConfig;)Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.tabbar.data.TabConfigManagerImpl$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18821 extends AbstractC7737t implements Function1<TabConfig, TabUpdateCompleteEvent> {
            final /* synthetic */ String $miniAppName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18821(String str) {
                super(1);
                this.$miniAppName = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TabUpdateCompleteEvent invoke(TabConfig it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = this.$miniAppName;
                Intrinsics.f(str);
                return new TabUpdateCompleteEvent(str, it);
            }
        }

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TabUpdateCompleteEvent invoke$lambda$0(Function1 function1, Object p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (TabUpdateCompleteEvent) function1.invoke(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends TabUpdateCompleteEvent> invoke(String miniAppName) {
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            p loadTabConfig = TabConfigManagerImpl.this.loadTabConfig(miniAppName);
            final C18821 c18821 = new C18821(miniAppName);
            return loadTabConfig.map(new o() { // from class: ru.ozon.app.android.tabbar.data.a
                @Override // qc.o
                public final Object apply(Object obj) {
                    TabUpdateCompleteEvent invoke$lambda$0;
                    invoke$lambda$0 = TabConfigManagerImpl.AnonymousClass1.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.data.TabConfigManagerImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<TabUpdateCompleteEvent, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TabUpdateCompleteEvent tabUpdateCompleteEvent) {
            invoke2(tabUpdateCompleteEvent);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TabUpdateCompleteEvent tabUpdateCompleteEvent) {
            TabConfigManagerImpl.this.updateTabConfigListener.onNext(tabUpdateCompleteEvent);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.tabbar.data.TabConfigManagerImpl$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass3(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigManagerImpl$Companion;", "", "<init>", "()V", "TEEN_MODE_SUFFIX", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TabConfigManagerImpl(@NotNull TabConfigUpdateDelegate updateDelegate, @NotNull TabConfigRepository repository, @NotNull TabConfigCache cache, @NotNull TabConfigProvider configProvider, @NotNull TeensModeService teensModeService) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(updateDelegate, "updateDelegate");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.repository = repository;
        this.cache = cache;
        this.configProvider = configProvider;
        this.teensModeService = teensModeService;
        this.mapper = new TabConfigMapper(configProvider, teensModeService);
        this.localConfigs = new ConcurrentHashMap<>();
        C3667a<TabUpdateCompleteEvent> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.updateTabConfigListener = d11;
        this.remoteLoadedConfigNames = Collections.synchronizedSet(new HashSet());
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new TabConfigProcessLifecycleObserver(updateDelegate));
        updateDelegate.observeTabUpdateRequest().observeOn(Mc.a.b()).flatMap(new b(new AnonymousClass1(), 1)).subscribe(new e(new AnonymousClass2()), new f(new AnonymousClass3(Lm0.a.f17149a), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (u) function1.invoke(p02);
    }

    private final String formConfigNameWithTeenMode(String str) {
        return (Intrinsics.d(str, "main") && this.teensModeService.isTeensModeOn()) ? "main_teen" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> k<T> ignoreError(y<T> yVar) {
        yVar.getClass();
        k<T> a11 = yVar instanceof InterfaceC9801c ? ((InterfaceC9801c) yVar).a() : new i(yVar);
        d dVar = new d(TabConfigManagerImpl$ignoreError$1.INSTANCE, 0);
        a11.getClass();
        l lVar = new l(new m(a11, C9653a.g(), C9653a.g(), dVar), C9653a.c());
        Intrinsics.checkNotNullExpressionValue(lVar, "onErrorComplete(...)");
        return lVar;
    }

    private final y<TabConfig> loadCachedConfig(String configName) {
        TabConfig tabConfig = this.localConfigs.get(configName);
        if (tabConfig != null) {
            q f7 = y.f(tabConfig);
            Intrinsics.checkNotNullExpressionValue(f7, "just(...)");
            return f7;
        }
        r rVar = new r(this.cache.retrieveCacheTabConfigs().g(Mc.a.a()), new c(new TabConfigManagerImpl$loadCachedConfig$1(this, configName), 0));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabConfig loadCachedConfig$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (TabConfig) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p<TabConfig> loadTabConfig(String miniAppName) {
        String formConfigNameWithTeenMode = formConfigNameWithTeenMode(miniAppName);
        k ignoreError = ignoreError(loadCachedConfig(formConfigNameWithTeenMode));
        y<TabConfigResponse> loadTabConfig = this.repository.loadTabConfig(miniAppName, null);
        VL.a aVar = new VL.a(new TabConfigManagerImpl$loadTabConfig$1(this, formConfigNameWithTeenMode));
        loadTabConfig.getClass();
        r rVar = new r(new j(loadTabConfig, aVar).g(Mc.a.a()), new VL.b(new TabConfigManagerImpl$loadTabConfig$2(this, formConfigNameWithTeenMode)));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        C11038g0 c11038g0 = new C11038g0(k.c(ignoreError, ignoreError(rVar)));
        Intrinsics.checkNotNullExpressionValue(c11038g0, "toObservable(...)");
        return c11038g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabConfig loadTabConfig$lambda$7(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (TabConfig) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TabConfig mapCachedConfig(Map<String, TabConfigResponse> configs, String configName) {
        TabConfigResponse tabConfigResponse = configs.get(configName);
        return tabConfigResponse != null ? mapConfig$default(this, tabConfigResponse, configName, null, 4, null) : this.configProvider.getDefaultTabConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteTabConfig mapConfig(TabConfigResponse response, String configName, Boolean isFirstRemoteLoading) {
        RemoteTabConfig mapTabConfig = this.mapper.mapTabConfig(response, isFirstRemoteLoading);
        this.localConfigs.put(configName, mapTabConfig);
        return mapTabConfig;
    }

    static /* synthetic */ RemoteTabConfig mapConfig$default(TabConfigManagerImpl tabConfigManagerImpl, TabConfigResponse tabConfigResponse, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bool = null;
        }
        return tabConfigManagerImpl.mapConfig(tabConfigResponse, str, bool);
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigManager
    @NotNull
    public List<RemoteTabConfig> getCachedConfigs() {
        Collection<TabConfigResponse> values = this.cache.getCachedTabConfigs().values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(this.mapper.mapTabConfig((TabConfigResponse) it.next(), Boolean.FALSE));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigManager
    @NotNull
    public TabConfig getDefaultConfig() {
        return this.configProvider.getDefaultTabConfig();
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigManager
    public TabConfig getInMemoryCachedConfig(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        String formConfigNameWithTeenMode = formConfigNameWithTeenMode(miniAppName);
        TabConfig tabConfig = this.localConfigs.get(formConfigNameWithTeenMode);
        if (tabConfig != null) {
            return tabConfig;
        }
        Map<String, TabConfigResponse> retrieveInMemoryCacheTabConfigs = this.cache.retrieveInMemoryCacheTabConfigs();
        if (retrieveInMemoryCacheTabConfigs == null) {
            return null;
        }
        return mapCachedConfig(retrieveInMemoryCacheTabConfigs, formConfigNameWithTeenMode);
    }

    @Override // ru.ozon.app.android.tabbar.data.TabConfigManager
    @NotNull
    public p<TabUpdateCompleteEvent> observeTabConfigChanged() {
        return this.updateTabConfigListener;
    }
}
