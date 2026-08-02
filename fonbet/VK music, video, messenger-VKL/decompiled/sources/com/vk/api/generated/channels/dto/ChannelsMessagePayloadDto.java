package com.vk.api.generated.channels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.base.dto.BaseGeoDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ChannelsMessagePayloadDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsMessagePayloadDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsMessagePayloadDto> CREATOR = new a();

    @pmi0("ads_info")
    private final AdsAdvertiserInfoDto adsInfo;

    @pmi0("can_edit")
    private final Boolean canEdit;

    @pmi0("counters")
    private final ChannelsMessageCountersDto counters;

    @pmi0("deleted_details")
    private final String deletedDetails;

    @pmi0("deleted_reason")
    private final String deletedReason;

    @pmi0("donut")
    private final WallWallpostDonutDto donut;

    @pmi0("fake_news")
    private final Boolean fakeNews;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_donut_photos")
    private final Boolean isDonutPhotos;

    @pmi0("marked_as_ads")
    private final Boolean markedAsAds;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("post_type")
    private final String postType;

    @pmi0("publish_date")
    private final Integer publishDate;

    @pmi0("signer_id")
    private final UserId signerId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: ChannelsMessagePayloadDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsMessagePayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsMessagePayloadDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            UserId userId = (UserId) parcel.readParcelable(ChannelsMessagePayloadDto.class.getClassLoader());
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            AdsAdvertiserInfoDto createFromParcel = parcel.readInt() == 0 ? null : AdsAdvertiserInfoDto.CREATOR.createFromParcel(parcel);
            WallWallpostDonutDto createFromParcel2 = parcel.readInt() == 0 ? null : WallWallpostDonutDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BaseGeoDto createFromParcel3 = parcel.readInt() == 0 ? null : BaseGeoDto.CREATOR.createFromParcel(parcel);
            ChannelsMessageCountersDto createFromParcel4 = parcel.readInt() == 0 ? null : ChannelsMessageCountersDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool2 = valueOf3;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChannelsMessagePayloadDto(userId, valueOf, valueOf2, createFromParcel, createFromParcel2, bool2, valueOf4, createFromParcel3, createFromParcel4, valueOf5, readString, bool, parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(ChannelsMessagePayloadDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsMessagePayloadDto[] newArray(int i) {
            return new ChannelsMessagePayloadDto[i];
        }
    }

    public ChannelsMessagePayloadDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsMessagePayloadDto)) {
            return false;
        }
        ChannelsMessagePayloadDto channelsMessagePayloadDto = (ChannelsMessagePayloadDto) obj;
        return epx.f(this.signerId, channelsMessagePayloadDto.signerId) && epx.f(this.canEdit, channelsMessagePayloadDto.canEdit) && epx.f(this.markedAsAds, channelsMessagePayloadDto.markedAsAds) && epx.f(this.adsInfo, channelsMessagePayloadDto.adsInfo) && epx.f(this.donut, channelsMessagePayloadDto.donut) && epx.f(this.isDonutPhotos, channelsMessagePayloadDto.isDonutPhotos) && epx.f(this.fakeNews, channelsMessagePayloadDto.fakeNews) && epx.f(this.geo, channelsMessagePayloadDto.geo) && epx.f(this.counters, channelsMessagePayloadDto.counters) && epx.f(this.publishDate, channelsMessagePayloadDto.publishDate) && epx.f(this.trackCode, channelsMessagePayloadDto.trackCode) && epx.f(this.isDeleted, channelsMessagePayloadDto.isDeleted) && epx.f(this.deletedReason, channelsMessagePayloadDto.deletedReason) && epx.f(this.deletedDetails, channelsMessagePayloadDto.deletedDetails) && epx.f(this.ownerId, channelsMessagePayloadDto.ownerId) && epx.f(this.postType, channelsMessagePayloadDto.postType);
    }

    public final int hashCode() {
        UserId userId = this.signerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Boolean bool = this.canEdit;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.markedAsAds;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.adsInfo;
        int hashCode4 = (hashCode3 + (adsAdvertiserInfoDto == null ? 0 : adsAdvertiserInfoDto.hashCode())) * 31;
        WallWallpostDonutDto wallWallpostDonutDto = this.donut;
        int hashCode5 = (hashCode4 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
        Boolean bool3 = this.isDonutPhotos;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.fakeNews;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode8 = (hashCode7 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        ChannelsMessageCountersDto channelsMessageCountersDto = this.counters;
        int hashCode9 = (hashCode8 + (channelsMessageCountersDto == null ? 0 : channelsMessageCountersDto.hashCode())) * 31;
        Integer num = this.publishDate;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool5 = this.isDeleted;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.deletedReason;
        int hashCode13 = (hashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deletedDetails;
        int hashCode14 = (hashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId2 = this.ownerId;
        int hashCode15 = (hashCode14 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str4 = this.postType;
        return hashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsMessagePayloadDto(signerId=");
        sb.append(this.signerId);
        sb.append(", canEdit=");
        sb.append(this.canEdit);
        sb.append(", markedAsAds=");
        sb.append(this.markedAsAds);
        sb.append(", adsInfo=");
        sb.append(this.adsInfo);
        sb.append(", donut=");
        sb.append(this.donut);
        sb.append(", isDonutPhotos=");
        sb.append(this.isDonutPhotos);
        sb.append(", fakeNews=");
        sb.append(this.fakeNews);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", counters=");
        sb.append(this.counters);
        sb.append(", publishDate=");
        sb.append(this.publishDate);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", deletedReason=");
        sb.append(this.deletedReason);
        sb.append(", deletedDetails=");
        sb.append(this.deletedDetails);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", postType=");
        return ho8.a(sb, this.postType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.signerId, i);
        Boolean bool = this.canEdit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.markedAsAds;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.adsInfo;
        if (adsAdvertiserInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsAdvertiserInfoDto.writeToParcel(parcel, i);
        }
        WallWallpostDonutDto wallWallpostDonutDto = this.donut;
        if (wallWallpostDonutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostDonutDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isDonutPhotos;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.fakeNews;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        BaseGeoDto baseGeoDto = this.geo;
        if (baseGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseGeoDto.writeToParcel(parcel, i);
        }
        ChannelsMessageCountersDto channelsMessageCountersDto = this.counters;
        if (channelsMessageCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageCountersDto.writeToParcel(parcel, i);
        }
        Integer num = this.publishDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.trackCode);
        Boolean bool5 = this.isDeleted;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeString(this.deletedReason);
        parcel.writeString(this.deletedDetails);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.postType);
    }

    public ChannelsMessagePayloadDto(UserId userId, Boolean bool, Boolean bool2, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallWallpostDonutDto wallWallpostDonutDto, Boolean bool3, Boolean bool4, BaseGeoDto baseGeoDto, ChannelsMessageCountersDto channelsMessageCountersDto, Integer num, String str, Boolean bool5, String str2, String str3, UserId userId2, String str4) {
        this.signerId = userId;
        this.canEdit = bool;
        this.markedAsAds = bool2;
        this.adsInfo = adsAdvertiserInfoDto;
        this.donut = wallWallpostDonutDto;
        this.isDonutPhotos = bool3;
        this.fakeNews = bool4;
        this.geo = baseGeoDto;
        this.counters = channelsMessageCountersDto;
        this.publishDate = num;
        this.trackCode = str;
        this.isDeleted = bool5;
        this.deletedReason = str2;
        this.deletedDetails = str3;
        this.ownerId = userId2;
        this.postType = str4;
    }

    public /* synthetic */ ChannelsMessagePayloadDto(UserId userId, Boolean bool, Boolean bool2, AdsAdvertiserInfoDto adsAdvertiserInfoDto, WallWallpostDonutDto wallWallpostDonutDto, Boolean bool3, Boolean bool4, BaseGeoDto baseGeoDto, ChannelsMessageCountersDto channelsMessageCountersDto, Integer num, String str, Boolean bool5, String str2, String str3, UserId userId2, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : adsAdvertiserInfoDto, (i & 16) != 0 ? null : wallWallpostDonutDto, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : baseGeoDto, (i & 256) != 0 ? null : channelsMessageCountersDto, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : bool5, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : userId2, (i & 32768) != 0 ? null : str4);
    }
}
