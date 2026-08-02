package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.arm0;
import xsna.bxx;
import xsna.c5g;
import xsna.drm0;
import xsna.j5g;
import xsna.shy;

/* compiled from: SimpleDate.kt */
/* loaded from: classes6.dex */
public final class SimpleDate implements Parcelable, bxx {
    public final int b;
    public final int c;
    public final int d;
    public static final b e = new b();
    public static final Parcelable.Creator<SimpleDate> CREATOR = new a();
    private static final SimpleDate STUB = new SimpleDate(-1, -1, -1);

    /* compiled from: SimpleDate.kt */
    public static final class a implements Parcelable.Creator<SimpleDate> {
        @Override // android.os.Parcelable.Creator
        public final SimpleDate createFromParcel(Parcel parcel) {
            return new SimpleDate(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleDate[] newArray(int i) {
            return new SimpleDate[i];
        }
    }

    /* compiled from: SimpleDate.kt */
    public static final class b {
        public static SimpleDate a(String str) {
            List c0 = drm0.c0(str, new String[]{"."}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer m = arm0.m(10, (String) it.next());
                if (m != null) {
                    r4 = m.intValue();
                }
                arrayList.add(Integer.valueOf(r4));
            }
            Integer num = (Integer) j5g.b0(0, arrayList);
            int intValue = num != null ? num.intValue() : -1;
            Integer num2 = (Integer) j5g.b0(1, arrayList);
            int intValue2 = num2 != null ? num2.intValue() : -1;
            Integer num3 = (Integer) j5g.b0(2, arrayList);
            return new SimpleDate(intValue, intValue2, num3 != null ? num3.intValue() : -1);
        }

        public final SimpleDate getSTUB() {
            return SimpleDate.STUB;
        }
    }

    public SimpleDate(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return new JSONObject().put("dayOfMonth", this.b).put("month", this.c).put("year", this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDate)) {
            return false;
        }
        SimpleDate simpleDate = (SimpleDate) obj;
        return this.b == simpleDate.b && this.c == simpleDate.c && this.d == simpleDate.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        Object obj;
        Object obj2;
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i >= 10) {
            obj = Integer.valueOf(i);
        } else {
            obj = "0" + i;
        }
        sb.append(obj);
        sb.append(JwtParser.SEPARATOR_CHAR);
        int i2 = this.c;
        if (i2 >= 10) {
            obj2 = Integer.valueOf(i2);
        } else {
            obj2 = "0" + i2;
        }
        sb.append(obj2);
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(this.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public SimpleDate(JSONObject jSONObject) {
        this(jSONObject.optInt("dayOfMonth"), jSONObject.optInt("month"), jSONObject.optInt("year"));
    }

    public SimpleDate(Calendar calendar, boolean z) {
        this(calendar.get(5), z ? calendar.get(2) + 1 : calendar.get(2), calendar.get(1));
    }
}
