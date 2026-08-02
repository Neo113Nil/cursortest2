package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.core.ApiUris;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoChannelsCudResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsCudResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsCudResponseDto> CREATOR = new a();

    @pmi0("error_code")
    private final Integer errorCode;

    @pmi0(ApiUris.SCHEME_OK)
    private final boolean ok;

    /* compiled from: VideoChannelsCudResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsCudResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsCudResponseDto createFromParcel(Parcel parcel) {
            return new VideoChannelsCudResponseDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsCudResponseDto[] newArray(int i) {
            return new VideoChannelsCudResponseDto[i];
        }
    }

    public VideoChannelsCudResponseDto(boolean z, Integer num) {
        this.ok = z;
        this.errorCode = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsCudResponseDto)) {
            return false;
        }
        VideoChannelsCudResponseDto videoChannelsCudResponseDto = (VideoChannelsCudResponseDto) obj;
        return this.ok == videoChannelsCudResponseDto.ok && epx.f(this.errorCode, videoChannelsCudResponseDto.errorCode);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.ok) * 31;
        Integer num = this.errorCode;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsCudResponseDto(ok=");
        sb.append(this.ok);
        sb.append(", errorCode=");
        return uqi.b(sb, this.errorCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ok ? 1 : 0);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoChannelsCudResponseDto(boolean z, Integer num, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num);
    }
}
