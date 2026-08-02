package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzui extends zzcq {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = zzfm.b;
    public int n;
    public long o;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l <= 0) {
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer e = e(length);
            int i3 = this.n;
            String str = zzfm.a;
            int max = Math.max(0, Math.min(length, i3));
            e.put(this.m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i2));
            byteBuffer.limit(byteBuffer.position() + max2);
            e.put(byteBuffer);
            byteBuffer.limit(limit);
            int i4 = i2 - max2;
            int i5 = this.n - max;
            this.n = i5;
            byte[] bArr = this.m;
            System.arraycopy(bArr, max, bArr, 0, i5);
            byteBuffer.get(this.m, this.n, i4);
            this.n += i4;
            e.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final long c(long j) {
        return Math.max(0L, j - zzfm.v(this.b.a, this.j + this.i));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) {
        if (!zzfm.d(zzclVar.c)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? zzcl.e : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void g() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void i() {
        this.m = zzfm.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int i;
        if (super.zzg() && (i = this.n) > 0) {
            e(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        return super.zzg() && this.n == 0;
    }
}
