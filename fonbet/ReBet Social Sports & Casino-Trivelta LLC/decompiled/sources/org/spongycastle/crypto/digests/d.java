package org.spongycastle.crypto.digests;

/* loaded from: classes5.dex */
public class d extends b {
    private static final byte[] IV = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public d() {
        super(IV);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new d(this);
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 64;
    }

    public d(d dVar) {
        super(IV);
        a(dVar);
    }
}
