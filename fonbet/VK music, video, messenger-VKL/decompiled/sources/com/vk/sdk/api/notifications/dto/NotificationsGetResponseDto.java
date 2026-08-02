package com.vk.sdk.api.notifications.dto;

import com.vk.sdk.api.apps.dto.AppsAppDto;
import com.vk.sdk.api.groups.dto.GroupsGroupDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.users.dto.UsersUserDto;
import com.vk.sdk.api.video.dto.VideoVideoDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: NotificationsGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class NotificationsGetResponseDto {

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("items")
    private final List<NotificationsNotificationItemDto> items;

    @pmi0("last_viewed")
    private final Integer lastViewed;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("videos")
    private final List<VideoVideoDto> videos;

    public NotificationsGetResponseDto(int i, List<NotificationsNotificationItemDto> list, List<UsersUserDto> list2, List<GroupsGroupDto> list3, Integer num, List<PhotosPhotoDto> list4, List<VideoVideoDto> list5, List<AppsAppDto> list6, String str, Integer num2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.lastViewed = num;
        this.photos = list4;
        this.videos = list5;
        this.apps = list6;
        this.nextFrom = str;
        this.ttl = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGetResponseDto)) {
            return false;
        }
        NotificationsGetResponseDto notificationsGetResponseDto = (NotificationsGetResponseDto) obj;
        return this.count == notificationsGetResponseDto.count && epx.f(this.items, notificationsGetResponseDto.items) && epx.f(this.profiles, notificationsGetResponseDto.profiles) && epx.f(this.groups, notificationsGetResponseDto.groups) && epx.f(this.lastViewed, notificationsGetResponseDto.lastViewed) && epx.f(this.photos, notificationsGetResponseDto.photos) && epx.f(this.videos, notificationsGetResponseDto.videos) && epx.f(this.apps, notificationsGetResponseDto.apps) && epx.f(this.nextFrom, notificationsGetResponseDto.nextFrom) && epx.f(this.ttl, notificationsGetResponseDto.ttl);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.lastViewed;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.photos;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VideoVideoDto> list4 = this.videos;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AppsAppDto> list5 = this.apps;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.ttl;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<NotificationsNotificationItemDto> list = this.items;
        List<UsersUserDto> list2 = this.profiles;
        List<GroupsGroupDto> list3 = this.groups;
        Integer num = this.lastViewed;
        List<PhotosPhotoDto> list4 = this.photos;
        List<VideoVideoDto> list5 = this.videos;
        List<AppsAppDto> list6 = this.apps;
        String str = this.nextFrom;
        Integer num2 = this.ttl;
        StringBuilder c = zn.c(i, "NotificationsGetResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", lastViewed=");
        c.append(num);
        c.append(", photos=");
        c.append(list4);
        c.append(", videos=");
        vq.d(c, list5, ", apps=", list6, ", nextFrom=");
        c.append(str);
        c.append(", ttl=");
        c.append(num2);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ NotificationsGetResponseDto(int i, List list, List list2, List list3, Integer num, List list4, List list5, List list6, String str, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5, (i2 & 128) != 0 ? null : list6, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : num2);
    }
}
