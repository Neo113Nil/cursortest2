package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiSnackbarActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSnackbarActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiSnackbarActionParametersDto> CREATOR = new a();

    @pmi0("bottom_button")
    private final AtumVkuiButtonDto bottomButton;

    @pmi0("leading_accessory")
    private final AtumVkuiSnackbarAccessoryDto leadingAccessory;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("trailing_accessory")
    private final AtumVkuiSnackbarAccessoryDto trailingAccessory;

    /* compiled from: AtumVkuiSnackbarActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSnackbarActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSnackbarActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumVkuiSnackbarActionParametersDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AtumVkuiButtonDto.CREATOR.createFromParcel(parcel), (AtumVkuiSnackbarAccessoryDto) parcel.readParcelable(AtumVkuiSnackbarActionParametersDto.class.getClassLoader()), (AtumVkuiSnackbarAccessoryDto) parcel.readParcelable(AtumVkuiSnackbarActionParametersDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSnackbarActionParametersDto[] newArray(int i) {
            return new AtumVkuiSnackbarActionParametersDto[i];
        }
    }

    public AtumVkuiSnackbarActionParametersDto(String str, String str2, AtumVkuiButtonDto atumVkuiButtonDto, AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto, AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto2) {
        this.title = str;
        this.subtitle = str2;
        this.bottomButton = atumVkuiButtonDto;
        this.trailingAccessory = atumVkuiSnackbarAccessoryDto;
        this.leadingAccessory = atumVkuiSnackbarAccessoryDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiSnackbarActionParametersDto)) {
            return false;
        }
        AtumVkuiSnackbarActionParametersDto atumVkuiSnackbarActionParametersDto = (AtumVkuiSnackbarActionParametersDto) obj;
        return epx.f(this.title, atumVkuiSnackbarActionParametersDto.title) && epx.f(this.subtitle, atumVkuiSnackbarActionParametersDto.subtitle) && epx.f(this.bottomButton, atumVkuiSnackbarActionParametersDto.bottomButton) && epx.f(this.trailingAccessory, atumVkuiSnackbarActionParametersDto.trailingAccessory) && epx.f(this.leadingAccessory, atumVkuiSnackbarActionParametersDto.leadingAccessory);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtumVkuiButtonDto atumVkuiButtonDto = this.bottomButton;
        int hashCode3 = (hashCode2 + (atumVkuiButtonDto == null ? 0 : atumVkuiButtonDto.hashCode())) * 31;
        AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto = this.trailingAccessory;
        int hashCode4 = (hashCode3 + (atumVkuiSnackbarAccessoryDto == null ? 0 : atumVkuiSnackbarAccessoryDto.hashCode())) * 31;
        AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto2 = this.leadingAccessory;
        return hashCode4 + (atumVkuiSnackbarAccessoryDto2 != null ? atumVkuiSnackbarAccessoryDto2.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiSnackbarActionParametersDto(title=" + this.title + ", subtitle=" + this.subtitle + ", bottomButton=" + this.bottomButton + ", trailingAccessory=" + this.trailingAccessory + ", leadingAccessory=" + this.leadingAccessory + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        AtumVkuiButtonDto atumVkuiButtonDto = this.bottomButton;
        if (atumVkuiButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumVkuiButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.trailingAccessory, i);
        parcel.writeParcelable(this.leadingAccessory, i);
    }

    public /* synthetic */ AtumVkuiSnackbarActionParametersDto(String str, String str2, AtumVkuiButtonDto atumVkuiButtonDto, AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto, AtumVkuiSnackbarAccessoryDto atumVkuiSnackbarAccessoryDto2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : atumVkuiButtonDto, (i & 8) != 0 ? null : atumVkuiSnackbarAccessoryDto, (i & 16) != 0 ? null : atumVkuiSnackbarAccessoryDto2);
    }
}
