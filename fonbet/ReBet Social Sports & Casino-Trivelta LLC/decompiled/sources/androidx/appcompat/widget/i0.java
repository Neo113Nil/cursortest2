package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2088g0;

/* loaded from: classes.dex */
public class i0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static i0 f17315k;

    /* renamed from: l, reason: collision with root package name */
    public static i0 f17316l;

    /* renamed from: a, reason: collision with root package name */
    public final View f17317a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f17318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17319c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f17320d = new Runnable() { // from class: androidx.appcompat.widget.g0
        @Override // java.lang.Runnable
        public final void run() {
            i0.this.h(false);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f17321e = new Runnable() { // from class: androidx.appcompat.widget.h0
        @Override // java.lang.Runnable
        public final void run() {
            i0.this.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public int f17322f;

    /* renamed from: g, reason: collision with root package name */
    public int f17323g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f17324h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17325i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17326j;

    public i0(View view, CharSequence charSequence) {
        this.f17317a = view;
        this.f17318b = charSequence;
        this.f17319c = AbstractC2088g0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(i0 i0Var) {
        i0 i0Var2 = f17315k;
        if (i0Var2 != null) {
            i0Var2.b();
        }
        f17315k = i0Var;
        if (i0Var != null) {
            i0Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        i0 i0Var = f17315k;
        if (i0Var != null && i0Var.f17317a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new i0(view, charSequence);
            return;
        }
        i0 i0Var2 = f17316l;
        if (i0Var2 != null && i0Var2.f17317a == view) {
            i0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f17317a.removeCallbacks(this.f17320d);
    }

    public final void c() {
        this.f17326j = true;
    }

    public void d() {
        if (f17316l == this) {
            f17316l = null;
            j0 j0Var = this.f17324h;
            if (j0Var != null) {
                j0Var.c();
                this.f17324h = null;
                c();
                this.f17317a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f17315k == this) {
            f(null);
        }
        this.f17317a.removeCallbacks(this.f17321e);
    }

    public final void e() {
        this.f17317a.postDelayed(this.f17320d, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f17317a.isAttachedToWindow()) {
            f(null);
            i0 i0Var = f17316l;
            if (i0Var != null) {
                i0Var.d();
            }
            f17316l = this;
            this.f17325i = z10;
            j0 j0Var = new j0(this.f17317a.getContext());
            this.f17324h = j0Var;
            j0Var.e(this.f17317a, this.f17322f, this.f17323g, this.f17325i, this.f17318b);
            this.f17317a.addOnAttachStateChangeListener(this);
            if (this.f17325i) {
                j11 = 2500;
            } else {
                if ((AbstractC2082d0.L(this.f17317a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f17317a.removeCallbacks(this.f17321e);
            this.f17317a.postDelayed(this.f17321e, j11);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f17326j && Math.abs(x10 - this.f17322f) <= this.f17319c && Math.abs(y10 - this.f17323g) <= this.f17319c) {
            return false;
        }
        this.f17322f = x10;
        this.f17323g = y10;
        this.f17326j = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f17324h != null && this.f17325i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f17317a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f17317a.isEnabled() && this.f17324h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f17322f = view.getWidth() / 2;
        this.f17323g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
