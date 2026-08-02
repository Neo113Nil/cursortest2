package ru.ozon.app.android.fresh.feature.entry.fragment;

import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.entry.data.OzonFreshTabConfigRepository;
import ru.ozon.app.android.tabbar.data.TabConfig;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragmentViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/entry/fragment/OzonFreshFragmentViewModel;", "Lru/ozon/app/android/fresh/feature/entry/data/OzonFreshTabConfigRepository;", "freshTabConfigRepository", "<init>", "(Lru/ozon/app/android/fresh/feature/entry/data/OzonFreshTabConfigRepository;)V", "", "loadTabConfig", "()V", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "Lru/ozon/app/android/fresh/feature/entry/data/OzonFreshTabConfigRepository;", "Landroidx/lifecycle/V;", "tabConfigLiveData", "Landroidx/lifecycle/V;", "getTabConfigLiveData", "()Landroidx/lifecycle/V;", "tabConfig", "Lru/ozon/app/android/tabbar/data/TabConfig;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonFreshFragmentViewModelImpl extends w0 implements OzonFreshFragmentViewModel {

    @NotNull
    private final OzonFreshTabConfigRepository freshTabConfigRepository;
    private TabConfig tabConfig;

    @NotNull
    private final V<TabConfig> tabConfigLiveData;

    public OzonFreshFragmentViewModelImpl(@NotNull OzonFreshTabConfigRepository freshTabConfigRepository) {
        Intrinsics.checkNotNullParameter(freshTabConfigRepository, "freshTabConfigRepository");
        this.freshTabConfigRepository = freshTabConfigRepository;
        this.tabConfigLiveData = new V<>();
        loadTabConfig();
    }

    private final void loadTabConfig() {
        C10727i.c(x0.a(this), null, null, new OzonFreshFragmentViewModelImpl$loadTabConfig$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragmentViewModel
    public TabConfig getTabConfig() {
        return this.tabConfig;
    }

    @Override // ru.ozon.app.android.fresh.feature.entry.fragment.OzonFreshFragmentViewModel
    @NotNull
    public V<TabConfig> getTabConfigLiveData() {
        return this.tabConfigLiveData;
    }
}
