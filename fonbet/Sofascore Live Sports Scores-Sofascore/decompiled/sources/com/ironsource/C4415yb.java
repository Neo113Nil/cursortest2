package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4415yb {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "revenue";

    @NotNull
    public static final String e = "precision";
    private final double a;

    @NotNull
    private final String b;

    public C4415yb(double d2, @NotNull String str) {
        str.getClass();
        this.a = d2;
        this.b = str;
    }

    public static /* synthetic */ C4415yb a(C4415yb c4415yb, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d2 = c4415yb.a;
        }
        if ((i & 2) != 0) {
            str = c4415yb.b;
        }
        return c4415yb.a(d2, str);
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final double d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4415yb)) {
            return false;
        }
        C4415yb c4415yb = (C4415yb) obj;
        return Double.compare(this.a, c4415yb.a) == 0 && Intrinsics.c(this.b, c4415yb.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    @NotNull
    public String toString() {
        return "LoadArmData(revenue=" + this.a + ", precision=" + this.b + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.yb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final C4415yb a(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            try {
                double d = jSONObject.getDouble("revenue");
                String string = jSONObject.getString("precision");
                string.getClass();
                return new C4415yb(d, string);
            } catch (Exception e) {
                C4157k4.d().a(e);
                Gf.a(e);
                return null;
            }
        }

        private a() {
        }
    }

    @NotNull
    public final C4415yb a(double d2, @NotNull String str) {
        str.getClass();
        return new C4415yb(d2, str);
    }

    public final double a() {
        return this.a;
    }

    @Nullable
    public static final C4415yb a(@NotNull JSONObject jSONObject) {
        return c.a(jSONObject);
    }
}
