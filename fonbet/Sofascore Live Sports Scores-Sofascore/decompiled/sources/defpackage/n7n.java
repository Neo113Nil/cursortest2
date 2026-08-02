package defpackage;

import com.google.android.gms.internal.pal.zzaby;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n7n extends r7n {
    public final int d;

    public n7n(byte[] bArr, int i) {
        super(bArr);
        zzaby.t(0, i, bArr.length);
        this.d = i;
    }

    @Override // defpackage.r7n, com.google.android.gms.internal.pal.zzaby
    public final byte c(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            hc5.h(ljg.j(i, "Index < 0: "));
            return (byte) 0;
        }
        hc5.h(dmi.k(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // defpackage.r7n, com.google.android.gms.internal.pal.zzaby
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // defpackage.r7n, com.google.android.gms.internal.pal.zzaby
    public final int m() {
        return this.d;
    }

    @Override // defpackage.r7n, com.google.android.gms.internal.pal.zzaby
    public final void n(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }
}
