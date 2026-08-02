package ru.ozon.app.android.video.playerV2.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\nR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/video/playerV2/data/ViewTimeInfoCollector;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "lastViewTimeMsValue", "getLastViewTimeMsValue", "()J", "updateLastViewTimeMsValue", "", "newValue", "resetData", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewTimeInfoCollector {
    private long lastViewTimeMsValue;

    public final long getLastViewTimeMsValue() {
        return this.lastViewTimeMsValue;
    }

    public final void resetData() {
        this.lastViewTimeMsValue = 0L;
    }

    public final void updateLastViewTimeMsValue(long newValue) {
        this.lastViewTimeMsValue = newValue;
    }
}
