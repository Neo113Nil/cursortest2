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
import xsna.urd0;

/* compiled from: NotificationsNotificationGroupSettingsSectionDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationGroupSettingsSectionDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationGroupSettingsSectionDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<NotificationsNotificationSettingsGroupSectionItemDto> items;

    @pmi0("section_title")
    private final String sectionTitle;

    /* compiled from: NotificationsNotificationGroupSettingsSectionDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationGroupSettingsSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationGroupSettingsSectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NotificationsNotificationSettingsGroupSectionItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotificationsNotificationGroupSettingsSectionDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationGroupSettingsSectionDto[] newArray(int i) {
            return new NotificationsNotificationGroupSettingsSectionDto[i];
        }
    }

    public NotificationsNotificationGroupSettingsSectionDto(String str, String str2, List<NotificationsNotificationSettingsGroupSectionItemDto> list) {
        this.sectionTitle = str;
        this.id = str2;
        this.items = list;
    }

    public final List<NotificationsNotificationSettingsGroupSectionItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sectionTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationGroupSettingsSectionDto)) {
            return false;
        }
        NotificationsNotificationGroupSettingsSectionDto notificationsNotificationGroupSettingsSectionDto = (NotificationsNotificationGroupSettingsSectionDto) obj;
        return epx.f(this.sectionTitle, notificationsNotificationGroupSettingsSectionDto.sectionTitle) && epx.f(this.id, notificationsNotificationGroupSettingsSectionDto.id) && epx.f(this.items, notificationsNotificationGroupSettingsSectionDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + urd0.a(this.sectionTitle.hashCode() * 31, 31, this.id);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationGroupSettingsSectionDto(sectionTitle=");
        sb.append(this.sectionTitle);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sectionTitle);
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NotificationsNotificationSettingsGroupSectionItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
