package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesSetConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSetConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSetConfigResponseDto> CREATOR = new a();

    @pmi0("version")
    private final int version;

    /* compiled from: MessagesSetConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSetConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSetConfigResponseDto createFromParcel(Parcel parcel) {
            return new MessagesSetConfigResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSetConfigResponseDto[] newArray(int i) {
            return new MessagesSetConfigResponseDto[i];
        }
    }

    public MessagesSetConfigResponseDto(int i) {
        this.version = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesSetConfigResponseDto) && this.version == ((MessagesSetConfigResponseDto) obj).version;
    }

    public final int hashCode() {
        return Integer.hashCode(this.version);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MessagesSetConfigResponseDto(version="), this.version, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
    }
}
