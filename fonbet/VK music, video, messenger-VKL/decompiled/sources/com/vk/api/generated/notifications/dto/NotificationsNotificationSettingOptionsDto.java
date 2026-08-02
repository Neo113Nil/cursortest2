package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NotificationsNotificationSettingOptionsDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsNotificationSettingOptionsDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsNotificationSettingOptionsDto> CREATOR = new a();

    @pmi0("items")
    private final List<NotificationsNotificationSettingOptionsItemDto> items;

    @pmi0("selected")
    private final String selected;

    /* compiled from: NotificationsNotificationSettingOptionsDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsNotificationSettingOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingOptionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(NotificationsNotificationSettingOptionsItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NotificationsNotificationSettingOptionsDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsNotificationSettingOptionsDto[] newArray(int i) {
            return new NotificationsNotificationSettingOptionsDto[i];
        }
    }

    public NotificationsNotificationSettingOptionsDto(String str, List<NotificationsNotificationSettingOptionsItemDto> list) {
        this.selected = str;
        this.items = list;
    }

    public final List<NotificationsNotificationSettingOptionsItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.selected;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsNotificationSettingOptionsDto)) {
            return false;
        }
        NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto = (NotificationsNotificationSettingOptionsDto) obj;
        return epx.f(this.selected, notificationsNotificationSettingOptionsDto.selected) && epx.f(this.items, notificationsNotificationSettingOptionsDto.items);
    }

    public final int hashCode() {
        int hashCode = this.selected.hashCode() * 31;
        List<NotificationsNotificationSettingOptionsItemDto> list = this.items;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsNotificationSettingOptionsDto(selected=");
        sb.append(this.selected);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.selected);
        List<NotificationsNotificationSettingOptionsItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((NotificationsNotificationSettingOptionsItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsNotificationSettingOptionsDto(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
