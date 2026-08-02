package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kvc extends c4 implements Runnable {
    public final Runnable h;

    public kvc(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // defpackage.g4
    public final String j() {
        return "task=[" + this.h + U3.j.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
