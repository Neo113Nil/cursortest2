package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetSuggestionsFilterDto.kt */
/* loaded from: classes14.dex */
public final class FriendsGetSuggestionsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetSuggestionsFilterDto[] $VALUES;

    @pmi0("contacts")
    public static final FriendsGetSuggestionsFilterDto CONTACTS;
    public static final Parcelable.Creator<FriendsGetSuggestionsFilterDto> CREATOR;

    @pmi0("mutual")
    public static final FriendsGetSuggestionsFilterDto MUTUAL;

    @pmi0("mutual_contacts")
    public static final FriendsGetSuggestionsFilterDto MUTUAL_CONTACTS;
    private final String value;

    /* compiled from: FriendsGetSuggestionsFilterDto.kt */
    public static final class a implements Parcelable.Creator<FriendsGetSuggestionsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsGetSuggestionsFilterDto createFromParcel(Parcel parcel) {
            return FriendsGetSuggestionsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsGetSuggestionsFilterDto[] newArray(int i) {
            return new FriendsGetSuggestionsFilterDto[i];
        }
    }

    static {
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto = new FriendsGetSuggestionsFilterDto("CONTACTS", 0, "contacts");
        CONTACTS = friendsGetSuggestionsFilterDto;
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto2 = new FriendsGetSuggestionsFilterDto("MUTUAL", 1, "mutual");
        MUTUAL = friendsGetSuggestionsFilterDto2;
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto3 = new FriendsGetSuggestionsFilterDto("MUTUAL_CONTACTS", 2, "mutual_contacts");
        MUTUAL_CONTACTS = friendsGetSuggestionsFilterDto3;
        FriendsGetSuggestionsFilterDto[] friendsGetSuggestionsFilterDtoArr = {friendsGetSuggestionsFilterDto, friendsGetSuggestionsFilterDto2, friendsGetSuggestionsFilterDto3};
        $VALUES = friendsGetSuggestionsFilterDtoArr;
        $ENTRIES = new asp(friendsGetSuggestionsFilterDtoArr);
        CREATOR = new a();
    }

    private FriendsGetSuggestionsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsGetSuggestionsFilterDto valueOf(String str) {
        return (FriendsGetSuggestionsFilterDto) Enum.valueOf(FriendsGetSuggestionsFilterDto.class, str);
    }

    public static FriendsGetSuggestionsFilterDto[] values() {
        return (FriendsGetSuggestionsFilterDto[]) $VALUES.clone();
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
