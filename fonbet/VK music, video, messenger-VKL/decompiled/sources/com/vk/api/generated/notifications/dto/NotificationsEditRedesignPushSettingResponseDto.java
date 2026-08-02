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

/* compiled from: NotificationsEditRedesignPushSettingResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsEditRedesignPushSettingResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsEditRedesignPushSettingResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("setting")
    private final NotificationsNotificationSettingRedesignDto setting;

    @pmi0("videos")
    private final List<VideoVideoDto> videos;

    /* compiled from: NotificationsEditRedesignPushSettingResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsEditRedesignPushSettingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignPushSettingResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5 = null;
            NotificationsNotificationSettingRedesignDto createFromParcel = parcel.readInt() == 0 ? null : NotificationsNotificationSettingRedesignDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NotificationsEditRedesignPushSettingResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(NotificationsEditRedesignPushSettingResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(NotificationsEditRedesignPushSettingResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(NotificationsEditRedesignPushSettingResponseDto.class, parcel, arrayList4, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(NotificationsEditRedesignPushSettingResponseDto.class, parcel, arrayList5, i, 1);
                }
            }
            return new NotificationsEditRedesignPushSettingResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsEditRedesignPushSettingResponseDto[] newArray(int i) {
            return new NotificationsEditRedesignPushSettingResponseDto[i];
        }
    }

    public NotificationsEditRedesignPushSettingResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final NotificationsNotificationSettingRedesignDto d() {
        return this.setting;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsEditRedesignPushSettingResponseDto)) {
            return false;
        }
        NotificationsEditRedesignPushSettingResponseDto notificationsEditRedesignPushSettingResponseDto = (NotificationsEditRedesignPushSettingResponseDto) obj;
        return epx.f(this.setting, notificationsEditRedesignPushSettingResponseDto.setting) && epx.f(this.profiles, notificationsEditRedesignPushSettingResponseDto.profiles) && epx.f(this.groups, notificationsEditRedesignPushSettingResponseDto.groups) && epx.f(this.photos, notificationsEditRedesignPushSettingResponseDto.photos) && epx.f(this.videos, notificationsEditRedesignPushSettingResponseDto.videos) && epx.f(this.apps, notificationsEditRedesignPushSettingResponseDto.apps);
    }

    public final int hashCode() {
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.setting;
        int hashCode = (notificationsNotificationSettingRedesignDto == null ? 0 : notificationsNotificationSettingRedesignDto.hashCode()) * 31;
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
        StringBuilder sb = new StringBuilder("NotificationsEditRedesignPushSettingResponseDto(setting=");
        sb.append(this.setting);
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
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = this.setting;
        if (notificationsNotificationSettingRedesignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationSettingRedesignDto.writeToParcel(parcel, i);
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

    public NotificationsEditRedesignPushSettingResponseDto(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, List<UsersUserDto> list, List<GroupsGroupFullDto> list2, List<PhotosPhotoDto> list3, List<VideoVideoDto> list4, List<AppsAppDto> list5) {
        this.setting = notificationsNotificationSettingRedesignDto;
        this.profiles = list;
        this.groups = list2;
        this.photos = list3;
        this.videos = list4;
        this.apps = list5;
    }

    public /* synthetic */ NotificationsEditRedesignPushSettingResponseDto(NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto, List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : notificationsNotificationSettingRedesignDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5);
    }
}
