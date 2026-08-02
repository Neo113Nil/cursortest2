package defpackage;

import com.google.android.gms.internal.cast.zzwa;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cbp extends zzwa implements Runnable {
    public final Runnable h;

    public cbp(Runnable runnable) {
        runnable.getClass();
        this.h = runnable;
    }

    @Override // com.google.android.gms.internal.cast.zzwa
    public final String e() {
        String obj = this.h.toString();
        return wt3.m("task=[", obj, new StringBuilder(obj.length() + 7), U3.j.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } catch (Throwable th) {
            if (iap.g.h0(this, null, new cap(th))) {
                zzwa.g(this);
            }
            throw th;
        }
    }
}
