package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class qcb implements wfh {
    public static final Method A;
    public static final Method B;
    public final Context a;
    public ListAdapter b;
    public qc5 c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public q84 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final ec0 z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final ocb r = new ocb(this, 1);
    public final y38 s = new y38(this, 1);
    public final pcb t = new pcb(this);
    public final ocb u = new ocb(this, 0);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public qcb(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dkf.p, i, i2);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        ec0 ec0Var = new ec0(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dkf.t, i, i2);
        if (obtainStyledAttributes2.hasValue(2)) {
            ec0Var.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        ec0Var.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : td4.d0(resourceId, context));
        obtainStyledAttributes2.recycle();
        this.z = ec0Var;
        ec0Var.setInputMethodMode(1);
    }

    @Override // defpackage.wfh
    public final boolean a() {
        return this.z.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.wfh
    public final void dismiss() {
        ec0 ec0Var = this.z;
        ec0Var.dismiss();
        ec0Var.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final Drawable f() {
        return this.z.getBackground();
    }

    public final void i(int i) {
        this.g = i;
        this.i = true;
    }

    public final int l() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        q84 q84Var = this.n;
        if (q84Var == null) {
            this.n = new q84(this, 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(q84Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        qc5 qc5Var = this.c;
        if (qc5Var != null) {
            qc5Var.setAdapter(this.b);
        }
    }

    @Override // defpackage.wfh
    public final qc5 n() {
        return this.c;
    }

    public final void o(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public qc5 p(Context context, boolean z) {
        return new qc5(context, z);
    }

    public final void q(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.w;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }

    @Override // defpackage.wfh
    public final void show() {
        int i;
        int paddingBottom;
        qc5 qc5Var;
        qc5 qc5Var2 = this.c;
        Context context = this.a;
        int i2 = 1;
        ec0 ec0Var = this.z;
        if (qc5Var2 == null) {
            qc5 p = p(context, !this.y);
            this.c = p;
            p.setAdapter(this.b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new rc5(this, i2));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            ec0Var.setContentView(this.c);
        }
        Drawable background = ec0Var.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.i) {
                this.g = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int a = mcb.a(ec0Var, this.o, this.g, ec0Var.getInputMethodMode() == 2);
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = a + i;
        } else {
            int i5 = this.e;
            int a2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a);
            paddingBottom = a2 + (a2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = ec0Var.getInputMethodMode() == 2;
        ec0Var.setWindowLayoutType(this.h);
        if (ec0Var.isShowing()) {
            if (this.o.isAttachedToWindow()) {
                int i6 = this.e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z ? paddingBottom : -1;
                    int i7 = this.e;
                    if (z) {
                        ec0Var.setWidth(i7 == -1 ? -1 : 0);
                        ec0Var.setHeight(0);
                    } else {
                        ec0Var.setWidth(i7 == -1 ? -1 : 0);
                        ec0Var.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                ec0Var.setOutsideTouchable(true);
                int i8 = i6;
                View view = this.o;
                int i9 = this.f;
                int i10 = this.g;
                int i11 = i8 < 0 ? -1 : i8;
                if (i4 < 0) {
                    i4 = -1;
                }
                ec0Var.update(view, i9, i10, i11, i4);
                return;
            }
            return;
        }
        int i12 = this.e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        ec0Var.setWidth(i12);
        ec0Var.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(ec0Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            ncb.b(ec0Var, true);
        }
        ec0Var.setOutsideTouchable(true);
        ec0Var.setTouchInterceptor(this.s);
        if (this.k) {
            ec0Var.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(ec0Var, this.x);
                } catch (Exception unused2) {
                }
            }
        } else {
            ncb.a(ec0Var, this.x);
        }
        ec0Var.showAsDropDown(this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (qc5Var = this.c) != null) {
            qc5Var.setListSelectionHidden(true);
            qc5Var.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }
}
