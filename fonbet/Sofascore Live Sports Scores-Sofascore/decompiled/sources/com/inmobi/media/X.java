package com.inmobi.media;

import android.os.SystemClock;
import defpackage.xw3;
import defpackage.zzl;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X {
    public final C3328c0 a;
    public final C3586m0 b;

    public X(C3328c0 c3328c0, C3586m0 c3586m0) {
        c3328c0.getClass();
        c3586m0.getClass();
        this.a = c3328c0;
        this.b = c3586m0;
    }

    public final void a(W w) {
        w.getClass();
        if (w instanceof C3778tb) {
            C3328c0 c3328c0 = this.a;
            c3328c0.getClass();
            c3328c0.b = SystemClock.elapsedRealtime();
        } else if (w instanceof Yf) {
            C3328c0 c3328c02 = this.a;
            c3328c02.getClass();
            c3328c02.f = SystemClock.elapsedRealtime();
        } else {
            if (!(w instanceof C3553kj)) {
                zzl.b();
                return;
            }
            C3586m0 c3586m0 = this.b;
            Map map = ((C3553kj) w).a;
            c3586m0.getClass();
            map.getClass();
            xw3.L(c3586m0.a, null, null, new C3534k0(c3586m0, map, null), 3);
        }
    }
}
