package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersContentTabDto.kt */
/* loaded from: classes15.dex */
public final class UsersContentTabDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersContentTabDto[] $VALUES;

    @pmi0("albums")
    public static final UsersContentTabDto ALBUMS;

    @pmi0("articles")
    public static final UsersContentTabDto ARTICLES;

    @pmi0("classifieds")
    public static final UsersContentTabDto CLASSIFIEDS;
    public static final Parcelable.Creator<UsersContentTabDto> CREATOR;

    @pmi0("donut_wall")
    public static final UsersContentTabDto DONUT_WALL;

    @pmi0("gifts")
    public static final UsersContentTabDto GIFTS;

    @pmi0("music")
    public static final UsersContentTabDto MUSIC;

    @pmi0("narratives")
    public static final UsersContentTabDto NARRATIVES;

    @pmi0("nfts")
    public static final UsersContentTabDto NFTS;

    @pmi0("photos")
    public static final UsersContentTabDto PHOTOS;

    @pmi0("short_videos")
    public static final UsersContentTabDto SHORT_VIDEOS;

    @pmi0("videos")
    public static final UsersContentTabDto VIDEOS;
    private final String value;

    /* compiled from: UsersContentTabDto.kt */
    public static final class a implements Parcelable.Creator<UsersContentTabDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersContentTabDto createFromParcel(Parcel parcel) {
            return UsersContentTabDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersContentTabDto[] newArray(int i) {
            return new UsersContentTabDto[i];
        }
    }

    static {
        UsersContentTabDto usersContentTabDto = new UsersContentTabDto("ALBUMS", 0, "albums");
        ALBUMS = usersContentTabDto;
        UsersContentTabDto usersContentTabDto2 = new UsersContentTabDto("PHOTOS", 1, "photos");
        PHOTOS = usersContentTabDto2;
        UsersContentTabDto usersContentTabDto3 = new UsersContentTabDto("SHORT_VIDEOS", 2, "short_videos");
        SHORT_VIDEOS = usersContentTabDto3;
        UsersContentTabDto usersContentTabDto4 = new UsersContentTabDto("VIDEOS", 3, "videos");
        VIDEOS = usersContentTabDto4;
        UsersContentTabDto usersContentTabDto5 = new UsersContentTabDto("MUSIC", 4, "music");
        MUSIC = usersContentTabDto5;
        UsersContentTabDto usersContentTabDto6 = new UsersContentTabDto("NARRATIVES", 5, "narratives");
        NARRATIVES = usersContentTabDto6;
        UsersContentTabDto usersContentTabDto7 = new UsersContentTabDto("ARTICLES", 6, "articles");
        ARTICLES = usersContentTabDto7;
        UsersContentTabDto usersContentTabDto8 = new UsersContentTabDto("CLASSIFIEDS", 7, "classifieds");
        CLASSIFIEDS = usersContentTabDto8;
        UsersContentTabDto usersContentTabDto9 = new UsersContentTabDto("NFTS", 8, "nfts");
        NFTS = usersContentTabDto9;
        UsersContentTabDto usersContentTabDto10 = new UsersContentTabDto("DONUT_WALL", 9, "donut_wall");
        DONUT_WALL = usersContentTabDto10;
        UsersContentTabDto usersContentTabDto11 = new UsersContentTabDto("GIFTS", 10, "gifts");
        GIFTS = usersContentTabDto11;
        UsersContentTabDto[] usersContentTabDtoArr = {usersContentTabDto, usersContentTabDto2, usersContentTabDto3, usersContentTabDto4, usersContentTabDto5, usersContentTabDto6, usersContentTabDto7, usersContentTabDto8, usersContentTabDto9, usersContentTabDto10, usersContentTabDto11};
        $VALUES = usersContentTabDtoArr;
        $ENTRIES = new asp(usersContentTabDtoArr);
        CREATOR = new a();
    }

    private UsersContentTabDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersContentTabDto valueOf(String str) {
        return (UsersContentTabDto) Enum.valueOf(UsersContentTabDto.class, str);
    }

    public static UsersContentTabDto[] values() {
        return (UsersContentTabDto[]) $VALUES.clone();
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
