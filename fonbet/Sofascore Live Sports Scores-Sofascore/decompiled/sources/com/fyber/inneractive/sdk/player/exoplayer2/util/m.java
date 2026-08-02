package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m {
    public final byte[] a;
    public int b;
    public int c;
    public final int d;

    public m(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.d = length;
    }

    public final int a(int i) {
        int i2;
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        a();
        return i7;
    }

    public final boolean b() {
        byte[] bArr = this.a;
        int i = this.b;
        byte b = bArr[i];
        int i2 = this.c;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.c = i3;
        if (i3 == 8) {
            this.c = 0;
            this.b = i + 1;
        }
        a();
        return z;
    }

    public final void c(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        a();
    }

    public final void b(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public final void a() {
        int i = this.b;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.c == 0) {
                return;
            }
        }
        zzl.s();
    }
}
