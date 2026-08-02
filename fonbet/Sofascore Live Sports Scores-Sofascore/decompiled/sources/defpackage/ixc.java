package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ixc implements lic {
    public final long a;
    public final long b;
    public final long c;

    public ixc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixc)) {
            return false;
        }
        ixc ixcVar = (ixc) obj;
        return this.a == ixcVar.a && this.b == ixcVar.b && this.c == ixcVar.c;
    }

    public final int hashCode() {
        return jaa.F(this.c) + ((jaa.F(this.b) + ((jaa.F(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
