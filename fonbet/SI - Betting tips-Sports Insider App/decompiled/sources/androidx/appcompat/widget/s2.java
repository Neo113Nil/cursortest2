package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class s2 implements androidx.appcompat.view.menu.d0 {
    public static final Method A;
    public static final Method B;
    public static final Method C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f917a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f918b;

    /* renamed from: c, reason: collision with root package name */
    public g2 f919c;

    /* renamed from: f, reason: collision with root package name */
    public int f922f;

    /* renamed from: g, reason: collision with root package name */
    public int f923g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f925i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f926k;

    /* renamed from: n, reason: collision with root package name */
    public a1.b f929n;

    /* renamed from: o, reason: collision with root package name */
    public View f930o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f931p;
    public AdapterView.OnItemSelectedListener q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f936v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f938x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f939y;

    /* renamed from: z, reason: collision with root package name */
    public final j0 f940z;

    /* renamed from: d, reason: collision with root package name */
    public final int f920d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f921e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f924h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f927l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f928m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final p2 f932r = new p2(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final r2 f933s = new r2(this);

    /* renamed from: t, reason: collision with root package name */
    public final q2 f934t = new q2(this);

    /* renamed from: u, reason: collision with root package name */
    public final p2 f935u = new p2(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f937w = new Rect();

    static {
        int i5 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i5 <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public s2(Context context, AttributeSet attributeSet, int i5, int i10) {
        int resourceId;
        this.f917a = context;
        this.f936v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10844p, i5, 0);
        this.f922f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f923g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f925i = true;
        }
        obtainStyledAttributes.recycle();
        j0 j0Var = new j0(context, attributeSet, i5, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f10847t, i5, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            j0Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        j0Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : h8.b.n(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f940z = j0Var;
        j0Var.setInputMethodMode(1);
    }

    @Override // androidx.appcompat.view.menu.d0
    public final boolean a() {
        return this.f940z.isShowing();
    }

    public final int b() {
        return this.f922f;
    }

    public final void d(int i5) {
        this.f922f = i5;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void dismiss() {
        j0 j0Var = this.f940z;
        j0Var.dismiss();
        j0Var.setContentView(null);
        this.f919c = null;
        this.f936v.removeCallbacks(this.f932r);
    }

    @Override // androidx.appcompat.view.menu.d0
    public final g2 f() {
        return this.f919c;
    }

    public final Drawable getBackground() {
        return this.f940z.getBackground();
    }

    public final void i(int i5) {
        this.f923g = i5;
        this.f925i = true;
    }

    public final int l() {
        if (this.f925i) {
            return this.f923g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        a1.b bVar = this.f929n;
        if (bVar == null) {
            this.f929n = new a1.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f918b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f918b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f929n);
        }
        g2 g2Var = this.f919c;
        if (g2Var != null) {
            g2Var.setAdapter(this.f918b);
        }
    }

    public g2 n(Context context, boolean z5) {
        return new g2(context, z5);
    }

    public final void o(int i5) {
        Drawable background = this.f940z.getBackground();
        if (background == null) {
            this.f921e = i5;
            return;
        }
        Rect rect = this.f937w;
        background.getPadding(rect);
        this.f921e = rect.left + rect.right + i5;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f940z.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void show() {
        int i5;
        int a7;
        int paddingBottom;
        g2 g2Var;
        g2 g2Var2 = this.f919c;
        Context context = this.f917a;
        j0 j0Var = this.f940z;
        if (g2Var2 == null) {
            g2 n9 = n(context, !this.f939y);
            this.f919c = n9;
            n9.setAdapter(this.f918b);
            this.f919c.setOnItemClickListener(this.f931p);
            this.f919c.setFocusable(true);
            this.f919c.setFocusableInTouchMode(true);
            this.f919c.setOnItemSelectedListener(new m2(r4, this));
            this.f919c.setOnScrollListener(this.f934t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.f919c.setOnItemSelectedListener(onItemSelectedListener);
            }
            j0Var.setContentView(this.f919c);
        }
        Drawable background = j0Var.getBackground();
        Rect rect = this.f937w;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i5 = rect.bottom + i10;
            if (!this.f925i) {
                this.f923g = -i10;
            }
        } else {
            rect.setEmpty();
            i5 = 0;
        }
        boolean z5 = j0Var.getInputMethodMode() == 2;
        View view = this.f930o;
        int i11 = this.f923g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    a7 = ((Integer) method.invoke(j0Var, view, Integer.valueOf(i11), Boolean.valueOf(z5))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a7 = j0Var.getMaxAvailableHeight(view, i11);
        } else {
            a7 = n2.a(j0Var, view, i11, z5);
        }
        int i12 = this.f920d;
        if (i12 == -1) {
            paddingBottom = a7 + i5;
        } else {
            int i13 = this.f921e;
            int a10 = this.f919c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a7);
            paddingBottom = a10 + (a10 > 0 ? this.f919c.getPaddingBottom() + this.f919c.getPaddingTop() + i5 : 0);
        }
        boolean z7 = j0Var.getInputMethodMode() == 2;
        j0Var.setWindowLayoutType(this.f924h);
        if (j0Var.isShowing()) {
            if (this.f930o.isAttachedToWindow()) {
                int i14 = this.f921e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.f930o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z7 ? paddingBottom : -1;
                    if (z7) {
                        j0Var.setWidth(this.f921e == -1 ? -1 : 0);
                        j0Var.setHeight(0);
                    } else {
                        j0Var.setWidth(this.f921e == -1 ? -1 : 0);
                        j0Var.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                j0Var.setOutsideTouchable(true);
                View view2 = this.f930o;
                int i15 = i14;
                int i16 = this.f922f;
                int i17 = this.f923g;
                int i18 = i15 < 0 ? -1 : i15;
                if (i12 < 0) {
                    i12 = -1;
                }
                j0Var.update(view2, i16, i17, i18, i12);
                return;
            }
            return;
        }
        int i19 = this.f921e;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = this.f930o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        j0Var.setWidth(i19);
        j0Var.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(j0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            o2.b(j0Var, true);
        }
        j0Var.setOutsideTouchable(true);
        j0Var.setTouchInterceptor(this.f933s);
        if (this.f926k) {
            j0Var.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(j0Var, this.f938x);
                } catch (Exception e7) {
                    io.sentry.android.core.w0.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            o2.a(j0Var, this.f938x);
        }
        j0Var.showAsDropDown(this.f930o, this.f922f, this.f923g, this.f927l);
        this.f919c.setSelection(-1);
        if ((!this.f939y || this.f919c.isInTouchMode()) && (g2Var = this.f919c) != null) {
            g2Var.setListSelectionHidden(true);
            g2Var.requestLayout();
        }
        if (this.f939y) {
            return;
        }
        this.f936v.post(this.f935u);
    }
}
