package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.sports.insider.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class g2 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f749a;

    /* renamed from: b, reason: collision with root package name */
    public int f750b;

    /* renamed from: c, reason: collision with root package name */
    public int f751c;

    /* renamed from: d, reason: collision with root package name */
    public int f752d;

    /* renamed from: e, reason: collision with root package name */
    public int f753e;

    /* renamed from: f, reason: collision with root package name */
    public int f754f;

    /* renamed from: g, reason: collision with root package name */
    public d2 f755g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f756h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f757i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.core.widget.e f758k;

    /* renamed from: l, reason: collision with root package name */
    public f2 f759l;

    public g2(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f749a = new Rect();
        this.f750b = 0;
        this.f751c = 0;
        this.f752d = 0;
        this.f753e = 0;
        this.f757i = z5;
        setCacheColorHint(0);
    }

    public final int a(int i5, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i5, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i5) {
        boolean z5;
        boolean z7;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 1) {
            z5 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z5 = true;
                    if (z5 || z10) {
                        this.j = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f754f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z5) {
                        androidx.core.widget.e eVar = this.f758k;
                        if (eVar != null) {
                            if (eVar.f1472p) {
                                eVar.d();
                            }
                            eVar.f1472p = false;
                        }
                    } else {
                        if (this.f758k == null) {
                            this.f758k = new androidx.core.widget.e(this);
                        }
                        androidx.core.widget.e eVar2 = this.f758k;
                        boolean z11 = eVar2.f1472p;
                        eVar2.f1472p = true;
                        eVar2.onTouch(this, motionEvent);
                    }
                    return z5;
                }
                z5 = false;
                if (z5) {
                }
                this.j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f754f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z5) {
                }
                return z5;
            }
            z5 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i5);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y5 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y5);
            if (pointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f6 = x10;
                float f10 = y5;
                this.j = true;
                int i10 = Build.VERSION.SDK_INT;
                a2.a(this, f6, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f754f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f754f = pointToPosition;
                a2.a(childAt3, f6 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || pointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f749a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f750b;
                rect.top -= this.f751c;
                rect.right += this.f752d;
                rect.bottom += this.f753e;
                if (i10 >= 33) {
                    z7 = c2.a(this);
                } else {
                    Field field = e2.f740a;
                    if (field != null) {
                        try {
                            z7 = field.getBoolean(this);
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                        }
                    }
                    z7 = false;
                }
                if (childAt3.isEnabled() != z7) {
                    boolean z13 = !z7;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c2.b(this, z13);
                    } else {
                        Field field2 = e2.f740a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f6, f10);
                }
                d2 d2Var = this.f755g;
                if (d2Var != null) {
                    d2Var.f730a = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z5 = true;
                z10 = false;
            }
            if (z5) {
            }
            this.j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f754f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z5) {
            }
            return z5;
        }
        z5 = false;
        if (z5) {
        }
        this.j = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f754f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z5) {
        }
        return z5;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f749a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f759l != null) {
            return;
        }
        super.drawableStateChanged();
        d2 d2Var = this.f755g;
        if (d2Var != null) {
            d2Var.f730a = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f757i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f757i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f757i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f757i && this.f756h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f759l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f759l == null) {
            f2 f2Var = new f2(this, 0);
            this.f759l = f2Var;
            post(f2Var);
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
                if (i5 < 30 || !b2.f709d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        b2.f706a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        b2.f707b.invoke(this, Integer.valueOf(pointToPosition));
                        b2.f708c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f754f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f2 f2Var = this.f759l;
        if (f2Var != null) {
            g2 g2Var = (g2) f2Var.f746b;
            g2Var.f759l = null;
            g2Var.removeCallbacks(f2Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f756h = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d2 d2Var;
        if (drawable != null) {
            d2Var = new d2(drawable);
            d2Var.f730a = true;
        } else {
            d2Var = null;
        }
        this.f755g = d2Var;
        super.setSelector(d2Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f750b = rect.left;
        this.f751c = rect.top;
        this.f752d = rect.right;
        this.f753e = rect.bottom;
    }
}
