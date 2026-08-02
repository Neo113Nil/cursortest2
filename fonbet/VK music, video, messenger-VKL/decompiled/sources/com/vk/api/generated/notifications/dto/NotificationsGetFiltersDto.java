package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsGetFiltersDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGetFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsGetFiltersDto[] $VALUES;

    @pmi0("comments")
    public static final NotificationsGetFiltersDto COMMENTS;
    public static final Parcelable.Creator<NotificationsGetFiltersDto> CREATOR;

    @pmi0("followers")
    public static final NotificationsGetFiltersDto FOLLOWERS;

    @pmi0("friends")
    public static final NotificationsGetFiltersDto FRIENDS;

    @pmi0("likes")
    public static final NotificationsGetFiltersDto LIKES;

    @pmi0("mentions")
    public static final NotificationsGetFiltersDto MENTIONS;

    @pmi0("reposted")
    public static final NotificationsGetFiltersDto REPOSTED;

    @pmi0("wall")
    public static final NotificationsGetFiltersDto WALL;
    private final String value;

    /* compiled from: NotificationsGetFiltersDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGetFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGetFiltersDto createFromParcel(Parcel parcel) {
            return NotificationsGetFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGetFiltersDto[] newArray(int i) {
            return new NotificationsGetFiltersDto[i];
        }
    }

    static {
        NotificationsGetFiltersDto notificationsGetFiltersDto = new NotificationsGetFiltersDto("WALL", 0, "wall");
        WALL = notificationsGetFiltersDto;
        NotificationsGetFiltersDto notificationsGetFiltersDto2 = new NotificationsGetFiltersDto("MENTIONS", 1, "mentions");
        MENTIONS = notificationsGetFiltersDto2;
        NotificationsGetFiltersDto notificationsGetFiltersDto3 = new NotificationsGetFiltersDto("COMMENTS", 2, "comments");
        COMMENTS = notificationsGetFiltersDto3;
        NotificationsGetFiltersDto notificationsGetFiltersDto4 = new NotificationsGetFiltersDto("LIKES", 3, "likes");
        LIKES = notificationsGetFiltersDto4;
        NotificationsGetFiltersDto notificationsGetFiltersDto5 = new NotificationsGetFiltersDto("REPOSTED", 4, "reposted");
        REPOSTED = notificationsGetFiltersDto5;
        NotificationsGetFiltersDto notificationsGetFiltersDto6 = new NotificationsGetFiltersDto("FOLLOWERS", 5, "followers");
        FOLLOWERS = notificationsGetFiltersDto6;
        NotificationsGetFiltersDto notificationsGetFiltersDto7 = new NotificationsGetFiltersDto(Privacy.FRIENDS, 6, "friends");
        FRIENDS = notificationsGetFiltersDto7;
        NotificationsGetFiltersDto[] notificationsGetFiltersDtoArr = {notificationsGetFiltersDto, notificationsGetFiltersDto2, notificationsGetFiltersDto3, notificationsGetFiltersDto4, notificationsGetFiltersDto5, notificationsGetFiltersDto6, notificationsGetFiltersDto7};
        $VALUES = notificationsGetFiltersDtoArr;
        $ENTRIES = new asp(notificationsGetFiltersDtoArr);
        CREATOR = new a();
    }

    private NotificationsGetFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static NotificationsGetFiltersDto valueOf(String str) {
        return (NotificationsGetFiltersDto) Enum.valueOf(NotificationsGetFiltersDto.class, str);
    }

    public static NotificationsGetFiltersDto[] values() {
        return (NotificationsGetFiltersDto[]) $VALUES.clone();
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
