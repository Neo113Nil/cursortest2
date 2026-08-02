package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsSetActionShownShowTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsSetActionShownShowTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsSetActionShownShowTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsSetActionShownShowTypeDto> CREATOR;

    @pmi0("on_close")
    public static final AppsSetActionShownShowTypeDto ON_CLOSE;

    @pmi0("on_start")
    public static final AppsSetActionShownShowTypeDto ON_START;
    private final String value;

    /* compiled from: AppsSetActionShownShowTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsSetActionShownShowTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSetActionShownShowTypeDto createFromParcel(Parcel parcel) {
            return AppsSetActionShownShowTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSetActionShownShowTypeDto[] newArray(int i) {
            return new AppsSetActionShownShowTypeDto[i];
        }
    }

    static {
        AppsSetActionShownShowTypeDto appsSetActionShownShowTypeDto = new AppsSetActionShownShowTypeDto("ON_CLOSE", 0, "on_close");
        ON_CLOSE = appsSetActionShownShowTypeDto;
        AppsSetActionShownShowTypeDto appsSetActionShownShowTypeDto2 = new AppsSetActionShownShowTypeDto("ON_START", 1, "on_start");
        ON_START = appsSetActionShownShowTypeDto2;
        AppsSetActionShownShowTypeDto[] appsSetActionShownShowTypeDtoArr = {appsSetActionShownShowTypeDto, appsSetActionShownShowTypeDto2};
        $VALUES = appsSetActionShownShowTypeDtoArr;
        $ENTRIES = new asp(appsSetActionShownShowTypeDtoArr);
        CREATOR = new a();
    }

    private AppsSetActionShownShowTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsSetActionShownShowTypeDto valueOf(String str) {
        return (AppsSetActionShownShowTypeDto) Enum.valueOf(AppsSetActionShownShowTypeDto.class, str);
    }

    public static AppsSetActionShownShowTypeDto[] values() {
        return (AppsSetActionShownShowTypeDto[]) $VALUES.clone();
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
