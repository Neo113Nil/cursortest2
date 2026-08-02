package defpackage;

import com.ironsource.C4427z5;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ltb implements Map, Serializable, iia {

    @NotNull
    public static final htb n = new htb(null);
    public static final ltb o;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ntb j;
    public otb k;
    public mtb l;
    public boolean m;

    static {
        ltb ltbVar = new ltb(0);
        ltbVar.m = true;
        o = ltbVar;
    }

    public ltb(int i) {
        if (i < 0) {
            a70.p("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        n.getClass();
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[highestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        if (!this.m) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        a6h a6hVar = new a6h();
        a6hVar.a = this;
        return a6hVar;
    }

    public final int a(Object obj) {
        g();
        while (true) {
            int m = m(obj);
            int i = this.e * 2;
            int length = this.d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[m];
                if (i3 == 0) {
                    int i4 = this.f;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f = i5;
                        objArr[i4] = obj;
                        this.c[i4] = m;
                        iArr[m] = i5;
                        this.i++;
                        this.h++;
                        if (i2 > this.e) {
                            this.e = i2;
                        }
                        return i4;
                    }
                    j(1);
                } else {
                    if (Intrinsics.c(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        n(this.d.length * 2);
                        break;
                    }
                    m = m == 0 ? this.d.length - 1 : m - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        g();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        mha.z(0, this.f, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            mha.z(0, this.f, objArr);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return k(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public final ltb d() {
        g();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        ltb ltbVar = o;
        ltbVar.getClass();
        return ltbVar;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        mtb mtbVar = this.l;
        if (mtbVar != null) {
            return mtbVar;
        }
        mtb mtbVar2 = new mtb(this);
        this.l = mtbVar2;
        return mtbVar2;
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
        return this.i == map.size() && i(map.entrySet());
    }

    public final void g() {
        if (this.m) {
            a70.i();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int k = k(obj);
        if (k < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[k];
    }

    public final void h(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        mha.z(i3, i, this.a);
        if (objArr != null) {
            mha.z(i3, this.f, objArr);
        }
        this.f = i3;
    }

    @Override // java.util.Map
    public final int hashCode() {
        itb itbVar = new itb(this, 0);
        int i = 0;
        while (itbVar.hasNext()) {
            int i2 = itbVar.a;
            ltb ltbVar = (ltb) itbVar.d;
            if (i2 >= ltbVar.f) {
                yhk.d();
                return 0;
            }
            itbVar.a = i2 + 1;
            itbVar.b = i2;
            Object obj = ltbVar.a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ltbVar.b;
            objArr.getClass();
            Object obj2 = objArr[itbVar.b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            itbVar.f();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final boolean i(Collection collection) {
        boolean c;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int k = k(entry.getKey());
                    if (k < 0) {
                        c = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        c = Intrinsics.c(objArr[k], entry.getValue());
                    }
                    if (!c) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final void j(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            h(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            q4 q4Var = u4.Companion;
            int length2 = objArr.length;
            q4Var.getClass();
            int e = q4.e(length2, i5);
            Object[] objArr2 = this.a;
            objArr2.getClass();
            this.a = Arrays.copyOf(objArr2, e);
            Object[] objArr3 = this.b;
            this.b = objArr3 != null ? Arrays.copyOf(objArr3, e) : null;
            this.c = Arrays.copyOf(this.c, e);
            n.getClass();
            int highestOneBit = Integer.highestOneBit((e >= 1 ? e : 1) * 3);
            if (highestOneBit > this.d.length) {
                n(highestOneBit);
            }
        }
    }

    public final int k(Object obj) {
        int m = m(obj);
        int i = this.e;
        while (true) {
            int i2 = this.d[m];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (Intrinsics.c(this.a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            m = m == 0 ? this.d.length - 1 : m - 1;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        ntb ntbVar = this.j;
        if (ntbVar != null) {
            return ntbVar;
        }
        ntb ntbVar2 = new ntb(this, 0);
        this.j = ntbVar2;
        return ntbVar2;
    }

    public final int l(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (Intrinsics.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i) {
        this.h++;
        int i2 = 0;
        if (this.f > this.i) {
            h(false);
        }
        this.d = new int[i];
        n.getClass();
        this.g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f) {
            int i3 = i2 + 1;
            int m = m(this.a[i2]);
            int i4 = this.e;
            while (true) {
                int[] iArr = this.d;
                if (iArr[m] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    a70.r("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                m = m == 0 ? iArr.length - 1 : m - 1;
            }
        }
    }

    public final void o(int i) {
        int i2;
        int i3;
        int m;
        int[] iArr;
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i4 = this.c[i];
        loop0: while (true) {
            int i5 = i4;
            int i6 = 0;
            do {
                i4 = i4 == 0 ? this.d.length - 1 : i4 - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[i4];
                i6++;
                if (i6 > this.e) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    m = m(this.a[i3]) - i4;
                    iArr = this.d;
                }
            } while ((m & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.c[i3] = i5;
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        int a = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                a70.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        g();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        j(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    a70.p("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!Intrinsics.c(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        g();
        int k = k(obj);
        if (k < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[k];
        o(k);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        itb itbVar = new itb(this, 0);
        while (itbVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = itbVar.a;
            ltb ltbVar = (ltb) itbVar.d;
            if (i2 >= ltbVar.f) {
                yhk.d();
                return null;
            }
            itbVar.a = i2 + 1;
            itbVar.b = i2;
            Object obj = ltbVar.a[i2];
            if (obj == ltbVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(C4427z5.U);
            Object[] objArr = ltbVar.b;
            objArr.getClass();
            Object obj2 = objArr[itbVar.b];
            if (obj2 == ltbVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            itbVar.f();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        otb otbVar = this.k;
        if (otbVar != null) {
            return otbVar;
        }
        otb otbVar2 = new otb(this, 0);
        this.k = otbVar2;
        return otbVar2;
    }

    public ltb() {
        this(8);
    }
}
