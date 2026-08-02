package ka;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.F0;
import java.util.List;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public abstract class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f54356d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f54357e;

    /* renamed from: f, reason: collision with root package name */
    public int f54358f;

    /* renamed from: g, reason: collision with root package name */
    public int f54359g;

    public e() {
        this.f54356d = new Rect();
        this.f54357e = new Rect();
        this.f54358f = 0;
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // ka.f
    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View L10 = L(coordinatorLayout.m(view));
        if (L10 == null) {
            super.J(coordinatorLayout, view, i10);
            this.f54358f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f54356d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, L10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + L10.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        F0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.k();
            rect.right -= lastWindowInsets.l();
        }
        Rect rect2 = this.f54357e;
        Gravity.apply(R(fVar.f18782c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int M10 = M(L10);
        view.layout(rect2.left, rect2.top - M10, rect2.right, rect2.bottom - M10);
        this.f54358f = rect2.top - L10.getBottom();
    }

    public abstract View L(List list);

    public final int M(View view) {
        if (this.f54359g == 0) {
            return 0;
        }
        float N10 = N(view);
        int i10 = this.f54359g;
        return AbstractC6307a.b((int) (N10 * i10), 0, i10);
    }

    public abstract float N(View view);

    public final int O() {
        return this.f54359g;
    }

    public int P(View view) {
        return view.getMeasuredHeight();
    }

    public final int Q() {
        return this.f54358f;
    }

    public final void S(int i10) {
        this.f54359g = i10;
    }

    public boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View L10;
        F0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (L10 = L(coordinatorLayout.m(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (L10.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m() + lastWindowInsets.j();
        }
        int P10 = size + P(L10);
        int measuredHeight = L10.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            P10 -= measuredHeight;
        }
        coordinatorLayout.F(view, i10, i11, View.MeasureSpec.makeMeasureSpec(P10, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54356d = new Rect();
        this.f54357e = new Rect();
        this.f54358f = 0;
    }
}
