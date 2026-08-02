package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AtumVkuiIconButtonDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiIconButtonDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiIconButtonDto> CREATOR = new a();

    @pmi0("props")
    private final AtumVkuiIconButtonPropsDto props;

    /* compiled from: AtumVkuiIconButtonDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiIconButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconButtonDto createFromParcel(Parcel parcel) {
            return new AtumVkuiIconButtonDto(AtumVkuiIconButtonPropsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiIconButtonDto[] newArray(int i) {
            return new AtumVkuiIconButtonDto[i];
        }
    }

    public AtumVkuiIconButtonDto(AtumVkuiIconButtonPropsDto atumVkuiIconButtonPropsDto) {
        this.props = atumVkuiIconButtonPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumVkuiIconButtonDto) && epx.f(this.props, ((AtumVkuiIconButtonDto) obj).props);
    }

    public final int hashCode() {
        return this.props.hashCode();
    }

    public final String toString() {
        return "AtumVkuiIconButtonDto(props=" + this.props + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.props.writeToParcel(parcel, i);
    }
}
