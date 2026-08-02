package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserDto;
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
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NotificationsGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsGetResponseDto> CREATOR = new a();

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
    private final List<VideoVideoFullDto> videos;

    /* compiled from: NotificationsGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(NotificationsNotificationItemDto.CREATOR, parcel, arrayList6, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(NotificationsGetResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(NotificationsGetResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(NotificationsGetResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(NotificationsGetResponseDto.class, parcel, arrayList4, i6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                while (i != readInt7) {
                    i = bo.b(NotificationsGetResponseDto.class, parcel, arrayList5, i, 1);
                }
            }
            return new NotificationsGetResponseDto(readInt, arrayList6, arrayList, arrayList2, valueOf, arrayList3, arrayList4, arrayList5, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGetResponseDto[] newArray(int i) {
            return new NotificationsGetResponseDto[i];
        }
    }

    public NotificationsGetResponseDto(int i, List<NotificationsNotificationItemDto> list, List<UsersUserDto> list2, List<GroupsGroupDto> list3, Integer num, List<PhotosPhotoDto> list4, List<VideoVideoFullDto> list5, List<AppsAppDto> list6, String str, Integer num2) {
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.lastViewed;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.photos;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VideoVideoFullDto> list4 = this.videos;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AppsAppDto> list5 = this.apps;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str = this.nextFrom;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.ttl;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", lastViewed=");
        sb.append(this.lastViewed);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", ttl=");
        return uqi.b(sb, this.ttl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NotificationsNotificationItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<UsersUserDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num = this.lastViewed;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<AppsAppDto> list5 = this.apps;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeString(this.nextFrom);
        Integer num2 = this.ttl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ NotificationsGetResponseDto(int i, List list, List list2, List list3, Integer num, List list4, List list5, List list6, String str, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list4, (i2 & 64) != 0 ? null : list5, (i2 & 128) != 0 ? null : list6, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : num2);
    }
}
