package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ig {

    @NotNull
    public static final a c = new a(null);

    @Nullable
    private final Double a;

    @Nullable
    private final Double b;

    private Ig(b bVar) {
        this.a = bVar.c();
        this.b = bVar.b();
    }

    @NotNull
    public static final b a() {
        return c.a();
    }

    @NotNull
    public static final Ig b() {
        return c.b();
    }

    @Nullable
    public final Double c() {
        return this.b;
    }

    @Nullable
    public final Double d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.b);
            jSONObject.put("floor", this.a);
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @NotNull
    public String toString() {
        return dmi.q("WaterfallConfiguration", e());
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a() {
            return new b();
        }

        @NotNull
        public final Ig b() {
            return a().a();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @Nullable
        private Double a;

        @Nullable
        private Double b;

        @NotNull
        public final b a(double d) {
            this.b = Double.valueOf(d);
            return this;
        }

        @NotNull
        public final b b(double d) {
            this.a = Double.valueOf(d);
            return this;
        }

        @Nullable
        public final Double c() {
            return this.a;
        }

        public final void a(@Nullable Double d) {
            this.b = d;
        }

        @Nullable
        public final Double b() {
            return this.b;
        }

        @NotNull
        public final Ig a() {
            return new Ig(this, null);
        }

        public final void b(@Nullable Double d) {
            this.a = d;
        }
    }

    public /* synthetic */ Ig(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }
}
