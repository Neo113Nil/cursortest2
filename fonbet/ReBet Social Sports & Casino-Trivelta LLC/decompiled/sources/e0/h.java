package e0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class h {
    public static final long a(int i10, int i11) {
        return g.b((i11 & BodyPartID.bodyIdMax) | (i10 << 32));
    }

    public static final long b(long j10, long j11) {
        return M.e.a(M.d.c(j10) - g.c(j11), M.d.d(j10) - g.d(j11));
    }

    public static final long c(long j10, long j11) {
        return M.e.a(M.d.c(j10) + g.c(j11), M.d.d(j10) + g.d(j11));
    }
}
