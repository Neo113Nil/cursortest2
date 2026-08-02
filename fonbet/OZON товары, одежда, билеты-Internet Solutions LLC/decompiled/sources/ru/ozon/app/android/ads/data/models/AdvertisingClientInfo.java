package ru.ozon.app.android.ads.data.models;

import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/data/models/AdvertisingClientInfo;", "", "", "id", "", "isLimitAdTrackingEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Z", "()Z", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvertisingClientInfo {

    @NotNull
    private final String id;
    private final boolean isLimitAdTrackingEnabled;

    public AdvertisingClientInfo(@NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.isLimitAdTrackingEnabled = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertisingClientInfo)) {
            return false;
        }
        AdvertisingClientInfo advertisingClientInfo = (AdvertisingClientInfo) other;
        return Intrinsics.d(this.id, advertisingClientInfo.id) && this.isLimitAdTrackingEnabled == advertisingClientInfo.isLimitAdTrackingEnabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLimitAdTrackingEnabled) + (this.id.hashCode() * 31);
    }

    /* renamed from: isLimitAdTrackingEnabled, reason: from getter */
    public final boolean getIsLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return b.f("AdvertisingClientInfo(id=", this.id, ", isLimitAdTrackingEnabled=", ")", this.isLimitAdTrackingEnabled);
    }
}
