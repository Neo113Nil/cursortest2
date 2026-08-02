package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.ji6;
import defpackage.us3;
import defpackage.xh6;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends us3 {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.us3
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us3
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ji6) view2;
        boolean z = ((FloatingActionButton) obj).o.b;
        int i = this.a;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).o.b;
        this.a = z2 ? 1 : 2;
        w((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        ji6 ji6Var;
        if (!view.isLaidOut()) {
            ArrayList k = coordinatorLayout.k(view);
            int size = k.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    ji6Var = null;
                    break;
                }
                View view2 = (View) k.get(i2);
                if (f(view, view2)) {
                    ji6Var = (ji6) view2;
                    break;
                }
                i2++;
            }
            if (ji6Var != null) {
                boolean z = ((FloatingActionButton) ji6Var).o.b;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new xh6(this, view, i4, ji6Var));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
