package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vzn implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = j0o.h;
        if (handler != null) {
            handler.post(j0o.i);
            j0o.h.postDelayed(j0o.j, 200L);
        }
    }
}
