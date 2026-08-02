package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.go9;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Lg {
    public static final a c = new a(null);
    private final Double a;
    private final Double b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final b a() {
            return new b();
        }

        public final Lg b() {
            return a().a();
        }

        private a() {
        }
    }

    public static final class b {
        private Double a;
        private Double b;

        public final void a(Double d) {
            this.b = d;
        }

        public final void b(Double d) {
            this.a = d;
        }

        public final Double c() {
            return this.a;
        }

        public final b a(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        public final Double b() {
            return this.b;
        }

        public final Lg a() {
            return new Lg(this, null);
        }

        public final b b(double d) {
            this.a = Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ Lg(b bVar, zcl zclVar) {
        this(bVar);
    }

    public static final b a() {
        return c.a();
    }

    public static final Lg b() {
        return c.b();
    }

    public final Double c() {
        return this.b;
    }

    public final Double d() {
        return this.a;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.b);
            jSONObject.put("floor", this.a);
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        return jSONObject.toString();
    }

    public String toString() {
        return go9.b("WaterfallConfiguration", e());
    }

    private Lg(b bVar) {
        this.a = bVar.c();
        this.b = bVar.b();
    }
}
