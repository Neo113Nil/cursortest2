package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes3.dex */
public final class ygj {

    @NotNull
    public static final wgj Companion = new wgj();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ ygj(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            oea.z(i, 1, vgj.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygj) && this.a == ((ygj) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fn0.n(new StringBuilder("Time(ms="), this.a, ')');
    }

    public ygj(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
