package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetBannedExtendedFilterDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBannedExtendedFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBannedExtendedFilterDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBannedExtendedFilterDto> CREATOR;

    @pmi0("groups")
    public static final NewsfeedGetBannedExtendedFilterDto GROUPS;

    @pmi0("profiles")
    public static final NewsfeedGetBannedExtendedFilterDto PROFILES;
    private final String value;

    /* compiled from: NewsfeedGetBannedExtendedFilterDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBannedExtendedFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedExtendedFilterDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBannedExtendedFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedExtendedFilterDto[] newArray(int i) {
            return new NewsfeedGetBannedExtendedFilterDto[i];
        }
    }

    static {
        NewsfeedGetBannedExtendedFilterDto newsfeedGetBannedExtendedFilterDto = new NewsfeedGetBannedExtendedFilterDto("GROUPS", 0, "groups");
        GROUPS = newsfeedGetBannedExtendedFilterDto;
        NewsfeedGetBannedExtendedFilterDto newsfeedGetBannedExtendedFilterDto2 = new NewsfeedGetBannedExtendedFilterDto("PROFILES", 1, "profiles");
        PROFILES = newsfeedGetBannedExtendedFilterDto2;
        NewsfeedGetBannedExtendedFilterDto[] newsfeedGetBannedExtendedFilterDtoArr = {newsfeedGetBannedExtendedFilterDto, newsfeedGetBannedExtendedFilterDto2};
        $VALUES = newsfeedGetBannedExtendedFilterDtoArr;
        $ENTRIES = new asp(newsfeedGetBannedExtendedFilterDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBannedExtendedFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetBannedExtendedFilterDto valueOf(String str) {
        return (NewsfeedGetBannedExtendedFilterDto) Enum.valueOf(NewsfeedGetBannedExtendedFilterDto.class, str);
    }

    public static NewsfeedGetBannedExtendedFilterDto[] values() {
        return (NewsfeedGetBannedExtendedFilterDto[]) $VALUES.clone();
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
