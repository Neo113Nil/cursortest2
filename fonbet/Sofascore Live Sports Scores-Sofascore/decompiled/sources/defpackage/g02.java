package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g02 extends wb0 {
    public BottomSheetBehavior g;
    public FrameLayout h;
    public CoordinatorLayout i;
    public FrameLayout j;
    public boolean k;
    public boolean l;
    public boolean m;
    public f02 n;
    public boolean o;
    public hcc p;
    public e02 q;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.g == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.j = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout2);
            this.g = C;
            e02 e02Var = this.q;
            ArrayList arrayList = C.a0;
            if (!arrayList.contains(e02Var)) {
                arrayList.add(e02Var);
            }
            this.g.K(this.k);
            this.p = new hcc(this.g, this.j);
        }
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            FrameLayout frameLayout = this.h;
            sa0 sa0Var = new sa0(this, 4);
            WeakHashMap weakHashMap = bsk.a;
            srk.c(frameLayout, sa0Var);
        }
        this.j.removeAllViews();
        FrameLayout frameLayout2 = this.j;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        int i2 = 2;
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new cb(this, i2));
        bsk.q(this.j, new euk(this, i2));
        this.j.setOnTouchListener(new l71(1));
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z;
        FrameLayout frameLayout;
        CoordinatorLayout coordinatorLayout;
        f02 f02Var;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.o) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                    frameLayout = this.h;
                    if (frameLayout != null) {
                        frameLayout.setFitsSystemWindows(!z);
                    }
                    coordinatorLayout = this.i;
                    if (coordinatorLayout != null) {
                        coordinatorLayout.setFitsSystemWindows(!z);
                    }
                    bea.L(window, !z);
                    f02Var = this.n;
                    if (f02Var != null) {
                        f02Var.e(window);
                    }
                }
            }
            z = false;
            frameLayout = this.h;
            if (frameLayout != null) {
            }
            coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
            }
            bea.L(window, !z);
            f02Var = this.n;
            if (f02Var != null) {
            }
        }
        hcc hccVar = this.p;
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
    public final void onCreate(Bundle bundle) {
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
    public final void onDetachedFromWindow() {
        jyb jybVar;
        f02 f02Var = this.n;
        if (f02Var != null) {
            f02Var.e(null);
        }
        hcc hccVar = this.p;
        if (hccVar == null || (jybVar = (jyb) hccVar.b) == null) {
            return;
        }
        jybVar.c((View) hccVar.d);
    }

    @Override // defpackage.cc3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.M(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        hcc hccVar;
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.K(z);
            }
            if (getWindow() == null || (hccVar = this.p) == null) {
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
        super.setContentView(g(view, 0, null));
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}
