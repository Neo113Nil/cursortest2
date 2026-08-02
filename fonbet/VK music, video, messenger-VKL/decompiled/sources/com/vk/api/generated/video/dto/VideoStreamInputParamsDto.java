package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoStreamInputParamsDto.kt */
/* loaded from: classes15.dex */
public final class VideoStreamInputParamsDto implements Parcelable {
    public static final Parcelable.Creator<VideoStreamInputParamsDto> CREATOR = new a();

    @pmi0("key")
    private final String key;

    @pmi0("okmp_url")
    private final String okmpUrl;

    @pmi0("ov_id")
    private final Long ovId;

    @pmi0("url")
    private final String url;

    @pmi0("webrtc_url")
    private final String webrtcUrl;

    /* compiled from: VideoStreamInputParamsDto.kt */
    public static final class a implements Parcelable.Creator<VideoStreamInputParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStreamInputParamsDto createFromParcel(Parcel parcel) {
            return new VideoStreamInputParamsDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStreamInputParamsDto[] newArray(int i) {
            return new VideoStreamInputParamsDto[i];
        }
    }

    public VideoStreamInputParamsDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStreamInputParamsDto)) {
            return false;
        }
        VideoStreamInputParamsDto videoStreamInputParamsDto = (VideoStreamInputParamsDto) obj;
        return epx.f(this.url, videoStreamInputParamsDto.url) && epx.f(this.key, videoStreamInputParamsDto.key) && epx.f(this.ovId, videoStreamInputParamsDto.ovId) && epx.f(this.okmpUrl, videoStreamInputParamsDto.okmpUrl) && epx.f(this.webrtcUrl, videoStreamInputParamsDto.webrtcUrl);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.ovId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.okmpUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webrtcUrl;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStreamInputParamsDto(url=");
        sb.append(this.url);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", ovId=");
        sb.append(this.ovId);
        sb.append(", okmpUrl=");
        sb.append(this.okmpUrl);
        sb.append(", webrtcUrl=");
        return ho8.a(sb, this.webrtcUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.key);
        Long l = this.ovId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.okmpUrl);
        parcel.writeString(this.webrtcUrl);
    }

    public VideoStreamInputParamsDto(String str, String str2, Long l, String str3, String str4) {
        this.url = str;
        this.key = str2;
        this.ovId = l;
        this.okmpUrl = str3;
        this.webrtcUrl = str4;
    }

    public /* synthetic */ VideoStreamInputParamsDto(String str, String str2, Long l, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
