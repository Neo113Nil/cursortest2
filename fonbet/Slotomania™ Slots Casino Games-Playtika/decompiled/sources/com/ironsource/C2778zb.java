package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2778zb {
    public static final a c = new a(null);
    public static final String d = "revenue";
    public static final String e = "precision";
    private final double a;
    private final String b;

    /* renamed from: com.ironsource.zb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final C2778zb a(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                double d = json.getDouble("revenue");
                String precision = json.getString("precision");
                Intrinsics.checkNotNullExpressionValue(precision, "precision");
                return new C2778zb(d, precision);
            } catch (Exception e) {
                C2556n4.d().a(e);
                Ff.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    public C2778zb(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        this.a = d2;
        this.b = precision;
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
        if (!(obj instanceof C2778zb)) {
            return false;
        }
        C2778zb c2778zb = (C2778zb) obj;
        return Double.compare(this.a, c2778zb.a) == 0 && Intrinsics.areEqual(this.b, c2778zb.b);
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    public final C2778zb a(double d2, String precision) {
        Intrinsics.checkNotNullParameter(precision, "precision");
        return new C2778zb(d2, precision);
    }

    public static /* synthetic */ C2778zb a(C2778zb c2778zb, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = c2778zb.a;
        }
        if ((i & 2) != 0) {
            str = c2778zb.b;
        }
        return c2778zb.a(d2, str);
    }

    @JvmStatic
    public static final C2778zb a(JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
