package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import androidx.core.view.k2;
import androidx.core.view.o0;
import androidx.core.view.q0;
import androidx.core.view.u;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.z0;
import androidx.customview.view.AbsSavedState;
import com.sports.insider.R;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import s.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements u, v {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<c>>> sConstructors;
    private static final p0.c sRectPool;
    private x mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final j mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private k2 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final w mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private g mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new h();

        /* renamed from: a, reason: collision with root package name */
        public SparseArray f1226a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1226a = new SparseArray(readInt);
            for (int i5 = 0; i5 < readInt; i5++) {
                this.f1226a.append(iArr[i5], readParcelableArray[i5]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            SparseArray sparseArray = this.f1226a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f1226a.keyAt(i10);
                parcelableArr[i10] = (Parcelable) this.f1226a.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i5);
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r02 != null ? r02.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new i(0);
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new p0.e(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new j();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new w();
        int[] iArr = a0.a.f7a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        } else {
            coordinatorLayout = this;
            context2 = context;
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f6 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i5 = 0; i5 < length; i5++) {
                coordinatorLayout.mKeylines[i5] = (int) (r1[i5] * f6);
            }
        }
        coordinatorLayout.mStatusBarBackground = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        j();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = z0.f1413a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) sRectPool.b();
        return rect == null ? new Rect() : rect;
    }

    public static void c(int i5, Rect rect, Rect rect2, f fVar, int i10, int i11) {
        int i12 = fVar.f1231c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i5);
        int i13 = fVar.f1232d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i5);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & 112;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & 112;
        int width = i16 != 1 ? i16 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i17 != 16 ? i17 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i14 == 1) {
            width -= i10 / 2;
        } else if (i14 != 5) {
            width -= i10;
        }
        if (i15 == 16) {
            height -= i11 / 2;
        } else if (i15 != 80) {
            height -= i11;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static void h(int i5, View view) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f1237i;
        if (i10 != i5) {
            WeakHashMap weakHashMap = z0.f1413a;
            view.offsetLeftAndRight(i5 - i10);
            fVar.f1237i = i5;
        }
    }

    public static void i(int i5, View view) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.j;
        if (i10 != i5) {
            WeakHashMap weakHashMap = z0.f1413a;
            view.offsetTopAndBottom(i5 - i10);
            fVar.j = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = sConstructors;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e7) {
            throw new RuntimeException(c1.m("Could not inflate Behavior subclass ", str), e7);
        }
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public final void b(f fVar, Rect rect, int i5, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i5) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i5 + max, i10 + max2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final int d(int i5) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            w0.d(TAG, "No keylines defined for " + this + " - attempted index lookup " + i5);
            return 0;
        }
        if (i5 >= 0 && i5 < iArr.length) {
            return iArr[i5];
        }
        w0.d(TAG, "Keyline index " + i5 + " out of range for " + this);
        return 0;
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        List list = (List) this.mChildDag.f1250b.get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            View view2 = (View) list.get(i5);
            c cVar = ((f) view2.getLayoutParams()).f1229a;
            if (cVar != null) {
                cVar.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z5 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect a7 = a();
        getChildRect(view, view.getParent() != this, a7);
        Rect a10 = a();
        getChildRect(view2, view2.getParent() != this, a10);
        try {
            if (a7.left <= a10.right && a7.top <= a10.bottom && a7.right >= a10.left) {
                if (a7.bottom >= a10.top) {
                    z5 = true;
                }
            }
            return z5;
        } finally {
            a7.setEmpty();
            p0.c cVar = sRectPool;
            cVar.a(a7);
            a10.setEmpty();
            cVar.a(a10);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1229a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(fVar.f1229a.getScrimColor(this, view));
                Paint paint = this.mScrimPaint;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final boolean e(MotionEvent motionEvent, int i5) {
        boolean blocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z5 = false;
        boolean z7 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1229a;
            if (!(z5 || z7) || actionMasked == 0) {
                if (!z5 && cVar != null) {
                    if (i5 == 0) {
                        z5 = cVar.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i5 == 1) {
                        z5 = cVar.onTouchEvent(this, view, motionEvent);
                    }
                    if (z5) {
                        this.mBehaviorTouchView = view;
                    }
                }
                c cVar2 = fVar.f1229a;
                if (cVar2 == null) {
                    fVar.f1240m = false;
                }
                boolean z10 = fVar.f1240m;
                if (z10) {
                    blocksInteractionBelow = true;
                } else {
                    blocksInteractionBelow = (cVar2 != null ? cVar2.blocksInteractionBelow(this, view) : false) | z10;
                    fVar.f1240m = blocksInteractionBelow;
                }
                boolean z11 = blocksInteractionBelow && !z10;
                if (blocksInteractionBelow && !z11) {
                    break;
                }
                z7 = z11;
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i5 == 0) {
                    cVar.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i5 == 1) {
                    cVar.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z5;
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i5 = 0;
        loop0: while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            n nVar = this.mChildDag.f1250b;
            int i10 = nVar.f22575c;
            for (int i11 = 0; i11 < i10; i11++) {
                ArrayList arrayList = (ArrayList) nVar.j(i11);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z5 = true;
                    break loop0;
                }
            }
            i5++;
        }
        if (z5 != this.mNeedsPreDrawListener) {
            if (z5) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r4.f1236h, r8) & r9) == r9) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        this.mDependencySortedChildren.clear();
        j jVar = this.mChildDag;
        n nVar = jVar.f1250b;
        int i5 = nVar.f22575c;
        for (int i10 = 0; i10 < i5; i10++) {
            ArrayList arrayList = (ArrayList) nVar.j(i10);
            if (arrayList != null) {
                arrayList.clear();
                jVar.f1249a.a(arrayList);
            }
        }
        nVar.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f resolvedLayoutParams = getResolvedLayoutParams(childAt);
            int i12 = resolvedLayoutParams.f1234f;
            if (i12 == -1) {
                resolvedLayoutParams.f1239l = null;
                resolvedLayoutParams.f1238k = null;
            } else {
                View view = resolvedLayoutParams.f1238k;
                if (view != null && view.getId() == i12) {
                    View view2 = resolvedLayoutParams.f1238k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            resolvedLayoutParams.f1239l = null;
                            resolvedLayoutParams.f1238k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    resolvedLayoutParams.f1239l = view2;
                }
                View findViewById = findViewById(i12);
                resolvedLayoutParams.f1238k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i12) + " to anchor view " + childAt);
                    }
                    resolvedLayoutParams.f1239l = null;
                    resolvedLayoutParams.f1238k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            resolvedLayoutParams.f1239l = null;
                            resolvedLayoutParams.f1238k = null;
                        }
                    }
                    resolvedLayoutParams.f1239l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    resolvedLayoutParams.f1239l = null;
                    resolvedLayoutParams.f1238k = null;
                }
            }
            n nVar2 = this.mChildDag.f1250b;
            if (!nVar2.containsKey(childAt)) {
                nVar2.put(childAt, null);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i11) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != resolvedLayoutParams.f1239l) {
                        WeakHashMap weakHashMap = z0.f1413a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f1235g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        c cVar = resolvedLayoutParams.f1229a;
                        if (cVar == null) {
                            continue;
                        } else if (!cVar.layoutDependsOn(this, childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!this.mChildDag.f1250b.containsKey(childAt2)) {
                        n nVar3 = this.mChildDag.f1250b;
                        if (!nVar3.containsKey(childAt2)) {
                            nVar3.put(childAt2, null);
                        }
                    }
                    j jVar2 = this.mChildDag;
                    n nVar4 = jVar2.f1250b;
                    if (!nVar4.containsKey(childAt2) || !nVar4.containsKey(childAt)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList arrayList2 = (ArrayList) nVar4.get(childAt2);
                    if (arrayList2 == null) {
                        ArrayList arrayList3 = (ArrayList) jVar2.f1249a.b();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList2 = arrayList3;
                        nVar4.put(childAt2, arrayList2);
                    }
                    arrayList2.add(childAt);
                }
            }
        }
        List<View> list = this.mDependencySortedChildren;
        j jVar3 = this.mChildDag;
        ArrayList arrayList4 = jVar3.f1251c;
        arrayList4.clear();
        HashSet hashSet = jVar3.f1252d;
        hashSet.clear();
        n nVar5 = jVar3.f1250b;
        int i14 = nVar5.f22575c;
        for (int i15 = 0; i15 < i14; i15++) {
            jVar3.a(nVar5.g(i15), arrayList4, hashSet);
        }
        list.addAll(arrayList4);
        Collections.reverse(this.mDependencySortedChildren);
    }

    public final void g(boolean z5) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            c cVar = ((f) childAt.getLayoutParams()).f1229a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    cVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    cVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).f1240m = false;
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    public void getChildRect(View view, boolean z5, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        n nVar = this.mChildDag.f1250b;
        int i5 = nVar.f22575c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i5; i10++) {
            ArrayList arrayList2 = (ArrayList) nVar.j(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nVar.g(i10));
            }
        }
        this.mTempDependenciesList.clear();
        if (arrayList != null) {
            this.mTempDependenciesList.addAll(arrayList);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        f();
        return DesugarCollections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        List list = (List) this.mChildDag.f1250b.get(view);
        this.mTempDependenciesList.clear();
        if (list != null) {
            this.mTempDependenciesList.addAll(list);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal threadLocal = k.f1253a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = k.f1253a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        k.a(this, view, matrix);
        ThreadLocal threadLocal3 = k.f1254b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i5, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        c(i5, rect, rect2, fVar, measuredWidth, measuredHeight);
        b(fVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).q);
    }

    public final k2 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.mNestedScrollingParentHelper;
        return wVar.f1405b | wVar.f1404a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f getResolvedLayoutParams(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1230b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    w0.d(TAG, "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f1230b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.b((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e7) {
                    w0.e(TAG, "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                }
            }
            fVar.f1230b = true;
        }
        return fVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public boolean isPointInChildBounds(@NonNull View view, int i5, int i10) {
        Rect a7 = a();
        getDescendantRect(view, a7);
        try {
            return a7.contains(i5, i10);
        } finally {
            a7.setEmpty();
            sRectPool.a(a7);
        }
    }

    public final void j() {
        WeakHashMap weakHashMap = z0.f1413a;
        if (!getFitsSystemWindows()) {
            q0.l(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a(this);
        }
        q0.l(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void offsetChildToAnchor(View view, int i5) {
        c cVar;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f1238k != null) {
            Rect a7 = a();
            Rect a10 = a();
            Rect a11 = a();
            getDescendantRect(fVar.f1238k, a7);
            getChildRect(view, false, a10);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            c(i5, a7, a11, fVar, measuredWidth, measuredHeight);
            boolean z5 = (a11.left == a10.left && a11.top == a10.top) ? false : true;
            b(fVar, a11, measuredWidth, measuredHeight);
            int i10 = a11.left - a10.left;
            int i11 = a11.top - a10.top;
            if (i10 != 0) {
                WeakHashMap weakHashMap = z0.f1413a;
                view.offsetLeftAndRight(i10);
            }
            if (i11 != 0) {
                WeakHashMap weakHashMap2 = z0.f1413a;
                view.offsetTopAndBottom(i11);
            }
            if (z5 && (cVar = fVar.f1229a) != null) {
                cVar.onDependentViewChanged(this, view, fVar.f1238k);
            }
            a7.setEmpty();
            p0.c cVar2 = sRectPool;
            cVar2.a(a7);
            a10.setEmpty();
            cVar2.a(a10);
            a11.setEmpty();
            cVar2.a(a11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new g(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = z0.f1413a;
            if (getFitsSystemWindows()) {
                o0.c(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onChildViewsChanged(int i5) {
        int i10;
        int i11;
        boolean z5;
        boolean z7;
        boolean z10;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        WeakHashMap weakHashMap = z0.f1413a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect a7 = a();
        Rect a10 = a();
        Rect a11 = a();
        for (int i18 = 0; i18 < size; i18 = i10 + 1) {
            View view = this.mDependencySortedChildren.get(i18);
            f fVar = (f) view.getLayoutParams();
            if (i5 == 0 && view.getVisibility() == 8) {
                i10 = i18;
            } else {
                for (int i19 = 0; i19 < i18; i19++) {
                    if (fVar.f1239l == this.mDependencySortedChildren.get(i19)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, true, a10);
                if (fVar.f1235g != 0 && !a10.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f1235g, layoutDirection);
                    int i20 = absoluteGravity & 112;
                    if (i20 == 48) {
                        a7.top = Math.max(a7.top, a10.bottom);
                    } else if (i20 == 80) {
                        a7.bottom = Math.max(a7.bottom, getHeight() - a10.top);
                    }
                    int i21 = absoluteGravity & 7;
                    if (i21 == 3) {
                        a7.left = Math.max(a7.left, a10.right);
                    } else if (i21 == 5) {
                        a7.right = Math.max(a7.right, getWidth() - a10.left);
                    }
                }
                if (fVar.f1236h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap2 = z0.f1413a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar2 = (f) view.getLayoutParams();
                        c cVar = fVar2.f1229a;
                        Rect a12 = a();
                        Rect a13 = a();
                        i10 = i18;
                        a13.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar == null || !cVar.getInsetDodgeRect(this, view, a12)) {
                            a12.set(a13);
                        } else if (!a13.contains(a12)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a12.toShortString() + " | Bounds:" + a13.toShortString());
                        }
                        a13.setEmpty();
                        p0.c cVar2 = sRectPool;
                        cVar2.a(a13);
                        if (a12.isEmpty()) {
                            a12.setEmpty();
                            cVar2.a(a12);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar2.f1236h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i16 = (a12.top - ((ViewGroup.MarginLayoutParams) fVar2).topMargin) - fVar2.j) >= (i17 = a7.top)) {
                                z7 = false;
                            } else {
                                i(i17 - i16, view);
                                z7 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a12.bottom) - ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin) + fVar2.j) < (i15 = a7.bottom)) {
                                i(height - i15, view);
                                z7 = true;
                            }
                            if (!z7) {
                                i(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i13 = (a12.left - ((ViewGroup.MarginLayoutParams) fVar2).leftMargin) - fVar2.f1237i) >= (i14 = a7.left)) {
                                z10 = false;
                            } else {
                                h(i14 - i13, view);
                                z10 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a12.right) - ((ViewGroup.MarginLayoutParams) fVar2).rightMargin) + fVar2.f1237i) < (i12 = a7.right)) {
                                h(width - i12, view);
                                z10 = true;
                            }
                            if (!z10) {
                                h(0, view);
                            }
                            a12.setEmpty();
                            cVar2.a(a12);
                        }
                        if (i5 != 2) {
                            getLastChildRect(view, a11);
                            if (!a11.equals(a10)) {
                                recordLastChildRect(view, a10);
                            }
                        }
                        for (i11 = i10 + 1; i11 < size; i11++) {
                            View view2 = this.mDependencySortedChildren.get(i11);
                            f fVar3 = (f) view2.getLayoutParams();
                            c cVar3 = fVar3.f1229a;
                            if (cVar3 != null && cVar3.layoutDependsOn(this, view2, view)) {
                                if (i5 == 0 && fVar3.f1243p) {
                                    fVar3.f1243p = false;
                                } else {
                                    if (i5 != 2) {
                                        z5 = cVar3.onDependentViewChanged(this, view2, view);
                                    } else {
                                        cVar3.onDependentViewRemoved(this, view2, view);
                                        z5 = true;
                                    }
                                    if (i5 == 1) {
                                        fVar3.f1243p = z5;
                                    }
                                }
                            }
                        }
                    }
                }
                i10 = i18;
                if (i5 != 2) {
                }
                while (i11 < size) {
                }
            }
        }
        a7.setEmpty();
        p0.c cVar4 = sRectPool;
        cVar4.a(a7);
        a10.setEmpty();
        cVar4.a(a10);
        a11.setEmpty();
        cVar4.a(a11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        k2 k2Var = this.mLastInsets;
        int d10 = k2Var != null ? k2Var.d() : 0;
        if (d10 > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), d10);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            g(true);
        }
        boolean e7 = e(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return e7;
        }
        g(true);
        return e7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        c cVar;
        WeakHashMap weakHashMap = z0.f1413a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.mDependencySortedChildren.get(i13);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1229a) == null || !cVar.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i5) {
        Rect a7;
        Rect a10;
        p0.c cVar;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1238k;
        if (view2 == null && fVar.f1234f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            a7 = a();
            a10 = a();
            try {
                getDescendantRect(view2, a7);
                getDesiredAnchoredChildRect(view, i5, a7, a10);
                view.layout(a10.left, a10.top, a10.right, a10.bottom);
                return;
            } finally {
                a7.setEmpty();
                cVar = sRectPool;
                cVar.a(a7);
                a10.setEmpty();
                cVar.a(a10);
            }
        }
        int i10 = fVar.f1233e;
        if (i10 < 0) {
            f fVar2 = (f) view.getLayoutParams();
            a7 = a();
            a7.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar2).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar2).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar2).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar2).bottomMargin);
            if (this.mLastInsets != null) {
                WeakHashMap weakHashMap = z0.f1413a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    a7.left = this.mLastInsets.b() + a7.left;
                    a7.top = this.mLastInsets.d() + a7.top;
                    a7.right -= this.mLastInsets.c();
                    a7.bottom -= this.mLastInsets.a();
                }
            }
            a10 = a();
            int i11 = fVar2.f1231c;
            if ((i11 & 7) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), a7, a10, i5);
            view.layout(a10.left, a10.top, a10.right, a10.bottom);
            return;
        }
        f fVar3 = (f) view.getLayoutParams();
        int i12 = fVar3.f1231c;
        if (i12 == 0) {
            i12 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i5);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i10 = width - i10;
        }
        int d10 = d(i10) - measuredWidth;
        if (i13 == 1) {
            d10 += measuredWidth / 2;
        } else if (i13 == 5) {
            d10 += measuredWidth;
        }
        int i15 = i14 != 16 ? i14 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(d10, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        c cVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        View view;
        int i25;
        int i26;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.f();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = z0.f1413a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z5 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i27 = paddingLeft + paddingRight;
        int i28 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z7 = coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows();
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i29 = 0;
        int i30 = 0;
        while (i29 < size3) {
            View view2 = coordinatorLayout.mDependencySortedChildren.get(i29);
            int i31 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i19 = size3;
                i14 = i29;
                i21 = paddingLeft;
                i17 = layoutDirection;
                suggestedMinimumWidth = i31;
                i25 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i32 = fVar.f1233e;
                if (i32 < 0 || mode == 0) {
                    i11 = suggestedMinimumHeight;
                } else {
                    int d10 = coordinatorLayout.d(i32);
                    int i33 = fVar.f1231c;
                    if (i33 == 0) {
                        i33 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i33, layoutDirection) & 7;
                    i11 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z5) || (absoluteGravity == 5 && z5)) {
                        max = Math.max(0, (size - paddingRight) - d10);
                    } else if ((absoluteGravity == 5 && !z5) || (absoluteGravity == 3 && z5)) {
                        max = Math.max(0, d10 - paddingLeft);
                    }
                    int i34 = i29;
                    i13 = max;
                    i12 = i34;
                    if (z7 || view2.getFitsSystemWindows()) {
                        i14 = i12;
                        i15 = i5;
                        i16 = i10;
                    } else {
                        i14 = i12;
                        int c2 = coordinatorLayout.mLastInsets.c() + coordinatorLayout.mLastInsets.b();
                        int a7 = coordinatorLayout.mLastInsets.a() + coordinatorLayout.mLastInsets.d();
                        i15 = View.MeasureSpec.makeMeasureSpec(size - c2, mode);
                        i16 = View.MeasureSpec.makeMeasureSpec(size2 - a7, mode2);
                    }
                    cVar = fVar.f1229a;
                    if (cVar == null) {
                        i19 = size3;
                        int i35 = i15;
                        view = view2;
                        int i36 = i11;
                        i17 = layoutDirection;
                        i18 = i36;
                        i21 = paddingLeft;
                        i22 = i31;
                        i25 = paddingRight;
                        i26 = i30;
                        int i37 = i16;
                        boolean onMeasureChild = cVar.onMeasureChild(this, view, i35, i13, i37, 0);
                        i24 = i35;
                        i20 = i13;
                        i23 = i37;
                        if (onMeasureChild) {
                            coordinatorLayout = this;
                            suggestedMinimumWidth = Math.max(i22, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max2 = Math.max(i18, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i30 = View.combineMeasuredStates(i26, view.getMeasuredState());
                            suggestedMinimumHeight = max2;
                        }
                    } else {
                        int i38 = i11;
                        i17 = layoutDirection;
                        i18 = i38;
                        i19 = size3;
                        i20 = i13;
                        i21 = paddingLeft;
                        i22 = i31;
                        i23 = i16;
                        i24 = i15;
                        view = view2;
                        i25 = paddingRight;
                        i26 = i30;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view3, i24, i20, i23, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i22, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max22 = Math.max(i18, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i30 = View.combineMeasuredStates(i26, view.getMeasuredState());
                    suggestedMinimumHeight = max22;
                }
                i12 = i29;
                i13 = 0;
                if (z7) {
                }
                i14 = i12;
                i15 = i5;
                i16 = i10;
                cVar = fVar.f1229a;
                if (cVar == null) {
                }
                View view32 = view;
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view32, i24, i20, i23, 0);
                view = view32;
                suggestedMinimumWidth = Math.max(i22, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max222 = Math.max(i18, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i30 = View.combineMeasuredStates(i26, view.getMeasuredState());
                suggestedMinimumHeight = max222;
            }
            i29 = i14 + 1;
            paddingLeft = i21;
            paddingRight = i25;
            layoutDirection = i17;
            size3 = i19;
        }
        int i39 = i30;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i5, (-16777216) & i39), View.resolveSizeAndState(suggestedMinimumHeight, i10, i39 << 16));
    }

    public void onMeasureChild(View view, int i5, int i10, int i11, int i12) {
        measureChildWithMargins(view, i5, i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f6, float f10, boolean z5) {
        c cVar;
        View view2;
        float f11;
        float f12;
        boolean z7;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z10 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1229a) != null) {
                    view2 = view;
                    f11 = f6;
                    f12 = f10;
                    z7 = z5;
                    z10 |= cVar.onNestedFling(this, childAt, view2, f11, f12, z7);
                    i5++;
                    view = view2;
                    f6 = f11;
                    f10 = f12;
                    z5 = z7;
                }
            }
            view2 = view;
            f11 = f6;
            f12 = f10;
            z7 = z5;
            i5++;
            view = view2;
            f6 = f11;
            f10 = f12;
            z5 = z7;
        }
        if (z10) {
            onChildViewsChanged(1);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f6, float f10) {
        c cVar;
        View view2;
        float f11;
        float f12;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z5 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1229a) != null) {
                    view2 = view;
                    f11 = f6;
                    f12 = f10;
                    z5 |= cVar.onNestedPreFling(this, childAt, view2, f11, f12);
                    i5++;
                    view = view2;
                    f6 = f11;
                    f10 = f12;
                }
            }
            view2 = view;
            f11 = f6;
            f12 = f10;
            i5++;
            view = view2;
            f6 = f11;
            f10 = f12;
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i5, int i10, int[] iArr) {
        onNestedPreScroll(view, i5, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i5, int i10, int i11, int i12) {
        onNestedScroll(view, i5, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i5) {
        onNestedScrollAccepted(view, view2, i5, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f1226a;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id2 = childAt.getId();
            c cVar = getResolvedLayoutParams(childAt).f1229a;
            if (id2 != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1229a;
            if (id2 != -1 && cVar != null && (onSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        savedState.f1226a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i5) {
        return onStartNestedScroll(view, view2, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.mBehaviorTouchView == null) {
            z5 = e(motionEvent, 1);
        } else {
            z5 = false;
        }
        c cVar = ((f) this.mBehaviorTouchView.getLayoutParams()).f1229a;
        if (cVar != null) {
            onTouchEvent = cVar.onTouchEvent(this, this.mBehaviorTouchView, motionEvent);
            motionEvent2 = null;
            if (this.mBehaviorTouchView != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return onTouchEvent;
            }
            g(false);
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.mBehaviorTouchView != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        g(false);
        return onTouchEvent;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((f) view.getLayoutParams()).q.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        c cVar = ((f) view.getLayoutParams()).f1229a;
        if (cVar == null || !cVar.onRequestChildRectangleOnScreen(this, view, rect, z5)) {
            return super.requestChildRectangleOnScreen(view, rect, z5);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.mDisallowInterceptReset) {
            return;
        }
        g(false);
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        j();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                WeakHashMap weakHashMap = z0.f1413a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap weakHashMap2 = z0.f1413a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i5) {
        setStatusBarBackground(new ColorDrawable(i5));
    }

    public void setStatusBarBackgroundResource(int i5) {
        setStatusBarBackground(i5 != 0 ? getContext().getDrawable(i5) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.mStatusBarBackground.setVisible(z5, false);
    }

    public final k2 setWindowInsets(k2 k2Var) {
        c cVar;
        if (!Objects.equals(this.mLastInsets, k2Var)) {
            this.mLastInsets = k2Var;
            boolean z5 = k2Var != null && k2Var.d() > 0;
            this.mDrawStatusBarBackground = z5;
            setWillNotDraw(!z5 && getBackground() == null);
            if (!k2Var.f1349a.n()) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    WeakHashMap weakHashMap = z0.f1413a;
                    if (childAt.getFitsSystemWindows() && (cVar = ((f) childAt.getLayoutParams()).f1229a) != null) {
                        k2Var = cVar.onApplyWindowInsets(this, childAt, k2Var);
                        if (k2Var.f1349a.n()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return k2Var;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    @Override // android.view.ViewGroup
    public f generateDefaultLayoutParams() {
        return new f();
    }

    @Override // androidx.core.view.u
    public void onNestedPreScroll(View view, int i5, int i10, int[] iArr, int i11) {
        c cVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i11) && (cVar = fVar.f1229a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view, i5, i10, iArr2, i11);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i12 = i5 > 0 ? Math.max(i12, iArr3[0]) : Math.min(i12, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i13 = i10 > 0 ? Math.max(i13, iArr4[1]) : Math.min(i13, iArr4[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z5) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.u
    public void onNestedScroll(View view, int i5, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i5, i10, i11, i12, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.u
    public void onNestedScrollAccepted(View view, View view2, int i5, int i10) {
        c cVar;
        View view3;
        View view4;
        int i11;
        int i12;
        w wVar = this.mNestedScrollingParentHelper;
        if (i10 == 1) {
            wVar.f1405b = i5;
        } else {
            wVar.f1404a = i5;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10) && (cVar = fVar.f1229a) != null) {
                view3 = view;
                view4 = view2;
                i11 = i5;
                i12 = i10;
                cVar.onNestedScrollAccepted(this, childAt, view3, view4, i11, i12);
            } else {
                view3 = view;
                view4 = view2;
                i11 = i5;
                i12 = i10;
            }
            i13++;
            view = view3;
            view2 = view4;
            i5 = i11;
            i10 = i12;
        }
    }

    @Override // androidx.core.view.u
    public boolean onStartNestedScroll(View view, View view2, int i5, int i10) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1229a;
                if (cVar != null) {
                    boolean onStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view, view2, i5, i10);
                    z5 |= onStartNestedScroll;
                    if (i10 == 0) {
                        fVar.f1241n = onStartNestedScroll;
                    } else if (i10 == 1) {
                        fVar.f1242o = onStartNestedScroll;
                    }
                } else if (i10 == 0) {
                    fVar.f1241n = false;
                } else if (i10 == 1) {
                    fVar.f1242o = false;
                }
            }
        }
        return z5;
    }

    @Override // androidx.core.view.u
    public void onStopNestedScroll(View view, int i5) {
        w wVar = this.mNestedScrollingParentHelper;
        if (i5 == 1) {
            wVar.f1405b = 0;
        } else {
            wVar.f1404a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i5)) {
                c cVar = fVar.f1229a;
                if (cVar != null) {
                    cVar.onStopNestedScroll(this, childAt, view, i5);
                }
                if (i5 == 0) {
                    fVar.f1241n = false;
                } else if (i5 == 1) {
                    fVar.f1242o = false;
                }
                fVar.f1243p = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.v
    public void onNestedScroll(@NonNull View view, int i5, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i13) && (cVar = fVar.f1229a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view, i5, i10, i11, i12, i13, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    i14 = i11 > 0 ? Math.max(i14, iArr3[0]) : Math.min(i14, iArr3[0]);
                    int[] iArr4 = this.mBehaviorConsumed;
                    i15 = i12 > 0 ? Math.max(i15, iArr4[1]) : Math.min(i15, iArr4[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z5) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }
}
