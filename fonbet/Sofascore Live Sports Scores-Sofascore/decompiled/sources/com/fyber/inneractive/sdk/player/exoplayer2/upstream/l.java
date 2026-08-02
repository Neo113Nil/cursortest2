package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l implements b {
    public int b;
    public int c;
    public int d = 0;
    public a[] e = new a[100];
    public final a[] a = new a[1];

    public final synchronized void a(a[] aVarArr) {
        try {
            int i = this.d;
            int length = aVarArr.length + i;
            a[] aVarArr2 = this.e;
            if (length >= aVarArr2.length) {
                this.e = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.a;
                if (bArr != null && bArr.length != 65536) {
                    throw new IllegalArgumentException();
                }
                a[] aVarArr3 = this.e;
                int i2 = this.d;
                this.d = i2 + 1;
                aVarArr3[i2] = aVar;
            }
            this.c -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            a();
        }
    }

    public final synchronized void a() {
        int i = this.b;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        int max = Math.max(0, ((i + 65535) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.c);
        int i3 = this.d;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.e, max, i3, (Object) null);
        this.d = max;
    }
}
