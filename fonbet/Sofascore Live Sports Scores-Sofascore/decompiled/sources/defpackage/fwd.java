package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fwd extends gwd {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwd(n nVar, int i) {
        super(nVar);
        this.d = i;
    }

    @Override // defpackage.gwd
    public final int b(View view) {
        int decoratedRight;
        int i;
        int i2 = this.d;
        n nVar = this.a;
        switch (i2) {
            case 0:
                hrf hrfVar = (hrf) view.getLayoutParams();
                decoratedRight = nVar.getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) hrfVar).rightMargin;
                break;
            default:
                hrf hrfVar2 = (hrf) view.getLayoutParams();
                decoratedRight = nVar.getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) hrfVar2).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }

    @Override // defpackage.gwd
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i;
        int i2 = this.d;
        n nVar = this.a;
        switch (i2) {
            case 0:
                hrf hrfVar = (hrf) view.getLayoutParams();
                decoratedMeasuredWidth = nVar.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) hrfVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hrfVar).rightMargin;
                break;
            default:
                hrf hrfVar2 = (hrf) view.getLayoutParams();
                decoratedMeasuredWidth = nVar.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) hrfVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hrfVar2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i;
    }

    @Override // defpackage.gwd
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i;
        int i2 = this.d;
        n nVar = this.a;
        switch (i2) {
            case 0:
                hrf hrfVar = (hrf) view.getLayoutParams();
                decoratedMeasuredHeight = nVar.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) hrfVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hrfVar).bottomMargin;
                break;
            default:
                hrf hrfVar2 = (hrf) view.getLayoutParams();
                decoratedMeasuredHeight = nVar.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) hrfVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hrfVar2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i;
    }

    @Override // defpackage.gwd
    public final int e(View view) {
        int decoratedLeft;
        int i;
        int i2 = this.d;
        n nVar = this.a;
        switch (i2) {
            case 0:
                hrf hrfVar = (hrf) view.getLayoutParams();
                decoratedLeft = nVar.getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) hrfVar).leftMargin;
                break;
            default:
                hrf hrfVar2 = (hrf) view.getLayoutParams();
                decoratedLeft = nVar.getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) hrfVar2).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // defpackage.gwd
    public final int f() {
        switch (this.d) {
            case 0:
                return this.a.getWidth();
            default:
                return this.a.getHeight();
        }
    }

    @Override // defpackage.gwd
    public final int g() {
        int width;
        int paddingRight;
        int i = this.d;
        n nVar = this.a;
        switch (i) {
            case 0:
                width = nVar.getWidth();
                paddingRight = nVar.getPaddingRight();
                break;
            default:
                width = nVar.getHeight();
                paddingRight = nVar.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // defpackage.gwd
    public final int h() {
        switch (this.d) {
            case 0:
                return this.a.getPaddingRight();
            default:
                return this.a.getPaddingBottom();
        }
    }

    @Override // defpackage.gwd
    public final int i() {
        switch (this.d) {
            case 0:
                return this.a.getWidthMode();
            default:
                return this.a.getHeightMode();
        }
    }

    @Override // defpackage.gwd
    public final int j() {
        switch (this.d) {
            case 0:
                return this.a.getHeightMode();
            default:
                return this.a.getWidthMode();
        }
    }

    @Override // defpackage.gwd
    public final int k() {
        switch (this.d) {
            case 0:
                return this.a.getPaddingLeft();
            default:
                return this.a.getPaddingTop();
        }
    }

    @Override // defpackage.gwd
    public final int l() {
        int width;
        int paddingRight;
        int i = this.d;
        n nVar = this.a;
        switch (i) {
            case 0:
                width = nVar.getWidth() - nVar.getPaddingLeft();
                paddingRight = nVar.getPaddingRight();
                break;
            default:
                width = nVar.getHeight() - nVar.getPaddingTop();
                paddingRight = nVar.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // defpackage.gwd
    public final int m(View view) {
        int i = this.d;
        Rect rect = this.c;
        n nVar = this.a;
        switch (i) {
            case 0:
                nVar.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                nVar.getTransformedBoundingBox(view, true, rect);
                return rect.bottom;
        }
    }

    @Override // defpackage.gwd
    public final int n(View view) {
        int i = this.d;
        Rect rect = this.c;
        n nVar = this.a;
        switch (i) {
            case 0:
                nVar.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                nVar.getTransformedBoundingBox(view, true, rect);
                return rect.top;
        }
    }

    @Override // defpackage.gwd
    public final void o(int i) {
        switch (this.d) {
            case 0:
                this.a.offsetChildrenHorizontal(i);
                break;
            default:
                this.a.offsetChildrenVertical(i);
                break;
        }
    }
}
