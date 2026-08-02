package ru.ozon.app.android.pikazon.placeholdertracker;

import Pk0.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bR*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderInfo;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "minVisiblePercentageViewed", "getMinVisiblePercentageViewed", "()Ljava/lang/Float;", "setMinVisiblePercentageViewed", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "viewStartVisibleTime", "", "getViewStartVisibleTime", "()J", "setViewStartVisibleTime", "(J)V", "maxPlaceholderVisibilityDuration", "getMaxPlaceholderVisibilityDuration", "setMaxPlaceholderVisibilityDuration", "equals", "", "other", "hashCode", "", "clear", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderInfo {
    private long maxPlaceholderVisibilityDuration;
    private Float minVisiblePercentageViewed;
    private long viewStartVisibleTime;

    public final void clear() {
        setMinVisiblePercentageViewed(null);
        this.viewStartVisibleTime = 0L;
        this.maxPlaceholderVisibilityDuration = 0L;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceholderInfo)) {
            return false;
        }
        PlaceholderInfo placeholderInfo = (PlaceholderInfo) other;
        return Intrinsics.c(this.minVisiblePercentageViewed, placeholderInfo.minVisiblePercentageViewed) && this.viewStartVisibleTime == placeholderInfo.viewStartVisibleTime && this.maxPlaceholderVisibilityDuration == placeholderInfo.maxPlaceholderVisibilityDuration;
    }

    public final long getMaxPlaceholderVisibilityDuration() {
        return this.maxPlaceholderVisibilityDuration;
    }

    public final Float getMinVisiblePercentageViewed() {
        return this.minVisiblePercentageViewed;
    }

    public final long getViewStartVisibleTime() {
        return this.viewStartVisibleTime;
    }

    public int hashCode() {
        Float f7 = this.minVisiblePercentageViewed;
        return Long.hashCode(this.maxPlaceholderVisibilityDuration) + c.a((f7 != null ? f7.hashCode() : 0) * 31, 31, this.viewStartVisibleTime);
    }

    public final void setMaxPlaceholderVisibilityDuration(long j11) {
        this.maxPlaceholderVisibilityDuration = j11;
    }

    public final void setMinVisiblePercentageViewed(Float f7) {
        if (f7 != null && (f7.floatValue() <= 0.0f || f7.floatValue() > 1.0f)) {
            throw new IllegalArgumentException("Min visible percentage viewed must be in range (0; 1]");
        }
        this.minVisiblePercentageViewed = f7;
    }

    public final void setViewStartVisibleTime(long j11) {
        this.viewStartVisibleTime = j11;
    }
}
