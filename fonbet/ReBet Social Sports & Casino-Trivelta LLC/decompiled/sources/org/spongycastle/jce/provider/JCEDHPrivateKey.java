package org.spongycastle.jce.provider;

import Li.d;
import Li.g;
import Ri.n;
import java.io.IOException;
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
public class JCEDHPrivateKey implements DHPrivateKey, InterfaceC5595c {
    static final long serialVersionUID = 311058815616901812L;
    private InterfaceC5595c attrCarrier = new f();
    private DHParameterSpec dhSpec;
    private g info;

    /* renamed from: x, reason: collision with root package name */
    BigInteger f62706x;

    public JCEDHPrivateKey() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f62706x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
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
            return gVar != null ? gVar.b(ASN1Encoding.DER) : new g(new Qi.a(Li.f.f7331q0, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new C5933k(getX())).b(ASN1Encoding.DER);
        } catch (IOException unused) {
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
        return this.f62706x;
    }

    @Override // mj.InterfaceC5595c
    public void setBagAttribute(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.attrCarrier.setBagAttribute(c5936n, interfaceC5927e);
    }

    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f62706x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f62706x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    public JCEDHPrivateKey(g gVar) {
        AbstractC5941t k10 = AbstractC5941t.k(gVar.c().f());
        C5933k k11 = C5933k.k(gVar.g());
        C5936n c10 = gVar.c().c();
        this.info = gVar;
        this.f62706x = k11.n();
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
            Ri.a e11 = Ri.a.e(k10);
            this.dhSpec = new DHParameterSpec(e11.g().n(), e11.c().n());
        } else {
            throw new IllegalArgumentException("unknown algorithm type: " + c10);
        }
    }

    public JCEDHPrivateKey(h hVar) {
        this.f62706x = hVar.c();
        this.dhSpec = new DHParameterSpec(hVar.b().e(), hVar.b().b(), hVar.b().c());
    }
}
