package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dap {
    public static final dap d = new dap();
    public final Runnable a;
    public final Executor b;
    public dap c;

    public dap() {
        this.a = null;
        this.b = null;
    }

    public dap(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
