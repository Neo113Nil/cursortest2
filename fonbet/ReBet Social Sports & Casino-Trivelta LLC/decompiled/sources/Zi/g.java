package Zi;

import okhttp3.internal.ws.RealWebSocket;
import org.spongycastle.crypto.A;
import org.spongycastle.crypto.params.B;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class g extends A {

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f14909C = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* renamed from: b, reason: collision with root package name */
    public final d f14910b;

    /* renamed from: c, reason: collision with root package name */
    public w f14911c;

    /* renamed from: d, reason: collision with root package name */
    public long f14912d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14913e;

    public g(org.spongycastle.crypto.e eVar) {
        super(eVar);
        this.f14912d = 0L;
        this.f14910b = new d(eVar, eVar.getBlockSize() * 8);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f14912d = 0L;
        this.f14910b.a(z10, jVar);
        this.f14913e = z10;
        if (jVar instanceof z) {
            jVar = ((z) jVar).b();
        }
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            jVar = ((org.spongycastle.crypto.params.A) jVar).a();
        }
        if (jVar instanceof B) {
            jVar = ((B) jVar).a();
        }
        this.f14911c = (w) jVar;
    }

    @Override // org.spongycastle.crypto.A
    public byte b(byte b10) {
        long j10 = this.f14912d;
        if (j10 > 0 && j10 % RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE == 0) {
            org.spongycastle.crypto.e c10 = this.f14910b.c();
            c10.a(false, this.f14911c);
            byte[] bArr = new byte[32];
            byte[] bArr2 = f14909C;
            c10.processBlock(bArr2, 0, bArr, 0);
            c10.processBlock(bArr2, 8, bArr, 8);
            c10.processBlock(bArr2, 16, bArr, 16);
            c10.processBlock(bArr2, 24, bArr, 24);
            w wVar = new w(bArr);
            this.f14911c = wVar;
            c10.a(true, wVar);
            byte[] f10 = this.f14910b.f();
            c10.processBlock(f10, 0, f10, 0);
            this.f14910b.a(this.f14913e, new z(this.f14911c, f10));
        }
        this.f14912d++;
        return this.f14910b.b(b10);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        String algorithmName = this.f14910b.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14910b.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f14910b.getBlockSize(), bArr2, i11);
        return this.f14910b.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        this.f14912d = 0L;
        this.f14910b.reset();
    }
}
