package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthAgreementLinkDto.kt */
/* loaded from: classes14.dex */
public final class AuthAgreementLinkDto implements Parcelable {
    public static final Parcelable.Creator<AuthAgreementLinkDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("uri")
    private final String uri;

    /* compiled from: AuthAgreementLinkDto.kt */
    public static final class a implements Parcelable.Creator<AuthAgreementLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAgreementLinkDto createFromParcel(Parcel parcel) {
            return new AuthAgreementLinkDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAgreementLinkDto[] newArray(int i) {
            return new AuthAgreementLinkDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthAgreementLinkDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthAgreementLinkDto)) {
            return false;
        }
        AuthAgreementLinkDto authAgreementLinkDto = (AuthAgreementLinkDto) obj;
        return epx.f(this.name, authAgreementLinkDto.name) && epx.f(this.uri, authAgreementLinkDto.uri);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAgreementLinkDto(name=");
        sb.append(this.name);
        sb.append(", uri=");
        return ho8.a(sb, this.uri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.uri);
    }

    public AuthAgreementLinkDto(String str, String str2) {
        this.name = str;
        this.uri = str2;
    }

    public /* synthetic */ AuthAgreementLinkDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
