package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
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
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2112t;
import androidx.core.view.C2075a;
import androidx.core.view.F0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC5338c;
import n0.AbstractC5597a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.InterfaceC6837C;
import y0.z;

/* loaded from: classes.dex */
public abstract class DrawerLayout extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final InterfaceC6837C mActionDismiss;
    private final d mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final g mLeftCallback;
    private final androidx.customview.widget.c mLeftDragger;
    private e mListener;
    private List<e> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final g mRightCallback;
    private final androidx.customview.widget.c mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;
    private static final int[] THEME_ATTRS = {R.attr.colorPrimaryDark};
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    public class a implements InterfaceC6837C {
        public a() {
        }

        @Override // y0.InterfaceC6837C
        public boolean a(View view, InterfaceC6837C.a aVar) {
            if (!DrawerLayout.this.isDrawerOpen(view) || DrawerLayout.this.getDrawerLockMode(view) == 2) {
                return false;
            }
            DrawerLayout.this.closeDrawer(view);
            return true;
        }
    }

    public class b implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class c extends C2075a {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f19704a = new Rect();

        public c() {
        }

        public final void c(z zVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    zVar.c(childAt);
                }
            }
        }

        public final void d(z zVar, z zVar2) {
            Rect rect = this.f19704a;
            zVar2.n(rect);
            zVar.t0(rect);
            zVar.d1(zVar2.i0());
            zVar.M0(zVar2.E());
            zVar.w0(zVar2.s());
            zVar.A0(zVar2.w());
            zVar.C0(zVar2.V());
            zVar.F0(zVar2.Y());
            zVar.q0(zVar2.Q());
            zVar.U0(zVar2.f0());
            zVar.a(zVar2.k());
        }

        @Override // androidx.core.view.C2075a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null) {
                return true;
            }
            CharSequence drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer));
            if (drawerTitle == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, zVar);
            } else {
                z l02 = z.l0(zVar);
                super.onInitializeAccessibilityNodeInfo(view, l02);
                zVar.W0(view);
                Object F10 = AbstractC2082d0.F(view);
                if (F10 instanceof View) {
                    zVar.O0((View) F10);
                }
                d(zVar, l02);
                l02.n0();
                c(zVar, (ViewGroup) view);
            }
            zVar.w0(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
            zVar.E0(false);
            zVar.F0(false);
            zVar.o0(z.a.f68219e);
            zVar.o0(z.a.f68220f);
        }

        @Override // androidx.core.view.C2075a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class d extends C2075a {
        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            if (DrawerLayout.includeChildForAccessibility(view)) {
                return;
            }
            zVar.O0(null);
        }
    }

    public interface e {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f10);

        void onDrawerStateChanged(int i10);
    }

    public class g extends c.AbstractC0369c {

        /* renamed from: a, reason: collision with root package name */
        public final int f19710a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.customview.widget.c f19711b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f19712c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.o();
            }
        }

        public g(int i10) {
            this.f19710a = i10;
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int d(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void f(int i10, int i11) {
            View findDrawerWithGravity = (i10 & 1) == 1 ? DrawerLayout.this.findDrawerWithGravity(3) : DrawerLayout.this.findDrawerWithGravity(5);
            if (findDrawerWithGravity == null || DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) != 0) {
                return;
            }
            this.f19711b.b(findDrawerWithGravity, i11);
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public boolean g(int i10) {
            return false;
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f19712c, 160L);
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f19708c = false;
            n();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void j(int i10) {
            DrawerLayout.this.updateDrawerState(i10, this.f19711b.v());
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3) ? i10 + r3 : DrawerLayout.this.getWidth() - i10) / view.getWidth();
            DrawerLayout.this.setDrawerViewOffset(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void l(View view, float f10, float f11) {
            int i10;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f19711b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.isDrawerView(view) && DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f19710a) && DrawerLayout.this.getDrawerLockMode(view) == 0;
        }

        public final void n() {
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(this.f19710a == 3 ? 5 : 3);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        public void o() {
            View findDrawerWithGravity;
            int width;
            int x10 = this.f19711b.x();
            boolean z10 = this.f19710a == 3;
            if (z10) {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
                width = (findDrawerWithGravity != null ? -findDrawerWithGravity.getWidth() : 0) + x10;
            } else {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
                width = DrawerLayout.this.getWidth() - x10;
            }
            if (findDrawerWithGravity != null) {
                if (((!z10 || findDrawerWithGravity.getLeft() >= width) && (z10 || findDrawerWithGravity.getLeft() <= width)) || DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) != 0) {
                    return;
                }
                f fVar = (f) findDrawerWithGravity.getLayoutParams();
                this.f19711b.Q(findDrawerWithGravity, width, findDrawerWithGravity.getTop());
                fVar.f19708c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.cancelChildViewTouch();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f19712c);
        }

        public void q(androidx.customview.widget.c cVar) {
            this.f19711b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        CAN_HIDE_DESCENDANTS = true;
        SET_DRAWER_SHADOW_FROM_ELEVATION = true;
        sEdgeSizeUsingSystemGestureInsets = i10 >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static boolean c(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public static String gravityToString(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean includeChildForAccessibility(View view) {
        return (AbstractC2082d0.x(view) == 4 || AbstractC2082d0.x(view) == 2) ? false : true;
    }

    public final boolean a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b10 = b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b10);
            b10.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    public void addDrawerListener(@NonNull e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!isDrawerView(childAt)) {
                this.mNonDrawerViews.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.mNonDrawerViews.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.mNonDrawerViews.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            AbstractC2082d0.t0(view, 4);
        } else {
            AbstractC2082d0.t0(view, 1);
        }
        if (CAN_HIDE_DESCENDANTS) {
            return;
        }
        AbstractC2082d0.l0(view, this.mChildAccessibilityDelegate);
    }

    public final MotionEvent b(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    public void cancelChildViewTouch() {
        if (this.mChildrenCanceledTouch) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.mChildrenCanceledTouch = true;
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i10) {
        return (getDrawerViewAbsoluteGravity(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f19707b);
        }
        this.mScrimOpacity = f10;
        boolean m10 = this.mLeftDragger.m(true);
        boolean m11 = this.mRightDragger.m(true);
        if (m10 || m11) {
            AbstractC2082d0.c0(this);
        }
    }

    public final boolean d() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f19708c) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (f(x10, y10, childAt) && !isContentView(childAt) && a(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f19709d & 1) == 1) {
            fVar.f19709d = 0;
            List<e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            l(view, false);
            k(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f19709d & 1) == 0) {
            fVar.f19709d = 1;
            List<e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            l(view, true);
            k(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f10) {
        List<e> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f10);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && c(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.mScrimOpacity;
        if (f10 > 0.0f && isContentView) {
            this.mScrimPaint.setColor((this.mScrimColor & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.mScrimPaint);
            return drawChild;
        }
        if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.mLeftDragger.x(), TOUCH_SLOP_SENSITIVITY));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
            return drawChild;
        }
        if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.mRightDragger.x(), TOUCH_SLOP_SENSITIVITY));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    public final boolean e() {
        return findVisibleDrawer() != null;
    }

    public final boolean f(float f10, float f11, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f10, (int) f11);
    }

    public View findDrawerWithGravity(int i10) {
        int b10 = AbstractC2112t.b(i10, AbstractC2082d0.z(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == b10) {
                return childAt;
            }
        }
        return null;
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f19709d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final void g(Drawable drawable, int i10) {
        if (drawable == null || !AbstractC5597a.h(drawable)) {
            return;
        }
        AbstractC5597a.m(drawable, i10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i10) {
        int z10 = AbstractC2082d0.z(this);
        if (i10 == 3) {
            int i11 = this.mLockModeLeft;
            if (i11 != 3) {
                return i11;
            }
            int i12 = z10 == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.mLockModeRight;
            if (i13 != 3) {
                return i13;
            }
            int i14 = z10 == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.mLockModeStart;
            if (i15 != 3) {
                return i15;
            }
            int i16 = z10 == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.mLockModeEnd;
        if (i17 != 3) {
            return i17;
        }
        int i18 = z10 == 0 ? this.mLockModeRight : this.mLockModeLeft;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public CharSequence getDrawerTitle(int i10) {
        int b10 = AbstractC2112t.b(i10, AbstractC2082d0.z(this));
        if (b10 == 3) {
            return this.mTitleLeft;
        }
        if (b10 == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        return AbstractC2112t.b(((f) view.getLayoutParams()).f19706a, AbstractC2082d0.z(this));
    }

    public float getDrawerViewOffset(View view) {
        return ((f) view.getLayoutParams()).f19707b;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public final Drawable h() {
        int z10 = AbstractC2082d0.z(this);
        if (z10 == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                g(drawable, z10);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                g(drawable2, z10);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    public final Drawable i() {
        int z10 = AbstractC2082d0.z(this);
        if (z10 == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                g(drawable, z10);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                g(drawable2, z10);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    public boolean isContentView(View view) {
        return ((f) view.getLayoutParams()).f19706a == 0;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (isDrawerView(view)) {
            return (((f) view.getLayoutParams()).f19709d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerView(View view) {
        int b10 = AbstractC2112t.b(((f) view.getLayoutParams()).f19706a, AbstractC2082d0.z(view));
        return ((b10 & 3) == 0 && (b10 & 5) == 0) ? false : true;
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (isDrawerView(view)) {
            return ((f) view.getLayoutParams()).f19707b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    public final void j() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        this.mShadowLeftResolved = h();
        this.mShadowRightResolved = i();
    }

    public final void k(View view) {
        z.a aVar = z.a.f68239y;
        AbstractC2082d0.f0(view, aVar.b());
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        AbstractC2082d0.h0(view, aVar, null, this.mActionDismiss);
    }

    public final void l(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || isDrawerView(childAt)) && !(z10 && childAt == view)) {
                AbstractC2082d0.t0(childAt, 4);
            } else {
                AbstractC2082d0.t0(childAt, 1);
            }
        }
    }

    public void moveDrawerToOffset(View view, float f10) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        setDrawerViewOffset(view, f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        Object obj = this.mLastInsets;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View t10;
        int actionMasked = motionEvent.getActionMasked();
        boolean P10 = this.mLeftDragger.P(motionEvent) | this.mRightDragger.P(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.mLeftDragger.d(3)) {
                        this.mLeftCallback.p();
                        this.mRightCallback.p();
                    }
                }
                z10 = false;
            }
            closeDrawers(true);
            this.mChildrenCanceledTouch = false;
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.mInitialMotionX = x10;
            this.mInitialMotionY = y10;
            z10 = this.mScrimOpacity > 0.0f && (t10 = this.mLeftDragger.t((int) x10, (int) y10)) != null && isContentView(t10);
            this.mChildrenCanceledTouch = false;
        }
        return P10 || z10 || d() || this.mChildrenCanceledTouch;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !e()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        return findVisibleDrawer != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.mInLayout = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f19707b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (fVar.f19707b * f12));
                    }
                    boolean z12 = f10 != fVar.f19707b ? z11 : false;
                    int i18 = fVar.f19706a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        setDrawerViewOffset(childAt, f10);
                    }
                    int i26 = fVar.f19707b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.e i27 = F0.y(rootWindowInsets).i();
            androidx.customview.widget.c cVar = this.mLeftDragger;
            cVar.L(Math.max(cVar.w(), i27.f19098a));
            androidx.customview.widget.c cVar2 = this.mRightDragger;
            cVar2.L(Math.max(cVar2.w(), i27.f19100c));
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
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
        boolean z10 = this.mLastInsets != null && AbstractC2082d0.w(this);
        int z11 = AbstractC2082d0.z(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int b10 = AbstractC2112t.b(fVar.f19706a, z11);
                    if (AbstractC2082d0.w(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                        if (b10 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (b10 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b10 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!isDrawerView(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float u10 = AbstractC2082d0.u(childAt);
                        float f10 = this.mDrawerElevation;
                        if (u10 != f10) {
                            AbstractC2082d0.s0(childAt, f10);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    boolean z14 = drawerViewAbsoluteGravity == 3;
                    if ((z14 && z12) || (!z14 && z13)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this " + TAG + " already has a drawer view along that edge");
                    }
                    if (z14) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i10 = savedState.f19697c;
        if (i10 != 0 && (findDrawerWithGravity = findDrawerWithGravity(i10)) != null) {
            openDrawer(findDrawerWithGravity);
        }
        int i11 = savedState.f19698d;
        if (i11 != 3) {
            setDrawerLockMode(i11, 3);
        }
        int i12 = savedState.f19699e;
        if (i12 != 3) {
            setDrawerLockMode(i12, 5);
        }
        int i13 = savedState.f19700f;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388611);
        }
        int i14 = savedState.f19701g;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        j();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f19709d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.f19697c = fVar.f19706a;
                break;
            }
        }
        savedState.f19698d = this.mLockModeLeft;
        savedState.f19699e = this.mLockModeRight;
        savedState.f19700f = this.mLockModeStart;
        savedState.f19701g = this.mLockModeEnd;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (getDrawerLockMode(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mLeftDragger.F(motionEvent);
        this.mRightDragger.F(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = false;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.mInitialMotionX = x10;
            this.mInitialMotionY = y10;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View t10 = this.mLeftDragger.t((int) x11, (int) y11);
            if (t10 != null && isContentView(t10)) {
                float f10 = x11 - this.mInitialMotionX;
                float f11 = y11 - this.mInitialMotionY;
                int z11 = this.mLeftDragger.z();
                if ((f10 * f10) + (f11 * f11) < z11 * z11) {
                    View findOpenDrawer = findOpenDrawer();
                    if (findOpenDrawer != null) {
                    }
                }
            }
            z10 = true;
            closeDrawers(z10);
        } else if (action == 3) {
            closeDrawers(true);
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(@NonNull e eVar) {
        List<e> list;
        if (eVar == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(eVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            closeDrawers(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setChildInsets(Object obj, boolean z10) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.mDrawerElevation = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (isDrawerView(childAt)) {
                AbstractC2082d0.s0(childAt, this.mDrawerElevation);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.mListener;
        if (eVar2 != null) {
            removeDrawerListener(eVar2);
        }
        if (eVar != null) {
            addDrawerListener(eVar);
        }
        this.mListener = eVar;
    }

    public void setDrawerLockMode(int i10) {
        setDrawerLockMode(i10, 3);
        setDrawerLockMode(i10, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i10) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i10 & 8388611) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i10 & 8388613) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i10 & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        j();
        invalidate();
    }

    public void setDrawerTitle(int i10, CharSequence charSequence) {
        int b10 = AbstractC2112t.b(i10, AbstractC2082d0.z(this));
        if (b10 == 3) {
            this.mTitleLeft = charSequence;
        } else if (b10 == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f19707b) {
            return;
        }
        fVar.f19707b = f10;
        dispatchOnDrawerSlide(view, f10);
    }

    public void setScrimColor(int i10) {
        this.mScrimColor = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.mStatusBarBackground = new ColorDrawable(i10);
        invalidate();
    }

    public void updateDrawerState(int i10, View view) {
        int i11;
        int A10 = this.mLeftDragger.A();
        int A11 = this.mRightDragger.A();
        if (A10 == 1 || A11 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (A10 != 2 && A11 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f19707b;
            if (f10 == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f10 == TOUCH_SLOP_SENSITIVITY) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i11 != this.mDrawerState) {
            this.mDrawerState = i11;
            List<e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i11);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, N0.a.f7851a);
    }

    public void closeDrawer(@NonNull View view, boolean z10) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.mFirstLayout) {
            fVar.f19707b = 0.0f;
            fVar.f19709d = 0;
        } else if (z10) {
            fVar.f19709d |= 4;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.mRightDragger.Q(view, getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 0.0f);
            updateDrawerState(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void closeDrawers(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z10 || fVar.f19708c)) {
                z11 |= checkDrawerViewAbsoluteGravity(childAt, 3) ? this.mLeftDragger.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.mRightDragger.Q(childAt, getWidth(), childAt.getTop());
                fVar.f19708c = false;
            }
        }
        this.mLeftCallback.p();
        this.mRightCallback.p();
        if (z11) {
            invalidate();
        }
    }

    public void openDrawer(@NonNull View view, boolean z10) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.mFirstLayout) {
            fVar.f19707b = TOUCH_SLOP_SENSITIVITY;
            fVar.f19709d = 1;
            l(view, true);
            k(view);
        } else if (z10) {
            fVar.f19709d |= 2;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.Q(view, 0, view.getTop());
            } else {
                this.mRightDragger.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, TOUCH_SLOP_SENSITIVITY);
            updateDrawerState(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mChildAccessibilityDelegate = new d();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new a();
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        float f10 = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.mLeftCallback = gVar;
        g gVar2 = new g(5);
        this.mRightCallback = gVar2;
        androidx.customview.widget.c n10 = androidx.customview.widget.c.n(this, TOUCH_SLOP_SENSITIVITY, gVar);
        this.mLeftDragger = n10;
        n10.M(1);
        n10.N(f11);
        gVar.q(n10);
        androidx.customview.widget.c n11 = androidx.customview.widget.c.n(this, TOUCH_SLOP_SENSITIVITY, gVar2);
        this.mRightDragger = n11;
        n11.M(2);
        n11.N(f11);
        gVar2.q(n11);
        setFocusableInTouchMode(true);
        AbstractC2082d0.t0(this, 1);
        AbstractC2082d0.l0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (AbstractC2082d0.w(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, N0.c.DrawerLayout, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(N0.c.f7853a)) {
                this.mDrawerElevation = obtainStyledAttributes2.getDimension(N0.c.f7853a, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(N0.b.f7852a);
            }
            obtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i10, int i11) {
        View findDrawerWithGravity;
        int b10 = AbstractC2112t.b(i11, AbstractC2082d0.z(this));
        if (i11 == 3) {
            this.mLockModeLeft = i10;
        } else if (i11 == 5) {
            this.mLockModeRight = i10;
        } else if (i11 == 8388611) {
            this.mLockModeStart = i10;
        } else if (i11 == 8388613) {
            this.mLockModeEnd = i10;
        }
        if (i10 != 0) {
            (b10 == 3 ? this.mLeftDragger : this.mRightDragger).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (findDrawerWithGravity = findDrawerWithGravity(b10)) != null) {
                openDrawer(findDrawerWithGravity);
                return;
            }
            return;
        }
        View findDrawerWithGravity2 = findDrawerWithGravity(b10);
        if (findDrawerWithGravity2 != null) {
            closeDrawer(findDrawerWithGravity2);
        }
    }

    public void setStatusBarBackground(int i10) {
        this.mStatusBarBackground = i10 != 0 ? AbstractC5338c.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i10) {
        View findDrawerWithGravity = findDrawerWithGravity(i10);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f19706a;

        /* renamed from: b, reason: collision with root package name */
        public float f19707b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19708c;

        /* renamed from: d, reason: collision with root package name */
        public int f19709d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f19706a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f19706a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f19706a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f19706a = 0;
            this.f19706a = fVar.f19706a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f19706a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f19706a = 0;
        }
    }

    public boolean isDrawerOpen(int i10) {
        View findDrawerWithGravity = findDrawerWithGravity(i10);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f19697c;

        /* renamed from: d, reason: collision with root package name */
        public int f19698d;

        /* renamed from: e, reason: collision with root package name */
        public int f19699e;

        /* renamed from: f, reason: collision with root package name */
        public int f19700f;

        /* renamed from: g, reason: collision with root package name */
        public int f19701g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f19697c = 0;
            this.f19697c = parcel.readInt();
            this.f19698d = parcel.readInt();
            this.f19699e = parcel.readInt();
            this.f19700f = parcel.readInt();
            this.f19701g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19697c);
            parcel.writeInt(this.f19698d);
            parcel.writeInt(this.f19699e);
            parcel.writeInt(this.f19700f);
            parcel.writeInt(this.f19701g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f19697c = 0;
        }
    }

    public void setDrawerShadow(int i10, int i11) {
        setDrawerShadow(AbstractC5338c.getDrawable(getContext(), i10), i11);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((f) view.getLayoutParams()).f19706a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i10, @NonNull View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i10, ((f) view.getLayoutParams()).f19706a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i10) {
        closeDrawer(i10, true);
    }

    public void closeDrawer(int i10, boolean z10) {
        View findDrawerWithGravity = findDrawerWithGravity(i10);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i10));
    }

    public void openDrawer(int i10) {
        openDrawer(i10, true);
    }

    public void openDrawer(int i10, boolean z10) {
        View findDrawerWithGravity = findDrawerWithGravity(i10);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i10));
    }
}
