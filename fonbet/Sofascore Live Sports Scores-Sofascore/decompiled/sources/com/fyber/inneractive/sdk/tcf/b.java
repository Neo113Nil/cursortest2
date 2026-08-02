package com.fyber.inneractive.sdk.tcf;

import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b {
    public byte[] a = new byte[0];
    public int b;

    public final boolean a() {
        int i;
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0 || (i = this.b) >= bArr.length * 8) {
            IAlog.a("%s readBit failed: %s", "GppTcfBitReader", bArr == null ? "mBytes == null" : bArr.length == 0 ? "mBytes.length == 0" : "mCursor >= mBytes.length * BITS_PER_BYTE");
            return false;
        }
        int i2 = i / 8;
        if (i2 >= bArr.length) {
            IAlog.a("%s readBit failed: byteIdx >= mBytes.length", "GppTcfBitReader");
            return false;
        }
        boolean z = (bArr[i2] & (1 << (7 - (i % 8)))) != 0;
        this.b = i + 1;
        return z;
    }

    public final int a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (a()) {
                i2 |= 1 << ((i - 1) - i3);
            }
        }
        return i2;
    }

    public final void a(String str) {
        if (!str.trim().isEmpty()) {
            IAlog.a("%s decoding: %s", "GppTcfBitReader", str);
            this.b = 0;
            this.a = Base64.decode(str, 9);
            return;
        }
        a70.p("TC string cannot be empty");
    }
}
