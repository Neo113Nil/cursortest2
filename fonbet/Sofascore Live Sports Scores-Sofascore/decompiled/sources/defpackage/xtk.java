package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class xtk extends us3 {
    public ytk a;
    public int b = 0;

    public xtk() {
    }

    @Override // defpackage.us3
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        ytk ytkVar = this.a;
        if (ytkVar == null) {
            ytkVar = new ytk(view);
            this.a = ytkVar;
        }
        View view2 = ytkVar.a;
        ytkVar.b = view2.getTop();
        ytkVar.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int w() {
        ytk ytkVar = this.a;
        if (ytkVar != null) {
            return ytkVar.d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(i, view);
    }

    public xtk(int i) {
    }
}
