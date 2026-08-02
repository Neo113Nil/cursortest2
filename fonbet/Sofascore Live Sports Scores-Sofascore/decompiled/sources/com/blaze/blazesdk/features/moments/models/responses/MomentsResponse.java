package com.blaze.blazesdk.features.moments.models.responses;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.features.moments.models.dto.MomentsDto;
import defpackage.lnb;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/responses/MomentsResponse;", "", "assetsExpiryTime", "Ljava/util/Date;", "totalItems", "", "defaultAdsInfo", "Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "result", "", "Lcom/blaze/blazesdk/features/moments/models/dto/MomentsDto;", "attributionToken", "", "<init>", "(Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/util/List;Ljava/lang/String;)V", "getAssetsExpiryTime", "()Ljava/util/Date;", "getTotalItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultAdsInfo", "()Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "getResult", "()Ljava/util/List;", "getAttributionToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/util/List;Ljava/lang/String;)Lcom/blaze/blazesdk/features/moments/models/responses/MomentsResponse;", "equals", "", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MomentsResponse {
    public static final int $stable = 8;

    @Nullable
    private final Date assetsExpiryTime;

    @Nullable
    private final String attributionToken;

    @Nullable
    private final AdInfoDto defaultAdsInfo;

    @Nullable
    private final List<MomentsDto> result;

    @Nullable
    private final Integer totalItems;

    public MomentsResponse(@Nullable Date date, @Nullable Integer num, @Nullable AdInfoDto adInfoDto, @Nullable List<MomentsDto> list, @Nullable String str) {
        this.assetsExpiryTime = date;
        this.totalItems = num;
        this.defaultAdsInfo = adInfoDto;
        this.result = list;
        this.attributionToken = str;
    }

    public static /* synthetic */ MomentsResponse copy$default(MomentsResponse momentsResponse, Date date, Integer num, AdInfoDto adInfoDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = momentsResponse.assetsExpiryTime;
        }
        if ((i & 2) != 0) {
            num = momentsResponse.totalItems;
        }
        if ((i & 4) != 0) {
            adInfoDto = momentsResponse.defaultAdsInfo;
        }
        if ((i & 8) != 0) {
            list = momentsResponse.result;
        }
        if ((i & 16) != 0) {
            str = momentsResponse.attributionToken;
        }
        String str2 = str;
        AdInfoDto adInfoDto2 = adInfoDto;
        return momentsResponse.copy(date, num, adInfoDto2, list, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Date getAssetsExpiryTime() {
        return this.assetsExpiryTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalItems() {
        return this.totalItems;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AdInfoDto getDefaultAdsInfo() {
        return this.defaultAdsInfo;
    }

    @Nullable
    public final List<MomentsDto> component4() {
        return this.result;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getAttributionToken() {
        return this.attributionToken;
    }

    @NotNull
    public final MomentsResponse copy(@Nullable Date assetsExpiryTime, @Nullable Integer totalItems, @Nullable AdInfoDto defaultAdsInfo, @Nullable List<MomentsDto> result, @Nullable String attributionToken) {
        return new MomentsResponse(assetsExpiryTime, totalItems, defaultAdsInfo, result, attributionToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentsResponse)) {
            return false;
        }
        MomentsResponse momentsResponse = (MomentsResponse) other;
        return Intrinsics.c(this.assetsExpiryTime, momentsResponse.assetsExpiryTime) && Intrinsics.c(this.totalItems, momentsResponse.totalItems) && Intrinsics.c(this.defaultAdsInfo, momentsResponse.defaultAdsInfo) && Intrinsics.c(this.result, momentsResponse.result) && Intrinsics.c(this.attributionToken, momentsResponse.attributionToken);
    }

    @Nullable
    public final Date getAssetsExpiryTime() {
        return this.assetsExpiryTime;
    }

    @Nullable
    public final String getAttributionToken() {
        return this.attributionToken;
    }

    @Nullable
    public final AdInfoDto getDefaultAdsInfo() {
        return this.defaultAdsInfo;
    }

    @Nullable
    public final List<MomentsDto> getResult() {
        return this.result;
    }

    @Nullable
    public final Integer getTotalItems() {
        return this.totalItems;
    }

    public int hashCode() {
        Date date = this.assetsExpiryTime;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        Integer num = this.totalItems;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AdInfoDto adInfoDto = this.defaultAdsInfo;
        int hashCode3 = (hashCode2 + (adInfoDto == null ? 0 : adInfoDto.hashCode())) * 31;
        List<MomentsDto> list = this.result;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.attributionToken;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MomentsResponse(assetsExpiryTime=");
        sb.append(this.assetsExpiryTime);
        sb.append(", totalItems=");
        sb.append(this.totalItems);
        sb.append(", defaultAdsInfo=");
        sb.append(this.defaultAdsInfo);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", attributionToken=");
        return lnb.q(sb, this.attributionToken, ')');
    }
}
