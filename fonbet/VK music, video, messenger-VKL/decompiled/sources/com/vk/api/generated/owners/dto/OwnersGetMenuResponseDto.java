package com.vk.api.generated.owners.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OwnersGetMenuResponseDto.kt */
/* loaded from: classes15.dex */
public final class OwnersGetMenuResponseDto implements Parcelable {
    public static final Parcelable.Creator<OwnersGetMenuResponseDto> CREATOR = new a();

    @pmi0("response")
    private final OwnersMenuDto response;

    /* compiled from: OwnersGetMenuResponseDto.kt */
    public static final class a implements Parcelable.Creator<OwnersGetMenuResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final OwnersGetMenuResponseDto createFromParcel(Parcel parcel) {
            return new OwnersGetMenuResponseDto(parcel.readInt() == 0 ? null : OwnersMenuDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OwnersGetMenuResponseDto[] newArray(int i) {
            return new OwnersGetMenuResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OwnersGetMenuResponseDto() {
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
        return (obj instanceof OwnersGetMenuResponseDto) && epx.f(this.response, ((OwnersGetMenuResponseDto) obj).response);
    }

    public final int hashCode() {
        OwnersMenuDto ownersMenuDto = this.response;
        if (ownersMenuDto == null) {
            return 0;
        }
        return ownersMenuDto.hashCode();
    }

    public final String toString() {
        return "OwnersGetMenuResponseDto(response=" + this.response + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        OwnersMenuDto ownersMenuDto = this.response;
        if (ownersMenuDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ownersMenuDto.writeToParcel(parcel, i);
        }
    }

    public OwnersGetMenuResponseDto(OwnersMenuDto ownersMenuDto) {
        this.response = ownersMenuDto;
    }

    public /* synthetic */ OwnersGetMenuResponseDto(OwnersMenuDto ownersMenuDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : ownersMenuDto);
    }
}
