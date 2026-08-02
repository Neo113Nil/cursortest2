package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uuk {
    public Interpolator c;
    public vuk d;
    public boolean e;
    public long b = -1;
    public final nkj f = new nkj(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((tuk) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            tuk tukVar = (tuk) it.next();
            long j = this.b;
            if (j >= 0) {
                tukVar.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) tukVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                tukVar.d(this.f);
            }
            View view2 = (View) tukVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
