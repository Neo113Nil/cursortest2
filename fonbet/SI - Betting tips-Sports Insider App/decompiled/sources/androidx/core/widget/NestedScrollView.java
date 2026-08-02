package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.core.view.c0;
import androidx.core.view.q0;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.z0;
import com.google.android.gms.internal.measurement.d5;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements v, s, ScrollingView {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final f D = new f(0);
    public static final int[] E = {R.attr.fillViewport};
    public float A;
    public final androidx.core.view.i B;

    /* renamed from: a, reason: collision with root package name */
    public final float f1421a;

    /* renamed from: b, reason: collision with root package name */
    public long f1422b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1423c;

    /* renamed from: d, reason: collision with root package name */
    public final OverScroller f1424d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1425e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1426f;

    /* renamed from: g, reason: collision with root package name */
    public c0 f1427g;

    /* renamed from: h, reason: collision with root package name */
    public int f1428h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1429i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public View f1430k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1431l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f1432m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1433n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1434o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1435p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1436r;

    /* renamed from: s, reason: collision with root package name */
    public int f1437s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1438t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f1439u;

    /* renamed from: v, reason: collision with root package name */
    public int f1440v;

    /* renamed from: w, reason: collision with root package name */
    public int f1441w;

    /* renamed from: x, reason: collision with root package name */
    public SavedState f1442x;

    /* renamed from: y, reason: collision with root package name */
    public final w f1443y;

    /* renamed from: z, reason: collision with root package name */
    public final t f1444z;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new i();

        /* renamed from: a, reason: collision with root package name */
        public int f1445a;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return r4.k.n(sb2, this.f1445a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f1445a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sports.insider.R.attr.nestedScrollViewStyle);
        this.f1423c = new Rect();
        this.f1429i = true;
        this.j = false;
        this.f1430k = null;
        this.f1431l = false;
        this.f1434o = true;
        this.f1437s = -1;
        this.f1438t = new int[2];
        this.f1439u = new int[2];
        this.B = new androidx.core.view.i(getContext(), new h9.c(10, this));
        int i5 = Build.VERSION.SDK_INT;
        this.f1425e = i5 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f1426f = i5 >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f1421a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1424d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1435p = viewConfiguration.getScaledTouchSlop();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1436r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, com.sports.insider.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1443y = new w();
        this.f1444z = new t(this);
        setNestedScrollingEnabled(true);
        z0.o(this, D);
    }

    public static boolean g(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, nestedScrollView);
    }

    private c0 getScrollFeedbackProvider() {
        if (this.f1427g == null) {
            this.f1427g = new c0(this);
        }
        return this.f1427g;
    }

    public final boolean a(int i5) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i5);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i5 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i5 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i5 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            n(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f1423c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            n(b(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i5);
        }
        if (view != null && view.isFocused() && !h(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i5 - verticalFadingEdgeLength : i5;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i5);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(int i5, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f1444z.c(i5, i10, iArr, null, i11);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i5;
        int i10;
        if (this.f1424d.isFinished()) {
            return;
        }
        this.f1424d.computeScrollOffset();
        int currY = this.f1424d.getCurrY();
        int i11 = currY - this.f1441w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1425e;
        EdgeEffect edgeEffect2 = this.f1426f;
        if (i11 <= 0 || d5.s(edgeEffect) == 0.0f) {
            if (i11 < 0 && d5.s(edgeEffect2) != 0.0f) {
                float f6 = height;
                round = Math.round(d5.D(edgeEffect2, (i11 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (round != i11) {
                    edgeEffect2.finish();
                }
            }
            this.f1441w = currY;
            int[] iArr = this.f1439u;
            iArr[1] = 0;
            c(0, i11, iArr, null, 1);
            i5 = i11 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f1424d.getCurrVelocity()));
            }
            if (i5 == 0) {
                int scrollY = getScrollY();
                k(i5, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i5 - scrollY2;
                iArr[1] = 0;
                i10 = 1;
                this.f1444z.d(0, scrollY2, 0, i12, this.f1438t, 1, iArr);
                i5 = i12 - iArr[1];
            } else {
                i10 = 1;
            }
            if (i5 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == i10 && scrollRange > 0)) {
                    if (i5 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f1424d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1424d.getCurrVelocity());
                    }
                }
                this.f1424d.abortAnimation();
                s(i10);
            }
            if (this.f1424d.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                s(i10);
                return;
            }
        }
        round = Math.round(d5.D(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i11) {
            edgeEffect.finish();
        }
        i11 -= round;
        this.f1441w = currY;
        int[] iArr2 = this.f1439u;
        iArr2[1] = 0;
        c(0, i11, iArr2, null, 1);
        i5 = i11 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i5 == 0) {
        }
        if (i5 != 0) {
        }
        if (this.f1424d.isFinished()) {
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    public final boolean d(KeyEvent keyEvent) {
        this.f1423c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? f(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? f(130) : a(130);
                    }
                    if (keyCode == 62) {
                        l(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return f(33);
                    }
                    if (keyCode == 93) {
                        return f(130);
                    }
                    if (keyCode == 122) {
                        l(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        l(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z5) {
        return this.f1444z.a(f6, f10, z5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return this.f1444z.b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2) {
        return this.f1444z.c(i5, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr) {
        return this.f1444z.d(i5, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i5;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1425e;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i5 = getPaddingLeft();
            } else {
                i5 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i5, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1426f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i10 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    public final void e(int i5) {
        if (getChildCount() > 0) {
            this.f1424d.fling(getScrollX(), getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            q(2, 1);
            this.f1441w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f1424d.getCurrVelocity()));
            }
        }
    }

    public final boolean f(int i5) {
        int childCount;
        boolean z5 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f1423c;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i5, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.f1443y;
        return wVar.f1405b | wVar.f1404a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    public final boolean h(View view, int i5, int i10) {
        Rect rect = this.f1423c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i5 >= getScrollY() && rect.top - i5 <= getScrollY() + i10;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1444z.f(0);
    }

    public final void i(int i5, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i5);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1444z.d(0, scrollY2, 0, i5 - scrollY2, null, i10, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1444z.f1395d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1437s) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f1428h = (int) motionEvent.getY(i5);
            this.f1437s = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f1432m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i5, int i10, int i11, int i12) {
        int i13;
        boolean z5;
        int i14;
        boolean z7;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i5;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z5 = false;
        } else {
            i13 = 0;
            z5 = true;
        }
        if (i15 > i12) {
            i14 = i12;
        } else {
            if (i15 >= 0) {
                i14 = i15;
                z7 = false;
                if (z7 && !this.f1444z.f(1)) {
                    this.f1424d.springBack(i13, i14, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i13, i14);
                return !z5 || z7;
            }
            i14 = 0;
        }
        z7 = true;
        if (z7) {
            this.f1424d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (z5) {
        }
    }

    public final void l(int i5) {
        boolean z5 = i5 == 130;
        int height = getHeight();
        Rect rect = this.f1423c;
        if (z5) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        m(i5, i10, i11);
    }

    public final boolean m(int i5, int i10, int i11) {
        boolean z5;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z7 = i5 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z11 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z10) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i10 < scrollY || i11 > i12) {
            n(z7 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z5 = true;
        } else {
            z5 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i5);
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i5, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i5, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(int i5, int i10, MotionEvent motionEvent, int i11, int i12, boolean z5) {
        int i13;
        int i14;
        boolean z7;
        boolean z10;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            q(2, i12);
        }
        boolean c2 = this.f1444z.c(0, i5, this.f1439u, this.f1438t, i12);
        int[] iArr = this.f1438t;
        int[] iArr2 = this.f1439u;
        if (c2) {
            i13 = i5 - iArr2[1];
            i14 = iArr[1];
        } else {
            i13 = i5;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z5;
        boolean z12 = k(i13, 0, scrollY, scrollRange) && !this.f1444z.f(i12);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f1294a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i10, scrollY2);
        }
        iArr2[1] = 0;
        this.f1444z.d(0, scrollY2, 0, i13 - scrollY2, this.f1438t, i12, iArr2);
        int i15 = i14 + iArr[1];
        int i16 = i13 - iArr2[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f1426f;
        EdgeEffect edgeEffect2 = this.f1425e;
        if (i17 < 0) {
            if (z11) {
                d5.D(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f1294a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            d5.D(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (motionEvent != null) {
                z7 = false;
                getScrollFeedbackProvider().f1294a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, false);
            } else {
                z7 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z10 = z7;
            } else {
                z10 = z12;
            }
            if (z10 && i12 == 0 && (velocityTracker = this.f1432m) != null) {
                velocityTracker.clear();
            }
            if (i12 == 1) {
                s(i12);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i15;
        }
        z7 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z10 = z7;
        if (z10) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
        }
        return i15;
    }

    public final boolean o(EdgeEffect edgeEffect, int i5) {
        if (i5 > 0) {
            return true;
        }
        float s8 = d5.s(edgeEffect) * getHeight();
        float abs = Math.abs(-i5) * 0.35f;
        float f6 = this.f1421a * 0.015f;
        double log = Math.log(abs / f6);
        double d10 = C;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) f6))) < s8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i5;
        int i10;
        float f6;
        if (motionEvent.getAction() == 8 && !this.f1431l) {
            if (u6.h.p(motionEvent, 2)) {
                f6 = motionEvent.getAxisValue(9);
                i5 = 9;
                i10 = (int) motionEvent.getX();
            } else if (u6.h.p(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i5 = 26;
                f6 = axisValue;
            } else {
                i5 = 0;
                i10 = 0;
                f6 = 0.0f;
            }
            if (f6 != 0.0f) {
                n(-((int) (getVerticalScrollFactorCompat() * f6)), i5, motionEvent, i10, 1, u6.h.p(motionEvent, 8194));
                if (i5 == 0) {
                    return true;
                }
                this.B.a(motionEvent, i5);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action == 2 && this.f1431l) {
            return true;
        }
        int i5 = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i10 = this.f1437s;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            w0.d("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y5 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y5 - this.f1428h) > this.f1435p && (2 & getNestedScrollAxes()) == 0) {
                                this.f1431l = true;
                                this.f1428h = y5;
                                if (this.f1432m == null) {
                                    this.f1432m = VelocityTracker.obtain();
                                }
                                this.f1432m.addMovement(motionEvent);
                                this.f1440v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.f1431l = false;
            this.f1437s = -1;
            VelocityTracker velocityTracker = this.f1432m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1432m = null;
            }
            if (this.f1424d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s(0);
        } else {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 >= childAt.getTop() - scrollY && y10 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.f1428h = y10;
                    this.f1437s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1432m;
                    if (velocityTracker2 == null) {
                        this.f1432m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1432m.addMovement(motionEvent);
                    this.f1424d.computeScrollOffset();
                    if (!r(motionEvent) && this.f1424d.isFinished()) {
                        z5 = false;
                    }
                    this.f1431l = z5;
                    q(2, 0);
                }
            }
            if (!r(motionEvent) && this.f1424d.isFinished()) {
                z5 = false;
            }
            this.f1431l = z5;
            VelocityTracker velocityTracker3 = this.f1432m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1432m = null;
            }
        }
        return this.f1431l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z5, i5, i10, i11, i12);
        int i14 = 0;
        this.f1429i = false;
        View view = this.f1430k;
        if (view != null && g(view, this)) {
            View view2 = this.f1430k;
            Rect rect = this.f1423c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.f1430k = null;
        if (!this.j) {
            if (this.f1442x != null) {
                scrollTo(getScrollX(), this.f1442x.f1445a);
                this.f1442x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        if (this.f1433n && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        e((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return this.f1444z.b(f6, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
        c(i5, i10, iArr, null, 0);
    }

    @Override // androidx.core.view.v
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        i(i12, i13, iArr);
    }

    @Override // androidx.core.view.u
    public final void onNestedScrollAccepted(View view, View view2, int i5, int i10) {
        w wVar = this.f1443y;
        if (i10 == 1) {
            wVar.f1405b = i5;
        } else {
            wVar.f1404a = i5;
        }
        q(2, i10);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i5, int i10, boolean z5, boolean z7) {
        super.scrollTo(i5, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (i5 == 2) {
            i5 = 130;
        } else if (i5 == 1) {
            i5 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i5) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i5);
        if (findNextFocus != null && h(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i5, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1442x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1445a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i5, int i10, int i11, int i12) {
        super.onScrollChanged(i5, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !h(findFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f1423c;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b10 = b(rect);
        if (b10 != 0) {
            if (this.f1434o) {
                p(0, b10, false);
            } else {
                scrollBy(0, b10);
            }
        }
    }

    @Override // androidx.core.view.u
    public final boolean onStartNestedScroll(View view, View view2, int i5, int i10) {
        return (i5 & 2) != 0;
    }

    @Override // androidx.core.view.u
    public final void onStopNestedScroll(View view, int i5) {
        w wVar = this.f1443y;
        if (i5 == 1) {
            wVar.f1405b = 0;
        } else {
            wVar.f1404a = 0;
        }
        s(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float D2;
        int round;
        int i5;
        ViewParent parent2;
        if (this.f1432m == null) {
            this.f1432m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1440v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        obtain.offsetLocation(0.0f, this.f1440v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1425e;
            EdgeEffect edgeEffect2 = this.f1426f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1432m;
                velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, this.f1436r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1437s);
                if (Math.abs(yVelocity) >= this.q) {
                    if (d5.s(edgeEffect) != 0.0f) {
                        if (o(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (d5.s(edgeEffect2) != 0.0f) {
                        int i10 = -yVelocity;
                        if (o(edgeEffect2, i10)) {
                            edgeEffect2.onAbsorb(i10);
                        } else {
                            e(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f10 = i11;
                        if (!this.f1444z.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            e(i11);
                        }
                    }
                } else if (this.f1424d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1437s = -1;
                this.f1431l = false;
                VelocityTracker velocityTracker2 = this.f1432m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1432m = null;
                }
                s(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1437s);
                if (findPointerIndex == -1) {
                    w0.d("NestedScrollView", "Invalid pointerId=" + this.f1437s + " in onTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(findPointerIndex);
                    int i12 = this.f1428h - y5;
                    float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (d5.s(edgeEffect) != 0.0f) {
                        D2 = -d5.D(edgeEffect, -height, x10);
                        if (d5.s(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (d5.s(edgeEffect2) != 0.0f) {
                            D2 = d5.D(edgeEffect2, height, 1.0f - x10);
                            if (d5.s(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f6 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i5 = i12 - round;
                        if (!this.f1431l && Math.abs(i5) > this.f1435p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1431l = true;
                            i5 = i5 <= 0 ? i5 - this.f1435p : i5 + this.f1435p;
                        }
                        if (this.f1431l) {
                            int n9 = n(i5, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f1428h = y5 - n9;
                            this.f1440v += n9;
                        }
                    }
                    f6 = D2;
                    round = Math.round(f6 * getHeight());
                    if (round != 0) {
                    }
                    i5 = i12 - round;
                    if (!this.f1431l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.f1431l = true;
                        if (i5 <= 0) {
                        }
                    }
                    if (this.f1431l) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1431l && getChildCount() > 0) {
                    if (this.f1424d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f1437s = -1;
                this.f1431l = false;
                VelocityTracker velocityTracker3 = this.f1432m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1432m = null;
                }
                s(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1428h = (int) motionEvent.getY(actionIndex);
                this.f1437s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.f1428h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1437s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1431l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1424d.isFinished()) {
                this.f1424d.abortAnimation();
                s(1);
            }
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1428h = y10;
            this.f1437s = pointerId;
            q(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1432m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i5, int i10, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1422b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1424d.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z5) {
                q(2, 1);
            } else {
                s(1);
            }
            this.f1441w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1424d.isFinished()) {
                this.f1424d.abortAnimation();
                s(1);
            }
            scrollBy(i5, i10);
        }
        this.f1422b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean q(int i5, int i10) {
        return this.f1444z.g(2, i10);
    }

    public final boolean r(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f1425e;
        if (d5.s(edgeEffect) != 0.0f) {
            d5.D(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f1426f;
        if (d5.s(edgeEffect2) == 0.0f) {
            return z5;
        }
        d5.D(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1429i) {
            this.f1430k = view2;
        } else {
            Rect rect = this.f1423c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        boolean z7 = b10 != 0;
        if (z7) {
            if (z5) {
                scrollBy(0, b10);
                return z7;
            }
            p(0, b10, false);
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f1432m) != null) {
            velocityTracker.recycle();
            this.f1432m = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1429i = true;
        super.requestLayout();
    }

    public final void s(int i5) {
        this.f1444z.h(i5);
    }

    @Override // android.view.View
    public final void scrollTo(int i5, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i5 < 0) {
                i5 = 0;
            } else if (width + i5 > width2) {
                i5 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i5 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i5, i10);
        }
    }

    public void setFillViewport(boolean z5) {
        if (z5 != this.f1433n) {
            this.f1433n = z5;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        t tVar = this.f1444z;
        if (tVar.f1395d) {
            ViewGroup viewGroup = tVar.f1394c;
            WeakHashMap weakHashMap = z0.f1413a;
            q0.n(viewGroup);
        }
        tVar.f1395d = z5;
    }

    public void setSmoothScrollingEnabled(boolean z5) {
        this.f1434o = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i5) {
        return this.f1444z.g(i5, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        s(0);
    }

    @Override // androidx.core.view.u
    public final void onNestedPreScroll(View view, int i5, int i10, int[] iArr, int i11) {
        c(i5, i10, iArr, null, i11);
    }

    @Override // androidx.core.view.u
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13) {
        i(i12, i13, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i5) {
        return onStartNestedScroll(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        i(i12, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        if (getChildCount() <= 0) {
            super.addView(view, i5);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i5) {
        onNestedScrollAccepted(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
