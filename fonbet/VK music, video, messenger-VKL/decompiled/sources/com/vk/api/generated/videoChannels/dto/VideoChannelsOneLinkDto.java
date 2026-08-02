package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoChannelsOneLinkDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsOneLinkDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsOneLinkDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("link_id")
    private final int linkId;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoChannelsOneLinkDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsOneLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsOneLinkDto createFromParcel(Parcel parcel) {
            return new VideoChannelsOneLinkDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsOneLinkDto[] newArray(int i) {
            return new VideoChannelsOneLinkDto[i];
        }
    }

    public VideoChannelsOneLinkDto(int i, String str, String str2, String str3, String str4) {
        this.linkId = i;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.icon = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsOneLinkDto)) {
            return false;
        }
        VideoChannelsOneLinkDto videoChannelsOneLinkDto = (VideoChannelsOneLinkDto) obj;
        return this.linkId == videoChannelsOneLinkDto.linkId && epx.f(this.title, videoChannelsOneLinkDto.title) && epx.f(this.subtitle, videoChannelsOneLinkDto.subtitle) && epx.f(this.url, videoChannelsOneLinkDto.url) && epx.f(this.icon, videoChannelsOneLinkDto.icon);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(Integer.hashCode(this.linkId) * 31, 31, this.title), 31, this.subtitle), 31, this.url);
        String str = this.icon;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsOneLinkDto(linkId=");
        sb.append(this.linkId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", icon=");
        return ho8.a(sb, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.linkId);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.url);
        parcel.writeString(this.icon);
    }

    public /* synthetic */ VideoChannelsOneLinkDto(int i, String str, String str2, String str3, String str4, int i2, zcl zclVar) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? null : str4);
    }
}
