package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthIndexedCodeDto.kt */
/* loaded from: classes14.dex */
public final class AuthIndexedCodeDto implements Parcelable {
    public static final Parcelable.Creator<AuthIndexedCodeDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("index")
    private final int index;

    /* compiled from: AuthIndexedCodeDto.kt */
    public static final class a implements Parcelable.Creator<AuthIndexedCodeDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthIndexedCodeDto createFromParcel(Parcel parcel) {
            return new AuthIndexedCodeDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthIndexedCodeDto[] newArray(int i) {
            return new AuthIndexedCodeDto[i];
        }
    }

    public AuthIndexedCodeDto(int i, String str) {
        this.index = i;
        this.code = str;
    }

    public final String d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthIndexedCodeDto)) {
            return false;
        }
        AuthIndexedCodeDto authIndexedCodeDto = (AuthIndexedCodeDto) obj;
        return this.index == authIndexedCodeDto.index && epx.f(this.code, authIndexedCodeDto.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthIndexedCodeDto(index=");
        sb.append(this.index);
        sb.append(", code=");
        return ho8.a(sb, this.code, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.code);
    }
}
