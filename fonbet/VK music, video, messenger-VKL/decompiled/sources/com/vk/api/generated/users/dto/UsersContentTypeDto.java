package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersContentTypeDto.kt */
/* loaded from: classes15.dex */
public final class UsersContentTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersContentTypeDto[] $VALUES;

    @pmi0("archive_wall")
    public static final UsersContentTypeDto ARCHIVE_WALL;

    @pmi0("articles")
    public static final UsersContentTypeDto ARTICLES;

    @pmi0("audios")
    public static final UsersContentTypeDto AUDIOS;

    @pmi0("audios_playlists")
    public static final UsersContentTypeDto AUDIOS_PLAYLISTS;
    public static final Parcelable.Creator<UsersContentTypeDto> CREATOR;

    @pmi0("donut")
    public static final UsersContentTypeDto DONUT;

    @pmi0("gifts")
    public static final UsersContentTypeDto GIFTS;

    @pmi0(X3.i.Z)
    public static final UsersContentTypeDto MAIN;

    @pmi0("narratives")
    public static final UsersContentTypeDto NARRATIVES;

    @pmi0("photos")
    public static final UsersContentTypeDto PHOTOS;

    @pmi0("photos_albums")
    public static final UsersContentTypeDto PHOTOS_ALBUMS;

    @pmi0("short_videos")
    public static final UsersContentTypeDto SHORT_VIDEOS;

    @pmi0("short_videos_playlists")
    public static final UsersContentTypeDto SHORT_VIDEOS_PLAYLISTS;

    @pmi0("videos")
    public static final UsersContentTypeDto VIDEOS;

    @pmi0("videos_playlists")
    public static final UsersContentTypeDto VIDEOS_PLAYLISTS;

    @pmi0("wall")
    public static final UsersContentTypeDto WALL;
    private final String value;

    /* compiled from: UsersContentTypeDto.kt */
    public static final class a implements Parcelable.Creator<UsersContentTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersContentTypeDto createFromParcel(Parcel parcel) {
            return UsersContentTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersContentTypeDto[] newArray(int i) {
            return new UsersContentTypeDto[i];
        }
    }

    static {
        UsersContentTypeDto usersContentTypeDto = new UsersContentTypeDto("PHOTOS", 0, "photos");
        PHOTOS = usersContentTypeDto;
        UsersContentTypeDto usersContentTypeDto2 = new UsersContentTypeDto("PHOTOS_ALBUMS", 1, "photos_albums");
        PHOTOS_ALBUMS = usersContentTypeDto2;
        UsersContentTypeDto usersContentTypeDto3 = new UsersContentTypeDto("SHORT_VIDEOS", 2, "short_videos");
        SHORT_VIDEOS = usersContentTypeDto3;
        UsersContentTypeDto usersContentTypeDto4 = new UsersContentTypeDto("SHORT_VIDEOS_PLAYLISTS", 3, "short_videos_playlists");
        SHORT_VIDEOS_PLAYLISTS = usersContentTypeDto4;
        UsersContentTypeDto usersContentTypeDto5 = new UsersContentTypeDto("VIDEOS", 4, "videos");
        VIDEOS = usersContentTypeDto5;
        UsersContentTypeDto usersContentTypeDto6 = new UsersContentTypeDto("VIDEOS_PLAYLISTS", 5, "videos_playlists");
        VIDEOS_PLAYLISTS = usersContentTypeDto6;
        UsersContentTypeDto usersContentTypeDto7 = new UsersContentTypeDto("AUDIOS", 6, "audios");
        AUDIOS = usersContentTypeDto7;
        UsersContentTypeDto usersContentTypeDto8 = new UsersContentTypeDto("AUDIOS_PLAYLISTS", 7, "audios_playlists");
        AUDIOS_PLAYLISTS = usersContentTypeDto8;
        UsersContentTypeDto usersContentTypeDto9 = new UsersContentTypeDto("NARRATIVES", 8, "narratives");
        NARRATIVES = usersContentTypeDto9;
        UsersContentTypeDto usersContentTypeDto10 = new UsersContentTypeDto("ARTICLES", 9, "articles");
        ARTICLES = usersContentTypeDto10;
        UsersContentTypeDto usersContentTypeDto11 = new UsersContentTypeDto("WALL", 10, "wall");
        WALL = usersContentTypeDto11;
        UsersContentTypeDto usersContentTypeDto12 = new UsersContentTypeDto("ARCHIVE_WALL", 11, "archive_wall");
        ARCHIVE_WALL = usersContentTypeDto12;
        UsersContentTypeDto usersContentTypeDto13 = new UsersContentTypeDto("MAIN", 12, X3.i.Z);
        MAIN = usersContentTypeDto13;
        UsersContentTypeDto usersContentTypeDto14 = new UsersContentTypeDto("DONUT", 13, "donut");
        DONUT = usersContentTypeDto14;
        UsersContentTypeDto usersContentTypeDto15 = new UsersContentTypeDto("GIFTS", 14, "gifts");
        GIFTS = usersContentTypeDto15;
        UsersContentTypeDto[] usersContentTypeDtoArr = {usersContentTypeDto, usersContentTypeDto2, usersContentTypeDto3, usersContentTypeDto4, usersContentTypeDto5, usersContentTypeDto6, usersContentTypeDto7, usersContentTypeDto8, usersContentTypeDto9, usersContentTypeDto10, usersContentTypeDto11, usersContentTypeDto12, usersContentTypeDto13, usersContentTypeDto14, usersContentTypeDto15};
        $VALUES = usersContentTypeDtoArr;
        $ENTRIES = new asp(usersContentTypeDtoArr);
        CREATOR = new a();
    }

    private UsersContentTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<UsersContentTypeDto> i() {
        return $ENTRIES;
    }

    public static UsersContentTypeDto valueOf(String str) {
        return (UsersContentTypeDto) Enum.valueOf(UsersContentTypeDto.class, str);
    }

    public static UsersContentTypeDto[] values() {
        return (UsersContentTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
