package com.vk.api.generated.articles.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.marusia.dto.MarusiaTtsDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ArticlesArticleDto.kt */
/* loaded from: classes14.dex */
public final class ArticlesArticleDto implements Parcelable {
    public static final Parcelable.Creator<ArticlesArticleDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("can_report")
    private final Boolean canReport;

    @pmi0("donut")
    private final ArticlesArticleDonutDto donut;

    @pmi0("donut_level_id")
    private final Integer donutLevelId;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("lead_description")
    private final String leadDescription;

    @pmi0("markdown")
    private final String markdown;

    @pmi0("marusya_tts")
    private final MarusiaTtsDto marusyaTts;

    @pmi0("no_footer")
    private final Boolean noFooter;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("owner_name")
    private final String ownerName;

    @pmi0("owner_photo")
    private final String ownerPhoto;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("published_date")
    private final Integer publishedDate;

    @pmi0("research")
    private final ArticlesMediascopeResearchDto research;

    @pmi0("shares")
    private final Integer shares;

    @pmi0("state")
    private final ArticlesArticleStateDto state;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("time_to_read")
    private final Integer timeToRead;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("view_url")
    private final String viewUrl;

    @pmi0("views")
    private final Integer views;

    @pmi0("wc")
    private final Integer wc;

    /* compiled from: ArticlesArticleDto.kt */
    public static final class a implements Parcelable.Creator<ArticlesArticleDto> {
        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            String str;
            ArticlesMediascopeResearchDto createFromParcel;
            String readString = parcel.readString();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId = (UserId) parcel.readParcelable(ArticlesArticleDto.class.getClassLoader());
            Integer num = valueOf6;
            Boolean bool = valueOf;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            PhotosPhotoDto createFromParcel2 = parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel);
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArticlesArticleStateDto createFromParcel3 = parcel.readInt() == 0 ? null : ArticlesArticleStateDto.CREATOR.createFromParcel(parcel);
            ArticlesArticleDonutDto createFromParcel4 = parcel.readInt() == 0 ? null : ArticlesArticleDonutDto.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            Integer num2 = valueOf7;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z = false;
            String readString7 = parcel.readString();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MarusiaTtsDto createFromParcel5 = parcel.readInt() == 0 ? null : MarusiaTtsDto.CREATOR.createFromParcel(parcel);
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf5 = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
                str = readString;
            } else {
                str = readString;
                createFromParcel = ArticlesMediascopeResearchDto.CREATOR.createFromParcel(parcel);
            }
            return new ArticlesArticleDto(str, num, bool, userId, readString2, readString3, createFromParcel2, num2, createFromParcel3, createFromParcel4, readString4, readString5, readString6, readString7, valueOf8, valueOf9, readString8, valueOf2, valueOf3, createFromParcel5, valueOf10, valueOf11, valueOf12, readString9, valueOf4, valueOf5, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ArticlesArticleDto[] newArray(int i) {
            return new ArticlesArticleDto[i];
        }
    }

    public ArticlesArticleDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }

    public final Integer B() {
        return this.timeToRead;
    }

    public final String C() {
        return this.viewUrl;
    }

    public final Integer D() {
        return this.views;
    }

    public final Boolean F() {
        return this.isFavorite;
    }

    public final String M0() {
        return this.ownerPhoto;
    }

    public final String P() {
        return this.ownerName;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canEdit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticlesArticleDto)) {
            return false;
        }
        ArticlesArticleDto articlesArticleDto = (ArticlesArticleDto) obj;
        return epx.f(this.accessKey, articlesArticleDto.accessKey) && epx.f(this.id, articlesArticleDto.id) && epx.f(this.isFavorite, articlesArticleDto.isFavorite) && epx.f(this.ownerId, articlesArticleDto.ownerId) && epx.f(this.ownerName, articlesArticleDto.ownerName) && epx.f(this.ownerPhoto, articlesArticleDto.ownerPhoto) && epx.f(this.photo, articlesArticleDto.photo) && epx.f(this.publishedDate, articlesArticleDto.publishedDate) && this.state == articlesArticleDto.state && epx.f(this.donut, articlesArticleDto.donut) && epx.f(this.subtitle, articlesArticleDto.subtitle) && epx.f(this.title, articlesArticleDto.title) && epx.f(this.url, articlesArticleDto.url) && epx.f(this.viewUrl, articlesArticleDto.viewUrl) && epx.f(this.views, articlesArticleDto.views) && epx.f(this.shares, articlesArticleDto.shares) && epx.f(this.markdown, articlesArticleDto.markdown) && epx.f(this.canReport, articlesArticleDto.canReport) && epx.f(this.noFooter, articlesArticleDto.noFooter) && epx.f(this.marusyaTts, articlesArticleDto.marusyaTts) && epx.f(this.donutLevelId, articlesArticleDto.donutLevelId) && epx.f(this.wc, articlesArticleDto.wc) && epx.f(this.timeToRead, articlesArticleDto.timeToRead) && epx.f(this.leadDescription, articlesArticleDto.leadDescription) && epx.f(this.canEdit, articlesArticleDto.canEdit) && epx.f(this.isPinned, articlesArticleDto.isPinned) && epx.f(this.research, articlesArticleDto.research);
    }

    public final Boolean f() {
        return this.canReport;
    }

    public final ArticlesArticleDonutDto g() {
        return this.donut;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.accessKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.ownerName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownerPhoto;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode7 = (hashCode6 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Integer num2 = this.publishedDate;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArticlesArticleStateDto articlesArticleStateDto = this.state;
        int hashCode9 = (hashCode8 + (articlesArticleStateDto == null ? 0 : articlesArticleStateDto.hashCode())) * 31;
        ArticlesArticleDonutDto articlesArticleDonutDto = this.donut;
        int hashCode10 = (hashCode9 + (articlesArticleDonutDto == null ? 0 : articlesArticleDonutDto.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.viewUrl;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.views;
        int hashCode15 = (hashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.shares;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.markdown;
        int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.canReport;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.noFooter;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MarusiaTtsDto marusiaTtsDto = this.marusyaTts;
        int hashCode20 = (hashCode19 + (marusiaTtsDto == null ? 0 : marusiaTtsDto.hashCode())) * 31;
        Integer num5 = this.donutLevelId;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.wc;
        int hashCode22 = (hashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.timeToRead;
        int hashCode23 = (hashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str9 = this.leadDescription;
        int hashCode24 = (hashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool4 = this.canEdit;
        int hashCode25 = (hashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isPinned;
        int hashCode26 = (hashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ArticlesMediascopeResearchDto articlesMediascopeResearchDto = this.research;
        return hashCode26 + (articlesMediascopeResearchDto != null ? articlesMediascopeResearchDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.id;
    }

    public final String j() {
        return this.leadDescription;
    }

    public final MarusiaTtsDto k() {
        return this.marusyaTts;
    }

    public final Boolean l() {
        return this.noFooter;
    }

    public final PhotosPhotoDto n() {
        return this.photo;
    }

    public final Integer o() {
        return this.publishedDate;
    }

    public final ArticlesArticleStateDto p() {
        return this.state;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        return "ArticlesArticleDto(accessKey=" + this.accessKey + ", id=" + this.id + ", isFavorite=" + this.isFavorite + ", ownerId=" + this.ownerId + ", ownerName=" + this.ownerName + ", ownerPhoto=" + this.ownerPhoto + ", photo=" + this.photo + ", publishedDate=" + this.publishedDate + ", state=" + this.state + ", donut=" + this.donut + ", subtitle=" + this.subtitle + ", title=" + this.title + ", url=" + this.url + ", viewUrl=" + this.viewUrl + ", views=" + this.views + ", shares=" + this.shares + ", markdown=" + this.markdown + ", canReport=" + this.canReport + ", noFooter=" + this.noFooter + ", marusyaTts=" + this.marusyaTts + ", donutLevelId=" + this.donutLevelId + ", wc=" + this.wc + ", timeToRead=" + this.timeToRead + ", leadDescription=" + this.leadDescription + ", canEdit=" + this.canEdit + ", isPinned=" + this.isPinned + ", research=" + this.research + ')';
    }

    public final String u() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessKey);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.ownerPhoto);
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.publishedDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        ArticlesArticleStateDto articlesArticleStateDto = this.state;
        if (articlesArticleStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articlesArticleStateDto.writeToParcel(parcel, i);
        }
        ArticlesArticleDonutDto articlesArticleDonutDto = this.donut;
        if (articlesArticleDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articlesArticleDonutDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.viewUrl);
        Integer num3 = this.views;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.shares;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.markdown);
        Boolean bool2 = this.canReport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.noFooter;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        MarusiaTtsDto marusiaTtsDto = this.marusyaTts;
        if (marusiaTtsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marusiaTtsDto.writeToParcel(parcel, i);
        }
        Integer num5 = this.donutLevelId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.wc;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.timeToRead;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.leadDescription);
        Boolean bool4 = this.canEdit;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isPinned;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        ArticlesMediascopeResearchDto articlesMediascopeResearchDto = this.research;
        if (articlesMediascopeResearchDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articlesMediascopeResearchDto.writeToParcel(parcel, i);
        }
    }

    public ArticlesArticleDto(String str, Integer num, Boolean bool, UserId userId, String str2, String str3, PhotosPhotoDto photosPhotoDto, Integer num2, ArticlesArticleStateDto articlesArticleStateDto, ArticlesArticleDonutDto articlesArticleDonutDto, String str4, String str5, String str6, String str7, Integer num3, Integer num4, String str8, Boolean bool2, Boolean bool3, MarusiaTtsDto marusiaTtsDto, Integer num5, Integer num6, Integer num7, String str9, Boolean bool4, Boolean bool5, ArticlesMediascopeResearchDto articlesMediascopeResearchDto) {
        this.accessKey = str;
        this.id = num;
        this.isFavorite = bool;
        this.ownerId = userId;
        this.ownerName = str2;
        this.ownerPhoto = str3;
        this.photo = photosPhotoDto;
        this.publishedDate = num2;
        this.state = articlesArticleStateDto;
        this.donut = articlesArticleDonutDto;
        this.subtitle = str4;
        this.title = str5;
        this.url = str6;
        this.viewUrl = str7;
        this.views = num3;
        this.shares = num4;
        this.markdown = str8;
        this.canReport = bool2;
        this.noFooter = bool3;
        this.marusyaTts = marusiaTtsDto;
        this.donutLevelId = num5;
        this.wc = num6;
        this.timeToRead = num7;
        this.leadDescription = str9;
        this.canEdit = bool4;
        this.isPinned = bool5;
        this.research = articlesMediascopeResearchDto;
    }

    public /* synthetic */ ArticlesArticleDto(String str, Integer num, Boolean bool, UserId userId, String str2, String str3, PhotosPhotoDto photosPhotoDto, Integer num2, ArticlesArticleStateDto articlesArticleStateDto, ArticlesArticleDonutDto articlesArticleDonutDto, String str4, String str5, String str6, String str7, Integer num3, Integer num4, String str8, Boolean bool2, Boolean bool3, MarusiaTtsDto marusiaTtsDto, Integer num5, Integer num6, Integer num7, String str9, Boolean bool4, Boolean bool5, ArticlesMediascopeResearchDto articlesMediascopeResearchDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : photosPhotoDto, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : articlesArticleStateDto, (i & 512) != 0 ? null : articlesArticleDonutDto, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : str8, (i & 131072) != 0 ? null : bool2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool3, (i & 524288) != 0 ? null : marusiaTtsDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num5, (i & 2097152) != 0 ? null : num6, (i & 4194304) != 0 ? null : num7, (i & 8388608) != 0 ? null : str9, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool4, (i & 33554432) != 0 ? null : bool5, (i & 67108864) != 0 ? null : articlesMediascopeResearchDto);
    }
}
