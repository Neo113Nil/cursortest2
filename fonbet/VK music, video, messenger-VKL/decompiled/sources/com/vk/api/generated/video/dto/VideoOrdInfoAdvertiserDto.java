package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoOrdInfoAdvertiserDto.kt */
/* loaded from: classes15.dex */
public final class VideoOrdInfoAdvertiserDto implements Parcelable {
    public static final Parcelable.Creator<VideoOrdInfoAdvertiserDto> CREATOR = new a();

    @pmi0("er_id")
    private final String erId;

    @pmi0("ord_pred_id")
    private final String ordPredId;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoOrdInfoAdvertiserDto.kt */
    public static final class a implements Parcelable.Creator<VideoOrdInfoAdvertiserDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoOrdInfoAdvertiserDto createFromParcel(Parcel parcel) {
            return new VideoOrdInfoAdvertiserDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoOrdInfoAdvertiserDto[] newArray(int i) {
            return new VideoOrdInfoAdvertiserDto[i];
        }
    }

    public VideoOrdInfoAdvertiserDto(String str, String str2, String str3) {
        this.url = str;
        this.erId = str2;
        this.ordPredId = str3;
    }

    public final String d() {
        return this.erId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoOrdInfoAdvertiserDto)) {
            return false;
        }
        VideoOrdInfoAdvertiserDto videoOrdInfoAdvertiserDto = (VideoOrdInfoAdvertiserDto) obj;
        return epx.f(this.url, videoOrdInfoAdvertiserDto.url) && epx.f(this.erId, videoOrdInfoAdvertiserDto.erId) && epx.f(this.ordPredId, videoOrdInfoAdvertiserDto.ordPredId);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.url.hashCode() * 31, 31, this.erId);
        String str = this.ordPredId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoOrdInfoAdvertiserDto(url=");
        sb.append(this.url);
        sb.append(", erId=");
        sb.append(this.erId);
        sb.append(", ordPredId=");
        return ho8.a(sb, this.ordPredId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.erId);
        parcel.writeString(this.ordPredId);
    }

    public /* synthetic */ VideoOrdInfoAdvertiserDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
