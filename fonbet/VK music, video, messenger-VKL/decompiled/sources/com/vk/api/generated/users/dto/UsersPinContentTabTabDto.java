package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersPinContentTabTabDto.kt */
/* loaded from: classes15.dex */
public final class UsersPinContentTabTabDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersPinContentTabTabDto[] $VALUES;

    @pmi0("albums")
    public static final UsersPinContentTabTabDto ALBUMS;

    @pmi0("articles")
    public static final UsersPinContentTabTabDto ARTICLES;

    @pmi0("audios")
    public static final UsersPinContentTabTabDto AUDIOS;

    @pmi0("classifieds")
    public static final UsersPinContentTabTabDto CLASSIFIEDS;
    public static final Parcelable.Creator<UsersPinContentTabTabDto> CREATOR;

    @pmi0("donut_wall")
    public static final UsersPinContentTabTabDto DONUT_WALL;

    @pmi0("music")
    public static final UsersPinContentTabTabDto MUSIC;

    @pmi0("narratives")
    public static final UsersPinContentTabTabDto NARRATIVES;

    @pmi0("nfts")
    public static final UsersPinContentTabTabDto NFTS;

    @pmi0("photos")
    public static final UsersPinContentTabTabDto PHOTOS;

    @pmi0("short_videos")
    public static final UsersPinContentTabTabDto SHORT_VIDEOS;

    @pmi0("videos")
    public static final UsersPinContentTabTabDto VIDEOS;

    @pmi0("wall")
    public static final UsersPinContentTabTabDto WALL;
    private final String value;

    /* compiled from: UsersPinContentTabTabDto.kt */
    public static final class a implements Parcelable.Creator<UsersPinContentTabTabDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersPinContentTabTabDto createFromParcel(Parcel parcel) {
            return UsersPinContentTabTabDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersPinContentTabTabDto[] newArray(int i) {
            return new UsersPinContentTabTabDto[i];
        }
    }

    static {
        UsersPinContentTabTabDto usersPinContentTabTabDto = new UsersPinContentTabTabDto("ALBUMS", 0, "albums");
        ALBUMS = usersPinContentTabTabDto;
        UsersPinContentTabTabDto usersPinContentTabTabDto2 = new UsersPinContentTabTabDto("ARTICLES", 1, "articles");
        ARTICLES = usersPinContentTabTabDto2;
        UsersPinContentTabTabDto usersPinContentTabTabDto3 = new UsersPinContentTabTabDto("AUDIOS", 2, "audios");
        AUDIOS = usersPinContentTabTabDto3;
        UsersPinContentTabTabDto usersPinContentTabTabDto4 = new UsersPinContentTabTabDto("CLASSIFIEDS", 3, "classifieds");
        CLASSIFIEDS = usersPinContentTabTabDto4;
        UsersPinContentTabTabDto usersPinContentTabTabDto5 = new UsersPinContentTabTabDto("MUSIC", 4, "music");
        MUSIC = usersPinContentTabTabDto5;
        UsersPinContentTabTabDto usersPinContentTabTabDto6 = new UsersPinContentTabTabDto("NARRATIVES", 5, "narratives");
        NARRATIVES = usersPinContentTabTabDto6;
        UsersPinContentTabTabDto usersPinContentTabTabDto7 = new UsersPinContentTabTabDto("NFTS", 6, "nfts");
        NFTS = usersPinContentTabTabDto7;
        UsersPinContentTabTabDto usersPinContentTabTabDto8 = new UsersPinContentTabTabDto("PHOTOS", 7, "photos");
        PHOTOS = usersPinContentTabTabDto8;
        UsersPinContentTabTabDto usersPinContentTabTabDto9 = new UsersPinContentTabTabDto("SHORT_VIDEOS", 8, "short_videos");
        SHORT_VIDEOS = usersPinContentTabTabDto9;
        UsersPinContentTabTabDto usersPinContentTabTabDto10 = new UsersPinContentTabTabDto("VIDEOS", 9, "videos");
        VIDEOS = usersPinContentTabTabDto10;
        UsersPinContentTabTabDto usersPinContentTabTabDto11 = new UsersPinContentTabTabDto("WALL", 10, "wall");
        WALL = usersPinContentTabTabDto11;
        UsersPinContentTabTabDto usersPinContentTabTabDto12 = new UsersPinContentTabTabDto("DONUT_WALL", 11, "donut_wall");
        DONUT_WALL = usersPinContentTabTabDto12;
        UsersPinContentTabTabDto[] usersPinContentTabTabDtoArr = {usersPinContentTabTabDto, usersPinContentTabTabDto2, usersPinContentTabTabDto3, usersPinContentTabTabDto4, usersPinContentTabTabDto5, usersPinContentTabTabDto6, usersPinContentTabTabDto7, usersPinContentTabTabDto8, usersPinContentTabTabDto9, usersPinContentTabTabDto10, usersPinContentTabTabDto11, usersPinContentTabTabDto12};
        $VALUES = usersPinContentTabTabDtoArr;
        $ENTRIES = new asp(usersPinContentTabTabDtoArr);
        CREATOR = new a();
    }

    private UsersPinContentTabTabDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersPinContentTabTabDto valueOf(String str) {
        return (UsersPinContentTabTabDto) Enum.valueOf(UsersPinContentTabTabDto.class, str);
    }

    public static UsersPinContentTabTabDto[] values() {
        return (UsersPinContentTabTabDto[]) $VALUES.clone();
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
