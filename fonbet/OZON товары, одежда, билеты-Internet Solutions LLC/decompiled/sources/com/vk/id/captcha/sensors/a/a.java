package com.vk.id.captcha.sensors.a;

import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\nB\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/vk/id/captcha/c/a/a;", "", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "a", "()Ljava/lang/String;", "<init>", "()V", "c", "Lcom/vk/id/captcha/c/a/a$a;", "Lcom/vk/id/captcha/c/a/a$b;", "Lcom/vk/id/captcha/c/a/a$c;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "a", "", "F", "c", "d", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.a.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0922a extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public float b;
        public float c;
        public float d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private final String a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$a$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$a;", "a", "([F)Lcom/vk/id/captcha/c/a/a$a;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final C0922a a(@NotNull float[] p02) {
                Intrinsics.checkNotNullParameter(p02, "");
                return new C0922a(p02[0], p02[1], p02[2]);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0922a(float f7, float f11, float f12) {
            super(null);
            this.b = f7;
            this.c = f11;
            this.d = f12;
            this.a = "accelerometer";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.a;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.b));
            jSONObject.put("y", Float.valueOf(this.c));
            jSONObject.put("z", Float.valueOf(this.d));
            return jSONObject;
        }

        public final boolean equals(Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof C0922a)) {
                return false;
            }
            C0922a c0922a = (C0922a) p02;
            return Float.compare(this.b, c0922a.b) == 0 && Float.compare(this.c, c0922a.c) == 0 && Float.compare(this.d, c0922a.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + Pk0.b.a(this.c, Float.hashCode(this.b) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("a(b=");
            sb2.append(this.b);
            sb2.append(", c=");
            sb2.append(this.c);
            sb2.append(", d=");
            return G.a(sb2, this.d, ')');
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0013X\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "a", "", "F", "c", "d", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public float b;
        public float c;
        public float d;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private final String a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$b$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$b;", "a", "([F)Lcom/vk/id/captcha/c/a/a$b;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final b a(@NotNull float[] p02) {
                Intrinsics.checkNotNullParameter(p02, "");
                return new b(p02[0], p02[1], p02[2]);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(float f7, float f11, float f12) {
            super(null);
            this.b = f7;
            this.c = f11;
            this.d = f12;
            this.a = "gyroscope";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.a;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Float.valueOf(this.b));
            jSONObject.put("y", Float.valueOf(this.c));
            jSONObject.put("z", Float.valueOf(this.d));
            return jSONObject;
        }

        public final boolean equals(Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof b)) {
                return false;
            }
            b bVar = (b) p02;
            return Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + Pk0.b.a(this.c, Float.hashCode(this.b) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("b(b=");
            sb2.append(this.b);
            sb2.append(", c=");
            sb2.append(this.c);
            sb2.append(", d=");
            return G.a(sb2, this.d, ')');
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0010X\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u000f"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c;", "Lcom/vk/id/captcha/c/a/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "", "F", "a", "c", "d", "e", "Ljava/lang/String;", "p1", "p2", "<init>", "(FFF)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public float a;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public float b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public float c;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        private final String d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/vk/id/captcha/c/a/a$c$a;", "", "", "p0", "Lcom/vk/id/captcha/c/a/a$c;", "a", "([F)Lcom/vk/id/captcha/c/a/a$c;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.vk.id.captcha.c.a.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final c a(@NotNull float[] p02) {
                Intrinsics.checkNotNullParameter(p02, "");
                float f7 = p02[0];
                return new c(f7, f7, f7);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(float f7, float f11, float f12) {
            super(null);
            this.a = f7;
            this.b = f11;
            this.c = f12;
            this.d = "motion";
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        /* renamed from: a, reason: from getter */
        public final String getD() {
            return this.d;
        }

        @Override // com.vk.id.captcha.sensors.a.a
        @NotNull
        public final JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alpha", Float.valueOf(this.a));
            jSONObject.put("beta", Float.valueOf(this.b));
            jSONObject.put("gamma", Float.valueOf(this.c));
            return jSONObject;
        }

        public final boolean equals(Object p02) {
            if (this == p02) {
                return true;
            }
            if (!(p02 instanceof c)) {
                return false;
            }
            c cVar = (c) p02;
            return Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + Pk0.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("c(a=");
            sb2.append(this.a);
            sb2.append(", b=");
            sb2.append(this.b);
            sb2.append(", c=");
            return G.a(sb2, this.c, ')');
        }
    }

    private a() {
    }

    @NotNull
    /* renamed from: a */
    public abstract String getD();

    @NotNull
    public abstract JSONObject b();

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
