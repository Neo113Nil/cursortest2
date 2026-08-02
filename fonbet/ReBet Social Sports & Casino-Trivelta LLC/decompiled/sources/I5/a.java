package I5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0114a f5350b = new C0114a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f5351a;

    /* renamed from: I5.a$a, reason: collision with other inner class name */
    public static final class C0114a {
        public /* synthetic */ C0114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final a a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1875283184:
                        if (str.equals("user-interaction")) {
                            return k.f5361c;
                        }
                        break;
                    case -1174146702:
                        if (str.equals("mobile-vitals")) {
                            return g.f5357c;
                        }
                        break;
                    case -416447130:
                        if (str.equals("screenshot")) {
                            return j.f5360c;
                        }
                        break;
                    case 107332:
                        if (str.equals("log")) {
                            return e.f5355c;
                        }
                        break;
                    case 96784904:
                        if (str.equals("error")) {
                            return b.f5352c;
                        }
                        break;
                    case 570410685:
                        if (str.equals("internal")) {
                            return c.f5353c;
                        }
                        break;
                    case 873931248:
                        if (str.equals("network-request")) {
                            return i.f5359c;
                        }
                        break;
                    case 1495324512:
                        if (str.equals("custom-measurement")) {
                            return f.f5356c;
                        }
                        break;
                    case 1862666772:
                        if (str.equals("navigation")) {
                            return h.f5358c;
                        }
                        break;
                    case 1947217621:
                        if (str.equals("life-cycle")) {
                            return d.f5354c;
                        }
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown CoralogixEventType value: " + str);
        }

        public C0114a() {
        }
    }

    public static final class b extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final b f5352c = new b();

        public b() {
            super("error", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1159241578;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class c extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final c f5353c = new c();

        public c() {
            super("internal", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 40568175;
        }

        public String toString() {
            return "Internal";
        }
    }

    public static final class d extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final d f5354c = new d();

        public d() {
            super("life-cycle", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 452427512;
        }

        public String toString() {
            return "Lifecycle";
        }
    }

    public static final class e extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final e f5355c = new e();

        public e() {
            super("log", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1844608338;
        }

        public String toString() {
            return "Log";
        }
    }

    public static final class f extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final f f5356c = new f();

        public f() {
            super("custom-measurement", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1948764106;
        }

        public String toString() {
            return "Measurement";
        }
    }

    public static final class g extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final g f5357c = new g();

        public g() {
            super("mobile-vitals", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1695071525;
        }

        public String toString() {
            return "MobileVitals";
        }
    }

    public static final class h extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final h f5358c = new h();

        public h() {
            super("navigation", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -509844410;
        }

        public String toString() {
            return "Navigation";
        }
    }

    public static final class i extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final i f5359c = new i();

        public i() {
            super("network-request", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 173863347;
        }

        public String toString() {
            return "NetworkRequest";
        }
    }

    public static final class j extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final j f5360c = new j();

        public j() {
            super("screenshot", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1506008984;
        }

        public String toString() {
            return "Screenshot";
        }
    }

    public static final class k extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final k f5361c = new k();

        public k() {
            super("user-interaction", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public int hashCode() {
            return -2068905387;
        }

        public String toString() {
            return "UserInteraction";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f5351a;
    }

    public a(String str) {
        this.f5351a = str;
    }
}
