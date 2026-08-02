package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ckj implements yfc {
    public vec a;
    public efc b;
    public final /* synthetic */ Toolbar c;

    public ckj(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.yfc
    public final boolean c(sji sjiVar) {
        return false;
    }

    @Override // defpackage.yfc
    public final boolean d(efc efcVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof t03) {
            ((t03) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        efcVar.C = false;
        efcVar.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.yfc
    public final void f() {
        if (this.b != null) {
            vec vecVar = this.a;
            if (vecVar != null) {
                int size = vecVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            d(this.b);
        }
    }

    @Override // defpackage.yfc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.yfc
    public final boolean h(efc efcVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = efcVar.getActionView();
        toolbar.i = actionView;
        this.b = efcVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            dkj h = Toolbar.h();
            h.a = (toolbar.n & 112) | 8388611;
            h.b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((dkj) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        efcVar.C = true;
        efcVar.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof t03) {
            ((t03) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.yfc
    public final void i(Context context, vec vecVar) {
        efc efcVar;
        vec vecVar2 = this.a;
        if (vecVar2 != null && (efcVar = this.b) != null) {
            vecVar2.d(efcVar);
        }
        this.a = vecVar;
    }

    @Override // defpackage.yfc
    public final void b(vec vecVar, boolean z) {
    }
}
