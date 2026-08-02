package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r {
    public int a;
    public int b;
    public int c;
    public int d;
    public Interpolator e;
    public boolean f;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.f = false;
        } else if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.c < 1) {
                a70.r("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i2 = this.c;
            if (i2 < 1) {
                a70.r("Scroll duration must be a positive number");
            } else {
                recyclerView.mViewFlinger.c(this.a, this.b, interpolator, i2);
                this.f = false;
            }
        }
    }

    public final void b(int i, int i2, Interpolator interpolator, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.e = interpolator;
        this.f = true;
    }
}
