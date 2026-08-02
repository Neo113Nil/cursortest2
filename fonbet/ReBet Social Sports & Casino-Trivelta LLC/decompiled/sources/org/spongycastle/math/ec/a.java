package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class a implements f {
    @Override // org.spongycastle.math.ec.f
    public g a(g gVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || gVar.r()) {
            return gVar.h().u();
        }
        g b10 = b(gVar, bigInteger.abs());
        if (signum <= 0) {
            b10 = b10.u();
        }
        return b.p(b10);
    }

    public abstract g b(g gVar, BigInteger bigInteger);
}
