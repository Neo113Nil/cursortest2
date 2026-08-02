package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "selectedPosition", "", "setup", "(I)V", "newPosition", "selectTab", "I", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "selectTabLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSelectTabLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReturnPolicyViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Integer> selectTabLiveData = new SingleLiveEvent<>();
    private int selectedPosition;

    @NotNull
    public final SingleLiveEvent<Integer> getSelectTabLiveData() {
        return this.selectTabLiveData;
    }

    public final void selectTab(int newPosition) {
        if (this.selectedPosition == newPosition || newPosition == -1) {
            return;
        }
        this.selectedPosition = newPosition;
        this.selectTabLiveData.setValue(Integer.valueOf(newPosition));
    }

    public final void setup(int selectedPosition) {
        if (selectedPosition != -1) {
            this.selectedPosition = selectedPosition;
        }
        this.selectTabLiveData.setValue(Integer.valueOf(this.selectedPosition));
    }
}
