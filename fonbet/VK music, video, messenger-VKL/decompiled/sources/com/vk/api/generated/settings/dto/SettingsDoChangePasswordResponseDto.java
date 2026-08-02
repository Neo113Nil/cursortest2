package com.vk.api.generated.settings.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SettingsDoChangePasswordResponseDto.kt */
/* loaded from: classes15.dex */
public final class SettingsDoChangePasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<SettingsDoChangePasswordResponseDto> CREATOR = new a();

    @pmi0("exchange_token")
    private final String exchangeToken;

    @pmi0("login")
    private final String login;

    /* compiled from: SettingsDoChangePasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<SettingsDoChangePasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SettingsDoChangePasswordResponseDto createFromParcel(Parcel parcel) {
            return new SettingsDoChangePasswordResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsDoChangePasswordResponseDto[] newArray(int i) {
            return new SettingsDoChangePasswordResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsDoChangePasswordResponseDto() {
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
        if (!(obj instanceof SettingsDoChangePasswordResponseDto)) {
            return false;
        }
        SettingsDoChangePasswordResponseDto settingsDoChangePasswordResponseDto = (SettingsDoChangePasswordResponseDto) obj;
        return epx.f(this.exchangeToken, settingsDoChangePasswordResponseDto.exchangeToken) && epx.f(this.login, settingsDoChangePasswordResponseDto.login);
    }

    public final int hashCode() {
        String str = this.exchangeToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.login;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsDoChangePasswordResponseDto(exchangeToken=");
        sb.append(this.exchangeToken);
        sb.append(", login=");
        return ho8.a(sb, this.login, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.exchangeToken);
        parcel.writeString(this.login);
    }

    public SettingsDoChangePasswordResponseDto(String str, String str2) {
        this.exchangeToken = str;
        this.login = str2;
    }

    public /* synthetic */ SettingsDoChangePasswordResponseDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
