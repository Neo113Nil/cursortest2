package Ti;

import Aj.g;
import java.math.BigInteger;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.n;
import org.spongycastle.crypto.params.o;
import org.spongycastle.crypto.params.x;
import org.spongycastle.crypto.params.y;

/* loaded from: classes5.dex */
public class d implements org.spongycastle.crypto.d {

    /* renamed from: a, reason: collision with root package name */
    public x f11995a;

    @Override // org.spongycastle.crypto.d
    public void a(j jVar) {
        this.f11995a = (x) jVar;
    }

    @Override // org.spongycastle.crypto.d
    public BigInteger b(j jVar) {
        if (g.a("org.spongycastle.ec.disable_mqv")) {
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
        y yVar = (y) jVar;
        n c10 = this.f11995a.c();
        k b10 = c10.b();
        if (!b10.equals(yVar.b().b())) {
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        org.spongycastle.math.ec.g v10 = c(b10, c10, this.f11995a.a(), this.f11995a.b(), yVar.b(), yVar.a()).v();
        if (v10.r()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
        }
        return v10.e().t();
    }

    public final org.spongycastle.math.ec.g c(k kVar, n nVar, n nVar2, o oVar, o oVar2, o oVar3) {
        BigInteger d10 = kVar.d();
        int bitLength = (d10.bitLength() + 1) / 2;
        BigInteger shiftLeft = org.spongycastle.math.ec.c.f62725b.shiftLeft(bitLength);
        org.spongycastle.math.ec.d a10 = kVar.a();
        org.spongycastle.math.ec.g[] gVarArr = {org.spongycastle.math.ec.b.h(a10, oVar.c()), org.spongycastle.math.ec.b.h(a10, oVar2.c()), org.spongycastle.math.ec.b.h(a10, oVar3.c())};
        a10.z(gVarArr);
        org.spongycastle.math.ec.g gVar = gVarArr[0];
        org.spongycastle.math.ec.g gVar2 = gVarArr[1];
        org.spongycastle.math.ec.g gVar3 = gVarArr[2];
        BigInteger mod = nVar.c().multiply(gVar.e().t().mod(shiftLeft).setBit(bitLength)).add(nVar2.c()).mod(d10);
        BigInteger bit = gVar3.e().t().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = kVar.c().multiply(mod).mod(d10);
        return org.spongycastle.math.ec.b.o(gVar2, bit.multiply(mod2).mod(d10), gVar3, mod2);
    }

    @Override // org.spongycastle.crypto.d
    public int getFieldSize() {
        return (this.f11995a.c().b().a().t() + 7) / 8;
    }
}
