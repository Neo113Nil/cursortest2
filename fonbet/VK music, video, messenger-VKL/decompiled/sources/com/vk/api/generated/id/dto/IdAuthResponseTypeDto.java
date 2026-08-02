package com.vk.api.generated.id.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdAuthResponseTypeDto.kt */
/* loaded from: classes14.dex */
public final class IdAuthResponseTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdAuthResponseTypeDto[] $VALUES;

    @pmi0("code")
    public static final IdAuthResponseTypeDto CODE;

    @pmi0("cookie")
    public static final IdAuthResponseTypeDto COOKIE;
    public static final Parcelable.Creator<IdAuthResponseTypeDto> CREATOR;

    @pmi0("token")
    public static final IdAuthResponseTypeDto TOKEN;
    private final String value;

    /* compiled from: IdAuthResponseTypeDto.kt */
    public static final class a implements Parcelable.Creator<IdAuthResponseTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final IdAuthResponseTypeDto createFromParcel(Parcel parcel) {
            return IdAuthResponseTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdAuthResponseTypeDto[] newArray(int i) {
            return new IdAuthResponseTypeDto[i];
        }
    }

    static {
        IdAuthResponseTypeDto idAuthResponseTypeDto = new IdAuthResponseTypeDto("CODE", 0, "code");
        CODE = idAuthResponseTypeDto;
        IdAuthResponseTypeDto idAuthResponseTypeDto2 = new IdAuthResponseTypeDto("COOKIE", 1, "cookie");
        COOKIE = idAuthResponseTypeDto2;
        IdAuthResponseTypeDto idAuthResponseTypeDto3 = new IdAuthResponseTypeDto("TOKEN", 2, "token");
        TOKEN = idAuthResponseTypeDto3;
        IdAuthResponseTypeDto[] idAuthResponseTypeDtoArr = {idAuthResponseTypeDto, idAuthResponseTypeDto2, idAuthResponseTypeDto3};
        $VALUES = idAuthResponseTypeDtoArr;
        $ENTRIES = new asp(idAuthResponseTypeDtoArr);
        CREATOR = new a();
    }

    private IdAuthResponseTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static IdAuthResponseTypeDto valueOf(String str) {
        return (IdAuthResponseTypeDto) Enum.valueOf(IdAuthResponseTypeDto.class, str);
    }

    public static IdAuthResponseTypeDto[] values() {
        return (IdAuthResponseTypeDto[]) $VALUES.clone();
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
