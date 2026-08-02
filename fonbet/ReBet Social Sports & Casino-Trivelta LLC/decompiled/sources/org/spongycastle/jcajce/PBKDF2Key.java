package org.spongycastle.jcajce;

import Aj.a;
import org.spongycastle.crypto.h;

/* loaded from: classes5.dex */
public class PBKDF2Key implements PBKDFKey {
    private final h converter;
    private final char[] password;

    public PBKDF2Key(char[] cArr, h hVar) {
        this.password = a.f(cArr);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PBKDF2";
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
