package org.spongycastle.jcajce;

import Aj.a;
import javax.crypto.interfaces.PBEKey;
import org.spongycastle.crypto.h;

/* loaded from: classes5.dex */
public class PBKDF1KeyWithParameters extends PBKDF1Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PBKDF1KeyWithParameters(char[] cArr, h hVar, byte[] bArr, int i10) {
        super(cArr, hVar);
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
}
