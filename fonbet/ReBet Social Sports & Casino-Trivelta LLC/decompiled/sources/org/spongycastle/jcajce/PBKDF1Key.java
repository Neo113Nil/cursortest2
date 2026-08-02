package org.spongycastle.jcajce;

import org.spongycastle.crypto.h;

/* loaded from: classes5.dex */
public class PBKDF1Key implements PBKDFKey {
    private final h converter;
    private final char[] password;

    public PBKDF1Key(char[] cArr, h hVar) {
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        throw null;
    }

    @Override // java.security.Key
    public String getFormat() {
        throw null;
    }

    public char[] getPassword() {
        return this.password;
    }
}
