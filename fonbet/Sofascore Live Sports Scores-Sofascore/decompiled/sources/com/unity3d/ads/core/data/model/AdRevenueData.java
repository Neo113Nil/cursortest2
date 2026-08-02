package com.unity3d.ads.core.data.model;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "eventId", "Ljava/util/UUID;", "revenue", "", "countryCode", "", "networkName", "adUnitId", "thirdPartyAdPlacementId", "adFormat", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "<init>", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)V", "getEventId", "()Ljava/util/UUID;", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCountryCode", "()Ljava/lang/String;", "getNetworkName", "getAdUnitId", "getThirdPartyAdPlacementId", "getAdFormat", "()Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdRevenueData {

    @Nullable
    private final AdRevenueAdFormat adFormat;

    @Nullable
    private final String adUnitId;

    @Nullable
    private final String countryCode;

    @NotNull
    private final UUID eventId;

    @Nullable
    private final String networkName;

    @Nullable
    private final Double revenue;

    @Nullable
    private final String thirdPartyAdPlacementId;

    public AdRevenueData(@NotNull UUID uuid, @Nullable Double d, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable AdRevenueAdFormat adRevenueAdFormat) {
        uuid.getClass();
        this.eventId = uuid;
        this.revenue = d;
        this.countryCode = str;
        this.networkName = str2;
        this.adUnitId = str3;
        this.thirdPartyAdPlacementId = str4;
        this.adFormat = adRevenueAdFormat;
    }

    public static /* synthetic */ AdRevenueData copy$default(AdRevenueData adRevenueData, UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = adRevenueData.eventId;
        }
        if ((i & 2) != 0) {
            d = adRevenueData.revenue;
        }
        if ((i & 4) != 0) {
            str = adRevenueData.countryCode;
        }
        if ((i & 8) != 0) {
            str2 = adRevenueData.networkName;
        }
        if ((i & 16) != 0) {
            str3 = adRevenueData.adUnitId;
        }
        if ((i & 32) != 0) {
            str4 = adRevenueData.thirdPartyAdPlacementId;
        }
        if ((i & 64) != 0) {
            adRevenueAdFormat = adRevenueData.adFormat;
        }
        String str5 = str4;
        AdRevenueAdFormat adRevenueAdFormat2 = adRevenueAdFormat;
        String str6 = str3;
        String str7 = str;
        return adRevenueData.copy(uuid, d, str7, str2, str6, str5, adRevenueAdFormat2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getRevenue() {
        return this.revenue;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    @NotNull
    public final AdRevenueData copy(@NotNull UUID eventId, @Nullable Double revenue, @Nullable String countryCode, @Nullable String networkName, @Nullable String adUnitId, @Nullable String thirdPartyAdPlacementId, @Nullable AdRevenueAdFormat adFormat) {
        eventId.getClass();
        return new AdRevenueData(eventId, revenue, countryCode, networkName, adUnitId, thirdPartyAdPlacementId, adFormat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) other;
        return Intrinsics.c(this.eventId, adRevenueData.eventId) && Intrinsics.c(this.revenue, adRevenueData.revenue) && Intrinsics.c(this.countryCode, adRevenueData.countryCode) && Intrinsics.c(this.networkName, adRevenueData.networkName) && Intrinsics.c(this.adUnitId, adRevenueData.adUnitId) && Intrinsics.c(this.thirdPartyAdPlacementId, adRevenueData.thirdPartyAdPlacementId) && this.adFormat == adRevenueData.adFormat;
    }

    @Nullable
    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final UUID getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Double getRevenue() {
        return this.revenue;
    }

    @Nullable
    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    public int hashCode() {
        int hashCode = this.eventId.hashCode() * 31;
        Double d = this.revenue;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.countryCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.networkName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUnitId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thirdPartyAdPlacementId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdRevenueAdFormat adRevenueAdFormat = this.adFormat;
        return hashCode6 + (adRevenueAdFormat != null ? adRevenueAdFormat.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdRevenueData(eventId=" + this.eventId + ", revenue=" + this.revenue + ", countryCode=" + this.countryCode + ", networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", thirdPartyAdPlacementId=" + this.thirdPartyAdPlacementId + ", adFormat=" + this.adFormat + ')';
    }

    public /* synthetic */ AdRevenueData(UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID() : uuid, d, str, str2, str3, str4, adRevenueAdFormat);
    }
}
