package Yi;

import bj.InterfaceC2427a;
import org.spongycastle.crypto.engines.C5960j;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class g implements v {

    /* renamed from: a, reason: collision with root package name */
    public int f14302a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14303b;
    private byte[] buf;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2427a f14304c;

    /* renamed from: d, reason: collision with root package name */
    public int f14305d;

    /* renamed from: e, reason: collision with root package name */
    public w f14306e;

    /* renamed from: f, reason: collision with root package name */
    public w f14307f;
    private byte[] mac;

    public g(org.spongycastle.crypto.e eVar) {
        this(eVar, eVar.getBlockSize() * 8, null);
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        w wVar;
        reset();
        boolean z10 = jVar instanceof w;
        if (!z10 && !(jVar instanceof z)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] a10 = (z10 ? (w) jVar : (w) ((z) jVar).b()).a();
        if (a10.length == 16) {
            wVar = new w(a10, 0, 8);
            this.f14306e = new w(a10, 8, 8);
            this.f14307f = wVar;
        } else {
            if (a10.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            wVar = new w(a10, 0, 8);
            this.f14306e = new w(a10, 8, 8);
            this.f14307f = new w(a10, 16, 8);
        }
        if (jVar instanceof z) {
            this.f14303b.a(true, new z(wVar, ((z) jVar).a()));
        } else {
            this.f14303b.a(true, wVar);
        }
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        int blockSize = this.f14303b.getBlockSize();
        if (this.f14304c == null) {
            while (true) {
                int i11 = this.f14302a;
                if (i11 >= blockSize) {
                    break;
                }
                this.buf[i11] = 0;
                this.f14302a = i11 + 1;
            }
        } else {
            if (this.f14302a == blockSize) {
                this.f14303b.processBlock(this.buf, 0, this.mac, 0);
                this.f14302a = 0;
            }
            this.f14304c.addPadding(this.buf, this.f14302a);
        }
        this.f14303b.processBlock(this.buf, 0, this.mac, 0);
        C5960j c5960j = new C5960j();
        c5960j.a(false, this.f14306e);
        byte[] bArr2 = this.mac;
        c5960j.processBlock(bArr2, 0, bArr2, 0);
        c5960j.a(true, this.f14307f);
        byte[] bArr3 = this.mac;
        c5960j.processBlock(bArr3, 0, bArr3, 0);
        System.arraycopy(this.mac, 0, bArr, i10, this.f14305d);
        reset();
        return this.f14305d;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14305d;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.f14302a = 0;
                this.f14303b.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        int i10 = this.f14302a;
        byte[] bArr = this.buf;
        if (i10 == bArr.length) {
            this.f14303b.processBlock(bArr, 0, this.mac, 0);
            this.f14302a = 0;
        }
        byte[] bArr2 = this.buf;
        int i11 = this.f14302a;
        this.f14302a = i11 + 1;
        bArr2[i11] = b10;
    }

    public g(org.spongycastle.crypto.e eVar, InterfaceC2427a interfaceC2427a) {
        this(eVar, eVar.getBlockSize() * 8, interfaceC2427a);
    }

    public g(org.spongycastle.crypto.e eVar, int i10, InterfaceC2427a interfaceC2427a) {
        if (i10 % 8 == 0) {
            if (eVar instanceof C5960j) {
                this.f14303b = new Zi.b(eVar);
                this.f14304c = interfaceC2427a;
                this.f14305d = i10 / 8;
                this.mac = new byte[eVar.getBlockSize()];
                this.buf = new byte[eVar.getBlockSize()];
                this.f14302a = 0;
                return;
            }
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int blockSize = this.f14303b.getBlockSize();
            int i12 = this.f14302a;
            int i13 = blockSize - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.buf, i12, i13);
                this.f14303b.processBlock(this.buf, 0, this.mac, 0);
                this.f14302a = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > blockSize) {
                    this.f14303b.processBlock(bArr, i10, this.mac, 0);
                    i11 -= blockSize;
                    i10 += blockSize;
                }
            }
            System.arraycopy(bArr, i10, this.buf, this.f14302a, i11);
            this.f14302a += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
