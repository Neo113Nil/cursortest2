package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import M4.c;
import android.os.Bundle;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigRepository;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabViewModel;", "Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorage;", "storage", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigRepository;", "repository", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigMapper;", "mapper", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "cache", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "configUpdateDelegate", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "<init>", "(Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorage;Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigRepository;Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigMapper;Lru/ozon/app/android/tabbar/data/local/TabConfigCache;Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "", "miniAppName", "referrerMiniAppName", "observeConfigChanges", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigRepository;", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigMapper;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState;", "screenState", "Landroidx/lifecycle/V;", "getScreenState", "()Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "", "orderCount", "Landroidx/lifecycle/P;", "getOrderCount", "()Landroidx/lifecycle/P;", "Lxe/B0;", "loadTabsJob", "Lxe/B0;", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelTabViewModelImpl extends w0 implements TravelTabViewModel {

    @NotNull
    private final TabConfigCache cache;

    @NotNull
    private final TravelTabConfigUpdateDelegate configUpdateDelegate;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;
    private B0 loadTabsJob;

    @NotNull
    private final TravelTabConfigMapper mapper;

    @NotNull
    private final P<Integer> orderCount;

    @NotNull
    private final TravelTabConfigRepository repository;

    @NotNull
    private final V<TravelTabScreenState> screenState;
    public static final int $stable = 8;

    public TravelTabViewModelImpl(@NotNull TravelUnpaidOrderCountStorage storage, @NotNull TravelTabConfigRepository repository, @NotNull TravelTabConfigMapper mapper, @NotNull TabConfigCache cache, @NotNull TravelTabConfigUpdateDelegate configUpdateDelegate, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(configUpdateDelegate, "configUpdateDelegate");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.repository = repository;
        this.mapper = mapper;
        this.cache = cache;
        this.configUpdateDelegate = configUpdateDelegate;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.screenState = new V<>();
        this.orderCount = C5429p.b(storage.getCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(TravelTabViewModelImpl travelTabViewModelImpl) {
        Bundle bundle = new Bundle(1);
        TravelTabScreenState value = travelTabViewModelImpl.getScreenState().getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.travel.core.tab.presentation.EXTRA_STATE", value);
        }
        return bundle;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModel
    @NotNull
    public P<Integer> getOrderCount() {
        return this.orderCount;
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModel
    public void init(@NotNull c savedStateRegistry) {
        TravelTabScreenState travelTabScreenState;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.travel.core.tab.presentation.EXTRA_BUNDLE");
        if (b11 != null && (travelTabScreenState = (TravelTabScreenState) b11.getParcelable("ru.ozon.app.android.travel.core.tab.presentation.EXTRA_STATE")) != null) {
            getScreenState().setValue(travelTabScreenState);
        }
        savedStateRegistry.i("ru.ozon.app.android.travel.core.tab.presentation.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.travel.core.tab.presentation.EXTRA_BUNDLE", new c.b() { // from class: jO.a
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle init$lambda$1;
                init$lambda$1 = TravelTabViewModelImpl.init$lambda$1(TravelTabViewModelImpl.this);
                return init$lambda$1;
            }
        });
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModel
    public void observeConfigChanges(@NotNull String miniAppName, String referrerMiniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        B0 b02 = this.loadTabsJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loadTabsJob = C10727i.c(x0.a(this), null, null, new TravelTabViewModelImpl$observeConfigChanges$1(this, miniAppName, referrerMiniAppName, null), 3);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModel
    @NotNull
    public V<TravelTabScreenState> getScreenState() {
        return this.screenState;
    }
}
