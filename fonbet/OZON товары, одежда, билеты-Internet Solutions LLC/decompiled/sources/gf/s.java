package gf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private int f64460a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f64461b = new int[10];

    public final int a(int i11) {
        return this.f64461b[i11];
    }

    public final int b() {
        if ((this.f64460a & 2) != 0) {
            return this.f64461b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f64460a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.f64461b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f64460a & 16) != 0) {
            return this.f64461b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i11) {
        return (this.f64460a & 32) != 0 ? this.f64461b[5] : i11;
    }

    public final boolean f(int i11) {
        return ((1 << i11) & this.f64460a) != 0;
    }

    public final void g(@NotNull s other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 = 0; i11 < 10; i11++) {
            if (other.f(i11)) {
                h(i11, other.f64461b[i11]);
            }
        }
    }

    @NotNull
    public final void h(int i11, int i12) {
        if (i11 >= 0) {
            int[] iArr = this.f64461b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f64460a = (1 << i11) | this.f64460a;
            iArr[i11] = i12;
        }
    }

    public final int i() {
        return Integer.bitCount(this.f64460a);
    }
}
