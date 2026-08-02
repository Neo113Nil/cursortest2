package s;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22573a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f22574b;

    /* renamed from: c, reason: collision with root package name */
    public int f22575c;

    public n(int i5) {
        this.f22573a = i5 == 0 ? t.a.f23723a : new int[i5];
        this.f22574b = i5 == 0 ? t.a.f23724b : new Object[i5 << 1];
    }

    public final int a(Object obj) {
        int i5 = this.f22575c * 2;
        Object[] objArr = this.f22574b;
        if (obj == null) {
            for (int i10 = 1; i10 < i5; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i5; i11 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i5) {
        int i10 = this.f22575c;
        int[] iArr = this.f22573a;
        if (iArr.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22573a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22574b, i5 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22574b = copyOf2;
        }
        if (this.f22575c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.f22575c > 0) {
            this.f22573a = t.a.f23723a;
            this.f22574b = t.a.f23724b;
            this.f22575c = 0;
        }
        if (this.f22575c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(int i5, Object obj) {
        int i10 = this.f22575c;
        if (i10 == 0) {
            return -1;
        }
        int a7 = t.a.a(i10, i5, this.f22573a);
        if (a7 < 0 || Intrinsics.areEqual(obj, this.f22574b[a7 << 1])) {
            return a7;
        }
        int i11 = a7 + 1;
        while (i11 < i10 && this.f22573a[i11] == i5) {
            if (Intrinsics.areEqual(obj, this.f22574b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a7 - 1; i12 >= 0 && this.f22573a[i12] == i5; i12--) {
            if (Intrinsics.areEqual(obj, this.f22574b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof n) {
                int i5 = this.f22575c;
                if (i5 != ((n) obj).f22575c) {
                    return false;
                }
                n nVar = (n) obj;
                for (int i10 = 0; i10 < i5; i10++) {
                    Object g10 = g(i10);
                    Object j = j(i10);
                    Object obj2 = nVar.get(g10);
                    if (j == null) {
                        if (obj2 != null || !nVar.containsKey(g10)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(j, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f22575c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f22575c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object g11 = g(i12);
                Object j6 = j(i12);
                Object obj3 = ((Map) obj).get(g11);
                if (j6 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g11)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(j6, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i5 = this.f22575c;
        if (i5 == 0) {
            return -1;
        }
        int a7 = t.a.a(i5, 0, this.f22573a);
        if (a7 < 0 || this.f22574b[a7 << 1] == null) {
            return a7;
        }
        int i10 = a7 + 1;
        while (i10 < i5 && this.f22573a[i10] == 0) {
            if (this.f22574b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a7 - 1; i11 >= 0 && this.f22573a[i11] == 0; i11--) {
            if (this.f22574b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object g(int i5) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f22575c) {
            z5 = true;
        }
        if (z5) {
            return this.f22574b[i5 << 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    public Object get(Object obj) {
        int e7 = e(obj);
        if (e7 >= 0) {
            return this.f22574b[(e7 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e7 = e(obj);
        return e7 >= 0 ? this.f22574b[(e7 << 1) + 1] : obj2;
    }

    public final Object h(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f22575c)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        Object[] objArr = this.f22574b;
        int i11 = i5 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f22573a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i5 < i12) {
                int i13 = i5 + 1;
                kotlin.collections.o.e(i5, i13, iArr, iArr, i10);
                Object[] objArr2 = this.f22574b;
                kotlin.collections.o.d(i11, i13 << 1, i10 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f22574b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22573a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22574b, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22574b = copyOf2;
            if (i10 != this.f22575c) {
                throw new ConcurrentModificationException();
            }
            if (i5 > 0) {
                kotlin.collections.o.e(0, 0, iArr, this.f22573a, i5);
                kotlin.collections.o.d(0, 0, i11, objArr, this.f22574b);
            }
            if (i5 < i12) {
                int i16 = i5 + 1;
                kotlin.collections.o.e(i5, i16, iArr, this.f22573a, i10);
                kotlin.collections.o.d(i11, i16 << 1, i10 << 1, objArr, this.f22574b);
            }
        }
        if (i10 != this.f22575c) {
            throw new ConcurrentModificationException();
        }
        this.f22575c = i12;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f22573a;
        Object[] objArr = this.f22574b;
        int i5 = this.f22575c;
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            Object obj = objArr[i10];
            i12 += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return i12;
    }

    public final Object i(int i5, Object obj) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f22575c) {
            z5 = true;
        }
        if (!z5) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        int i10 = (i5 << 1) + 1;
        Object[] objArr = this.f22574b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f22575c <= 0;
    }

    public final Object j(int i5) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f22575c) {
            z5 = true;
        }
        if (z5) {
            return this.f22574b[(i5 << 1) + 1];
        }
        t.a.c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    public final Object put(Object obj, Object obj2) {
        int i5 = this.f22575c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d10 = obj != null ? d(hashCode, obj) : f();
        if (d10 >= 0) {
            int i10 = (d10 << 1) + 1;
            Object[] objArr = this.f22574b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~d10;
        int[] iArr = this.f22573a;
        if (i5 >= iArr.length) {
            int i12 = 8;
            if (i5 >= 8) {
                i12 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i12 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i12);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22573a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22574b, i12 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22574b = copyOf2;
            if (i5 != this.f22575c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i5) {
            int[] iArr2 = this.f22573a;
            int i13 = i11 + 1;
            kotlin.collections.o.e(i13, i11, iArr2, iArr2, i5);
            Object[] objArr2 = this.f22574b;
            kotlin.collections.o.d(i13 << 1, i11 << 1, this.f22575c << 1, objArr2, objArr2);
        }
        int i14 = this.f22575c;
        if (i5 == i14) {
            int[] iArr3 = this.f22573a;
            if (i11 < iArr3.length) {
                iArr3[i11] = hashCode;
                Object[] objArr3 = this.f22574b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f22575c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e7 = e(obj);
        if (e7 >= 0) {
            return h(e7);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e7 = e(obj);
        if (e7 >= 0) {
            return i(e7, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f22575c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22575c * 28);
        sb2.append('{');
        int i5 = this.f22575c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object g10 = g(i10);
            if (g10 != sb2) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j = j(i10);
            if (j != sb2) {
                sb2.append(j);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e7 = e(obj);
        if (e7 < 0 || !Intrinsics.areEqual(obj2, j(e7))) {
            return false;
        }
        h(e7);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e7 = e(obj);
        if (e7 < 0 || !Intrinsics.areEqual(obj2, j(e7))) {
            return false;
        }
        i(e7, obj3);
        return true;
    }
}
