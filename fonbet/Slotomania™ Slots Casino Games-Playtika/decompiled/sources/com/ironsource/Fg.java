package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Fg {
    public static final a c = new a(null);
    private final Double a;
    private final Double b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final b a() {
            return new b();
        }

        @JvmStatic
        public final Fg b() {
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

        public final Fg a() {
            return new Fg(this, null);
        }

        public final b b(double d) {
            this.a = Double.valueOf(d);
            return this;
        }
    }

    public /* synthetic */ Fg(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @JvmStatic
    public static final b a() {
        return c.a();
    }

    @JvmStatic
    public static final Fg b() {
        return c.b();
    }

    public final Double c() {
        return this.b;
    }

    public final Double d() {
        return this.a;
    }

    public final String e() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("ceiling", this.b);
            jsonObjectInit.put("floor", this.a);
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject = jsonObjectInit.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString()");
        return jSONObject;
    }

    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    private Fg(b bVar) {
        this.a = bVar.c();
        this.b = bVar.b();
    }
}
