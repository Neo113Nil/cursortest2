package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingsGroupSectionItemDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingsGroupSectionItemDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingsGroupSectionItemDto> CREATOR = new a();

    @pmi0(C4217a2.e)
    private final Boolean disabled;

    @pmi0("id")
    private final int id;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("name")
    private final String name;

    @pmi0("type_name")
    private final String typeName;

    /* compiled from: NotificationsNotificationSettingsGroupSectionItemDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingsGroupSectionItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsGroupSectionItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationsNotificationSettingsGroupSectionItemDto(readInt, readString, readString2, z, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsGroupSectionItemDto[] newArray(int i) {
            return new NotificationsNotificationSettingsGroupSectionItemDto[i];
        }
    }

    public NotificationsNotificationSettingsGroupSectionItemDto(int i, String str, String str2, boolean z, Boolean bool) {
        this.id = i;
        this.typeName = str;
        this.name = str2;
        this.isEnabled = z;
        this.disabled = bool;
    }

    public final Boolean d() {
        return this.disabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingsGroupSectionItemDto)) {
            return false;
        }
        NotificationsNotificationSettingsGroupSectionItemDto notificationsNotificationSettingsGroupSectionItemDto = (NotificationsNotificationSettingsGroupSectionItemDto) obj;
        return this.id == notificationsNotificationSettingsGroupSectionItemDto.id && epx.f(this.typeName, notificationsNotificationSettingsGroupSectionItemDto.typeName) && epx.f(this.name, notificationsNotificationSettingsGroupSectionItemDto.name) && this.isEnabled == notificationsNotificationSettingsGroupSectionItemDto.isEnabled && epx.f(this.disabled, notificationsNotificationSettingsGroupSectionItemDto.disabled);
    }

    public final String f() {
        return this.typeName;
    }

    public final boolean g() {
        return this.isEnabled;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.typeName), 31, this.name), 31, this.isEnabled);
        Boolean bool = this.disabled;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationSettingsGroupSectionItemDto(id=");
        sb.append(this.id);
        sb.append(", typeName=");
        sb.append(this.typeName);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", disabled=");
        return tn.a(sb, this.disabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.typeName);
        parcel.writeString(this.name);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Boolean bool = this.disabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingsGroupSectionItemDto(int i, String str, String str2, boolean z, Boolean bool, int i2, zcl zclVar) {
        this(i, str, str2, z, (i2 & 16) != 0 ? null : bool);
    }
}
