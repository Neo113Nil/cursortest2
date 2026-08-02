package com.blaze.blazesdk.features.videos.models.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.features.shared.models.shared_models.BaseLayerDto;
import com.blaze.blazesdk.features.shared.models.shared_models.CtaDto;
import com.blaze.blazesdk.features.shared.models.shared_models.PosterDto;
import com.blaze.blazesdk.features.shared.models.shared_models.ThumbnailDto;
import com.blaze.blazesdk.interactions.models.dto.InteractionDto;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\f\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0018\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0013\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0013\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\fHÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u001b\u0010U\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001dHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0003J°\u0002\u0010Z\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0012\b\u0002\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\f2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u0016HÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001b\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001b\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R#\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u001f\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bE\u0010@¨\u0006a"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/dto/VideoDto;", "", "id", "", "title", "subtitle", "description", IronSourceConstants.EVENTS_DURATION, "", "poster", "Lcom/blaze/blazesdk/features/shared/models/shared_models/PosterDto;", "thumbnails", "", "Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;", U3.i.G0, "Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;", "baseLayer", "Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;", "updateTime", "Ljava/util/Date;", "createTime", "likes", "", "interaction", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "closedCaptions", "Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsDto;", "geoRestriction", "extraInfo", "", "adInfo", "Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "streamStatus", "streamStartTime", "retrievedLanguages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/blaze/blazesdk/features/shared/models/shared_models/PosterDto;Ljava/util/List;Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDescription", "getDuration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPoster", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/PosterDto;", "getThumbnails", "()Ljava/util/List;", "getCta", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;", "getBaseLayer", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;", "getUpdateTime", "()Ljava/util/Date;", "getCreateTime", "getLikes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInteraction", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "getClosedCaptions", "getGeoRestriction", "getExtraInfo", "()Ljava/util/Map;", "getAdInfo", "()Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;", "getStreamStatus", "getStreamStartTime", "getRetrievedLanguages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/blaze/blazesdk/features/shared/models/shared_models/PosterDto;Ljava/util/List;Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/dto/AdInfoDto;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)Lcom/blaze/blazesdk/features/videos/models/dto/VideoDto;", "equals", "", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideoDto {
    public static final int $stable = 8;

    @Nullable
    private final AdInfoDto adInfo;

    @Nullable
    private final BaseLayerDto baseLayer;

    @Nullable
    private final List<ClosedCaptionsDto> closedCaptions;

    @Nullable
    private final Date createTime;

    @Nullable
    private final CtaDto cta;

    @Nullable
    private final String description;

    @Nullable
    private final Double duration;

    @Nullable
    private final Map<String, String> extraInfo;

    @Nullable
    private final List<String> geoRestriction;

    @Nullable
    private final String id;

    @Nullable
    private final InteractionDto interaction;

    @Nullable
    private final Integer likes;

    @Nullable
    private final PosterDto poster;

    @Nullable
    private final Map<String, String> retrievedLanguages;

    @Nullable
    private final Date streamStartTime;

    @Nullable
    private final String streamStatus;

    @Nullable
    private final String subtitle;

    @Nullable
    private final List<ThumbnailDto> thumbnails;

    @Nullable
    private final String title;

    @Nullable
    private final Date updateTime;

    public VideoDto(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Double d, @Nullable PosterDto posterDto, @Nullable List<ThumbnailDto> list, @Nullable CtaDto ctaDto, @Nullable BaseLayerDto baseLayerDto, @Nullable Date date, @Nullable Date date2, @Nullable Integer num, @Nullable InteractionDto interactionDto, @Nullable List<ClosedCaptionsDto> list2, @Nullable List<String> list3, @Nullable Map<String, String> map, @Nullable AdInfoDto adInfoDto, @Nullable String str5, @Nullable Date date3, @Nullable Map<String, String> map2) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.duration = d;
        this.poster = posterDto;
        this.thumbnails = list;
        this.cta = ctaDto;
        this.baseLayer = baseLayerDto;
        this.updateTime = date;
        this.createTime = date2;
        this.likes = num;
        this.interaction = interactionDto;
        this.closedCaptions = list2;
        this.geoRestriction = list3;
        this.extraInfo = map;
        this.adInfo = adInfoDto;
        this.streamStatus = str5;
        this.streamStartTime = date3;
        this.retrievedLanguages = map2;
    }

    public static /* synthetic */ VideoDto copy$default(VideoDto videoDto, String str, String str2, String str3, String str4, Double d, PosterDto posterDto, List list, CtaDto ctaDto, BaseLayerDto baseLayerDto, Date date, Date date2, Integer num, InteractionDto interactionDto, List list2, List list3, Map map, AdInfoDto adInfoDto, String str5, Date date3, Map map2, int i, Object obj) {
        Map map3;
        Date date4;
        String str6 = (i & 1) != 0 ? videoDto.id : str;
        String str7 = (i & 2) != 0 ? videoDto.title : str2;
        String str8 = (i & 4) != 0 ? videoDto.subtitle : str3;
        String str9 = (i & 8) != 0 ? videoDto.description : str4;
        Double d2 = (i & 16) != 0 ? videoDto.duration : d;
        PosterDto posterDto2 = (i & 32) != 0 ? videoDto.poster : posterDto;
        List list4 = (i & 64) != 0 ? videoDto.thumbnails : list;
        CtaDto ctaDto2 = (i & 128) != 0 ? videoDto.cta : ctaDto;
        BaseLayerDto baseLayerDto2 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? videoDto.baseLayer : baseLayerDto;
        Date date5 = (i & 512) != 0 ? videoDto.updateTime : date;
        Date date6 = (i & 1024) != 0 ? videoDto.createTime : date2;
        Integer num2 = (i & a.o) != 0 ? videoDto.likes : num;
        InteractionDto interactionDto2 = (i & 4096) != 0 ? videoDto.interaction : interactionDto;
        List list5 = (i & 8192) != 0 ? videoDto.closedCaptions : list2;
        String str10 = str6;
        List list6 = (i & 16384) != 0 ? videoDto.geoRestriction : list3;
        Map map4 = (i & 32768) != 0 ? videoDto.extraInfo : map;
        AdInfoDto adInfoDto2 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? videoDto.adInfo : adInfoDto;
        String str11 = (i & 131072) != 0 ? videoDto.streamStatus : str5;
        Date date7 = (i & 262144) != 0 ? videoDto.streamStartTime : date3;
        if ((i & 524288) != 0) {
            date4 = date7;
            map3 = videoDto.retrievedLanguages;
        } else {
            map3 = map2;
            date4 = date7;
        }
        return videoDto.copy(str10, str7, str8, str9, d2, posterDto2, list4, ctaDto2, baseLayerDto2, date5, date6, num2, interactionDto2, list5, list6, map4, adInfoDto2, str11, date4, map3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Date getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getLikes() {
        return this.likes;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final InteractionDto getInteraction() {
        return this.interaction;
    }

    @Nullable
    public final List<ClosedCaptionsDto> component14() {
        return this.closedCaptions;
    }

    @Nullable
    public final List<String> component15() {
        return this.geoRestriction;
    }

    @Nullable
    public final Map<String, String> component16() {
        return this.extraInfo;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final AdInfoDto getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getStreamStatus() {
        return this.streamStatus;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Date getStreamStartTime() {
        return this.streamStartTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Map<String, String> component20() {
        return this.retrievedLanguages;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final PosterDto getPoster() {
        return this.poster;
    }

    @Nullable
    public final List<ThumbnailDto> component7() {
        return this.thumbnails;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final CtaDto getCta() {
        return this.cta;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final BaseLayerDto getBaseLayer() {
        return this.baseLayer;
    }

    @NotNull
    public final VideoDto copy(@Nullable String id, @Nullable String title, @Nullable String subtitle, @Nullable String description, @Nullable Double duration, @Nullable PosterDto poster, @Nullable List<ThumbnailDto> thumbnails, @Nullable CtaDto cta, @Nullable BaseLayerDto baseLayer, @Nullable Date updateTime, @Nullable Date createTime, @Nullable Integer likes, @Nullable InteractionDto interaction, @Nullable List<ClosedCaptionsDto> closedCaptions, @Nullable List<String> geoRestriction, @Nullable Map<String, String> extraInfo, @Nullable AdInfoDto adInfo, @Nullable String streamStatus, @Nullable Date streamStartTime, @Nullable Map<String, String> retrievedLanguages) {
        return new VideoDto(id, title, subtitle, description, duration, poster, thumbnails, cta, baseLayer, updateTime, createTime, likes, interaction, closedCaptions, geoRestriction, extraInfo, adInfo, streamStatus, streamStartTime, retrievedLanguages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDto)) {
            return false;
        }
        VideoDto videoDto = (VideoDto) other;
        return Intrinsics.c(this.id, videoDto.id) && Intrinsics.c(this.title, videoDto.title) && Intrinsics.c(this.subtitle, videoDto.subtitle) && Intrinsics.c(this.description, videoDto.description) && Intrinsics.c(this.duration, videoDto.duration) && Intrinsics.c(this.poster, videoDto.poster) && Intrinsics.c(this.thumbnails, videoDto.thumbnails) && Intrinsics.c(this.cta, videoDto.cta) && Intrinsics.c(this.baseLayer, videoDto.baseLayer) && Intrinsics.c(this.updateTime, videoDto.updateTime) && Intrinsics.c(this.createTime, videoDto.createTime) && Intrinsics.c(this.likes, videoDto.likes) && Intrinsics.c(this.interaction, videoDto.interaction) && Intrinsics.c(this.closedCaptions, videoDto.closedCaptions) && Intrinsics.c(this.geoRestriction, videoDto.geoRestriction) && Intrinsics.c(this.extraInfo, videoDto.extraInfo) && Intrinsics.c(this.adInfo, videoDto.adInfo) && Intrinsics.c(this.streamStatus, videoDto.streamStatus) && Intrinsics.c(this.streamStartTime, videoDto.streamStartTime) && Intrinsics.c(this.retrievedLanguages, videoDto.retrievedLanguages);
    }

    @Nullable
    public final AdInfoDto getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    public final BaseLayerDto getBaseLayer() {
        return this.baseLayer;
    }

    @Nullable
    public final List<ClosedCaptionsDto> getClosedCaptions() {
        return this.closedCaptions;
    }

    @Nullable
    public final Date getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final CtaDto getCta() {
        return this.cta;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Double getDuration() {
        return this.duration;
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
    public final InteractionDto getInteraction() {
        return this.interaction;
    }

    @Nullable
    public final Integer getLikes() {
        return this.likes;
    }

    @Nullable
    public final PosterDto getPoster() {
        return this.poster;
    }

    @Nullable
    public final Map<String, String> getRetrievedLanguages() {
        return this.retrievedLanguages;
    }

    @Nullable
    public final Date getStreamStartTime() {
        return this.streamStartTime;
    }

    @Nullable
    public final String getStreamStatus() {
        return this.streamStatus;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
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
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.duration;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        PosterDto posterDto = this.poster;
        int hashCode6 = (hashCode5 + (posterDto == null ? 0 : posterDto.hashCode())) * 31;
        List<ThumbnailDto> list = this.thumbnails;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        CtaDto ctaDto = this.cta;
        int hashCode8 = (hashCode7 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
        BaseLayerDto baseLayerDto = this.baseLayer;
        int hashCode9 = (hashCode8 + (baseLayerDto == null ? 0 : baseLayerDto.hashCode())) * 31;
        Date date = this.updateTime;
        int hashCode10 = (hashCode9 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createTime;
        int hashCode11 = (hashCode10 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Integer num = this.likes;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        InteractionDto interactionDto = this.interaction;
        int hashCode13 = (hashCode12 + (interactionDto == null ? 0 : interactionDto.hashCode())) * 31;
        List<ClosedCaptionsDto> list2 = this.closedCaptions;
        int hashCode14 = (hashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.geoRestriction;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        int hashCode16 = (hashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        AdInfoDto adInfoDto = this.adInfo;
        int hashCode17 = (hashCode16 + (adInfoDto == null ? 0 : adInfoDto.hashCode())) * 31;
        String str5 = this.streamStatus;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date3 = this.streamStartTime;
        int hashCode19 = (hashCode18 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Map<String, String> map2 = this.retrievedLanguages;
        return hashCode19 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VideoDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", poster=");
        sb.append(this.poster);
        sb.append(", thumbnails=");
        sb.append(this.thumbnails);
        sb.append(", cta=");
        sb.append(this.cta);
        sb.append(", baseLayer=");
        sb.append(this.baseLayer);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", likes=");
        sb.append(this.likes);
        sb.append(", interaction=");
        sb.append(this.interaction);
        sb.append(", closedCaptions=");
        sb.append(this.closedCaptions);
        sb.append(", geoRestriction=");
        sb.append(this.geoRestriction);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", adInfo=");
        sb.append(this.adInfo);
        sb.append(", streamStatus=");
        sb.append(this.streamStatus);
        sb.append(", streamStartTime=");
        sb.append(this.streamStartTime);
        sb.append(", retrievedLanguages=");
        return dmi.s(sb, this.retrievedLanguages, ')');
    }
}
