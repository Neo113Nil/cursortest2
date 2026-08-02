package ru.ozon.app.android.travel.feature.entry.fragment;

import Ae.M0;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/fragment/OzonTravelFragmentViewModel;", "", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "LAe/M0;", "getTabConfigFlow", "()LAe/M0;", "tabConfigFlow", "Landroidx/lifecycle/P;", "", "getUnpaidOrderCountLiveData", "()Landroidx/lifecycle/P;", "unpaidOrderCountLiveData", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OzonTravelFragmentViewModel {
    TabConfig getTabConfig();

    @NotNull
    M0<TabConfig> getTabConfigFlow();

    @NotNull
    P<Integer> getUnpaidOrderCountLiveData();
}
