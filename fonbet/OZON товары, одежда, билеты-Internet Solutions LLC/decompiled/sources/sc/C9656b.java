package sc;

import Ve.C4598rp;
import qc.d;

/* renamed from: sc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9656b {

    /* renamed from: a, reason: collision with root package name */
    static final d<Object, Object> f98551a = new a();

    /* renamed from: sc.b$a */
    static final class a implements d<Object, Object> {
        @Override // qc.d
        public final boolean a(Object obj, Object obj2) {
            return C9656b.a(obj, obj2);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> d<T, T> b() {
        return (d<T, T>) f98551a;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(int i11, String str) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(C4598rp.c(i11, str, " > 0 required but it was "));
        }
    }

    public static void e(long j11, String str) {
        if (j11 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j11);
    }
}
