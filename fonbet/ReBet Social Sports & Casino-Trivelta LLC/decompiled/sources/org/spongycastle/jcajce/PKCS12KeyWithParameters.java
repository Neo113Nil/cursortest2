package org.spongycastle.jcajce;

import Aj.a;
import javax.crypto.interfaces.PBEKey;

/* loaded from: classes5.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i10) {
        super(cArr);
        this.salt = a.d(bArr);
        this.iterationCount = i10;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public PKCS12KeyWithParameters(char[] cArr, boolean z10, byte[] bArr, int i10) {
        super(cArr, z10);
        this.salt = a.d(bArr);
        this.iterationCount = i10;
    }
}
