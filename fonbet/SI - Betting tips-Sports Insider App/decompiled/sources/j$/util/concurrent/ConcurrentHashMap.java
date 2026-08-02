package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, s {

    /* renamed from: g, reason: collision with root package name */
    public static final int f17625g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f17626h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f17627i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f17628k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f17629l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f17630m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17631n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17632o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient j[] f17633a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient j[] f17634b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient b[] f17635c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    public transient KeySetView f17636d;

    /* renamed from: e, reason: collision with root package name */
    public transient q f17637e;

    /* renamed from: f, reason: collision with root package name */
    public transient d f17638f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static final int i(int i5) {
        return (i5 ^ (i5 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", l[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f17277b;
        f17626h = aVar;
        f17627i = aVar.h(ConcurrentHashMap.class, "sizeCtl");
        j = aVar.h(ConcurrentHashMap.class, "transferIndex");
        f17628k = aVar.h(ConcurrentHashMap.class, "baseCount");
        f17629l = aVar.h(ConcurrentHashMap.class, "cellsBusy");
        f17630m = aVar.h(b.class, "value");
        f17631n = aVar.a(j[].class);
        int b10 = aVar.b(j[].class);
        if (((b10 - 1) & b10) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f17632o = 31 - Integer.numberOfLeadingZeros(b10);
    }

    public static final int l(int i5) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i5 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return numberOfLeadingZeros + 1;
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final j k(j[] jVarArr, int i5) {
        return (j) f17626h.f(jVarArr, (i5 << f17632o) + f17631n);
    }

    public static final boolean b(j[] jVarArr, int i5, j jVar) {
        return j$.com.android.tools.r8.a.Q(f17626h.f17278a, jVarArr, (i5 << f17632o) + f17631n, jVar);
    }

    public static final void h(j[] jVarArr, int i5, j jVar) {
        f17626h.j(jVarArr, (i5 << f17632o) + f17631n, jVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i5) {
        this(i5, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i5, float f6, int i10) {
        if (f6 <= 0.0f || i5 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j6 = (long) (((i5 < i10 ? i10 : i5) / f6) + 1.0d);
        this.sizeCtl = j6 >= 1073741824 ? 1073741824 : l((int) j6);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j6 = j();
        if (j6 < 0) {
            return 0;
        }
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        return (V) r1.f17658c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        j k6;
        Object obj2;
        int i5 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        if (jVarArr == null || (length = jVarArr.length) <= 0 || (k6 = k(jVarArr, (length - 1) & i5)) == null) {
            return null;
        }
        int i10 = k6.f17656a;
        if (i10 == i5) {
            Object obj3 = k6.f17657b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) k6.f17658c;
            }
        } else if (i10 < 0) {
            j a7 = k6.a(i5, obj);
            if (a7 != null) {
                return (V) a7.f17658c;
            }
            return null;
        }
        while (true) {
            k6 = k6.f17659d;
            if (k6 == null) {
                return null;
            }
            if (k6.f17656a != i5 || ((obj2 = k6.f17657b) != obj && (obj2 == null || !obj.equals(obj2)))) {
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        j[] jVarArr = this.f17633a;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a7 = nVar.a();
                if (a7 == null) {
                    break;
                }
                Object obj2 = a7.f17658c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k6, V v5) {
        return (V) f(k6, v5, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, boolean z5) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        int i5 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        int i10 = 0;
        while (true) {
            if (jVarArr != null) {
                int length = jVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i5;
                    j k6 = k(jVarArr, i11);
                    if (k6 == null) {
                        if (b(jVarArr, i11, new j(i5, obj, obj2))) {
                            break;
                        }
                    } else {
                        int i12 = k6.f17656a;
                        if (i12 == -1) {
                            jVarArr = d(jVarArr, k6);
                        } else {
                            if (z5 && i12 == i5 && (((obj5 = k6.f17657b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k6.f17658c) != null)) {
                                return obj6;
                            }
                            synchronized (k6) {
                                try {
                                    if (k(jVarArr, i11) == k6) {
                                        if (i12 >= 0) {
                                            i10 = 1;
                                            j jVar = k6;
                                            while (true) {
                                                if (jVar.f17656a == i5 && ((obj4 = jVar.f17657b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                    break;
                                                }
                                                j jVar2 = jVar.f17659d;
                                                if (jVar2 == null) {
                                                    jVar.f17659d = new j(i5, obj, obj2);
                                                    break;
                                                }
                                                i10++;
                                                jVar = jVar2;
                                            }
                                            obj3 = jVar.f17658c;
                                            if (!z5) {
                                                jVar.f17658c = obj2;
                                            }
                                        } else if (k6 instanceof o) {
                                            p e7 = ((o) k6).e(i5, obj, obj2);
                                            if (e7 != null) {
                                                Object obj7 = e7.f17658c;
                                                if (!z5) {
                                                    e7.f17658c = obj2;
                                                }
                                                obj3 = obj7;
                                            } else {
                                                obj3 = null;
                                            }
                                            i10 = 2;
                                        } else if (k6 instanceof k) {
                                            break;
                                        }
                                    }
                                    obj3 = null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(jVarArr, i11);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    }
                }
            }
            jVarArr = e();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i5;
        j k6;
        boolean z5;
        Object obj4;
        p b10;
        Object obj5;
        int i10 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        while (true) {
            if (jVarArr == null || (length = jVarArr.length) == 0 || (k6 = k(jVarArr, (i5 = (length - 1) & i10))) == null) {
                break;
            }
            int i11 = k6.f17656a;
            if (i11 == -1) {
                jVarArr = d(jVarArr, k6);
            } else {
                synchronized (k6) {
                    try {
                        if (k(jVarArr, i5) == k6) {
                            z5 = true;
                            if (i11 >= 0) {
                                j jVar = null;
                                j jVar2 = k6;
                                while (true) {
                                    if (jVar2.f17656a == i10 && ((obj5 = jVar2.f17657b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    j jVar3 = jVar2.f17659d;
                                    if (jVar3 == null) {
                                        break;
                                    }
                                    jVar = jVar2;
                                    jVar2 = jVar3;
                                }
                                obj4 = jVar2.f17658c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        jVar2.f17658c = obj2;
                                    } else if (jVar != null) {
                                        jVar.f17659d = jVar2.f17659d;
                                    } else {
                                        h(jVarArr, i5, jVar2.f17659d);
                                    }
                                }
                                obj4 = null;
                            } else if (k6 instanceof o) {
                                o oVar = (o) k6;
                                p pVar = oVar.f17674e;
                                if (pVar != null && (b10 = pVar.b(i10, obj, null)) != null) {
                                    obj4 = b10.f17658c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b10.f17658c = obj2;
                                        } else if (oVar.f(b10)) {
                                            h(jVarArr, i5, p(oVar.f17675f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k6 instanceof k) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z5 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z5) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j k6;
        j jVar;
        j[] jVarArr = this.f17633a;
        long j6 = 0;
        loop0: while (true) {
            int i5 = 0;
            while (jVarArr != null && i5 < jVarArr.length) {
                k6 = k(jVarArr, i5);
                if (k6 == null) {
                    i5++;
                } else {
                    int i10 = k6.f17656a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (k6) {
                        try {
                            if (k(jVarArr, i5) == k6) {
                                if (i10 >= 0) {
                                    jVar = k6;
                                } else {
                                    jVar = k6 instanceof o ? ((o) k6).f17675f : null;
                                }
                                while (jVar != null) {
                                    j6--;
                                    jVar = jVar.f17659d;
                                }
                                h(jVarArr, i5, null);
                                i5++;
                            }
                        } finally {
                        }
                    }
                }
            }
            jVarArr = d(jVarArr, k6);
        }
        if (j6 != 0) {
            a(j6, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.f17636d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f17636d = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        q qVar = this.f17637e;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this.f17637e = qVar2;
        return qVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        d dVar = this.f17638f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f17638f = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        j[] jVarArr = this.f17633a;
        int i5 = 0;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a7 = nVar.a();
                if (a7 == null) {
                    break;
                }
                i5 += a7.f17658c.hashCode() ^ a7.f17657b.hashCode();
            }
        }
        return i5;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        j[] jVarArr = this.f17633a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        n nVar = new n(jVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        j a7 = nVar.a();
        if (a7 != null) {
            while (true) {
                Object obj = a7.f17657b;
                Object obj2 = a7.f17658c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a7 = nVar.a();
                if (a7 == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        V value;
        V v5;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        j[] jVarArr = this.f17633a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        n nVar = new n(jVarArr, length, 0, length);
        while (true) {
            j a7 = nVar.a();
            if (a7 != null) {
                Object obj2 = a7.f17658c;
                Object obj3 = map.get(a7.f17657b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v5 = get(key)) == null || (value != v5 && !value.equals(v5))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i5 = 0;
        int i10 = 1;
        while (i10 < 16) {
            i5++;
            i10 <<= 1;
        }
        int i11 = 32 - i5;
        int i12 = i10 - 1;
        l[] lVarArr = new l[16];
        for (int i13 = 0; i13 < 16; i13++) {
            lVarArr[i13] = new l();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", lVarArr);
        putFields.put("segmentShift", i11);
        putFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        j[] jVarArr = this.f17633a;
        if (jVarArr != null) {
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a7 = nVar.a();
                if (a7 == null) {
                    break;
                }
                objectOutputStream.writeObject(a7.f17657b);
                objectOutputStream.writeObject(a7.f17658c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j6;
        long j10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        j jVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j6 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            jVar = new j(i(readObject.hashCode()), readObject, readObject2, jVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) ((j12 / 0.75f) + 1.0d);
        int l6 = j13 >= 1073741824 ? 1073741824 : l((int) j13);
        j[] jVarArr = new j[l6];
        int i5 = l6 - 1;
        while (jVar != null) {
            j jVar2 = jVar.f17659d;
            int i10 = jVar.f17656a;
            int i11 = i10 & i5;
            j k6 = k(jVarArr, i11);
            boolean z5 = true;
            if (k6 == null) {
                j10 = j6;
            } else {
                Object obj2 = jVar.f17657b;
                if (k6.f17656a < 0) {
                    if (((o) k6).e(i10, obj2, jVar.f17658c) == null) {
                        j11 += j6;
                    }
                    j10 = j6;
                } else {
                    j10 = j6;
                    int i12 = 0;
                    for (j jVar3 = k6; jVar3 != null; jVar3 = jVar3.f17659d) {
                        if (jVar3.f17656a == i10 && ((obj = jVar3.f17657b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z5 = false;
                            break;
                        }
                        i12++;
                    }
                    if (z5 && i12 >= 8) {
                        j11 += j10;
                        jVar.f17659d = k6;
                        j jVar4 = jVar;
                        p pVar = null;
                        p pVar2 = null;
                        while (jVar4 != null) {
                            p pVar3 = new p(jVar4.f17656a, jVar4.f17657b, jVar4.f17658c, null, null);
                            pVar3.f17680h = pVar2;
                            if (pVar2 == null) {
                                pVar = pVar3;
                            } else {
                                pVar2.f17659d = pVar3;
                            }
                            jVar4 = jVar4.f17659d;
                            pVar2 = pVar3;
                        }
                        h(jVarArr, i11, new o(pVar));
                    }
                }
                z5 = false;
            }
            if (z5) {
                j11 += j10;
                jVar.f17659d = k6;
                h(jVarArr, i11, jVar);
            }
            jVar = jVar2;
            j6 = j10;
        }
        this.f17633a = jVarArr;
        this.sizeCtl = l6 - (l6 >>> 2);
        this.baseCount = j11;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k6, V v5) {
        return (V) f(k6, v5, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v5 = get(obj);
        return v5 == null ? obj2 : v5;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        j[] jVarArr = this.f17633a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j a7 = nVar.a();
            if (a7 == null) {
                return;
            } else {
                biConsumer.accept(a7.f17657b, a7.f17658c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        j[] jVarArr = this.f17633a;
        if (jVarArr == null) {
            return;
        }
        n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
        while (true) {
            j a7 = nVar.a();
            if (a7 == null) {
                return;
            }
            Object obj = a7.f17658c;
            Object obj2 = a7.f17657b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (r5 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        p b10;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (function == null) {
            throw null;
        }
        int i5 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        Object obj5 = null;
        int i10 = 0;
        while (true) {
            if (jVarArr != null) {
                int length = jVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i5;
                    j k6 = k(jVarArr, i11);
                    boolean z5 = true;
                    if (k6 == null) {
                        k kVar = new k();
                        synchronized (kVar) {
                            try {
                                if (b(jVarArr, i11, kVar)) {
                                    try {
                                        obj5 = function.apply(obj);
                                        h(jVarArr, i11, obj5 != null ? new j(i5, obj, obj5) : null);
                                        i10 = 1;
                                    } catch (Throwable th2) {
                                        h(jVarArr, i11, null);
                                        throw th2;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i12 = k6.f17656a;
                        if (i12 == -1) {
                            jVarArr = d(jVarArr, k6);
                        } else {
                            if (i12 == i5 && (((obj3 = k6.f17657b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k6.f17658c) != null)) {
                                return obj4;
                            }
                            synchronized (k6) {
                                try {
                                    if (k(jVarArr, i11) == k6) {
                                        if (i12 >= 0) {
                                            j jVar = k6;
                                            i10 = 1;
                                            while (true) {
                                                if (jVar.f17656a == i5 && ((obj2 = jVar.f17657b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                j jVar2 = jVar.f17659d;
                                                if (jVar2 == null) {
                                                    Object apply = function.apply(obj);
                                                    if (apply == null) {
                                                        z5 = false;
                                                    } else {
                                                        if (jVar.f17659d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        jVar.f17659d = new j(i5, obj, apply);
                                                    }
                                                    obj5 = apply;
                                                } else {
                                                    i10++;
                                                    jVar = jVar2;
                                                }
                                            }
                                            obj5 = jVar.f17658c;
                                        } else if (k6 instanceof o) {
                                            o oVar = (o) k6;
                                            p pVar = oVar.f17674e;
                                            if (pVar != null && (b10 = pVar.b(i5, obj, null)) != null) {
                                                z5 = false;
                                                obj5 = b10.f17658c;
                                            } else {
                                                obj5 = function.apply(obj);
                                                if (obj5 != null) {
                                                    oVar.e(i5, obj, obj5);
                                                } else {
                                                    z5 = false;
                                                }
                                            }
                                            i10 = 2;
                                        } else if (k6 instanceof k) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                    z5 = false;
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(jVarArr, i11);
                                }
                                if (!z5) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            jVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        p b10;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i5 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (jVarArr != null) {
                int length = jVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i5;
                    j k6 = k(jVarArr, i12);
                    if (k6 == null) {
                        break;
                    }
                    int i13 = k6.f17656a;
                    if (i13 == -1) {
                        jVarArr = d(jVarArr, k6);
                    } else {
                        synchronized (k6) {
                            try {
                                if (k(jVarArr, i12) == k6) {
                                    if (i13 >= 0) {
                                        i11 = 1;
                                        j jVar = null;
                                        j jVar2 = k6;
                                        while (true) {
                                            if (jVar2.f17656a == i5 && ((obj2 = jVar2.f17657b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            j jVar3 = jVar2.f17659d;
                                            if (jVar3 == null) {
                                                break;
                                            }
                                            i11++;
                                            jVar = jVar2;
                                            jVar2 = jVar3;
                                        }
                                        obj3 = biFunction.apply(obj, jVar2.f17658c);
                                        if (obj3 != null) {
                                            jVar2.f17658c = obj3;
                                        } else {
                                            j jVar4 = jVar2.f17659d;
                                            if (jVar != null) {
                                                jVar.f17659d = jVar4;
                                            } else {
                                                h(jVarArr, i12, jVar4);
                                            }
                                            i10 = -1;
                                        }
                                    } else if (k6 instanceof o) {
                                        o oVar = (o) k6;
                                        p pVar = oVar.f17674e;
                                        if (pVar != null && (b10 = pVar.b(i5, obj, null)) != null) {
                                            obj3 = biFunction.apply(obj, b10.f17658c);
                                            if (obj3 != null) {
                                                b10.f17658c = obj3;
                                            } else {
                                                if (oVar.f(b10)) {
                                                    h(jVarArr, i12, p(oVar.f17675f));
                                                }
                                                i10 = -1;
                                            }
                                        }
                                        i11 = 2;
                                    } else if (k6 instanceof k) {
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i11 != 0) {
                            break;
                        }
                    }
                }
            }
            jVarArr = e();
        }
        if (i10 != 0) {
            a(i10, i11);
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0110, code lost:
    
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0114, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        j jVar;
        Object apply;
        Object obj2;
        if (obj == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i5 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        int i10 = 0;
        Object obj3 = null;
        int i11 = 0;
        while (true) {
            if (jVarArr != null) {
                int length = jVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i5;
                    j k6 = k(jVarArr, i12);
                    if (k6 == null) {
                        k kVar = new k();
                        synchronized (kVar) {
                            try {
                                if (b(jVarArr, i12, kVar)) {
                                    try {
                                        obj3 = biFunction.apply(obj, null);
                                        if (obj3 != null) {
                                            jVar = new j(i5, obj, obj3);
                                            i11 = 1;
                                        } else {
                                            jVar = null;
                                        }
                                        h(jVarArr, i12, jVar);
                                        i10 = 1;
                                    } catch (Throwable th2) {
                                        h(jVarArr, i12, null);
                                        throw th2;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i10 != 0) {
                        }
                    } else {
                        int i13 = k6.f17656a;
                        if (i13 == -1) {
                            jVarArr = d(jVarArr, k6);
                        } else {
                            synchronized (k6) {
                                try {
                                    if (k(jVarArr, i12) == k6) {
                                        if (i13 >= 0) {
                                            j jVar2 = null;
                                            j jVar3 = k6;
                                            i10 = 1;
                                            while (true) {
                                                if (jVar3.f17656a == i5 && ((obj2 = jVar3.f17657b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                j jVar4 = jVar3.f17659d;
                                                if (jVar4 == null) {
                                                    apply = biFunction.apply(obj, null);
                                                    if (apply != null) {
                                                        if (jVar3.f17659d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        jVar3.f17659d = new j(i5, obj, apply);
                                                        i11 = 1;
                                                    }
                                                } else {
                                                    i10++;
                                                    jVar2 = jVar3;
                                                    jVar3 = jVar4;
                                                }
                                            }
                                            Object apply2 = biFunction.apply(obj, jVar3.f17658c);
                                            if (apply2 != null) {
                                                jVar3.f17658c = apply2;
                                                obj3 = apply2;
                                            } else {
                                                j jVar5 = jVar3.f17659d;
                                                if (jVar2 != null) {
                                                    jVar2.f17659d = jVar5;
                                                } else {
                                                    h(jVarArr, i12, jVar5);
                                                }
                                                obj3 = apply2;
                                                i11 = -1;
                                            }
                                        } else if (k6 instanceof o) {
                                            o oVar = (o) k6;
                                            p pVar = oVar.f17674e;
                                            p b10 = pVar != null ? pVar.b(i5, obj, null) : null;
                                            apply = biFunction.apply(obj, b10 == null ? null : b10.f17658c);
                                            if (apply != null) {
                                                if (b10 != null) {
                                                    b10.f17658c = apply;
                                                } else {
                                                    oVar.e(i5, obj, apply);
                                                    i11 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (oVar.f(b10)) {
                                                    h(jVarArr, i12, p(oVar.f17675f));
                                                }
                                                i11 = -1;
                                            }
                                            i10 = 1;
                                            obj3 = apply;
                                        } else if (k6 instanceof k) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    n(jVarArr, i12);
                                }
                            }
                        }
                    }
                }
            }
            jVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i5;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null) {
            throw null;
        }
        if (obj4 == null) {
            throw null;
        }
        if (biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        j[] jVarArr = this.f17633a;
        int i11 = 0;
        Object obj5 = null;
        int i12 = 0;
        while (true) {
            if (jVarArr != null) {
                int length = jVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    j k6 = k(jVarArr, i13);
                    i5 = 1;
                    if (k6 == null) {
                        if (b(jVarArr, i13, new j(i10, obj, obj4))) {
                            break;
                        }
                    } else {
                        int i14 = k6.f17656a;
                        if (i14 == -1) {
                            jVarArr = d(jVarArr, k6);
                        } else {
                            synchronized (k6) {
                                try {
                                    if (k(jVarArr, i13) == k6) {
                                        if (i14 >= 0) {
                                            j jVar = null;
                                            j jVar2 = k6;
                                            i11 = 1;
                                            while (true) {
                                                if (jVar2.f17656a == i10 && ((obj3 = jVar2.f17657b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                j jVar3 = jVar2.f17659d;
                                                if (jVar3 == null) {
                                                    jVar2.f17659d = new j(i10, obj, obj4);
                                                    obj5 = obj4;
                                                    i12 = 1;
                                                    break;
                                                }
                                                i11++;
                                                jVar = jVar2;
                                                jVar2 = jVar3;
                                            }
                                            Object apply = biFunction.apply(jVar2.f17658c, obj4);
                                            if (apply != null) {
                                                jVar2.f17658c = apply;
                                                obj5 = apply;
                                            } else {
                                                j jVar4 = jVar2.f17659d;
                                                if (jVar != null) {
                                                    jVar.f17659d = jVar4;
                                                } else {
                                                    h(jVarArr, i13, jVar4);
                                                }
                                                obj5 = apply;
                                                i12 = -1;
                                            }
                                        } else if (k6 instanceof o) {
                                            o oVar = (o) k6;
                                            p pVar = oVar.f17674e;
                                            p b10 = pVar == null ? null : pVar.b(i10, obj, null);
                                            Object apply2 = b10 == null ? obj4 : biFunction.apply(b10.f17658c, obj4);
                                            if (apply2 != null) {
                                                if (b10 != null) {
                                                    b10.f17658c = apply2;
                                                } else {
                                                    oVar.e(i10, obj, apply2);
                                                    i12 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (oVar.f(b10)) {
                                                    h(jVarArr, i13, p(oVar.f17675f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 2;
                                            obj5 = apply2;
                                        } else if (k6 instanceof k) {
                                            break;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(jVarArr, i13);
                                }
                                i5 = i12;
                                obj4 = obj5;
                            }
                        }
                    }
                }
            }
            jVarArr = e();
        }
        if (i5 != 0) {
            a(i5, i11);
        }
        return obj4;
    }

    public Enumeration<K> keys() {
        j[] jVarArr = this.f17633a;
        int length = jVarArr == null ? 0 : jVarArr.length;
        return new g(jVarArr, length, length, this, 0);
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    public final j[] e() {
        while (true) {
            j[] jVarArr = this.f17633a;
            if (jVarArr != null && jVarArr.length != 0) {
                return jVarArr;
            }
            int i5 = this.sizeCtl;
            if (i5 < 0) {
                Thread.yield();
            } else if (f17626h.c(this, f17627i, i5, -1)) {
                try {
                    j[] jVarArr2 = this.f17633a;
                    if (jVarArr2 != null) {
                        if (jVarArr2.length == 0) {
                        }
                        this.sizeCtl = i5;
                        return jVarArr2;
                    }
                    int i10 = i5 > 0 ? i5 : 16;
                    j[] jVarArr3 = new j[i10];
                    this.f17633a = jVarArr3;
                    i5 = i10 - (i10 >>> 2);
                    jVarArr2 = jVarArr3;
                    this.sizeCtl = i5;
                    return jVarArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i5;
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0140, code lost:
    
        if (r1.f17635c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0142, code lost:
    
        r1.f17635c = (j$.util.concurrent.b[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.d(r1, r2, r4, r6) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j6, int i5) {
        boolean z5;
        boolean z7;
        int length;
        boolean z10;
        int length2;
        int length3;
        b bVar;
        long j10;
        j[] jVarArr;
        int length4;
        j[] jVarArr2;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        b[] bVarArr = concurrentHashMap.f17635c;
        if (bVarArr == null) {
            j$.sun.misc.a aVar = f17626h;
            long j11 = f17628k;
            long j12 = concurrentHashMap.baseCount;
            j10 = j12 + j6;
        }
        if (bVarArr == null || (length3 = bVarArr.length - 1) < 0 || (bVar = bVarArr[length3 & ((ThreadLocalRandom) ThreadLocalRandom.f17643f.get()).f17646b]) == null) {
            z5 = true;
        } else {
            j$.sun.misc.a aVar2 = f17626h;
            long j13 = f17630m;
            long j14 = bVar.value;
            z5 = aVar2.d(bVar, j13, j14, j14 + j6);
            if (z5) {
                if (i5 <= 1) {
                    return;
                }
                j10 = concurrentHashMap.j();
                if (i5 < 0) {
                    return;
                }
                while (true) {
                    int i10 = concurrentHashMap.sizeCtl;
                    if (j10 < i10 || (jVarArr = concurrentHashMap.f17633a) == null || (length4 = jVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
                    if (i10 < 0) {
                        if ((i10 >>> 16) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == numberOfLeadingZeros + 65535 || (jVarArr2 = concurrentHashMap.f17634b) == null || concurrentHashMap.transferIndex <= 0) {
                            return;
                        }
                        if (f17626h.c(concurrentHashMap, f17627i, i10, i10 + 1)) {
                            concurrentHashMap.m(jVarArr, jVarArr2);
                        }
                    } else if (f17626h.c(concurrentHashMap, f17627i, i10, (numberOfLeadingZeros << 16) + 2)) {
                        concurrentHashMap.m(jVarArr, null);
                    }
                    j10 = concurrentHashMap.j();
                }
            }
        }
        t tVar = ThreadLocalRandom.f17643f;
        int i11 = ((ThreadLocalRandom) tVar.get()).f17646b;
        if (i11 == 0) {
            ThreadLocalRandom.d();
            i11 = ((ThreadLocalRandom) tVar.get()).f17646b;
            z5 = true;
        }
        boolean z11 = z5;
        int i12 = i11;
        while (true) {
            boolean z12 = false;
            while (true) {
                b[] bVarArr2 = concurrentHashMap.f17635c;
                if (bVarArr2 != null && (length = bVarArr2.length) > 0) {
                    b bVar2 = bVarArr2[(length - 1) & i12];
                    if (bVar2 != null) {
                        if (z11) {
                            j$.sun.misc.a aVar3 = f17626h;
                            long j15 = f17630m;
                            long j16 = bVar2.value;
                            if (aVar3.d(bVar2, j15, j16, j16 + j6)) {
                                return;
                            }
                            if (concurrentHashMap.f17635c == bVarArr2 && length < f17625g) {
                                if (!z12) {
                                    z12 = true;
                                } else if (concurrentHashMap.cellsBusy == 0 && aVar3.c(concurrentHashMap, f17629l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z11 = true;
                        }
                        int i13 = (i12 << 13) ^ i12;
                        int i14 = i13 ^ (i13 >>> 17);
                        int i15 = i14 ^ (i14 << 5);
                        ((ThreadLocalRandom) ThreadLocalRandom.f17643f.get()).f17646b = i15;
                        i12 = i15;
                    } else if (concurrentHashMap.cellsBusy == 0) {
                        b bVar3 = new b(j6);
                        if (concurrentHashMap.cellsBusy == 0 && f17626h.c(concurrentHashMap, f17629l, 0, 1)) {
                            try {
                                b[] bVarArr3 = concurrentHashMap.f17635c;
                                if (bVarArr3 != null && (length2 = bVarArr3.length) > 0) {
                                    int i16 = (length2 - 1) & i12;
                                    if (bVarArr3[i16] == null) {
                                        bVarArr3[i16] = bVar3;
                                        z10 = true;
                                        if (!z10) {
                                            return;
                                        }
                                    }
                                }
                                z10 = false;
                                if (!z10) {
                                }
                            } finally {
                            }
                        }
                    }
                    z12 = false;
                    int i132 = (i12 << 13) ^ i12;
                    int i142 = i132 ^ (i132 >>> 17);
                    int i152 = i142 ^ (i142 << 5);
                    ((ThreadLocalRandom) ThreadLocalRandom.f17643f.get()).f17646b = i152;
                    i12 = i152;
                } else if (concurrentHashMap.cellsBusy == 0 && concurrentHashMap.f17635c == bVarArr2 && f17626h.c(concurrentHashMap, f17629l, 0, 1)) {
                    try {
                        if (concurrentHashMap.f17635c == bVarArr2) {
                            b[] bVarArr4 = new b[2];
                            bVarArr4[i12 & 1] = new b(j6);
                            concurrentHashMap.f17635c = bVarArr4;
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.a aVar4 = f17626h;
                    long j17 = f17628k;
                    long j18 = concurrentHashMap.baseCount;
                    if (aVar4.d(concurrentHashMap, j17, j18, j18 + j6)) {
                        return;
                    }
                }
                concurrentHashMap = this;
            }
        }
    }

    public final j[] d(j[] jVarArr, j jVar) {
        int i5;
        if (jVar instanceof f) {
            j[] jVarArr2 = ((f) jVar).f17650e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(jVarArr.length) | 32768;
            while (jVarArr2 == this.f17634b && this.f17633a == jVarArr && (i5 = this.sizeCtl) < 0 && (i5 >>> 16) == numberOfLeadingZeros && i5 != numberOfLeadingZeros + 1 && i5 != 65535 + numberOfLeadingZeros && this.transferIndex > 0) {
                if (f17626h.c(this, f17627i, i5, i5 + 1)) {
                    m(jVarArr, jVarArr2);
                    break;
                }
            }
            return jVarArr2;
        }
        return this.f17633a;
    }

    public final void o(int i5) {
        int length;
        int l6 = i5 >= 536870912 ? 1073741824 : l(i5 + (i5 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 >= 0) {
                j[] jVarArr = this.f17633a;
                if (jVarArr != null && (length = jVarArr.length) != 0) {
                    if (l6 <= i10 || length >= 1073741824) {
                        break;
                    } else if (jVarArr == this.f17633a) {
                        if (f17626h.c(this, f17627i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                            m(jVarArr, null);
                        }
                    }
                } else {
                    int i11 = i10 > l6 ? i10 : l6;
                    if (f17626h.c(this, f17627i, i10, -1)) {
                        try {
                            if (this.f17633a == jVarArr) {
                                this.f17633a = new j[i11];
                                i10 = i11 - (i11 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i10;
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r5v5, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r8v10, types: [j$.util.concurrent.j] */
    /* JADX WARN: Type inference failed for: r8v15, types: [j$.util.concurrent.j] */
    public final void m(j[] jVarArr, j[] jVarArr2) {
        j[] jVarArr3;
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z5;
        char c2;
        int i13;
        int i14;
        j oVar;
        j oVar2;
        p pVar;
        int i15;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = jVarArr.length;
        int i16 = f17625g;
        boolean z7 = true;
        int i17 = i16 > 1 ? (length >>> 3) / i16 : length;
        char c8 = 16;
        int i18 = i17 < 16 ? 16 : i17;
        if (jVarArr2 == null) {
            try {
                j[] jVarArr4 = new j[length << 1];
                concurrentHashMap.f17634b = jVarArr4;
                concurrentHashMap.transferIndex = length;
                jVarArr3 = jVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            jVarArr3 = jVarArr2;
        }
        int length2 = jVarArr3.length;
        f fVar = new f(jVarArr3);
        boolean z10 = true;
        int i19 = 0;
        int i20 = 0;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i21 = i19 - 1;
                if (i21 >= i20 || z11) {
                    i20 = i20;
                    i19 = i21;
                } else {
                    int i22 = concurrentHashMap.transferIndex;
                    if (i22 <= 0) {
                        i19 = -1;
                    } else {
                        j$.sun.misc.a aVar = f17626h;
                        int i23 = i20;
                        long j6 = j;
                        if (i22 > i18) {
                            i10 = i23;
                            i11 = i22 - i18;
                            i5 = i21;
                        } else {
                            i5 = i21;
                            i10 = i23;
                            i11 = 0;
                        }
                        boolean c10 = aVar.c(concurrentHashMap, j6, i22, i11);
                        i20 = i11;
                        if (c10) {
                            i19 = i22 - 1;
                        } else {
                            i20 = i10;
                            i19 = i5;
                        }
                    }
                }
                z10 = false;
            } else {
                int i24 = i20;
                p pVar2 = null;
                if (i19 < 0 || i19 >= length || (i14 = i19 + length) >= length2) {
                    i12 = length;
                    z5 = z7;
                    c2 = c8;
                    i13 = i18;
                    if (z11) {
                        concurrentHashMap.f17634b = null;
                        concurrentHashMap.f17633a = jVarArr3;
                        concurrentHashMap.sizeCtl = (i12 << 1) - (i12 >>> 1);
                        return;
                    }
                    int i25 = i19;
                    j$.sun.misc.a aVar2 = f17626h;
                    long j10 = f17627i;
                    int i26 = concurrentHashMap.sizeCtl;
                    if (!aVar2.c(concurrentHashMap, j10, i26, i26 - 1)) {
                        i19 = i25;
                    } else {
                        if (i26 - 2 != ((Integer.numberOfLeadingZeros(i12) | 32768) << 16)) {
                            return;
                        }
                        z10 = z5;
                        z11 = z10;
                        i19 = i12;
                    }
                } else {
                    ?? k6 = k(jVarArr, i19);
                    if (k6 == 0) {
                        z10 = b(jVarArr, i19, fVar);
                        i12 = length;
                        z5 = z7;
                        c2 = c8;
                        i13 = i18;
                    } else {
                        z5 = z7;
                        int i27 = k6.f17656a;
                        if (i27 == -1) {
                            i12 = length;
                            c2 = c8;
                            i13 = i18;
                            z10 = z5;
                        } else {
                            synchronized (k6) {
                                try {
                                    if (k(jVarArr, i19) == k6) {
                                        if (i27 >= 0) {
                                            int i28 = i27 & length;
                                            p pVar3 = k6;
                                            for (p pVar4 = k6.f17659d; pVar4 != null; pVar4 = pVar4.f17659d) {
                                                char c11 = c8;
                                                int i29 = pVar4.f17656a & length;
                                                if (i29 != i28) {
                                                    pVar3 = pVar4;
                                                    i28 = i29;
                                                }
                                                c8 = c11;
                                            }
                                            c2 = c8;
                                            if (i28 == 0) {
                                                pVar = null;
                                                pVar2 = pVar3;
                                            } else {
                                                pVar = pVar3;
                                            }
                                            j jVar = k6;
                                            while (jVar != pVar3) {
                                                int i30 = jVar.f17656a;
                                                Object obj = jVar.f17657b;
                                                int i31 = length;
                                                Object obj2 = jVar.f17658c;
                                                if ((i30 & i31) == 0) {
                                                    i15 = i18;
                                                    pVar2 = new j(i30, obj, obj2, pVar2);
                                                } else {
                                                    i15 = i18;
                                                    pVar = new j(i30, obj, obj2, pVar);
                                                }
                                                jVar = jVar.f17659d;
                                                length = i31;
                                                i18 = i15;
                                            }
                                            i12 = length;
                                            i13 = i18;
                                            h(jVarArr3, i19, pVar2);
                                            h(jVarArr3, i14, pVar);
                                            h(jVarArr, i19, fVar);
                                        } else {
                                            i12 = length;
                                            c2 = c8;
                                            i13 = i18;
                                            if (k6 instanceof o) {
                                                o oVar3 = (o) k6;
                                                p pVar5 = null;
                                                p pVar6 = null;
                                                j jVar2 = oVar3.f17675f;
                                                int i32 = 0;
                                                int i33 = 0;
                                                p pVar7 = null;
                                                while (jVar2 != null) {
                                                    o oVar4 = oVar3;
                                                    int i34 = jVar2.f17656a;
                                                    p pVar8 = new p(i34, jVar2.f17657b, jVar2.f17658c, null, null);
                                                    if ((i34 & i12) == 0) {
                                                        pVar8.f17680h = pVar6;
                                                        if (pVar6 == null) {
                                                            pVar2 = pVar8;
                                                        } else {
                                                            pVar6.f17659d = pVar8;
                                                        }
                                                        i32++;
                                                        pVar6 = pVar8;
                                                    } else {
                                                        pVar8.f17680h = pVar5;
                                                        if (pVar5 == null) {
                                                            pVar7 = pVar8;
                                                        } else {
                                                            pVar5.f17659d = pVar8;
                                                        }
                                                        i33++;
                                                        pVar5 = pVar8;
                                                    }
                                                    jVar2 = jVar2.f17659d;
                                                    oVar3 = oVar4;
                                                }
                                                o oVar5 = oVar3;
                                                if (i32 <= 6) {
                                                    oVar = p(pVar2);
                                                } else {
                                                    oVar = i33 != 0 ? new o(pVar2) : oVar5;
                                                }
                                                if (i33 <= 6) {
                                                    oVar2 = p(pVar7);
                                                } else {
                                                    oVar2 = i32 != 0 ? new o(pVar7) : oVar5;
                                                }
                                                h(jVarArr3, i19, oVar);
                                                h(jVarArr3, i14, oVar2);
                                                h(jVarArr, i19, fVar);
                                            }
                                        }
                                        z10 = z5;
                                    } else {
                                        i12 = length;
                                        c2 = c8;
                                        i13 = i18;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i20 = i24;
                z7 = z5;
                c8 = c2;
                length = i12;
                i18 = i13;
            }
        }
    }

    public final long j() {
        b[] bVarArr = this.f17635c;
        long j6 = this.baseCount;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    j6 += bVar.value;
                }
            }
        }
        return j6;
    }

    public final void n(j[] jVarArr, int i5) {
        int length = jVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        j k6 = k(jVarArr, i5);
        if (k6 == null || k6.f17656a < 0) {
            return;
        }
        synchronized (k6) {
            try {
                if (k(jVarArr, i5) == k6) {
                    p pVar = null;
                    p pVar2 = null;
                    j jVar = k6;
                    while (jVar != null) {
                        p pVar3 = new p(jVar.f17656a, jVar.f17657b, jVar.f17658c, null, null);
                        pVar3.f17680h = pVar2;
                        if (pVar2 == null) {
                            pVar = pVar3;
                        } else {
                            pVar2.f17659d = pVar3;
                        }
                        jVar = jVar.f17659d;
                        pVar2 = pVar3;
                    }
                    h(jVarArr, i5, new o(pVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.j] */
    public static j p(p pVar) {
        j jVar = null;
        j jVar2 = null;
        for (p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f17659d) {
            j jVar3 = new j(pVar2.f17656a, pVar2.f17657b, pVar2.f17658c);
            if (jVar2 == null) {
                jVar = jVar3;
            } else {
                jVar2.f17659d = jVar3;
            }
            jVar2 = jVar3;
        }
        return jVar;
    }

    public static abstract class CollectionView<K, V, E> implements Collection<E>, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentHashMap f17639a;

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection, java.lang.Iterable
        public abstract Iterator iterator();

        @Override // java.util.Collection
        public abstract boolean remove(Object obj);

        public CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.f17639a = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f17639a.clear();
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f17639a.size();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f17639a.isEmpty();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long j = this.f17639a.j();
            if (j < 0) {
                j = 0;
            }
            if (j > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i5 = (int) j;
            Object[] objArr = new Object[i5];
            Iterator it = iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i10 == i5) {
                    if (i5 >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i11 = i5 < 1073741819 ? (i5 >>> 1) + 1 + i5 : 2147483639;
                    objArr = Arrays.copyOf(objArr, i11);
                    i5 = i11;
                }
                objArr[i10] = next;
                i10++;
            }
            return i10 == i5 ? objArr : Arrays.copyOf(objArr, i10);
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long j = this.f17639a.j();
            if (j < 0) {
                j = 0;
            }
            if (j > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i5 = (int) j;
            Object[] objArr2 = objArr.length >= i5 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
            int length = objArr2.length;
            Iterator it = iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i10 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArr2 = Arrays.copyOf(objArr2, i11);
                    length = i11;
                }
                objArr2[i10] = next;
                i10++;
            }
            if (objArr != objArr2 || i10 >= length) {
                return i10 == length ? objArr2 : Arrays.copyOf(objArr2, i10);
            }
            objArr2[i10] = null;
            return objArr2;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb2.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(", ");
                }
            }
            sb2.append(']');
            return sb2.toString();
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            if (collection == this) {
                return true;
            }
            for (E e7 : collection) {
                if (e7 == null || !contains(e7)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            collection.getClass();
            j[] jVarArr = this.f17639a.f17633a;
            boolean z5 = false;
            if (jVarArr == null) {
                return false;
            }
            if ((collection instanceof Set) && collection.size() > jVarArr.length) {
                Iterator it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z5 = true;
                    }
                }
                return z5;
            }
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                z5 |= remove(it2.next());
            }
            return z5;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            collection.getClass();
            Iterator it = iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z5 = true;
                }
            }
            return z5;
        }
    }

    public static class KeySetView<K, V> extends CollectionView<K, V, K> implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;

        /* renamed from: b, reason: collision with root package name */
        public final Object f17640b;

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        public KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.f17640b = obj;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            return this.f17639a.containsKey(obj);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f17639a.remove(obj) != null;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f17639a;
            j[] jVarArr = concurrentHashMap.f17633a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new g(jVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k6) {
            Object obj = this.f17640b;
            if (obj != null) {
                return this.f17639a.f(k6, obj, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            Object obj = this.f17640b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                if (this.f17639a.f(it.next(), obj, true) == null) {
                    z5 = true;
                }
            }
            return z5;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int i5 = 0;
            while (((a) it).hasNext()) {
                i5 += ((g) it).next().hashCode();
            }
            return i5;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public final j$.util.Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f17639a;
            long j = concurrentHashMap.j();
            j[] jVarArr = concurrentHashMap.f17633a;
            int length = jVarArr == null ? 0 : jVarArr.length;
            return new h(jVarArr, length, 0, length, j < 0 ? 0L : j, 0);
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            j[] jVarArr = this.f17639a.f17633a;
            if (jVarArr == null) {
                return;
            }
            n nVar = new n(jVarArr, jVarArr.length, 0, jVarArr.length);
            while (true) {
                j a7 = nVar.a();
                if (a7 == null) {
                    return;
                } else {
                    consumer.accept(a7.f17657b);
                }
            }
        }
    }
}
