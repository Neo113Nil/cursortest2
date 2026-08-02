package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class amo extends blo implements Runnable {
    public final Runnable h;

    public amo(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String g() {
        String obj = this.h.toString();
        return wt3.m("task=[", obj, new StringBuilder(obj.length() + 7), U3.j.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
