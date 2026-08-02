package com.vk.sdk.api.notifications.dto;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsGetFiltersDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsGetFiltersDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsGetFiltersDto[] $VALUES;

    @pmi0("comments")
    public static final NotificationsGetFiltersDto COMMENTS;

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
}
