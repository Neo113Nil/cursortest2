package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.shy;
import xsna.vu5;

/* compiled from: MessagesConfigItemVideoMessageConfigDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConfigItemVideoMessageConfigDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConfigItemVideoMessageConfigDto> CREATOR = new a();

    @pmi0("enable_60_fps")
    private final boolean enable60Fps;

    @pmi0("max_duration_sec")
    private final int maxDurationSec;

    @pmi0("quality")
    private final int quality;

    /* compiled from: MessagesConfigItemVideoMessageConfigDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConfigItemVideoMessageConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemVideoMessageConfigDto createFromParcel(Parcel parcel) {
            return new MessagesConfigItemVideoMessageConfigDto(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemVideoMessageConfigDto[] newArray(int i) {
            return new MessagesConfigItemVideoMessageConfigDto[i];
        }
    }

    public MessagesConfigItemVideoMessageConfigDto(boolean z, int i, int i2) {
        this.enable60Fps = z;
        this.maxDurationSec = i;
        this.quality = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConfigItemVideoMessageConfigDto)) {
            return false;
        }
        MessagesConfigItemVideoMessageConfigDto messagesConfigItemVideoMessageConfigDto = (MessagesConfigItemVideoMessageConfigDto) obj;
        return this.enable60Fps == messagesConfigItemVideoMessageConfigDto.enable60Fps && this.maxDurationSec == messagesConfigItemVideoMessageConfigDto.maxDurationSec && this.quality == messagesConfigItemVideoMessageConfigDto.quality;
    }

    public final int hashCode() {
        return Integer.hashCode(this.quality) + shy.a(this.maxDurationSec, Boolean.hashCode(this.enable60Fps) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConfigItemVideoMessageConfigDto(enable60Fps=");
        sb.append(this.enable60Fps);
        sb.append(", maxDurationSec=");
        sb.append(this.maxDurationSec);
        sb.append(", quality=");
        return vu5.b(sb, this.quality, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enable60Fps ? 1 : 0);
        parcel.writeInt(this.maxDurationSec);
        parcel.writeInt(this.quality);
    }
}
