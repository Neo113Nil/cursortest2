package c3;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.i;
import androidx.core.view.q0;
import androidx.core.view.z0;
import androidx.viewpager.widget.ViewPager$SavedState;
import c4.o;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.d5;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import q4.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h extends ViewGroup {

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f3529q0 = {R.attr.layout_gravity};

    /* renamed from: r0, reason: collision with root package name */
    public static final i f3530r0 = new i(2);

    /* renamed from: s0, reason: collision with root package name */
    public static final androidx.customview.widget.g f3531s0 = new androidx.customview.widget.g(1);
    public final int A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;

    /* renamed from: a, reason: collision with root package name */
    public int f3532a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3533b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3534c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3535d;

    /* renamed from: e, reason: collision with root package name */
    public a f3536e;

    /* renamed from: f, reason: collision with root package name */
    public int f3537f;

    /* renamed from: g, reason: collision with root package name */
    public int f3538g;

    /* renamed from: g0, reason: collision with root package name */
    public final EdgeEffect f3539g0;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f3540h;

    /* renamed from: h0, reason: collision with root package name */
    public final EdgeEffect f3541h0;

    /* renamed from: i, reason: collision with root package name */
    public ClassLoader f3542i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3543i0;
    public final Scroller j;
    public boolean j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3544k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public a1.b f3545l;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayList f3546l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3547m;

    /* renamed from: m0, reason: collision with root package name */
    public g f3548m0;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3549n;

    /* renamed from: n0, reason: collision with root package name */
    public ArrayList f3550n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3551o;

    /* renamed from: o0, reason: collision with root package name */
    public final androidx.core.widget.b f3552o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3553p;

    /* renamed from: p0, reason: collision with root package name */
    public int f3554p0;
    public float q;

    /* renamed from: r, reason: collision with root package name */
    public float f3555r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3556s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3557t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3558u;

    /* renamed from: v, reason: collision with root package name */
    public int f3559v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3560w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3561x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3562y;

    /* renamed from: z, reason: collision with root package name */
    public int f3563z;

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3533b = new ArrayList();
        this.f3534c = new c();
        this.f3535d = new Rect();
        this.f3538g = -1;
        this.f3540h = null;
        this.f3542i = null;
        this.q = -3.4028235E38f;
        this.f3555r = Float.MAX_VALUE;
        this.f3559v = 1;
        this.B = true;
        this.G = -1;
        this.f3543i0 = true;
        this.f3552o0 = new androidx.core.widget.b(3, this);
        this.f3554p0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.j = new Scroller(context, f3531s0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f6);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3539g0 = new EdgeEffect(context);
        this.f3541h0 = new EdgeEffect(context);
        this.K = (int) (25.0f * f6);
        this.L = (int) (2.0f * f6);
        this.f3562y = (int) (f6 * 16.0f);
        z0.o(this, new e(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        q0.l(this, new l1.a(this));
    }

    public static boolean d(int i5, int i10, int i11, View view, boolean z5) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i5, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z5 && view.canScrollHorizontally(-i5);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z5) {
        if (this.f3557t != z5) {
            this.f3557t = z5;
        }
    }

    public final c a(int i5, int i10) {
        ze.c holder;
        c cVar = new c();
        cVar.f3520b = i5;
        ze.d dVar = (ze.d) this.f3536e;
        SparseArray sparseArray = dVar.f25932b;
        int i11 = 0;
        if (sparseArray.get(0) == null) {
            sparseArray.put(0, new af.a(dVar));
        }
        af.a aVar = (af.a) sparseArray.get(0);
        ArrayList arrayList = aVar.f178b;
        int size = arrayList.size();
        while (true) {
            if (i11 >= size) {
                aVar.f177a.getClass();
                Intrinsics.checkNotNullParameter(this, "parent");
                ImageView itemView = new ImageView(getContext());
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                holder = new ze.c(itemView);
                holder.f25931d = -1;
                arrayList.add(holder);
                break;
            }
            holder = (ze.c) arrayList.get(i11);
            if (!holder.f25929b) {
                break;
            }
            i11++;
        }
        ImageView imageView = holder.f25928a;
        holder.f25929b = true;
        holder.f25930c = i5;
        addView(imageView);
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i5 >= 0) {
            String url = (String) dVar.f25934d.get(i5);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            holder.f25931d = i5;
            ImageView imageView2 = holder.f25928a;
            o a7 = y.a(imageView2.getContext());
            q4.e eVar = new q4.e(imageView2.getContext());
            eVar.f21940c = url;
            j.d(eVar, imageView2);
            ((v) a7).a(eVar.a());
        }
        Parcelable parcelable = (Parcelable) dVar.f25933c.get(i5);
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> g10 = bundle.containsKey("c") ? Build.VERSION.SDK_INT >= 34 ? h.b.g(bundle, "c") : bundle.getSparseParcelableArray("c") : null;
            if (g10 != null) {
                imageView.restoreHierarchyState(g10);
            }
        }
        cVar.f3519a = holder;
        this.f3536e.getClass();
        cVar.f3522d = 1.0f;
        ArrayList arrayList2 = this.f3533b;
        if (i10 < 0 || i10 >= arrayList2.size()) {
            arrayList2.add(cVar);
            return cVar;
        }
        arrayList2.add(i10, cVar);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i5, int i10) {
        c i11;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (i11 = i(childAt)) != null && i11.f3520b == this.f3537f) {
                    childAt.addFocusables(arrayList, i5, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        c i5;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.f3520b == this.f3537f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z5 = dVar.f3524a | (view.getClass().getAnnotation(b.class) != null);
        dVar.f3524a = z5;
        if (!this.f3556s) {
            super.addView(view, i5, layoutParams);
        } else {
            if (z5) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.f3527d = true;
            addViewInLayout(view, i5, layoutParams);
        }
    }

    public final void b(g gVar) {
        if (this.f3546l0 == null) {
            this.f3546l0 = new ArrayList();
        }
        this.f3546l0.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i5) {
        View findNextFocus;
        boolean z5;
        int i10;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                w0.d("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i5);
            boolean z7 = true;
            z5 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f3535d;
                if (i5 == 17) {
                    int i11 = h(rect, findNextFocus).left;
                    int i12 = h(rect, findFocus).left;
                    if (findFocus == null || i11 < i12) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i13 = this.f3537f;
                        if (i13 > 0) {
                            this.f3558u = false;
                            v(i13 - 1, 0, true, false);
                            z5 = z7;
                        }
                        z7 = false;
                        z5 = z7;
                    }
                } else if (i5 == 66) {
                    requestFocus = (findFocus == null || h(rect, findNextFocus).left > h(rect, findFocus).left) ? findNextFocus.requestFocus() : n();
                }
                z5 = requestFocus;
            } else if (i5 != 17 || i5 == 1) {
                i10 = this.f3537f;
                if (i10 > 0) {
                    this.f3558u = false;
                    v(i10 - 1, 0, true, false);
                    z5 = z7;
                }
                z7 = false;
                z5 = z7;
            } else if (i5 == 66 || i5 == 2) {
                z5 = n();
            }
            if (z5) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i5));
            }
            return z5;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i5);
        boolean z72 = true;
        z5 = false;
        if (findNextFocus == null) {
        }
        if (i5 != 17) {
        }
        i10 = this.f3537f;
        if (i10 > 0) {
        }
        z72 = false;
        z5 = z72;
        if (z5) {
        }
        return z5;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        if (this.f3536e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i5 < 0 ? scrollX > ((int) (((float) clientWidth) * this.q)) : i5 > 0 && scrollX < ((int) (((float) clientWidth) * this.f3555r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f3544k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z5 = keyEvent.hasModifiers(2) ? n() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z5 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z5 = c(1);
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i5 = this.f3537f;
                        if (i5 > 0) {
                            this.f3558u = false;
                            v(i5 - 1, 0, true, false);
                            z5 = true;
                        }
                    } else {
                        z5 = c(17);
                    }
                    if (!z5) {
                    }
                }
            }
            z5 = false;
            if (!z5) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c i5;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.f3520b == this.f3537f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z5 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3536e) != null && aVar.b() > 1)) {
            if (!this.f3539g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.q * width);
                this.f3539g0.setSize(height, width);
                z5 = this.f3539g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3541h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f3555r + 1.0f)) * width2);
                this.f3541h0.setSize(height2, width2);
                z5 |= this.f3541h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3539g0.finish();
            this.f3541h0.finish();
        }
        if (z5) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3549n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z5) {
        boolean z7 = this.f3554p0 == 2;
        if (z7) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.j;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.f3558u = false;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f3533b;
            if (i5 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i5);
            if (cVar.f3521c) {
                cVar.f3521c = false;
                z7 = true;
            }
            i5++;
        }
        if (z7) {
            androidx.core.widget.b bVar = this.f3552o0;
            if (!z5) {
                bVar.run();
            } else {
                WeakHashMap weakHashMap = z0.f1413a;
                postOnAnimation(bVar);
            }
        }
    }

    public final void f() {
        int b10 = this.f3536e.b();
        this.f3532a = b10;
        ArrayList arrayList = this.f3533b;
        boolean z5 = arrayList.size() < (this.f3559v * 2) + 1 && arrayList.size() < b10;
        int i5 = this.f3537f;
        boolean z7 = false;
        while (arrayList.size() > 0) {
            c cVar = (c) arrayList.get(0);
            a aVar = this.f3536e;
            ze.c cVar2 = cVar.f3519a;
            aVar.getClass();
            arrayList.remove(0);
            if (!z7) {
                this.f3536e.getClass();
                z7 = true;
            }
            this.f3536e.a(this, cVar.f3519a);
            int i10 = this.f3537f;
            if (i10 == cVar.f3520b) {
                i5 = Math.max(0, Math.min(i10, b10 - 1));
            }
            z5 = true;
        }
        if (z7) {
            this.f3536e.getClass();
        }
        Collections.sort(arrayList, f3530r0);
        if (z5) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                d dVar = (d) getChildAt(i11).getLayoutParams();
                if (!dVar.f3524a) {
                    dVar.f3526c = 0.0f;
                }
            }
            v(i5, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i5) {
        g gVar = this.f3548m0;
        if (gVar != null) {
            gVar.onPageSelected(i5);
        }
        ArrayList arrayList = this.f3546l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar2 = (g) this.f3546l0.get(i10);
                if (gVar2 != null) {
                    gVar2.onPageSelected(i5);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.f3526c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f3536e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f3537f;
    }

    public int getOffscreenPageLimit() {
        return this.f3559v;
    }

    public int getPageMargin() {
        return this.f3547m;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final c i(View view) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f3533b;
            if (i5 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i5);
            a aVar = this.f3536e;
            ze.c cVar2 = cVar.f3519a;
            ((ze.d) aVar).getClass();
            if (cVar2 != null && cVar2.f25928a == view) {
                return cVar;
            }
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c j() {
        c cVar;
        int i5;
        int clientWidth = getClientWidth();
        float f6 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.f3547m / clientWidth : 0.0f;
        int i10 = 0;
        boolean z5 = true;
        c cVar2 = null;
        int i11 = -1;
        float f11 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f3533b;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar3 = (c) arrayList.get(i10);
            if (z5 || cVar3.f3520b == (i5 = i11 + 1)) {
                cVar = cVar3;
            } else {
                float f12 = f6 + f11 + f10;
                c cVar4 = this.f3534c;
                cVar4.f3523e = f12;
                cVar4.f3520b = i5;
                this.f3536e.getClass();
                cVar4.f3522d = 1.0f;
                i10--;
                cVar = cVar4;
            }
            f6 = cVar.f3523e;
            float f13 = cVar.f3522d + f6 + f10;
            if (!z5 && scrollX < f6) {
                break;
            }
            if (scrollX < f13 || i10 == arrayList.size() - 1) {
                break;
            }
            int i12 = cVar.f3520b;
            float f14 = cVar.f3522d;
            i10++;
            c cVar5 = cVar;
            i11 = i12;
            f11 = f14;
            cVar2 = cVar5;
            z5 = false;
        }
        return cVar;
    }

    public final c k(int i5) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3533b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.f3520b == i5) {
                return cVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i5, float f6, int i10) {
        int max;
        int i11;
        int left;
        if (this.k0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f3524a) {
                    int i13 = dVar.f3525b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            i11 = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            i11 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i11;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = max;
                    i11 = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i11;
                }
            }
        }
        g gVar = this.f3548m0;
        if (gVar != null) {
            gVar.onPageScrolled(i5, f6, i10);
        }
        ArrayList arrayList = this.f3546l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar2 = (g) this.f3546l0.get(i15);
                if (gVar2 != null) {
                    gVar2.onPageScrolled(i5, f6, i10);
                }
            }
        }
        this.j0 = true;
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.C = motionEvent.getX(i5);
            this.G = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        a aVar = this.f3536e;
        if (aVar == null || this.f3537f >= aVar.b() - 1) {
            return false;
        }
        int i5 = this.f3537f + 1;
        this.f3558u = false;
        v(i5, 0, true, false);
        return true;
    }

    public final boolean o(int i5) {
        if (this.f3533b.size() == 0) {
            if (!this.f3543i0) {
                this.j0 = false;
                l(0, 0.0f, 0);
                if (!this.j0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c j = j();
        int clientWidth = getClientWidth();
        int i10 = this.f3547m;
        int i11 = clientWidth + i10;
        float f6 = clientWidth;
        int i12 = j.f3520b;
        float f10 = ((i5 / f6) - j.f3523e) / (j.f3522d + (i10 / f6));
        this.j0 = false;
        l(i12, f10, (int) (i11 * f10));
        if (this.j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3543i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3552o0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i5;
        float f6;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.f3547m <= 0 || this.f3549n == null) {
            return;
        }
        ArrayList arrayList2 = this.f3533b;
        if (arrayList2.size() <= 0 || this.f3536e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f10 = this.f3547m / width;
        int i11 = 0;
        c cVar = (c) arrayList2.get(0);
        float f11 = cVar.f3523e;
        int size = arrayList2.size();
        int i12 = cVar.f3520b;
        int i13 = ((c) arrayList2.get(size - 1)).f3520b;
        while (i12 < i13) {
            while (true) {
                i5 = cVar.f3520b;
                if (i12 <= i5 || i11 >= size) {
                    break;
                }
                i11++;
                cVar = (c) arrayList2.get(i11);
            }
            if (i12 == i5) {
                float f12 = cVar.f3523e;
                float f13 = cVar.f3522d;
                f6 = (f12 + f13) * width;
                f11 = f12 + f13 + f10;
            } else {
                this.f3536e.getClass();
                f6 = (f11 + 1.0f) * width;
                f11 = 1.0f + f10 + f11;
            }
            if (this.f3547m + f6 > scrollX) {
                arrayList = arrayList2;
                i10 = scrollX;
                this.f3549n.setBounds(Math.round(f6), this.f3551o, Math.round(this.f3547m + f6), this.f3553p);
                this.f3549n.draw(canvas);
            } else {
                arrayList = arrayList2;
                i10 = scrollX;
            }
            if (f6 > i10 + r3) {
                return;
            }
            i12++;
            arrayList2 = arrayList;
            scrollX = i10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.f3560w) {
                return true;
            }
            if (this.f3561x) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.E = x10;
            this.C = x10;
            float y5 = motionEvent.getY();
            this.F = y5;
            this.D = y5;
            this.G = motionEvent.getPointerId(0);
            this.f3561x = false;
            this.f3544k = true;
            this.j.computeScrollOffset();
            if (this.f3554p0 == 2 && Math.abs(this.j.getFinalX() - this.j.getCurrX()) > this.L) {
                this.j.abortAnimation();
                this.f3558u = false;
                q();
                this.f3560w = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            } else if (d5.s(this.f3539g0) == 0.0f && d5.s(this.f3541h0) == 0.0f) {
                e(false);
                this.f3560w = false;
            } else {
                this.f3560w = true;
                setScrollState(1);
                if (d5.s(this.f3539g0) != 0.0f) {
                    d5.D(this.f3539g0, 0.0f, 1.0f - (this.D / getHeight()));
                }
                if (d5.s(this.f3541h0) != 0.0f) {
                    d5.D(this.f3541h0, 0.0f, this.D / getHeight());
                }
            }
        } else if (action == 2) {
            int i5 = this.G;
            if (i5 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                float x11 = motionEvent.getX(findPointerIndex);
                float f6 = x11 - this.C;
                float abs = Math.abs(f6);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.F);
                if (f6 != 0.0f) {
                    float f10 = this.C;
                    if ((this.B || ((f10 >= this.f3563z || f6 <= 0.0f) && (f10 <= getWidth() - this.f3563z || f6 >= 0.0f))) && d((int) f6, (int) x11, (int) y10, this, false)) {
                        this.C = x11;
                        this.D = y10;
                        this.f3561x = true;
                        return false;
                    }
                }
                float f11 = this.A;
                if (abs > f11 && abs * 0.5f > abs2) {
                    this.f3560w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    this.C = f6 > 0.0f ? this.E + this.A : this.E - this.A;
                    this.D = y10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f11) {
                    this.f3561x = true;
                }
                if (this.f3560w && p(x11, y10)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        return this.f3560w;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        boolean z7;
        c i13;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i11 - i5;
        int i17 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f3524a) {
                    int i20 = dVar.f3525b;
                    int i21 = i20 & 7;
                    int i22 = i20 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            i14 = paddingLeft;
                        } else {
                            max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 == 16) {
                            if (i22 == 48) {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                i15 = paddingTop;
                            } else {
                                max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, childAt.getMeasuredHeight() + paddingTop);
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, childAt.getMeasuredHeight() + paddingTop);
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                d dVar2 = (d) childAt2.getLayoutParams();
                if (!dVar2.f3524a && (i13 = i(childAt2)) != null) {
                    float f6 = i26;
                    int i28 = ((int) (i13.f3523e * f6)) + paddingLeft;
                    if (dVar2.f3527d) {
                        dVar2.f3527d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f6 * dVar2.f3526c), 1073741824), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f3551o = paddingTop;
        this.f3553p = i17 - paddingBottom;
        this.k0 = i18;
        if (this.f3543i0) {
            z7 = false;
            u(this.f3537f, 0, false, false);
        } else {
            z7 = false;
        }
        this.f3543i0 = z7;
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        d dVar;
        d dVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i5), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.f3563z = Math.min(measuredWidth / 10, this.f3562y);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z5 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.f3524a) {
                int i14 = dVar2.f3525b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z7 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z5 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z7) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z5 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z7) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z5) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f3556s = true;
        q();
        this.f3556s = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.f3524a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.f3526c), 1073741824), makeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        int i10;
        int i11;
        int i12;
        c i13;
        int childCount = getChildCount();
        if ((i5 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i13 = i(childAt)) != null && i13.f3520b == this.f3537f && childAt.requestFocus(i5, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelable;
        ClassLoader classLoader = viewPager$SavedState.f2865c;
        super.onRestoreInstanceState(viewPager$SavedState.getSuperState());
        a aVar = this.f3536e;
        if (aVar != null) {
            aVar.c(viewPager$SavedState.f2864b, classLoader);
            v(viewPager$SavedState.f2863a, 0, false, true);
        } else {
            this.f3538g = viewPager$SavedState.f2863a;
            this.f3540h = viewPager$SavedState.f2864b;
            this.f3542i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.f2863a = this.f3537f;
        a aVar = this.f3536e;
        if (aVar != null) {
            ze.d dVar = (ze.d) aVar;
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray = dVar.f25932b;
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                Iterator it = ((af.a) sparseArray.get(sparseArray.keyAt(i5))).f178b.iterator();
                while (it.hasNext()) {
                    ze.c cVar = (ze.c) it.next();
                    if (cVar.f25929b) {
                        arrayList.add(cVar);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ze.c cVar2 = (ze.c) it2.next();
                SparseArray sparseArray2 = dVar.f25933c;
                int i10 = cVar2.f25930c;
                SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
                cVar2.f25928a.saveHierarchyState(sparseArray3);
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("c", sparseArray3);
                sparseArray2.put(i10, bundle2);
            }
            bundle.putSparseParcelableArray("d", dVar.f25933c);
            viewPager$SavedState.f2864b = bundle;
        }
        return viewPager$SavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 != i11) {
            int i13 = this.f3547m;
            s(i5, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        int i5;
        boolean z5 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f3536e) == null || aVar.b() == 0) {
            return false;
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 0) {
            this.j.abortAnimation();
            this.f3558u = false;
            q();
            float x10 = motionEvent.getX();
            this.E = x10;
            this.C = x10;
            float y5 = motionEvent.getY();
            this.F = y5;
            this.D = y5;
            this.G = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f3560w) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.G);
                    if (findPointerIndex == -1) {
                        z5 = t();
                    } else {
                        float x11 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x11 - this.C);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.D);
                        if (abs > this.A && abs > abs2) {
                            this.f3560w = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f6 = this.E;
                            this.C = x11 - f6 > 0.0f ? f6 + this.A : f6 - this.A;
                            this.D = y10;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3560w) {
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.G);
                    z5 = p(motionEvent.getX(findPointerIndex2), motionEvent.getY(findPointerIndex2));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.C = motionEvent.getX(actionIndex);
                    this.G = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.C = motionEvent.getX(motionEvent.findPointerIndex(this.G));
                }
            } else if (this.f3560w) {
                u(this.f3537f, 0, true, false);
                z5 = t();
            }
        } else if (this.f3560w) {
            VelocityTracker velocityTracker = this.H;
            velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.G);
            this.f3558u = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            c j = j();
            float f10 = clientWidth;
            int i10 = j.f3520b;
            float f11 = ((scrollX / f10) - j.f3523e) / (j.f3522d + (this.f3547m / f10));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.G)) - this.E)) <= this.K || Math.abs(xVelocity) <= this.I || d5.s(this.f3539g0) != 0.0f || d5.s(this.f3541h0) != 0.0f) {
                i5 = ((int) (f11 + (i10 >= this.f3537f ? 0.4f : 0.6f))) + i10;
            } else {
                i5 = xVelocity > 0 ? i10 : i10 + 1;
            }
            ArrayList arrayList = this.f3533b;
            if (arrayList.size() > 0) {
                i5 = Math.max(((c) arrayList.get(0)).f3520b, Math.min(i5, ((c) arrayList.get(arrayList.size() - 1)).f3520b));
            }
            v(i5, xVelocity, true, true);
            z5 = t();
            if (i5 == i10 && z5) {
                if (d5.s(this.f3541h0) != 0.0f) {
                    this.f3541h0.onAbsorb(-xVelocity);
                } else if (d5.s(this.f3539g0) != 0.0f) {
                    this.f3539g0.onAbsorb(xVelocity);
                }
            }
        }
        if (z5) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f6, float f10) {
        boolean z5;
        float f11 = this.C - f6;
        this.C = f6;
        float height = f10 / getHeight();
        float width = f11 / getWidth();
        float D = (d5.s(this.f3539g0) != 0.0f ? -d5.D(this.f3539g0, -width, 1.0f - height) : d5.s(this.f3541h0) != 0.0f ? d5.D(this.f3541h0, width, height) : 0.0f) * getWidth();
        float f12 = f11 - D;
        boolean z7 = true;
        boolean z10 = false;
        boolean z11 = D != 0.0f;
        if (Math.abs(f12) < 1.0E-4f) {
            return z11;
        }
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.q * clientWidth;
        float f14 = this.f3555r * clientWidth;
        ArrayList arrayList = this.f3533b;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) arrayList.get(arrayList.size() - 1);
        if (cVar.f3520b != 0) {
            f13 = cVar.f3523e * clientWidth;
            z5 = false;
        } else {
            z5 = true;
        }
        if (cVar2.f3520b != this.f3536e.b() - 1) {
            f14 = cVar2.f3523e * clientWidth;
        } else {
            z10 = true;
        }
        if (scrollX < f13) {
            if (z5) {
                d5.D(this.f3539g0, (f13 - scrollX) / clientWidth, 1.0f - (f10 / getHeight()));
            } else {
                z7 = z11;
            }
            z11 = z7;
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z10) {
                d5.D(this.f3541h0, (scrollX - f14) / clientWidth, f10 / getHeight());
            } else {
                z7 = z11;
            }
            z11 = z7;
            scrollX = f14;
        }
        int i5 = (int) scrollX;
        this.C = (scrollX - i5) + this.C;
        scrollTo(i5, getScrollY());
        o(i5);
        return z11;
    }

    public final void q() {
        r(this.f3537f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r10 == r11) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i5) {
        c cVar;
        String hexString;
        ArrayList arrayList;
        c cVar2;
        float f6;
        c cVar3;
        int i10;
        c i11;
        int i12;
        int i13;
        c cVar4;
        c cVar5;
        c cVar6;
        int i14 = this.f3537f;
        if (i14 != i5) {
            cVar = k(i14);
            this.f3537f = i5;
        } else {
            cVar = null;
        }
        if (this.f3536e == null || this.f3558u || getWindowToken() == null) {
            return;
        }
        this.f3536e.getClass();
        int i15 = this.f3559v;
        int max = Math.max(0, this.f3537f - i15);
        int b10 = this.f3536e.b();
        int min = Math.min(b10 - 1, this.f3537f + i15);
        if (b10 != this.f3532a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f3532a + ", found: " + b10 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f3536e.getClass());
        }
        int i16 = 0;
        while (true) {
            arrayList = this.f3533b;
            if (i16 >= arrayList.size()) {
                break;
            }
            cVar2 = (c) arrayList.get(i16);
            int i17 = cVar2.f3520b;
            int i18 = this.f3537f;
            if (i17 < i18) {
                i16++;
            }
        }
        cVar2 = null;
        if (cVar2 == null && b10 > 0) {
            cVar2 = a(this.f3537f, i16);
        }
        if (cVar2 != null) {
            int i19 = i16 - 1;
            c cVar7 = i19 >= 0 ? (c) arrayList.get(i19) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - cVar2.f3522d);
            float f10 = 0.0f;
            for (int i20 = this.f3537f - 1; i20 >= 0; i20--) {
                if (f10 >= paddingLeft && i20 < max) {
                    if (cVar7 == null) {
                        break;
                    }
                    if (i20 == cVar7.f3520b && !cVar7.f3521c) {
                        arrayList.remove(i19);
                        this.f3536e.a(this, cVar7.f3519a);
                        i19--;
                        i16--;
                        if (i19 >= 0) {
                            cVar6 = (c) arrayList.get(i19);
                            cVar7 = cVar6;
                        }
                        cVar6 = null;
                        cVar7 = cVar6;
                    }
                } else if (cVar7 == null || i20 != cVar7.f3520b) {
                    f10 += a(i20, i19 + 1).f3522d;
                    i16++;
                    if (i19 >= 0) {
                        cVar6 = (c) arrayList.get(i19);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                } else {
                    f10 += cVar7.f3522d;
                    i19--;
                    if (i19 >= 0) {
                        cVar6 = (c) arrayList.get(i19);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                }
            }
            f6 = 0.0f;
            float f11 = cVar2.f3522d;
            int i21 = i16 + 1;
            if (f11 < 2.0f) {
                c cVar8 = i21 < arrayList.size() ? (c) arrayList.get(i21) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i22 = i21;
                for (int i23 = this.f3537f + 1; i23 < b10; i23++) {
                    if (f11 >= paddingRight && i23 > min) {
                        if (cVar8 == null) {
                            break;
                        }
                        if (i23 == cVar8.f3520b && !cVar8.f3521c) {
                            arrayList.remove(i22);
                            this.f3536e.a(this, cVar8.f3519a);
                            if (i22 < arrayList.size()) {
                                cVar8 = (c) arrayList.get(i22);
                            }
                            cVar8 = null;
                        }
                    } else if (cVar8 == null || i23 != cVar8.f3520b) {
                        c a7 = a(i23, i22);
                        i22++;
                        f11 += a7.f3522d;
                        if (i22 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i22);
                        }
                        cVar8 = null;
                    } else {
                        f11 += cVar8.f3522d;
                        i22++;
                        if (i22 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i22);
                        }
                        cVar8 = null;
                    }
                }
            }
            int b11 = this.f3536e.b();
            int clientWidth2 = getClientWidth();
            float f12 = clientWidth2 > 0 ? this.f3547m / clientWidth2 : 0.0f;
            if (cVar != null) {
                int i24 = cVar.f3520b;
                int i25 = cVar2.f3520b;
                if (i24 < i25) {
                    float f13 = cVar.f3523e + cVar.f3522d + f12;
                    int i26 = i24 + 1;
                    int i27 = 0;
                    while (i26 <= cVar2.f3520b && i27 < arrayList.size()) {
                        Object obj = arrayList.get(i27);
                        while (true) {
                            cVar5 = (c) obj;
                            if (i26 <= cVar5.f3520b || i27 >= arrayList.size() - 1) {
                                break;
                            }
                            i27++;
                            obj = arrayList.get(i27);
                        }
                        while (i26 < cVar5.f3520b) {
                            this.f3536e.getClass();
                            f13 += 1.0f + f12;
                            i26++;
                        }
                        cVar5.f3523e = f13;
                        f13 += cVar5.f3522d + f12;
                        i26++;
                    }
                } else if (i24 > i25) {
                    int size = arrayList.size() - 1;
                    float f14 = cVar.f3523e;
                    while (true) {
                        i24--;
                        if (i24 < cVar2.f3520b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            cVar4 = (c) obj2;
                            if (i24 >= cVar4.f3520b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i24 > cVar4.f3520b) {
                            this.f3536e.getClass();
                            f14 -= 1.0f + f12;
                            i24--;
                        }
                        f14 -= cVar4.f3522d + f12;
                        cVar4.f3523e = f14;
                    }
                }
            }
            int size2 = arrayList.size();
            float f15 = cVar2.f3523e;
            int i28 = cVar2.f3520b;
            int i29 = i28 - 1;
            this.q = i28 == 0 ? f15 : -3.4028235E38f;
            int i30 = b11 - 1;
            this.f3555r = i28 == i30 ? (cVar2.f3522d + f15) - 1.0f : Float.MAX_VALUE;
            int i31 = i16 - 1;
            while (i31 >= 0) {
                c cVar9 = (c) arrayList.get(i31);
                while (true) {
                    i13 = cVar9.f3520b;
                    if (i29 <= i13) {
                        break;
                    }
                    i29--;
                    this.f3536e.getClass();
                    f15 -= 1.0f + f12;
                }
                f15 -= cVar9.f3522d + f12;
                cVar9.f3523e = f15;
                if (i13 == 0) {
                    this.q = f15;
                }
                i31--;
                i29--;
            }
            float f16 = cVar2.f3523e + cVar2.f3522d + f12;
            int i32 = cVar2.f3520b;
            while (true) {
                i32++;
                if (i21 >= size2) {
                    break;
                }
                c cVar10 = (c) arrayList.get(i21);
                while (true) {
                    i12 = cVar10.f3520b;
                    if (i32 >= i12) {
                        break;
                    }
                    i32++;
                    this.f3536e.getClass();
                    f16 += 1.0f + f12;
                }
                if (i12 == i30) {
                    this.f3555r = (cVar10.f3522d + f16) - 1.0f;
                }
                cVar10.f3523e = f16;
                f16 += cVar10.f3522d + f12;
                i21++;
            }
            this.f3536e.getClass();
        } else {
            f6 = 0.0f;
        }
        this.f3536e.getClass();
        int childCount = getChildCount();
        for (int i33 = 0; i33 < childCount; i33++) {
            View childAt = getChildAt(i33);
            d dVar = (d) childAt.getLayoutParams();
            dVar.getClass();
            if (!dVar.f3524a && dVar.f3526c == f6 && (i11 = i(childAt)) != null) {
                dVar.f3526c = i11.f3522d;
            }
        }
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        cVar3 = i(findFocus);
                        break;
                    } else if (!(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
                if (cVar3 == null && cVar3.f3520b == this.f3537f) {
                    return;
                }
                for (i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt2 = getChildAt(i10);
                    c i34 = i(childAt2);
                    if (i34 != null && i34.f3520b == this.f3537f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
            cVar3 = null;
            if (cVar3 == null) {
            }
            while (i10 < getChildCount()) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f3556s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i5, int i10, int i11, int i12) {
        if (i10 > 0 && !this.f3533b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i5 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        c k6 = k(this.f3537f);
        int min = (int) ((k6 != null ? Math.min(k6.f3523e, this.f3555r) : 0.0f) * ((i5 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f3533b;
        a aVar2 = this.f3536e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f3536e.getClass();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                c cVar = (c) arrayList.get(i5);
                a aVar3 = this.f3536e;
                int i10 = cVar.f3520b;
                aVar3.a(this, cVar.f3519a);
            }
            this.f3536e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((d) getChildAt(i11).getLayoutParams()).f3524a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f3537f = 0;
            scrollTo(0, 0);
        }
        a aVar4 = this.f3536e;
        this.f3536e = aVar;
        this.f3532a = 0;
        if (aVar != null) {
            if (this.f3545l == null) {
                this.f3545l = new a1.b(2, this);
            }
            this.f3536e.d();
            this.f3558u = false;
            boolean z5 = this.f3543i0;
            this.f3543i0 = true;
            this.f3532a = this.f3536e.b();
            if (this.f3538g >= 0) {
                this.f3536e.c(this.f3540h, this.f3542i);
                v(this.f3538g, 0, false, true);
                this.f3538g = -1;
                this.f3540h = null;
                this.f3542i = null;
            } else if (z5) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.f3550n0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f3550n0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((f) this.f3550n0.get(i12)).onAdapterChanged(this, aVar4, aVar);
        }
    }

    public void setCurrentItem(int i5) {
        this.f3558u = false;
        v(i5, 0, !this.f3543i0, false);
    }

    public void setDragInGutterEnabled(boolean z5) {
        this.B = z5;
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1) {
            w0.m("ViewPager", "Requested offscreen page limit " + i5 + " too small; defaulting to 1");
            i5 = 1;
        }
        if (i5 != this.f3559v) {
            this.f3559v = i5;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f3548m0 = gVar;
    }

    public void setPageMargin(int i5) {
        int i10 = this.f3547m;
        this.f3547m = i5;
        int width = getWidth();
        s(width, width, i5, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3549n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i5) {
        if (this.f3554p0 == i5) {
            return;
        }
        this.f3554p0 = i5;
        g gVar = this.f3548m0;
        if (gVar != null) {
            gVar.onPageScrollStateChanged(i5);
        }
        ArrayList arrayList = this.f3546l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar2 = (g) this.f3546l0.get(i10);
                if (gVar2 != null) {
                    gVar2.onPageScrollStateChanged(i5);
                }
            }
        }
    }

    public final boolean t() {
        this.G = -1;
        this.f3560w = false;
        this.f3561x = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.f3539g0.onRelease();
        this.f3541h0.onRelease();
        return (this.f3539g0.isFinished() && this.f3541h0.isFinished()) ? false : true;
    }

    public final void u(int i5, int i10, boolean z5, boolean z7) {
        int scrollX;
        int abs;
        c k6 = k(i5);
        int max = k6 != null ? (int) (Math.max(this.q, Math.min(k6.f3523e, this.f3555r)) * getClientWidth()) : 0;
        if (!z5) {
            if (z7) {
                g(i5);
            }
            e(false);
            scrollTo(max, 0);
            o(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.j;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f3544k ? this.j.getCurrX() : this.j.getStartX();
                this.j.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = max - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                e(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i14 = clientWidth / 2;
                float f6 = clientWidth;
                float f10 = i14;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f10) + f10;
                int abs2 = Math.abs(i10);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f3536e.getClass();
                    abs = (int) (((Math.abs(i12) / ((f6 * 1.0f) + this.f3547m)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f3544k = false;
                this.j.startScroll(i11, scrollY, i12, i13, min);
                postInvalidateOnAnimation();
            }
        }
        if (z7) {
            g(i5);
        }
    }

    public final void v(int i5, int i10, boolean z5, boolean z7) {
        a aVar = this.f3536e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f3533b;
        if (!z7 && this.f3537f == i5 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 >= this.f3536e.b()) {
            i5 = this.f3536e.b() - 1;
        }
        int i11 = this.f3559v;
        int i12 = this.f3537f;
        if (i5 > i12 + i11 || i5 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c) arrayList.get(i13)).f3521c = true;
            }
        }
        boolean z10 = this.f3537f != i5;
        if (!this.f3543i0) {
            r(i5);
            u(i5, i10, z5, z10);
        } else {
            this.f3537f = i5;
            if (z10) {
                g(i5);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3549n;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f3526c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3529q0);
        dVar.f3525b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i5) {
        setPageMarginDrawable(getContext().getDrawable(i5));
    }
}
