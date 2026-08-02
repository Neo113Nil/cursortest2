package org.spongycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes5.dex */
public abstract class e implements org.spongycastle.crypto.q, Aj.d {

    /* renamed from: a, reason: collision with root package name */
    public int f62316a;

    /* renamed from: b, reason: collision with root package name */
    public long f62317b;
    private final byte[] xBuf;

    public e() {
        this.xBuf = new byte[4];
        this.f62316a = 0;
    }

    public void b(e eVar) {
        byte[] bArr = eVar.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.f62316a = eVar.f62316a;
        this.f62317b = eVar.f62317b;
    }

    public void c() {
        long j10 = this.f62317b << 3;
        update(ByteCompanionObject.MIN_VALUE);
        while (this.f62316a != 0) {
            update((byte) 0);
        }
        e(j10);
        d();
    }

    public abstract void d();

    public abstract void e(long j10);

    public abstract void f(byte[] bArr, int i10);

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return 64;
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        this.f62317b = 0L;
        this.f62316a = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i10 >= bArr.length) {
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.f62316a;
        int i11 = i10 + 1;
        this.f62316a = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            f(bArr, 0);
            this.f62316a = 0;
        }
        this.f62317b++;
    }

    public e(e eVar) {
        this.xBuf = new byte[4];
        b(eVar);
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int max = Math.max(0, i11);
        if (this.f62316a != 0) {
            int i13 = 0;
            while (true) {
                if (i13 >= max) {
                    i12 = i13;
                    break;
                }
                byte[] bArr2 = this.xBuf;
                int i14 = this.f62316a;
                int i15 = i14 + 1;
                this.f62316a = i15;
                int i16 = i13 + 1;
                bArr2[i14] = bArr[i13 + i10];
                if (i15 == 4) {
                    f(bArr2, 0);
                    this.f62316a = 0;
                    i12 = i16;
                    break;
                }
                i13 = i16;
            }
        }
        int i17 = ((max - i12) & (-4)) + i12;
        while (i12 < i17) {
            f(bArr, i10 + i12);
            i12 += 4;
        }
        while (i12 < max) {
            byte[] bArr3 = this.xBuf;
            int i18 = this.f62316a;
            this.f62316a = i18 + 1;
            bArr3[i18] = bArr[i12 + i10];
            i12++;
        }
        this.f62317b += max;
    }
}
