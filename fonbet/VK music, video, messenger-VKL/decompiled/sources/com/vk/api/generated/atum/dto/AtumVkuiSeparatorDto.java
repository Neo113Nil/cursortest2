package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AtumVkuiSeparatorDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSeparatorDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiSeparatorDto> CREATOR = new a();

    @pmi0("props")
    private final AtumVkuiSeparatorPropsDto props;

    /* compiled from: AtumVkuiSeparatorDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSeparatorDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSeparatorDto createFromParcel(Parcel parcel) {
            return new AtumVkuiSeparatorDto(AtumVkuiSeparatorPropsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSeparatorDto[] newArray(int i) {
            return new AtumVkuiSeparatorDto[i];
        }
    }

    public AtumVkuiSeparatorDto(AtumVkuiSeparatorPropsDto atumVkuiSeparatorPropsDto) {
        this.props = atumVkuiSeparatorPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumVkuiSeparatorDto) && epx.f(this.props, ((AtumVkuiSeparatorDto) obj).props);
    }

    public final int hashCode() {
        return this.props.hashCode();
    }

    public final String toString() {
        return "AtumVkuiSeparatorDto(props=" + this.props + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.props.writeToParcel(parcel, i);
    }
}
