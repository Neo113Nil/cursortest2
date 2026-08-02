package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoGetSnackBarInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSnackBarInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetSnackBarInfoResponseDto> CREATOR = new a();

    @pmi0("can_show")
    private final boolean canShow;

    @pmi0("delay")
    private final Integer delay;

    @pmi0("text")
    private final String text;

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoGetSnackBarInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSnackBarInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSnackBarInfoResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetSnackBarInfoResponseDto(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSnackBarInfoResponseDto[] newArray(int i) {
            return new VideoGetSnackBarInfoResponseDto[i];
        }
    }

    public VideoGetSnackBarInfoResponseDto(boolean z, String str, String str2, Integer num, Integer num2) {
        this.canShow = z;
        this.text = str;
        this.url = str2;
        this.ttl = num;
        this.delay = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetSnackBarInfoResponseDto)) {
            return false;
        }
        VideoGetSnackBarInfoResponseDto videoGetSnackBarInfoResponseDto = (VideoGetSnackBarInfoResponseDto) obj;
        return this.canShow == videoGetSnackBarInfoResponseDto.canShow && epx.f(this.text, videoGetSnackBarInfoResponseDto.text) && epx.f(this.url, videoGetSnackBarInfoResponseDto.url) && epx.f(this.ttl, videoGetSnackBarInfoResponseDto.ttl) && epx.f(this.delay, videoGetSnackBarInfoResponseDto.delay);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.canShow) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.ttl;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.delay;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetSnackBarInfoResponseDto(canShow=");
        sb.append(this.canShow);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", delay=");
        return uqi.b(sb, this.delay, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canShow ? 1 : 0);
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        Integer num = this.ttl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.delay;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ VideoGetSnackBarInfoResponseDto(boolean z, String str, String str2, Integer num, Integer num2, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
