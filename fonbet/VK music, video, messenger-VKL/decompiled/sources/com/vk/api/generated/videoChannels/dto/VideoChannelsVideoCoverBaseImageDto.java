package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoChannelsVideoCoverBaseImageDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsVideoCoverBaseImageDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsVideoCoverBaseImageDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final String id;

    @pmi0("is_base")
    private final Boolean isBase;

    @pmi0("theme")
    private final String theme;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: VideoChannelsVideoCoverBaseImageDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsVideoCoverBaseImageDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsVideoCoverBaseImageDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoChannelsVideoCoverBaseImageDto(readString, readString2, valueOf, valueOf2, readString3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsVideoCoverBaseImageDto[] newArray(int i) {
            return new VideoChannelsVideoCoverBaseImageDto[i];
        }
    }

    public VideoChannelsVideoCoverBaseImageDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsVideoCoverBaseImageDto)) {
            return false;
        }
        VideoChannelsVideoCoverBaseImageDto videoChannelsVideoCoverBaseImageDto = (VideoChannelsVideoCoverBaseImageDto) obj;
        return epx.f(this.id, videoChannelsVideoCoverBaseImageDto.id) && epx.f(this.url, videoChannelsVideoCoverBaseImageDto.url) && epx.f(this.width, videoChannelsVideoCoverBaseImageDto.width) && epx.f(this.height, videoChannelsVideoCoverBaseImageDto.height) && epx.f(this.theme, videoChannelsVideoCoverBaseImageDto.theme) && epx.f(this.isBase, videoChannelsVideoCoverBaseImageDto.isBase);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.theme;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isBase;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsVideoCoverBaseImageDto(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", isBase=");
        return tn.a(sb, this.isBase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.theme);
        Boolean bool = this.isBase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public VideoChannelsVideoCoverBaseImageDto(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.id = str;
        this.url = str2;
        this.width = num;
        this.height = num2;
        this.theme = str3;
        this.isBase = bool;
    }

    public /* synthetic */ VideoChannelsVideoCoverBaseImageDto(String str, String str2, Integer num, Integer num2, String str3, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool);
    }
}
