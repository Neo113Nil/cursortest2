package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersEditMenuItemResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersEditMenuItemResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersEditMenuItemResponseDto> CREATOR = new a();

    @pmi0("response")
    private final OwnersMenuItemDto response;

    /* compiled from: OwnersEditMenuItemResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersEditMenuItemResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersEditMenuItemResponseDto createFromParcel(Parcel parcel) {
            return new OwnersEditMenuItemResponseDto(parcel.readInt() == 0 ? null : OwnersMenuItemDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersEditMenuItemResponseDto[] newArray(int i) {
            return new OwnersEditMenuItemResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersEditMenuItemResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnersEditMenuItemResponseDto) && epx.f(this.response, ((OwnersEditMenuItemResponseDto) obj).response);
    }

    public final int hashCode() {
        OwnersMenuItemDto ownersMenuItemDto = this.response;
        if (ownersMenuItemDto == null) {
            return 0;
        }
        return ownersMenuItemDto.hashCode();
    }

    public final String toString() {
        return "OwnersEditMenuItemResponseDto(response=" + this.response + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersMenuItemDto ownersMenuItemDto = this.response;
        if (ownersMenuItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersMenuItemDto.writeToParcel(parcel, i);
        }
    }

    public OwnersEditMenuItemResponseDto(OwnersMenuItemDto ownersMenuItemDto) {
        this.response = ownersMenuItemDto;
    }

    public /* synthetic */ OwnersEditMenuItemResponseDto(OwnersMenuItemDto ownersMenuItemDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersMenuItemDto);
    }
}
