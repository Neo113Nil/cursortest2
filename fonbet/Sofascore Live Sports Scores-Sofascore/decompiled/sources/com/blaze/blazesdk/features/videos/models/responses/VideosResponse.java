package com.blaze.blazesdk.features.videos.models.responses;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.features.videos.models.dto.VideoDto;
import defpackage.fc6;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/responses/VideosResponse;", "", "assetsExpiryTime", "Ljava/util/Date;", "totalItems", "", "defaultAdsInfo", "Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "result", "", "Lcom/blaze/blazesdk/features/videos/models/dto/VideoDto;", "<init>", "(Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/util/List;)V", "getAssetsExpiryTime", "()Ljava/util/Date;", "getTotalItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultAdsInfo", "()Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "getResult", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/util/List;)Lcom/blaze/blazesdk/features/videos/models/responses/VideosResponse;", "equals", "", "other", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideosResponse {
    public static final int $stable = 8;

    @Nullable
    private final Date assetsExpiryTime;

    @Nullable
    private final AdInfoDto defaultAdsInfo;

    @Nullable
    private final List<VideoDto> result;

    @Nullable
    private final Integer totalItems;

    public VideosResponse(@Nullable Date date, @Nullable Integer num, @Nullable AdInfoDto adInfoDto, @Nullable List<VideoDto> list) {
        this.assetsExpiryTime = date;
        this.totalItems = num;
        this.defaultAdsInfo = adInfoDto;
        this.result = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideosResponse copy$default(VideosResponse videosResponse, Date date, Integer num, AdInfoDto adInfoDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            date = videosResponse.assetsExpiryTime;
        }
        if ((i & 2) != 0) {
            num = videosResponse.totalItems;
        }
        if ((i & 4) != 0) {
            adInfoDto = videosResponse.defaultAdsInfo;
        }
        if ((i & 8) != 0) {
            list = videosResponse.result;
        }
        return videosResponse.copy(date, num, adInfoDto, list);
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
    public final List<VideoDto> component4() {
        return this.result;
    }

    @NotNull
    public final VideosResponse copy(@Nullable Date assetsExpiryTime, @Nullable Integer totalItems, @Nullable AdInfoDto defaultAdsInfo, @Nullable List<VideoDto> result) {
        return new VideosResponse(assetsExpiryTime, totalItems, defaultAdsInfo, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideosResponse)) {
            return false;
        }
        VideosResponse videosResponse = (VideosResponse) other;
        return Intrinsics.c(this.assetsExpiryTime, videosResponse.assetsExpiryTime) && Intrinsics.c(this.totalItems, videosResponse.totalItems) && Intrinsics.c(this.defaultAdsInfo, videosResponse.defaultAdsInfo) && Intrinsics.c(this.result, videosResponse.result);
    }

    @Nullable
    public final Date getAssetsExpiryTime() {
        return this.assetsExpiryTime;
    }

    @Nullable
    public final AdInfoDto getDefaultAdsInfo() {
        return this.defaultAdsInfo;
    }

    @Nullable
    public final List<VideoDto> getResult() {
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
        List<VideoDto> list = this.result;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideosResponse(assetsExpiryTime=");
        sb.append(this.assetsExpiryTime);
        sb.append(", totalItems=");
        sb.append(this.totalItems);
        sb.append(", defaultAdsInfo=");
        sb.append(this.defaultAdsInfo);
        sb.append(", result=");
        return fc6.p(sb, this.result, ')');
    }
}
