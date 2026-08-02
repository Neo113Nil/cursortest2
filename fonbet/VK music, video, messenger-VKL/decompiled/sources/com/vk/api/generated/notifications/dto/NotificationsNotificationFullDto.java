package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: NotificationsNotificationFullDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationFullDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationFullDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("type")
    private final String type;

    @pmi0("unified_object")
    private final NotificationsNotificationItemDto unifiedObject;

    /* compiled from: NotificationsNotificationFullDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationFullDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationFullDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationsNotificationFullDto(readString, readString2, valueOf, parcel.readInt() != 0 ? NotificationsNotificationItemDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationFullDto[] newArray(int i) {
            return new NotificationsNotificationFullDto[i];
        }
    }

    public NotificationsNotificationFullDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationFullDto)) {
            return false;
        }
        NotificationsNotificationFullDto notificationsNotificationFullDto = (NotificationsNotificationFullDto) obj;
        return epx.f(this.type, notificationsNotificationFullDto.type) && epx.f(this.id, notificationsNotificationFullDto.id) && epx.f(this.isNew, notificationsNotificationFullDto.isNew) && epx.f(this.unifiedObject, notificationsNotificationFullDto.unifiedObject);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isNew;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        NotificationsNotificationItemDto notificationsNotificationItemDto = this.unifiedObject;
        return hashCode3 + (notificationsNotificationItemDto != null ? notificationsNotificationItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsNotificationFullDto(type=" + this.type + ", id=" + this.id + ", isNew=" + this.isNew + ", unifiedObject=" + this.unifiedObject + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.id);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        NotificationsNotificationItemDto notificationsNotificationItemDto = this.unifiedObject;
        if (notificationsNotificationItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsNotificationItemDto.writeToParcel(parcel, i);
        }
    }

    public NotificationsNotificationFullDto(String str, String str2, Boolean bool, NotificationsNotificationItemDto notificationsNotificationItemDto) {
        this.type = str;
        this.id = str2;
        this.isNew = bool;
        this.unifiedObject = notificationsNotificationItemDto;
    }

    public /* synthetic */ NotificationsNotificationFullDto(String str, String str2, Boolean bool, NotificationsNotificationItemDto notificationsNotificationItemDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : notificationsNotificationItemDto);
    }
}
