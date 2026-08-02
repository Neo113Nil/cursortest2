package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthExternalFlowOutPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AuthExternalFlowOutPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthExternalFlowOutPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AuthExternalFlowOutPlatformDto> CREATOR;

    @pmi0("MOBILE")
    public static final AuthExternalFlowOutPlatformDto MOBILE;

    @pmi0("WEB")
    public static final AuthExternalFlowOutPlatformDto WEB;

    @pmi0("WEB_MOBILE")
    public static final AuthExternalFlowOutPlatformDto WEB_MOBILE;
    private final String value;

    /* compiled from: AuthExternalFlowOutPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AuthExternalFlowOutPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthExternalFlowOutPlatformDto createFromParcel(Parcel parcel) {
            return AuthExternalFlowOutPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthExternalFlowOutPlatformDto[] newArray(int i) {
            return new AuthExternalFlowOutPlatformDto[i];
        }
    }

    static {
        AuthExternalFlowOutPlatformDto authExternalFlowOutPlatformDto = new AuthExternalFlowOutPlatformDto("MOBILE", 0, "MOBILE");
        MOBILE = authExternalFlowOutPlatformDto;
        AuthExternalFlowOutPlatformDto authExternalFlowOutPlatformDto2 = new AuthExternalFlowOutPlatformDto("WEB", 1, "WEB");
        WEB = authExternalFlowOutPlatformDto2;
        AuthExternalFlowOutPlatformDto authExternalFlowOutPlatformDto3 = new AuthExternalFlowOutPlatformDto("WEB_MOBILE", 2, "WEB_MOBILE");
        WEB_MOBILE = authExternalFlowOutPlatformDto3;
        AuthExternalFlowOutPlatformDto[] authExternalFlowOutPlatformDtoArr = {authExternalFlowOutPlatformDto, authExternalFlowOutPlatformDto2, authExternalFlowOutPlatformDto3};
        $VALUES = authExternalFlowOutPlatformDtoArr;
        $ENTRIES = new asp(authExternalFlowOutPlatformDtoArr);
        CREATOR = new a();
    }

    private AuthExternalFlowOutPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AuthExternalFlowOutPlatformDto valueOf(String str) {
        return (AuthExternalFlowOutPlatformDto) Enum.valueOf(AuthExternalFlowOutPlatformDto.class, str);
    }

    public static AuthExternalFlowOutPlatformDto[] values() {
        return (AuthExternalFlowOutPlatformDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
