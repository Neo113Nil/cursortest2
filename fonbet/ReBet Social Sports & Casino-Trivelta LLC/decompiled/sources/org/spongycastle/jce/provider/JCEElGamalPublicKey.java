package org.spongycastle.jce.provider;

import Qi.u;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import nj.AbstractC5744e;
import nj.C5742c;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.crypto.params.s;
import org.spongycastle.jcajce.provider.asymmetric.util.e;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;

/* loaded from: classes5.dex */
public class JCEElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private C5742c elSpec;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f62709y;

    public JCEElGamalPublicKey(AbstractC5744e abstractC5744e) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f62709y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new C5742c((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return e.c(new Qi.a(Ki.b.f6661l, new Ki.a(this.elSpec.b(), this.elSpec.a())), new C5933k(this.f62709y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalKey
    public C5742c getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPublicKey, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f62709y;
    }

    public JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f62709y = dHPublicKeySpec.getY();
        this.elSpec = new C5742c(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public JCEElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.f62709y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f62709y = dHPublicKey.getY();
        this.elSpec = new C5742c(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public JCEElGamalPublicKey(s sVar) {
        this.f62709y = sVar.c();
        this.elSpec = new C5742c(sVar.b().c(), sVar.b().a());
    }

    public JCEElGamalPublicKey(BigInteger bigInteger, C5742c c5742c) {
        this.f62709y = bigInteger;
        this.elSpec = c5742c;
    }

    public JCEElGamalPublicKey(u uVar) {
        Ki.a e10 = Ki.a.e(uVar.c().f());
        try {
            this.f62709y = ((C5933k) uVar.g()).n();
            this.elSpec = new C5742c(e10.f(), e10.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
