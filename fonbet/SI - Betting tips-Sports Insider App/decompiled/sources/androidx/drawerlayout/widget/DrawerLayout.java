package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.core.view.k2;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.f;
import androidx.customview.widget.i;
import com.google.firebase.messaging.k;
import i1.b;
import i1.c;
import i1.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements f {
    public static final int[] F = {R.attr.colorPrimaryDark};
    public static final int[] G = {R.attr.layout_gravity};
    public static final boolean H;
    public static final boolean I;
    public static final boolean J;
    public boolean A;
    public final ArrayList B;
    public Rect C;
    public Matrix D;
    public final androidx.credentials.playservices.controllers.CreateRestoreCredential.a E;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.core.widget.f f1738a;

    /* renamed from: b, reason: collision with root package name */
    public float f1739b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1740c;

    /* renamed from: d, reason: collision with root package name */
    public int f1741d;

    /* renamed from: e, reason: collision with root package name */
    public float f1742e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f1743f;

    /* renamed from: g, reason: collision with root package name */
    public final i f1744g;

    /* renamed from: h, reason: collision with root package name */
    public final i f1745h;

    /* renamed from: i, reason: collision with root package name */
    public final i1.f f1746i;
    public final i1.f j;

    /* renamed from: k, reason: collision with root package name */
    public int f1747k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1748l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1749m;

    /* renamed from: n, reason: collision with root package name */
    public OnBackInvokedCallback f1750n;

    /* renamed from: o, reason: collision with root package name */
    public OnBackInvokedDispatcher f1751o;

    /* renamed from: p, reason: collision with root package name */
    public int f1752p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public int f1753r;

    /* renamed from: s, reason: collision with root package name */
    public int f1754s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1755t;

    /* renamed from: u, reason: collision with root package name */
    public c f1756u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f1757v;

    /* renamed from: w, reason: collision with root package name */
    public float f1758w;

    /* renamed from: x, reason: collision with root package name */
    public float f1759x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f1760y;

    /* renamed from: z, reason: collision with root package name */
    public k2 f1761z;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f1762a;

        /* renamed from: b, reason: collision with root package name */
        public int f1763b;

        /* renamed from: c, reason: collision with root package name */
        public int f1764c;

        /* renamed from: d, reason: collision with root package name */
        public int f1765d;

        /* renamed from: e, reason: collision with root package name */
        public int f1766e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1762a = 0;
            this.f1762a = parcel.readInt();
            this.f1763b = parcel.readInt();
            this.f1764c = parcel.readInt();
            this.f1765d = parcel.readInt();
            this.f1766e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f1762a);
            parcel.writeInt(this.f1763b);
            parcel.writeInt(this.f1764c);
            parcel.writeInt(this.f1765d);
            parcel.writeInt(this.f1766e);
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        H = true;
        I = true;
        J = i5 >= 29;
    }

    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sports.insider.R.attr.drawerLayoutStyle);
        this.f1738a = new androidx.core.widget.f(1);
        this.f1741d = -1728053248;
        this.f1743f = new Paint();
        this.f1749m = true;
        this.f1752p = 3;
        this.q = 3;
        this.f1753r = 3;
        this.f1754s = 3;
        this.E = new androidx.credentials.playservices.controllers.CreateRestoreCredential.a(20, this);
        setDescendantFocusability(262144);
        float f6 = getResources().getDisplayMetrics().density;
        this.f1740c = (int) ((64.0f * f6) + 0.5f);
        float f10 = f6 * 400.0f;
        i1.f fVar = new i1.f(this, 3);
        this.f1746i = fVar;
        i1.f fVar2 = new i1.f(this, 5);
        this.j = fVar2;
        i iVar = new i(getContext(), this, fVar);
        iVar.f1552b = (int) (iVar.f1552b * 1.0f);
        this.f1744g = iVar;
        iVar.q = 1;
        iVar.f1563n = f10;
        fVar.f10861b = iVar;
        i iVar2 = new i(getContext(), this, fVar2);
        iVar2.f1552b = (int) (1.0f * iVar2.f1552b);
        this.f1745h = iVar2;
        iVar2.q = 2;
        iVar2.f1563n = f10;
        fVar2.f10861b = iVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = z0.f1413a;
        setImportantForAccessibility(1);
        z0.o(this, new i1.a(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            q0.l(this, new k(26));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F);
            try {
                this.f1760y = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h1.a.f10342a, com.sports.insider.R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1739b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1739b = getResources().getDimension(com.sports.insider.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.B = new ArrayList();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String h(int i5) {
        return (i5 & 3) == 3 ? "LEFT" : (i5 & 5) == 5 ? "RIGHT" : Integer.toHexString(i5);
    }

    public static boolean i(View view) {
        WeakHashMap weakHashMap = z0.f1413a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean j(View view) {
        return ((d) view.getLayoutParams()).f10856a == 0;
    }

    public static boolean k(View view) {
        if (l(view)) {
            return (((d) view.getLayoutParams()).f10859d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean l(View view) {
        int i5 = ((d) view.getLayoutParams()).f10856a;
        WeakHashMap weakHashMap = z0.f1413a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i5, View view) {
        return (g(view) & i5) == i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i5, int i10) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        boolean z5 = false;
        while (true) {
            arrayList2 = this.B;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (!l(childAt)) {
                arrayList2.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i5, i10);
                z5 = true;
            }
            i11++;
        }
        if (!z5) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) arrayList2.get(i12);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i5, i10);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        View view2;
        super.addView(view, i5, layoutParams);
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                view2 = null;
                break;
            }
            view2 = getChildAt(i10);
            if ((((d) view2.getLayoutParams()).f10859d & 1) == 1) {
                break;
            } else {
                i10++;
            }
        }
        if (view2 != null || l(view)) {
            WeakHashMap weakHashMap = z0.f1413a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = z0.f1413a;
            view.setImportantForAccessibility(1);
        }
        if (H) {
            return;
        }
        z0.o(view, this.f1738a);
    }

    public final void b(View view, boolean z5) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1749m) {
            dVar.f10857b = 0.0f;
            dVar.f10859d = 0;
        } else if (z5) {
            dVar.f10859d |= 4;
            if (a(3, view)) {
                this.f1744g.s(view, -view.getWidth(), view.getTop());
            } else {
                this.f1745h.s(view, getWidth(), view.getTop());
            }
        } else {
            float f6 = ((d) view.getLayoutParams()).f10857b;
            float width = view.getWidth();
            int i5 = ((int) (width * 0.0f)) - ((int) (f6 * width));
            if (!a(3, view)) {
                i5 = -i5;
            }
            view.offsetLeftAndRight(i5);
            p(view, 0.0f);
            t(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void c(boolean z5) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            d dVar = (d) childAt.getLayoutParams();
            if (l(childAt) && (!z5 || dVar.f10858c)) {
                z7 |= a(3, childAt) ? this.f1744g.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1745h.s(childAt, getWidth(), childAt.getTop());
                dVar.f10858c = false;
            }
        }
        i1.f fVar = this.f1746i;
        fVar.f10863d.removeCallbacks(fVar.f10862c);
        i1.f fVar2 = this.j;
        fVar2.f10863d.removeCallbacks(fVar2.f10862c);
        if (z7) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f6 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            f6 = Math.max(f6, ((d) getChildAt(i5).getLayoutParams()).f10857b);
        }
        this.f1742e = f6;
        boolean g10 = this.f1744g.g();
        boolean g11 = this.f1745h.g();
        if (g10 || g11) {
            WeakHashMap weakHashMap = z0.f1413a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i5) {
        WeakHashMap weakHashMap = z0.f1413a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1742e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y5 = motionEvent.getY();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt = getChildAt(i5);
            if (this.C == null) {
                this.C = new Rect();
            }
            childAt.getHitRect(this.C);
            if (this.C.contains((int) x10, (int) y5) && !j(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.D == null) {
                            this.D = new Matrix();
                        }
                        matrix.invert(this.D);
                        obtain.transform(this.D);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean j6 = j(view);
        int width = getWidth();
        int save = canvas.save();
        int i5 = 0;
        if (j6) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && l(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i10) {
                            i10 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
            i5 = i10;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f6 = this.f1742e;
        if (f6 > 0.0f && j6) {
            int i12 = this.f1741d;
            Paint paint = this.f1743f;
            paint.setColor((((int) ((((-16777216) & i12) >>> 24) * f6)) << 24) | (i12 & 16777215));
            canvas.drawRect(i5, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((d) childAt.getLayoutParams()).f10857b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i5 = ((d) view.getLayoutParams()).f10856a;
        WeakHashMap weakHashMap = z0.f1413a;
        int layoutDirection = getLayoutDirection();
        if (i5 == 3) {
            int i10 = this.f1752p;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.f1753r : this.f1754s;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i5 == 5) {
            int i12 = this.q;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.f1754s : this.f1753r;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i5 == 8388611) {
            int i14 = this.f1753r;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.f1752p : this.q;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i5 != 8388613) {
            return 0;
        }
        int i16 = this.f1754s;
        if (i16 != 3) {
            return i16;
        }
        int i17 = layoutDirection == 0 ? this.q : this.f1752p;
        if (i17 != 3) {
            return i17;
        }
        return 0;
    }

    public final int g(View view) {
        int i5 = ((d) view.getLayoutParams()).f10856a;
        WeakHashMap weakHashMap = z0.f1413a;
        return Gravity.getAbsoluteGravity(i5, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f10856a = 0;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            d dVar2 = new d(dVar);
            dVar2.f10856a = 0;
            dVar2.f10856a = dVar.f10856a;
            return dVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            d dVar3 = new d((ViewGroup.MarginLayoutParams) layoutParams);
            dVar3.f10856a = 0;
            return dVar3;
        }
        d dVar4 = new d(layoutParams);
        dVar4.f10856a = 0;
        return dVar4;
    }

    public float getDrawerElevation() {
        if (I) {
            return this.f1739b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1760y;
    }

    public final void m(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f1749m) {
            dVar.f10857b = 1.0f;
            dVar.f10859d = 1;
            s(view, true);
            r(view);
            q();
        } else {
            dVar.f10859d |= 2;
            if (a(3, view)) {
                this.f1744g.s(view, 0, view.getTop());
            } else {
                this.f1745h.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void n() {
        View d10 = d(8388611);
        if (d10 != null) {
            m(d10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + h(8388611));
        }
    }

    public final void o(int i5, int i10) {
        View d10;
        WeakHashMap weakHashMap = z0.f1413a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        if (i10 == 3) {
            this.f1752p = i5;
        } else if (i10 == 5) {
            this.q = i5;
        } else if (i10 == 8388611) {
            this.f1753r = i5;
        } else if (i10 == 8388613) {
            this.f1754s = i5;
        }
        if (i5 != 0) {
            (absoluteGravity == 3 ? this.f1744g : this.f1745h).a();
        }
        if (i5 != 1) {
            if (i5 == 2 && (d10 = d(absoluteGravity)) != null) {
                m(d10);
                return;
            }
            return;
        }
        View d11 = d(absoluteGravity);
        if (d11 != null) {
            b(d11, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1749m = true;
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1749m = true;
        q();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A || this.f1760y == null) {
            return;
        }
        k2 k2Var = this.f1761z;
        int d10 = k2Var != null ? k2Var.d() : 0;
        if (d10 > 0) {
            this.f1760y.setBounds(0, 0, getWidth(), d10);
            this.f1760y.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        View h10;
        int actionMasked = motionEvent.getActionMasked();
        i iVar = this.f1744g;
        boolean r5 = iVar.r(motionEvent) | this.f1745h.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = iVar.f1554d.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if ((iVar.f1560k & (1 << i5)) != 0) {
                            float f6 = iVar.f1556f[i5] - iVar.f1554d[i5];
                            float f10 = iVar.f1557g[i5] - iVar.f1555e[i5];
                            float f11 = (f10 * f10) + (f6 * f6);
                            int i10 = iVar.f1552b;
                            if (f11 > i10 * i10) {
                                i1.f fVar = this.f1746i;
                                fVar.f10863d.removeCallbacks(fVar.f10862c);
                                i1.f fVar2 = this.j;
                                fVar2.f10863d.removeCallbacks(fVar2.f10862c);
                                break;
                            }
                        }
                        i5++;
                    }
                }
                z5 = false;
            }
            c(true);
            this.f1755t = false;
            z5 = false;
        } else {
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.f1758w = x10;
            this.f1759x = y5;
            z5 = this.f1742e > 0.0f && (h10 = iVar.h((int) x10, (int) y5)) != null && j(h10);
            this.f1755t = false;
        }
        if (!r5 && !z5) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    if (this.f1755t) {
                        break;
                    }
                    return false;
                }
                if (((d) getChildAt(i11).getLayoutParams()).f10858c) {
                    break;
                }
                i11++;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (i5 != 4 || e() == null) {
            return super.onKeyDown(i5, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (i5 != 4) {
            return super.onKeyUp(i5, keyEvent);
        }
        View e7 = e();
        if (e7 != null && f(e7) == 0) {
            c(false);
        }
        return e7 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        float f6;
        int i13;
        boolean z7 = true;
        this.f1748l = true;
        int i14 = i11 - i5;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f10 = measuredWidth;
                        i13 = (-measuredWidth) + ((int) (dVar.f10857b * f10));
                        f6 = (measuredWidth + i13) / f10;
                    } else {
                        float f11 = measuredWidth;
                        f6 = (i14 - r11) / f11;
                        i13 = i14 - ((int) (dVar.f10857b * f11));
                    }
                    boolean z10 = f6 != dVar.f10857b ? z7 : false;
                    int i17 = dVar.f10856a & 112;
                    if (i17 == 16) {
                        int i18 = i12 - i10;
                        int i19 = (i18 - measuredHeight) / 2;
                        int i20 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i19 < i20) {
                            i19 = i20;
                        } else {
                            int i21 = i19 + measuredHeight;
                            int i22 = i18 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i21 > i22) {
                                i19 = i22 - measuredHeight;
                            }
                        }
                        childAt.layout(i13, i19, measuredWidth + i13, measuredHeight + i19);
                    } else if (i17 != 80) {
                        int i23 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i13, i23, measuredWidth + i13, measuredHeight + i23);
                    } else {
                        int i24 = i12 - i10;
                        childAt.layout(i13, (i24 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i13, i24 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z10) {
                        p(childAt, f6);
                    }
                    int i25 = dVar.f10857b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i25) {
                        childAt.setVisibility(i25);
                    }
                }
            }
            i15++;
            z7 = true;
        }
        if (J) {
            WeakHashMap weakHashMap = z0.f1413a;
            k2 a7 = r0.a(this);
            if (a7 != null) {
                g0.d j = a7.f1349a.j();
                i iVar = this.f1744g;
                iVar.f1564o = Math.max(iVar.f1565p, j.f9676a);
                i iVar2 = this.f1745h;
                iVar2.f1564o = Math.max(iVar2.f1565p, j.f9678c);
            }
        }
        this.f1748l = false;
        this.f1749m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i10) {
        boolean z5;
        int childCount;
        int i11;
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f1761z != null) {
            WeakHashMap weakHashMap = z0.f1413a;
            if (getFitsSystemWindows()) {
                z5 = true;
                WeakHashMap weakHashMap2 = z0.f1413a;
                int layoutDirection = getLayoutDirection();
                childCount = getChildCount();
                boolean z7 = false;
                boolean z10 = false;
                for (i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        d dVar = (d) childAt.getLayoutParams();
                        if (z5) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(dVar.f10856a, layoutDirection);
                            if (childAt.getFitsSystemWindows()) {
                                k2 k2Var = this.f1761z;
                                if (absoluteGravity == 3) {
                                    k2Var = k2Var.f(k2Var.b(), k2Var.d(), 0, k2Var.a());
                                } else if (absoluteGravity == 5) {
                                    k2Var = k2Var.f(0, k2Var.d(), k2Var.c(), k2Var.a());
                                }
                                z0.b(childAt, k2Var);
                            } else {
                                k2 k2Var2 = this.f1761z;
                                if (absoluteGravity == 3) {
                                    k2Var2 = k2Var2.f(k2Var2.b(), k2Var2.d(), 0, k2Var2.a());
                                } else if (absoluteGravity == 5) {
                                    k2Var2 = k2Var2.f(0, k2Var2.d(), k2Var2.c(), k2Var2.a());
                                }
                                ((ViewGroup.MarginLayoutParams) dVar).leftMargin = k2Var2.b();
                                ((ViewGroup.MarginLayoutParams) dVar).topMargin = k2Var2.d();
                                ((ViewGroup.MarginLayoutParams) dVar).rightMargin = k2Var2.c();
                                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = k2Var2.a();
                            }
                        }
                        if (j(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) dVar).leftMargin) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) dVar).topMargin) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, 1073741824));
                        } else {
                            if (!l(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i11 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            }
                            if (I) {
                                float e7 = q0.e(childAt);
                                float f6 = this.f1739b;
                                if (e7 != f6) {
                                    q0.k(childAt, f6);
                                }
                            }
                            int g10 = g(childAt) & 7;
                            boolean z11 = g10 == 3;
                            if ((z11 && z7) || (!z11 && z10)) {
                                throw new IllegalStateException("Child drawer has absolute gravity " + h(g10) + " but this DrawerLayout already has a drawer view along that edge");
                            }
                            if (z11) {
                                z7 = true;
                            } else {
                                z10 = true;
                            }
                            childAt.measure(ViewGroup.getChildMeasureSpec(i5, this.f1740c + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, ((ViewGroup.MarginLayoutParams) dVar).width), ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, ((ViewGroup.MarginLayoutParams) dVar).height));
                        }
                    }
                }
            }
        }
        z5 = false;
        WeakHashMap weakHashMap22 = z0.f1413a;
        int layoutDirection2 = getLayoutDirection();
        childCount = getChildCount();
        boolean z72 = false;
        boolean z102 = false;
        while (i11 < childCount) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i5 = savedState.f1762a;
        if (i5 != 0 && (d10 = d(i5)) != null) {
            m(d10);
        }
        int i10 = savedState.f1763b;
        if (i10 != 3) {
            o(i10, 3);
        }
        int i11 = savedState.f1764c;
        if (i11 != 3) {
            o(i11, 5);
        }
        int i12 = savedState.f1765d;
        if (i12 != 3) {
            o(i12, 8388611);
        }
        int i13 = savedState.f1766e;
        if (i13 != 3) {
            o(i13, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        if (I) {
            return;
        }
        WeakHashMap weakHashMap = z0.f1413a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1762a = 0;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            d dVar = (d) getChildAt(i5).getLayoutParams();
            int i10 = dVar.f10859d;
            boolean z5 = i10 == 1;
            boolean z7 = i10 == 2;
            if (z5 || z7) {
                savedState.f1762a = dVar.f10856a;
                break;
            }
        }
        savedState.f1763b = this.f1752p;
        savedState.f1764c = this.q;
        savedState.f1765d = this.f1753r;
        savedState.f1766e = this.f1754s;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (f(r1) != 2) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        i iVar = this.f1744g;
        iVar.k(motionEvent);
        this.f1745h.k(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        boolean z5 = false;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.f1758w = x10;
            this.f1759x = y5;
            this.f1755t = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            c(true);
            this.f1755t = false;
            return true;
        }
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        View h10 = iVar.h((int) x11, (int) y10);
        if (h10 != null && j(h10)) {
            float f6 = x11 - this.f1758w;
            float f10 = y10 - this.f1759x;
            int i5 = iVar.f1552b;
            if ((f10 * f10) + (f6 * f6) < i5 * i5) {
                int childCount = getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        view = null;
                        break;
                    }
                    view = getChildAt(i10);
                    if ((((d) view.getLayoutParams()).f10859d & 1) == 1) {
                        break;
                    }
                    i10++;
                }
                if (view != null) {
                }
            }
        }
        z5 = true;
        c(z5);
        return true;
    }

    public final void p(View view, float f6) {
        d dVar = (d) view.getLayoutParams();
        if (f6 == dVar.f10857b) {
            return;
        }
        dVar.f10857b = f6;
        ArrayList arrayList = this.f1757v;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) this.f1757v.get(size)).onDrawerSlide(view, f6);
            }
        }
    }

    public final void q() {
        boolean z5;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View e7 = e();
            OnBackInvokedDispatcher a7 = b.a(this);
            if (e7 != null && a7 != null && f(e7) == 0) {
                WeakHashMap weakHashMap = z0.f1413a;
                if (isAttachedToWindow()) {
                    z5 = true;
                    if (!z5 && this.f1751o == null) {
                        if (this.f1750n == null) {
                            this.f1750n = b.b(new aa.c(19, this));
                        }
                        b.c(a7, this.f1750n);
                        this.f1751o = a7;
                        return;
                    }
                    if (!z5 || (onBackInvokedDispatcher = this.f1751o) == null) {
                    }
                    b.d(onBackInvokedDispatcher, this.f1750n);
                    this.f1751o = null;
                    return;
                }
            }
            z5 = false;
            if (!z5) {
            }
            if (z5) {
            }
        }
    }

    public final void r(View view) {
        q0.b bVar = q0.b.f21904l;
        z0.l(bVar.a(), view);
        z0.i(0, view);
        if (!k(view) || f(view) == 2) {
            return;
        }
        z0.m(view, bVar, null, this.E);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (z5) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1748l) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view, boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((z5 || l(childAt)) && !(z5 && childAt == view)) {
                WeakHashMap weakHashMap = z0.f1413a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = z0.f1413a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setDrawerElevation(float f6) {
        this.f1739b = f6;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (l(childAt)) {
                float f10 = this.f1739b;
                WeakHashMap weakHashMap = z0.f1413a;
                q0.k(childAt, f10);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f1756u;
        if (cVar2 != null && (arrayList = this.f1757v) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            if (this.f1757v == null) {
                this.f1757v = new ArrayList();
            }
            this.f1757v.add(cVar);
        }
        this.f1756u = cVar;
    }

    public void setDrawerLockMode(int i5) {
        o(i5, 3);
        o(i5, 5);
    }

    public void setScrimColor(int i5) {
        this.f1741d = i5;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1760y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i5) {
        this.f1760y = new ColorDrawable(i5);
        invalidate();
    }

    public final void t(int i5, View view) {
        int i10;
        View rootView;
        int i11 = this.f1744g.f1551a;
        int i12 = this.f1745h.f1551a;
        if (i11 == 1 || i12 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (i11 != 2 && i12 != 2) {
                i10 = 0;
            }
        }
        if (view != null && i5 == 0) {
            float f6 = ((d) view.getLayoutParams()).f10857b;
            if (f6 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f10859d & 1) == 1) {
                    dVar.f10859d = 0;
                    ArrayList arrayList = this.f1757v;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((c) this.f1757v.get(size)).onDrawerClosed(view);
                        }
                    }
                    s(view, false);
                    r(view);
                    q();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f6 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f10859d & 1) == 0) {
                    dVar2.f10859d = 1;
                    ArrayList arrayList2 = this.f1757v;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((c) this.f1757v.get(size2)).onDrawerOpened(view);
                        }
                    }
                    s(view, true);
                    r(view);
                    q();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i10 != this.f1747k) {
            this.f1747k = i10;
            ArrayList arrayList3 = this.f1757v;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) this.f1757v.get(size3)).onDrawerStateChanged(i10);
                }
            }
        }
    }

    public void setStatusBarBackground(int i5) {
        this.f1760y = i5 != 0 ? getContext().getDrawable(i5) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f10856a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G);
        dVar.f10856a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return dVar;
    }
}
