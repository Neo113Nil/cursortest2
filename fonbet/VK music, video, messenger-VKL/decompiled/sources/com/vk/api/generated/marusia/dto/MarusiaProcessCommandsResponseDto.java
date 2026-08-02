package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarusiaProcessCommandsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaProcessCommandsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaProcessCommandsResponseDto> CREATOR = new a();

    @pmi0("is_sent")
    private final boolean isSent;

    /* compiled from: MarusiaProcessCommandsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaProcessCommandsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaProcessCommandsResponseDto createFromParcel(Parcel parcel) {
            return new MarusiaProcessCommandsResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaProcessCommandsResponseDto[] newArray(int i) {
            return new MarusiaProcessCommandsResponseDto[i];
        }
    }

    public MarusiaProcessCommandsResponseDto(boolean z) {
        this.isSent = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaProcessCommandsResponseDto) && this.isSent == ((MarusiaProcessCommandsResponseDto) obj).isSent;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSent);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarusiaProcessCommandsResponseDto(isSent="), this.isSent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSent ? 1 : 0);
    }
}
