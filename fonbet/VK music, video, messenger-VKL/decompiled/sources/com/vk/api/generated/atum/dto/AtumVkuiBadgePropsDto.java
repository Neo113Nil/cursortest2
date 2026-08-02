package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiBadgePropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiBadgePropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiBadgePropsDto> CREATOR = new a();

    @pmi0("appearance")
    private final AtumVkuiAppearanceDto appearance;

    /* compiled from: AtumVkuiBadgePropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiBadgePropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBadgePropsDto createFromParcel(Parcel parcel) {
            return new AtumVkuiBadgePropsDto(parcel.readInt() == 0 ? null : AtumVkuiAppearanceDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiBadgePropsDto[] newArray(int i) {
            return new AtumVkuiBadgePropsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AtumVkuiBadgePropsDto() {
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
        return (obj instanceof AtumVkuiBadgePropsDto) && this.appearance == ((AtumVkuiBadgePropsDto) obj).appearance;
    }

    public final int hashCode() {
        AtumVkuiAppearanceDto atumVkuiAppearanceDto = this.appearance;
        if (atumVkuiAppearanceDto == null) {
            return 0;
        }
        return atumVkuiAppearanceDto.hashCode();
    }

    public final String toString() {
        return "AtumVkuiBadgePropsDto(appearance=" + this.appearance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AtumVkuiAppearanceDto atumVkuiAppearanceDto = this.appearance;
        if (atumVkuiAppearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiAppearanceDto.writeToParcel(parcel, i);
        }
    }

    public AtumVkuiBadgePropsDto(AtumVkuiAppearanceDto atumVkuiAppearanceDto) {
        this.appearance = atumVkuiAppearanceDto;
    }

    public /* synthetic */ AtumVkuiBadgePropsDto(AtumVkuiAppearanceDto atumVkuiAppearanceDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : atumVkuiAppearanceDto);
    }
}
