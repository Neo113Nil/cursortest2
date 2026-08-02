package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f22576a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f22577b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f22578c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f22579d;

    public o(int i5) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f22577b = new int[i13];
        this.f22578c = new Object[i13];
    }

    public final void a(int i5, Object obj) {
        int i10 = this.f22579d;
        if (i10 != 0 && i5 <= this.f22577b[i10 - 1]) {
            f(i5, obj);
            return;
        }
        if (this.f22576a && i10 >= this.f22577b.length) {
            k.a(this);
        }
        int i11 = this.f22579d;
        if (i11 >= this.f22577b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f22577b, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22577b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22578c, i15);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22578c = copyOf2;
        }
        this.f22577b[i11] = i5;
        this.f22578c[i11] = obj;
        this.f22579d = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        o oVar = (o) clone;
        oVar.f22577b = (int[]) this.f22577b.clone();
        oVar.f22578c = (Object[]) this.f22578c.clone();
        return oVar;
    }

    public final Object d(int i5) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int a7 = t.a.a(this.f22579d, i5, this.f22577b);
        if (a7 < 0 || (obj = this.f22578c[a7]) == k.f22566c) {
            return null;
        }
        return obj;
    }

    public final int e(int i5) {
        if (this.f22576a) {
            k.a(this);
        }
        return this.f22577b[i5];
    }

    public final void f(int i5, Object obj) {
        int a7 = t.a.a(this.f22579d, i5, this.f22577b);
        if (a7 >= 0) {
            this.f22578c[a7] = obj;
            return;
        }
        int i10 = ~a7;
        int i11 = this.f22579d;
        if (i10 < i11) {
            Object[] objArr = this.f22578c;
            if (objArr[i10] == k.f22566c) {
                this.f22577b[i10] = i5;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f22576a && i11 >= this.f22577b.length) {
            k.a(this);
            i10 = ~t.a.a(this.f22579d, i5, this.f22577b);
        }
        int i12 = this.f22579d;
        if (i12 >= this.f22577b.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f22577b, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22577b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22578c, i16);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f22578c = copyOf2;
        }
        int i17 = this.f22579d;
        if (i17 - i10 != 0) {
            int[] iArr = this.f22577b;
            int i18 = i10 + 1;
            kotlin.collections.o.e(i18, i10, iArr, iArr, i17);
            Object[] objArr2 = this.f22578c;
            kotlin.collections.o.d(i18, i10, this.f22579d, objArr2, objArr2);
        }
        this.f22577b[i10] = i5;
        this.f22578c[i10] = obj;
        this.f22579d++;
    }

    public final int g() {
        if (this.f22576a) {
            k.a(this);
        }
        return this.f22579d;
    }

    public final Object h(int i5) {
        if (this.f22576a) {
            k.a(this);
        }
        Object[] objArr = this.f22578c;
        if (i5 < objArr.length) {
            return objArr[i5];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22579d * 28);
        sb2.append('{');
        int i5 = this.f22579d;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
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
