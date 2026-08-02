package D6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class i {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2562a;

        /* renamed from: b, reason: collision with root package name */
        public final C0053a f2563b;

        /* renamed from: c, reason: collision with root package name */
        public C0053a f2564c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2565d;

        /* renamed from: D6.i$a$a, reason: collision with other inner class name */
        public static final class C0053a {

            /* renamed from: a, reason: collision with root package name */
            public String f2566a;

            /* renamed from: b, reason: collision with root package name */
            public Object f2567b;

            /* renamed from: c, reason: collision with root package name */
            public C0053a f2568c;

            public C0053a() {
            }
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public final C0053a d() {
            C0053a c0053a = new C0053a();
            this.f2564c.f2568c = c0053a;
            this.f2564c = c0053a;
            return c0053a;
        }

        public final a e(String str, Object obj) {
            C0053a d10 = d();
            d10.f2567b = obj;
            d10.f2566a = (String) k.g(str);
            return this;
        }

        public String toString() {
            boolean z10 = this.f2565d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f2562a);
            sb2.append('{');
            String str = "";
            for (C0053a c0053a = this.f2563b.f2568c; c0053a != null; c0053a = c0053a.f2568c) {
                Object obj = c0053a.f2567b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = c0053a.f2566a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public a(String str) {
            C0053a c0053a = new C0053a();
            this.f2563b = c0053a;
            this.f2564c = c0053a;
            this.f2565d = false;
            this.f2562a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
