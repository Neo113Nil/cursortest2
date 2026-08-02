package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersAddMenuItemResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersAddMenuItemResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersAddMenuItemResponseDto> CREATOR = new a();

    @pmi0("response")
    private final OwnersMenuItemDto response;

    /* compiled from: OwnersAddMenuItemResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersAddMenuItemResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersAddMenuItemResponseDto createFromParcel(Parcel parcel) {
            return new OwnersAddMenuItemResponseDto(parcel.readInt() == 0 ? null : OwnersMenuItemDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersAddMenuItemResponseDto[] newArray(int i) {
            return new OwnersAddMenuItemResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersAddMenuItemResponseDto() {
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
        return (obj instanceof OwnersAddMenuItemResponseDto) && epx.f(this.response, ((OwnersAddMenuItemResponseDto) obj).response);
    }

    public final int hashCode() {
        OwnersMenuItemDto ownersMenuItemDto = this.response;
        if (ownersMenuItemDto == null) {
            return 0;
        }
        return ownersMenuItemDto.hashCode();
    }

    public final String toString() {
        return "OwnersAddMenuItemResponseDto(response=" + this.response + ')';
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

    public OwnersAddMenuItemResponseDto(OwnersMenuItemDto ownersMenuItemDto) {
        this.response = ownersMenuItemDto;
    }

    public /* synthetic */ OwnersAddMenuItemResponseDto(OwnersMenuItemDto ownersMenuItemDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersMenuItemDto);
    }
}
