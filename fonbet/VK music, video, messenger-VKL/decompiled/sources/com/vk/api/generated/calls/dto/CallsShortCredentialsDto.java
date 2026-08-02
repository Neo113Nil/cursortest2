package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: CallsShortCredentialsDto.kt */
/* loaded from: classes14.dex */
public final class CallsShortCredentialsDto implements Parcelable {
    public static final Parcelable.Creator<CallsShortCredentialsDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("link_with_password")
    private final String linkWithPassword;

    @pmi0("link_without_password")
    private final String linkWithoutPassword;

    @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
    private final String password;

    /* compiled from: CallsShortCredentialsDto.kt */
    public static final class a implements Parcelable.Creator<CallsShortCredentialsDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsShortCredentialsDto createFromParcel(Parcel parcel) {
            return new CallsShortCredentialsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsShortCredentialsDto[] newArray(int i) {
            return new CallsShortCredentialsDto[i];
        }
    }

    public CallsShortCredentialsDto(String str, String str2, String str3, String str4) {
        this.id = str;
        this.password = str2;
        this.linkWithoutPassword = str3;
        this.linkWithPassword = str4;
    }

    public final String d() {
        return this.linkWithoutPassword;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.password;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsShortCredentialsDto)) {
            return false;
        }
        CallsShortCredentialsDto callsShortCredentialsDto = (CallsShortCredentialsDto) obj;
        return epx.f(this.id, callsShortCredentialsDto.id) && epx.f(this.password, callsShortCredentialsDto.password) && epx.f(this.linkWithoutPassword, callsShortCredentialsDto.linkWithoutPassword) && epx.f(this.linkWithPassword, callsShortCredentialsDto.linkWithPassword);
    }

    public final int hashCode() {
        return this.linkWithPassword.hashCode() + urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.password), 31, this.linkWithoutPassword);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsShortCredentialsDto(id=");
        sb.append(this.id);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", linkWithoutPassword=");
        sb.append(this.linkWithoutPassword);
        sb.append(", linkWithPassword=");
        return ho8.a(sb, this.linkWithPassword, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.password);
        parcel.writeString(this.linkWithoutPassword);
        parcel.writeString(this.linkWithPassword);
    }
}
