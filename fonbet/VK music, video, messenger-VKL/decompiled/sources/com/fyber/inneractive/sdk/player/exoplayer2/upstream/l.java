package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.facebook.soloader.MinElf;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class l implements b {
    public int b;
    public int c;
    public int d = 0;
    public a[] e = new a[100];
    public final a[] a = new a[1];

    public final synchronized void a(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            a();
        }
    }

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

    public final synchronized void a() {
        int i = this.b;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        int max = Math.max(0, ((i + MinElf.PN_XNUM) / 65536) - this.c);
        int i3 = this.d;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.e, max, i3, (Object) null);
        this.d = max;
    }
}
