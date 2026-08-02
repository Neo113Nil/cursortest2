package com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.hints.HintId;
import com.vk.lists.ListDataSet;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.anj;
import xsna.b25;
import xsna.bpn0;
import xsna.bvu;
import xsna.bwt0;
import xsna.c5g;
import xsna.cc6;
import xsna.cn70;
import xsna.dhk0;
import xsna.dw20;
import xsna.f4m;
import xsna.fhc0;
import xsna.fux;
import xsna.gz80;
import xsna.iah0;
import xsna.ihc0;
import xsna.lg;
import xsna.lz2;
import xsna.mg;
import xsna.msy;
import xsna.ndc0;
import xsna.o68;
import xsna.pbc0;
import xsna.pla;
import xsna.qdc0;
import xsna.s3q0;
import xsna.s8;
import xsna.u69;
import xsna.v98;
import xsna.w68;
import xsna.wac0;
import xsna.wvw;
import xsna.xac0;
import xsna.xfc0;
import xsna.y4;

/* compiled from: BottomPanelPostingControllerRedesignImpl.kt */
/* loaded from: classes4.dex */
public final class d implements w68, fux<xac0>, wac0.b {
    public final Context b;
    public final s8 c;
    public final o68 d = new o68();
    public final boolean e;
    public qdc0 f;
    public final b g;
    public RecyclerView h;
    public RecyclerView i;
    public dw20 j;
    public View k;
    public TextView l;
    public ProgressBar m;
    public boolean n;
    public boolean o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final bpn0 s;
    public final Object t;

    public d(qdc0 qdc0Var, b25 b25Var, wvw wvwVar, fhc0 fhc0Var, FragmentActivity fragmentActivity, s8 s8Var, ndc0 ndc0Var) {
        this.b = fragmentActivity;
        this.c = s8Var;
        this.e = ndc0Var.d;
        this.g = new b(this, qdc0Var, b25Var, wvwVar, fhc0Var);
        f fVar = new f(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = msy.a(lazyThreadSafetyMode, fVar);
        this.q = msy.a(lazyThreadSafetyMode, new g(this, 10));
        this.r = msy.a(lazyThreadSafetyMode, new lz2(2));
        this.s = new bpn0(new lg(6));
        this.t = msy.a(lazyThreadSafetyMode, new mg(3));
    }

    @Override // xsna.t68
    public final void G3() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.l.remove(new e.a.b(ButtonPanelPosting.MUSIC_BUTTON_TYPE));
            bVar.d();
        }
    }

    @Override // xsna.t68
    public final void I7() {
        View view = this.k;
        if (view != null) {
            bwt0.p0(view, false);
        }
    }

    @Override // xsna.t68
    public final void Ja(xac0 xac0Var) {
        wac0 wac0Var = this.d.d;
        Iterator it = ((ArrayList) wac0Var.y0()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            xac0 xac0Var2 = (xac0) it.next();
            if (xac0Var.a == (xac0Var2 != null ? xac0Var2.a : -1)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || wac0Var.getItemCount() - 1 <= i) {
            return;
        }
        wac0Var.K0(xac0Var, i + 1, null);
    }

    @Override // xsna.t68
    public final void M3() {
        ihc0 d = d();
        d.f = ihc0.a.a(d.f, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void O5() {
        ihc0 d = d();
        d.b = ihc0.a.a(d.b, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void O7(boolean z) {
        ihc0 d = d();
        d.j = ihc0.a.a(d.j, z, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void Th() {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(R.string.nothing_found);
        }
    }

    @Override // xsna.t68
    public final void Vc(int i) {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            f4m.q(i, recyclerView);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.t68
    public final void Yj(ArrayList arrayList) {
        xfc0 xfc0Var = (xfc0) this.q.getValue();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bvu((String) it.next()));
        }
        xfc0Var.setItems(arrayList2);
    }

    @Override // xsna.t68
    public final void Z9() {
        ihc0 d = d();
        d.i = ihc0.a.a(d.i, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.wac0.b
    public final void b() {
        this.d.b();
    }

    @Override // xsna.t68
    public final void b4() {
        ihc0 d = d();
        d.e = ihc0.a.a(d.e, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    public final void c() {
        Context context;
        RecyclerView recyclerView = this.h;
        if (recyclerView == null || (context = recyclerView.getContext()) == null) {
            return;
        }
        boolean z = false;
        if (!gz80.a(33) ? anj.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 : !(anj.a(context, "android.permission.READ_MEDIA_IMAGES") != 0 || anj.a(context, "android.permission.READ_MEDIA_VIDEO") != 0)) {
            z = true;
        }
        b bVar = this.g;
        if (bVar == null || bVar.j == z) {
            return;
        }
        bVar.j = z;
        if (z) {
            bVar.c();
        } else {
            bVar.b();
            bVar.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.w68
    public final void c6() {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        View view;
        View findViewById;
        int indexOf = ((a) this.p.getValue()).d.indexOf(e.a.AbstractC1393a.b.e);
        RecyclerView recyclerView = this.h;
        if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(indexOf)) == null || (view = findViewHolderForAdapterPosition.itemView) == null || (findViewById = view.findViewById(R.id.icon_button_panel)) == null) {
            return;
        }
        pla.e().b().q(findViewById, HintId.ECOMM_POSTING_ATTACH_BOOKING_OPPORTUNITY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihc0 d() {
        return (ihc0) this.r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jk6
    public final void d3(View view) {
        qdc0 qdc0Var = this.f;
        o68 o68Var = this.d;
        o68Var.e = qdc0Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.posting_poster_preview_recycler_view);
        recyclerView.setLayoutManager(o68Var.c);
        recyclerView.setAdapter(o68Var.d);
        int a = iah0.a(16);
        recyclerView.addItemDecoration(new v98(o68.f, a, a, true));
        o68Var.b = recyclerView;
        bwt0.i0((ImageView) view.findViewById(R.id.ic_close_poster), new com.vk.movika.sdk.base.logic.interactor.e(o68Var, 7));
        this.h = (RecyclerView) view.findViewById(R.id.posting_attach_control);
        ?? r0 = this.p;
        ((a) r0.getValue()).c = true;
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((a) r0.getValue());
        }
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new dhk0(0, 0, cn70.b(8), 0));
        }
        if (this.e) {
            RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.posting_hashtags);
            this.i = recyclerView4;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter((xfc0) this.q.getValue());
            }
            RecyclerView recyclerView5 = this.i;
            if (recyclerView5 != null) {
                recyclerView5.addItemDecoration(new dhk0(0, 0, cn70.b(8), 0));
            }
        }
        this.k = view.findViewById(R.id.posting_mention_hint_container);
        this.l = (TextView) view.findViewById(R.id.posting_bottom_name_hint_text);
        this.m = (ProgressBar) view.findViewById(R.id.posting_bottom_progress_bar);
        c();
        RecyclerView recyclerView6 = this.h;
        if (recyclerView6 != null) {
            bwt0.d0(recyclerView6, true);
        }
        RecyclerView recyclerView7 = this.i;
        if (recyclerView7 != null) {
            bwt0.d0(recyclerView7, true);
        }
        b bVar = this.g;
        if (bVar != null) {
            ArrayList arrayList = bVar.l;
            d dVar = bVar.a;
            if (bVar.i || !bVar.j) {
                dVar.f(arrayList, true);
            } else {
                dVar.f(arrayList, false);
                bVar.c();
            }
            bVar.b.Fh(bVar.m);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(ArrayList arrayList, boolean z) {
        RecyclerView recyclerView;
        ((a) this.p.getValue()).setItems(arrayList);
        if (!z || this.n || this.o || (recyclerView = this.h) == null) {
            return;
        }
        pbc0 pbc0Var = (pbc0) this.s.getValue();
        if (pbc0Var.e) {
            return;
        }
        pbc0Var.e = true;
        y4 y4Var = new y4(18, pbc0Var, recyclerView);
        bwt0.p0(recyclerView, true);
        recyclerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        recyclerView.postDelayed(new u69(3, recyclerView, y4Var), pbc0Var.d);
    }

    @Override // xsna.t68
    public final void f2(boolean z) {
        ProgressBar progressBar = this.m;
        if (progressBar != null) {
            bwt0.p0(progressBar, z);
        }
    }

    @Override // xsna.t68
    public final void f4(boolean z) {
        this.d.d.f4(z);
    }

    @Override // xsna.t68
    public final void g7() {
        ihc0 d = d();
        d.c = ihc0.a.a(d.c, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void gk() {
        ihc0 d = d();
        d.g = ihc0.a.a(d.g, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void ib() {
        this.n = false;
        this.o = false;
        View view = this.k;
        if (view != null) {
            bwt0.p0(view, false);
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, true);
        }
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 != null) {
            bwt0.p0(recyclerView2, false);
        }
        RecyclerView recyclerView3 = this.d.b;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        bwt0.p0(recyclerView3, false);
    }

    @Override // xsna.t68
    public final void km(xac0 xac0Var) {
        wac0 wac0Var = this.d.d;
        ListDataSet listDataSet = (ListDataSet) wac0Var.c;
        if (listDataSet.d.contains(xac0Var)) {
            return;
        }
        wac0Var.f4(false);
        listDataSet.j(0);
        listDataSet.d.add(0, xac0Var);
        listDataSet.f(0);
    }

    @Override // xsna.t68
    public final void l4() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.i = true;
            ArrayList arrayList = bVar.l;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                e eVar = (e) next;
                if (eVar instanceof e.a) {
                    e.a aVar = (e.a) eVar;
                    if (aVar.b() != ButtonPanelPosting.IMAGE_BUTTON_TYPE && aVar.b() != ButtonPanelPosting.MORE_ATTACHMENT_BUTTON_TYPE) {
                        arrayList2.add(next);
                    }
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            bVar.d();
        }
    }

    @Override // xsna.t68
    public final void la(List<xac0> list) {
        this.d.d.setItems(list);
    }

    @Override // xsna.fux
    public final void li(int i, Object obj) {
        xac0 xac0Var = (xac0) obj;
        qdc0 qdc0Var = this.d.e;
        if (qdc0Var != null) {
            qdc0Var.h8(xac0Var);
        }
    }

    @Override // xsna.t68
    public final void mj() {
        dw20 dw20Var = this.j;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    @Override // xsna.wac0.b
    public final void o() {
        this.d.o();
    }

    @Override // xsna.t68
    public final void ol(int i, boolean z) {
        int i2;
        o68 o68Var = this.d;
        wac0 wac0Var = o68Var.d;
        wac0Var.getClass();
        int i3 = i + 1;
        RecyclerView recyclerView = o68Var.b;
        RecyclerView recyclerView2 = recyclerView == null ? null : recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int measuredWidth = recyclerView.getMeasuredWidth() / ((o68.f * 2) + wac0.d.w);
        if (i3 < measuredWidth) {
            i2 = i3;
        } else {
            i2 = i3 + measuredWidth;
            if (wac0Var.getItemCount() < i2) {
                i2 = (measuredWidth / 2) + i3;
            }
        }
        int min = Math.min(i2, Math.max(wac0Var.getItemCount() - 1, 0));
        if (z) {
            recyclerView2.smoothScrollToPosition(min);
        } else {
            recyclerView2.scrollToPosition(min);
        }
        xac0 xac0Var = (xac0) wac0Var.c.c(i);
        if (xac0Var == null) {
            return;
        }
        o68Var.d.K0(xac0Var, i3, null);
        qdc0 qdc0Var = o68Var.e;
        if (qdc0Var != null) {
            qdc0Var.h8(xac0Var);
        }
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.b.wj(bVar.m);
            bVar.f.e();
        }
    }

    @Override // xsna.t68
    public final void onResume() {
        c();
    }

    @Override // xsna.t68
    public final void p4(boolean z) {
        ihc0 d = d();
        d.d = ihc0.a.a(d.d, z, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.t68
    public final void p6() {
        ihc0 d = d();
        d.h = ihc0.a.a(d.h, false, false, 2);
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.dc6
    public final void setPresenter(cc6 cc6Var) {
        this.f = (qdc0) cc6Var;
    }

    @Override // xsna.t68
    public final void vg() {
        this.n = true;
        View view = this.k;
        if (view != null) {
            bwt0.p0(view, false);
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, false);
        }
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 != null) {
            bwt0.p0(recyclerView2, false);
        }
        RecyclerView recyclerView3 = this.d.b;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        bwt0.p0(recyclerView3, true);
    }

    @Override // xsna.t68
    public final void wk() {
        ProgressBar progressBar;
        this.n = false;
        View view = this.k;
        if (view != null && !bwt0.K(view) && (progressBar = this.m) != null) {
            bwt0.p0(progressBar, false);
        }
        View view2 = this.k;
        if (view2 != null) {
            bwt0.p0(view2, true);
        }
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, false);
        }
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 != null) {
            bwt0.p0(recyclerView2, false);
        }
    }

    @Override // xsna.t68
    public final void y9() {
        this.n = false;
        this.o = true;
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, false);
        }
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 != null) {
            bwt0.p0(recyclerView2, true);
        }
    }

    @Override // xsna.t68
    public final void yj(xac0 xac0Var) {
        o68 o68Var = this.d;
        LinearLayoutManager linearLayoutManager = o68Var.c;
        wac0 wac0Var = o68Var.d;
        int i = wac0Var.h;
        Iterator it = ((ArrayList) wac0Var.y0()).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            xac0 xac0Var2 = (xac0) it.next();
            if (xac0Var.a == (xac0Var2 != null ? xac0Var2.a : -1)) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        RecyclerView recyclerView = o68Var.b;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        if (s > i3 || i3 > w) {
            recyclerView.smoothScrollToPosition(i3);
            return;
        }
        int i4 = wac0.d.w + o68.f;
        int i5 = i <= i3 ? 1 : -1;
        recyclerView.scrollToPosition(i);
        recyclerView.smoothScrollBy(i4 * i5, 0);
    }

    @Override // xsna.t68
    public final void zl() {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(R.string.posting_name_or_address);
        }
    }

    @Override // xsna.t68
    public final void Pi(int i) {
    }

    @Override // xsna.t68
    public final void k2(boolean z) {
    }

    @Override // xsna.t68
    public final void n6(int i) {
    }
}
