package com.vk.im.ui.components.contacts;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.im.ui.views.EmptyViewForList;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.flowable.c0;
import io.reactivex.rxjava3.internal.operators.flowable.h;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.v0;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.x;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.a6p;
import xsna.aiv0;
import xsna.asu0;
import xsna.b25;
import xsna.b60;
import xsna.bzb0;
import xsna.ci3;
import xsna.cq8;
import xsna.cwb0;
import xsna.d02;
import xsna.d3m;
import xsna.ddj;
import xsna.drm0;
import xsna.dxh;
import xsna.ecw;
import xsna.edj;
import xsna.epx;
import xsna.ey0;
import xsna.f4m;
import xsna.fdj;
import xsna.ffe0;
import xsna.fpf0;
import xsna.g9e0;
import xsna.gbj;
import xsna.hfz;
import xsna.i4e;
import xsna.im0;
import xsna.j8i;
import xsna.jm0;
import xsna.jwg0;
import xsna.k15;
import xsna.k9u0;
import xsna.kl6;
import xsna.kwg0;
import xsna.l1i;
import xsna.l980;
import xsna.ldi0;
import xsna.m3g;
import xsna.m84;
import xsna.ms9;
import xsna.msy;
import xsna.mxv;
import xsna.o0r0;
import xsna.o0w;
import xsna.o25;
import xsna.o44;
import xsna.oce;
import xsna.owi;
import xsna.p680;
import xsna.pp3;
import xsna.q2a0;
import xsna.qcy;
import xsna.qtd0;
import xsna.qv20;
import xsna.s8j;
import xsna.sbg;
import xsna.swa;
import xsna.sxp;
import xsna.t8j;
import xsna.tbg;
import xsna.tp1;
import xsna.v71;
import xsna.wf1;
import xsna.xwk;
import xsna.xxh;
import xsna.ycj;
import xsna.yk;
import xsna.zl0;

/* compiled from: ContactsSearchComponent.kt */
/* loaded from: classes2.dex */
public final class c extends j8i implements f<sxp> {
    public static final /* synthetic */ qcy<Object>[] C;
    public final b A;
    public ImContactsListFragment.d B;
    public final a1w i;
    public final mxv j;
    public final b25 k;
    public final Context l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final a6p p;
    public final boolean q;
    public final LayoutInflater v;
    public final Object y;
    public final Object z;
    public final Object r = new Object();
    public final long s = 300;
    public final io.reactivex.rxjava3.disposables.b t = new io.reactivex.rxjava3.disposables.b();
    public final a u = new a();
    public final g9e0 w = new g9e0(new tbg(this, 11));
    public final LinkedHashMap x = new LinkedHashMap();

    /* compiled from: ContactsSearchComponent.kt */
    public static final class b {
        public String a;
        public List<t8j> b;

        public b() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(query=");
            sb.append((Object) this.a);
            sb.append(", profiles=");
            return ms9.a(')', sb, this.b);
        }

        public b(Object obj) {
            EmptyList emptyList = EmptyList.b;
            this.a = "";
            this.b = emptyList;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(c.class, "vc", "getVc()Lcom/vk/im/ui/components/contacts/vc/ContactsSearchVc;", 0);
        fpf0.a.getClass();
        C = new qcy[]{propertyReference1Impl};
    }

    public c(a1w a1wVar, mxv mxvVar, b25 b25Var, Context context, boolean z, boolean z2, boolean z3, a6p a6pVar, boolean z4) {
        this.i = a1wVar;
        this.j = mxvVar;
        this.k = b25Var;
        this.l = context;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = a6pVar;
        this.q = z4;
        this.v = LayoutInflater.from(context);
        m3g m3gVar = new m3g(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, m3gVar);
        this.z = msy.a(lazyThreadSafetyMode, new im0(this, 27));
        this.A = new b(null);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.w.d();
        final ddj Y0 = Y0();
        Y0.getClass();
        Y0.z = new bzb0(layoutInflater.getContext());
        viewStub.setLayoutResource(R.layout.vkim_search_contacts);
        viewStub.setLayoutInflater(Y0.o);
        View inflate = viewStub.inflate();
        Y0.r = inflate;
        ViewStub viewStub2 = (ViewStub) inflate.findViewById(R.id.im_appbar_stub);
        ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            viewStub2.setLayoutResource(R.layout.vkim_search_contacts_appbar);
            viewStub2.inflate();
            View view = Y0.r;
            if (view == null) {
                view = null;
            }
            VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.im_toolbar);
            Y0.v = vkTopBar;
            vkTopBar.setBack(new VkTopBar.b(new gbj(Y0, 1), null, null, null, null, 30));
            Y0.g();
            View view2 = Y0.r;
            if (view2 == null) {
                view2 = null;
            }
            Y0.s = new edj(new ecw(view2.findViewById(R.id.im_appbar)));
            View view3 = Y0.r;
            if (view3 == null) {
                view3 = null;
            }
            f4m.j(view3.findViewById(R.id.shadow));
        } else {
            viewStub2.setLayoutResource(R.layout.vkim_search_contacts_appbar_old);
            viewStub2.inflate();
            View view4 = Y0.r;
            if (view4 == null) {
                view4 = null;
            }
            VkSearchView vkSearchView = (VkSearchView) view4.findViewById(R.id.vkim_search);
            Y0.w = vkSearchView;
            vkSearchView.setOnBackClickListener(new ey0(Y0, 27));
            VkSearchView vkSearchView2 = Y0.w;
            if (vkSearchView2 == null) {
                vkSearchView2 = null;
            }
            Y0.A = d02.y(vkSearchView2, 0L, 3).subscribe(new wf1(new oce(Y0, 12), 18));
            VkSearchView vkSearchView3 = Y0.w;
            if (vkSearchView3 == null) {
                vkSearchView3 = null;
            }
            View view5 = Y0.r;
            if (view5 == null) {
                view5 = null;
            }
            Y0.s = new fdj(new aiv0(view5.findViewById(R.id.vkim_search_shadow), vkSearchView3));
        }
        View view6 = Y0.r;
        if (view6 == null) {
            view6 = null;
        }
        Y0.t = view6.findViewById(R.id.vkim_background_view);
        layoutInflater.getContext();
        View view7 = Y0.r;
        if (view7 == null) {
            view7 = null;
        }
        EmptyViewForList emptyViewForList = (EmptyViewForList) view7.findViewById(R.id.vkim_empty);
        emptyViewForList.getContext();
        emptyViewForList.setText(emptyViewForList.getContext().getString(R.string.vkim_msg_search_empty));
        Y0.u = emptyViewForList;
        View view8 = Y0.r;
        if (view8 == null) {
            view8 = null;
        }
        Y0.x = view8.findViewById(R.id.vkim_empty_container);
        View view9 = Y0.r;
        if (view9 == null) {
            view9 = null;
        }
        FrameLayout frameLayout = (FrameLayout) view9.findViewById(R.id.vkim_list_container);
        Y0.y = frameLayout;
        frameLayout.addView(Y0.b(layoutInflater, viewGroup));
        View view10 = Y0.t;
        if (view10 == null) {
            view10 = null;
        }
        view10.setOnClickListener(new o44(0));
        View view11 = Y0.t;
        if (view11 == null) {
            view11 = null;
        }
        view11.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.cdj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view12, MotionEvent motionEvent) {
                return ddj.this.B.onTouchEvent(motionEvent);
            }
        });
        View view12 = Y0.r;
        if (view12 == null) {
            view12 = null;
        }
        Y0().c(EmptyList.b, SortOrder.BY_NAME, null);
        return view12;
    }

    @Override // xsna.j8i
    public final void N0() {
        ddj Y0 = Y0();
        Y0.h.removeCallbacksAndMessages(Y0.g);
        FrameLayout frameLayout = Y0.y;
        if (frameLayout == null) {
            frameLayout = null;
        }
        d3m.b(frameLayout, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        View view = Y0.x;
        if (view == null) {
            view = null;
        }
        d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        View view2 = Y0.t;
        if (view2 == null) {
            view2 = null;
        }
        d3m.b(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        ddj.b bVar = Y0.s;
        (bVar != null ? bVar : null).cancel();
        io.reactivex.rxjava3.disposables.c cVar = Y0.A;
        if (cVar != null) {
            cVar.dispose();
        }
        this.w.a();
        owi.b(this.r);
    }

    @Override // xsna.j8i
    public final void Q0() {
        a1w a1wVar = this.i;
        k15.e(a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(this), this);
        I0(a1wVar.l.a().b0(l980.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(this));
    }

    @Override // xsna.j8i
    public final void R0() {
        this.t.e();
    }

    public final l2 X0(CharSequence charSequence) {
        charSequence.toString();
        a6p a6pVar = this.p;
        x a2 = a6pVar.a();
        charSequence.toString();
        g u = io.reactivex.rxjava3.core.x.x(a6pVar.b()).u();
        ffe0 u2 = a2.u();
        int i = g.b;
        return new v0(new c0(new h(new ffe0[]{u, u2}), new tp1(new ci3(17), 9))).r0(asu0.a.c());
    }

    public final ddj Y0() {
        qcy<Object> qcyVar = C[0];
        return (ddj) this.w.b();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void Z0(CharSequence charSequence) {
        l2 r0;
        b bVar = this.A;
        if (!epx.f(drm0.p0(bVar.a), drm0.p0(charSequence))) {
            String obj = charSequence.toString();
            bVar.a = obj;
            EmptyList emptyList = EmptyList.b;
            bVar.b = emptyList;
            if (obj.length() == 0) {
                Y0().c(emptyList, SortOrder.BY_HINTS, null);
                return;
            }
        }
        io.reactivex.rxjava3.disposables.b bVar2 = this.t;
        bVar2.e();
        boolean booleanValue = ((Boolean) this.y.getValue()).booleanValue();
        b25 b25Var = this.k;
        if (booleanValue && o25.b(b25Var)) {
            r0 = X0(charSequence);
        } else if (o25.b(b25Var)) {
            r0 = X0(charSequence);
        } else {
            ycj ycjVar = new ycj(charSequence.toString(), Source.CACHE, this.m, this.n, this.o, null, null, 96);
            ycj ycjVar2 = new ycj(charSequence.toString(), Source.NETWORK, this.m, this.n, false, null, null, 96);
            a1w a1wVar = this.i;
            r0 = new v0(io.reactivex.rxjava3.core.x.e(a1wVar.C(this, ycjVar), a1wVar.C(this, ycjVar2))).r0(asu0.a.c());
        }
        bVar2.b(new a0(new io.reactivex.rxjava3.internal.operators.observable.c0(r0.a0(asu0.a.d()), new kl6(new jm0(this, 21), 10), io.reactivex.rxjava3.internal.functions.a.c), new v71(this, 2)).subscribe(new pp3(new i4e(this, 18), 15), new zl0(new dxh(this, 2), 17)));
    }

    public final boolean a1() {
        if (!this.w.c()) {
            return false;
        }
        ddj.b bVar = Y0().s;
        if (bVar == null) {
            bVar = null;
        }
        return bVar.c() || Y0().f();
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(sxp sxpVar) {
        sxp sxpVar2 = sxpVar;
        if (epx.f(sxpVar2.a(), "ContactsListComponent")) {
            return;
        }
        boolean z = sxpVar2 instanceof OnCacheInvalidateEvent;
        long j = this.s;
        Object obj = this.r;
        if (z) {
            owi.a(obj, j, new l1i(this, 2));
            return;
        }
        if (sxpVar2 instanceof p680) {
            owi.a(obj, j, new sbg(this, 12));
        } else if ((sxpVar2 instanceof l980) && this.w.c()) {
            Y0().f();
        }
    }

    public final void b1() {
        ddj Y0 = Y0();
        View view = Y0.r;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        ddj.b bVar = Y0.s;
        if (bVar == null) {
            bVar = null;
        }
        bVar.a();
        View view2 = Y0.t;
        if (view2 == null) {
            view2 = null;
        }
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view3 = Y0.t;
        d3m.c(view3 == null ? null : view3, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view4 = Y0.x;
        f4m.j(view4 != null ? view4 : null);
    }

    /* compiled from: ContactsSearchComponent.kt */
    public final class a implements ddj.a {
        public a() {
        }

        @Override // xsna.l270, xsna.e8g0
        public final void b() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.i8j
        public final boolean d() {
            return false;
        }

        @Override // xsna.e960
        public final void f(List list) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.ddj.a
        public final void g(CharSequence charSequence) {
            c cVar = c.this;
            owi.a(cVar.r, cVar.s, new m84(8, cVar, charSequence));
        }

        @Override // xsna.i8j
        public final void h(t8j t8jVar) {
            if (t8jVar.c != 5) {
                y(t8jVar.b);
                return;
            }
            c cVar = c.this;
            ddj Y0 = cVar.Y0();
            yk ykVar = new yk(5, t8jVar, cVar);
            bzb0 bzb0Var = Y0.z;
            if (bzb0Var == null) {
                bzb0Var = null;
            }
            bzb0.d(bzb0Var, cwb0.c0.l, ykVar, null, null, 28);
        }

        @Override // xsna.ddj.a
        public final void i() {
            ImContactsListFragment.d dVar = c.this.B;
            if (dVar != null) {
                ImContactsListFragment imContactsListFragment = ImContactsListFragment.this;
                qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
                ((AppBarLayout.d) imContactsListFragment.ho().getLayoutParams()).a = imContactsListFragment.e0;
                imContactsListFragment.ho().requestLayout();
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                if (com.vk.toggle.b.A.a(imFeatures)) {
                    AppBarLayout appBarLayout = imContactsListFragment.Y;
                    d3m.c(appBarLayout != null ? appBarLayout : null, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    TextView textView = imContactsListFragment.U;
                    d3m.c(textView != null ? textView : null, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        }

        @Override // xsna.i8j
        public final boolean k(t8j t8jVar) {
            return t8jVar.k || t8jVar.m != null;
        }

        @Override // xsna.i8j
        public final void l(String str) {
            c cVar = c.this;
            qtd0 qtd0Var = (qtd0) cVar.x.get(str);
            UserId L = cVar.k.L();
            if (qtd0Var != null) {
                y(qtd0Var);
                return;
            }
            b0 m = cVar.i.C(this, new s8j(str, L)).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b());
            b60 b60Var = new b60(new xxh(cVar, str, this, 2), 17);
            int i = kwg0.a;
            cVar.I0(m.subscribe(b60Var, new jwg0("ContactsSearchComponent")));
        }

        @Override // xsna.i8j
        public final boolean m(qtd0 qtd0Var) {
            return o25.b(c.this.k) && qtd0Var.q9().b;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.i8j
        public final boolean n() {
            return ((Boolean) c.this.z.getValue()).booleanValue();
        }

        @Override // xsna.dp8
        public final void q(cq8 cq8Var) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.ddj.a
        public final boolean r() {
            return c.this.A.a.length() > 0;
        }

        @Override // xsna.l270
        public final void s() {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.gei0
        public final boolean t(ldi0.b bVar) {
            return true;
        }

        @Override // xsna.e960
        public final void u(List list) {
            throw new UnsupportedOperationException();
        }

        @Override // xsna.i8j
        public final void w(t8j t8jVar, boolean z) {
            if (c.this.B != null) {
                qtd0 qtd0Var = t8jVar.b;
            }
        }

        @Override // xsna.i8j
        public final boolean x(t8j t8jVar) {
            c.this.k.a(new UserId(t8jVar.b.G3()));
            return false;
        }

        public final void y(qtd0 qtd0Var) {
            c cVar = c.this;
            mxv mxvVar = cVar.j;
            Context context = cVar.l;
            if (BuildInfo.g()) {
                xwk.e().m(context, new UserId(qtd0Var.G3()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            } else if (qtd0Var.t8() != Peer.Type.UNKNOWN) {
                o0w.x(mxvVar.b(), cVar.l, null, qtd0Var.G3(), qv20.m(qtd0Var), null, null, false, null, null, null, null, null, null, "conversations_search", null, null, null, false, null, null, null, null, null, 1073733618);
            } else {
                mxvVar.getClass();
                k9u0.a.g(context, (q2a0) qtd0Var);
            }
        }

        @Override // xsna.l270
        public final void e() {
        }

        @Override // xsna.lfp
        public final void v() {
        }

        @Override // xsna.wej.a
        public final void a(boolean z) {
        }

        @Override // xsna.i8j
        public final void c(t8j t8jVar) {
        }

        @Override // xsna.gei0
        public final void j(ldi0 ldi0Var) {
        }

        @Override // xsna.leb
        public final void o(swa swaVar) {
        }

        @Override // xsna.wej.a
        public final void p(List<? extends hfz> list) {
        }
    }
}
