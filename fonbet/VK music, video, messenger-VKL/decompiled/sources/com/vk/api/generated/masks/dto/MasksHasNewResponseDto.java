package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MasksHasNewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MasksHasNewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MasksHasNewResponseDto> CREATOR = new a();

    @pmi0("new_masks")
    private final int newMasks;

    /* compiled from: MasksHasNewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MasksHasNewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksHasNewResponseDto createFromParcel(Parcel parcel) {
            return new MasksHasNewResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksHasNewResponseDto[] newArray(int i) {
            return new MasksHasNewResponseDto[i];
        }
    }

    public MasksHasNewResponseDto(int i) {
        this.newMasks = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MasksHasNewResponseDto) && this.newMasks == ((MasksHasNewResponseDto) obj).newMasks;
    }

    public final int hashCode() {
        return Integer.hashCode(this.newMasks);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MasksHasNewResponseDto(newMasks="), this.newMasks, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.newMasks);
    }
}
