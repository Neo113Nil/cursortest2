package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f22560a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f22561b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f22562c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f22563d;

    public j() {
        int i5;
        int i10 = 4;
        while (true) {
            i5 = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i5 = i11;
                break;
            }
            i10++;
        }
        int i12 = i5 / 8;
        this.f22561b = new long[i12];
        this.f22562c = new Object[i12];
    }

    public final void a(long j, Long l6) {
        int i5 = this.f22563d;
        if (i5 != 0 && j <= this.f22561b[i5 - 1]) {
            h(j, l6);
            return;
        }
        if (this.f22560a) {
            long[] jArr = this.f22561b;
            if (i5 >= jArr.length) {
                Object[] objArr = this.f22562c;
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    Object obj = objArr[i11];
                    if (obj != k.f22564a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f22560a = false;
                this.f22563d = i10;
            }
        }
        int i12 = this.f22563d;
        if (i12 >= this.f22561b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.f22561b, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22561b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22562c, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22562c = copyOf2;
        }
        this.f22561b[i12] = j;
        this.f22562c[i12] = l6;
        this.f22563d = i12 + 1;
    }

    public final void b() {
        int i5 = this.f22563d;
        Object[] objArr = this.f22562c;
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = null;
        }
        this.f22563d = 0;
        this.f22560a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        j jVar = (j) clone;
        jVar.f22561b = (long[]) this.f22561b.clone();
        jVar.f22562c = (Object[]) this.f22562c.clone();
        return jVar;
    }

    public final Object e(long j) {
        Object obj;
        int b10 = t.a.b(this.f22561b, this.f22563d, j);
        if (b10 < 0 || (obj = this.f22562c[b10]) == k.f22564a) {
            return null;
        }
        return obj;
    }

    public final Object f(long j) {
        Object obj;
        int b10 = t.a.b(this.f22561b, this.f22563d, j);
        if (b10 < 0 || (obj = this.f22562c[b10]) == k.f22564a) {
            return -1L;
        }
        return obj;
    }

    public final long g(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f22563d)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f22560a) {
            long[] jArr = this.f22561b;
            Object[] objArr = this.f22562c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != k.f22564a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f22560a = false;
            this.f22563d = i11;
        }
        return this.f22561b[i5];
    }

    public final void h(long j, Object obj) {
        Object obj2 = k.f22564a;
        int b10 = t.a.b(this.f22561b, this.f22563d, j);
        if (b10 >= 0) {
            this.f22562c[b10] = obj;
            return;
        }
        int i5 = ~b10;
        int i10 = this.f22563d;
        if (i5 < i10) {
            Object[] objArr = this.f22562c;
            if (objArr[i5] == obj2) {
                this.f22561b[i5] = j;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f22560a) {
            long[] jArr = this.f22561b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f22562c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f22560a = false;
                this.f22563d = i11;
                i5 = ~t.a.b(this.f22561b, i11, j);
            }
        }
        int i13 = this.f22563d;
        if (i13 >= this.f22561b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f22561b, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22561b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22562c, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22562c = copyOf2;
        }
        int i18 = this.f22563d - i5;
        if (i18 != 0) {
            long[] destination = this.f22561b;
            int i19 = i5 + 1;
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            System.arraycopy(destination, i5, destination, i19, i18);
            Object[] objArr3 = this.f22562c;
            kotlin.collections.o.d(i19, i5, this.f22563d, objArr3, objArr3);
        }
        this.f22561b[i5] = j;
        this.f22562c[i5] = obj;
        this.f22563d++;
    }

    public final int i() {
        if (this.f22560a) {
            int i5 = this.f22563d;
            long[] jArr = this.f22561b;
            Object[] objArr = this.f22562c;
            int i10 = 0;
            for (int i11 = 0; i11 < i5; i11++) {
                Object obj = objArr[i11];
                if (obj != k.f22564a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f22560a = false;
            this.f22563d = i10;
        }
        return this.f22563d;
    }

    public final Object j(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f22563d)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        if (this.f22560a) {
            long[] jArr = this.f22561b;
            Object[] objArr = this.f22562c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != k.f22564a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f22560a = false;
            this.f22563d = i11;
        }
        return this.f22562c[i5];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22563d * 28);
        sb2.append('{');
        int i5 = this.f22563d;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
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
}
