package e0;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class j {
    public static final long a(int i10, int i11) {
        return i.a((i11 & BodyPartID.bodyIdMax) | (i10 << 32));
    }

    public static final long b(long j10) {
        return M.h.a(i.c(j10), i.b(j10));
    }
}
