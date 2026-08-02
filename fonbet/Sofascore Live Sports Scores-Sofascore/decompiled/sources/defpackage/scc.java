package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class scc {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public scc(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final scc a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new scc(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scc)) {
            return false;
        }
        scc sccVar = (scc) obj;
        return this.a.equals(sccVar.a) && this.b == sccVar.b && this.c == sccVar.c && this.d == sccVar.d && this.e == sccVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public scc(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public scc(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public scc(Object obj) {
        this(obj, -1L);
    }
}
