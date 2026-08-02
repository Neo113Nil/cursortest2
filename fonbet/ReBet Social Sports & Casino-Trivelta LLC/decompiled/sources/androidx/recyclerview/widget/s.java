package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.q f23213a;

    /* renamed from: b, reason: collision with root package name */
    public int f23214b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f23215c;

    public class a extends s {
        public a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f23213a.j0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f23213a.i0(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f23213a.h0(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f23213a.g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f23213a.z0();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f23213a.z0() - this.f23213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f23213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int k() {
            return this.f23213a.A0();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f23213a.n0();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f23213a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return (this.f23213a.z0() - this.f23213a.getPaddingLeft()) - this.f23213a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.s
        public int p(View view) {
            this.f23213a.y0(view, true, this.f23215c);
            return this.f23215c.right;
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f23213a.y0(view, true, this.f23215c);
            return this.f23215c.left;
        }

        @Override // androidx.recyclerview.widget.s
        public void r(int i10) {
            this.f23213a.P0(i10);
        }
    }

    public class b extends s {
        public b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.s
        public int d(View view) {
            return this.f23213a.e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f23213a.h0(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f23213a.i0(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int g(View view) {
            return this.f23213a.k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.s
        public int h() {
            return this.f23213a.m0();
        }

        @Override // androidx.recyclerview.widget.s
        public int i() {
            return this.f23213a.m0() - this.f23213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int j() {
            return this.f23213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int k() {
            return this.f23213a.n0();
        }

        @Override // androidx.recyclerview.widget.s
        public int l() {
            return this.f23213a.A0();
        }

        @Override // androidx.recyclerview.widget.s
        public int m() {
            return this.f23213a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.s
        public int n() {
            return (this.f23213a.m0() - this.f23213a.getPaddingTop()) - this.f23213a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.s
        public int p(View view) {
            this.f23213a.y0(view, true, this.f23215c);
            return this.f23215c.bottom;
        }

        @Override // androidx.recyclerview.widget.s
        public int q(View view) {
            this.f23213a.y0(view, true, this.f23215c);
            return this.f23215c.top;
        }

        @Override // androidx.recyclerview.widget.s
        public void r(int i10) {
            this.f23213a.Q0(i10);
        }
    }

    public /* synthetic */ s(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static s a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static s b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static s c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f23214b) {
            return 0;
        }
        return n() - this.f23214b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f23214b = n();
    }

    public s(RecyclerView.q qVar) {
        this.f23214b = Integer.MIN_VALUE;
        this.f23215c = new Rect();
        this.f23213a = qVar;
    }
}
