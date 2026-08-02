package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreWidgetsBaseActionTypeDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseActionTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ExploreWidgetsBaseActionTypeDto[] $VALUES;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    public static final ExploreWidgetsBaseActionTypeDto CALL;

    @pmi0("clear_recent")
    public static final ExploreWidgetsBaseActionTypeDto CLEAR_RECENT;
    public static final Parcelable.Creator<ExploreWidgetsBaseActionTypeDto> CREATOR;

    @pmi0("grant_access")
    public static final ExploreWidgetsBaseActionTypeDto GRANT_ACCESS;

    @pmi0("locality_picker")
    public static final ExploreWidgetsBaseActionTypeDto LOCALITY_PICKER;

    @pmi0("open_game")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_GAME;

    @pmi0("open_games_section")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_GAMES_SECTION;

    @pmi0("open_mini_app")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_MINI_APP;

    @pmi0("open_native_app")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_NATIVE_APP;

    @pmi0("open_section")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_SECTION;

    @pmi0("open_url")
    public static final ExploreWidgetsBaseActionTypeDto OPEN_URL;

    @pmi0("redesign_v3_header")
    public static final ExploreWidgetsBaseActionTypeDto REDESIGN_V3_HEADER;

    @pmi0("send_message")
    public static final ExploreWidgetsBaseActionTypeDto SEND_MESSAGE;
    private final String value;

    /* compiled from: ExploreWidgetsBaseActionTypeDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseActionTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseActionTypeDto createFromParcel(Parcel parcel) {
            return ExploreWidgetsBaseActionTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseActionTypeDto[] newArray(int i) {
            return new ExploreWidgetsBaseActionTypeDto[i];
        }
    }

    static {
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto = new ExploreWidgetsBaseActionTypeDto("OPEN_URL", 0, "open_url");
        OPEN_URL = exploreWidgetsBaseActionTypeDto;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto2 = new ExploreWidgetsBaseActionTypeDto("OPEN_MINI_APP", 1, "open_mini_app");
        OPEN_MINI_APP = exploreWidgetsBaseActionTypeDto2;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto3 = new ExploreWidgetsBaseActionTypeDto("OPEN_GAMES_SECTION", 2, "open_games_section");
        OPEN_GAMES_SECTION = exploreWidgetsBaseActionTypeDto3;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto4 = new ExploreWidgetsBaseActionTypeDto("OPEN_SECTION", 3, "open_section");
        OPEN_SECTION = exploreWidgetsBaseActionTypeDto4;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto5 = new ExploreWidgetsBaseActionTypeDto("OPEN_GAME", 4, "open_game");
        OPEN_GAME = exploreWidgetsBaseActionTypeDto5;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto6 = new ExploreWidgetsBaseActionTypeDto("OPEN_NATIVE_APP", 5, "open_native_app");
        OPEN_NATIVE_APP = exploreWidgetsBaseActionTypeDto6;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto7 = new ExploreWidgetsBaseActionTypeDto("GRANT_ACCESS", 6, "grant_access");
        GRANT_ACCESS = exploreWidgetsBaseActionTypeDto7;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto8 = new ExploreWidgetsBaseActionTypeDto("SEND_MESSAGE", 7, "send_message");
        SEND_MESSAGE = exploreWidgetsBaseActionTypeDto8;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto9 = new ExploreWidgetsBaseActionTypeDto("LOCALITY_PICKER", 8, "locality_picker");
        LOCALITY_PICKER = exploreWidgetsBaseActionTypeDto9;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto10 = new ExploreWidgetsBaseActionTypeDto("CALL", 9, NotificationCompat.CATEGORY_CALL);
        CALL = exploreWidgetsBaseActionTypeDto10;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto11 = new ExploreWidgetsBaseActionTypeDto("REDESIGN_V3_HEADER", 10, "redesign_v3_header");
        REDESIGN_V3_HEADER = exploreWidgetsBaseActionTypeDto11;
        ExploreWidgetsBaseActionTypeDto exploreWidgetsBaseActionTypeDto12 = new ExploreWidgetsBaseActionTypeDto("CLEAR_RECENT", 11, "clear_recent");
        CLEAR_RECENT = exploreWidgetsBaseActionTypeDto12;
        ExploreWidgetsBaseActionTypeDto[] exploreWidgetsBaseActionTypeDtoArr = {exploreWidgetsBaseActionTypeDto, exploreWidgetsBaseActionTypeDto2, exploreWidgetsBaseActionTypeDto3, exploreWidgetsBaseActionTypeDto4, exploreWidgetsBaseActionTypeDto5, exploreWidgetsBaseActionTypeDto6, exploreWidgetsBaseActionTypeDto7, exploreWidgetsBaseActionTypeDto8, exploreWidgetsBaseActionTypeDto9, exploreWidgetsBaseActionTypeDto10, exploreWidgetsBaseActionTypeDto11, exploreWidgetsBaseActionTypeDto12};
        $VALUES = exploreWidgetsBaseActionTypeDtoArr;
        $ENTRIES = new asp(exploreWidgetsBaseActionTypeDtoArr);
        CREATOR = new a();
    }

    private ExploreWidgetsBaseActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static ExploreWidgetsBaseActionTypeDto valueOf(String str) {
        return (ExploreWidgetsBaseActionTypeDto) Enum.valueOf(ExploreWidgetsBaseActionTypeDto.class, str);
    }

    public static ExploreWidgetsBaseActionTypeDto[] values() {
        return (ExploreWidgetsBaseActionTypeDto[]) $VALUES.clone();
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
