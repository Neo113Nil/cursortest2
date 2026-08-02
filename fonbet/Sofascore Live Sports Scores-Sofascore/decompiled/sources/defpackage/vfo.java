package defpackage;

import com.google.android.gms.internal.fido.zzgx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vfo extends xgo {
    public final int d;
    public final int e;

    public vfo(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgx.q(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.xgo, com.google.android.gms.internal.fido.zzgx
    public final byte c(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[this.d + i];
        }
        if (i < 0) {
            hc5.h(ljg.j(i, "Index < 0: "));
            return (byte) 0;
        }
        hc5.h(dmi.k(i, i2, "Index > length: ", ", "));
        return (byte) 0;
    }

    @Override // defpackage.xgo, com.google.android.gms.internal.fido.zzgx
    public final byte d(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.xgo, com.google.android.gms.internal.fido.zzgx
    public final int m() {
        return this.e;
    }

    @Override // defpackage.xgo, com.google.android.gms.internal.fido.zzgx
    public final void n(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // defpackage.xgo
    public final int t() {
        return this.d;
    }
}
