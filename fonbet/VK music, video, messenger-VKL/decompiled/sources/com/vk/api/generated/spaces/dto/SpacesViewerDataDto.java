package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: SpacesViewerDataDto.kt */
/* loaded from: classes15.dex */
public final class SpacesViewerDataDto implements Parcelable {
    public static final Parcelable.Creator<SpacesViewerDataDto> CREATOR = new a();

    @pmi0("is_banned")
    private final Boolean isBanned;

    @pmi0("is_member")
    private final Boolean isMember;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("notification_settings")
    private final SpacesNotificationSettingsDto notificationSettings;

    @pmi0("notifications_for_user")
    private final SpacesNotificationsForUserDto notificationsForUser;

    @pmi0("role_ids")
    private final List<Long> roleIds;

    /* compiled from: SpacesViewerDataDto.kt */
    public static final class a implements Parcelable.Creator<SpacesViewerDataDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesViewerDataDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = k73.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SpacesViewerDataDto(valueOf, valueOf2, valueOf3, arrayList, parcel.readInt() == 0 ? null : SpacesNotificationSettingsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpacesNotificationsForUserDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesViewerDataDto[] newArray(int i) {
            return new SpacesViewerDataDto[i];
        }
    }

    public SpacesViewerDataDto() {
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
        if (!(obj instanceof SpacesViewerDataDto)) {
            return false;
        }
        SpacesViewerDataDto spacesViewerDataDto = (SpacesViewerDataDto) obj;
        return epx.f(this.isMember, spacesViewerDataDto.isMember) && epx.f(this.isBanned, spacesViewerDataDto.isBanned) && epx.f(this.isOwner, spacesViewerDataDto.isOwner) && epx.f(this.roleIds, spacesViewerDataDto.roleIds) && epx.f(this.notificationSettings, spacesViewerDataDto.notificationSettings) && epx.f(this.notificationsForUser, spacesViewerDataDto.notificationsForUser);
    }

    public final int hashCode() {
        Boolean bool = this.isMember;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isBanned;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOwner;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Long> list = this.roleIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SpacesNotificationSettingsDto spacesNotificationSettingsDto = this.notificationSettings;
        int hashCode5 = (hashCode4 + (spacesNotificationSettingsDto == null ? 0 : spacesNotificationSettingsDto.hashCode())) * 31;
        SpacesNotificationsForUserDto spacesNotificationsForUserDto = this.notificationsForUser;
        return hashCode5 + (spacesNotificationsForUserDto != null ? spacesNotificationsForUserDto.hashCode() : 0);
    }

    public final String toString() {
        return "SpacesViewerDataDto(isMember=" + this.isMember + ", isBanned=" + this.isBanned + ", isOwner=" + this.isOwner + ", roleIds=" + this.roleIds + ", notificationSettings=" + this.notificationSettings + ", notificationsForUser=" + this.notificationsForUser + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isMember;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isBanned;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isOwner;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        List<Long> list = this.roleIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        SpacesNotificationSettingsDto spacesNotificationSettingsDto = this.notificationSettings;
        if (spacesNotificationSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacesNotificationSettingsDto.writeToParcel(parcel, i);
        }
        SpacesNotificationsForUserDto spacesNotificationsForUserDto = this.notificationsForUser;
        if (spacesNotificationsForUserDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacesNotificationsForUserDto.writeToParcel(parcel, i);
        }
    }

    public SpacesViewerDataDto(Boolean bool, Boolean bool2, Boolean bool3, List<Long> list, SpacesNotificationSettingsDto spacesNotificationSettingsDto, SpacesNotificationsForUserDto spacesNotificationsForUserDto) {
        this.isMember = bool;
        this.isBanned = bool2;
        this.isOwner = bool3;
        this.roleIds = list;
        this.notificationSettings = spacesNotificationSettingsDto;
        this.notificationsForUser = spacesNotificationsForUserDto;
    }

    public /* synthetic */ SpacesViewerDataDto(Boolean bool, Boolean bool2, Boolean bool3, List list, SpacesNotificationSettingsDto spacesNotificationSettingsDto, SpacesNotificationsForUserDto spacesNotificationsForUserDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : spacesNotificationSettingsDto, (i & 32) != 0 ? null : spacesNotificationsForUserDto);
    }
}
