package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsGetSettingsNewResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGetSettingsNewResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsGetSettingsNewResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final NotificationsNotificationSettingsSectionItemDto items;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("videos")
    private final List<VideoVideoDto> videos;

    /* compiled from: NotificationsGetSettingsNewResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGetSettingsNewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGetSettingsNewResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5 = null;
            NotificationsNotificationSettingsSectionItemDto createFromParcel = parcel.readInt() == 0 ? null : NotificationsNotificationSettingsSectionItemDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NotificationsGetSettingsNewResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(NotificationsGetSettingsNewResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(NotificationsGetSettingsNewResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(NotificationsGetSettingsNewResponseDto.class, parcel, arrayList4, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(NotificationsGetSettingsNewResponseDto.class, parcel, arrayList5, i, 1);
                }
            }
            return new NotificationsGetSettingsNewResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGetSettingsNewResponseDto[] newArray(int i) {
            return new NotificationsGetSettingsNewResponseDto[i];
        }
    }

    public NotificationsGetSettingsNewResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGetSettingsNewResponseDto)) {
            return false;
        }
        NotificationsGetSettingsNewResponseDto notificationsGetSettingsNewResponseDto = (NotificationsGetSettingsNewResponseDto) obj;
        return epx.f(this.items, notificationsGetSettingsNewResponseDto.items) && epx.f(this.profiles, notificationsGetSettingsNewResponseDto.profiles) && epx.f(this.groups, notificationsGetSettingsNewResponseDto.groups) && epx.f(this.photos, notificationsGetSettingsNewResponseDto.photos) && epx.f(this.videos, notificationsGetSettingsNewResponseDto.videos) && epx.f(this.apps, notificationsGetSettingsNewResponseDto.apps);
    }

    public final int hashCode() {
        NotificationsNotificationSettingsSectionItemDto notificationsNotificationSettingsSectionItemDto = this.items;
        int hashCode = (notificationsNotificationSettingsSectionItemDto == null ? 0 : notificationsNotificationSettingsSectionItemDto.hashCode()) * 31;
        List<UsersUserDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhotosPhotoDto> list3 = this.photos;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VideoVideoDto> list4 = this.videos;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<AppsAppDto> list5 = this.apps;
        return hashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsGetSettingsNewResponseDto(items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", photos=");
        sb.append(this.photos);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", apps=");
        return ms9.a(')', sb, this.apps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NotificationsNotificationSettingsSectionItemDto notificationsNotificationSettingsSectionItemDto = this.items;
        if (notificationsNotificationSettingsSectionItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingsSectionItemDto.writeToParcel(parcel, i);
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
        List<VideoVideoDto> list4 = this.videos;
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
            return;
        }
        Iterator f5 = dn.f(parcel, list5, 1);
        while (f5.hasNext()) {
            parcel.writeParcelable((Parcelable) f5.next(), i);
        }
    }

    public NotificationsGetSettingsNewResponseDto(NotificationsNotificationSettingsSectionItemDto notificationsNotificationSettingsSectionItemDto, List<UsersUserDto> list, List<GroupsGroupFullDto> list2, List<PhotosPhotoDto> list3, List<VideoVideoDto> list4, List<AppsAppDto> list5) {
        this.items = notificationsNotificationSettingsSectionItemDto;
        this.profiles = list;
        this.groups = list2;
        this.photos = list3;
        this.videos = list4;
        this.apps = list5;
    }

    public /* synthetic */ NotificationsGetSettingsNewResponseDto(NotificationsNotificationSettingsSectionItemDto notificationsNotificationSettingsSectionItemDto, List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : notificationsNotificationSettingsSectionItemDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5);
    }
}
