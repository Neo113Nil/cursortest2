package com.vk.voip.ui.onboarding.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.movika.sdk.base.observable.c;
import com.vk.voip.ui.groupcalls.grid.dots.GridPaginationDotsView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.subjects.f;
import xsna.agu;
import xsna.bwt0;
import xsna.cn70;
import xsna.d39;
import xsna.go1;
import xsna.n69;
import xsna.p69;
import xsna.q69;
import xsna.r69;
import xsna.t69;

/* compiled from: CallOnboardingView.kt */
/* loaded from: classes7.dex */
public final class CallOnboardingView extends LinearLayout {
    public static final /* synthetic */ int j = 0;
    public final ViewPager2 b;
    public final GridPaginationDotsView c;
    public final agu d;
    public final d39 e;
    public final b f;
    public n69 g;
    public final a h;
    public final f<r69> i;

    /* compiled from: CallOnboardingView.kt */
    public final class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            CallOnboardingView.a(CallOnboardingView.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void c(int i, int i2) {
            CallOnboardingView.a(CallOnboardingView.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void d(int i, int i2, Object obj) {
            CallOnboardingView.a(CallOnboardingView.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            CallOnboardingView.a(CallOnboardingView.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void f(int i, int i2) {
            CallOnboardingView.a(CallOnboardingView.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            CallOnboardingView.a(CallOnboardingView.this);
        }
    }

    public CallOnboardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        q69 q69Var = new q69(1, this, CallOnboardingView.class, "publishOnboardingViewEvent", "publishOnboardingViewEvent(Lcom/vk/voip/ui/onboarding/model/CallOnboardingViewEvent;)V", 0, 0);
        d39 d39Var = new d39();
        d39Var.x0(t69.a.C3724a.class, new c(q69Var, 13));
        d39Var.x0(t69.a.b.class, new go1(q69Var, 13));
        d39Var.setHasStableIds(true);
        this.e = d39Var;
        this.f = new b();
        this.h = new a();
        this.i = new f<>();
        LayoutInflater.from(context).inflate(R.layout.voip_onboarding_view, (ViewGroup) this, true);
        setOrientation(1);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.voip_onboarding_view_pager);
        this.b = viewPager2;
        viewPager2.setAdapter(d39Var);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setPageTransformer(new androidx.viewpager2.widget.c(cn70.b(8)));
        GridPaginationDotsView gridPaginationDotsView = (GridPaginationDotsView) findViewById(R.id.voip_onboarding_dots);
        this.c = gridPaginationDotsView;
        this.d = new agu(viewPager2, gridPaginationDotsView);
        viewPager2.setCurrentItem(0);
    }

    public static final void a(CallOnboardingView callOnboardingView) {
        bwt0.p0(callOnboardingView.c, callOnboardingView.e.getItemCount() > 1);
        callOnboardingView.b.postDelayed(new p69(callOnboardingView, 0), 50L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a();
        this.e.registerAdapterDataObserver(this.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b();
        this.e.unregisterAdapterDataObserver(this.h);
    }
}
