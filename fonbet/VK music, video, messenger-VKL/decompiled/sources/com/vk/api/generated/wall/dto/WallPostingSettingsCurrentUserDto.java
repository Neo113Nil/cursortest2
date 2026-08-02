package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: WallPostingSettingsCurrentUserDto.kt */
/* loaded from: classes15.dex */
public final class WallPostingSettingsCurrentUserDto implements Parcelable {
    public static final Parcelable.Creator<WallPostingSettingsCurrentUserDto> CREATOR = new a();

    @pmi0("first_name_gen")
    private final String firstNameGen;

    @pmi0("last_name_gen")
    private final String lastNameGen;

    /* compiled from: WallPostingSettingsCurrentUserDto.kt */
    public static final class a implements Parcelable.Creator<WallPostingSettingsCurrentUserDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsCurrentUserDto createFromParcel(Parcel parcel) {
            return new WallPostingSettingsCurrentUserDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostingSettingsCurrentUserDto[] newArray(int i) {
            return new WallPostingSettingsCurrentUserDto[i];
        }
    }

    public WallPostingSettingsCurrentUserDto(String str, String str2) {
        this.firstNameGen = str;
        this.lastNameGen = str2;
    }

    public final String d() {
        return this.firstNameGen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastNameGen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostingSettingsCurrentUserDto)) {
            return false;
        }
        WallPostingSettingsCurrentUserDto wallPostingSettingsCurrentUserDto = (WallPostingSettingsCurrentUserDto) obj;
        return epx.f(this.firstNameGen, wallPostingSettingsCurrentUserDto.firstNameGen) && epx.f(this.lastNameGen, wallPostingSettingsCurrentUserDto.lastNameGen);
    }

    public final int hashCode() {
        return this.lastNameGen.hashCode() + (this.firstNameGen.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostingSettingsCurrentUserDto(firstNameGen=");
        sb.append(this.firstNameGen);
        sb.append(", lastNameGen=");
        return ho8.a(sb, this.lastNameGen, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstNameGen);
        parcel.writeString(this.lastNameGen);
    }
}
