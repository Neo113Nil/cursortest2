package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;

/* compiled from: NotificationsNotificationSettingsSectionRedesignDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingsSectionRedesignDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingsSectionRedesignDto> CREATOR = new a();

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("settings")
    private final List<NotificationsNotificationSettingRedesignDto> settings;

    @pmi0("title")
    private final String title;

    /* compiled from: NotificationsNotificationSettingsSectionRedesignDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingsSectionRedesignDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsSectionRedesignDto createFromParcel(Parcel parcel) {
            int i;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(NotificationsNotificationSettingRedesignDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotificationsNotificationSettingsSectionRedesignDto(readString, readString2, readString3, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingsSectionRedesignDto[] newArray(int i) {
            return new NotificationsNotificationSettingsSectionRedesignDto[i];
        }
    }

    public NotificationsNotificationSettingsSectionRedesignDto(String str, String str2, String str3, boolean z, List<NotificationsNotificationSettingRedesignDto> list) {
        this.id = str;
        this.title = str2;
        this.icon = str3;
        this.isEnabled = z;
        this.settings = list;
    }

    public static NotificationsNotificationSettingsSectionRedesignDto a(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto, ArrayList arrayList) {
        String str = notificationsNotificationSettingsSectionRedesignDto.id;
        String str2 = notificationsNotificationSettingsSectionRedesignDto.title;
        String str3 = notificationsNotificationSettingsSectionRedesignDto.icon;
        boolean z = notificationsNotificationSettingsSectionRedesignDto.isEnabled;
        notificationsNotificationSettingsSectionRedesignDto.getClass();
        return new NotificationsNotificationSettingsSectionRedesignDto(str, str2, str3, z, arrayList);
    }

    public final String d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<NotificationsNotificationSettingRedesignDto> e() {
        return this.settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingsSectionRedesignDto)) {
            return false;
        }
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = (NotificationsNotificationSettingsSectionRedesignDto) obj;
        return epx.f(this.id, notificationsNotificationSettingsSectionRedesignDto.id) && epx.f(this.title, notificationsNotificationSettingsSectionRedesignDto.title) && epx.f(this.icon, notificationsNotificationSettingsSectionRedesignDto.icon) && this.isEnabled == notificationsNotificationSettingsSectionRedesignDto.isEnabled && epx.f(this.settings, notificationsNotificationSettingsSectionRedesignDto.settings);
    }

    public final boolean f() {
        return this.isEnabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.settings.hashCode() + qoy.b(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.icon), 31, this.isEnabled);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationSettingsSectionRedesignDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", settings=");
        return ms9.a(')', sb, this.settings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.icon);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.settings);
        while (a2.hasNext()) {
            ((NotificationsNotificationSettingRedesignDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
