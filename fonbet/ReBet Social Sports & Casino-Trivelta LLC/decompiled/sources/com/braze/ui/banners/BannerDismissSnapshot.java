package com.braze.ui.banners;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/braze/ui/banners/BannerDismissSnapshot;", "", "placementId", "", "stableKey", "trackingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlacementId", "()Ljava/lang/String;", "getStableKey", "getTrackingId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BannerDismissSnapshot {

    @Nullable
    private final String placementId;

    @Nullable
    private final String stableKey;

    @Nullable
    private final String trackingId;

    public BannerDismissSnapshot(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.placementId = str;
        this.stableKey = str2;
        this.trackingId = str3;
    }

    public static /* synthetic */ BannerDismissSnapshot copy$default(BannerDismissSnapshot bannerDismissSnapshot, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bannerDismissSnapshot.placementId;
        }
        if ((i10 & 2) != 0) {
            str2 = bannerDismissSnapshot.stableKey;
        }
        if ((i10 & 4) != 0) {
            str3 = bannerDismissSnapshot.trackingId;
        }
        return bannerDismissSnapshot.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStableKey() {
        return this.stableKey;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    @NotNull
    public final BannerDismissSnapshot copy(@Nullable String placementId, @Nullable String stableKey, @Nullable String trackingId) {
        return new BannerDismissSnapshot(placementId, stableKey, trackingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDismissSnapshot)) {
            return false;
        }
        BannerDismissSnapshot bannerDismissSnapshot = (BannerDismissSnapshot) other;
        return Intrinsics.areEqual(this.placementId, bannerDismissSnapshot.placementId) && Intrinsics.areEqual(this.stableKey, bannerDismissSnapshot.stableKey) && Intrinsics.areEqual(this.trackingId, bannerDismissSnapshot.trackingId);
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getStableKey() {
        return this.stableKey;
    }

    @Nullable
    public final String getTrackingId() {
        return this.trackingId;
    }

    public int hashCode() {
        String str = this.placementId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stableKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trackingId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BannerDismissSnapshot(placementId=" + this.placementId + ", stableKey=" + this.stableKey + ", trackingId=" + this.trackingId + ")";
    }
}
