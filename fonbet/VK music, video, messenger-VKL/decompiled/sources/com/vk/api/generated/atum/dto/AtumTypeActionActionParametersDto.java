package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AtumTypeActionActionParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumTypeActionActionParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumTypeActionActionParametersDto> CREATOR = new a();

    @pmi0("stats")
    private final AtumAnyObjectDto stats;

    /* compiled from: AtumTypeActionActionParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumTypeActionActionParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumTypeActionActionParametersDto createFromParcel(Parcel parcel) {
            return new AtumTypeActionActionParametersDto(AtumAnyObjectDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumTypeActionActionParametersDto[] newArray(int i) {
            return new AtumTypeActionActionParametersDto[i];
        }
    }

    public AtumTypeActionActionParametersDto(AtumAnyObjectDto atumAnyObjectDto) {
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
        return (obj instanceof AtumTypeActionActionParametersDto) && epx.f(this.stats, ((AtumTypeActionActionParametersDto) obj).stats);
    }

    public final int hashCode() {
        return this.stats.hashCode();
    }

    public final String toString() {
        return "AtumTypeActionActionParametersDto(stats=" + this.stats + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.stats.writeToParcel(parcel, i);
    }
}
