package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroidx/lifecycle/P;", "", "selectedTabLiveData", "()Landroidx/lifecycle/P;", "index", "", "publishSelectedIndex", "(I)V", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3ViewModel extends w0 {

    @NotNull
    private final V<Integer> selectedTabLiveData = new V<>();

    public final void publishSelectedIndex(int index) {
        this.selectedTabLiveData.setValue(Integer.valueOf(index));
    }

    @NotNull
    public final P<Integer> selectedTabLiveData() {
        return this.selectedTabLiveData;
    }
}
