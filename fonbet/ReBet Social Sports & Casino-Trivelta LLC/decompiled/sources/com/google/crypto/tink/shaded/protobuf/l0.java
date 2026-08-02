package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f37335d = new l0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f37336a;

    /* renamed from: b, reason: collision with root package name */
    public int f37337b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37338c;
    private Object[] objects;
    private int[] tags;

    public l0() {
        this(0, new int[8], new Object[8], true);
    }

    public static l0 c() {
        return f37335d;
    }

    public static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    public static l0 j(l0 l0Var, l0 l0Var2) {
        int i10 = l0Var.f37336a + l0Var2.f37336a;
        int[] copyOf = Arrays.copyOf(l0Var.tags, i10);
        System.arraycopy(l0Var2.tags, 0, copyOf, l0Var.f37336a, l0Var2.f37336a);
        Object[] copyOf2 = Arrays.copyOf(l0Var.objects, i10);
        System.arraycopy(l0Var2.objects, 0, copyOf2, l0Var.f37336a, l0Var2.f37336a);
        return new l0(i10, copyOf, copyOf2, true);
    }

    public static l0 k() {
        return new l0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i10, Object obj, r0 r0Var) {
        int a10 = q0.a(i10);
        int b10 = q0.b(i10);
        if (b10 == 0) {
            r0Var.writeInt64(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 1) {
            r0Var.writeFixed64(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 2) {
            r0Var.d(a10, (AbstractC3476h) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(A.e());
            }
            r0Var.writeFixed32(a10, ((Integer) obj).intValue());
        } else if (r0Var.fieldOrder() == r0.a.ASCENDING) {
            r0Var.writeStartGroup(a10);
            ((l0) obj).r(r0Var);
            r0Var.writeEndGroup(a10);
        } else {
            r0Var.writeEndGroup(a10);
            ((l0) obj).r(r0Var);
            r0Var.writeStartGroup(a10);
        }
    }

    public void a() {
        if (!this.f37338c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.tags;
        if (i10 > iArr.length) {
            int i11 = this.f37336a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i10);
            this.objects = Arrays.copyOf(this.objects, i10);
        }
    }

    public int d() {
        int O10;
        int i10 = this.f37337b;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37336a; i12++) {
            int i13 = this.tags[i12];
            int a10 = q0.a(i13);
            int b10 = q0.b(i13);
            if (b10 == 0) {
                O10 = AbstractC3479k.O(a10, ((Long) this.objects[i12]).longValue());
            } else if (b10 == 1) {
                O10 = AbstractC3479k.n(a10, ((Long) this.objects[i12]).longValue());
            } else if (b10 == 2) {
                O10 = AbstractC3479k.f(a10, (AbstractC3476h) this.objects[i12]);
            } else if (b10 == 3) {
                O10 = (AbstractC3479k.L(a10) * 2) + ((l0) this.objects[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(A.e());
                }
                O10 = AbstractC3479k.l(a10, ((Integer) this.objects[i12]).intValue());
            }
            i11 += O10;
        }
        this.f37337b = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f37337b;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37336a; i12++) {
            i11 += AbstractC3479k.A(q0.a(this.tags[i12]), (AbstractC3476h) this.objects[i12]);
        }
        this.f37337b = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        int i10 = this.f37336a;
        return i10 == l0Var.f37336a && o(this.tags, l0Var.tags, i10) && l(this.objects, l0Var.objects, this.f37336a);
    }

    public void h() {
        this.f37338c = false;
    }

    public int hashCode() {
        int i10 = this.f37336a;
        return ((((527 + i10) * 31) + f(this.tags, i10)) * 31) + g(this.objects, this.f37336a);
    }

    public l0 i(l0 l0Var) {
        if (l0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f37336a + l0Var.f37336a;
        b(i10);
        System.arraycopy(l0Var.tags, 0, this.tags, this.f37336a, l0Var.f37336a);
        System.arraycopy(l0Var.objects, 0, this.objects, this.f37336a, l0Var.f37336a);
        this.f37336a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f37336a; i11++) {
            Q.d(sb2, i10, String.valueOf(q0.a(this.tags[i11])), this.objects[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f37336a + 1);
        int[] iArr = this.tags;
        int i11 = this.f37336a;
        iArr[i11] = i10;
        this.objects[i11] = obj;
        this.f37336a = i11 + 1;
    }

    public void p(r0 r0Var) {
        if (r0Var.fieldOrder() == r0.a.DESCENDING) {
            for (int i10 = this.f37336a - 1; i10 >= 0; i10--) {
                r0Var.writeMessageSetItem(q0.a(this.tags[i10]), this.objects[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f37336a; i11++) {
            r0Var.writeMessageSetItem(q0.a(this.tags[i11]), this.objects[i11]);
        }
    }

    public void r(r0 r0Var) {
        if (this.f37336a == 0) {
            return;
        }
        if (r0Var.fieldOrder() == r0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f37336a; i10++) {
                q(this.tags[i10], this.objects[i10], r0Var);
            }
            return;
        }
        for (int i11 = this.f37336a - 1; i11 >= 0; i11--) {
            q(this.tags[i11], this.objects[i11], r0Var);
        }
    }

    public l0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f37337b = -1;
        this.f37336a = i10;
        this.tags = iArr;
        this.objects = objArr;
        this.f37338c = z10;
    }
}
