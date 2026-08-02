package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedGetBannedFilterDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBannedFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedGetBannedFilterDto[] $VALUES;
    public static final Parcelable.Creator<NewsfeedGetBannedFilterDto> CREATOR;

    @pmi0("groups")
    public static final NewsfeedGetBannedFilterDto GROUPS;

    @pmi0("profiles")
    public static final NewsfeedGetBannedFilterDto PROFILES;
    private final String value;

    /* compiled from: NewsfeedGetBannedFilterDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBannedFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedFilterDto createFromParcel(Parcel parcel) {
            return NewsfeedGetBannedFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedFilterDto[] newArray(int i) {
            return new NewsfeedGetBannedFilterDto[i];
        }
    }

    static {
        NewsfeedGetBannedFilterDto newsfeedGetBannedFilterDto = new NewsfeedGetBannedFilterDto("GROUPS", 0, "groups");
        GROUPS = newsfeedGetBannedFilterDto;
        NewsfeedGetBannedFilterDto newsfeedGetBannedFilterDto2 = new NewsfeedGetBannedFilterDto("PROFILES", 1, "profiles");
        PROFILES = newsfeedGetBannedFilterDto2;
        NewsfeedGetBannedFilterDto[] newsfeedGetBannedFilterDtoArr = {newsfeedGetBannedFilterDto, newsfeedGetBannedFilterDto2};
        $VALUES = newsfeedGetBannedFilterDtoArr;
        $ENTRIES = new asp(newsfeedGetBannedFilterDtoArr);
        CREATOR = new a();
    }

    private NewsfeedGetBannedFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedGetBannedFilterDto valueOf(String str) {
        return (NewsfeedGetBannedFilterDto) Enum.valueOf(NewsfeedGetBannedFilterDto.class, str);
    }

    public static NewsfeedGetBannedFilterDto[] values() {
        return (NewsfeedGetBannedFilterDto[]) $VALUES.clone();
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
