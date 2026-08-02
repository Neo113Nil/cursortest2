package e1;

import B4.V;
import Z1.n;
import Z1.r;
import Z1.s;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c implements InterfaceC6250b {

    /* renamed from: a, reason: collision with root package name */
    private final float f61775a;

    public c(float f7) {
        this.f61775a = f7;
    }

    @Override // e1.InterfaceC6250b
    public final long a(long j11, long j12, @NotNull s sVar) {
        long a11 = r.a(((int) (j12 >> 32)) - ((int) (j11 >> 32)), ((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L)));
        float f7 = 1;
        return n.a(Math.round((this.f61775a + f7) * (((int) (a11 >> 32)) / 2.0f)), Math.round((f7 - 1.0f) * (((int) (a11 & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Float.compare(this.f61775a, ((c) obj).f61775a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f61775a) * 31);
    }

    @NotNull
    public final String toString() {
        return V.b(this.f61775a, ", verticalBias=-1.0)", new StringBuilder("BiasAbsoluteAlignment(horizontalBias="));
    }
}
