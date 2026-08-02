package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppBookmarkItemDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaItemExtendedDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: FaveBookmarkDto.kt */
/* loaded from: classes14.dex */
public final class FaveBookmarkDto implements Parcelable {
    public static final Parcelable.Creator<FaveBookmarkDto> CREATOR = new a();

    @pmi0("added_date")
    private final int addedDate;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppBookmarkItemDto f73app;

    @pmi0("article")
    private final ArticlesArticleDto article;

    @pmi0("clip")
    private final VideoVideoFullDto clip;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("narrative")
    private final NarrativesNarrativeDto narrative;

    @pmi0("podcast")
    private final AudioAudioDto podcast;

    @pmi0("post")
    private final WallWallpostFullDto post;

    @pmi0("product")
    private final MarketMarketItemFullDto product;

    @pmi0("product_extras")
    private final FaveBookmarkProductExtrasDto productExtras;

    @pmi0("seen")
    private final boolean seen;

    @pmi0("tags")
    private final List<FaveTagDto> tags;

    @pmi0("type")
    private final FaveBookmarkTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("youla_product")
    private final ClassifiedsYoulaItemExtendedDto youlaProduct;

    /* compiled from: FaveBookmarkDto.kt */
    public static final class a implements Parcelable.Creator<FaveBookmarkDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveBookmarkDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            int i = 0;
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(FaveTagDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new FaveBookmarkDto(readInt, z, arrayList, FaveBookmarkTypeDto.CREATOR.createFromParcel(parcel), (ArticlesArticleDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), (VideoVideoFullDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), (BaseLinkDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), (NarrativesNarrativeDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), (AudioAudioDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), parcel.readInt() == 0 ? null : WallWallpostFullDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketMarketItemFullDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FaveBookmarkProductExtrasDto.CREATOR.createFromParcel(parcel), (VideoVideoFullDto) parcel.readParcelable(FaveBookmarkDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ClassifiedsYoulaItemExtendedDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAppBookmarkItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveBookmarkDto[] newArray(int i) {
            return new FaveBookmarkDto[i];
        }
    }

    public FaveBookmarkDto(int i, boolean z, List<FaveTagDto> list, FaveBookmarkTypeDto faveBookmarkTypeDto, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, BaseLinkDto baseLinkDto, NarrativesNarrativeDto narrativesNarrativeDto, AudioAudioDto audioAudioDto, WallWallpostFullDto wallWallpostFullDto, MarketMarketItemFullDto marketMarketItemFullDto, FaveBookmarkProductExtrasDto faveBookmarkProductExtrasDto, VideoVideoFullDto videoVideoFullDto2, ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto, AppsAppBookmarkItemDto appsAppBookmarkItemDto) {
        this.addedDate = i;
        this.seen = z;
        this.tags = list;
        this.type = faveBookmarkTypeDto;
        this.article = articlesArticleDto;
        this.clip = videoVideoFullDto;
        this.link = baseLinkDto;
        this.narrative = narrativesNarrativeDto;
        this.podcast = audioAudioDto;
        this.post = wallWallpostFullDto;
        this.product = marketMarketItemFullDto;
        this.productExtras = faveBookmarkProductExtrasDto;
        this.video = videoVideoFullDto2;
        this.youlaProduct = classifiedsYoulaItemExtendedDto;
        this.f73app = appsAppBookmarkItemDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveBookmarkDto)) {
            return false;
        }
        FaveBookmarkDto faveBookmarkDto = (FaveBookmarkDto) obj;
        return this.addedDate == faveBookmarkDto.addedDate && this.seen == faveBookmarkDto.seen && epx.f(this.tags, faveBookmarkDto.tags) && this.type == faveBookmarkDto.type && epx.f(this.article, faveBookmarkDto.article) && epx.f(this.clip, faveBookmarkDto.clip) && epx.f(this.link, faveBookmarkDto.link) && epx.f(this.narrative, faveBookmarkDto.narrative) && epx.f(this.podcast, faveBookmarkDto.podcast) && epx.f(this.post, faveBookmarkDto.post) && epx.f(this.product, faveBookmarkDto.product) && epx.f(this.productExtras, faveBookmarkDto.productExtras) && epx.f(this.video, faveBookmarkDto.video) && epx.f(this.youlaProduct, faveBookmarkDto.youlaProduct) && epx.f(this.f73app, faveBookmarkDto.f73app);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + fw3.a(qoy.b(Integer.hashCode(this.addedDate) * 31, 31, this.seen), 31, this.tags)) * 31;
        ArticlesArticleDto articlesArticleDto = this.article;
        int hashCode2 = (hashCode + (articlesArticleDto == null ? 0 : articlesArticleDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.clip;
        int hashCode3 = (hashCode2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode4 = (hashCode3 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        NarrativesNarrativeDto narrativesNarrativeDto = this.narrative;
        int hashCode5 = (hashCode4 + (narrativesNarrativeDto == null ? 0 : narrativesNarrativeDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.podcast;
        int hashCode6 = (hashCode5 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        WallWallpostFullDto wallWallpostFullDto = this.post;
        int hashCode7 = (hashCode6 + (wallWallpostFullDto == null ? 0 : wallWallpostFullDto.hashCode())) * 31;
        MarketMarketItemFullDto marketMarketItemFullDto = this.product;
        int hashCode8 = (hashCode7 + (marketMarketItemFullDto == null ? 0 : marketMarketItemFullDto.hashCode())) * 31;
        FaveBookmarkProductExtrasDto faveBookmarkProductExtrasDto = this.productExtras;
        int hashCode9 = (hashCode8 + (faveBookmarkProductExtrasDto == null ? 0 : faveBookmarkProductExtrasDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto2 = this.video;
        int hashCode10 = (hashCode9 + (videoVideoFullDto2 == null ? 0 : videoVideoFullDto2.hashCode())) * 31;
        ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto = this.youlaProduct;
        int hashCode11 = (hashCode10 + (classifiedsYoulaItemExtendedDto == null ? 0 : classifiedsYoulaItemExtendedDto.hashCode())) * 31;
        AppsAppBookmarkItemDto appsAppBookmarkItemDto = this.f73app;
        return hashCode11 + (appsAppBookmarkItemDto != null ? appsAppBookmarkItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "FaveBookmarkDto(addedDate=" + this.addedDate + ", seen=" + this.seen + ", tags=" + this.tags + ", type=" + this.type + ", article=" + this.article + ", clip=" + this.clip + ", link=" + this.link + ", narrative=" + this.narrative + ", podcast=" + this.podcast + ", post=" + this.post + ", product=" + this.product + ", productExtras=" + this.productExtras + ", video=" + this.video + ", youlaProduct=" + this.youlaProduct + ", app=" + this.f73app + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.addedDate);
        parcel.writeInt(this.seen ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.tags);
        while (a2.hasNext()) {
            ((FaveTagDto) a2.next()).writeToParcel(parcel, i);
        }
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.article, i);
        parcel.writeParcelable(this.clip, i);
        parcel.writeParcelable(this.link, i);
        parcel.writeParcelable(this.narrative, i);
        parcel.writeParcelable(this.podcast, i);
        WallWallpostFullDto wallWallpostFullDto = this.post;
        if (wallWallpostFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostFullDto.writeToParcel(parcel, i);
        }
        MarketMarketItemFullDto marketMarketItemFullDto = this.product;
        if (marketMarketItemFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemFullDto.writeToParcel(parcel, i);
        }
        FaveBookmarkProductExtrasDto faveBookmarkProductExtrasDto = this.productExtras;
        if (faveBookmarkProductExtrasDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            faveBookmarkProductExtrasDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.video, i);
        ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto = this.youlaProduct;
        if (classifiedsYoulaItemExtendedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaItemExtendedDto.writeToParcel(parcel, i);
        }
        AppsAppBookmarkItemDto appsAppBookmarkItemDto = this.f73app;
        if (appsAppBookmarkItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppBookmarkItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FaveBookmarkDto(int i, boolean z, List list, FaveBookmarkTypeDto faveBookmarkTypeDto, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, BaseLinkDto baseLinkDto, NarrativesNarrativeDto narrativesNarrativeDto, AudioAudioDto audioAudioDto, WallWallpostFullDto wallWallpostFullDto, MarketMarketItemFullDto marketMarketItemFullDto, FaveBookmarkProductExtrasDto faveBookmarkProductExtrasDto, VideoVideoFullDto videoVideoFullDto2, ClassifiedsYoulaItemExtendedDto classifiedsYoulaItemExtendedDto, AppsAppBookmarkItemDto appsAppBookmarkItemDto, int i2, zcl zclVar) {
        this(i, z, list, faveBookmarkTypeDto, (i2 & 16) != 0 ? null : articlesArticleDto, (i2 & 32) != 0 ? null : videoVideoFullDto, (i2 & 64) != 0 ? null : baseLinkDto, (i2 & 128) != 0 ? null : narrativesNarrativeDto, (i2 & 256) != 0 ? null : audioAudioDto, (i2 & 512) != 0 ? null : wallWallpostFullDto, (i2 & 1024) != 0 ? null : marketMarketItemFullDto, (i2 & 2048) != 0 ? null : faveBookmarkProductExtrasDto, (i2 & 4096) != 0 ? null : videoVideoFullDto2, (i2 & 8192) != 0 ? null : classifiedsYoulaItemExtendedDto, (i2 & 16384) != 0 ? null : appsAppBookmarkItemDto);
    }
}
