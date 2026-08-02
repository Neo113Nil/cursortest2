package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetFriendsOrderDto.kt */
/* loaded from: classes14.dex */
public final class GetFriendsOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ GetFriendsOrderDto[] $VALUES;
    public static final Parcelable.Creator<GetFriendsOrderDto> CREATOR;

    @pmi0("hints")
    public static final GetFriendsOrderDto HINTS;

    @pmi0("mobile")
    public static final GetFriendsOrderDto MOBILE;

    @pmi0("name")
    public static final GetFriendsOrderDto NAME;

    @pmi0("random")
    public static final GetFriendsOrderDto RANDOM;

    @pmi0("smart")
    public static final GetFriendsOrderDto SMART;
    private final String value;

    /* compiled from: GetFriendsOrderDto.kt */
    public static final class a implements Parcelable.Creator<GetFriendsOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final GetFriendsOrderDto createFromParcel(Parcel parcel) {
            return GetFriendsOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GetFriendsOrderDto[] newArray(int i) {
            return new GetFriendsOrderDto[i];
        }
    }

    static {
        GetFriendsOrderDto getFriendsOrderDto = new GetFriendsOrderDto("HINTS", 0, "hints");
        HINTS = getFriendsOrderDto;
        GetFriendsOrderDto getFriendsOrderDto2 = new GetFriendsOrderDto("MOBILE", 1, "mobile");
        MOBILE = getFriendsOrderDto2;
        GetFriendsOrderDto getFriendsOrderDto3 = new GetFriendsOrderDto("NAME", 2, "name");
        NAME = getFriendsOrderDto3;
        GetFriendsOrderDto getFriendsOrderDto4 = new GetFriendsOrderDto("RANDOM", 3, "random");
        RANDOM = getFriendsOrderDto4;
        GetFriendsOrderDto getFriendsOrderDto5 = new GetFriendsOrderDto("SMART", 4, "smart");
        SMART = getFriendsOrderDto5;
        GetFriendsOrderDto[] getFriendsOrderDtoArr = {getFriendsOrderDto, getFriendsOrderDto2, getFriendsOrderDto3, getFriendsOrderDto4, getFriendsOrderDto5};
        $VALUES = getFriendsOrderDtoArr;
        $ENTRIES = new asp(getFriendsOrderDtoArr);
        CREATOR = new a();
    }

    private GetFriendsOrderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static GetFriendsOrderDto valueOf(String str) {
        return (GetFriendsOrderDto) Enum.valueOf(GetFriendsOrderDto.class, str);
    }

    public static GetFriendsOrderDto[] values() {
        return (GetFriendsOrderDto[]) $VALUES.clone();
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
