package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewsfeedAddBanTypeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedAddBanTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NewsfeedAddBanTypeDto[] $VALUES;

    @pmi0("always")
    public static final NewsfeedAddBanTypeDto ALWAYS;
    public static final Parcelable.Creator<NewsfeedAddBanTypeDto> CREATOR;

    @pmi0("week")
    public static final NewsfeedAddBanTypeDto WEEK;
    private final String value;

    /* compiled from: NewsfeedAddBanTypeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedAddBanTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedAddBanTypeDto createFromParcel(Parcel parcel) {
            return NewsfeedAddBanTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedAddBanTypeDto[] newArray(int i) {
            return new NewsfeedAddBanTypeDto[i];
        }
    }

    static {
        NewsfeedAddBanTypeDto newsfeedAddBanTypeDto = new NewsfeedAddBanTypeDto("ALWAYS", 0, "always");
        ALWAYS = newsfeedAddBanTypeDto;
        NewsfeedAddBanTypeDto newsfeedAddBanTypeDto2 = new NewsfeedAddBanTypeDto("WEEK", 1, "week");
        WEEK = newsfeedAddBanTypeDto2;
        NewsfeedAddBanTypeDto[] newsfeedAddBanTypeDtoArr = {newsfeedAddBanTypeDto, newsfeedAddBanTypeDto2};
        $VALUES = newsfeedAddBanTypeDtoArr;
        $ENTRIES = new asp(newsfeedAddBanTypeDtoArr);
        CREATOR = new a();
    }

    private NewsfeedAddBanTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NewsfeedAddBanTypeDto valueOf(String str) {
        return (NewsfeedAddBanTypeDto) Enum.valueOf(NewsfeedAddBanTypeDto.class, str);
    }

    public static NewsfeedAddBanTypeDto[] values() {
        return (NewsfeedAddBanTypeDto[]) $VALUES.clone();
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
