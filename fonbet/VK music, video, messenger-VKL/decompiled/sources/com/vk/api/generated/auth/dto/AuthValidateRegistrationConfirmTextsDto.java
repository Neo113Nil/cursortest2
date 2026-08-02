package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthValidateRegistrationConfirmTextsDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateRegistrationConfirmTextsDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateRegistrationConfirmTextsDto> CREATOR = new a();

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AuthValidateRegistrationConfirmTextsDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateRegistrationConfirmTextsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateRegistrationConfirmTextsDto createFromParcel(Parcel parcel) {
            return new AuthValidateRegistrationConfirmTextsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateRegistrationConfirmTextsDto[] newArray(int i) {
            return new AuthValidateRegistrationConfirmTextsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthValidateRegistrationConfirmTextsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateRegistrationConfirmTextsDto)) {
            return false;
        }
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = (AuthValidateRegistrationConfirmTextsDto) obj;
        return epx.f(this.title, authValidateRegistrationConfirmTextsDto.title) && epx.f(this.subtitle, authValidateRegistrationConfirmTextsDto.subtitle);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateRegistrationConfirmTextsDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    public AuthValidateRegistrationConfirmTextsDto(String str, String str2) {
        this.title = str;
        this.subtitle = str2;
    }

    public /* synthetic */ AuthValidateRegistrationConfirmTextsDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
