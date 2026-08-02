package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y70 {
    public static final ThreadLocal i = new ThreadLocal();
    public final f4a e;
    public w70 h;
    public final fhh a = new fhh(0);
    public final ArrayList b = new ArrayList();
    public final dad c = new dad(this, 6);
    public final y2 d = new y2(this, 12);
    public boolean f = false;
    public float g = 1.0f;

    public y70(f4a f4aVar) {
        this.e = f4aVar;
    }

    public final void a(d0i d0iVar) {
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.e.b).postFrameCallback(new x70(0, this.d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                final w70 w70Var = this.h;
                if (w70Var == null) {
                    w70Var = new w70();
                    w70Var.b = this;
                    this.h = w70Var;
                }
                if (((v70) w70Var.a) == null) {
                    ValueAnimator.DurationScaleChangeListener durationScaleChangeListener = new ValueAnimator.DurationScaleChangeListener() { // from class: v70
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f) {
                            ((y70) w70.this.b).g = f;
                        }
                    };
                    w70Var.a = durationScaleChangeListener;
                    ValueAnimator.registerDurationScaleChangeListener(durationScaleChangeListener);
                }
            }
        }
        if (arrayList.contains(d0iVar)) {
            return;
        }
        arrayList.add(d0iVar);
    }
}
