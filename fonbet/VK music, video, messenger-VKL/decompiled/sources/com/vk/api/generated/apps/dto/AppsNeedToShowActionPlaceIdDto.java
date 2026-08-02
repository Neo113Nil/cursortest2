package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsNeedToShowActionPlaceIdDto.kt */
/* loaded from: classes14.dex */
public final class AppsNeedToShowActionPlaceIdDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsNeedToShowActionPlaceIdDto[] $VALUES;

    @pmi0("close_confirmation")
    public static final AppsNeedToShowActionPlaceIdDto CLOSE_CONFIRMATION;

    @pmi0("close_confirmation_cache")
    public static final AppsNeedToShowActionPlaceIdDto CLOSE_CONFIRMATION_CACHE;
    public static final Parcelable.Creator<AppsNeedToShowActionPlaceIdDto> CREATOR;

    @pmi0(C4504q2.u)
    public static final AppsNeedToShowActionPlaceIdDto ORDER;

    @pmi0("start")
    public static final AppsNeedToShowActionPlaceIdDto START;
    private final String value;

    /* compiled from: AppsNeedToShowActionPlaceIdDto.kt */
    public static final class a implements Parcelable.Creator<AppsNeedToShowActionPlaceIdDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsNeedToShowActionPlaceIdDto createFromParcel(Parcel parcel) {
            return AppsNeedToShowActionPlaceIdDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsNeedToShowActionPlaceIdDto[] newArray(int i) {
            return new AppsNeedToShowActionPlaceIdDto[i];
        }
    }

    static {
        AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto = new AppsNeedToShowActionPlaceIdDto("CLOSE_CONFIRMATION", 0, "close_confirmation");
        CLOSE_CONFIRMATION = appsNeedToShowActionPlaceIdDto;
        AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto2 = new AppsNeedToShowActionPlaceIdDto("CLOSE_CONFIRMATION_CACHE", 1, "close_confirmation_cache");
        CLOSE_CONFIRMATION_CACHE = appsNeedToShowActionPlaceIdDto2;
        AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto3 = new AppsNeedToShowActionPlaceIdDto("ORDER", 2, C4504q2.u);
        ORDER = appsNeedToShowActionPlaceIdDto3;
        AppsNeedToShowActionPlaceIdDto appsNeedToShowActionPlaceIdDto4 = new AppsNeedToShowActionPlaceIdDto("START", 3, "start");
        START = appsNeedToShowActionPlaceIdDto4;
        AppsNeedToShowActionPlaceIdDto[] appsNeedToShowActionPlaceIdDtoArr = {appsNeedToShowActionPlaceIdDto, appsNeedToShowActionPlaceIdDto2, appsNeedToShowActionPlaceIdDto3, appsNeedToShowActionPlaceIdDto4};
        $VALUES = appsNeedToShowActionPlaceIdDtoArr;
        $ENTRIES = new asp(appsNeedToShowActionPlaceIdDtoArr);
        CREATOR = new a();
    }

    private AppsNeedToShowActionPlaceIdDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsNeedToShowActionPlaceIdDto valueOf(String str) {
        return (AppsNeedToShowActionPlaceIdDto) Enum.valueOf(AppsNeedToShowActionPlaceIdDto.class, str);
    }

    public static AppsNeedToShowActionPlaceIdDto[] values() {
        return (AppsNeedToShowActionPlaceIdDto[]) $VALUES.clone();
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
