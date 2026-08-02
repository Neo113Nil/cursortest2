package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchHintSectionDto.kt */
/* loaded from: classes15.dex */
public final class SearchHintSectionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SearchHintSectionDto[] $VALUES;

    @pmi0("apps")
    public static final SearchHintSectionDto APPS;

    @pmi0("correspondents")
    public static final SearchHintSectionDto CORRESPONDENTS;
    public static final Parcelable.Creator<SearchHintSectionDto> CREATOR;

    @pmi0("direct_games")
    public static final SearchHintSectionDto DIRECT_GAMES;

    @pmi0("events")
    public static final SearchHintSectionDto EVENTS;

    @pmi0("friends")
    public static final SearchHintSectionDto FRIENDS;

    @pmi0("groups")
    public static final SearchHintSectionDto GROUPS;

    @pmi0("mutual_friends")
    public static final SearchHintSectionDto MUTUAL_FRIENDS;

    @pmi0("people")
    public static final SearchHintSectionDto PEOPLE;

    @pmi0(NotificationCompat.CATEGORY_PROMO)
    public static final SearchHintSectionDto PROMO;

    @pmi0("publics")
    public static final SearchHintSectionDto PUBLICS;

    @pmi0("vk_apps")
    public static final SearchHintSectionDto VK_APPS;
    private final String value;

    /* compiled from: SearchHintSectionDto.kt */
    public static final class a implements Parcelable.Creator<SearchHintSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchHintSectionDto createFromParcel(Parcel parcel) {
            return SearchHintSectionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchHintSectionDto[] newArray(int i) {
            return new SearchHintSectionDto[i];
        }
    }

    static {
        SearchHintSectionDto searchHintSectionDto = new SearchHintSectionDto("GROUPS", 0, "groups");
        GROUPS = searchHintSectionDto;
        SearchHintSectionDto searchHintSectionDto2 = new SearchHintSectionDto("EVENTS", 1, "events");
        EVENTS = searchHintSectionDto2;
        SearchHintSectionDto searchHintSectionDto3 = new SearchHintSectionDto("PUBLICS", 2, "publics");
        PUBLICS = searchHintSectionDto3;
        SearchHintSectionDto searchHintSectionDto4 = new SearchHintSectionDto("CORRESPONDENTS", 3, "correspondents");
        CORRESPONDENTS = searchHintSectionDto4;
        SearchHintSectionDto searchHintSectionDto5 = new SearchHintSectionDto("PEOPLE", 4, "people");
        PEOPLE = searchHintSectionDto5;
        SearchHintSectionDto searchHintSectionDto6 = new SearchHintSectionDto(Privacy.FRIENDS, 5, "friends");
        FRIENDS = searchHintSectionDto6;
        SearchHintSectionDto searchHintSectionDto7 = new SearchHintSectionDto("MUTUAL_FRIENDS", 6, "mutual_friends");
        MUTUAL_FRIENDS = searchHintSectionDto7;
        SearchHintSectionDto searchHintSectionDto8 = new SearchHintSectionDto("PROMO", 7, NotificationCompat.CATEGORY_PROMO);
        PROMO = searchHintSectionDto8;
        SearchHintSectionDto searchHintSectionDto9 = new SearchHintSectionDto("VK_APPS", 8, "vk_apps");
        VK_APPS = searchHintSectionDto9;
        SearchHintSectionDto searchHintSectionDto10 = new SearchHintSectionDto("APPS", 9, "apps");
        APPS = searchHintSectionDto10;
        SearchHintSectionDto searchHintSectionDto11 = new SearchHintSectionDto("DIRECT_GAMES", 10, "direct_games");
        DIRECT_GAMES = searchHintSectionDto11;
        SearchHintSectionDto[] searchHintSectionDtoArr = {searchHintSectionDto, searchHintSectionDto2, searchHintSectionDto3, searchHintSectionDto4, searchHintSectionDto5, searchHintSectionDto6, searchHintSectionDto7, searchHintSectionDto8, searchHintSectionDto9, searchHintSectionDto10, searchHintSectionDto11};
        $VALUES = searchHintSectionDtoArr;
        $ENTRIES = new asp(searchHintSectionDtoArr);
        CREATOR = new a();
    }

    private SearchHintSectionDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SearchHintSectionDto valueOf(String str) {
        return (SearchHintSectionDto) Enum.valueOf(SearchHintSectionDto.class, str);
    }

    public static SearchHintSectionDto[] values() {
        return (SearchHintSectionDto[]) $VALUES.clone();
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
