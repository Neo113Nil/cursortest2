package org.spongycastle.crypto.digests;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public class u extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f62421m;

    /* renamed from: n, reason: collision with root package name */
    public long f62422n;

    /* renamed from: o, reason: collision with root package name */
    public long f62423o;

    /* renamed from: p, reason: collision with root package name */
    public long f62424p;

    /* renamed from: q, reason: collision with root package name */
    public long f62425q;

    /* renamed from: r, reason: collision with root package name */
    public long f62426r;

    /* renamed from: s, reason: collision with root package name */
    public long f62427s;

    /* renamed from: t, reason: collision with root package name */
    public long f62428t;

    /* renamed from: u, reason: collision with root package name */
    public long f62429u;

    public u(int i10) {
        if (i10 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i10 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i11 = i10 / 8;
        this.f62421m = i11;
        p(i11 * 8);
        reset();
    }

    public static void n(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(4, i12);
        while (true) {
            min--;
            if (min < 0) {
                return;
            } else {
                bArr[i11 + min] = (byte) (i10 >>> ((3 - min) * 8));
            }
        }
    }

    public static void o(long j10, byte[] bArr, int i10, int i11) {
        if (i11 > 0) {
            n((int) (j10 >>> 32), bArr, i10, i11);
            if (i11 > 4) {
                n((int) (j10 & BodyPartID.bodyIdMax), bArr, i10 + 4, i11 - 4);
            }
        }
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        u uVar = (u) dVar;
        if (this.f62421m != uVar.f62421m) {
            throw new Aj.e("digestLength inappropriate in other");
        }
        super.i(uVar);
        this.f62422n = uVar.f62422n;
        this.f62423o = uVar.f62423o;
        this.f62424p = uVar.f62424p;
        this.f62425q = uVar.f62425q;
        this.f62426r = uVar.f62426r;
        this.f62427s = uVar.f62427s;
        this.f62428t = uVar.f62428t;
        this.f62429u = uVar.f62429u;
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new u(this);
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        j();
        o(this.f62329d, bArr, i10, this.f62421m);
        o(this.f62330e, bArr, i10 + 8, this.f62421m - 8);
        o(this.f62331f, bArr, i10 + 16, this.f62421m - 16);
        o(this.f62332g, bArr, i10 + 24, this.f62421m - 24);
        o(this.f62333h, bArr, i10 + 32, this.f62421m - 32);
        o(this.f62334i, bArr, i10 + 40, this.f62421m - 40);
        o(this.f62335j, bArr, i10 + 48, this.f62421m - 48);
        o(this.f62336k, bArr, i10 + 56, this.f62421m - 56);
        reset();
        return this.f62421m;
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.f62421m * 8);
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return this.f62421m;
    }

    public final void p(int i10) {
        this.f62329d = -3482333909917012819L;
        this.f62330e = 2216346199247487646L;
        this.f62331f = -7364697282686394994L;
        this.f62332g = 65953792586715988L;
        this.f62333h = -816286391624063116L;
        this.f62334i = 4512832404995164602L;
        this.f62335j = -5033199132376557362L;
        this.f62336k = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update((byte) 45);
        update((byte) 53);
        update((byte) 49);
        update((byte) 50);
        update((byte) 47);
        if (i10 > 100) {
            update((byte) ((i10 / 100) + 48));
            int i11 = i10 % 100;
            update((byte) ((i11 / 10) + 48));
            update((byte) ((i11 % 10) + 48));
        } else if (i10 > 10) {
            update((byte) ((i10 / 10) + 48));
            update((byte) ((i10 % 10) + 48));
        } else {
            update((byte) (i10 + 48));
        }
        j();
        this.f62422n = this.f62329d;
        this.f62423o = this.f62330e;
        this.f62424p = this.f62331f;
        this.f62425q = this.f62332g;
        this.f62426r = this.f62333h;
        this.f62427s = this.f62334i;
        this.f62428t = this.f62335j;
        this.f62429u = this.f62336k;
    }

    @Override // org.spongycastle.crypto.digests.g, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62329d = this.f62422n;
        this.f62330e = this.f62423o;
        this.f62331f = this.f62424p;
        this.f62332g = this.f62425q;
        this.f62333h = this.f62426r;
        this.f62334i = this.f62427s;
        this.f62335j = this.f62428t;
        this.f62336k = this.f62429u;
    }

    public u(u uVar) {
        super(uVar);
        this.f62421m = uVar.f62421m;
        a(uVar);
    }
}
