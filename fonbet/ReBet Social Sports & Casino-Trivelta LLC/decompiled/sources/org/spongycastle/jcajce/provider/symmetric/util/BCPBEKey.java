package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.y;

/* loaded from: classes5.dex */
public class BCPBEKey implements PBEKey {
    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    C5936n oid;
    j param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong = false;
    int type;

    public BCPBEKey(String str, C5936n c5936n, int i10, int i11, int i12, int i13, PBEKeySpec pBEKeySpec, j jVar) {
        this.algorithm = str;
        this.oid = c5936n;
        this.type = i10;
        this.digest = i11;
        this.keySize = i12;
        this.ivSize = i13;
        this.pbeKeySpec = pBEKeySpec;
        this.param = jVar;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    public int getDigest() {
        return this.digest;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        j jVar = this.param;
        if (jVar != null) {
            return (jVar instanceof z ? (w) ((z) jVar).b() : (w) jVar).a();
        }
        int i10 = this.type;
        return i10 == 2 ? y.a(this.pbeKeySpec.getPassword()) : i10 == 5 ? y.c(this.pbeKeySpec.getPassword()) : y.b(this.pbeKeySpec.getPassword());
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.pbeKeySpec.getIterationCount();
    }

    public int getIvSize() {
        return this.ivSize;
    }

    public int getKeySize() {
        return this.keySize;
    }

    public C5936n getOID() {
        return this.oid;
    }

    public j getParam() {
        return this.param;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.pbeKeySpec.getPassword();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.pbeKeySpec.getSalt();
    }

    public int getType() {
        return this.type;
    }

    public void setTryWrongPKCS12Zero(boolean z10) {
        this.tryWrong = z10;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}
