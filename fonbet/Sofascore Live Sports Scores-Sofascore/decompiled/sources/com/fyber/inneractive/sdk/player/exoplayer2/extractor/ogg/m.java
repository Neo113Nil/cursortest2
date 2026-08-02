package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public m(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final int a(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        b(i);
        return i5;
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.c + i2;
        this.c = i3;
        int i4 = (i - (i2 * 8)) + this.d;
        this.d = i4;
        if (i4 > 7) {
            i3++;
            this.c = i3;
            i4 -= 8;
            this.d = i4;
        }
        if (i3 >= 0) {
            int i5 = this.b;
            if (i3 < i5) {
                return;
            }
            if (i3 == i5 && i4 == 0) {
                return;
            }
        }
        zzl.s();
    }

    public final boolean a() {
        boolean z = (((this.a[this.c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & 1) == 1;
        b(1);
        return z;
    }
}
