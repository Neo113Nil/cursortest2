package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class cgh extends wb0 {
    public SideSheetBehavior g;
    public FrameLayout h;
    public CoordinatorLayout i;
    public FrameLayout j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public hcc o;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.g == null) {
            f();
        }
        if (this.g != null) {
            super.cancel();
        } else {
            a70.r("The view is not associated with SideSheetBehavior");
        }
    }

    public final void f() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.m3_side_sheet_dialog, null);
            this.h = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.m3_side_sheet);
            this.j = frameLayout2;
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (!(layoutParams instanceof xs3)) {
                a70.p("The view is not a child of CoordinatorLayout");
                return;
            }
            us3 us3Var = ((xs3) layoutParams).a;
            if (!(us3Var instanceof SideSheetBehavior)) {
                a70.p("The view is not associated with SideSheetBehavior");
                return;
            }
            SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) us3Var;
            this.g = sideSheetBehavior;
            sideSheetBehavior.v.add(new bgh(this));
            this.o = new hcc(this.g, this.j);
        }
    }

    public final void g() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.j) == null || !(frameLayout.getLayoutParams() instanceof xs3)) {
            return;
        }
        window.setWindowAnimations(Gravity.getAbsoluteGravity(((xs3) this.j.getLayoutParams()).c, this.j.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        if (this.h == null) {
            f();
        }
        this.i = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) this.i, false);
        }
        if (this.j == null) {
            f();
        }
        FrameLayout frameLayout = this.j;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        this.i.findViewById(R.id.touch_outside).setOnClickListener(new cne(this, 21));
        if (this.j == null) {
            f();
        }
        bsk.q(this.j, new euk(this, 8));
        return this.h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        boolean z = this.n;
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.setFitsSystemWindows(z);
        }
        CoordinatorLayout coordinatorLayout = this.i;
        if (coordinatorLayout != null) {
            coordinatorLayout.setFitsSystemWindows(z);
        }
        Window window = getWindow();
        if (window != null) {
            bea.L(window, z);
        }
        hcc hccVar = this.o;
        if (hccVar == null) {
            return;
        }
        View view = (View) hccVar.d;
        boolean z2 = this.k;
        jyb jybVar = (jyb) hccVar.b;
        if (z2) {
            if (jybVar != null) {
                jybVar.b((iyb) hccVar.c, view, false);
            }
        } else if (jybVar != null) {
            jybVar.c(view);
        }
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        jyb jybVar;
        super.onDetachedFromWindow();
        hcc hccVar = this.o;
        if (hccVar == null || (jybVar = (jyb) hccVar.b) == null) {
            return;
        }
        jybVar.c((View) hccVar.d);
    }

    @Override // defpackage.cc3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        SideSheetBehavior sideSheetBehavior = this.g;
        if (sideSheetBehavior == null || sideSheetBehavior.h != 5) {
            return;
        }
        sideSheetBehavior.w(3);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        hcc hccVar;
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
        }
        if (getWindow() == null || (hccVar = this.o) == null) {
            return;
        }
        View view = (View) hccVar.d;
        boolean z2 = this.k;
        jyb jybVar = (jyb) hccVar.b;
        if (z2) {
            if (jybVar != null) {
                jybVar.b((iyb) hccVar.c, view, false);
            }
        } else if (jybVar != null) {
            jybVar.c(view);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
