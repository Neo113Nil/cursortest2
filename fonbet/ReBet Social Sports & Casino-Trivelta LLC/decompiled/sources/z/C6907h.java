package z;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6907h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f68455a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f68456b;

    @JvmField
    public /* synthetic */ long[] keys;

    @JvmField
    public /* synthetic */ Object[] values;

    public C6907h() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.f68456b;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f68456b = 0;
        this.f68455a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6907h clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C6907h c6907h = (C6907h) clone;
        c6907h.keys = (long[]) this.keys.clone();
        c6907h.values = (Object[]) this.values.clone();
        return c6907h;
    }

    public boolean c(long j10) {
        return e(j10) >= 0;
    }

    public Object d(long j10) {
        Object obj;
        int b10 = A.a.b(this.keys, this.f68456b, j10);
        if (b10 < 0) {
            return null;
        }
        Object obj2 = this.values[b10];
        obj = i.f68457a;
        if (obj2 == obj) {
            return null;
        }
        return this.values[b10];
    }

    public int e(long j10) {
        Object obj;
        if (this.f68455a) {
            int i10 = this.f68456b;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj2 = objArr[i12];
                obj = i.f68457a;
                if (obj2 != obj) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj2;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f68455a = false;
            this.f68456b = i11;
        }
        return A.a.b(this.keys, this.f68456b, j10);
    }

    public long f(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f68456b)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f68455a) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = i.f68457a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f68455a = false;
            this.f68456b = i12;
        }
        return this.keys[i10];
    }

    public void g(long j10, Object obj) {
        Object obj2;
        Object obj3;
        int b10 = A.a.b(this.keys, this.f68456b, j10);
        if (b10 >= 0) {
            this.values[b10] = obj;
            return;
        }
        int i10 = ~b10;
        if (i10 < this.f68456b) {
            Object obj4 = this.values[i10];
            obj3 = i.f68457a;
            if (obj4 == obj3) {
                this.keys[i10] = j10;
                this.values[i10] = obj;
                return;
            }
        }
        if (this.f68455a) {
            int i11 = this.f68456b;
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj5 = objArr[i13];
                    obj2 = i.f68457a;
                    if (obj5 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj5;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f68455a = false;
                this.f68456b = i12;
                i10 = ~A.a.b(this.keys, i12, j10);
            }
        }
        int i14 = this.f68456b;
        if (i14 >= this.keys.length) {
            int f10 = A.a.f(i14 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, f10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, f10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i15 = this.f68456b;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            ArraysKt.copyInto(objArr2, objArr2, i16, i10, this.f68456b);
        }
        this.keys[i10] = j10;
        this.values[i10] = obj;
        this.f68456b++;
    }

    public void h(long j10) {
        Object obj;
        Object obj2;
        int b10 = A.a.b(this.keys, this.f68456b, j10);
        if (b10 >= 0) {
            Object obj3 = this.values[b10];
            obj = i.f68457a;
            if (obj3 != obj) {
                Object[] objArr = this.values;
                obj2 = i.f68457a;
                objArr[b10] = obj2;
                this.f68455a = true;
            }
        }
    }

    public void i(int i10) {
        Object obj;
        Object obj2;
        Object obj3 = this.values[i10];
        obj = i.f68457a;
        if (obj3 != obj) {
            Object[] objArr = this.values;
            obj2 = i.f68457a;
            objArr[i10] = obj2;
            this.f68455a = true;
        }
    }

    public int j() {
        Object obj;
        if (this.f68455a) {
            int i10 = this.f68456b;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj2 = objArr[i12];
                obj = i.f68457a;
                if (obj2 != obj) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj2;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f68455a = false;
            this.f68456b = i11;
        }
        return this.f68456b;
    }

    public Object k(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f68456b)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f68455a) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                obj = i.f68457a;
                if (obj2 != obj) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f68455a = false;
            this.f68456b = i12;
        }
        return this.values[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f68456b * 28);
        sb2.append('{');
        int i10 = this.f68456b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i11));
            sb2.append('=');
            Object k10 = k(i11);
            if (k10 != sb2) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public C6907h(int i10) {
        if (i10 == 0) {
            this.keys = A.a.EMPTY_LONGS;
            this.values = A.a.EMPTY_OBJECTS;
        } else {
            int f10 = A.a.f(i10);
            this.keys = new long[f10];
            this.values = new Object[f10];
        }
    }

    public /* synthetic */ C6907h(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
