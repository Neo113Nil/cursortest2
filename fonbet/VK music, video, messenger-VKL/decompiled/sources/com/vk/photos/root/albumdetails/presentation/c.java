package com.vk.photos.root.albumdetails.presentation;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.photos.root.albumdetails.presentation.views.AlbumDetailsRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.Pair;
import xsna.aaa0;
import xsna.af1;
import xsna.ah;
import xsna.ah1;
import xsna.ai1;
import xsna.bh1;
import xsna.bi1;
import xsna.bpn0;
import xsna.bwt0;
import xsna.ch1;
import xsna.cn70;
import xsna.d920;
import xsna.dga0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e8;
import xsna.ef1;
import xsna.eha0;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fnj;
import xsna.g6s;
import xsna.gf1;
import xsna.gm50;
import xsna.gyj0;
import xsna.gzs;
import xsna.hb;
import xsna.hf1;
import xsna.hg;
import xsna.hh1;
import xsna.iah0;
import xsna.ih1;
import xsna.ism0;
import xsna.izs;
import xsna.jfi0;
import xsna.jh1;
import xsna.kdg0;
import xsna.krv0;
import xsna.lq;
import xsna.lw2;
import xsna.m33;
import xsna.m4;
import xsna.mg1;
import xsna.oh1;
import xsna.ph1;
import xsna.pn00;
import xsna.pu;
import xsna.qe3;
import xsna.s4;
import xsna.sf1;
import xsna.v20;
import xsna.vh1;
import xsna.w8i;
import xsna.ywu;
import xsna.z7;

/* compiled from: AlbumDetailsMviView.kt */
/* loaded from: classes4.dex */
public final class c implements gm50, w8i {
    public hf1 A;
    public final com.vk.lists.c B;
    public int C;
    public boolean D;
    public k.c E;
    public final androidx.recyclerview.widget.g F;
    public final jfi0<aaa0, k.c.C1491c> G;
    public int H;
    public int I;
    public final Context b;
    public final AlbumDetailsFragment c;
    public final f5z d;
    public k.c.a e;
    public final View f;
    public final AlbumDetailsRecyclerPaginatedView g;
    public final View h;
    public final View i;
    public final RecyclerView j;
    public final PhotoFlowToolbarView k;
    public final PhotoFlowToolbarView l;
    public boolean m;
    public final bh1 n;
    public final ef1 o;
    public final gf1 p;
    public final ph1 q;
    public final ai1 r;
    public final bi1 s;
    public final mg1 t;
    public final d920 u;
    public final Object v;
    public ah1 w;
    public vh1 x;
    public dga0 y;
    public final jh1 z;

    /* compiled from: AlbumDetailsMviView.kt */
    public static final class a extends v {
        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.v
        public final int getVerticalSnapPreference() {
            return -1;
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ RecyclerView c;

        public b(RecyclerView recyclerView) {
            this.c = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            hf1 hf1Var = cVar.A;
            RecyclerView recyclerView = this.c;
            if (hf1Var != null) {
                recyclerView.removeItemDecoration(hf1Var);
            }
            hf1 hf1Var2 = new hf1(cVar.h.getHeight() - cVar.g.getTop());
            cVar.A = hf1Var2;
            recyclerView.addItemDecoration(hf1Var2);
        }
    }

    /* compiled from: AlbumDetailsMviView.kt */
    /* renamed from: com.vk.photos.root.albumdetails.presentation.c$c, reason: collision with other inner class name */
    public static final class C1482c extends GridLayoutManager.c {
        public final /* synthetic */ AlbumDetailsRecyclerPaginatedView e;

        public C1482c(AlbumDetailsRecyclerPaginatedView albumDetailsRecyclerPaginatedView) {
            this.e = albumDetailsRecyclerPaginatedView;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            c cVar = c.this;
            RecyclerView.Adapter z0 = cVar.u.z0(i);
            if (z0 == null) {
                Context context = this.e.getContext();
                HashSet hashSet = iah0.a;
                return (fnj.c(context) || iah0.s(context)) ? 3 : 6;
            }
            gzs gzsVar = (gzs) cVar.v.get(z0);
            Integer num = gzsVar != null ? (Integer) gzsVar.invoke() : null;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public c(Context context, UserId userId, int i, ch1 ch1Var, AlbumDetailsFragment albumDetailsFragment, f5z f5zVar) {
        this.b = context;
        this.c = albumDetailsFragment;
        this.d = f5zVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.album_details_view, (ViewGroup) null);
        this.f = inflate;
        AlbumDetailsRecyclerPaginatedView albumDetailsRecyclerPaginatedView = (AlbumDetailsRecyclerPaginatedView) inflate.findViewById(R.id.content_recycler);
        this.g = albumDetailsRecyclerPaginatedView;
        this.h = inflate.findViewById(R.id.gradient_view);
        this.i = inflate.findViewById(R.id.toolbars_container);
        RecyclerView recyclerView = albumDetailsRecyclerPaginatedView.getRecyclerView();
        this.j = recyclerView;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) inflate.findViewById(R.id.toolbar);
        this.k = photoFlowToolbarView;
        PhotoFlowToolbarView photoFlowToolbarView2 = (PhotoFlowToolbarView) inflate.findViewById(R.id.toolbar_with_title);
        this.l = photoFlowToolbarView2;
        int i2 = 3;
        bpn0 bpn0Var = new bpn0(new hg(this, i2));
        bpn0 bpn0Var2 = new bpn0(new m4(this, 4));
        bh1 bh1Var = new bh1(albumDetailsFragment);
        this.n = bh1Var;
        ef1 ef1Var = new ef1(albumDetailsFragment);
        this.o = ef1Var;
        gf1 gf1Var = new gf1(new pu(this, 5));
        this.p = gf1Var;
        ph1 ph1Var = new ph1(albumDetailsFragment, (kdg0) bpn0Var.getValue(), (eha0) bpn0Var2.getValue());
        this.q = ph1Var;
        ai1 ai1Var = new ai1(new gyj0());
        this.r = ai1Var;
        bi1 bi1Var = new bi1(new ism0());
        this.s = bi1Var;
        mg1 mg1Var = new mg1(new g6s());
        this.t = mg1Var;
        d920 y0 = d920.y0(bh1Var, ef1Var, gf1Var, ph1Var, bi1Var, mg1Var, ai1Var);
        this.u = y0;
        this.v = pn00.k(new Pair(bh1Var, new hh1(this, 0)), new Pair(ef1Var, new s4(this, 2)), new Pair(gf1Var, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 1)), new Pair(ph1Var, new qe3(15)), new Pair(ai1Var, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 1)), new Pair(bi1Var, new qe3(15)), new Pair(mg1Var, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 1)));
        this.z = new jh1(this);
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        this.F = gVar;
        int i3 = 2;
        jfi0<aaa0, k.c.C1491c> jfi0Var = new jfi0<>(albumDetailsRecyclerPaginatedView.getRecyclerView(), f5zVar, new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 1), new hb(this, i3));
        this.G = jfi0Var;
        albumDetailsRecyclerPaginatedView.setAdapter(y0);
        albumDetailsRecyclerPaginatedView.T.add(ph1Var);
        albumDetailsRecyclerPaginatedView.setLoadingViewContentProvider(new lq(i3));
        k();
        this.B = com.vk.lists.f.a(new c.h(new oh1(userId, i, ch1Var, albumDetailsFragment)), albumDetailsRecyclerPaginatedView);
        j();
        photoFlowToolbarView.setTitle("");
        int i4 = 1;
        photoFlowToolbarView.P4(new z7(this, i4));
        int i5 = 2;
        photoFlowToolbarView.setMenuClickListener(new v20(this, i5));
        photoFlowToolbarView.setTitleAutoFocusEnabled(false);
        photoFlowToolbarView2.setTitle("");
        photoFlowToolbarView2.P4(new z7(this, i4));
        photoFlowToolbarView2.setMenuClickListener(new v20(this, i5));
        photoFlowToolbarView2.setTitleAutoFocusEnabled(false);
        photoFlowToolbarView2.T4(R.drawable.vk_icon_more_vertical_24, R.string.album_details_setting_button_content_description);
        photoFlowToolbarView2.setTitleClickListener(new e8(this, i5));
        photoFlowToolbarView.setTitleTalkbackVisible(false);
        recyclerView.addOnScrollListener(new ih1(this));
        recyclerView.addOnItemTouchListener(jfi0Var);
        e();
        if (recyclerView.getItemAnimator() == null) {
            recyclerView.setItemAnimator(gVar);
        }
        y0.registerAdapterDataObserver(new lw2(new ah(this, i2)));
    }

    public final Rect a(Rect rect) {
        View view = this.i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = rect.top;
        view.setLayoutParams(marginLayoutParams);
        rect.top = 0;
        return rect;
    }

    public final void b(k.c.a aVar, RecyclerView recyclerView) {
        this.e = aVar;
        int i = aVar != null ? 2 : 1;
        RecyclerView.n nVar = this.w;
        if (nVar != null) {
            recyclerView.removeItemDecoration(nVar);
        }
        HashSet hashSet = iah0.a;
        Context context = this.b;
        ah1 ah1Var = new ah1(i, (fnj.c(context) || iah0.s(context)) ? 3 : 6, cn70.b(2));
        this.w = ah1Var;
        recyclerView.addItemDecoration(ah1Var);
        RecyclerView.n nVar2 = this.x;
        if (nVar2 != null) {
            recyclerView.removeItemDecoration(nVar2);
        }
        vh1 vh1Var = new vh1(i - 1);
        this.x = vh1Var;
        recyclerView.addItemDecoration(vh1Var);
        RecyclerView.n nVar3 = this.y;
        if (nVar3 != null) {
            recyclerView.removeItemDecoration(nVar3);
        }
        jh1 jh1Var = this.z;
        jh1Var.a = i;
        dga0 dga0Var = new dga0((fnj.c(context) || iah0.s(context)) ? 3 : 6, jh1Var);
        this.y = dga0Var;
        recyclerView.addItemDecoration(dga0Var);
        this.g.addOnLayoutChangeListener(new b(recyclerView));
    }

    public final void c(k kVar) {
        gm50.a.b(this, kVar.b, new sf1(this, 1));
        gm50.a.b(this, kVar.a, new com.vk.im.engine.internal.storage.delegates.messages.b(this, 4));
    }

    public final <T extends RecyclerView.e0> float d(Class<T> cls, izs<? super T, ? extends View> izsVar) {
        RecyclerView recyclerView = this.j;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v == -1 || x == -1 || v > x) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        while (true) {
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
            if (epx.f(findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.getClass() : null, cls)) {
                View invoke = izsVar.invoke(findViewHolderForAdapterPosition);
                Rect b2 = f4m.b(recyclerView);
                Rect b3 = f4m.b(invoke);
                int min = Math.min(b2.bottom, b3.bottom) - Math.max(b2.top, b3.top);
                int height = invoke.getHeight();
                return height != 0 ? min / height : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (v == x) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            v++;
        }
    }

    public final void e() {
        RecyclerView recyclerView = this.j;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (linearLayoutManager != null) {
            int v = linearLayoutManager.v();
            int x = linearLayoutManager.x();
            if (v != -1 && x != -1) {
                View view = null;
                View view2 = null;
                if (v <= x) {
                    while (true) {
                        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                        View findViewByPosition = linearLayoutManager.findViewByPosition(v);
                        if (findViewHolderForAdapterPosition instanceof ywu) {
                            view = findViewByPosition;
                        } else if (findViewHolderForAdapterPosition instanceof af1) {
                            view2 = findViewByPosition;
                        }
                        if (v == x) {
                            break;
                        } else {
                            v++;
                        }
                    }
                }
                Rect b2 = view != null ? f4m.b(view) : null;
                Rect b3 = view2 != null ? f4m.b(view2) : null;
                Rect b4 = f4m.b(recyclerView);
                int i = b2 != null ? b2.top : 0;
                int i2 = b3 != null ? b3.bottom : b2 != null ? b2.bottom : 0;
                if (view != null) {
                    this.H = view.getHeight();
                }
                if (view2 != null) {
                    this.I = view2.getHeight();
                }
                int i3 = this.H + this.I;
                int min = Math.min(b4.bottom, i2) - Math.max(b4.top, i);
                if (i3 != 0) {
                    f = min / i3;
                }
            }
        }
        float pow = (float) Math.pow(1.0f - f, 4.0d);
        boolean z = pow >= 0.05f;
        PhotoFlowToolbarView photoFlowToolbarView = this.l;
        photoFlowToolbarView.setAlpha(pow);
        bwt0.p0(photoFlowToolbarView, z);
        photoFlowToolbarView.setTitleTalkbackVisible(z);
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
        photoFlowToolbarView.setMenuButtonEnabled(linearLayoutManager2 == null || !this.D || linearLayoutManager2.v() >= 2);
    }

    public final boolean f() {
        return this.m;
    }

    public final void g() {
        j();
        vh1 vh1Var = this.x;
        if (vh1Var != null) {
            Paint paint = vh1Var.c;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(krv0.l(R.attr.vk_ui_background_content));
        }
    }

    public final View getView() {
        return this.f;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }

    public final void h() {
        com.vk.lists.c cVar = this.B;
        if (cVar != null) {
            cVar.v();
        }
    }

    public final void i() {
        if (this.E != null) {
            k();
        }
    }

    public final void j() {
        boolean M = dhr0.M();
        Context context = this.b;
        this.h.setBackground(M ? new ColorDrawable(e3m.f(R.attr.vk_ui_background, context)) : m33.a(R.drawable.gradient_background_light, context));
        this.l.setBackground(dhr0.M() ? new ColorDrawable(e3m.f(R.attr.vk_ui_background, context)) : new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context)));
    }

    public final void k() {
        AlbumDetailsRecyclerPaginatedView albumDetailsRecyclerPaginatedView = this.g;
        for (int itemDecorationCount = albumDetailsRecyclerPaginatedView.getRecyclerView().getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
            albumDetailsRecyclerPaginatedView.getRecyclerView().removeItemDecorationAt(itemDecorationCount);
        }
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, albumDetailsRecyclerPaginatedView);
        dVar.f = 1;
        Context context = albumDetailsRecyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        int i = 3;
        if (!fnj.c(context) && !iah0.s(context)) {
            i = 6;
        }
        dVar.c(i);
        dVar.e = new C1482c(albumDetailsRecyclerPaginatedView);
        dVar.a();
        b(this.e, this.j);
    }
}
