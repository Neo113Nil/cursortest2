package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: WidgetIds.kt */
/* loaded from: classes6.dex */
public final class WidgetIds implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    /* compiled from: WidgetIds.kt */
    public static final class a implements Parcelable.Creator<WidgetIds> {
        public static WidgetIds a(JSONObject jSONObject) {
            return new WidgetIds(jSONObject.optString("uid", ""), jSONObject.optInt("widget_id", 0), jSONObject.optString("peer_id", ""), jSONObject.optString("owner_id", ""));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetIds createFromParcel(Parcel parcel) {
            return new WidgetIds(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetIds[] newArray(int i) {
            return new WidgetIds[i];
        }
    }

    public WidgetIds(String str, int i, String str2, String str3) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetIds)) {
            return false;
        }
        WidgetIds widgetIds = (WidgetIds) obj;
        return epx.f(this.b, widgetIds.b) && this.c == widgetIds.c && epx.f(this.d, widgetIds.d) && epx.f(this.e, widgetIds.e);
    }

    public final int getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetIds(uid=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", peerId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public WidgetIds(Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
    }
}
