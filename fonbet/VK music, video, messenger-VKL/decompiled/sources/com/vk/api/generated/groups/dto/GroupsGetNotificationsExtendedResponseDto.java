package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.notifications.dto.NotificationsNotificationFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetNotificationsExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetNotificationsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetNotificationsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<NotificationsNotificationFullDto> items;

    @pmi0("new_from")
    private final String newFrom;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: GroupsGetNotificationsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetNotificationsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetNotificationsExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(NotificationsNotificationFullDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            String readString = parcel.readString();
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(GroupsGetNotificationsExtendedResponseDto.class, parcel, arrayList6, i3, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(GroupsGetNotificationsExtendedResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(GroupsGetNotificationsExtendedResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = bo.b(GroupsGetNotificationsExtendedResponseDto.class, parcel, arrayList7, i, 1);
                }
                arrayList5 = arrayList7;
            }
            return new GroupsGetNotificationsExtendedResponseDto(readInt, arrayList4, readString, arrayList, arrayList2, arrayList3, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetNotificationsExtendedResponseDto[] newArray(int i) {
            return new GroupsGetNotificationsExtendedResponseDto[i];
        }
    }

    public GroupsGetNotificationsExtendedResponseDto(int i, List<NotificationsNotificationFullDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<PhotosPhotoDto> list4, List<VideoVideoFullDto> list5) {
        this.count = i;
        this.items = list;
        this.newFrom = str;
        this.profiles = list2;
        this.groups = list3;
        this.photos = list4;
        this.videos = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetNotificationsExtendedResponseDto)) {
            return false;
        }
        GroupsGetNotificationsExtendedResponseDto groupsGetNotificationsExtendedResponseDto = (GroupsGetNotificationsExtendedResponseDto) obj;
        return this.count == groupsGetNotificationsExtendedResponseDto.count && epx.f(this.items, groupsGetNotificationsExtendedResponseDto.items) && epx.f(this.newFrom, groupsGetNotificationsExtendedResponseDto.newFrom) && epx.f(this.profiles, groupsGetNotificationsExtendedResponseDto.profiles) && epx.f(this.groups, groupsGetNotificationsExtendedResponseDto.groups) && epx.f(this.photos, groupsGetNotificationsExtendedResponseDto.photos) && epx.f(this.videos, groupsGetNotificationsExtendedResponseDto.videos);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.newFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.photos;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VideoVideoFullDto> list4 = this.videos;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetNotificationsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", newFrom=");
        sb.append(this.newFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        return ms9.a(')', sb, this.videos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NotificationsNotificationFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.newFrom);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<PhotosPhotoDto> list3 = this.photos;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<VideoVideoFullDto> list4 = this.videos;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public /* synthetic */ GroupsGetNotificationsExtendedResponseDto(int i, List list, String str, List list2, List list3, List list4, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5);
    }
}
