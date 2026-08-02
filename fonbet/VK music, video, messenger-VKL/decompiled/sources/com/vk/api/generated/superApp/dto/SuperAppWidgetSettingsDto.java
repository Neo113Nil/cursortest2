package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SuperAppWidgetSettingsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetSettingsDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetSettingsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final List<SuperAppUniversalWidgetImageItemDto> icon;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_unremovable")
    private final boolean isUnremovable;

    @pmi0("title")
    private final String title;

    @pmi0("widget_id")
    private final String widgetId;

    @pmi0("widget_uid")
    private final String widgetUid;

    /* compiled from: SuperAppWidgetSettingsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetSettingsDto createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z2 = false;
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppWidgetSettingsDto.class, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new SuperAppWidgetSettingsDto(readString, arrayList, z2, parcel.readInt() != 0 ? true : z, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetSettingsDto[] newArray(int i) {
            return new SuperAppWidgetSettingsDto[i];
        }
    }

    public SuperAppWidgetSettingsDto(String str, List<SuperAppUniversalWidgetImageItemDto> list, boolean z, boolean z2, String str2, String str3, String str4) {
        this.title = str;
        this.icon = list;
        this.isEnabled = z;
        this.isUnremovable = z2;
        this.widgetId = str2;
        this.description = str3;
        this.widgetUid = str4;
    }

    public final List<SuperAppUniversalWidgetImageItemDto> d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.widgetId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetSettingsDto)) {
            return false;
        }
        SuperAppWidgetSettingsDto superAppWidgetSettingsDto = (SuperAppWidgetSettingsDto) obj;
        return epx.f(this.title, superAppWidgetSettingsDto.title) && epx.f(this.icon, superAppWidgetSettingsDto.icon) && this.isEnabled == superAppWidgetSettingsDto.isEnabled && this.isUnremovable == superAppWidgetSettingsDto.isUnremovable && epx.f(this.widgetId, superAppWidgetSettingsDto.widgetId) && epx.f(this.description, superAppWidgetSettingsDto.description) && epx.f(this.widgetUid, superAppWidgetSettingsDto.widgetUid);
    }

    public final String f() {
        return this.widgetUid;
    }

    public final boolean g() {
        return this.isEnabled;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(qoy.b(qoy.b(fw3.a(this.title.hashCode() * 31, 31, this.icon), 31, this.isEnabled), 31, this.isUnremovable), 31, this.widgetId);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.widgetUid;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i() {
        return this.isUnremovable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetSettingsDto(title=");
        sb.append(this.title);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isUnremovable=");
        sb.append(this.isUnremovable);
        sb.append(", widgetId=");
        sb.append(this.widgetId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", widgetUid=");
        return ho8.a(sb, this.widgetUid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.isUnremovable ? 1 : 0);
        parcel.writeString(this.widgetId);
        parcel.writeString(this.description);
        parcel.writeString(this.widgetUid);
    }

    public /* synthetic */ SuperAppWidgetSettingsDto(String str, List list, boolean z, boolean z2, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, list, z, z2, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
