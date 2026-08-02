package Yi;

import bj.InterfaceC2427a;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public int f14282a;

    /* renamed from: b, reason: collision with root package name */
    public h f14283b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2427a f14284c;

    /* renamed from: d, reason: collision with root package name */
    public int f14285d;
    private byte[] mac;

    public b(org.spongycastle.crypto.e eVar) {
        this(eVar, 8, (eVar.getBlockSize() * 8) / 2, null);
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        reset();
        this.f14283b.d(jVar);
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        int b10 = this.f14283b.b();
        InterfaceC2427a interfaceC2427a = this.f14284c;
        if (interfaceC2427a == null) {
            while (true) {
                int i11 = this.f14282a;
                if (i11 >= b10) {
                    break;
                }
                this.buf[i11] = 0;
                this.f14282a = i11 + 1;
            }
        } else {
            interfaceC2427a.addPadding(this.buf, this.f14282a);
        }
        this.f14283b.e(this.buf, 0, this.mac, 0);
        this.f14283b.c(this.mac);
        System.arraycopy(this.mac, 0, bArr, i10, this.f14285d);
        reset();
        return this.f14285d;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14283b.a();
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14285d;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f14282a = 0;
                this.f14283b.f();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        int i10 = this.f14282a;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            this.f14283b.e(bArr, 0, this.mac, 0);
            this.f14282a = 0;
        }
        byte[] bArr2 = this.buf;
        int i11 = this.f14282a;
        this.f14282a = i11 + 1;
        bArr2[i11] = b10;
    }

    public b(org.spongycastle.crypto.e eVar, int i10, int i11, InterfaceC2427a interfaceC2427a) {
        this.f14284c = null;
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.mac = new byte[eVar.getBlockSize()];
        h hVar = new h(eVar, i10);
        this.f14283b = hVar;
        this.f14284c = interfaceC2427a;
        this.f14285d = i11 / 8;
        this.buf = new byte[hVar.b()];
        this.f14282a = 0;
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int b10 = this.f14283b.b();
            int i12 = this.f14282a;
            int i13 = b10 - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.buf, i12, i13);
                this.f14283b.e(this.buf, 0, this.mac, 0);
                this.f14282a = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > b10) {
                    this.f14283b.e(bArr, i10, this.mac, 0);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.buf, this.f14282a, i11);
            this.f14282a += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
