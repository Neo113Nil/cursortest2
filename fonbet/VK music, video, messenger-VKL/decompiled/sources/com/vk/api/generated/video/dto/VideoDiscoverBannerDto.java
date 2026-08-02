package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoDiscoverBannerDto.kt */
/* loaded from: classes15.dex */
public final class VideoDiscoverBannerDto implements Parcelable {
    public static final Parcelable.Creator<VideoDiscoverBannerDto> CREATOR = new a();

    @pmi0("action")
    private final VideoDiscoverBannerActionDto action;

    @pmi0("icon")
    private final String icon;

    @pmi0("is_for_meta_channel")
    private final Boolean isForMetaChannel;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("tracking_id")
    private final String trackingId;

    /* compiled from: VideoDiscoverBannerDto.kt */
    public static final class a implements Parcelable.Creator<VideoDiscoverBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverBannerDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Boolean bool = null;
            VideoDiscoverBannerActionDto createFromParcel = parcel.readInt() == 0 ? null : VideoDiscoverBannerActionDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoDiscoverBannerDto(readString, readString2, readString3, createFromParcel, valueOf, readString4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverBannerDto[] newArray(int i) {
            return new VideoDiscoverBannerDto[i];
        }
    }

    public VideoDiscoverBannerDto(String str, String str2, String str3, VideoDiscoverBannerActionDto videoDiscoverBannerActionDto, Integer num, String str4, Boolean bool) {
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
        this.action = videoDiscoverBannerActionDto;
        this.position = num;
        this.trackingId = str4;
        this.isForMetaChannel = bool;
    }

    public final VideoDiscoverBannerActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDiscoverBannerDto)) {
            return false;
        }
        VideoDiscoverBannerDto videoDiscoverBannerDto = (VideoDiscoverBannerDto) obj;
        return epx.f(this.title, videoDiscoverBannerDto.title) && epx.f(this.subtitle, videoDiscoverBannerDto.subtitle) && epx.f(this.icon, videoDiscoverBannerDto.icon) && epx.f(this.action, videoDiscoverBannerDto.action) && epx.f(this.position, videoDiscoverBannerDto.position) && epx.f(this.trackingId, videoDiscoverBannerDto.trackingId) && epx.f(this.isForMetaChannel, videoDiscoverBannerDto.isForMetaChannel);
    }

    public final Integer f() {
        return this.position;
    }

    public final String g() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VideoDiscoverBannerActionDto videoDiscoverBannerActionDto = this.action;
        int hashCode4 = (hashCode3 + (videoDiscoverBannerActionDto == null ? 0 : videoDiscoverBannerActionDto.hashCode())) * 31;
        Integer num = this.position;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.trackingId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isForMetaChannel;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String i() {
        return this.trackingId;
    }

    public final Boolean j() {
        return this.isForMetaChannel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDiscoverBannerDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", trackingId=");
        sb.append(this.trackingId);
        sb.append(", isForMetaChannel=");
        return tn.a(sb, this.isForMetaChannel, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.icon);
        VideoDiscoverBannerActionDto videoDiscoverBannerActionDto = this.action;
        if (videoDiscoverBannerActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDiscoverBannerActionDto.writeToParcel(parcel, i);
        }
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.trackingId);
        Boolean bool = this.isForMetaChannel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ VideoDiscoverBannerDto(String str, String str2, String str3, VideoDiscoverBannerActionDto videoDiscoverBannerActionDto, Integer num, String str4, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : videoDiscoverBannerActionDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : bool);
    }
}
