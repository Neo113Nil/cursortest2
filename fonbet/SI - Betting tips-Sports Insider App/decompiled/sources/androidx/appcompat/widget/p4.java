package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.sports.insider.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static p4 f872k;

    /* renamed from: l, reason: collision with root package name */
    public static p4 f873l;

    /* renamed from: a, reason: collision with root package name */
    public final View f874a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f876c;

    /* renamed from: d, reason: collision with root package name */
    public final o4 f877d;

    /* renamed from: e, reason: collision with root package name */
    public final o4 f878e;

    /* renamed from: f, reason: collision with root package name */
    public int f879f;

    /* renamed from: g, reason: collision with root package name */
    public int f880g;

    /* renamed from: h, reason: collision with root package name */
    public q4 f881h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f882i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.o4] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.o4] */
    public p4(View view, CharSequence charSequence) {
        final int i5 = 0;
        this.f877d = new Runnable(this) { // from class: androidx.appcompat.widget.o4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p4 f860b;

            {
                this.f860b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f860b.c(false);
                        break;
                    default:
                        this.f860b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f878e = new Runnable(this) { // from class: androidx.appcompat.widget.o4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p4 f860b;

            {
                this.f860b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f860b.c(false);
                        break;
                    default:
                        this.f860b.a();
                        break;
                }
            }
        };
        this.f874a = view;
        this.f875b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.a1.f1281a;
        this.f876c = Build.VERSION.SDK_INT >= 28 ? androidx.core.view.k.m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p4 p4Var) {
        p4 p4Var2 = f872k;
        if (p4Var2 != null) {
            p4Var2.f874a.removeCallbacks(p4Var2.f877d);
        }
        f872k = p4Var;
        if (p4Var != null) {
            p4Var.f874a.postDelayed(p4Var.f877d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p4 p4Var = f873l;
        View view = this.f874a;
        if (p4Var == this) {
            f873l = null;
            q4 q4Var = this.f881h;
            if (q4Var != null) {
                View view2 = (View) q4Var.f893c;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q4Var.f892b).getSystemService("window")).removeView(view2);
                }
                this.f881h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                io.sentry.android.core.w0.d("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f872k == this) {
            b(null);
        }
        view.removeCallbacks(this.f878e);
    }

    public final void c(boolean z5) {
        int height;
        int i5;
        int i10;
        boolean z7;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j6;
        View view = this.f874a;
        if (view.isAttachedToWindow()) {
            b(null);
            p4 p4Var = f873l;
            if (p4Var != null) {
                p4Var.a();
            }
            f873l = this;
            this.f882i = z5;
            q4 q4Var = new q4(view.getContext());
            View view2 = (View) q4Var.f893c;
            Context context = (Context) q4Var.f892b;
            this.f881h = q4Var;
            int i13 = this.f879f;
            int i14 = this.f880g;
            boolean z10 = this.f882i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) q4Var.f895e;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) q4Var.f894d).setText(this.f875b);
            int[] iArr = (int[]) q4Var.f898h;
            int[] iArr2 = (int[]) q4Var.f897g;
            Rect rect = (Rect) q4Var.f896f;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i13 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i5 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i5 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i15 = i13;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                io.sentry.android.core.w0.d("TooltipPopup", "Cannot find app view");
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i5;
                    z7 = z10;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context.getResources();
                    i12 = 1;
                    i10 = i5;
                    z7 = z10;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i16;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams.x = (i16 + i15) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i12];
                int i18 = ((i17 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z7) {
                    if (i18 >= 0) {
                        layoutParams.y = i18;
                    } else {
                        layoutParams.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams.y = i19;
                } else {
                    layoutParams.y = i18;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f882i) {
                j6 = 2500;
            } else {
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j6 = j - longPressTimeout;
            }
            o4 o4Var = this.f878e;
            view.removeCallbacks(o4Var);
            view.postDelayed(o4Var, j6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f880g) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f881h == null || !this.f882i) {
            View view2 = this.f874a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.j = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f881h == null) {
                    int x10 = (int) motionEvent.getX();
                    int y5 = (int) motionEvent.getY();
                    if (!this.j) {
                        int abs = Math.abs(x10 - this.f879f);
                        int i5 = this.f876c;
                        if (abs <= i5) {
                        }
                    }
                    this.f879f = x10;
                    this.f880g = y5;
                    this.j = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f879f = view.getWidth() / 2;
        this.f880g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
