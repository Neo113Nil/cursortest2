package com.google.android.gms.internal.ads;

import defpackage.pmo;
import defpackage.qo2;
import defpackage.sw9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhky extends qo2 {
    @Override // defpackage.qo2
    public final int[] G(int i, int[] iArr) {
        int length = iArr.length;
        if (length != 6) {
            sw9.n("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] d = pmo.d((int[]) this.b, iArr);
        int[] iArr3 = pmo.a;
        int length2 = iArr3.length;
        System.arraycopy(iArr3, 0, iArr2, 0, length2);
        System.arraycopy(d, 0, iArr2, length2, 8);
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // defpackage.qo2
    public final int H() {
        return 24;
    }
}
