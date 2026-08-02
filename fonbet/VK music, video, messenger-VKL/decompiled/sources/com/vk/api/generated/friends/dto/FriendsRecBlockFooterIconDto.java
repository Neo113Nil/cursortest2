package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockFooterIconDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockFooterIconDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockFooterIconDto[] $VALUES;

    @pmi0("chevron")
    public static final FriendsRecBlockFooterIconDto CHEVRON;
    public static final Parcelable.Creator<FriendsRecBlockFooterIconDto> CREATOR;
    private final String value;

    /* compiled from: FriendsRecBlockFooterIconDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockFooterIconDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockFooterIconDto createFromParcel(Parcel parcel) {
            return FriendsRecBlockFooterIconDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockFooterIconDto[] newArray(int i) {
            return new FriendsRecBlockFooterIconDto[i];
        }
    }

    static {
        FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto = new FriendsRecBlockFooterIconDto("CHEVRON", 0, "chevron");
        CHEVRON = friendsRecBlockFooterIconDto;
        FriendsRecBlockFooterIconDto[] friendsRecBlockFooterIconDtoArr = {friendsRecBlockFooterIconDto};
        $VALUES = friendsRecBlockFooterIconDtoArr;
        $ENTRIES = new asp(friendsRecBlockFooterIconDtoArr);
        CREATOR = new a();
    }

    private FriendsRecBlockFooterIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecBlockFooterIconDto valueOf(String str) {
        return (FriendsRecBlockFooterIconDto) Enum.valueOf(FriendsRecBlockFooterIconDto.class, str);
    }

    public static FriendsRecBlockFooterIconDto[] values() {
        return (FriendsRecBlockFooterIconDto[]) $VALUES.clone();
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
