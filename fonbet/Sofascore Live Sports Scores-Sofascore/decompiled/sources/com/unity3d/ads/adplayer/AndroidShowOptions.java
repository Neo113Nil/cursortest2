package com.unity3d.ads.adplayer;

import defpackage.dmi;
import defpackage.lnb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "unityAdsShowOptions", "", "", "", "placementId", "isOfferwallAd", "", "offerwallPlacementName", "<init>", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;)V", "getUnityAdsShowOptions", "()Ljava/util/Map;", "getPlacementId", "()Ljava/lang/String;", "()Z", "getOfferwallPlacementName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;

    @Nullable
    private final String offerwallPlacementName;

    @Nullable
    private final String placementId;

    @Nullable
    private final Map<String, Object> unityAdsShowOptions;

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i & 4) != 0) {
            z = androidShowOptions.isOfferwallAd;
        }
        if ((i & 8) != 0) {
            str2 = androidShowOptions.offerwallPlacementName;
        }
        return androidShowOptions.copy(map, str, z, str2);
    }

    @Nullable
    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final AndroidShowOptions copy(@Nullable Map<String, ? extends Object> unityAdsShowOptions, @Nullable String placementId, boolean isOfferwallAd, @Nullable String offerwallPlacementName) {
        return new AndroidShowOptions(unityAdsShowOptions, placementId, isOfferwallAd, offerwallPlacementName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) other;
        return Intrinsics.c(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && Intrinsics.c(this.placementId, androidShowOptions.placementId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && Intrinsics.c(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int e = dmi.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isOfferwallAd);
        String str2 = this.offerwallPlacementName;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb.append(this.unityAdsShowOptions);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", isOfferwallAd=");
        sb.append(this.isOfferwallAd);
        sb.append(", offerwallPlacementName=");
        return lnb.q(sb, this.offerwallPlacementName, ')');
    }

    public AndroidShowOptions(@Nullable Map<String, ? extends Object> map, @Nullable String str, boolean z, @Nullable String str2) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
    }
}
