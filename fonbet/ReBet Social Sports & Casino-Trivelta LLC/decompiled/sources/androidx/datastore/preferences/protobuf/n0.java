package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f19542d = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f19543a;

    /* renamed from: b, reason: collision with root package name */
    public int f19544b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19545c;
    private Object[] objects;
    private int[] tags;

    public n0() {
        this(0, new int[8], new Object[8], true);
    }

    public static n0 c() {
        return f19542d;
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

    public static n0 j(n0 n0Var, n0 n0Var2) {
        int i10 = n0Var.f19543a + n0Var2.f19543a;
        int[] copyOf = Arrays.copyOf(n0Var.tags, i10);
        System.arraycopy(n0Var2.tags, 0, copyOf, n0Var.f19543a, n0Var2.f19543a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.objects, i10);
        System.arraycopy(n0Var2.objects, 0, copyOf2, n0Var.f19543a, n0Var2.f19543a);
        return new n0(i10, copyOf, copyOf2, true);
    }

    public static n0 k() {
        return new n0();
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

    public static void q(int i10, Object obj, s0 s0Var) {
        int a10 = r0.a(i10);
        int b10 = r0.b(i10);
        if (b10 == 0) {
            s0Var.writeInt64(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 1) {
            s0Var.writeFixed64(a10, ((Long) obj).longValue());
            return;
        }
        if (b10 == 2) {
            s0Var.b(a10, (AbstractC2132g) obj);
            return;
        }
        if (b10 != 3) {
            if (b10 != 5) {
                throw new RuntimeException(C2150z.e());
            }
            s0Var.writeFixed32(a10, ((Integer) obj).intValue());
        } else if (s0Var.fieldOrder() == s0.a.ASCENDING) {
            s0Var.writeStartGroup(a10);
            ((n0) obj).r(s0Var);
            s0Var.writeEndGroup(a10);
        } else {
            s0Var.writeEndGroup(a10);
            ((n0) obj).r(s0Var);
            s0Var.writeStartGroup(a10);
        }
    }

    public void a() {
        if (!this.f19545c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.tags;
        if (i10 > iArr.length) {
            int i11 = this.f19543a;
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
        int R10;
        int i10 = this.f19544b;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19543a; i12++) {
            int i13 = this.tags[i12];
            int a10 = r0.a(i13);
            int b10 = r0.b(i13);
            if (b10 == 0) {
                R10 = AbstractC2135j.R(a10, ((Long) this.objects[i12]).longValue());
            } else if (b10 == 1) {
                R10 = AbstractC2135j.n(a10, ((Long) this.objects[i12]).longValue());
            } else if (b10 == 2) {
                R10 = AbstractC2135j.f(a10, (AbstractC2132g) this.objects[i12]);
            } else if (b10 == 3) {
                R10 = (AbstractC2135j.O(a10) * 2) + ((n0) this.objects[i12]).d();
            } else {
                if (b10 != 5) {
                    throw new IllegalStateException(C2150z.e());
                }
                R10 = AbstractC2135j.l(a10, ((Integer) this.objects[i12]).intValue());
            }
            i11 += R10;
        }
        this.f19544b = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f19544b;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19543a; i12++) {
            i11 += AbstractC2135j.D(r0.a(this.tags[i12]), (AbstractC2132g) this.objects[i12]);
        }
        this.f19544b = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i10 = this.f19543a;
        return i10 == n0Var.f19543a && o(this.tags, n0Var.tags, i10) && l(this.objects, n0Var.objects, this.f19543a);
    }

    public void h() {
        if (this.f19545c) {
            this.f19545c = false;
        }
    }

    public int hashCode() {
        int i10 = this.f19543a;
        return ((((527 + i10) * 31) + f(this.tags, i10)) * 31) + g(this.objects, this.f19543a);
    }

    public n0 i(n0 n0Var) {
        if (n0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f19543a + n0Var.f19543a;
        b(i10);
        System.arraycopy(n0Var.tags, 0, this.tags, this.f19543a, n0Var.f19543a);
        System.arraycopy(n0Var.objects, 0, this.objects, this.f19543a, n0Var.f19543a);
        this.f19543a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f19543a; i11++) {
            S.d(sb2, i10, String.valueOf(r0.a(this.tags[i11])), this.objects[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f19543a + 1);
        int[] iArr = this.tags;
        int i11 = this.f19543a;
        iArr[i11] = i10;
        this.objects[i11] = obj;
        this.f19543a = i11 + 1;
    }

    public void p(s0 s0Var) {
        if (s0Var.fieldOrder() == s0.a.DESCENDING) {
            for (int i10 = this.f19543a - 1; i10 >= 0; i10--) {
                s0Var.writeMessageSetItem(r0.a(this.tags[i10]), this.objects[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f19543a; i11++) {
            s0Var.writeMessageSetItem(r0.a(this.tags[i11]), this.objects[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f19543a == 0) {
            return;
        }
        if (s0Var.fieldOrder() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f19543a; i10++) {
                q(this.tags[i10], this.objects[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f19543a - 1; i11 >= 0; i11--) {
            q(this.tags[i11], this.objects[i11], s0Var);
        }
    }

    public n0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19544b = -1;
        this.f19543a = i10;
        this.tags = iArr;
        this.objects = objArr;
        this.f19545c = z10;
    }
}
