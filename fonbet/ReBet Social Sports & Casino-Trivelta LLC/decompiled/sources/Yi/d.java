package Yi;

import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class d implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Zi.h f14289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14290b = 128;

    public d(Zi.h hVar) {
        this.f14289a = hVar;
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof z)) {
            throw new IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        this.f14289a.a(true, new C5974a((w) zVar.b(), this.f14290b, a10));
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        try {
            return this.f14289a.doFinal(bArr, i10);
        } catch (r e10) {
            throw new IllegalStateException(e10.toString());
        }
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14289a.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14290b / 8;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        this.f14289a.k();
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        this.f14289a.j(b10);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        this.f14289a.processAADBytes(bArr, i10, i11);
    }
}
