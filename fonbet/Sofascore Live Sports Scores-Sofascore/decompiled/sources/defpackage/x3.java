package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x3 {
    public static final x3 d = new x3();
    public final Runnable a;
    public final Executor b;
    public x3 c;

    public x3() {
        this.a = null;
        this.b = null;
    }

    public x3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
