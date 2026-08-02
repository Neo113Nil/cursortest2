package co.paystack.android.ui;

import java.util.HashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f28092b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static Object f28093c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public C0453a f28094a = null;

    /* renamed from: co.paystack.android.ui.a$a, reason: collision with other inner class name */
    public static class C0453a {

        /* renamed from: e, reason: collision with root package name */
        public static String f28095e = "address";

        /* renamed from: f, reason: collision with root package name */
        public static String f28096f = "city";

        /* renamed from: g, reason: collision with root package name */
        public static String f28097g = "zip_code";

        /* renamed from: h, reason: collision with root package name */
        public static String f28098h = "state";

        /* renamed from: a, reason: collision with root package name */
        public String f28099a = "";

        /* renamed from: b, reason: collision with root package name */
        public String f28100b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f28101c = "";

        /* renamed from: d, reason: collision with root package name */
        public String f28102d = "";

        public void a(String str) {
            this.f28101c = str;
        }

        public void b(String str) {
            this.f28099a = str;
        }

        public void c(String str) {
            this.f28102d = str;
        }

        public void d(String str) {
            this.f28100b = str;
        }

        public HashMap e() {
            HashMap hashMap = new HashMap();
            hashMap.put(f28098h, this.f28099a);
            hashMap.put(f28097g, this.f28100b);
            hashMap.put(f28096f, this.f28101c);
            hashMap.put(f28095e, this.f28102d);
            return hashMap;
        }

        public String toString() {
            return "Address{state='" + this.f28099a + "', zipCode='" + this.f28100b + "', city='" + this.f28101c + "', street='" + this.f28102d + "'}";
        }
    }

    public static a b() {
        return f28092b;
    }

    public static Object c() {
        return f28093c;
    }

    public C0453a a() {
        return this.f28094a;
    }

    public void d(C0453a c0453a) {
        this.f28094a = c0453a;
    }
}
