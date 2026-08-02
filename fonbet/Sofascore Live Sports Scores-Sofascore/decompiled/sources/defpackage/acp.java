package defpackage;

import com.google.android.gms.internal.cast.zzxk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class acp extends dcp {
    public final int d;

    public acp(byte[] bArr) {
        super(bArr);
        zzxk.h(bArr.length);
        this.d = 47;
    }

    @Override // defpackage.dcp, com.google.android.gms.internal.cast.zzxk
    public final byte c(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[i];
        }
        if (i < 0) {
            hc5.h(me4.g(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
            return (byte) 0;
        }
        hc5.h(x5n.n(new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length()), i, "Index > length: ", i2, ", "));
        return (byte) 0;
    }

    @Override // defpackage.dcp, com.google.android.gms.internal.cast.zzxk
    public final byte d(int i) {
        return this.c[i];
    }

    @Override // defpackage.dcp, com.google.android.gms.internal.cast.zzxk
    public final int m() {
        return this.d;
    }
}
