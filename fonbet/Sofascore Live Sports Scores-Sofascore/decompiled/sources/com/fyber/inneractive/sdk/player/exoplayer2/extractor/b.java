package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.hbo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public static final byte[] g = new byte[4096];
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a;
    public final long b;
    public long c;
    public byte[] d = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    public int e;
    public int f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, long j, long j2) {
        this.a = hVar;
        this.c = j;
        this.b = j2;
    }

    public final boolean a(int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (i2 > bArr.length) {
            int length = bArr.length * 2;
            int i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE + i2;
            int i4 = z.a;
            this.d = Arrays.copyOf(this.d, Math.max(i3, Math.min(length, i2 + 524288)));
        }
        int min = Math.min(this.f - this.e, i);
        while (min < i) {
            b bVar = this;
            int i5 = i;
            boolean z2 = z;
            min = bVar.a(this.d, this.e, i5, min, z2);
            if (min == -1) {
                return false;
            }
            this = bVar;
            i = i5;
            z = z2;
        }
        b bVar2 = this;
        int i6 = bVar2.e + i;
        bVar2.e = i6;
        bVar2.f = Math.max(bVar2.f, i6);
        return true;
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.d, 0, bArr, i, min);
            b(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.c += i3;
        }
        return i3 != -1;
    }

    public final void b(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    public final void a(int i) {
        int min = Math.min(this.f, i);
        b(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = a(g, -i2, Math.min(i, i2 + 4096), i2, false);
        }
        if (i2 != -1) {
            this.c += i2;
        }
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.a.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            a70.q();
            return 0;
        }
        hbo.k();
        return 0;
    }
}
