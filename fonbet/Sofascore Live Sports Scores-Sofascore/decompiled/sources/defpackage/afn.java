package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class afn {
    public static final ThreadLocal d = ThreadLocal.withInitial(new Supplier() { // from class: zen
        @Override // java.util.function.Supplier
        public final /* synthetic */ Object get() {
            return new HashSet();
        }
    });
    public boolean a = true;
    public final ArrayList b;
    public String[] c;

    public afn() {
        ArrayList arrayList = new ArrayList(1);
        this.b = arrayList;
        arrayList.add(String.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1.isInstance(r5) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r7.isInstance(r6) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Object obj, Object obj2, String... strArr) {
        Class<?> cls;
        if (obj == obj2) {
            return true;
        }
        afn afnVar = new afn();
        afnVar.c = strArr;
        if (afnVar.a && obj != obj2) {
            Class<?> cls2 = obj.getClass();
            Class<?> cls3 = obj2.getClass();
            if (!cls2.isInstance(obj2)) {
                if (cls3.isInstance(obj)) {
                }
                afnVar.a = false;
            }
            try {
                if (cls.isArray()) {
                    afnVar.b(obj, obj2);
                } else {
                    ArrayList arrayList = afnVar.b;
                    if (!arrayList.contains(cls2) && !arrayList.contains(cls3)) {
                        afnVar.c(obj, obj2, cls);
                        while (cls.getSuperclass() != null) {
                            cls = cls.getSuperclass();
                            afnVar.c(obj, obj2, cls);
                        }
                    }
                    afnVar.a = obj.equals(obj2);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return afnVar.a;
    }

    public final void b(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.a && obj != obj2) {
            if (obj == null || obj2 == null) {
                this.a = false;
                return;
            }
            if (!obj.getClass().isArray()) {
                this.a = obj.equals(obj2);
                return;
            }
            if (obj.getClass() != obj2.getClass()) {
                this.a = false;
                return;
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (!this.a || jArr == jArr2) {
                    return;
                }
                if (jArr.length != jArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i = 0; i < jArr.length && (z7 = this.a); i++) {
                    long j = jArr[i];
                    long j2 = jArr2[i];
                    if (z7) {
                        this.a = j == j2;
                    }
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (!this.a || iArr == iArr2) {
                    return;
                }
                if (iArr.length != iArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i2 = 0; i2 < iArr.length && (z6 = this.a); i2++) {
                    int i3 = iArr[i2];
                    int i4 = iArr2[i2];
                    if (z6) {
                        this.a = i3 == i4;
                    }
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (!this.a || sArr == sArr2) {
                    return;
                }
                if (sArr.length != sArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i5 = 0; i5 < sArr.length && (z5 = this.a); i5++) {
                    short s = sArr[i5];
                    short s2 = sArr2[i5];
                    if (z5) {
                        this.a = s == s2;
                    }
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (!this.a || cArr == cArr2) {
                    return;
                }
                if (cArr.length != cArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i6 = 0; i6 < cArr.length && (z4 = this.a); i6++) {
                    char c = cArr[i6];
                    char c2 = cArr2[i6];
                    if (z4) {
                        this.a = c == c2;
                    }
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (!this.a || bArr == bArr2) {
                    return;
                }
                if (bArr.length != bArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i7 = 0; i7 < bArr.length && (z3 = this.a); i7++) {
                    byte b = bArr[i7];
                    byte b2 = bArr2[i7];
                    if (z3) {
                        this.a = b == b2;
                    }
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (!this.a || dArr == dArr2) {
                    return;
                }
                if (dArr.length != dArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i8 = 0; i8 < dArr.length && (z2 = this.a); i8++) {
                    double d2 = dArr[i8];
                    double d3 = dArr2[i8];
                    if (z2) {
                        long doubleToLongBits = Double.doubleToLongBits(d2);
                        long doubleToLongBits2 = Double.doubleToLongBits(d3);
                        if (this.a) {
                            this.a = doubleToLongBits == doubleToLongBits2;
                        }
                    }
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (!this.a || fArr == fArr2) {
                    return;
                }
                if (fArr.length != fArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i9 = 0; i9 < fArr.length && (z = this.a); i9++) {
                    float f = fArr[i9];
                    float f2 = fArr2[i9];
                    if (z) {
                        int floatToIntBits = Float.floatToIntBits(f);
                        int floatToIntBits2 = Float.floatToIntBits(f2);
                        if (this.a) {
                            this.a = floatToIntBits == floatToIntBits2;
                        }
                    }
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (!this.a || objArr == objArr2) {
                    return;
                }
                if (objArr.length != objArr2.length) {
                    this.a = false;
                    return;
                }
                for (int i10 = 0; i10 < objArr.length && this.a; i10++) {
                    b(objArr[i10], objArr2[i10]);
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (!this.a || zArr == zArr2) {
                return;
            }
            if (zArr.length != zArr2.length) {
                this.a = false;
                return;
            }
            for (int i11 = 0; i11 < zArr.length && this.a; i11++) {
                this.a = zArr[i11] == zArr2[i11];
            }
        }
    }

    public final void c(Object obj, Object obj2, Class cls) {
        ThreadLocal threadLocal = d;
        Set set = (Set) threadLocal.get();
        kfn kfnVar = new kfn(new hfn(obj), new hfn(obj2));
        hfn hfnVar = (hfn) kfnVar.b;
        hfn hfnVar2 = (hfn) kfnVar.a;
        kfn kfnVar2 = (hfnVar == null && hfnVar2 == null) ? kfn.c : new kfn(hfnVar, hfnVar2);
        if (set == null || !(set.contains(kfnVar) || set.contains(kfnVar2))) {
            try {
                ((Set) threadLocal.get()).add(new kfn(new hfn(obj), new hfn(obj2)));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i = 0; i < declaredFields.length && this.a; i++) {
                    Field field = declaredFields[i];
                    if (!h5a.V(field.getName(), this.c) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(bfn.class)) {
                        b(q5a.R(field, obj), q5a.R(field, obj2));
                    }
                }
            } finally {
                Set set2 = (Set) threadLocal.get();
                set2.remove(new kfn(new hfn(obj), new hfn(obj2)));
                if (set2.isEmpty()) {
                    threadLocal.remove();
                }
            }
        }
    }
}
