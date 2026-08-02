package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhd {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public zzhd(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final boolean a() {
        int i = (this.a[this.c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d;
        c(1);
        return 1 == (i & 1);
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        int min = Math.min(i, 8 - this.d);
        byte[] bArr = this.a;
        int i4 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        c(i);
        return i5;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = (i - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        zzguk.f(z);
    }
}
