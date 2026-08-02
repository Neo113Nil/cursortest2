package org.spongycastle.jcajce.provider.asymmetric.dh;

import Li.d;
import Li.g;
import Qi.a;
import Ri.c;
import Ri.n;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import mj.InterfaceC5595c;
import org.bouncycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.crypto.params.h;
import org.spongycastle.jcajce.provider.asymmetric.util.f;

/* loaded from: classes5.dex */
public class BCDHPrivateKey implements DHPrivateKey, InterfaceC5595c {
    static final long serialVersionUID = 311058815616901812L;
    private transient f attrCarrier = new f();
    private transient DHParameterSpec dhSpec;
    private transient g info;

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f62683x;

    public BCDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new f();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
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
        return "DH";
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
            g gVar = this.info;
            return gVar != null ? gVar.b(ASN1Encoding.DER) : new g(new a(Li.f.f7331q0, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new C5933k(getX())).b(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f62683x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // mj.InterfaceC5595c
    public void setBagAttribute(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.attrCarrier.setBagAttribute(c5936n, interfaceC5927e);
    }

    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f62683x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f62683x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public BCDHPrivateKey(g gVar) {
        AbstractC5941t k10 = AbstractC5941t.k(gVar.f().f());
        C5933k c5933k = (C5933k) gVar.g();
        C5936n c10 = gVar.f().c();
        this.info = gVar;
        this.f62683x = c5933k.n();
        if (c10.equals(Li.f.f7331q0)) {
            d e10 = d.e(k10);
            if (e10.f() != null) {
                this.dhSpec = new DHParameterSpec(e10.g(), e10.c(), e10.f().intValue());
                return;
            } else {
                this.dhSpec = new DHParameterSpec(e10.g(), e10.c());
                return;
            }
        }
        if (c10.equals(n.f10490r4)) {
            c e11 = c.e(k10);
            this.dhSpec = new DHParameterSpec(e11.h(), e11.c());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + c10);
        }
    }

    public BCDHPrivateKey(h hVar) {
        this.f62683x = hVar.c();
        this.dhSpec = new DHParameterSpec(hVar.b().e(), hVar.b().b(), hVar.b().c());
    }
}
