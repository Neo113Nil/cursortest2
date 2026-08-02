package e3;

import com.google.android.gms.internal.measurement.d5;
import io.sentry.android.core.w0;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8523a;

    public i(m4.p pVar) {
        Map map = pVar.f20414a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.X((Collection) entry.getValue()));
        }
        this.f8523a = linkedHashMap;
    }

    public void a(ag.c clazz, Function1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f8523a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new t1.f(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + d5.r(clazz) + '.').toString());
    }

    public void b(n2.b migration) {
        Intrinsics.checkNotNullParameter(migration, "migration");
        int i5 = migration.f20819a;
        int i10 = migration.f20820b;
        Integer valueOf = Integer.valueOf(i5);
        LinkedHashMap linkedHashMap = this.f8523a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            w0.m("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + migration);
        }
        treeMap.put(Integer.valueOf(i10), migration);
    }

    public j c() {
        j jVar = new j(this.f8523a);
        rh.g.L(jVar);
        return jVar;
    }

    public t1.d d() {
        Collection initializers = this.f8523a.values();
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        t1.f[] fVarArr = (t1.f[]) initializers.toArray(new t1.f[0]);
        return new t1.d((t1.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public void e(Object obj, String key) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj == null) {
            obj = null;
        } else {
            ag.c orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class))) {
                int i5 = 0;
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str = k.f8534a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i5 < length) {
                        objArr[i5] = Boolean.valueOf(zArr[i5]);
                        i5++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str2 = k.f8534a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i5 < length2) {
                        objArr[i5] = Byte.valueOf(bArr[i5]);
                        i5++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str3 = k.f8534a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i5 < length3) {
                        objArr[i5] = Integer.valueOf(iArr[i5]);
                        i5++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str4 = k.f8534a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i5 < length4) {
                        objArr[i5] = Long.valueOf(jArr[i5]);
                        i5++;
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str5 = k.f8534a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i5 < length5) {
                        objArr[i5] = Float.valueOf(fArr[i5]);
                        i5++;
                    }
                } else {
                    if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + orCreateKotlinClass);
                    }
                    double[] dArr = (double[]) obj;
                    String str6 = k.f8534a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i5 < length6) {
                        objArr[i5] = Double.valueOf(dArr[i5]);
                        i5++;
                    }
                }
                obj = objArr;
            }
        }
        this.f8523a.put(key, obj);
    }

    public void f(HashMap values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            e(entry.getValue(), (String) entry.getKey());
        }
    }

    public f3.k g(m3.j id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (f3.k) this.f8523a.remove(id2);
    }

    public List h(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f8523a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.areEqual(((m3.j) entry.getKey()).f20321a, workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((m3.j) it.next());
        }
        return CollectionsKt.W(linkedHashMap.values());
    }

    public void i(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f8523a.put(lowerCase, kotlin.collections.u.g(str));
    }

    public f3.k j(m3.j id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        LinkedHashMap linkedHashMap = this.f8523a;
        Object obj = linkedHashMap.get(id2);
        if (obj == null) {
            obj = new f3.k(id2);
            linkedHashMap.put(id2, obj);
        }
        return (f3.k) obj;
    }

    public i(int i5) {
        switch (i5) {
            case 1:
                this.f8523a = new LinkedHashMap();
                break;
            case 2:
                this.f8523a = new LinkedHashMap();
                break;
            case 3:
            default:
                this.f8523a = new LinkedHashMap();
                break;
            case 4:
                this.f8523a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 5:
                this.f8523a = new LinkedHashMap();
                break;
        }
    }
}
