package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AtumTypeClickActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumTypeClickActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumTypeClickActionParametersDto> CREATOR = new a();

    @pmi0("stats")
    private final AtumAnyObjectDto stats;

    /* compiled from: AtumTypeClickActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumTypeClickActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumTypeClickActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumTypeClickActionParametersDto(AtumAnyObjectDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumTypeClickActionParametersDto[] newArray(int i) {
            return new AtumTypeClickActionParametersDto[i];
        }
    }

    public AtumTypeClickActionParametersDto(AtumAnyObjectDto atumAnyObjectDto) {
        this.stats = atumAnyObjectDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtumTypeClickActionParametersDto) && epx.f(this.stats, ((AtumTypeClickActionParametersDto) obj).stats);
    }

    public final int hashCode() {
        return this.stats.hashCode();
    }

    public final String toString() {
        return "AtumTypeClickActionParametersDto(stats=" + this.stats + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.stats.writeToParcel(parcel, i);
    }
}
