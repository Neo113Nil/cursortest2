package com.vk.api.generated.restore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RestoreConfirmInstantAuthByNotifyIsConfirmedDto.kt */
/* loaded from: classes15.dex */
public final class RestoreConfirmInstantAuthByNotifyIsConfirmedDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RestoreConfirmInstantAuthByNotifyIsConfirmedDto[] $VALUES;
    public static final Parcelable.Creator<RestoreConfirmInstantAuthByNotifyIsConfirmedDto> CREATOR;

    @pmi0("0")
    public static final RestoreConfirmInstantAuthByNotifyIsConfirmedDto TYPE_0;

    @pmi0("1")
    public static final RestoreConfirmInstantAuthByNotifyIsConfirmedDto TYPE_1;
    private final int value;

    /* compiled from: RestoreConfirmInstantAuthByNotifyIsConfirmedDto.kt */
    public static final class a implements Parcelable.Creator<RestoreConfirmInstantAuthByNotifyIsConfirmedDto> {
        @Override // android.os.Parcelable.Creator
        public final RestoreConfirmInstantAuthByNotifyIsConfirmedDto createFromParcel(Parcel parcel) {
            return RestoreConfirmInstantAuthByNotifyIsConfirmedDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RestoreConfirmInstantAuthByNotifyIsConfirmedDto[] newArray(int i) {
            return new RestoreConfirmInstantAuthByNotifyIsConfirmedDto[i];
        }
    }

    static {
        RestoreConfirmInstantAuthByNotifyIsConfirmedDto restoreConfirmInstantAuthByNotifyIsConfirmedDto = new RestoreConfirmInstantAuthByNotifyIsConfirmedDto("TYPE_0", 0, 0);
        TYPE_0 = restoreConfirmInstantAuthByNotifyIsConfirmedDto;
        RestoreConfirmInstantAuthByNotifyIsConfirmedDto restoreConfirmInstantAuthByNotifyIsConfirmedDto2 = new RestoreConfirmInstantAuthByNotifyIsConfirmedDto("TYPE_1", 1, 1);
        TYPE_1 = restoreConfirmInstantAuthByNotifyIsConfirmedDto2;
        RestoreConfirmInstantAuthByNotifyIsConfirmedDto[] restoreConfirmInstantAuthByNotifyIsConfirmedDtoArr = {restoreConfirmInstantAuthByNotifyIsConfirmedDto, restoreConfirmInstantAuthByNotifyIsConfirmedDto2};
        $VALUES = restoreConfirmInstantAuthByNotifyIsConfirmedDtoArr;
        $ENTRIES = new asp(restoreConfirmInstantAuthByNotifyIsConfirmedDtoArr);
        CREATOR = new a();
    }

    private RestoreConfirmInstantAuthByNotifyIsConfirmedDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static RestoreConfirmInstantAuthByNotifyIsConfirmedDto valueOf(String str) {
        return (RestoreConfirmInstantAuthByNotifyIsConfirmedDto) Enum.valueOf(RestoreConfirmInstantAuthByNotifyIsConfirmedDto.class, str);
    }

    public static RestoreConfirmInstantAuthByNotifyIsConfirmedDto[] values() {
        return (RestoreConfirmInstantAuthByNotifyIsConfirmedDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
