package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsAppLeaderboardTypeDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppLeaderboardTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsAppLeaderboardTypeDto[] $VALUES;
    public static final Parcelable.Creator<AppsAppLeaderboardTypeDto> CREATOR;

    @pmi0("1")
    public static final AppsAppLeaderboardTypeDto LEVELS;

    @pmi0("0")
    public static final AppsAppLeaderboardTypeDto NOT_SUPPORTED;

    @pmi0("2")
    public static final AppsAppLeaderboardTypeDto POINTS;
    private final int value;

    /* compiled from: AppsAppLeaderboardTypeDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppLeaderboardTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppLeaderboardTypeDto createFromParcel(Parcel parcel) {
            return AppsAppLeaderboardTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppLeaderboardTypeDto[] newArray(int i) {
            return new AppsAppLeaderboardTypeDto[i];
        }
    }

    static {
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto = new AppsAppLeaderboardTypeDto("NOT_SUPPORTED", 0, 0);
        NOT_SUPPORTED = appsAppLeaderboardTypeDto;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto2 = new AppsAppLeaderboardTypeDto("LEVELS", 1, 1);
        LEVELS = appsAppLeaderboardTypeDto2;
        AppsAppLeaderboardTypeDto appsAppLeaderboardTypeDto3 = new AppsAppLeaderboardTypeDto("POINTS", 2, 2);
        POINTS = appsAppLeaderboardTypeDto3;
        AppsAppLeaderboardTypeDto[] appsAppLeaderboardTypeDtoArr = {appsAppLeaderboardTypeDto, appsAppLeaderboardTypeDto2, appsAppLeaderboardTypeDto3};
        $VALUES = appsAppLeaderboardTypeDtoArr;
        $ENTRIES = new asp(appsAppLeaderboardTypeDtoArr);
        CREATOR = new a();
    }

    private AppsAppLeaderboardTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AppsAppLeaderboardTypeDto valueOf(String str) {
        return (AppsAppLeaderboardTypeDto) Enum.valueOf(AppsAppLeaderboardTypeDto.class, str);
    }

    public static AppsAppLeaderboardTypeDto[] values() {
        return (AppsAppLeaderboardTypeDto[]) $VALUES.clone();
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
