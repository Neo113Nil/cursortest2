package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafy implements zzagi {
    public final zzj b;
    public final long c;
    public long d;
    public int f;
    public int g;
    public byte[] e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    public final byte[] a = new byte[4096];

    static {
        zzal.a("media3.extractor");
    }

    public zzafy(zzj zzjVar, long j, long j2) {
        this.b = zzjVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        zzafy zzafyVar;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            m(min);
            i4 = min;
        }
        if (i4 == 0) {
            zzafyVar = this;
            i4 = zzafyVar.n(bArr, i, i2, 0, true);
        } else {
            zzafyVar = this;
        }
        if (i4 != -1) {
            zzafyVar.d += i4;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void d(int i) {
        k(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final boolean e(int i, boolean z) {
        int min = Math.min(this.g, i);
        m(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = n(this.a, -i2, Math.min(i, i2 + 4096), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        return i2 != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!k(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void g(int i, int i2, byte[] bArr) {
        i(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void h(int i, int i2, byte[] bArr) {
        f(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final boolean i(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            m(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = n(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        return i4 != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final int j(int i, int i2, byte[] bArr) {
        zzafy zzafyVar;
        int min;
        l(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            zzafyVar = this;
            min = zzafyVar.n(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            zzafyVar.g += min;
        } else {
            zzafyVar = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(zzafyVar.e, zzafyVar.f, bArr, i, min);
        zzafyVar.f += min;
        return min;
    }

    public final boolean k(int i, boolean z) {
        l(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            zzafy zzafyVar = this;
            int i3 = i;
            boolean z2 = z;
            i2 = zzafyVar.n(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            zzafyVar.g = zzafyVar.f + i2;
            this = zzafyVar;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void l(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            String str = zzfm.a;
            this.e = Arrays.copyOf(this.e, Math.max(C.DEFAULT_BUFFER_SEGMENT_SIZE + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    public final void m(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    public final int n(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int b = this.b.b(i + i3, i2 - i3, bArr);
        if (b != -1) {
            return i3 + b;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        a70.q();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final int zzd() {
        zzafy zzafyVar;
        int min = Math.min(this.g, 1);
        m(min);
        if (min == 0) {
            zzafyVar = this;
            min = zzafyVar.n(this.a, 0, Math.min(1, 4096), 0, true);
        } else {
            zzafyVar = this;
        }
        if (min != -1) {
            zzafyVar.d += min;
        }
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzf(int i) {
        e(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzl() {
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final long zzm() {
        return this.d + this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final long zzn() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final long zzo() {
        return this.c;
    }
}
