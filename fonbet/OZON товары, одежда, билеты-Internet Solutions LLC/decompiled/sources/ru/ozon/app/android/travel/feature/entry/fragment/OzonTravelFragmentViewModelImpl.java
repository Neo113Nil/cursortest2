package ru.ozon.app.android.travel.feature.entry.fragment;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.C5429p;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelFallbackTabConfigProvider;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigMapper;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigRepository;
import ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/fragment/OzonTravelFragmentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/entry/fragment/OzonTravelFragmentViewModel;", "Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorage;", "storage", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigRepository;", "tabConfigRepository", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigMapper;", "tabConfigMapper", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "configUpdateDelegate", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelFallbackTabConfigProvider;", "defaultTabConfigProvider", "<init>", "(Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorage;Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigRepository;Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigMapper;Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/travel/feature/entry/data/OzonTravelFallbackTabConfigProvider;)V", "", "loadTabConfig", "()V", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigRepository;", "Lru/ozon/app/android/travel/feature/entry/data/OzonTravelTabConfigMapper;", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "tabConfig", "Lru/ozon/app/android/tabbar/data/TabConfig;", "LAe/x0;", "_tabConfigFlow", "LAe/x0;", "LAe/M0;", "tabConfigFlow", "LAe/M0;", "getTabConfigFlow", "()LAe/M0;", "Landroidx/lifecycle/P;", "", "unpaidOrderCountLiveData", "Landroidx/lifecycle/P;", "getUnpaidOrderCountLiveData", "()Landroidx/lifecycle/P;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OzonTravelFragmentViewModelImpl extends w0 implements OzonTravelFragmentViewModel {

    @NotNull
    private final x0<TabConfig> _tabConfigFlow;

    @NotNull
    private final TravelTabConfigUpdateDelegate configUpdateDelegate;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;
    private TabConfig tabConfig;

    @NotNull
    private final M0<TabConfig> tabConfigFlow;

    @NotNull
    private final OzonTravelTabConfigMapper tabConfigMapper;

    @NotNull
    private final OzonTravelTabConfigRepository tabConfigRepository;

    @NotNull
    private final P<Integer> unpaidOrderCountLiveData;

    public OzonTravelFragmentViewModelImpl(@NotNull TravelUnpaidOrderCountStorage storage, @NotNull OzonTravelTabConfigRepository tabConfigRepository, @NotNull OzonTravelTabConfigMapper tabConfigMapper, @NotNull TravelTabConfigUpdateDelegate configUpdateDelegate, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull OzonTravelFallbackTabConfigProvider defaultTabConfigProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(tabConfigRepository, "tabConfigRepository");
        Intrinsics.checkNotNullParameter(tabConfigMapper, "tabConfigMapper");
        Intrinsics.checkNotNullParameter(configUpdateDelegate, "configUpdateDelegate");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(defaultTabConfigProvider, "defaultTabConfigProvider");
        this.tabConfigRepository = tabConfigRepository;
        this.tabConfigMapper = tabConfigMapper;
        this.configUpdateDelegate = configUpdateDelegate;
        this.dispatcherProvider = dispatcherProvider;
        x0<TabConfig> a11 = O0.a(tabConfigMapper.map(defaultTabConfigProvider.provideTabs()));
        this._tabConfigFlow = a11;
        this.tabConfigFlow = C2399j.b(a11);
        this.unpaidOrderCountLiveData = C5429p.b(storage.getCount());
        loadTabConfig();
    }

    private final void loadTabConfig() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OzonTravelFragmentViewModelImpl$loadTabConfig$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModel
    public TabConfig getTabConfig() {
        return this.tabConfig;
    }

    @Override // ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModel
    @NotNull
    public M0<TabConfig> getTabConfigFlow() {
        return this.tabConfigFlow;
    }

    @Override // ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModel
    @NotNull
    public P<Integer> getUnpaidOrderCountLiveData() {
        return this.unpaidOrderCountLiveData;
    }
}
