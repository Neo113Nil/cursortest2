package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    private int a;
    private final int[] b = new int[10];

    public void a(m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.d(i)) {
                a(i, mVar.a(i));
            }
        }
    }

    public int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public boolean d(int i) {
        return (this.a & (1 << i)) != 0;
    }

    public int d() {
        return Integer.bitCount(this.a);
    }

    public int b(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    public int c(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    public m a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    public int a(int i) {
        return this.b[i];
    }

    public void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }
}
