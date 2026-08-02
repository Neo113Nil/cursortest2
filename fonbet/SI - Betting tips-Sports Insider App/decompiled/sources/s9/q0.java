package s9;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f23367e = new q0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f23368a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f23369b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f23370c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23371d;

    public q0(int i5, int[] iArr, Object[] objArr, boolean z5) {
        this.f23368a = i5;
        this.f23369b = iArr;
        this.f23370c = objArr;
        this.f23371d = z5;
    }

    public final void a(int i5) {
        int[] iArr = this.f23369b;
        if (i5 > iArr.length) {
            int i10 = this.f23368a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.f23369b = Arrays.copyOf(iArr, i5);
            this.f23370c = Arrays.copyOf(this.f23370c, i5);
        }
    }

    public final void b(int i5, Object obj) {
        if (!this.f23371d) {
            throw new UnsupportedOperationException();
        }
        a(this.f23368a + 1);
        int[] iArr = this.f23369b;
        int i10 = this.f23368a;
        iArr[i10] = i5;
        this.f23370c[i10] = obj;
        this.f23368a = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        int i5 = this.f23368a;
        if (i5 == q0Var.f23368a) {
            int[] iArr = this.f23369b;
            int[] iArr2 = q0Var.f23369b;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.f23370c;
                    Object[] objArr2 = q0Var.f23370c;
                    int i11 = this.f23368a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f23368a;
        int i10 = (527 + i5) * 31;
        int[] iArr = this.f23369b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i5; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f23370c;
        int i15 = this.f23368a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
