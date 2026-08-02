package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecDescriptionIconDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecDescriptionIconDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecDescriptionIconDto[] $VALUES;
    public static final Parcelable.Creator<FriendsRecDescriptionIconDto> CREATOR;

    @pmi0("education")
    public static final FriendsRecDescriptionIconDto EDUCATION;
    private final String value;

    /* compiled from: FriendsRecDescriptionIconDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecDescriptionIconDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecDescriptionIconDto createFromParcel(Parcel parcel) {
            return FriendsRecDescriptionIconDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecDescriptionIconDto[] newArray(int i) {
            return new FriendsRecDescriptionIconDto[i];
        }
    }

    static {
        FriendsRecDescriptionIconDto friendsRecDescriptionIconDto = new FriendsRecDescriptionIconDto("EDUCATION", 0, "education");
        EDUCATION = friendsRecDescriptionIconDto;
        FriendsRecDescriptionIconDto[] friendsRecDescriptionIconDtoArr = {friendsRecDescriptionIconDto};
        $VALUES = friendsRecDescriptionIconDtoArr;
        $ENTRIES = new asp(friendsRecDescriptionIconDtoArr);
        CREATOR = new a();
    }

    private FriendsRecDescriptionIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecDescriptionIconDto valueOf(String str) {
        return (FriendsRecDescriptionIconDto) Enum.valueOf(FriendsRecDescriptionIconDto.class, str);
    }

    public static FriendsRecDescriptionIconDto[] values() {
        return (FriendsRecDescriptionIconDto[]) $VALUES.clone();
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
