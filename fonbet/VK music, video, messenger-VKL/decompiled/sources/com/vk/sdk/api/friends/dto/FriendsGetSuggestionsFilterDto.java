package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetSuggestionsFilterDto.kt */
/* loaded from: classes5.dex */
public final class FriendsGetSuggestionsFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetSuggestionsFilterDto[] $VALUES;

    @pmi0("contacts")
    public static final FriendsGetSuggestionsFilterDto CONTACTS;

    @pmi0("mutual")
    public static final FriendsGetSuggestionsFilterDto MUTUAL;

    @pmi0("mutual_contacts")
    public static final FriendsGetSuggestionsFilterDto MUTUAL_CONTACTS;
    private final String value;

    static {
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto = new FriendsGetSuggestionsFilterDto("MUTUAL", 0, "mutual");
        MUTUAL = friendsGetSuggestionsFilterDto;
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto2 = new FriendsGetSuggestionsFilterDto("CONTACTS", 1, "contacts");
        CONTACTS = friendsGetSuggestionsFilterDto2;
        FriendsGetSuggestionsFilterDto friendsGetSuggestionsFilterDto3 = new FriendsGetSuggestionsFilterDto("MUTUAL_CONTACTS", 2, "mutual_contacts");
        MUTUAL_CONTACTS = friendsGetSuggestionsFilterDto3;
        FriendsGetSuggestionsFilterDto[] friendsGetSuggestionsFilterDtoArr = {friendsGetSuggestionsFilterDto, friendsGetSuggestionsFilterDto2, friendsGetSuggestionsFilterDto3};
        $VALUES = friendsGetSuggestionsFilterDtoArr;
        $ENTRIES = new asp(friendsGetSuggestionsFilterDtoArr);
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
}
