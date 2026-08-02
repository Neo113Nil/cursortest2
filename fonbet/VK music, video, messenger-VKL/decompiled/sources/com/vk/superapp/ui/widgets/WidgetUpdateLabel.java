package com.vk.superapp.ui.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qxm0;

/* compiled from: WidgetUpdateLabel.kt */
/* loaded from: classes6.dex */
public final class WidgetUpdateLabel implements Parcelable {
    public static final a CREATOR = new a();
    public final boolean b;
    public final String c;

    /* compiled from: WidgetUpdateLabel.kt */
    public static final class a implements Parcelable.Creator<WidgetUpdateLabel> {
        @Override // android.os.Parcelable.Creator
        public final WidgetUpdateLabel createFromParcel(Parcel parcel) {
            return new WidgetUpdateLabel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetUpdateLabel[] newArray(int i) {
            return new WidgetUpdateLabel[i];
        }
    }

    public WidgetUpdateLabel(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetUpdateLabel)) {
            return false;
        }
        WidgetUpdateLabel widgetUpdateLabel = (WidgetUpdateLabel) obj;
        return this.b == widgetUpdateLabel.b && epx.f(this.c, widgetUpdateLabel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetUpdateLabel(isShown=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.c);
    }

    public WidgetUpdateLabel(Parcel parcel) {
        this(qxm0.v(parcel), parcel.readString());
    }
}
