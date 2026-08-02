package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import Ki.b;
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
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.crypto.params.s;
import org.spongycastle.jce.interfaces.ElGamalPublicKey;

/* loaded from: classes5.dex */
public class BCElGamalPublicKey implements ElGamalPublicKey, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient C5742c elSpec;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f62694y;

    public BCElGamalPublicKey(AbstractC5744e abstractC5744e) {
        throw null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new C5742c((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPublicKey)) {
            return false;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) obj;
        return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new u(new Qi.a(b.f6661l, new Ki.a(this.elSpec.b(), this.elSpec.a())), new C5933k(this.f62694y)).b(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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
        return this.f62694y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f62694y = dHPublicKeySpec.getY();
        this.elSpec = new C5742c(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public BCElGamalPublicKey(ElGamalPublicKey elGamalPublicKey) {
        this.f62694y = elGamalPublicKey.getY();
        this.elSpec = elGamalPublicKey.getParameters();
    }

    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f62694y = dHPublicKey.getY();
        this.elSpec = new C5742c(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    public BCElGamalPublicKey(s sVar) {
        this.f62694y = sVar.c();
        this.elSpec = new C5742c(sVar.b().c(), sVar.b().a());
    }

    public BCElGamalPublicKey(BigInteger bigInteger, C5742c c5742c) {
        this.f62694y = bigInteger;
        this.elSpec = c5742c;
    }

    public BCElGamalPublicKey(u uVar) {
        Ki.a e10 = Ki.a.e(uVar.c().f());
        try {
            this.f62694y = ((C5933k) uVar.g()).n();
            this.elSpec = new C5742c(e10.f(), e10.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }
}
