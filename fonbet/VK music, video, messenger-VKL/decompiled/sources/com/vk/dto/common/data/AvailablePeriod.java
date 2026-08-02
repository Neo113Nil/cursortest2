package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CallProducerButton.kt */
/* loaded from: classes18.dex */
public final class AvailablePeriod implements Serializer.StreamParcelable, bxx {
    public final boolean b;
    public final String c;
    public final String d;
    public static final a e = new a();
    public static final Serializer.c<AvailablePeriod> CREATOR = new b();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<AvailablePeriod> {
        @Override // xsna.aay
        public final AvailablePeriod a(JSONObject jSONObject) {
            return new AvailablePeriod(jSONObject.optBoolean("is_work_day"), jSONObject.optString("from"), jSONObject.optString("to"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AvailablePeriod> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AvailablePeriod a(Serializer serializer) {
            return new AvailablePeriod(serializer.m(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvailablePeriod[i];
        }
    }

    public AvailablePeriod(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_work_day", this.b);
        jSONObject.put("from", this.c);
        jSONObject.put("to", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailablePeriod)) {
            return false;
        }
        AvailablePeriod availablePeriod = (AvailablePeriod) obj;
        return this.b == availablePeriod.b && epx.f(this.c, availablePeriod.c) && epx.f(this.d, availablePeriod.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailablePeriod(isWorkDay=");
        sb.append(this.b);
        sb.append(", from=");
        sb.append(this.c);
        sb.append(", to=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
