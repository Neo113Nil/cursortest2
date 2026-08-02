package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AtumVkuiImageViewDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiImageViewDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiImageViewDto> CREATOR = new a();

    @pmi0("props")
    private final AtumVkuiImageViewPropsDto props;

    /* compiled from: AtumVkuiImageViewDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiImageViewDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiImageViewDto createFromParcel(Parcel parcel) {
            return new AtumVkuiImageViewDto(AtumVkuiImageViewPropsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiImageViewDto[] newArray(int i) {
            return new AtumVkuiImageViewDto[i];
        }
    }

    public AtumVkuiImageViewDto(AtumVkuiImageViewPropsDto atumVkuiImageViewPropsDto) {
        this.props = atumVkuiImageViewPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumVkuiImageViewDto) && epx.f(this.props, ((AtumVkuiImageViewDto) obj).props);
    }

    public final int hashCode() {
        return this.props.hashCode();
    }

    public final String toString() {
        return "AtumVkuiImageViewDto(props=" + this.props + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.props.writeToParcel(parcel, i);
    }
}
