package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ig0 extends g7a {
    public static volatile ig0 i;
    public static final hg0 j = new hg0(0);
    public final dt4 h = new dt4();

    public static ig0 G() {
        if (i != null) {
            return i;
        }
        synchronized (ig0.class) {
            try {
                if (i == null) {
                    i = new ig0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final boolean H() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
