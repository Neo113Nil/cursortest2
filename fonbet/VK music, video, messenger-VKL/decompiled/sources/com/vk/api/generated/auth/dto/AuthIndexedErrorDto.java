package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthIndexedErrorDto.kt */
/* loaded from: classes14.dex */
public final class AuthIndexedErrorDto implements Parcelable {
    public static final Parcelable.Creator<AuthIndexedErrorDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("index")
    private final int index;

    /* compiled from: AuthIndexedErrorDto.kt */
    public static final class a implements Parcelable.Creator<AuthIndexedErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthIndexedErrorDto createFromParcel(Parcel parcel) {
            return new AuthIndexedErrorDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthIndexedErrorDto[] newArray(int i) {
            return new AuthIndexedErrorDto[i];
        }
    }

    public AuthIndexedErrorDto(int i, String str) {
        this.index = i;
        this.description = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthIndexedErrorDto)) {
            return false;
        }
        AuthIndexedErrorDto authIndexedErrorDto = (AuthIndexedErrorDto) obj;
        return this.index == authIndexedErrorDto.index && epx.f(this.description, authIndexedErrorDto.description);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthIndexedErrorDto(index=");
        sb.append(this.index);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AuthIndexedErrorDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
