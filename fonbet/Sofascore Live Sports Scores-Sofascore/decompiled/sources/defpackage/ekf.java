package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ekf implements View.OnTouchListener {
    public final et5 a;
    public final WeakReference b;
    public final WeakReference c;
    public final View.OnTouchListener d;

    public ekf(et5 et5Var, View view, View view2) {
        this.a = et5Var;
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        this.d = xsk.g(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        View view2 = (View) this.c.get();
        View view3 = (View) this.b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            k03.p(this.a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
