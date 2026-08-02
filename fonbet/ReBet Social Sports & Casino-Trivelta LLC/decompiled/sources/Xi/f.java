package Xi;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.C5949b;
import org.spongycastle.crypto.InterfaceC5950c;
import org.spongycastle.crypto.params.n;
import org.spongycastle.crypto.params.o;
import org.spongycastle.crypto.t;

/* loaded from: classes5.dex */
public class f implements InterfaceC5950c, org.spongycastle.math.ec.c {

    /* renamed from: g, reason: collision with root package name */
    public org.spongycastle.crypto.params.k f13876g;

    /* renamed from: h, reason: collision with root package name */
    public SecureRandom f13877h;

    public org.spongycastle.math.ec.f a() {
        return new org.spongycastle.math.ec.i();
    }

    public void b(t tVar) {
        org.spongycastle.crypto.params.l lVar = (org.spongycastle.crypto.params.l) tVar;
        this.f13877h = lVar.a();
        this.f13876g = lVar.c();
        if (this.f13877h == null) {
            this.f13877h = new SecureRandom();
        }
    }

    @Override // org.spongycastle.crypto.InterfaceC5950c
    public C5949b generateKeyPair() {
        BigInteger d10 = this.f13876g.d();
        int bitLength = d10.bitLength();
        int i10 = bitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f13877h);
            if (bigInteger.compareTo(org.spongycastle.math.ec.c.f62726c) >= 0 && bigInteger.compareTo(d10) < 0 && org.spongycastle.math.ec.t.e(bigInteger) >= i10) {
                return new C5949b(new o(a().a(this.f13876g.b(), bigInteger), this.f13876g), new n(bigInteger, this.f13876g));
            }
        }
    }
}
