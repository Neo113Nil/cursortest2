package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthValidatePhoneSupportedWaysSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneSupportedWaysSettingsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthValidatePhoneSupportedWaysSettingsDto[] $VALUES;

    @pmi0("callreset_preview_enabled")
    public static final AuthValidatePhoneSupportedWaysSettingsDto CALLRESET_PREVIEW_ENABLED;
    public static final Parcelable.Creator<AuthValidatePhoneSupportedWaysSettingsDto> CREATOR;
    private final String value;

    /* compiled from: AuthValidatePhoneSupportedWaysSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneSupportedWaysSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneSupportedWaysSettingsDto createFromParcel(Parcel parcel) {
            return AuthValidatePhoneSupportedWaysSettingsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneSupportedWaysSettingsDto[] newArray(int i) {
            return new AuthValidatePhoneSupportedWaysSettingsDto[i];
        }
    }

    static {
        AuthValidatePhoneSupportedWaysSettingsDto authValidatePhoneSupportedWaysSettingsDto = new AuthValidatePhoneSupportedWaysSettingsDto("CALLRESET_PREVIEW_ENABLED", 0, "callreset_preview_enabled");
        CALLRESET_PREVIEW_ENABLED = authValidatePhoneSupportedWaysSettingsDto;
        AuthValidatePhoneSupportedWaysSettingsDto[] authValidatePhoneSupportedWaysSettingsDtoArr = {authValidatePhoneSupportedWaysSettingsDto};
        $VALUES = authValidatePhoneSupportedWaysSettingsDtoArr;
        $ENTRIES = new asp(authValidatePhoneSupportedWaysSettingsDtoArr);
        CREATOR = new a();
    }

    private AuthValidatePhoneSupportedWaysSettingsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthValidatePhoneSupportedWaysSettingsDto valueOf(String str) {
        return (AuthValidatePhoneSupportedWaysSettingsDto) Enum.valueOf(AuthValidatePhoneSupportedWaysSettingsDto.class, str);
    }

    public static AuthValidatePhoneSupportedWaysSettingsDto[] values() {
        return (AuthValidatePhoneSupportedWaysSettingsDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
