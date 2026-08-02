package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoChannelsErrorBagItemDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsErrorBagItemDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsErrorBagItemDto> CREATOR = new a();

    @pmi0("code")
    private final int code;

    @pmi0("message")
    private final String message;

    @pmi0("param")
    private final String param;

    @pmi0(X3.i.L)
    private final Integer position;

    /* compiled from: VideoChannelsErrorBagItemDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsErrorBagItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsErrorBagItemDto createFromParcel(Parcel parcel) {
            return new VideoChannelsErrorBagItemDto(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsErrorBagItemDto[] newArray(int i) {
            return new VideoChannelsErrorBagItemDto[i];
        }
    }

    public VideoChannelsErrorBagItemDto(String str, int i, String str2, Integer num) {
        this.param = str;
        this.code = i;
        this.message = str2;
        this.position = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsErrorBagItemDto)) {
            return false;
        }
        VideoChannelsErrorBagItemDto videoChannelsErrorBagItemDto = (VideoChannelsErrorBagItemDto) obj;
        return epx.f(this.param, videoChannelsErrorBagItemDto.param) && this.code == videoChannelsErrorBagItemDto.code && epx.f(this.message, videoChannelsErrorBagItemDto.message) && epx.f(this.position, videoChannelsErrorBagItemDto.position);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.code, this.param.hashCode() * 31, 31), 31, this.message);
        Integer num = this.position;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsErrorBagItemDto(param=");
        sb.append(this.param);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", position=");
        return uqi.b(sb, this.position, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.param);
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoChannelsErrorBagItemDto(String str, int i, String str2, Integer num, int i2, zcl zclVar) {
        this(str, i, str2, (i2 & 8) != 0 ? null : num);
    }
}
