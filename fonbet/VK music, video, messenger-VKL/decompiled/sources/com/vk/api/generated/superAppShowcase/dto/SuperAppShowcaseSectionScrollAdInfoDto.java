package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SuperAppShowcaseSectionScrollAdInfoDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseSectionScrollAdInfoDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseSectionScrollAdInfoDto> CREATOR = new a();

    @pmi0("about")
    private final String about;

    @pmi0("erid")
    private final String erid;

    /* compiled from: SuperAppShowcaseSectionScrollAdInfoDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionScrollAdInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionScrollAdInfoDto createFromParcel(Parcel parcel) {
            return new SuperAppShowcaseSectionScrollAdInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionScrollAdInfoDto[] newArray(int i) {
            return new SuperAppShowcaseSectionScrollAdInfoDto[i];
        }
    }

    public SuperAppShowcaseSectionScrollAdInfoDto(String str, String str2) {
        this.erid = str;
        this.about = str2;
    }

    public final String d() {
        return this.about;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.erid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseSectionScrollAdInfoDto)) {
            return false;
        }
        SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto = (SuperAppShowcaseSectionScrollAdInfoDto) obj;
        return epx.f(this.erid, superAppShowcaseSectionScrollAdInfoDto.erid) && epx.f(this.about, superAppShowcaseSectionScrollAdInfoDto.about);
    }

    public final int hashCode() {
        return this.about.hashCode() + (this.erid.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcaseSectionScrollAdInfoDto(erid=");
        sb.append(this.erid);
        sb.append(", about=");
        return ho8.a(sb, this.about, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.erid);
        parcel.writeString(this.about);
    }
}
