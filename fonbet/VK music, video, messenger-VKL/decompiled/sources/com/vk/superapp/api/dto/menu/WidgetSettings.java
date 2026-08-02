package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import org.json.JSONObject;
import xsna.qoy;
import xsna.zcl;

/* compiled from: WidgetSettings.kt */
/* loaded from: classes6.dex */
public final class WidgetSettings implements Parcelable {
    public static final a CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* compiled from: WidgetSettings.kt */
    public static final class a implements Parcelable.Creator<WidgetSettings> {
        public static WidgetSettings a(JSONObject jSONObject) {
            return new WidgetSettings(jSONObject.optBoolean("is_enabled", true), jSONObject.optBoolean("is_unremovable", false), false, false, 12, null);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetSettings createFromParcel(Parcel parcel) {
            return new WidgetSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetSettings[] newArray(int i) {
            return new WidgetSettings[i];
        }
    }

    public WidgetSettings(boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static WidgetSettings a(WidgetSettings widgetSettings, boolean z) {
        boolean z2 = widgetSettings.c;
        boolean z3 = widgetSettings.d;
        boolean z4 = widgetSettings.e;
        widgetSettings.getClass();
        return new WidgetSettings(z, z2, z3, z4);
    }

    public final boolean d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetSettings)) {
            return false;
        }
        WidgetSettings widgetSettings = (WidgetSettings) obj;
        return this.b == widgetSettings.b && this.c == widgetSettings.c && this.d == widgetSettings.d && this.e == widgetSettings.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetSettings(isEnabled=");
        sb.append(this.b);
        sb.append(", isUnremovable=");
        sb.append(this.c);
        sb.append(", isSkipAnalytic=");
        sb.append(this.d);
        sb.append(", hasTabDot=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ WidgetSettings(boolean z, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public WidgetSettings(Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0, parcel.readByte() != 0);
    }
}
