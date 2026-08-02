package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import Ki.b;
import Li.g;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import mj.InterfaceC5595c;
import nj.AbstractC5743d;
import nj.C5742c;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.crypto.params.r;
import org.spongycastle.jcajce.provider.asymmetric.util.f;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;

/* loaded from: classes5.dex */
public class BCElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, InterfaceC5595c {
    static final long serialVersionUID = 4819350091141529678L;
    private transient f attrCarrier = new f();
    private transient C5742c elSpec;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f62693x;

    public BCElGamalPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new C5742c((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new f();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHPrivateKey)) {
            return false;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
        return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // mj.InterfaceC5595c
    public InterfaceC5927e getBagAttribute(C5936n c5936n) {
        return this.attrCarrier.getBagAttribute(c5936n);
    }

    @Override // mj.InterfaceC5595c
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new g(new Qi.a(b.f6661l, new Ki.a(this.elSpec.b(), this.elSpec.a())), new C5933k(getX())).b(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalKey
    public C5742c getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // org.spongycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f62693x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // mj.InterfaceC5595c
    public void setBagAttribute(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.attrCarrier.setBagAttribute(c5936n, interfaceC5927e);
    }

    public BCElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
        this.f62693x = elGamalPrivateKey.getX();
        this.elSpec = elGamalPrivateKey.getParameters();
    }

    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f62693x = dHPrivateKey.getX();
        this.elSpec = new C5742c(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    public BCElGamalPrivateKey(AbstractC5743d abstractC5743d) {
        throw null;
    }

    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f62693x = dHPrivateKeySpec.getX();
        this.elSpec = new C5742c(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCElGamalPrivateKey(g gVar) {
        Ki.a e10 = Ki.a.e(gVar.f().f());
        this.f62693x = C5933k.k(gVar.g()).n();
        this.elSpec = new C5742c(e10.f(), e10.c());
    }

    public BCElGamalPrivateKey(r rVar) {
        this.f62693x = rVar.c();
        this.elSpec = new C5742c(rVar.b().c(), rVar.b().a());
    }
}
