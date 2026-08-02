package ru.ozon.app.android.travel.utils.returnScreenRefresh;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnScreenRefreshCallbacks;", "", "Lxe/M;", "getViewModelScope", "()Lxe/M;", "", "onStartTimer", "()V", "onRefreshData", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReturnScreenRefreshCallbacks {
    @NotNull
    M getViewModelScope();

    void onRefreshData();

    void onStartTimer();
}
