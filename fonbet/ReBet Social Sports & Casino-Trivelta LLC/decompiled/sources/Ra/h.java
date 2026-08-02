package Ra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f10137a;

        /* renamed from: b, reason: collision with root package name */
        public final a f10138b;

        /* renamed from: c, reason: collision with root package name */
        public a f10139c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10140d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f10141e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public String f10142a;

            /* renamed from: b, reason: collision with root package name */
            public Object f10143b;

            /* renamed from: c, reason: collision with root package name */
            public a f10144c;
        }

        public static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof k ? !((k) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final a a() {
            a aVar = new a();
            this.f10139c.f10144c = aVar;
            this.f10139c = aVar;
            return aVar;
        }

        public final b b(Object obj) {
            a().f10143b = obj;
            return this;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            boolean z10 = this.f10140d;
            boolean z11 = this.f10141e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f10137a);
            sb2.append('{');
            String str2 = "";
            for (a aVar = this.f10138b.f10144c; aVar != null; aVar = aVar.f10144c) {
                Object obj = aVar.f10143b;
                if (obj == null) {
                    if (z10) {
                    }
                    sb2.append(str2);
                    str = aVar.f10142a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                } else {
                    if (z11 && d(obj)) {
                    }
                    sb2.append(str2);
                    str = aVar.f10142a;
                    if (str != null) {
                    }
                    if (obj == null) {
                    }
                    sb2.append(obj);
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public b(String str) {
            a aVar = new a();
            this.f10138b = aVar;
            this.f10139c = aVar;
            this.f10140d = false;
            this.f10141e = false;
            this.f10137a = (String) n.k(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
