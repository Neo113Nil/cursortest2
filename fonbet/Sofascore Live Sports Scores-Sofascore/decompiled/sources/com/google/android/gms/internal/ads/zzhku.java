package com.google.android.gms.internal.ads;

import defpackage.pmo;
import defpackage.qo2;
import defpackage.sw9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhku extends qo2 {
    @Override // defpackage.qo2
    public final int[] G(int i, int[] iArr) {
        int length = iArr.length;
        if (length != 3) {
            sw9.n("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = (int[]) this.b;
        int[] iArr4 = pmo.a;
        int length2 = iArr4.length;
        System.arraycopy(iArr4, 0, iArr2, 0, length2);
        System.arraycopy(iArr3, 0, iArr2, length2, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // defpackage.qo2
    public final int H() {
        return 12;
    }
}
