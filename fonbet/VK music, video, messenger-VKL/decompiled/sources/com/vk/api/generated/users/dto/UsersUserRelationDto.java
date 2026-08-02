package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersUserRelationDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserRelationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersUserRelationDto[] $VALUES;

    @pmi0("6")
    public static final UsersUserRelationDto ACTIVELY_SEARCHING;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final UsersUserRelationDto COMPLICATED;
    public static final Parcelable.Creator<UsersUserRelationDto> CREATOR;

    @pmi0("3")
    public static final UsersUserRelationDto ENGAGED;

    @pmi0("8")
    public static final UsersUserRelationDto IN_A_CIVIL_UNION;

    @pmi0("2")
    public static final UsersUserRelationDto IN_A_RELATIONSHIP;

    @pmi0(Gc.e)
    public static final UsersUserRelationDto IN_LOVE;

    @pmi0("4")
    public static final UsersUserRelationDto MARRIED;

    @pmi0("0")
    public static final UsersUserRelationDto NOT_SPECIFIED;

    @pmi0("1")
    public static final UsersUserRelationDto SINGLE;
    private final int value;

    /* compiled from: UsersUserRelationDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserRelationDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserRelationDto createFromParcel(Parcel parcel) {
            return UsersUserRelationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserRelationDto[] newArray(int i) {
            return new UsersUserRelationDto[i];
        }
    }

    static {
        UsersUserRelationDto usersUserRelationDto = new UsersUserRelationDto("NOT_SPECIFIED", 0, 0);
        NOT_SPECIFIED = usersUserRelationDto;
        UsersUserRelationDto usersUserRelationDto2 = new UsersUserRelationDto("SINGLE", 1, 1);
        SINGLE = usersUserRelationDto2;
        UsersUserRelationDto usersUserRelationDto3 = new UsersUserRelationDto("IN_A_RELATIONSHIP", 2, 2);
        IN_A_RELATIONSHIP = usersUserRelationDto3;
        UsersUserRelationDto usersUserRelationDto4 = new UsersUserRelationDto("ENGAGED", 3, 3);
        ENGAGED = usersUserRelationDto4;
        UsersUserRelationDto usersUserRelationDto5 = new UsersUserRelationDto("MARRIED", 4, 4);
        MARRIED = usersUserRelationDto5;
        UsersUserRelationDto usersUserRelationDto6 = new UsersUserRelationDto("COMPLICATED", 5, 5);
        COMPLICATED = usersUserRelationDto6;
        UsersUserRelationDto usersUserRelationDto7 = new UsersUserRelationDto("ACTIVELY_SEARCHING", 6, 6);
        ACTIVELY_SEARCHING = usersUserRelationDto7;
        UsersUserRelationDto usersUserRelationDto8 = new UsersUserRelationDto("IN_LOVE", 7, 7);
        IN_LOVE = usersUserRelationDto8;
        UsersUserRelationDto usersUserRelationDto9 = new UsersUserRelationDto("IN_A_CIVIL_UNION", 8, 8);
        IN_A_CIVIL_UNION = usersUserRelationDto9;
        UsersUserRelationDto[] usersUserRelationDtoArr = {usersUserRelationDto, usersUserRelationDto2, usersUserRelationDto3, usersUserRelationDto4, usersUserRelationDto5, usersUserRelationDto6, usersUserRelationDto7, usersUserRelationDto8, usersUserRelationDto9};
        $VALUES = usersUserRelationDtoArr;
        $ENTRIES = new asp(usersUserRelationDtoArr);
        CREATOR = new a();
    }

    private UsersUserRelationDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersUserRelationDto valueOf(String str) {
        return (UsersUserRelationDto) Enum.valueOf(UsersUserRelationDto.class, str);
    }

    public static UsersUserRelationDto[] values() {
        return (UsersUserRelationDto[]) $VALUES.clone();
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
