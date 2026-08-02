package com.vk.api.generated.specials.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpecialsBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class SpecialsBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<SpecialsBackgroundDto> CREATOR = new a();

    @pmi0("dark")
    private final SpecialsBackgroundThemeDto dark;

    @pmi0("light")
    private final SpecialsBackgroundThemeDto light;

    /* compiled from: SpecialsBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<SpecialsBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final SpecialsBackgroundDto createFromParcel(Parcel parcel) {
            return new SpecialsBackgroundDto(parcel.readInt() == 0 ? null : SpecialsBackgroundThemeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpecialsBackgroundThemeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpecialsBackgroundDto[] newArray(int i) {
            return new SpecialsBackgroundDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpecialsBackgroundDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecialsBackgroundDto)) {
            return false;
        }
        SpecialsBackgroundDto specialsBackgroundDto = (SpecialsBackgroundDto) obj;
        return epx.f(this.dark, specialsBackgroundDto.dark) && epx.f(this.light, specialsBackgroundDto.light);
    }

    public final int hashCode() {
        SpecialsBackgroundThemeDto specialsBackgroundThemeDto = this.dark;
        int hashCode = (specialsBackgroundThemeDto == null ? 0 : specialsBackgroundThemeDto.hashCode()) * 31;
        SpecialsBackgroundThemeDto specialsBackgroundThemeDto2 = this.light;
        return hashCode + (specialsBackgroundThemeDto2 != null ? specialsBackgroundThemeDto2.hashCode() : 0);
    }

    public final String toString() {
        return "SpecialsBackgroundDto(dark=" + this.dark + ", light=" + this.light + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SpecialsBackgroundThemeDto specialsBackgroundThemeDto = this.dark;
        if (specialsBackgroundThemeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsBackgroundThemeDto.writeToParcel(parcel, i);
        }
        SpecialsBackgroundThemeDto specialsBackgroundThemeDto2 = this.light;
        if (specialsBackgroundThemeDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialsBackgroundThemeDto2.writeToParcel(parcel, i);
        }
    }

    public SpecialsBackgroundDto(SpecialsBackgroundThemeDto specialsBackgroundThemeDto, SpecialsBackgroundThemeDto specialsBackgroundThemeDto2) {
        this.dark = specialsBackgroundThemeDto;
        this.light = specialsBackgroundThemeDto2;
    }

    public /* synthetic */ SpecialsBackgroundDto(SpecialsBackgroundThemeDto specialsBackgroundThemeDto, SpecialsBackgroundThemeDto specialsBackgroundThemeDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : specialsBackgroundThemeDto, (i & 2) != 0 ? null : specialsBackgroundThemeDto2);
    }
}
