package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w2o implements View.OnTouchListener {
    public b2p a;
    public b2p b;

    public w2o() {
        u1p u1pVar = u1p.a;
        this.a = u1pVar;
        this.b = u1pVar;
    }

    public final v4p a() {
        m3p m3pVar = q3p.b;
        k3p k3pVar = new k3p();
        if (this.a.d()) {
            k3pVar.b((MotionEvent) this.a.g());
        }
        if (this.b.d()) {
            k3pVar.b((MotionEvent) this.b.g());
        }
        k3pVar.c = true;
        return q3p.v(k3pVar.b, k3pVar.a);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.a = b2p.k(MotionEvent.obtain(motionEvent));
            return false;
        }
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        this.b = b2p.k(MotionEvent.obtain(motionEvent));
        return false;
    }
}
