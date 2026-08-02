package s9;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f23362a;

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f23363b;

    /* renamed from: c, reason: collision with root package name */
    public static final r0 f23364c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = c.f23286a;
        r0 r0Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f23362a = cls;
        try {
            Class cls4 = c.f23286a;
            try {
                cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                r0Var = (r0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f23363b = r0Var;
        f23364c = new r0();
    }

    public static void b(r0 r0Var, Object obj, Object obj2) {
        r0Var.getClass();
        r rVar = (r) obj;
        q0 q0Var = rVar.f23374c;
        q0 q0Var2 = ((r) obj2).f23374c;
        q0 q0Var3 = q0.f23367e;
        if (!q0Var3.equals(q0Var2)) {
            if (q0Var3.equals(q0Var)) {
                int i5 = q0Var.f23368a + q0Var2.f23368a;
                int[] copyOf = Arrays.copyOf(q0Var.f23369b, i5);
                System.arraycopy(q0Var2.f23369b, 0, copyOf, q0Var.f23368a, q0Var2.f23368a);
                Object[] copyOf2 = Arrays.copyOf(q0Var.f23370c, i5);
                System.arraycopy(q0Var2.f23370c, 0, copyOf2, q0Var.f23368a, q0Var2.f23368a);
                q0Var = new q0(i5, copyOf, copyOf2, true);
            } else {
                q0Var.getClass();
                if (!q0Var2.equals(q0Var3)) {
                    if (!q0Var.f23371d) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = q0Var.f23368a + q0Var2.f23368a;
                    q0Var.a(i10);
                    System.arraycopy(q0Var2.f23369b, 0, q0Var.f23369b, q0Var.f23368a, q0Var2.f23368a);
                    System.arraycopy(q0Var2.f23370c, 0, q0Var.f23370c, q0Var.f23368a, q0Var2.f23368a);
                    q0Var.f23368a = i10;
                }
            }
        }
        rVar.f23374c = q0Var;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object a(Object obj, int i5, s sVar, Object obj2, r0 r0Var) {
        return obj2;
    }
}
