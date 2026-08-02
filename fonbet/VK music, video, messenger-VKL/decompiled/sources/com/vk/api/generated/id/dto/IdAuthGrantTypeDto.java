package com.vk.api.generated.id.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import ru.ok.android.sdk.SharedKt;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdAuthGrantTypeDto.kt */
/* loaded from: classes14.dex */
public final class IdAuthGrantTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdAuthGrantTypeDto[] $VALUES;

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    public static final IdAuthGrantTypeDto ACCESS_TOKEN;

    @pmi0("authorization_code")
    public static final IdAuthGrantTypeDto AUTHORIZATION_CODE;
    public static final Parcelable.Creator<IdAuthGrantTypeDto> CREATOR;

    @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
    public static final IdAuthGrantTypeDto PASSWORD;

    @pmi0(SharedKt.PARAM_REFRESH_TOKEN)
    public static final IdAuthGrantTypeDto REFRESH_TOKEN;
    private final String value;

    /* compiled from: IdAuthGrantTypeDto.kt */
    public static final class a implements Parcelable.Creator<IdAuthGrantTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final IdAuthGrantTypeDto createFromParcel(Parcel parcel) {
            return IdAuthGrantTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdAuthGrantTypeDto[] newArray(int i) {
            return new IdAuthGrantTypeDto[i];
        }
    }

    static {
        IdAuthGrantTypeDto idAuthGrantTypeDto = new IdAuthGrantTypeDto("ACCESS_TOKEN", 0, SharedKt.PARAM_ACCESS_TOKEN);
        ACCESS_TOKEN = idAuthGrantTypeDto;
        IdAuthGrantTypeDto idAuthGrantTypeDto2 = new IdAuthGrantTypeDto("AUTHORIZATION_CODE", 1, "authorization_code");
        AUTHORIZATION_CODE = idAuthGrantTypeDto2;
        IdAuthGrantTypeDto idAuthGrantTypeDto3 = new IdAuthGrantTypeDto("PASSWORD", 2, LoginApiConstants.PARAM_NAME_PASSWORD);
        PASSWORD = idAuthGrantTypeDto3;
        IdAuthGrantTypeDto idAuthGrantTypeDto4 = new IdAuthGrantTypeDto("REFRESH_TOKEN", 3, SharedKt.PARAM_REFRESH_TOKEN);
        REFRESH_TOKEN = idAuthGrantTypeDto4;
        IdAuthGrantTypeDto[] idAuthGrantTypeDtoArr = {idAuthGrantTypeDto, idAuthGrantTypeDto2, idAuthGrantTypeDto3, idAuthGrantTypeDto4};
        $VALUES = idAuthGrantTypeDtoArr;
        $ENTRIES = new asp(idAuthGrantTypeDtoArr);
        CREATOR = new a();
    }

    private IdAuthGrantTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static IdAuthGrantTypeDto valueOf(String str) {
        return (IdAuthGrantTypeDto) Enum.valueOf(IdAuthGrantTypeDto.class, str);
    }

    public static IdAuthGrantTypeDto[] values() {
        return (IdAuthGrantTypeDto[]) $VALUES.clone();
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
