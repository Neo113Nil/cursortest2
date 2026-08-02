package org.spongycastle.jce.provider;

import Li.d;
import Li.f;
import Qi.u;
import Ri.n;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.params.i;
import org.spongycastle.jcajce.provider.asymmetric.util.e;

/* loaded from: classes5.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private u info;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f62707y;

    public JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f62707y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    private boolean isPKCSParam(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() == 2) {
            return true;
        }
        if (abstractC5941t.size() > 3) {
            return false;
        }
        return C5933k.k(abstractC5941t.n(2)).n().compareTo(BigInteger.valueOf((long) C5933k.k(abstractC5941t.n(0)).n().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f62707y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        u uVar = this.info;
        return uVar != null ? e.d(uVar) : e.c(new Qi.a(f.f7331q0, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new C5933k(this.f62707y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f62707y;
    }

    public JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.f62707y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    public JCEDHPublicKey(i iVar) {
        this.f62707y = iVar.c();
        this.dhSpec = new DHParameterSpec(iVar.b().e(), iVar.b().b(), iVar.b().c());
    }

    public JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f62707y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    public JCEDHPublicKey(u uVar) {
        this.info = uVar;
        try {
            this.f62707y = ((C5933k) uVar.g()).n();
            AbstractC5941t k10 = AbstractC5941t.k(uVar.e().f());
            C5936n c10 = uVar.e().c();
            if (!c10.equals(f.f7331q0) && !isPKCSParam(k10)) {
                if (c10.equals(n.f10490r4)) {
                    Ri.a e10 = Ri.a.e(k10);
                    this.dhSpec = new DHParameterSpec(e10.g().n(), e10.c().n());
                    return;
                } else {
                    throw new IllegalArgumentException("unknown algorithm type: " + c10);
                }
            }
            d e11 = d.e(k10);
            if (e11.f() != null) {
                this.dhSpec = new DHParameterSpec(e11.g(), e11.c(), e11.f().intValue());
            } else {
                this.dhSpec = new DHParameterSpec(e11.g(), e11.c());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
