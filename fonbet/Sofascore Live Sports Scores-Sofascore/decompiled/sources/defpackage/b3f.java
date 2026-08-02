package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b3f implements ViewTreeObserver.OnPreDrawListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final AtomicReference b;
    public final le0 c;
    public final le0 d;

    public b3f(View view, le0 le0Var, le0 le0Var2) {
        this.b = new AtomicReference(view);
        this.c = le0Var;
        this.d = le0Var2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        le0 le0Var = this.c;
        Handler handler = this.a;
        handler.post(le0Var);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
