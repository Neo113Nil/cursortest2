package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C2102n0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import l.AbstractC5335a;
import n0.AbstractC5597a;
import o.AbstractC5746a;

/* loaded from: classes.dex */
public class J extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f16972a;

    /* renamed from: b, reason: collision with root package name */
    public int f16973b;

    /* renamed from: c, reason: collision with root package name */
    public int f16974c;

    /* renamed from: d, reason: collision with root package name */
    public int f16975d;

    /* renamed from: e, reason: collision with root package name */
    public int f16976e;

    /* renamed from: f, reason: collision with root package name */
    public int f16977f;

    /* renamed from: g, reason: collision with root package name */
    public d f16978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16979h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16980i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16981j;

    /* renamed from: k, reason: collision with root package name */
    public C2102n0 f16982k;

    /* renamed from: l, reason: collision with root package name */
    public C0.h f16983l;

    /* renamed from: m, reason: collision with root package name */
    public f f16984m;

    public static class a {
        public static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static Method f16985a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f16986b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f16987c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f16988d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f16985a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f16986b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f16987c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f16988d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        public static boolean a() {
            return f16988d;
        }

        public static void b(J j10, int i10, View view) {
            try {
                f16985a.invoke(j10, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f16986b.invoke(j10, Integer.valueOf(i10));
                f16987c.invoke(j10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    public static class d extends AbstractC5746a {

        /* renamed from: b, reason: collision with root package name */
        public boolean f16989b;

        public d(Drawable drawable) {
            super(drawable);
            this.f16989b = true;
        }

        public void b(boolean z10) {
            this.f16989b = z10;
        }

        @Override // o.AbstractC5746a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f16989b) {
                super.draw(canvas);
            }
        }

        @Override // o.AbstractC5746a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f16989b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // o.AbstractC5746a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f16989b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // o.AbstractC5746a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f16989b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // o.AbstractC5746a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f16989b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f16990a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f16990a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f16990a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z10) {
            Field field = f16990a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void a() {
            J j10 = J.this;
            j10.f16984m = null;
            j10.removeCallbacks(this);
        }

        public void b() {
            J.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            J j10 = J.this;
            j10.f16984m = null;
            j10.drawableStateChanged();
        }
    }

    public J(Context context, boolean z10) {
        super(context, null, AbstractC5335a.f55011z);
        this.f16972a = new Rect();
        this.f16973b = 0;
        this.f16974c = 0;
        this.f16975d = 0;
        this.f16976e = 0;
        this.f16980i = z10;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f16981j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f16977f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C2102n0 c2102n0 = this.f16982k;
        if (c2102n0 != null) {
            c2102n0.c();
            this.f16982k = null;
        }
    }

    public final void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f16972a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f16972a);
        selector.draw(canvas);
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f16984m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else if (actionMasked == 2) {
            z10 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition == -1) {
                z11 = true;
                if (z10 || z11) {
                    a();
                }
                if (!z10) {
                    C0.h hVar = this.f16983l;
                    if (hVar != null) {
                        hVar.m(false);
                    }
                    return z10;
                }
                if (this.f16983l == null) {
                    this.f16983l = new C0.h(this);
                }
                this.f16983l.m(true);
                this.f16983l.onTouch(this, motionEvent);
                return z10;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            i(childAt, pointToPosition, x10, y10);
            if (actionMasked == 1) {
                b(childAt, pointToPosition);
            }
            z10 = true;
            z11 = false;
            if (z10) {
            }
            a();
            if (!z10) {
            }
        }
        z11 = false;
        z10 = false;
        if (z10) {
        }
        a();
        if (!z10) {
        }
    }

    public final void f(int i10, View view) {
        Rect rect = this.f16972a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f16973b;
        rect.top -= this.f16974c;
        rect.right += this.f16975d;
        rect.bottom += this.f16976e;
        boolean k10 = k();
        if (view.isEnabled() != k10) {
            l(!k10);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f16972a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC5597a.k(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        AbstractC5597a.k(selector, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f16980i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f16980i || super.hasWindowFocus();
    }

    public final void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f16981j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f16977f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f16977f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f16980i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f16980i && this.f16979h) || super.isInTouchMode();
    }

    public final void j(boolean z10) {
        d dVar = this.f16978g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void l(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    public final boolean m() {
        return this.f16981j;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f16984m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f16984m == null) {
            f fVar = new f();
            this.f16984m = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, pointToPosition, childAt);
                }
            }
            n();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16977f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f16984m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f16979h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f16978g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f16973b = rect.left;
        this.f16974c = rect.top;
        this.f16975d = rect.right;
        this.f16976e = rect.bottom;
    }
}
