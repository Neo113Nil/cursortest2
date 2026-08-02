package com.blaze.blazesdk.features.stories.models.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.ads.models.dto.BannerAdInfoDto;
import com.blaze.blazesdk.features.shared.models.shared_models.ThumbnailDto;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.dmi;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0013\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000bHÆ\u0003J\u0013\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u001b\u00106\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0015HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003JÐ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00072\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0006\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001b\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R#\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006?"}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/dto/StoryDto;", "", "id", "", "title", "description", "isLive", "", "updateTime", "Ljava/util/Date;", "thumbnails", "", "Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;", "pages", "Lcom/blaze/blazesdk/features/stories/models/dto/PageDto;", "adInfo", "Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "bannerAdInfo", "Lcom/blaze/blazesdk/ads/models/dto/BannerAdInfoDto;", "geoRestriction", "extraInfo", "", "retrievedLanguages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Lcom/blaze/blazesdk/ads/models/dto/BannerAdInfoDto;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUpdateTime", "()Ljava/util/Date;", "getThumbnails", "()Ljava/util/List;", "getPages", "getAdInfo", "()Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "getBannerAdInfo", "()Lcom/blaze/blazesdk/ads/models/dto/BannerAdInfoDto;", "getGeoRestriction", "getExtraInfo", "()Ljava/util/Map;", "getRetrievedLanguages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Lcom/blaze/blazesdk/ads/models/dto/BannerAdInfoDto;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/blaze/blazesdk/features/stories/models/dto/StoryDto;", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StoryDto {
    public static final int $stable = 8;

    @Nullable
    private final AdInfoDto adInfo;

    @Nullable
    private final BannerAdInfoDto bannerAdInfo;

    @Nullable
    private final String description;

    @Nullable
    private final Map<String, String> extraInfo;

    @Nullable
    private final List<String> geoRestriction;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean isLive;

    @Nullable
    private final List<PageDto> pages;

    @Nullable
    private final Map<String, String> retrievedLanguages;

    @Nullable
    private final List<ThumbnailDto> thumbnails;

    @Nullable
    private final String title;

    @Nullable
    private final Date updateTime;

    public StoryDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Date date, @Nullable List<ThumbnailDto> list, @Nullable List<PageDto> list2, @Nullable AdInfoDto adInfoDto, @Nullable BannerAdInfoDto bannerAdInfoDto, @Nullable List<String> list3, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.isLive = bool;
        this.updateTime = date;
        this.thumbnails = list;
        this.pages = list2;
        this.adInfo = adInfoDto;
        this.bannerAdInfo = bannerAdInfoDto;
        this.geoRestriction = list3;
        this.extraInfo = map;
        this.retrievedLanguages = map2;
    }

    public static /* synthetic */ StoryDto copy$default(StoryDto storyDto, String str, String str2, String str3, Boolean bool, Date date, List list, List list2, AdInfoDto adInfoDto, BannerAdInfoDto bannerAdInfoDto, List list3, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storyDto.id;
        }
        if ((i & 2) != 0) {
            str2 = storyDto.title;
        }
        if ((i & 4) != 0) {
            str3 = storyDto.description;
        }
        if ((i & 8) != 0) {
            bool = storyDto.isLive;
        }
        if ((i & 16) != 0) {
            date = storyDto.updateTime;
        }
        if ((i & 32) != 0) {
            list = storyDto.thumbnails;
        }
        if ((i & 64) != 0) {
            list2 = storyDto.pages;
        }
        if ((i & 128) != 0) {
            adInfoDto = storyDto.adInfo;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bannerAdInfoDto = storyDto.bannerAdInfo;
        }
        if ((i & 512) != 0) {
            list3 = storyDto.geoRestriction;
        }
        if ((i & 1024) != 0) {
            map = storyDto.extraInfo;
        }
        if ((i & a.o) != 0) {
            map2 = storyDto.retrievedLanguages;
        }
        Map map3 = map;
        Map map4 = map2;
        BannerAdInfoDto bannerAdInfoDto2 = bannerAdInfoDto;
        List list4 = list3;
        List list5 = list2;
        AdInfoDto adInfoDto2 = adInfoDto;
        Date date2 = date;
        List list6 = list;
        return storyDto.copy(str, str2, str3, bool, date2, list6, list5, adInfoDto2, bannerAdInfoDto2, list4, map3, map4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> component10() {
        return this.geoRestriction;
    }

    @Nullable
    public final Map<String, String> component11() {
        return this.extraInfo;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.retrievedLanguages;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsLive() {
        return this.isLive;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    public final List<ThumbnailDto> component6() {
        return this.thumbnails;
    }

    @Nullable
    public final List<PageDto> component7() {
        return this.pages;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final AdInfoDto getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final BannerAdInfoDto getBannerAdInfo() {
        return this.bannerAdInfo;
    }

    @NotNull
    public final StoryDto copy(@Nullable String id, @Nullable String title, @Nullable String description, @Nullable Boolean isLive, @Nullable Date updateTime, @Nullable List<ThumbnailDto> thumbnails, @Nullable List<PageDto> pages, @Nullable AdInfoDto adInfo, @Nullable BannerAdInfoDto bannerAdInfo, @Nullable List<String> geoRestriction, @Nullable Map<String, String> extraInfo, @Nullable Map<String, String> retrievedLanguages) {
        return new StoryDto(id, title, description, isLive, updateTime, thumbnails, pages, adInfo, bannerAdInfo, geoRestriction, extraInfo, retrievedLanguages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryDto)) {
            return false;
        }
        StoryDto storyDto = (StoryDto) other;
        return Intrinsics.c(this.id, storyDto.id) && Intrinsics.c(this.title, storyDto.title) && Intrinsics.c(this.description, storyDto.description) && Intrinsics.c(this.isLive, storyDto.isLive) && Intrinsics.c(this.updateTime, storyDto.updateTime) && Intrinsics.c(this.thumbnails, storyDto.thumbnails) && Intrinsics.c(this.pages, storyDto.pages) && Intrinsics.c(this.adInfo, storyDto.adInfo) && Intrinsics.c(this.bannerAdInfo, storyDto.bannerAdInfo) && Intrinsics.c(this.geoRestriction, storyDto.geoRestriction) && Intrinsics.c(this.extraInfo, storyDto.extraInfo) && Intrinsics.c(this.retrievedLanguages, storyDto.retrievedLanguages);
    }

    @Nullable
    public final AdInfoDto getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    public final BannerAdInfoDto getBannerAdInfo() {
        return this.bannerAdInfo;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final List<String> getGeoRestriction() {
        return this.geoRestriction;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<PageDto> getPages() {
        return this.pages;
    }

    @Nullable
    public final Map<String, String> getRetrievedLanguages() {
        return this.retrievedLanguages;
    }

    @Nullable
    public final List<ThumbnailDto> getThumbnails() {
        return this.thumbnails;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isLive;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.updateTime;
        int hashCode5 = (hashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        List<ThumbnailDto> list = this.thumbnails;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PageDto> list2 = this.pages;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AdInfoDto adInfoDto = this.adInfo;
        int hashCode8 = (hashCode7 + (adInfoDto == null ? 0 : adInfoDto.hashCode())) * 31;
        BannerAdInfoDto bannerAdInfoDto = this.bannerAdInfo;
        int hashCode9 = (hashCode8 + (bannerAdInfoDto == null ? 0 : bannerAdInfoDto.hashCode())) * 31;
        List<String> list3 = this.geoRestriction;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.retrievedLanguages;
        return hashCode11 + (map2 != null ? map2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLive() {
        return this.isLive;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StoryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isLive=");
        sb.append(this.isLive);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", thumbnails=");
        sb.append(this.thumbnails);
        sb.append(", pages=");
        sb.append(this.pages);
        sb.append(", adInfo=");
        sb.append(this.adInfo);
        sb.append(", bannerAdInfo=");
        sb.append(this.bannerAdInfo);
        sb.append(", geoRestriction=");
        sb.append(this.geoRestriction);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", retrievedLanguages=");
        return dmi.s(sb, this.retrievedLanguages, ')');
    }
}
