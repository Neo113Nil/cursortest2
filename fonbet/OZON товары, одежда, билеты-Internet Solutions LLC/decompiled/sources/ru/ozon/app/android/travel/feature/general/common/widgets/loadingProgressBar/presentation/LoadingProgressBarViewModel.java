package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.ranges.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "durationMs", "", "progressValue", "", "startOrRestart", "(IF)V", "calculateProgress", "()F", "targetProgressValue", "F", "maxDurationMs", "I", "", "startTimeMs", "J", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadingProgressBarViewModel extends w0 {
    private int maxDurationMs;
    private long startTimeMs;
    private float targetProgressValue;

    public final float calculateProgress() {
        if (this.startTimeMs == 0 || this.maxDurationMs == 0) {
            return 0.0f;
        }
        return h.d((System.currentTimeMillis() - this.startTimeMs) / this.maxDurationMs, 0.0f, this.targetProgressValue);
    }

    public final void startOrRestart(int durationMs, float progressValue) {
        if (durationMs != this.maxDurationMs || this.startTimeMs == 0) {
            this.maxDurationMs = durationMs;
            this.targetProgressValue = progressValue;
            this.startTimeMs = System.currentTimeMillis();
        }
    }
}
