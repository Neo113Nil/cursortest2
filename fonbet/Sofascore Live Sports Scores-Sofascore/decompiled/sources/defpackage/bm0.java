package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bm0 {
    public static final Logger b = Logger.getLogger(bm0.class.getName());
    public final AtomicLong a;

    public bm0(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        z1a.r("value must be positive", j > 0);
        atomicLong.set(j);
    }
}
