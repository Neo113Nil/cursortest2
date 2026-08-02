package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AuthGetAuthDataAppScopeDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataAppScopeDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataAppScopeDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: AuthGetAuthDataAppScopeDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataAppScopeDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppScopeDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataAppScopeDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppScopeDto[] newArray(int i) {
            return new AuthGetAuthDataAppScopeDto[i];
        }
    }

    public AuthGetAuthDataAppScopeDto(String str, String str2, String str3) {
        this.name = str;
        this.title = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataAppScopeDto)) {
            return false;
        }
        AuthGetAuthDataAppScopeDto authGetAuthDataAppScopeDto = (AuthGetAuthDataAppScopeDto) obj;
        return epx.f(this.name, authGetAuthDataAppScopeDto.name) && epx.f(this.title, authGetAuthDataAppScopeDto.title) && epx.f(this.description, authGetAuthDataAppScopeDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + urd0.a(this.name.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataAppScopeDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
