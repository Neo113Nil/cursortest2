package org.spongycastle.jcajce.provider.asymmetric.dh;

import Li.d;
import Li.f;
import Qi.a;
import Qi.u;
import Ri.c;
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
import org.spongycastle.crypto.params.C5980g;
import org.spongycastle.crypto.params.i;
import org.spongycastle.crypto.params.j;
import org.spongycastle.jcajce.provider.asymmetric.util.e;

/* loaded from: classes5.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient i dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient u info;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f62684y;

    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f62684y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        this.dhPublicKey = new i(this.f62684y, new C5980g(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
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
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public i engineGetKeyParameters() {
        return this.dhPublicKey;
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
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        u uVar = this.info;
        return uVar != null ? e.d(uVar) : e.c(new a(f.f7331q0, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new C5933k(this.f62684y));
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
        return this.f62684y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f62684y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
        this.dhPublicKey = new i(this.f62684y, new C5980g(this.dhSpec.getP(), this.dhSpec.getG()));
    }

    public BCDHPublicKey(i iVar) {
        this.f62684y = iVar.c();
        this.dhSpec = new DHParameterSpec(iVar.b().e(), iVar.b().b(), iVar.b().c());
        this.dhPublicKey = iVar;
    }

    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f62684y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = new i(bigInteger, new C5980g(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    public BCDHPublicKey(u uVar) {
        this.info = uVar;
        try {
            this.f62684y = ((C5933k) uVar.g()).n();
            AbstractC5941t k10 = AbstractC5941t.k(uVar.c().f());
            C5936n c10 = uVar.c().c();
            if (!c10.equals(f.f7331q0) && !isPKCSParam(k10)) {
                if (c10.equals(n.f10490r4)) {
                    c e10 = c.e(k10);
                    this.dhSpec = new DHParameterSpec(e10.h(), e10.c());
                    Ri.e j10 = e10.j();
                    if (j10 != null) {
                        this.dhPublicKey = new i(this.f62684y, new C5980g(e10.h(), e10.c(), e10.i(), e10.f(), new j(j10.f(), j10.e().intValue())));
                        return;
                    } else {
                        this.dhPublicKey = new i(this.f62684y, new C5980g(e10.h(), e10.c(), e10.i(), e10.f(), null));
                        return;
                    }
                }
                throw new IllegalArgumentException("unknown algorithm type: " + c10);
            }
            d e11 = d.e(k10);
            if (e11.f() != null) {
                this.dhSpec = new DHParameterSpec(e11.g(), e11.c(), e11.f().intValue());
            } else {
                this.dhSpec = new DHParameterSpec(e11.g(), e11.c());
            }
            this.dhPublicKey = new i(this.f62684y, new C5980g(this.dhSpec.getP(), this.dhSpec.getG()));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }
}
