package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f2419b;

    public /* synthetic */ h1(k1 k1Var, int i5) {
        this.f2418a = i5;
        this.f2419b = k1Var;
    }

    @Override // androidx.recyclerview.widget.p2
    public final int a(View view) {
        int decoratedLeft;
        int i5;
        switch (this.f2418a) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedLeft = this.f2419b.getDecoratedLeft(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).leftMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedLeft = this.f2419b.getDecoratedTop(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).topMargin;
                break;
        }
        return decoratedLeft - i5;
    }

    @Override // androidx.recyclerview.widget.p2
    public final int b() {
        switch (this.f2418a) {
            case 0:
                return this.f2419b.getPaddingLeft();
            default:
                return this.f2419b.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public final int c() {
        int width;
        int paddingRight;
        switch (this.f2418a) {
            case 0:
                k1 k1Var = this.f2419b;
                width = k1Var.getWidth();
                paddingRight = k1Var.getPaddingRight();
                break;
            default:
                k1 k1Var2 = this.f2419b;
                width = k1Var2.getHeight();
                paddingRight = k1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.p2
    public final View d(int i5) {
        switch (this.f2418a) {
        }
        return this.f2419b.getChildAt(i5);
    }

    @Override // androidx.recyclerview.widget.p2
    public final int e(View view) {
        int decoratedRight;
        int i5;
        switch (this.f2418a) {
            case 0:
                l1 l1Var = (l1) view.getLayoutParams();
                decoratedRight = this.f2419b.getDecoratedRight(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var).rightMargin;
                break;
            default:
                l1 l1Var2 = (l1) view.getLayoutParams();
                decoratedRight = this.f2419b.getDecoratedBottom(view);
                i5 = ((ViewGroup.MarginLayoutParams) l1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i5;
    }
}
