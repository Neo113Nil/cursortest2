package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.zbc;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uk0 implements Runnable {
    public static Handler f;
    public final /* synthetic */ zbc e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final pmb a = new pmb(this, new v35(this, 3));

    public uk0(zbc zbcVar) {
        this.e = zbcVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (uk0.class) {
            try {
                handler = f;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    f = handler;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new a8p(this, obj, false, 17));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
