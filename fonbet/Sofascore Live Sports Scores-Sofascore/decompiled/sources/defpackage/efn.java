package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class efn {
    public static final ThreadLocal b = ThreadLocal.withInitial(new Supplier() { // from class: dfn
        @Override // java.util.function.Supplier
        public final /* synthetic */ Object get() {
            return new HashSet();
        }
    });
    public int a = 17;

    public static int a(Object obj, String... strArr) {
        efn efnVar = new efn();
        Class<?> cls = obj.getClass();
        c(obj, cls, efnVar, strArr);
        while (cls.getSuperclass() != null) {
            cls = cls.getSuperclass();
            c(obj, cls, efnVar, strArr);
        }
        return efnVar.a;
    }

    public static void c(Object obj, Class cls, efn efnVar, String[] strArr) {
        ThreadLocal threadLocal = b;
        Set set = (Set) threadLocal.get();
        if (set == null || !set.contains(new hfn(obj))) {
            try {
                ((Set) threadLocal.get()).add(new hfn(obj));
                Field[] declaredFields = cls.getDeclaredFields();
                Comparator comparing = Comparator.comparing(new Function() { // from class: cfn
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj2) {
                        return ((Field) obj2).getName();
                    }
                });
                if (declaredFields != null) {
                    Arrays.sort(declaredFields, comparing);
                }
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!h5a.V(field.getName(), strArr) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(ffn.class)) {
                        efnVar.b(q5a.R(field, obj));
                    }
                }
                Set set2 = (Set) threadLocal.get();
                set2.remove(new hfn(obj));
                if (set2.isEmpty()) {
                    threadLocal.remove();
                }
            } catch (Throwable th) {
                Set set3 = (Set) threadLocal.get();
                set3.remove(new hfn(obj));
                if (set3.isEmpty()) {
                    threadLocal.remove();
                }
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            this.a *= 37;
            return;
        }
        if (!obj.getClass().isArray()) {
            this.a = obj.hashCode() + (this.a * 37);
            return;
        }
        int i = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            while (i < length) {
                long j = jArr[i];
                this.a = (this.a * 37) + ((int) (j ^ (j >> 32)));
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length2 = iArr.length;
            while (i < length2) {
                this.a = (this.a * 37) + iArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            while (i < length3) {
                this.a = (this.a * 37) + sArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i < length4) {
                this.a = (this.a * 37) + cArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i < length5) {
                this.a = (this.a * 37) + bArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i < length6) {
                long doubleToLongBits = Double.doubleToLongBits(dArr[i]);
                this.a = (this.a * 37) + ((int) (doubleToLongBits ^ (doubleToLongBits >> 32)));
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            while (i < length7) {
                this.a = Float.floatToIntBits(fArr[i]) + (this.a * 37);
                i++;
            }
            return;
        }
        if (!(obj instanceof boolean[])) {
            Object[] objArr = (Object[]) obj;
            int length8 = objArr.length;
            while (i < length8) {
                b(objArr[i]);
                i++;
            }
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length9 = zArr.length;
        while (i < length9) {
            this.a = (this.a * 37) + (!zArr[i] ? 1 : 0);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efn) && this.a == ((efn) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
