package com.vk.ecomm.market.api.dto;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: OwnerResponseTime.kt */
/* loaded from: classes18.dex */
public final class OwnerResponseTime implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<OwnerResponseTime> CREATOR;
    public final long b;
    public final String c;
    public final String d;

    /* compiled from: OwnerResponseTime.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<OwnerResponseTime> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.aay
        public final OwnerResponseTime a(JSONObject jSONObject) {
            this.a.getClass();
            return new OwnerResponseTime(jSONObject.getLong("minutes"), jSONObject.optString("short_text"), jSONObject.optString("long_text"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<OwnerResponseTime> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OwnerResponseTime a(Serializer serializer) {
            long w = serializer.w();
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String H2 = serializer.H();
            if (H2 != null) {
                return new OwnerResponseTime(w, H, H2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OwnerResponseTime[i];
        }
    }

    static {
        a aVar = new a();
        CREATOR = new c();
        new b(aVar);
    }

    public OwnerResponseTime(long j, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
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
        jSONObject.putOpt("minutes", Long.valueOf(this.b));
        jSONObject.putOpt("short_text", this.c);
        jSONObject.putOpt("long_text", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerResponseTime)) {
            return false;
        }
        OwnerResponseTime ownerResponseTime = (OwnerResponseTime) obj;
        return this.b == ownerResponseTime.b && epx.f(this.c, ownerResponseTime.c) && epx.f(this.d, ownerResponseTime.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerResponseTime(minutes=");
        sb.append(this.b);
        sb.append(", responseTimeHighlight=");
        sb.append(this.c);
        sb.append(", responseTimeDescription=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
