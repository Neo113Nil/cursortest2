package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wtk implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final HashMap d = new HashMap();
    public final WeakReference a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean c = new AtomicBoolean(false);

    public wtk(Activity activity) {
        this.a = new WeakReference(activity);
    }

    public final void a() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            t4f t4fVar = new t4f(this, 23);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                t4fVar.run();
            } else {
                this.b.post(t4fVar);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
