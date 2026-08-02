package z;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f68468a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f68469b;

    @JvmField
    public /* synthetic */ int[] keys;

    @JvmField
    public /* synthetic */ Object[] values;

    public s() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f68469b;
        if (i11 != 0 && i10 <= this.keys[i11 - 1]) {
            i(i10, obj);
            return;
        }
        if (this.f68468a && i11 >= this.keys.length) {
            t.e(this);
        }
        int i12 = this.f68469b;
        if (i12 >= this.keys.length) {
            int e10 = A.a.e(i12 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i12] = i10;
        this.values[i12] = obj;
        this.f68469b = i12 + 1;
    }

    public void b() {
        int i10 = this.f68469b;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f68469b = 0;
        this.f68468a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        s sVar = (s) clone;
        sVar.keys = (int[]) this.keys.clone();
        sVar.values = (Object[]) this.values.clone();
        return sVar;
    }

    public boolean d(int i10) {
        return f(i10) >= 0;
    }

    public Object e(int i10) {
        return t.c(this, i10);
    }

    public int f(int i10) {
        if (this.f68468a) {
            t.e(this);
        }
        return A.a.a(this.keys, this.f68469b, i10);
    }

    public int g(Object obj) {
        if (this.f68468a) {
            t.e(this);
        }
        int i10 = this.f68469b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int h(int i10) {
        if (this.f68468a) {
            t.e(this);
        }
        return this.keys[i10];
    }

    public void i(int i10, Object obj) {
        Object obj2;
        int a10 = A.a.a(this.keys, this.f68469b, i10);
        if (a10 >= 0) {
            this.values[a10] = obj;
            return;
        }
        int i11 = ~a10;
        if (i11 < this.f68469b) {
            Object obj3 = this.values[i11];
            obj2 = t.f68470a;
            if (obj3 == obj2) {
                this.keys[i11] = i10;
                this.values[i11] = obj;
                return;
            }
        }
        if (this.f68468a && this.f68469b >= this.keys.length) {
            t.e(this);
            i11 = ~A.a.a(this.keys, this.f68469b, i10);
        }
        int i12 = this.f68469b;
        if (i12 >= this.keys.length) {
            int e10 = A.a.e(i12 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, e10);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i13 = this.f68469b;
        if (i13 - i11 != 0) {
            int[] iArr = this.keys;
            int i14 = i11 + 1;
            ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i14, i11, this.f68469b);
        }
        this.keys[i11] = i10;
        this.values[i11] = obj;
        this.f68469b++;
    }

    public void j(int i10) {
        t.d(this, i10);
    }

    public int k() {
        if (this.f68468a) {
            t.e(this);
        }
        return this.f68469b;
    }

    public Object l(int i10) {
        if (this.f68468a) {
            t.e(this);
        }
        return this.values[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f68469b * 28);
        sb2.append('{');
        int i10 = this.f68469b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            Object l10 = l(i11);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public s(int i10) {
        if (i10 == 0) {
            this.keys = A.a.EMPTY_INTS;
            this.values = A.a.EMPTY_OBJECTS;
        } else {
            int e10 = A.a.e(i10);
            this.keys = new int[e10];
            this.values = new Object[e10];
        }
    }

    public /* synthetic */ s(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
