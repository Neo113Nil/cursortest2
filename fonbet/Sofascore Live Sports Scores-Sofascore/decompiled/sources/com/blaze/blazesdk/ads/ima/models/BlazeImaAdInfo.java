package com.blaze.blazesdk.ads.ima.models;

import android.net.Uri;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0007\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00064"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "", f.b.c, "", "adTitle", "adDescription", "adSystem", "isSkippable", "", "skipTimeOffset", "", "adDuration", "advertiserName", "adTag", "Landroid/net/Uri;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Landroid/net/Uri;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getAdId", "()Ljava/lang/String;", "getAdTitle", "getAdDescription", "getAdSystem", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSkipTimeOffset", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAdDuration", "getAdvertiserName", "getAdTag", "()Landroid/net/Uri;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Landroid/net/Uri;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdInfo;", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeImaAdInfo {
    public static final int $stable = 8;

    @Nullable
    private final String adDescription;

    @Nullable
    private final Double adDuration;

    @Nullable
    private final String adId;

    @Nullable
    private final String adSystem;

    @Nullable
    private final Uri adTag;

    @Nullable
    private final String adTitle;

    @Nullable
    private final String advertiserName;

    @Nullable
    private final BlazeContentExtraInfo extraInfo;

    @Nullable
    private final Boolean isSkippable;

    @Nullable
    private final Double skipTimeOffset;

    public /* synthetic */ BlazeImaAdInfo(String str, String str2, String str3, String str4, Boolean bool, Double d, Double d2, String str5, Uri uri, BlazeContentExtraInfo blazeContentExtraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : str5, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : uri, (i & 512) != 0 ? null : blazeContentExtraInfo);
    }

    public static /* synthetic */ BlazeImaAdInfo copy$default(BlazeImaAdInfo blazeImaAdInfo, String str, String str2, String str3, String str4, Boolean bool, Double d, Double d2, String str5, Uri uri, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeImaAdInfo.adId;
        }
        if ((i & 2) != 0) {
            str2 = blazeImaAdInfo.adTitle;
        }
        if ((i & 4) != 0) {
            str3 = blazeImaAdInfo.adDescription;
        }
        if ((i & 8) != 0) {
            str4 = blazeImaAdInfo.adSystem;
        }
        if ((i & 16) != 0) {
            bool = blazeImaAdInfo.isSkippable;
        }
        if ((i & 32) != 0) {
            d = blazeImaAdInfo.skipTimeOffset;
        }
        if ((i & 64) != 0) {
            d2 = blazeImaAdInfo.adDuration;
        }
        if ((i & 128) != 0) {
            str5 = blazeImaAdInfo.advertiserName;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            uri = blazeImaAdInfo.adTag;
        }
        if ((i & 512) != 0) {
            blazeContentExtraInfo = blazeImaAdInfo.extraInfo;
        }
        Uri uri2 = uri;
        BlazeContentExtraInfo blazeContentExtraInfo2 = blazeContentExtraInfo;
        Double d3 = d2;
        String str6 = str5;
        Boolean bool2 = bool;
        Double d4 = d;
        return blazeImaAdInfo.copy(str, str2, str3, str4, bool2, d4, d3, str6, uri2, blazeContentExtraInfo2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdTitle() {
        return this.adTitle;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAdDescription() {
        return this.adDescription;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAdSystem() {
        return this.adSystem;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsSkippable() {
        return this.isSkippable;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getSkipTimeOffset() {
        return this.skipTimeOffset;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getAdDuration() {
        return this.adDuration;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getAdvertiserName() {
        return this.advertiserName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Uri getAdTag() {
        return this.adTag;
    }

    @NotNull
    public final BlazeImaAdInfo copy(@Nullable String adId, @Nullable String adTitle, @Nullable String adDescription, @Nullable String adSystem, @Nullable Boolean isSkippable, @Nullable Double skipTimeOffset, @Nullable Double adDuration, @Nullable String advertiserName, @Nullable Uri adTag, @Nullable BlazeContentExtraInfo extraInfo) {
        return new BlazeImaAdInfo(adId, adTitle, adDescription, adSystem, isSkippable, skipTimeOffset, adDuration, advertiserName, adTag, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeImaAdInfo)) {
            return false;
        }
        BlazeImaAdInfo blazeImaAdInfo = (BlazeImaAdInfo) other;
        return Intrinsics.c(this.adId, blazeImaAdInfo.adId) && Intrinsics.c(this.adTitle, blazeImaAdInfo.adTitle) && Intrinsics.c(this.adDescription, blazeImaAdInfo.adDescription) && Intrinsics.c(this.adSystem, blazeImaAdInfo.adSystem) && Intrinsics.c(this.isSkippable, blazeImaAdInfo.isSkippable) && Intrinsics.c(this.skipTimeOffset, blazeImaAdInfo.skipTimeOffset) && Intrinsics.c(this.adDuration, blazeImaAdInfo.adDuration) && Intrinsics.c(this.advertiserName, blazeImaAdInfo.advertiserName) && Intrinsics.c(this.adTag, blazeImaAdInfo.adTag) && Intrinsics.c(this.extraInfo, blazeImaAdInfo.extraInfo);
    }

    @Nullable
    public final String getAdDescription() {
        return this.adDescription;
    }

    @Nullable
    public final Double getAdDuration() {
        return this.adDuration;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getAdSystem() {
        return this.adSystem;
    }

    @Nullable
    public final Uri getAdTag() {
        return this.adTag;
    }

    @Nullable
    public final String getAdTitle() {
        return this.adTitle;
    }

    @Nullable
    public final String getAdvertiserName() {
        return this.advertiserName;
    }

    @Nullable
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final Double getSkipTimeOffset() {
        return this.skipTimeOffset;
    }

    public int hashCode() {
        String str = this.adId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adDescription;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adSystem;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isSkippable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.skipTimeOffset;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.adDuration;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.advertiserName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Uri uri = this.adTag;
        int hashCode9 = (hashCode8 + (uri == null ? 0 : uri.hashCode())) * 31;
        BlazeContentExtraInfo blazeContentExtraInfo = this.extraInfo;
        return hashCode9 + (blazeContentExtraInfo != null ? blazeContentExtraInfo.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSkippable() {
        return this.isSkippable;
    }

    @NotNull
    public String toString() {
        return "BlazeImaAdInfo(adId=" + this.adId + ", adTitle=" + this.adTitle + ", adDescription=" + this.adDescription + ", adSystem=" + this.adSystem + ", isSkippable=" + this.isSkippable + ", skipTimeOffset=" + this.skipTimeOffset + ", adDuration=" + this.adDuration + ", advertiserName=" + this.advertiserName + ", adTag=" + this.adTag + ", extraInfo=" + this.extraInfo + ')';
    }

    public BlazeImaAdInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Double d, @Nullable Double d2, @Nullable String str5, @Nullable Uri uri, @Nullable BlazeContentExtraInfo blazeContentExtraInfo) {
        this.adId = str;
        this.adTitle = str2;
        this.adDescription = str3;
        this.adSystem = str4;
        this.isSkippable = bool;
        this.skipTimeOffset = d;
        this.adDuration = d2;
        this.advertiserName = str5;
        this.adTag = uri;
        this.extraInfo = blazeContentExtraInfo;
    }

    public BlazeImaAdInfo() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }
}
