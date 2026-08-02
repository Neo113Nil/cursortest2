package Ti;

import java.math.BigInteger;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.k;
import org.spongycastle.crypto.params.n;
import org.spongycastle.crypto.params.o;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class c implements org.spongycastle.crypto.d {

    /* renamed from: a, reason: collision with root package name */
    public n f11994a;

    @Override // org.spongycastle.crypto.d
    public void a(j jVar) {
        this.f11994a = (n) jVar;
    }

    @Override // org.spongycastle.crypto.d
    public BigInteger b(j jVar) {
        o oVar = (o) jVar;
        k b10 = oVar.b();
        if (!b10.equals(this.f11994a.b())) {
            throw new IllegalStateException("ECDHC public key has wrong domain parameters");
        }
        g v10 = oVar.c().t(b10.c().multiply(this.f11994a.c()).mod(b10.d())).v();
        if (v10.r()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
        }
        return v10.e().t();
    }

    @Override // org.spongycastle.crypto.d
    public int getFieldSize() {
        return (this.f11994a.b().a().t() + 7) / 8;
    }
}
