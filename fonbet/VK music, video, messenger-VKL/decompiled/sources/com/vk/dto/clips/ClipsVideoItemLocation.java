package com.vk.dto.clips;

import android.location.Location;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.ojp0;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: ClipsVideoItemLocation.kt */
/* loaded from: classes18.dex */
public final class ClipsVideoItemLocation extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClipsVideoItemLocation> CREATOR = new c();
    public static final b d = new b();
    public final double b;
    public final double c;

    /* compiled from: ClipsVideoItemLocation.kt */
    public static final class a {
        public static ClipsVideoItemLocation a(Location location) {
            if (location == null) {
                return null;
            }
            return new ClipsVideoItemLocation(location.getLatitude(), location.getLongitude());
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ClipsVideoItemLocation> {
        @Override // xsna.aay
        public final ClipsVideoItemLocation a(JSONObject jSONObject) {
            return new ClipsVideoItemLocation(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ClipsVideoItemLocation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsVideoItemLocation a(Serializer serializer) {
            return new ClipsVideoItemLocation(serializer.r(), serializer.r());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsVideoItemLocation[i];
        }
    }

    public ClipsVideoItemLocation(double d2, double d3) {
        this.b = d2;
        this.c = d3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.O(this.b);
        serializer.O(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.f("latitude", Double.valueOf(this.b));
        w9yVar.f("longitude", Double.valueOf(this.c));
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ClipsVideoItemLocation.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ClipsVideoItemLocation clipsVideoItemLocation = (ClipsVideoItemLocation) obj;
        return this.b == clipsVideoItemLocation.b && this.c == clipsVideoItemLocation.c;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[lat=");
        sb.append(this.b);
        sb.append(",lon=");
        return ojp0.a(sb, this.c, ']');
    }

    public ClipsVideoItemLocation(JSONObject jSONObject) {
        this(jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"));
    }
}
