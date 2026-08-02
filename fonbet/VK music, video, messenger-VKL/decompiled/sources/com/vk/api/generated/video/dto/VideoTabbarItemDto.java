package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTabbarItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoTabbarItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoTabbarItemDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    /* compiled from: VideoTabbarItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoTabbarItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTabbarItemDto createFromParcel(Parcel parcel) {
            return new VideoTabbarItemDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTabbarItemDto[] newArray(int i) {
            return new VideoTabbarItemDto[i];
        }
    }

    public VideoTabbarItemDto(String str, String str2, String str3) {
        this.id = str;
        this.style = str2;
        this.icon = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTabbarItemDto)) {
            return false;
        }
        VideoTabbarItemDto videoTabbarItemDto = (VideoTabbarItemDto) obj;
        return epx.f(this.id, videoTabbarItemDto.id) && epx.f(this.style, videoTabbarItemDto.style) && epx.f(this.icon, videoTabbarItemDto.icon);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.style;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTabbarItemDto(id=");
        sb.append(this.id);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", icon=");
        return ho8.a(sb, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.style);
        parcel.writeString(this.icon);
    }

    public /* synthetic */ VideoTabbarItemDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
