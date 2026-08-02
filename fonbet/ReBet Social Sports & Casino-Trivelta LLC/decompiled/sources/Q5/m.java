package Q5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f9440a;

    public static final class a extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9441b = new a();

        public a() {
            super("anr", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1418295754;
        }

        public String toString() {
            return "Anr";
        }
    }

    public static final class b extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final b f9442b = new b();

        public b() {
            super("custom", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1375582868;
        }

        public String toString() {
            return "Custom";
        }
    }

    public static final class c extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final c f9443b = new c();

        public c() {
            super("error", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1481403565;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class d extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final d f9444b = new d();

        public d() {
            super("lifecycle", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 674932623;
        }

        public String toString() {
            return "Lifecycle";
        }
    }

    public static final class e extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final e f9445b = new e();

        public e() {
            super("mobile_vitals", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -179847452;
        }

        public String toString() {
            return "MobileVitals";
        }
    }

    public static final class f extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final f f9446b = new f();

        public f() {
            super("network", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1022156691;
        }

        public String toString() {
            return "Network";
        }
    }

    public static final class g extends m {

        /* renamed from: b, reason: collision with root package name */
        public static final g f9447b = new g();

        public g() {
            super("user_interaction", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -2134827604;
        }

        public String toString() {
            return "UserInteraction";
        }
    }

    public /* synthetic */ m(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f9440a;
    }

    public m(String str) {
        this.f9440a = str;
    }
}
