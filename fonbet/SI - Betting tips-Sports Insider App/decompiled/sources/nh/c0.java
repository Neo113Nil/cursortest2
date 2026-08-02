package nh;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f20926a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20927b = new int[10];

    public final int a() {
        if ((this.f20926a & 16) != 0) {
            return this.f20927b[4];
        }
        return 65535;
    }

    public final void b(c0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 = 0; i5 < 10; i5++) {
            if (((1 << i5) & other.f20926a) != 0) {
                c(i5, other.f20927b[i5]);
            }
        }
    }

    public final void c(int i5, int i10) {
        if (i5 >= 0) {
            int[] iArr = this.f20927b;
            if (i5 >= iArr.length) {
                return;
            }
            this.f20926a = (1 << i5) | this.f20926a;
            iArr[i5] = i10;
        }
    }
}
