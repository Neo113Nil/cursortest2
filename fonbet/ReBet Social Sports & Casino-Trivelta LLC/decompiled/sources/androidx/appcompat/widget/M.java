package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.lang.reflect.Method;
import l.AbstractC5335a;

/* loaded from: classes.dex */
public class M implements r.f {

    /* renamed from: G, reason: collision with root package name */
    public static Method f17015G;

    /* renamed from: H, reason: collision with root package name */
    public static Method f17016H;

    /* renamed from: A, reason: collision with root package name */
    public Runnable f17017A;

    /* renamed from: B, reason: collision with root package name */
    public final Handler f17018B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f17019C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f17020D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17021E;

    /* renamed from: F, reason: collision with root package name */
    public PopupWindow f17022F;

    /* renamed from: a, reason: collision with root package name */
    public Context f17023a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f17024b;

    /* renamed from: c, reason: collision with root package name */
    public J f17025c;

    /* renamed from: d, reason: collision with root package name */
    public int f17026d;

    /* renamed from: e, reason: collision with root package name */
    public int f17027e;

    /* renamed from: f, reason: collision with root package name */
    public int f17028f;

    /* renamed from: g, reason: collision with root package name */
    public int f17029g;

    /* renamed from: h, reason: collision with root package name */
    public int f17030h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17031i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17032j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17033k;

    /* renamed from: l, reason: collision with root package name */
    public int f17034l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17035m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17036n;

    /* renamed from: o, reason: collision with root package name */
    public int f17037o;

    /* renamed from: p, reason: collision with root package name */
    public View f17038p;

    /* renamed from: q, reason: collision with root package name */
    public int f17039q;

    /* renamed from: r, reason: collision with root package name */
    public DataSetObserver f17040r;

    /* renamed from: s, reason: collision with root package name */
    public View f17041s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f17042t;

    /* renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f17043u;

    /* renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f17044v;

    /* renamed from: w, reason: collision with root package name */
    public final i f17045w;

    /* renamed from: x, reason: collision with root package name */
    public final h f17046x;

    /* renamed from: y, reason: collision with root package name */
    public final g f17047y;

    /* renamed from: z, reason: collision with root package name */
    public final e f17048z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View r10 = M.this.r();
            if (r10 == null || r10.getWindowToken() == null) {
                return;
            }
            M.this.show();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            J j11;
            if (i10 == -1 || (j11 = M.this.f17025c) == null) {
                return;
            }
            j11.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.p();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (M.this.isShowing()) {
                M.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            M.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || M.this.y() || M.this.f17022F.getContentView() == null) {
                return;
            }
            M m10 = M.this;
            m10.f17018B.removeCallbacks(m10.f17045w);
            M.this.f17045w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = M.this.f17022F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < M.this.f17022F.getWidth() && y10 >= 0 && y10 < M.this.f17022F.getHeight()) {
                M m10 = M.this;
                m10.f17018B.postDelayed(m10.f17045w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            M m11 = M.this;
            m11.f17018B.removeCallbacks(m11.f17045w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            J j10 = M.this.f17025c;
            if (j10 == null || !j10.isAttachedToWindow() || M.this.f17025c.getCount() <= M.this.f17025c.getChildCount()) {
                return;
            }
            int childCount = M.this.f17025c.getChildCount();
            M m10 = M.this;
            if (childCount <= m10.f17037o) {
                m10.f17022F.setInputMethodMode(2);
                M.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f17015G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f17016H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public M(Context context) {
        this(context, null, AbstractC5335a.f54972E);
    }

    public final void A() {
        View view = this.f17038p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f17038p);
            }
        }
    }

    public void B(View view) {
        this.f17041s = view;
    }

    public void C(int i10) {
        this.f17022F.setAnimationStyle(i10);
    }

    public void D(int i10) {
        Drawable background = this.f17022F.getBackground();
        if (background == null) {
            Q(i10);
            return;
        }
        background.getPadding(this.f17019C);
        Rect rect = this.f17019C;
        this.f17027e = rect.left + rect.right + i10;
    }

    public void E(int i10) {
        this.f17034l = i10;
    }

    public void F(Rect rect) {
        this.f17020D = rect != null ? new Rect(rect) : null;
    }

    public void G(int i10) {
        if (i10 < 0 && -2 != i10 && -1 != i10) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f17026d = i10;
    }

    public void H(int i10) {
        this.f17022F.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.f17021E = z10;
        this.f17022F.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.f17022F.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f17043u = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f17044v = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f17033k = true;
        this.f17032j = z10;
    }

    public final void N(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f17022F, z10);
            return;
        }
        Method method = f17015G;
        if (method != null) {
            try {
                method.invoke(this.f17022F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void O(int i10) {
        this.f17039q = i10;
    }

    public void P(int i10) {
        J j10 = this.f17025c;
        if (!isShowing() || j10 == null) {
            return;
        }
        j10.setListSelectionHidden(false);
        j10.setSelection(i10);
        if (j10.getChoiceMode() != 0) {
            j10.setItemChecked(i10, true);
        }
    }

    public void Q(int i10) {
        this.f17027e = i10;
    }

    public void a(Drawable drawable) {
        this.f17022F.setBackgroundDrawable(drawable);
    }

    public int b() {
        return this.f17028f;
    }

    public void d(int i10) {
        this.f17028f = i10;
    }

    @Override // r.f
    public void dismiss() {
        this.f17022F.dismiss();
        A();
        this.f17022F.setContentView(null);
        this.f17025c = null;
        this.f17018B.removeCallbacks(this.f17045w);
    }

    public Drawable f() {
        return this.f17022F.getBackground();
    }

    public void h(int i10) {
        this.f17029g = i10;
        this.f17031i = true;
    }

    @Override // r.f
    public boolean isShowing() {
        return this.f17022F.isShowing();
    }

    public int k() {
        if (this.f17031i) {
            return this.f17029g;
        }
        return 0;
    }

    public void l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f17040r;
        if (dataSetObserver == null) {
            this.f17040r = new f();
        } else {
            ListAdapter listAdapter2 = this.f17024b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f17024b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f17040r);
        }
        J j10 = this.f17025c;
        if (j10 != null) {
            j10.setAdapter(this.f17024b);
        }
    }

    @Override // r.f
    public ListView n() {
        return this.f17025c;
    }

    public final int o() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        if (this.f17025c == null) {
            Context context = this.f17023a;
            this.f17017A = new a();
            J q10 = q(context, !this.f17021E);
            this.f17025c = q10;
            Drawable drawable = this.f17042t;
            if (drawable != null) {
                q10.setSelector(drawable);
            }
            this.f17025c.setAdapter(this.f17024b);
            this.f17025c.setOnItemClickListener(this.f17043u);
            this.f17025c.setFocusable(true);
            this.f17025c.setFocusableInTouchMode(true);
            this.f17025c.setOnItemSelectedListener(new b());
            this.f17025c.setOnScrollListener(this.f17047y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f17044v;
            if (onItemSelectedListener != null) {
                this.f17025c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f17025c;
            View view2 = this.f17038p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f17039q;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f17039q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f17027e;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i10 = 0;
            }
            this.f17022F.setContentView(view);
        } else {
            View view3 = this.f17038p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i10 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.f17022F.getBackground();
        if (background != null) {
            background.getPadding(this.f17019C);
            Rect rect = this.f17019C;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f17031i) {
                this.f17029g = -i15;
            }
        } else {
            this.f17019C.setEmpty();
            i11 = 0;
        }
        int s10 = s(r(), this.f17029g, this.f17022F.getInputMethodMode() == 2);
        if (this.f17035m || this.f17026d == -1) {
            return s10 + i11;
        }
        int i16 = this.f17027e;
        if (i16 == -2) {
            int i17 = this.f17023a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f17019C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i16 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f17023a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f17019C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int d10 = this.f17025c.d(makeMeasureSpec, 0, -1, s10 - i10, -1);
        if (d10 > 0) {
            i10 += i11 + this.f17025c.getPaddingTop() + this.f17025c.getPaddingBottom();
        }
        return d10 + i10;
    }

    public void p() {
        J j10 = this.f17025c;
        if (j10 != null) {
            j10.setListSelectionHidden(true);
            j10.requestLayout();
        }
    }

    public J q(Context context, boolean z10) {
        return new J(context, z10);
    }

    public View r() {
        return this.f17041s;
    }

    public final int s(View view, int i10, boolean z10) {
        return c.a(this.f17022F, view, i10, z10);
    }

    @Override // r.f
    public void show() {
        int o10 = o();
        boolean y10 = y();
        C0.i.b(this.f17022F, this.f17030h);
        if (this.f17022F.isShowing()) {
            if (r().isAttachedToWindow()) {
                int i10 = this.f17027e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = r().getWidth();
                }
                int i11 = this.f17026d;
                if (i11 == -1) {
                    if (!y10) {
                        o10 = -1;
                    }
                    if (y10) {
                        this.f17022F.setWidth(this.f17027e == -1 ? -1 : 0);
                        this.f17022F.setHeight(0);
                    } else {
                        this.f17022F.setWidth(this.f17027e == -1 ? -1 : 0);
                        this.f17022F.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    o10 = i11;
                }
                this.f17022F.setOutsideTouchable((this.f17036n || this.f17035m) ? false : true);
                this.f17022F.update(r(), this.f17028f, this.f17029g, i10 < 0 ? -1 : i10, o10 < 0 ? -1 : o10);
                return;
            }
            return;
        }
        int i12 = this.f17027e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = r().getWidth();
        }
        int i13 = this.f17026d;
        if (i13 == -1) {
            o10 = -1;
        } else if (i13 != -2) {
            o10 = i13;
        }
        this.f17022F.setWidth(i12);
        this.f17022F.setHeight(o10);
        N(true);
        this.f17022F.setOutsideTouchable((this.f17036n || this.f17035m) ? false : true);
        this.f17022F.setTouchInterceptor(this.f17046x);
        if (this.f17033k) {
            C0.i.a(this.f17022F, this.f17032j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f17016H;
            if (method != null) {
                try {
                    method.invoke(this.f17022F, this.f17020D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f17022F, this.f17020D);
        }
        C0.i.c(this.f17022F, r(), this.f17028f, this.f17029g, this.f17034l);
        this.f17025c.setSelection(-1);
        if (!this.f17021E || this.f17025c.isInTouchMode()) {
            p();
        }
        if (this.f17021E) {
            return;
        }
        this.f17018B.post(this.f17048z);
    }

    public Object t() {
        if (isShowing()) {
            return this.f17025c.getSelectedItem();
        }
        return null;
    }

    public long u() {
        if (isShowing()) {
            return this.f17025c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int v() {
        if (isShowing()) {
            return this.f17025c.getSelectedItemPosition();
        }
        return -1;
    }

    public View w() {
        if (isShowing()) {
            return this.f17025c.getSelectedView();
        }
        return null;
    }

    public int x() {
        return this.f17027e;
    }

    public boolean y() {
        return this.f17022F.getInputMethodMode() == 2;
    }

    public boolean z() {
        return this.f17021E;
    }

    public M(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public M(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f17026d = -2;
        this.f17027e = -2;
        this.f17030h = RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS;
        this.f17034l = 0;
        this.f17035m = false;
        this.f17036n = false;
        this.f17037o = Integer.MAX_VALUE;
        this.f17039q = 0;
        this.f17045w = new i();
        this.f17046x = new h();
        this.f17047y = new g();
        this.f17048z = new e();
        this.f17019C = new Rect();
        this.f17023a = context;
        this.f17018B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.j.ListPopupWindow, i10, i11);
        this.f17028f = obtainStyledAttributes.getDimensionPixelOffset(l.j.f55239S0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(l.j.f55243T0, 0);
        this.f17029g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f17031i = true;
        }
        obtainStyledAttributes.recycle();
        C2060o c2060o = new C2060o(context, attributeSet, i10, i11);
        this.f17022F = c2060o;
        c2060o.setInputMethodMode(1);
    }
}
