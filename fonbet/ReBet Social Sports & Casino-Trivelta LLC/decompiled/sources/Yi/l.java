package Yi;

import org.spongycastle.crypto.digests.x;
import org.spongycastle.crypto.params.G;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class l implements v {

    /* renamed from: a, reason: collision with root package name */
    public x f14343a;

    public l(int i10, int i11) {
        this.f14343a = new x(i10, i11);
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        G a10;
        if (jVar instanceof G) {
            a10 = (G) jVar;
        } else {
            if (!(jVar instanceof w)) {
                throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + jVar.getClass().getName());
            }
            a10 = new G.b().c(((w) jVar).a()).a();
        }
        if (a10.a() == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.f14343a.i(a10);
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        return this.f14343a.f(bArr, i10);
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.f14343a.g() * 8) + "-" + (this.f14343a.h() * 8);
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14343a.h();
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        this.f14343a.m();
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        this.f14343a.r(b10);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        this.f14343a.s(bArr, i10, i11);
    }
}
