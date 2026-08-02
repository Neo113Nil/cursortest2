package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wbd extends gsg {
    public static final bag b = new bag("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory a = b;

    @Override // defpackage.gsg
    public final fsg a() {
        return new xbd(this.a);
    }
}
