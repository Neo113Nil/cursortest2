package Ti;

import java.math.BigInteger;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.params.n;
import org.spongycastle.crypto.params.o;
import org.spongycastle.math.ec.g;

/* loaded from: classes5.dex */
public class b implements org.spongycastle.crypto.d {

    /* renamed from: a, reason: collision with root package name */
    public n f11993a;

    @Override // org.spongycastle.crypto.d
    public void a(j jVar) {
        this.f11993a = (n) jVar;
    }

    @Override // org.spongycastle.crypto.d
    public BigInteger b(j jVar) {
        o oVar = (o) jVar;
        if (!oVar.b().equals(this.f11993a.b())) {
            throw new IllegalStateException("ECDH public key has wrong domain parameters");
        }
        g v10 = oVar.c().t(this.f11993a.c()).v();
        if (v10.r()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
        }
        return v10.e().t();
    }

    @Override // org.spongycastle.crypto.d
    public int getFieldSize() {
        return (this.f11993a.b().a().t() + 7) / 8;
    }
}
