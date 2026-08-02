package com.inmobi.media;

import android.util.Base64;
import defpackage.joa;
import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class I2 {
    public BitSet a;

    public final void a(String str) {
        byte[] bArr;
        BitSet bitSet;
        str.getClass();
        try {
            bArr = Base64.decode(str, 0);
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
            bArr = null;
        }
        if (bArr != null) {
            F5.a.getClass();
            if (F5.w()) {
                bitSet = BitSet.valueOf(bArr);
            } else {
                BitSet bitSet2 = new BitSet(bArr.length * 8);
                int i = 0;
                for (byte b : bArr) {
                    int i2 = 0;
                    while (i2 < 8) {
                        boolean z = true;
                        int i3 = i + 1;
                        if (((b >> ((byte) i2)) & 1) != 1) {
                            z = false;
                        }
                        bitSet2.set(i, z);
                        i2++;
                        i = i3;
                    }
                }
                bitSet = bitSet2;
            }
            this.a = bitSet;
        }
    }
}
