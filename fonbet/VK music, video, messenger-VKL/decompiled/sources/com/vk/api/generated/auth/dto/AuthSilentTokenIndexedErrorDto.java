package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthSilentTokenIndexedErrorDto.kt */
/* loaded from: classes14.dex */
public final class AuthSilentTokenIndexedErrorDto implements Parcelable {
    public static final Parcelable.Creator<AuthSilentTokenIndexedErrorDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("index")
    private final int index;

    /* compiled from: AuthSilentTokenIndexedErrorDto.kt */
    public static final class a implements Parcelable.Creator<AuthSilentTokenIndexedErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenIndexedErrorDto createFromParcel(Parcel parcel) {
            return new AuthSilentTokenIndexedErrorDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenIndexedErrorDto[] newArray(int i) {
            return new AuthSilentTokenIndexedErrorDto[i];
        }
    }

    public AuthSilentTokenIndexedErrorDto(int i, String str) {
        this.index = i;
        this.description = str;
    }

    public final int d() {
        return this.index;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSilentTokenIndexedErrorDto)) {
            return false;
        }
        AuthSilentTokenIndexedErrorDto authSilentTokenIndexedErrorDto = (AuthSilentTokenIndexedErrorDto) obj;
        return this.index == authSilentTokenIndexedErrorDto.index && epx.f(this.description, authSilentTokenIndexedErrorDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSilentTokenIndexedErrorDto(index=");
        sb.append(this.index);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AuthSilentTokenIndexedErrorDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
