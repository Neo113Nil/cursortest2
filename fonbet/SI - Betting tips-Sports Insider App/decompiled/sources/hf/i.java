package hf;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements Map, Serializable, KMutableMap {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final f f10610n = new f(null);

    /* renamed from: o, reason: collision with root package name */
    public static final i f10611o;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f10612a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f10613b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f10614c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10615d;

    /* renamed from: e, reason: collision with root package name */
    public int f10616e;

    /* renamed from: f, reason: collision with root package name */
    public int f10617f;

    /* renamed from: g, reason: collision with root package name */
    public int f10618g;

    /* renamed from: h, reason: collision with root package name */
    public int f10619h;

    /* renamed from: i, reason: collision with root package name */
    public int f10620i;
    public k j;

    /* renamed from: k, reason: collision with root package name */
    public l f10621k;

    /* renamed from: l, reason: collision with root package name */
    public j f10622l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10623m;

    static {
        i iVar = new i(0);
        iVar.f10623m = true;
        f10611o = iVar;
    }

    public i() {
        this(8);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (this.f10623m) {
            return new p(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int k6 = k(obj);
            int i5 = this.f10616e * 2;
            int length = this.f10615d.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f10615d;
                int i11 = iArr[k6];
                if (i11 <= 0) {
                    int i12 = this.f10617f;
                    Object[] objArr = this.f10612a;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f10617f = i13;
                        objArr[i12] = obj;
                        this.f10614c[i12] = k6;
                        iArr[k6] = i13;
                        this.f10620i++;
                        this.f10619h++;
                        if (i10 > this.f10616e) {
                            this.f10616e = i10;
                        }
                        return i12;
                    }
                    h(1);
                } else {
                    if (Intrinsics.areEqual(this.f10612a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i5) {
                        l(this.f10615d.length * 2);
                        break;
                    }
                    k6 = k6 == 0 ? this.f10615d.length - 1 : k6 - 1;
                }
            }
        }
    }

    public final i c() {
        d();
        this.f10623m = true;
        if (this.f10620i > 0) {
            return this;
        }
        i iVar = f10611o;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return iVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i5 = this.f10617f - 1;
        if (i5 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f10614c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f10615d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i5) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        m4.g.u(0, this.f10617f, this.f10612a);
        Object[] objArr = this.f10613b;
        if (objArr != null) {
            m4.g.u(0, this.f10617f, objArr);
        }
        this.f10620i = 0;
        this.f10617f = 0;
        this.f10619h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.f10623m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z5) {
        int i5;
        Object[] objArr = this.f10613b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.f10617f;
            if (i10 >= i5) {
                break;
            }
            int[] iArr = this.f10614c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f10612a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z5) {
                    iArr[i11] = i12;
                    this.f10615d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        m4.g.u(i11, i5, this.f10612a);
        if (objArr != null) {
            m4.g.u(i11, this.f10617f, objArr);
        }
        this.f10617f = i11;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        j jVar = this.f10622l;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f10622l = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f10620i == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m6) {
        Intrinsics.checkNotNullParameter(m6, "m");
        for (Object obj : m6) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int i5 = i(entry.getKey());
        if (i5 < 0) {
            return false;
        }
        Object[] objArr = this.f10613b;
        Intrinsics.checkNotNull(objArr);
        return Intrinsics.areEqual(objArr[i5], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i5 = i(obj);
        if (i5 < 0) {
            return null;
        }
        Object[] objArr = this.f10613b;
        Intrinsics.checkNotNull(objArr);
        return objArr[i5];
    }

    public final void h(int i5) {
        Object[] objArr;
        Object[] objArr2 = this.f10612a;
        int length = objArr2.length;
        int i10 = this.f10617f;
        int i11 = length - i10;
        int i12 = i10 - this.f10620i;
        if (i11 < i5 && i11 + i12 >= i5 && i12 >= objArr2.length / 4) {
            e(true);
            return;
        }
        int i13 = i10 + i5;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr2.length) {
            kotlin.collections.c cVar = kotlin.collections.f.Companion;
            int length2 = objArr2.length;
            cVar.getClass();
            int e7 = kotlin.collections.c.e(length2, i13);
            Object[] objArr3 = this.f10612a;
            Intrinsics.checkNotNullParameter(objArr3, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr3, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f10612a = copyOf;
            Object[] objArr4 = this.f10613b;
            if (objArr4 != null) {
                Intrinsics.checkNotNullParameter(objArr4, "<this>");
                objArr = Arrays.copyOf(objArr4, e7);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f10613b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f10614c, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f10614c = copyOf2;
            f10610n.getClass();
            int highestOneBit = Integer.highestOneBit((e7 >= 1 ? e7 : 1) * 3);
            if (highestOneBit > this.f10615d.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "map");
        g gVar = new g(this, 0);
        int i5 = 0;
        while (gVar.hasNext()) {
            int i10 = gVar.f1359a;
            i iVar = (i) gVar.f1362d;
            if (i10 >= iVar.f10617f) {
                throw new NoSuchElementException();
            }
            gVar.f1359a = i10 + 1;
            gVar.f1360b = i10;
            Object obj = iVar.f10612a[i10];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = iVar.f10613b;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[gVar.f1360b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            gVar.f();
            i5 += hashCode ^ hashCode2;
        }
        return i5;
    }

    public final int i(Object obj) {
        int k6 = k(obj);
        int i5 = this.f10616e;
        while (true) {
            int i10 = this.f10615d[k6];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (Intrinsics.areEqual(this.f10612a[i11], obj)) {
                    return i11;
                }
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            k6 = k6 == 0 ? this.f10615d.length - 1 : k6 - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f10620i == 0;
    }

    public final int j(Object obj) {
        int i5 = this.f10617f;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.f10614c[i5] >= 0) {
                Object[] objArr = this.f10613b;
                Intrinsics.checkNotNull(objArr);
                if (Intrinsics.areEqual(objArr[i5], obj)) {
                    return i5;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f10618g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        k kVar = this.j;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.j = kVar2;
        return kVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.f10614c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i5) {
        this.f10619h++;
        int i10 = 0;
        if (this.f10617f > this.f10620i) {
            e(false);
        }
        this.f10615d = new int[i5];
        f10610n.getClass();
        this.f10618g = Integer.numberOfLeadingZeros(i5) + 1;
        while (i10 < this.f10617f) {
            int i11 = i10 + 1;
            int k6 = k(this.f10612a[i10]);
            int i12 = this.f10616e;
            while (true) {
                int[] iArr = this.f10615d;
                if (iArr[k6] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k6 = k6 == 0 ? iArr.length - 1 : k6 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0027->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i5) {
        Object[] objArr = this.f10612a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[i5] = null;
        Object[] objArr2 = this.f10613b;
        if (objArr2 != null) {
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            objArr2[i5] = null;
        }
        int i10 = this.f10614c[i5];
        int i11 = this.f10616e * 2;
        int length = this.f10615d.length / 2;
        if (i11 > length) {
            i11 = length;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            i10 = i10 == 0 ? this.f10615d.length - 1 : i10 - 1;
            i13++;
            if (i13 > this.f10616e) {
                this.f10615d[i14] = 0;
                break;
            }
            int[] iArr = this.f10615d;
            int i15 = iArr[i10];
            if (i15 == 0) {
                iArr[i14] = 0;
                break;
            }
            if (i15 < 0) {
                iArr[i14] = -1;
            } else {
                int i16 = i15 - 1;
                int k6 = k(this.f10612a[i16]) - i10;
                int[] iArr2 = this.f10615d;
                if ((k6 & (iArr2.length - 1)) >= i13) {
                    iArr2[i14] = i15;
                    this.f10614c[i16] = i14;
                }
                i12--;
                if (i12 >= 0) {
                    this.f10615d[i14] = -1;
                    break;
                }
            }
            i14 = i10;
            i13 = 0;
            i12--;
            if (i12 >= 0) {
            }
        }
        this.f10614c[i5] = -1;
        this.f10620i--;
        this.f10619h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int a7 = a(obj);
        Object[] objArr = this.f10613b;
        if (objArr == null) {
            int length = this.f10612a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f10613b = objArr;
        }
        if (a7 >= 0) {
            objArr[a7] = obj2;
            return null;
        }
        int i5 = (-a7) - 1;
        Object obj3 = objArr[i5];
        objArr[i5] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        d();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        h(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a7 = a(entry.getKey());
            Object[] objArr = this.f10613b;
            if (objArr == null) {
                int length = this.f10612a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f10613b = objArr;
            }
            if (a7 >= 0) {
                objArr[a7] = entry.getValue();
            } else {
                int i5 = (-a7) - 1;
                if (!Intrinsics.areEqual(entry.getValue(), objArr[i5])) {
                    objArr[i5] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int i5 = i(obj);
        if (i5 < 0) {
            return null;
        }
        Object[] objArr = this.f10613b;
        Intrinsics.checkNotNull(objArr);
        Object obj2 = objArr[i5];
        m(i5);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10620i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f10620i * 3) + 2);
        sb2.append("{");
        Intrinsics.checkNotNullParameter(this, "map");
        int i5 = 0;
        g gVar = new g(this, 0);
        while (gVar.hasNext()) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb2, "sb");
            int i10 = gVar.f1359a;
            i iVar = (i) gVar.f1362d;
            if (i10 >= iVar.f10617f) {
                throw new NoSuchElementException();
            }
            gVar.f1359a = i10 + 1;
            gVar.f1360b = i10;
            Object obj = iVar.f10612a[i10];
            if (obj == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = iVar.f10613b;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[gVar.f1360b];
            if (obj2 == iVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            gVar.f();
            i5++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        l lVar = this.f10621k;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.f10621k = lVar2;
        return lVar2;
    }

    public i(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i5];
        int[] iArr = new int[i5];
        f10610n.getClass();
        int highestOneBit = Integer.highestOneBit((i5 < 1 ? 1 : i5) * 3);
        this.f10612a = objArr;
        this.f10613b = null;
        this.f10614c = iArr;
        this.f10615d = new int[highestOneBit];
        this.f10616e = 2;
        this.f10617f = 0;
        this.f10618g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
