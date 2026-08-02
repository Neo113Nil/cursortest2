package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes12.dex */
public final class e0 extends f0 {
    public e0(RecyclerView.o oVar) {
        super(oVar);
    }

    @Override // androidx.recyclerview.widget.f0
    public final int b(View view) {
        return this.a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int e(View view) {
        return this.a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int f() {
        return this.a.getHeight();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.getHeight() - oVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int h() {
        return this.a.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int i() {
        return this.a.getHeightMode();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int j() {
        return this.a.getWidthMode();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int k() {
        return this.a.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.getHeight() - oVar.getPaddingTop()) - oVar.getPaddingBottom();
    }

    @Override // androidx.recyclerview.widget.f0
    public final int n(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.getTransformedBoundingBox(view, true, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int o(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.getTransformedBoundingBox(view, true, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.f0
    public final void p(int i) {
        this.a.offsetChildrenVertical(i);
    }
}
