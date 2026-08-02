package z;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public int f68467a;

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;

    public r() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i10 = this.f68467a * 2;
        Object[] objArr = this.array;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f68467a;
        int[] iArr = this.hashes;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i10 * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.f68467a != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(Object obj, int i10) {
        int i11 = this.f68467a;
        if (i11 == 0) {
            return -1;
        }
        int a10 = A.a.a(this.hashes, i11, i10);
        if (a10 < 0 || Intrinsics.areEqual(obj, this.array[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.hashes[i12] == i10) {
            if (Intrinsics.areEqual(obj, this.array[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.hashes[i13] == i10; i13--) {
            if (Intrinsics.areEqual(obj, this.array[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f68467a > 0) {
            this.hashes = A.a.EMPTY_INTS;
            this.array = A.a.EMPTY_OBJECTS;
            this.f68467a = 0;
        }
        if (this.f68467a > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i10 = this.f68467a;
        if (i10 == 0) {
            return -1;
        }
        int a10 = A.a.a(this.hashes, i10, 0);
        if (a10 < 0 || this.array[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.array[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof r) {
                if (size() != ((r) obj).size()) {
                    return false;
                }
                r rVar = (r) obj;
                int i10 = this.f68467a;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object f10 = f(i11);
                    Object j10 = j(i11);
                    Object obj2 = rVar.get(f10);
                    if (j10 == null) {
                        if (obj2 != null || !rVar.containsKey(f10)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(j10, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f68467a;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f11 = f(i13);
                Object j11 = j(i13);
                Object obj3 = ((Map) obj).get(f11);
                if (j11 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f11)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(j11, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i10) {
        if (i10 >= 0 && i10 < this.f68467a) {
            return this.array[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public void g(r map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.f68467a;
        b(this.f68467a + i10);
        if (this.f68467a != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.f(i11), map.j(i11));
            }
        } else if (i10 > 0) {
            ArraysKt.copyInto(map.hashes, this.hashes, 0, 0, i10);
            ArraysKt.copyInto(map.array, this.array, 0, 0, i10 << 1);
            this.f68467a = i10;
        }
    }

    public Object get(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.array[(d10 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int d10 = d(obj);
        return d10 >= 0 ? this.array[(d10 << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f68467a)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.array;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                ArraysKt.copyInto(iArr, iArr, i10, i14, i11);
                Object[] objArr2 = this.array;
                ArraysKt.copyInto(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.array;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i16 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i11 != this.f68467a) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                ArraysKt.copyInto(iArr, this.hashes, 0, 0, i10);
                ArraysKt.copyInto(objArr, this.array, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                ArraysKt.copyInto(iArr, this.hashes, i10, i17, i11);
                ArraysKt.copyInto(objArr, this.array, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f68467a) {
            throw new ConcurrentModificationException();
        }
        this.f68467a = i13;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i10 = this.f68467a;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public Object i(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f68467a) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.array;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f68467a <= 0;
    }

    public Object j(int i10) {
        if (i10 >= 0 && i10 < this.f68467a) {
            return this.array[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f68467a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c10 = obj != null ? c(obj, hashCode) : e();
        if (c10 >= 0) {
            int i11 = (c10 << 1) + 1;
            Object[] objArr = this.array;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~c10;
        int[] iArr = this.hashes;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i10 != this.f68467a) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.array;
            ArraysKt.copyInto(objArr2, objArr2, i14 << 1, i12 << 1, this.f68467a << 1);
        }
        int i15 = this.f68467a;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = hashCode;
                Object[] objArr3 = this.array;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f68467a = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return h(d10);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return i(d10, obj2);
        }
        return null;
    }

    public int size() {
        return this.f68467a;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f68467a * 28);
        sb2.append('{');
        int i10 = this.f68467a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object f10 = f(i11);
            if (f10 != sb2) {
                sb2.append(f10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object j10 = j(i11);
            if (j10 != sb2) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public r(int i10) {
        this.hashes = i10 == 0 ? A.a.EMPTY_INTS : new int[i10];
        this.array = i10 == 0 ? A.a.EMPTY_OBJECTS : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.areEqual(obj2, j(d10))) {
            return false;
        }
        h(d10);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int d10 = d(obj);
        if (d10 < 0 || !Intrinsics.areEqual(obj2, j(d10))) {
            return false;
        }
        i(d10, obj3);
        return true;
    }

    public /* synthetic */ r(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public r(r rVar) {
        this(0, 1, null);
        if (rVar != null) {
            g(rVar);
        }
    }
}
