package com.blaze.blazesdk.features.stories.models.dto;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.features.shared.models.shared_models.BaseLayerDto;
import com.blaze.blazesdk.features.shared.models.shared_models.CtaDto;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b:\b\u0081\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010(J\u0010\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0013\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010M\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001cHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\u0017\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0003Jþ\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0012\b\u0002\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0006HÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\t\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001b\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b9\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R#\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b=\u0010*R\u001f\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<¨\u0006V"}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/dto/PageDto;", "", "id", "", "type", "index", "", IronSourceConstants.EVENTS_DURATION, "", "isSkippable", "", "thumbnail", "Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;", U3.i.G0, "Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;", "updateTime", "Ljava/util/Date;", "createTime", "baseLayer", "Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;", "interaction", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "closedCaptions", "", "Lcom/blaze/blazesdk/closed_captions/models/dto/ClosedCaptionsDto;", "ignoreReadStatusForStory", "parentStoryId", "extraInfo", "", "shouldShowBannerAd", "retrievedLanguages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;Ljava/util/Date;Ljava/util/Date;Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getType", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDuration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThumbnail", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;", "getCta", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;", "getUpdateTime", "()Ljava/util/Date;", "getCreateTime", "getBaseLayer", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;", "getInteraction", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;", "getClosedCaptions", "()Ljava/util/List;", "getIgnoreReadStatusForStory", "getParentStoryId", "getExtraInfo", "()Ljava/util/Map;", "getShouldShowBannerAd", "getRetrievedLanguages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Boolean;Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;Lcom/blaze/blazesdk/features/shared/models/shared_models/CtaDto;Ljava/util/Date;Ljava/util/Date;Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;Lcom/blaze/blazesdk/interactions/models/dto/InteractionDto;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/blaze/blazesdk/features/stories/models/dto/PageDto;", "equals", "other", "hashCode", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PageDto {
    public static final int $stable = 8;

    @Nullable
    private final BaseLayerDto baseLayer;

    @Nullable
    private final List<ClosedCaptionsDto> closedCaptions;

    @Nullable
    private final Date createTime;

    @Nullable
    private final CtaDto cta;

    @Nullable
    private final Double duration;

    @Nullable
    private final Map<String, String> extraInfo;

    @Nullable
    private final String id;

    @Nullable
    private final Boolean ignoreReadStatusForStory;

    @Nullable
    private final Integer index;

    @Nullable
    private final InteractionDto interaction;

    @Nullable
    private final Boolean isSkippable;

    @Nullable
    private final String parentStoryId;

    @Nullable
    private final Map<String, String> retrievedLanguages;

    @Nullable
    private final Boolean shouldShowBannerAd;

    @Nullable
    private final ThumbnailDto thumbnail;

    @Nullable
    private final String type;

    @Nullable
    private final Date updateTime;

    public PageDto(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Double d, @Nullable Boolean bool, @Nullable ThumbnailDto thumbnailDto, @Nullable CtaDto ctaDto, @Nullable Date date, @Nullable Date date2, @Nullable BaseLayerDto baseLayerDto, @Nullable InteractionDto interactionDto, @Nullable List<ClosedCaptionsDto> list, @Nullable Boolean bool2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable Boolean bool3, @Nullable Map<String, String> map2) {
        this.id = str;
        this.type = str2;
        this.index = num;
        this.duration = d;
        this.isSkippable = bool;
        this.thumbnail = thumbnailDto;
        this.cta = ctaDto;
        this.updateTime = date;
        this.createTime = date2;
        this.baseLayer = baseLayerDto;
        this.interaction = interactionDto;
        this.closedCaptions = list;
        this.ignoreReadStatusForStory = bool2;
        this.parentStoryId = str3;
        this.extraInfo = map;
        this.shouldShowBannerAd = bool3;
        this.retrievedLanguages = map2;
    }

    public static /* synthetic */ PageDto copy$default(PageDto pageDto, String str, String str2, Integer num, Double d, Boolean bool, ThumbnailDto thumbnailDto, CtaDto ctaDto, Date date, Date date2, BaseLayerDto baseLayerDto, InteractionDto interactionDto, List list, Boolean bool2, String str3, Map map, Boolean bool3, Map map2, int i, Object obj) {
        Map map3;
        Boolean bool4;
        String str4;
        PageDto pageDto2;
        Map map4;
        String str5;
        Integer num2;
        Double d2;
        Boolean bool5;
        ThumbnailDto thumbnailDto2;
        CtaDto ctaDto2;
        Date date3;
        Date date4;
        BaseLayerDto baseLayerDto2;
        InteractionDto interactionDto2;
        List list2;
        Boolean bool6;
        String str6;
        String str7 = (i & 1) != 0 ? pageDto.id : str;
        String str8 = (i & 2) != 0 ? pageDto.type : str2;
        Integer num3 = (i & 4) != 0 ? pageDto.index : num;
        Double d3 = (i & 8) != 0 ? pageDto.duration : d;
        Boolean bool7 = (i & 16) != 0 ? pageDto.isSkippable : bool;
        ThumbnailDto thumbnailDto3 = (i & 32) != 0 ? pageDto.thumbnail : thumbnailDto;
        CtaDto ctaDto3 = (i & 64) != 0 ? pageDto.cta : ctaDto;
        Date date5 = (i & 128) != 0 ? pageDto.updateTime : date;
        Date date6 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? pageDto.createTime : date2;
        BaseLayerDto baseLayerDto3 = (i & 512) != 0 ? pageDto.baseLayer : baseLayerDto;
        InteractionDto interactionDto3 = (i & 1024) != 0 ? pageDto.interaction : interactionDto;
        List list3 = (i & a.o) != 0 ? pageDto.closedCaptions : list;
        Boolean bool8 = (i & 4096) != 0 ? pageDto.ignoreReadStatusForStory : bool2;
        String str9 = (i & 8192) != 0 ? pageDto.parentStoryId : str3;
        String str10 = str7;
        Map map5 = (i & 16384) != 0 ? pageDto.extraInfo : map;
        Boolean bool9 = (i & 32768) != 0 ? pageDto.shouldShowBannerAd : bool3;
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            bool4 = bool9;
            map3 = pageDto.retrievedLanguages;
            map4 = map5;
            str5 = str8;
            num2 = num3;
            d2 = d3;
            bool5 = bool7;
            thumbnailDto2 = thumbnailDto3;
            ctaDto2 = ctaDto3;
            date3 = date5;
            date4 = date6;
            baseLayerDto2 = baseLayerDto3;
            interactionDto2 = interactionDto3;
            list2 = list3;
            bool6 = bool8;
            str6 = str9;
            str4 = str10;
            pageDto2 = pageDto;
        } else {
            map3 = map2;
            bool4 = bool9;
            str4 = str10;
            pageDto2 = pageDto;
            map4 = map5;
            str5 = str8;
            num2 = num3;
            d2 = d3;
            bool5 = bool7;
            thumbnailDto2 = thumbnailDto3;
            ctaDto2 = ctaDto3;
            date3 = date5;
            date4 = date6;
            baseLayerDto2 = baseLayerDto3;
            interactionDto2 = interactionDto3;
            list2 = list3;
            bool6 = bool8;
            str6 = str9;
        }
        return pageDto2.copy(str4, str5, num2, d2, bool5, thumbnailDto2, ctaDto2, date3, date4, baseLayerDto2, interactionDto2, list2, bool6, str6, map4, bool4, map3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final BaseLayerDto getBaseLayer() {
        return this.baseLayer;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final InteractionDto getInteraction() {
        return this.interaction;
    }

    @Nullable
    public final List<ClosedCaptionsDto> component12() {
        return this.closedCaptions;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Boolean getIgnoreReadStatusForStory() {
        return this.ignoreReadStatusForStory;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getParentStoryId() {
        return this.parentStoryId;
    }

    @Nullable
    public final Map<String, String> component15() {
        return this.extraInfo;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getShouldShowBannerAd() {
        return this.shouldShowBannerAd;
    }

    @Nullable
    public final Map<String, String> component17() {
        return this.retrievedLanguages;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsSkippable() {
        return this.isSkippable;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ThumbnailDto getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final CtaDto getCta() {
        return this.cta;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Date getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final PageDto copy(@Nullable String id, @Nullable String type, @Nullable Integer index, @Nullable Double duration, @Nullable Boolean isSkippable, @Nullable ThumbnailDto thumbnail, @Nullable CtaDto cta, @Nullable Date updateTime, @Nullable Date createTime, @Nullable BaseLayerDto baseLayer, @Nullable InteractionDto interaction, @Nullable List<ClosedCaptionsDto> closedCaptions, @Nullable Boolean ignoreReadStatusForStory, @Nullable String parentStoryId, @Nullable Map<String, String> extraInfo, @Nullable Boolean shouldShowBannerAd, @Nullable Map<String, String> retrievedLanguages) {
        return new PageDto(id, type, index, duration, isSkippable, thumbnail, cta, updateTime, createTime, baseLayer, interaction, closedCaptions, ignoreReadStatusForStory, parentStoryId, extraInfo, shouldShowBannerAd, retrievedLanguages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageDto)) {
            return false;
        }
        PageDto pageDto = (PageDto) other;
        return Intrinsics.c(this.id, pageDto.id) && Intrinsics.c(this.type, pageDto.type) && Intrinsics.c(this.index, pageDto.index) && Intrinsics.c(this.duration, pageDto.duration) && Intrinsics.c(this.isSkippable, pageDto.isSkippable) && Intrinsics.c(this.thumbnail, pageDto.thumbnail) && Intrinsics.c(this.cta, pageDto.cta) && Intrinsics.c(this.updateTime, pageDto.updateTime) && Intrinsics.c(this.createTime, pageDto.createTime) && Intrinsics.c(this.baseLayer, pageDto.baseLayer) && Intrinsics.c(this.interaction, pageDto.interaction) && Intrinsics.c(this.closedCaptions, pageDto.closedCaptions) && Intrinsics.c(this.ignoreReadStatusForStory, pageDto.ignoreReadStatusForStory) && Intrinsics.c(this.parentStoryId, pageDto.parentStoryId) && Intrinsics.c(this.extraInfo, pageDto.extraInfo) && Intrinsics.c(this.shouldShowBannerAd, pageDto.shouldShowBannerAd) && Intrinsics.c(this.retrievedLanguages, pageDto.retrievedLanguages);
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
    public final Double getDuration() {
        return this.duration;
    }

    @Nullable
    public final Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getIgnoreReadStatusForStory() {
        return this.ignoreReadStatusForStory;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final InteractionDto getInteraction() {
        return this.interaction;
    }

    @Nullable
    public final String getParentStoryId() {
        return this.parentStoryId;
    }

    @Nullable
    public final Map<String, String> getRetrievedLanguages() {
        return this.retrievedLanguages;
    }

    @Nullable
    public final Boolean getShouldShowBannerAd() {
        return this.shouldShowBannerAd;
    }

    @Nullable
    public final ThumbnailDto getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Date getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.index;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.duration;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isSkippable;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        ThumbnailDto thumbnailDto = this.thumbnail;
        int hashCode6 = (hashCode5 + (thumbnailDto == null ? 0 : thumbnailDto.hashCode())) * 31;
        CtaDto ctaDto = this.cta;
        int hashCode7 = (hashCode6 + (ctaDto == null ? 0 : ctaDto.hashCode())) * 31;
        Date date = this.updateTime;
        int hashCode8 = (hashCode7 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createTime;
        int hashCode9 = (hashCode8 + (date2 == null ? 0 : date2.hashCode())) * 31;
        BaseLayerDto baseLayerDto = this.baseLayer;
        int hashCode10 = (hashCode9 + (baseLayerDto == null ? 0 : baseLayerDto.hashCode())) * 31;
        InteractionDto interactionDto = this.interaction;
        int hashCode11 = (hashCode10 + (interactionDto == null ? 0 : interactionDto.hashCode())) * 31;
        List<ClosedCaptionsDto> list = this.closedCaptions;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.ignoreReadStatusForStory;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.parentStoryId;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool3 = this.shouldShowBannerAd;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Map<String, String> map2 = this.retrievedLanguages;
        return hashCode16 + (map2 != null ? map2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSkippable() {
        return this.isSkippable;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PageDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", isSkippable=");
        sb.append(this.isSkippable);
        sb.append(", thumbnail=");
        sb.append(this.thumbnail);
        sb.append(", cta=");
        sb.append(this.cta);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", baseLayer=");
        sb.append(this.baseLayer);
        sb.append(", interaction=");
        sb.append(this.interaction);
        sb.append(", closedCaptions=");
        sb.append(this.closedCaptions);
        sb.append(", ignoreReadStatusForStory=");
        sb.append(this.ignoreReadStatusForStory);
        sb.append(", parentStoryId=");
        sb.append(this.parentStoryId);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", shouldShowBannerAd=");
        sb.append(this.shouldShowBannerAd);
        sb.append(", retrievedLanguages=");
        return dmi.s(sb, this.retrievedLanguages, ')');
    }
}
