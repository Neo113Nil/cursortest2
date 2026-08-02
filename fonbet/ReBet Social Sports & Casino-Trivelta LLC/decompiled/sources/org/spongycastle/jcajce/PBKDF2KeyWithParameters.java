package org.spongycastle.jcajce;

import Aj.a;
import javax.crypto.interfaces.PBEKey;
import org.spongycastle.crypto.h;

/* loaded from: classes5.dex */
public class PBKDF2KeyWithParameters extends PBKDF2Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PBKDF2KeyWithParameters(char[] cArr, h hVar, byte[] bArr, int i10) {
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
