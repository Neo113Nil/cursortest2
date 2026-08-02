package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ifg implements View.OnTouchListener {
    public final fl8 a;
    public float b = Float.NEGATIVE_INFINITY;
    public float c = Float.NEGATIVE_INFINITY;

    public ifg(fl8 fl8Var) {
        this.a = fl8Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
            return true;
        }
        if (valueOf == null || valueOf.intValue() != 1) {
            return false;
        }
        float abs = Math.abs(motionEvent.getRawX() - this.b);
        float abs2 = Math.abs(motionEvent.getRawY() - this.c);
        if (abs <= 40.0f && abs2 <= 40.0f) {
            this.a.invoke();
        }
        return true;
    }
}
