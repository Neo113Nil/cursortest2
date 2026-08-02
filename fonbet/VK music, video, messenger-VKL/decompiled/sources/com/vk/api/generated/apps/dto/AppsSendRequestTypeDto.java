package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsSendRequestTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsSendRequestTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsSendRequestTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsSendRequestTypeDto> CREATOR;

    @pmi0("invite")
    public static final AppsSendRequestTypeDto INVITE;

    @pmi0("request")
    public static final AppsSendRequestTypeDto REQUEST;
    private final String value;

    /* compiled from: AppsSendRequestTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsSendRequestTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSendRequestTypeDto createFromParcel(Parcel parcel) {
            return AppsSendRequestTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSendRequestTypeDto[] newArray(int i) {
            return new AppsSendRequestTypeDto[i];
        }
    }

    static {
        AppsSendRequestTypeDto appsSendRequestTypeDto = new AppsSendRequestTypeDto("INVITE", 0, "invite");
        INVITE = appsSendRequestTypeDto;
        AppsSendRequestTypeDto appsSendRequestTypeDto2 = new AppsSendRequestTypeDto("REQUEST", 1, "request");
        REQUEST = appsSendRequestTypeDto2;
        AppsSendRequestTypeDto[] appsSendRequestTypeDtoArr = {appsSendRequestTypeDto, appsSendRequestTypeDto2};
        $VALUES = appsSendRequestTypeDtoArr;
        $ENTRIES = new asp(appsSendRequestTypeDtoArr);
        CREATOR = new a();
    }

    private AppsSendRequestTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsSendRequestTypeDto valueOf(String str) {
        return (AppsSendRequestTypeDto) Enum.valueOf(AppsSendRequestTypeDto.class, str);
    }

    public static AppsSendRequestTypeDto[] values() {
        return (AppsSendRequestTypeDto[]) $VALUES.clone();
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
