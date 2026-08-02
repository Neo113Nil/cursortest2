package ru.ozon.app.android.csma.orderTracking.data;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/BarcodeTimerManager;", "", "", "pauseTimer", "()V", "resumeTimer", "", "shortDelay", "restartTimer", "(Z)V", "LAe/h;", "getTicks", "()LAe/h;", "ticks", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodeTimerManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void restartTimer$default(BarcodeTimerManager barcodeTimerManager, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restartTimer");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            barcodeTimerManager.restartTimer(z11);
        }
    }

    @NotNull
    InterfaceC2395h<Unit> getTicks();

    void pauseTimer();

    void restartTimer(boolean shortDelay);

    void resumeTimer();
}
