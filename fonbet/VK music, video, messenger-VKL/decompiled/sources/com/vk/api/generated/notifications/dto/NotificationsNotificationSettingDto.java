package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("disabled_pushes")
    private final Boolean disabledPushes;

    @pmi0("id")
    private final String id;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("label")
    private final String label;

    /* compiled from: NotificationsNotificationSettingDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationsNotificationSettingDto(readString, readString2, readString3, z, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingDto[] newArray(int i) {
            return new NotificationsNotificationSettingDto[i];
        }
    }

    public NotificationsNotificationSettingDto(String str, String str2, String str3, boolean z, Boolean bool) {
        this.id = str;
        this.label = str2;
        this.description = str3;
        this.isEnabled = z;
        this.disabledPushes = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingDto)) {
            return false;
        }
        NotificationsNotificationSettingDto notificationsNotificationSettingDto = (NotificationsNotificationSettingDto) obj;
        return epx.f(this.id, notificationsNotificationSettingDto.id) && epx.f(this.label, notificationsNotificationSettingDto.label) && epx.f(this.description, notificationsNotificationSettingDto.description) && this.isEnabled == notificationsNotificationSettingDto.isEnabled && epx.f(this.disabledPushes, notificationsNotificationSettingDto.disabledPushes);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.label), 31, this.description), 31, this.isEnabled);
        Boolean bool = this.disabledPushes;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationSettingDto(id=");
        sb.append(this.id);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", disabledPushes=");
        return tn.a(sb, this.disabledPushes, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.label);
        parcel.writeString(this.description);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Boolean bool = this.disabledPushes;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingDto(String str, String str2, String str3, boolean z, Boolean bool, int i, zcl zclVar) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : bool);
    }
}
