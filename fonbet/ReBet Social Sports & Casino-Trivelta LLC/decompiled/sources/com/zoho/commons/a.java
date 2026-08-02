package com.zoho.commons;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zoho.commons.PagerScrollingIndicator;

/* loaded from: classes4.dex */
public class a implements PagerScrollingIndicator.b {

    /* renamed from: a, reason: collision with root package name */
    public PagerScrollingIndicator f42425a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f42426b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayoutManager f42427c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView.h f42428d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView.v f42429e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView.j f42430f;

    /* renamed from: i, reason: collision with root package name */
    public int f42433i;

    /* renamed from: h, reason: collision with root package name */
    public final int f42432h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42431g = true;

    /* renamed from: com.zoho.commons.a$a, reason: collision with other inner class name */
    public class C0606a extends RecyclerView.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerScrollingIndicator f42434a;

        public C0606a(PagerScrollingIndicator pagerScrollingIndicator) {
            this.f42434a = pagerScrollingIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            this.f42434a.setDotCount(a.this.f42428d.getItemCount());
            a.this.n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            a();
        }
    }

    public class b extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PagerScrollingIndicator f42436a;

        public b(PagerScrollingIndicator pagerScrollingIndicator) {
            this.f42436a = pagerScrollingIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            int h10;
            if (i10 == 0 && a.this.m() && (h10 = a.this.h()) != -1) {
                this.f42436a.setDotCount(a.this.f42428d.getItemCount());
                if (h10 < a.this.f42428d.getItemCount()) {
                    this.f42436a.setCurrentPosition(h10);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            a.this.n();
        }
    }

    @Override // com.zoho.commons.PagerScrollingIndicator.b
    public void b() {
        this.f42428d.unregisterAdapterDataObserver(this.f42430f);
        this.f42426b.o1(this.f42429e);
        this.f42433i = 0;
    }

    @Override // com.zoho.commons.PagerScrollingIndicator.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(PagerScrollingIndicator pagerScrollingIndicator, RecyclerView recyclerView) {
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f42427c = linearLayoutManager;
        if (linearLayoutManager.B2() != 0) {
            throw new IllegalStateException("Only HORIZONTAL orientation is supported");
        }
        this.f42426b = recyclerView;
        this.f42428d = recyclerView.getAdapter();
        this.f42425a = pagerScrollingIndicator;
        C0606a c0606a = new C0606a(pagerScrollingIndicator);
        this.f42430f = c0606a;
        this.f42428d.registerAdapterDataObserver(c0606a);
        pagerScrollingIndicator.setDotCount(this.f42428d.getItemCount());
        n();
        b bVar = new b(pagerScrollingIndicator);
        this.f42429e = bVar;
        this.f42426b.n(bVar);
    }

    public final int h() {
        RecyclerView.F Z10;
        for (int i10 = 0; i10 < this.f42426b.getChildCount(); i10++) {
            View childAt = this.f42426b.getChildAt(i10);
            if (childAt.getX() >= k() && childAt.getX() + childAt.getMeasuredWidth() <= l() && (Z10 = this.f42426b.Z(childAt)) != null && Z10.getAdapterPosition() != -1) {
                return Z10.getAdapterPosition();
            }
        }
        return -1;
    }

    public final View i() {
        int Z10 = this.f42427c.Z();
        View view = null;
        if (Z10 == 0) {
            return null;
        }
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < Z10; i11++) {
            View Y10 = this.f42427c.Y(i11);
            int x10 = (int) Y10.getX();
            if (Y10.getMeasuredWidth() + x10 < i10 && Y10.getMeasuredWidth() + x10 > k()) {
                view = Y10;
                i10 = x10;
            }
        }
        return view;
    }

    public final float j() {
        int i10;
        if (this.f42433i == 0) {
            for (int i11 = 0; i11 < this.f42426b.getChildCount(); i11++) {
                View childAt = this.f42426b.getChildAt(i11);
                if (childAt.getMeasuredWidth() != 0) {
                    i10 = childAt.getMeasuredWidth();
                    this.f42433i = i10;
                    break;
                }
            }
        }
        i10 = this.f42433i;
        return i10;
    }

    public final float k() {
        return this.f42431g ? (this.f42426b.getMeasuredWidth() - j()) / 2.0f : this.f42432h;
    }

    public final float l() {
        float f10;
        float j10;
        if (this.f42431g) {
            f10 = (this.f42426b.getMeasuredWidth() - j()) / 2.0f;
            j10 = j();
        } else {
            f10 = this.f42432h;
            j10 = j();
        }
        return f10 + j10;
    }

    public final boolean m() {
        return h() != -1;
    }

    public final void n() {
        int m02;
        View i10 = i();
        if (i10 == null || (m02 = this.f42426b.m0(i10)) == -1) {
            return;
        }
        int itemCount = this.f42428d.getItemCount();
        if (m02 >= itemCount && itemCount != 0) {
            m02 %= itemCount;
        }
        float k10 = (k() - i10.getX()) / i10.getMeasuredWidth();
        if (k10 < 0.0f || k10 > 1.0f || m02 >= itemCount) {
            return;
        }
        this.f42425a.j(m02, k10);
    }
}
