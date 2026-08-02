package com.inmobi.media;

import java.util.BitSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Q6 {
    public final I2 a;

    public Q6(String str) {
        str.getClass();
        I2 i2 = new I2();
        this.a = i2;
        i2.a(str);
    }

    public final boolean a(boolean z) {
        BitSet bitSet = this.a.a;
        return bitSet != null ? bitSet.get(0) : z;
    }
}
