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
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsGetRedesignSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsGetRedesignSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsGetRedesignSettingsResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsAppDto> apps;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("photos")
    private final List<PhotosPhotoDto> photos;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    @pmi0("sections")
    private final List<NotificationsNotificationSettingsSectionRedesignDto> sections;

    @pmi0("videos")
    private final List<VideoVideoDto> videos;

    /* compiled from: NotificationsGetRedesignSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsGetRedesignSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsGetRedesignSettingsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int i = 0;
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(NotificationsNotificationSettingsSectionRedesignDto.CREATOR, parcel, arrayList7, i2, 1);
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(NotificationsGetRedesignSettingsResponseDto.class, parcel, arrayList8, i3, 1);
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(NotificationsGetRedesignSettingsResponseDto.class, parcel, arrayList9, i4, 1);
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(NotificationsGetRedesignSettingsResponseDto.class, parcel, arrayList10, i5, 1);
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = bo.b(NotificationsGetRedesignSettingsResponseDto.class, parcel, arrayList11, i6, 1);
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = bo.b(NotificationsGetRedesignSettingsResponseDto.class, parcel, arrayList6, i, 1);
                }
            }
            return new NotificationsGetRedesignSettingsResponseDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsGetRedesignSettingsResponseDto[] newArray(int i) {
            return new NotificationsGetRedesignSettingsResponseDto[i];
        }
    }

    public NotificationsGetRedesignSettingsResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static NotificationsGetRedesignSettingsResponseDto a(NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto, ArrayList arrayList) {
        List<UsersUserDto> list = notificationsGetRedesignSettingsResponseDto.profiles;
        List<GroupsGroupFullDto> list2 = notificationsGetRedesignSettingsResponseDto.groups;
        List<PhotosPhotoDto> list3 = notificationsGetRedesignSettingsResponseDto.photos;
        List<VideoVideoDto> list4 = notificationsGetRedesignSettingsResponseDto.videos;
        List<AppsAppDto> list5 = notificationsGetRedesignSettingsResponseDto.apps;
        notificationsGetRedesignSettingsResponseDto.getClass();
        return new NotificationsGetRedesignSettingsResponseDto(arrayList, list, list2, list3, list4, list5);
    }

    public final List<NotificationsNotificationSettingsSectionRedesignDto> d() {
        return this.sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsGetRedesignSettingsResponseDto)) {
            return false;
        }
        NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto = (NotificationsGetRedesignSettingsResponseDto) obj;
        return epx.f(this.sections, notificationsGetRedesignSettingsResponseDto.sections) && epx.f(this.profiles, notificationsGetRedesignSettingsResponseDto.profiles) && epx.f(this.groups, notificationsGetRedesignSettingsResponseDto.groups) && epx.f(this.photos, notificationsGetRedesignSettingsResponseDto.photos) && epx.f(this.videos, notificationsGetRedesignSettingsResponseDto.videos) && epx.f(this.apps, notificationsGetRedesignSettingsResponseDto.apps);
    }

    public final int hashCode() {
        List<NotificationsNotificationSettingsSectionRedesignDto> list = this.sections;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserDto> list2 = this.profiles;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PhotosPhotoDto> list4 = this.photos;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<VideoVideoDto> list5 = this.videos;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AppsAppDto> list6 = this.apps;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsGetRedesignSettingsResponseDto(sections=");
        sb.append(this.sections);
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
        List<NotificationsNotificationSettingsSectionRedesignDto> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NotificationsNotificationSettingsSectionRedesignDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<PhotosPhotoDto> list4 = this.photos;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<VideoVideoDto> list5 = this.videos;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<AppsAppDto> list6 = this.apps;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f6 = dn.f(parcel, list6, 1);
        while (f6.hasNext()) {
            parcel.writeParcelable((Parcelable) f6.next(), i);
        }
    }

    public NotificationsGetRedesignSettingsResponseDto(List<NotificationsNotificationSettingsSectionRedesignDto> list, List<UsersUserDto> list2, List<GroupsGroupFullDto> list3, List<PhotosPhotoDto> list4, List<VideoVideoDto> list5, List<AppsAppDto> list6) {
        this.sections = list;
        this.profiles = list2;
        this.groups = list3;
        this.photos = list4;
        this.videos = list5;
        this.apps = list6;
    }

    public /* synthetic */ NotificationsGetRedesignSettingsResponseDto(List list, List list2, List list3, List list4, List list5, List list6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6);
    }
}
