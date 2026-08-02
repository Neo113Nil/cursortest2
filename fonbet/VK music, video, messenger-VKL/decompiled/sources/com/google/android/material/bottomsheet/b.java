package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.b33;
import xsna.b88;
import xsna.bqx0;
import xsna.c88;
import xsna.d88;
import xsna.dm10;
import xsna.iut0;
import xsna.oek0;
import xsna.oqx0;
import xsna.pl10;
import xsna.ppx0;
import xsna.tko;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes13.dex */
public class b extends b33 {
    public BottomSheetBehavior<FrameLayout> h;
    public FrameLayout i;
    public CoordinatorLayout j;
    public FrameLayout k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public C0117b p;
    public final boolean q;

    @Nullable
    public pl10 r;

    @NonNull
    public final a s;

    /* compiled from: BottomSheetDialog.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    public static class C0117b extends BottomSheetBehavior.d {

        @Nullable
        public final Boolean a;

        @NonNull
        public final bqx0 b;

        @Nullable
        public Window c;
        public boolean d;

        public C0117b(View view, bqx0 bqx0Var) {
            ColorStateList backgroundTintList;
            this.b = bqx0Var;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.L(view).j;
            if (materialShapeDrawable != null) {
                backgroundTintList = materialShapeDrawable.getFillColor();
            } else {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                backgroundTintList = view.getBackgroundTintList();
            }
            if (backgroundTintList != null) {
                this.a = Boolean.valueOf(dm10.f(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList d = tko.d(view.getBackground());
            Integer valueOf = d != null ? Integer.valueOf(d.getDefaultColor()) : null;
            if (valueOf != null) {
                this.a = Boolean.valueOf(dm10.f(valueOf.intValue()));
            } else {
                this.a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void a(@NonNull View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(@NonNull View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, @NonNull View view) {
            d(view);
        }

        public final void d(View view) {
            int top = view.getTop();
            bqx0 bqx0Var = this.b;
            if (top < bqx0Var.d()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                    oek0 oek0Var = new oek0(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), bqx0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    boolean z = this.d;
                    oek0 oek0Var2 = new oek0(window2.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    (i2 >= 35 ? new oqx0.f(window2, oek0Var2) : i2 >= 30 ? new oqx0.d(window2, oek0Var2) : new oqx0.c(window2, oek0Var2)).f(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(@Nullable Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.d = new oqx0(window, window.getDecorView()).a.d();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(@NonNull Context context, int i) {
        super(context, i);
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R$attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R$style.Theme_Design_Light_BottomSheetDialog;
        }
        this.m = true;
        this.n = true;
        this.s = new a();
        m(1);
        this.q = getContext().getTheme().obtainStyledAttributes(new int[]{R$attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior<FrameLayout> o = o();
        if (!this.l || o.M == 5) {
            super.cancel();
        } else {
            o.X(5);
        }
    }

    public final void n() {
        if (this.i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R$layout.design_bottom_sheet_dialog, null);
            this.i = frameLayout;
            this.j = (CoordinatorLayout) frameLayout.findViewById(R$id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.i.findViewById(R$id.design_bottom_sheet);
            this.k = frameLayout2;
            BottomSheetBehavior<FrameLayout> L = BottomSheetBehavior.L(frameLayout2);
            this.h = L;
            L.D(this.s);
            this.h.V(this.m);
            this.r = new pl10(this.h, this.k);
        }
    }

    @NonNull
    public final BottomSheetBehavior<FrameLayout> o() {
        if (this.h == null) {
            n();
        }
        return this.h;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.q && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            ppx0.b(window, !z);
            C0117b c0117b = this.p;
            if (c0117b != null) {
                c0117b.e(window);
            }
        }
        pl10 pl10Var = this.r;
        if (pl10Var == null) {
            return;
        }
        View view = pl10Var.c;
        pl10.a aVar = pl10Var.a;
        if (this.m) {
            if (aVar != null) {
                aVar.b(pl10Var.b, view, false);
            }
        } else if (aVar != null) {
            aVar.c(view);
        }
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        pl10.a aVar;
        C0117b c0117b = this.p;
        if (c0117b != null) {
            c0117b.e(null);
        }
        pl10 pl10Var = this.r;
        if (pl10Var == null || (aVar = pl10Var.a) == null) {
            return;
        }
        aVar.c(pl10Var.c);
    }

    @Override // xsna.y8i, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.h;
        if (bottomSheetBehavior == null || bottomSheetBehavior.M != 5) {
            return;
        }
        bottomSheetBehavior.X(4);
    }

    public final FrameLayout p(@Nullable View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        n();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.i.findViewById(R$id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.q) {
            FrameLayout frameLayout = this.k;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(frameLayout, aVar);
        }
        this.k.removeAllViews();
        if (layoutParams == null) {
            this.k.addView(view);
        } else {
            this.k.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R$id.touch_outside).setOnClickListener(new b88(this));
        iut0.q(this.k, new c88(this));
        this.k.setOnTouchListener(new d88());
        return this.i;
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        pl10 pl10Var;
        super.setCancelable(z);
        if (this.m != z) {
            this.m = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.V(z);
            }
            if (getWindow() == null || (pl10Var = this.r) == null) {
                return;
            }
            View view = pl10Var.c;
            pl10.a aVar = pl10Var.a;
            if (this.m) {
                if (aVar != null) {
                    aVar.b(pl10Var.b, view, false);
                }
            } else if (aVar != null) {
                aVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.m) {
            this.m = true;
        }
        this.n = z;
        this.o = true;
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(p(null, i, null));
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(p(view, 0, null));
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(p(view, 0, layoutParams));
    }

    /* compiled from: BottomSheetDialog.java */
    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, @NonNull View view) {
            if (i == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(@NonNull View view, float f) {
        }
    }
}
