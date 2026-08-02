package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsInviteFriendActivityDto.kt */
/* loaded from: classes14.dex */
public final class AppsInviteFriendActivityDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsInviteFriendActivityDto[] $VALUES;
    public static final Parcelable.Creator<AppsInviteFriendActivityDto> CREATOR;

    @pmi0("halloween_2022_promo_game_activity")
    public static final AppsInviteFriendActivityDto HALLOWEEN_2022;

    @pmi0("halloween_2023_promo_game_activity")
    public static final AppsInviteFriendActivityDto HALLOWEEN_2023;

    @pmi0("ny_2022_promo_game_activity")
    public static final AppsInviteFriendActivityDto NY_2022;

    @pmi0("ny_2024_promo_game_activity")
    public static final AppsInviteFriendActivityDto NY_2024;
    private final String value;

    /* compiled from: AppsInviteFriendActivityDto.kt */
    public static final class a implements Parcelable.Creator<AppsInviteFriendActivityDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsInviteFriendActivityDto createFromParcel(Parcel parcel) {
            return AppsInviteFriendActivityDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsInviteFriendActivityDto[] newArray(int i) {
            return new AppsInviteFriendActivityDto[i];
        }
    }

    static {
        AppsInviteFriendActivityDto appsInviteFriendActivityDto = new AppsInviteFriendActivityDto("NY_2022", 0, "ny_2022_promo_game_activity");
        NY_2022 = appsInviteFriendActivityDto;
        AppsInviteFriendActivityDto appsInviteFriendActivityDto2 = new AppsInviteFriendActivityDto("HALLOWEEN_2022", 1, "halloween_2022_promo_game_activity");
        HALLOWEEN_2022 = appsInviteFriendActivityDto2;
        AppsInviteFriendActivityDto appsInviteFriendActivityDto3 = new AppsInviteFriendActivityDto("HALLOWEEN_2023", 2, "halloween_2023_promo_game_activity");
        HALLOWEEN_2023 = appsInviteFriendActivityDto3;
        AppsInviteFriendActivityDto appsInviteFriendActivityDto4 = new AppsInviteFriendActivityDto("NY_2024", 3, "ny_2024_promo_game_activity");
        NY_2024 = appsInviteFriendActivityDto4;
        AppsInviteFriendActivityDto[] appsInviteFriendActivityDtoArr = {appsInviteFriendActivityDto, appsInviteFriendActivityDto2, appsInviteFriendActivityDto3, appsInviteFriendActivityDto4};
        $VALUES = appsInviteFriendActivityDtoArr;
        $ENTRIES = new asp(appsInviteFriendActivityDtoArr);
        CREATOR = new a();
    }

    private AppsInviteFriendActivityDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsInviteFriendActivityDto valueOf(String str) {
        return (AppsInviteFriendActivityDto) Enum.valueOf(AppsInviteFriendActivityDto.class, str);
    }

    public static AppsInviteFriendActivityDto[] values() {
        return (AppsInviteFriendActivityDto[]) $VALUES.clone();
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
