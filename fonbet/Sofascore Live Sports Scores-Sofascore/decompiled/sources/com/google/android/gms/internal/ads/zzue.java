package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.lnb;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzue extends zzcq {
    public int i;
    public boolean j;
    public int k;
    public long l;
    public byte[] n;
    public byte[] q;
    public int m = 0;
    public int o = 0;
    public int p = 0;

    public zzue() {
        byte[] bArr = zzfm.b;
        this.n = bArr;
        this.q = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void a(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            if (this.k != 0) {
                zzguk.f(this.o < this.n.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                        int i2 = this.i;
                        limit = (position2 / i2) * i2;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.o;
                int i4 = this.p;
                int i5 = i3 + i4;
                int length = this.n.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.n, i5, min);
                int i6 = this.p + min;
                this.p = i6;
                zzguk.f(i6 <= this.n.length);
                boolean z = limit < limit2 && position3 < i;
                j(z);
                if (z) {
                    this.k = 0;
                    this.m = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) > 1024) {
                        int i7 = this.i;
                        position = lnb.d(limit4, i7, i7, i7);
                        break;
                    }
                    limit4 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.k = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    e(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) {
        if (zzclVar.c == 2) {
            return zzclVar.a == -1 ? zzcl.e : zzclVar;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void g() {
        if (this.p > 0) {
            j(true);
            this.m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void h() {
        if (zzc()) {
            int i = this.b.b;
            int i2 = i + i;
            this.i = i2;
            int i3 = ((((int) ((100000 * r0.a) / 1000000)) / 2) / i2) * i2;
            int i4 = i3 + i3;
            if (this.n.length != i4) {
                this.n = new byte[i4];
                this.q = new byte[i4];
            }
        }
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.o = 0;
        this.p = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void i() {
        this.j = false;
        byte[] bArr = zzfm.b;
        this.n = bArr;
        this.q = bArr;
    }

    public final void j(boolean z) {
        int i;
        int i2;
        int i3 = this.p;
        int length = this.n.length;
        if (i3 != length) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.m == 0) {
            if (z) {
                l(i3, 3);
                i2 = i3;
            } else {
                zzguk.f(i3 >= (length >> 1));
                i2 = this.n.length >> 1;
                l(i2, 0);
            }
            i = i2;
        } else {
            int i4 = length >> 1;
            int i5 = i3 - i4;
            if (z) {
                int k = k(i5) + (this.n.length >> 1);
                l(k, 2);
                int i6 = i4 + i5;
                i = k;
                i2 = i6;
            } else {
                int k2 = k(i5);
                l(k2, 1);
                i = k2;
                i2 = i5;
            }
        }
        if (i2 % this.i != 0) {
            a70.r(zzgvb.a("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i2)));
            return;
        }
        zzguk.f(i3 >= i);
        this.p -= i2;
        int i7 = this.o + i2;
        this.o = i7;
        this.o = i7 % this.n.length;
        this.m = (i / this.i) + this.m;
        this.l += (i2 - i) / r2;
    }

    public final int k(int i) {
        int length = ((((int) ((2000000 * this.b.a) / 1000000)) - this.m) * this.i) - (this.n.length >> 1);
        zzguk.f(length >= 0);
        int min = (int) Math.min((i * 0.2f) + 0.5f, length);
        int i2 = this.i;
        return (min / i2) * i2;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        zzguk.a(this.p >= i);
        int i4 = this.o;
        if (i2 == 2) {
            int i5 = this.p;
            int i6 = i4 + i5;
            byte[] bArr = this.n;
            int length = bArr.length;
            byte[] bArr2 = this.q;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, bArr2, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, bArr2, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, bArr2, 0, i8);
                    System.arraycopy(this.n, 0, this.q, i8, i7);
                }
            }
        } else {
            int i9 = i4 + i;
            byte[] bArr3 = this.n;
            int length2 = bArr3.length;
            byte[] bArr4 = this.q;
            if (i9 <= length2) {
                System.arraycopy(bArr3, i4, bArr4, 0, i);
            } else {
                int i10 = length2 - i4;
                System.arraycopy(bArr3, i4, bArr4, 0, i10);
                System.arraycopy(this.n, 0, this.q, i10, i - i10);
            }
        }
        zzguk.c(i, "sizeToOutput is not aligned to frame size: %s", i % this.i == 0);
        zzguk.f(this.o < this.n.length);
        byte[] bArr5 = this.q;
        zzguk.c(i, "byteOutput size is not aligned to frame size %s", i % this.i == 0);
        if (i2 != 3) {
            for (int i11 = 0; i11 < i; i11 += 2) {
                int i12 = i11 + 1;
                int i13 = (bArr5[i12] << 8) | (bArr5[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (i2 == 0) {
                    i3 = ((((i11 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i11) / (i - 1)) / 1000);
                    }
                }
                int i14 = (i13 * i3) / 100;
                if (i14 >= 32767) {
                    bArr5[i11] = -1;
                    bArr5[i12] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr5[i11] = 0;
                    bArr5[i12] = Byte.MIN_VALUE;
                } else {
                    bArr5[i11] = (byte) (i14 & 255);
                    bArr5[i12] = (byte) (i14 >> 8);
                }
            }
        }
        e(i).put(bArr5, 0, i).flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzc() {
        return super.zzc() && this.j;
    }
}
