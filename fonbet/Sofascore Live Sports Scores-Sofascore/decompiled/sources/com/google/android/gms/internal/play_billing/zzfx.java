package com.google.android.gms.internal.play_billing;

import defpackage.a70;
import defpackage.d1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfx extends zzfg {
    public d1l a;

    private zzfx() {
        throw null;
    }

    public static int c(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int d(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void a() {
        if (b() > 0) {
            a70.r("Did not write as much data as expected.");
        } else {
            if (b() >= 0) {
                return;
            }
            a70.r("Wrote more data than expected.");
        }
    }

    public abstract int b();
}
