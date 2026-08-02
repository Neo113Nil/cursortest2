package com.ironsource;

import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ab {
    public static final a c = new a(null);
    public static final String d = "revenue";
    public static final String e = "precision";
    private final double a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Ab a(JSONObject jSONObject) {
            try {
                return new Ab(jSONObject.getDouble("revenue"), jSONObject.getString("precision"));
            } catch (Exception e) {
                C4452n4.d().a(e);
                If.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public Ab(double d2, String str) {
        this.a = d2;
        this.b = str;
    }

    public final double a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab = (Ab) obj;
        return Double.compare(this.a, ab.a) == 0 && epx.f(this.b, ab.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    public final Ab a(double d2, String str) {
        return new Ab(d2, str);
    }

    public static /* synthetic */ Ab a(Ab ab, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = ab.a;
        }
        if ((i & 2) != 0) {
            str = ab.b;
        }
        return ab.a(d2, str);
    }

    public static final Ab a(JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
