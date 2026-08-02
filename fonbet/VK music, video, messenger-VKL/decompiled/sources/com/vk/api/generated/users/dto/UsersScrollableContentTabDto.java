package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersScrollableContentTabDto.kt */
/* loaded from: classes15.dex */
public final class UsersScrollableContentTabDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersScrollableContentTabDto[] $VALUES;

    @pmi0("archive_wall")
    public static final UsersScrollableContentTabDto ARCHIVE_WALL;

    @pmi0("articles")
    public static final UsersScrollableContentTabDto ARTICLES;

    @pmi0("audios")
    public static final UsersScrollableContentTabDto AUDIOS;
    public static final Parcelable.Creator<UsersScrollableContentTabDto> CREATOR;

    @pmi0("gifts")
    public static final UsersScrollableContentTabDto GIFTS;

    @pmi0(X3.i.Z)
    public static final UsersScrollableContentTabDto MAIN;

    @pmi0("narratives")
    public static final UsersScrollableContentTabDto NARRATIVES;

    @pmi0("photos")
    public static final UsersScrollableContentTabDto PHOTOS;

    @pmi0("short_videos")
    public static final UsersScrollableContentTabDto SHORT_VIDEOS;

    @pmi0("videos")
    public static final UsersScrollableContentTabDto VIDEOS;

    @pmi0("wall")
    public static final UsersScrollableContentTabDto WALL;
    private final String value;

    /* compiled from: UsersScrollableContentTabDto.kt */
    public static final class a implements Parcelable.Creator<UsersScrollableContentTabDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersScrollableContentTabDto createFromParcel(Parcel parcel) {
            return UsersScrollableContentTabDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersScrollableContentTabDto[] newArray(int i) {
            return new UsersScrollableContentTabDto[i];
        }
    }

    static {
        UsersScrollableContentTabDto usersScrollableContentTabDto = new UsersScrollableContentTabDto("WALL", 0, "wall");
        WALL = usersScrollableContentTabDto;
        UsersScrollableContentTabDto usersScrollableContentTabDto2 = new UsersScrollableContentTabDto("ARCHIVE_WALL", 1, "archive_wall");
        ARCHIVE_WALL = usersScrollableContentTabDto2;
        UsersScrollableContentTabDto usersScrollableContentTabDto3 = new UsersScrollableContentTabDto("PHOTOS", 2, "photos");
        PHOTOS = usersScrollableContentTabDto3;
        UsersScrollableContentTabDto usersScrollableContentTabDto4 = new UsersScrollableContentTabDto("SHORT_VIDEOS", 3, "short_videos");
        SHORT_VIDEOS = usersScrollableContentTabDto4;
        UsersScrollableContentTabDto usersScrollableContentTabDto5 = new UsersScrollableContentTabDto("VIDEOS", 4, "videos");
        VIDEOS = usersScrollableContentTabDto5;
        UsersScrollableContentTabDto usersScrollableContentTabDto6 = new UsersScrollableContentTabDto("AUDIOS", 5, "audios");
        AUDIOS = usersScrollableContentTabDto6;
        UsersScrollableContentTabDto usersScrollableContentTabDto7 = new UsersScrollableContentTabDto("NARRATIVES", 6, "narratives");
        NARRATIVES = usersScrollableContentTabDto7;
        UsersScrollableContentTabDto usersScrollableContentTabDto8 = new UsersScrollableContentTabDto("ARTICLES", 7, "articles");
        ARTICLES = usersScrollableContentTabDto8;
        UsersScrollableContentTabDto usersScrollableContentTabDto9 = new UsersScrollableContentTabDto("MAIN", 8, X3.i.Z);
        MAIN = usersScrollableContentTabDto9;
        UsersScrollableContentTabDto usersScrollableContentTabDto10 = new UsersScrollableContentTabDto("GIFTS", 9, "gifts");
        GIFTS = usersScrollableContentTabDto10;
        UsersScrollableContentTabDto[] usersScrollableContentTabDtoArr = {usersScrollableContentTabDto, usersScrollableContentTabDto2, usersScrollableContentTabDto3, usersScrollableContentTabDto4, usersScrollableContentTabDto5, usersScrollableContentTabDto6, usersScrollableContentTabDto7, usersScrollableContentTabDto8, usersScrollableContentTabDto9, usersScrollableContentTabDto10};
        $VALUES = usersScrollableContentTabDtoArr;
        $ENTRIES = new asp(usersScrollableContentTabDtoArr);
        CREATOR = new a();
    }

    private UsersScrollableContentTabDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersScrollableContentTabDto valueOf(String str) {
        return (UsersScrollableContentTabDto) Enum.valueOf(UsersScrollableContentTabDto.class, str);
    }

    public static UsersScrollableContentTabDto[] values() {
        return (UsersScrollableContentTabDto[]) $VALUES.clone();
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
