package y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10821b {

    /* renamed from: a, reason: collision with root package name */
    private int f105900a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private long[] f105901b = new long[2];

    public final void a(long j11) {
        if (c(j11)) {
            return;
        }
        int i11 = this.f105900a;
        long[] jArr = this.f105901b;
        if (i11 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i11 + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f105901b = copyOf;
        }
        this.f105901b[i11] = j11;
        if (i11 >= this.f105900a) {
            this.f105900a = i11 + 1;
        }
    }

    public final void b() {
        this.f105900a = 0;
    }

    public final boolean c(long j11) {
        int i11 = this.f105900a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f105901b[i12] == j11) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i11) {
        return this.f105901b[i11];
    }

    public final int e() {
        return this.f105900a;
    }

    public final boolean f() {
        return this.f105900a == 0;
    }

    public final boolean g(long j11) {
        int i11 = this.f105900a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (j11 == this.f105901b[i12]) {
                h(i12);
                return true;
            }
        }
        return false;
    }

    public final void h(int i11) {
        int i12 = this.f105900a;
        if (i11 < i12) {
            int i13 = i12 - 1;
            while (i11 < i13) {
                long[] jArr = this.f105901b;
                int i14 = i11 + 1;
                jArr[i11] = jArr[i14];
                i11 = i14;
            }
            this.f105900a--;
        }
    }
}
