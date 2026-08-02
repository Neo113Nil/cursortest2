package ru.ozon.app.android.ads.data.analytics;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ads/data/analytics/SwitchModeTracking;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onTrackingInfo", "offTrackingInfo", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getOnTrackingInfo", "()LWZ/t;", "getOffTrackingInfo", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SwitchModeTracking {

    @NotNull
    private final t offTrackingInfo;

    @NotNull
    private final t onTrackingInfo;

    public SwitchModeTracking(@NotNull t onTrackingInfo, @NotNull t offTrackingInfo) {
        Intrinsics.checkNotNullParameter(onTrackingInfo, "onTrackingInfo");
        Intrinsics.checkNotNullParameter(offTrackingInfo, "offTrackingInfo");
        this.onTrackingInfo = onTrackingInfo;
        this.offTrackingInfo = offTrackingInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchModeTracking)) {
            return false;
        }
        SwitchModeTracking switchModeTracking = (SwitchModeTracking) other;
        return Intrinsics.d(this.onTrackingInfo, switchModeTracking.onTrackingInfo) && Intrinsics.d(this.offTrackingInfo, switchModeTracking.offTrackingInfo);
    }

    @NotNull
    public final t getOffTrackingInfo() {
        return this.offTrackingInfo;
    }

    @NotNull
    public final t getOnTrackingInfo() {
        return this.onTrackingInfo;
    }

    public int hashCode() {
        return this.offTrackingInfo.hashCode() + (this.onTrackingInfo.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SwitchModeTracking(onTrackingInfo=" + this.onTrackingInfo + ", offTrackingInfo=" + this.offTrackingInfo + ")";
    }
}
