package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public final class d0 extends f0 {
    @Override // androidx.recyclerview.widget.f0
    public final int b(View view) {
        return this.a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int e(View view) {
        return this.a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int f() {
        return this.a.getWidth();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.getWidth() - oVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int h() {
        return this.a.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int i() {
        return this.a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int j() {
        return this.a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int k() {
        return this.a.getPaddingLeft();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.getWidth() - oVar.getPaddingLeft()) - oVar.getPaddingRight();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int n(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int o(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.f0
    public final void p(int i) {
        this.a.offsetChildrenHorizontal(i);
    }
}
