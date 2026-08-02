package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(k1 k1Var, int i5) {
        super(k1Var);
        this.f2508d = i5;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int b(View view) {
        int decoratedRight;
        int i5;
        switch (this.f2508d) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedRight = this.f2514a.getDecoratedRight(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedRight = this.f2514a.getDecoratedBottom(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i5;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i5;
        switch (this.f2508d) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f2514a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) l1Var).leftMargin;
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f2514a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) l1Var2).topMargin;
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i5;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i5;
        switch (this.f2508d) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f2514a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) l1Var).topMargin;
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f2514a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) l1Var2).leftMargin;
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i5;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int e(View view) {
        int decoratedLeft;
        int i5;
        switch (this.f2508d) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedLeft = this.f2514a.getDecoratedLeft(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedLeft = this.f2514a.getDecoratedTop(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).topMargin;
                break;
        }
        return decoratedLeft - i5;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int f() {
        switch (this.f2508d) {
            case 0:
                return this.f2514a.getWidth();
            default:
                return this.f2514a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int g() {
        int width;
        int paddingRight;
        switch (this.f2508d) {
            case 0:
                k1 k1Var = this.f2514a;
                width = k1Var.getWidth();
                paddingRight = k1Var.getPaddingRight();
                break;
            default:
                k1 k1Var2 = this.f2514a;
                width = k1Var2.getHeight();
                paddingRight = k1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int h() {
        switch (this.f2508d) {
            case 0:
                return this.f2514a.getPaddingRight();
            default:
                return this.f2514a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int i() {
        switch (this.f2508d) {
            case 0:
                return this.f2514a.getWidthMode();
            default:
                return this.f2514a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int j() {
        switch (this.f2508d) {
            case 0:
                return this.f2514a.getHeightMode();
            default:
                return this.f2514a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int k() {
        switch (this.f2508d) {
            case 0:
                return this.f2514a.getPaddingLeft();
            default:
                return this.f2514a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int l() {
        int width;
        int paddingRight;
        switch (this.f2508d) {
            case 0:
                k1 k1Var = this.f2514a;
                width = k1Var.getWidth() - k1Var.getPaddingLeft();
                paddingRight = k1Var.getPaddingRight();
                break;
            default:
                k1 k1Var2 = this.f2514a;
                width = k1Var2.getHeight() - k1Var2.getPaddingTop();
                paddingRight = k1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.q0
    public final int m(View view) {
        switch (this.f2508d) {
            case 0:
                k1 k1Var = this.f2514a;
                Rect rect = this.f2516c;
                k1Var.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                k1 k1Var2 = this.f2514a;
                Rect rect2 = this.f2516c;
                k1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final int n(View view) {
        switch (this.f2508d) {
            case 0:
                k1 k1Var = this.f2514a;
                Rect rect = this.f2516c;
                k1Var.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                k1 k1Var2 = this.f2514a;
                Rect rect2 = this.f2516c;
                k1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final void o(int i5) {
        switch (this.f2508d) {
            case 0:
                this.f2514a.offsetChildrenHorizontal(i5);
                break;
            default:
                this.f2514a.offsetChildrenVertical(i5);
                break;
        }
    }
}
