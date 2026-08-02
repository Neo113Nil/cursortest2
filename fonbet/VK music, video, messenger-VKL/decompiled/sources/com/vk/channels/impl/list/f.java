package com.vk.channels.impl.list;

import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import com.vk.channels.impl.list.domain.PinnedChannelsLimitExceededException;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.g;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.movika.sdk.base.flow.binding.j;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.ImFeatures;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e0;
import defpackage.f0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a3n0;
import xsna.ahb;
import xsna.ao50;
import xsna.bgb;
import xsna.bhb;
import xsna.bpn0;
import xsna.bzb0;
import xsna.cau0;
import xsna.cgb;
import xsna.cn70;
import xsna.cwb0;
import xsna.d26;
import xsna.dj1;
import xsna.egp;
import xsna.enj;
import xsna.ezy;
import xsna.f3n0;
import xsna.f4m;
import xsna.f5z;
import xsna.fcf0;
import xsna.fi6;
import xsna.g2v;
import xsna.gcf0;
import xsna.ge0;
import xsna.hfz;
import xsna.hg1;
import xsna.i2n0;
import xsna.ikv0;
import xsna.iv1;
import xsna.j0b;
import xsna.j5g;
import xsna.k0b;
import xsna.k41;
import xsna.k9;
import xsna.kwg0;
import xsna.lgb;
import xsna.ncf0;
import xsna.ng1;
import xsna.nk0;
import xsna.nu2;
import xsna.q5u0;
import xsna.qcf0;
import xsna.qgh0;
import xsna.qj0;
import xsna.r41;
import xsna.rew;
import xsna.spz;
import xsna.t00;
import xsna.t40;
import xsna.u930;
import xsna.uqj0;
import xsna.uta;
import xsna.uyv;
import xsna.vc80;
import xsna.ve0;
import xsna.vyv;
import xsna.w8m;
import xsna.wul;
import xsna.wyv;
import xsna.xpz;
import xsna.xrn;
import xsna.yn50;
import xsna.yza;
import xsna.zgb;
import xsna.zk70;

/* compiled from: ChannelsListViewController.kt */
/* loaded from: classes16.dex */
public final class f extends fi6<bhb, e> implements lgb {
    public final bzb0 f;
    public final i2n0 g;
    public final f5z h;
    public RecyclerView i;
    public cgb j;
    public a k;
    public final io.reactivex.rxjava3.subjects.f<hfz> l;
    public io.reactivex.rxjava3.disposables.c m;
    public final Context n;
    public final bpn0 o;
    public final Resources p;

    /* compiled from: ChannelsListViewController.kt */
    public final class a extends vc80 {
        public final RecyclerView f;

        public a(RecyclerView recyclerView) {
            this.f = recyclerView;
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            f fVar = f.this;
            if (i2 < i3 && i2 >= i3 - 61) {
                fVar.getClass();
                fVar.O(e.C0538e.b);
            }
            if (i == -1 || i2 == -1) {
                return;
            }
            fVar.getClass();
            if (i < 0 || i > i2) {
                return;
            }
            cgb cgbVar = fVar.j;
            if (cgbVar == null) {
                cgbVar = null;
            }
            if (i2 <= cgbVar.h.f.size()) {
                cgb cgbVar2 = fVar.j;
                Iterator<T> it = (cgbVar2 != null ? cgbVar2 : null).h.f.subList(i, i2).iterator();
                while (it.hasNext()) {
                    fVar.l.onNext((hfz) it.next());
                }
            }
        }
    }

    /* compiled from: ChannelsListViewController.kt */
    public final class b implements d.b<hfz> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public final void a(List<hfz> list, List<hfz> list2) {
            if (list.size() != list2.size()) {
                a aVar = f.this.k;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.onScrolled(aVar.f, 0, 0);
            }
        }
    }

    public f(bzb0 bzb0Var, cau0 cau0Var, boolean z, i2n0 i2n0Var, ChannelsListFragment channelsListFragment) {
        super(R.layout.im_channel_list, null);
        this.f = bzb0Var;
        this.g = i2n0Var;
        this.h = channelsListFragment;
        this.l = new io.reactivex.rxjava3.subjects.f<>();
        this.m = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        Context context = bzb0Var.a;
        this.n = context;
        this.o = new bpn0(new ng1(this, 13));
        this.p = context.getResources();
    }

    @Override // xsna.lgb
    public final void B(long j) {
        O(new e.o(j));
    }

    @Override // xsna.lgb
    public final void G(long j, CharSequence charSequence) {
        O(new e.a(j, charSequence));
    }

    @Override // xsna.lgb
    public final void J(f3n0 f3n0Var) {
        O(new e.t(f3n0Var.b));
    }

    @Override // xsna.lgb
    public final void L(long j, String str) {
        O(new e.l(j, str));
    }

    @Override // xsna.lgb
    public final void N(String str) {
        O(new e.f(str));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.im_channel_list);
        recyclerView.getContext();
        int i = 1;
        int i2 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        com.vk.im.ui.formatters.spans.dialogitem.a aVar = new com.vk.im.ui.formatters.spans.dialogitem.a(view.getContext());
        ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
        imFeatures.getClass();
        cgb cgbVar = new cgb(com.vk.toggle.b.A.a(imFeatures) ? new cgb.a() : new bgb());
        cgbVar.y0(new k0b(this));
        cgbVar.y0(new spz());
        cgbVar.y0(new qcf0(this));
        cgbVar.y0(new ncf0(this, aVar));
        cgbVar.y0(new gcf0(this));
        cgbVar.y0(new xrn());
        cgbVar.y0(new d26(this, i2));
        cgbVar.y0(new egp());
        cgbVar.y0(new uqj0());
        cgbVar.y0(new u930(this));
        cgbVar.y0(new a3n0(this));
        cgbVar.y0(new d26(this, i));
        cgbVar.setHasStableIds(false);
        cgbVar.h.d.add(new b());
        qj0.a(cgbVar, recyclerView, new qgh0.a());
        this.j = cgbVar;
        recyclerView.setAdapter(cgbVar);
        a aVar2 = new a(recyclerView);
        this.k = aVar2;
        recyclerView.addOnScrollListener(aVar2);
        this.i = recyclerView;
        hg1.t tVar = new hg1.t();
        io.reactivex.rxjava3.subjects.f<hfz> fVar = this.l;
        fVar.getClass();
        i0 i0Var = new i0(fVar, tVar);
        int i3 = 8;
        y yVar = new y(new i0(i0Var.U(new com.vk.movika.sdk.base.hooks.f(new dj1(i3), 8)).d(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, new ahb()), new r41(new ve0(9), 11)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        t00 t00Var = new t00(new t40(this, 12), 10);
        int i4 = kwg0.a;
        this.m = yVar.subscribe(t00Var, new k41(new nu2("observeVisibleChannels in ChannelsListViewController:", 2), i3));
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        this.h.getLifecycle().addObserver(new wyv(recyclerView2, new vyv(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNELS_LIST), null, new uyv(com.vk.metrics.eventtracking.b.a), new q5u0(0.5f, 1), 12));
    }

    public final void R() {
        boolean z;
        i2n0 i2n0Var = this.g;
        if (i2n0Var.b()) {
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int v = linearLayoutManager.v();
            int x = linearLayoutManager.x();
            if (v == -1 && x == -1) {
                RecyclerView recyclerView2 = this.i;
                (recyclerView2 != null ? recyclerView2 : null).post(new iv1(this, 2));
                return;
            }
            cgb cgbVar = this.j;
            if (cgbVar == null) {
                cgbVar = null;
            }
            if (!(j5g.b0(v, cgbVar.h.f) instanceof xpz)) {
                cgb cgbVar2 = this.j;
                if (!(j5g.b0(x, (cgbVar2 != null ? cgbVar2 : null).h.f) instanceof xpz)) {
                    z = false;
                    i2n0Var.e(z);
                }
            }
            z = true;
            i2n0Var.e(z);
        }
    }

    @Override // xsna.lgb
    public final void i() {
        O(e.j.b);
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [T, xsna.dw20] */
    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        ikv0.a aVar;
        View findViewByPosition;
        if (yn50Var instanceof g.c) {
            return;
        }
        boolean z = yn50Var instanceof g.d;
        int i = 0;
        Context context = this.n;
        if (z) {
            uta utaVar = ((g.d) yn50Var).a;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            int i2 = w8m.a;
            ref$ObjectRef.element = new rew(context, w8m.c(new cwb0.z(utaVar.b), ((Boolean) this.o.getValue()).booleanValue()), new zgb(ref$ObjectRef, this, utaVar, i), null).c.b(context, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
            return;
        }
        boolean z2 = yn50Var instanceof g.b;
        bzb0 bzb0Var = this.f;
        if (z2) {
            Throwable th = ((g.b) yn50Var).a;
            if (th instanceof PinnedChannelsLimitExceededException) {
                bzb0.d(this.f, new cwb0.a1(0, null, 0, enj.f(R.plurals.vkim_pinned_channels_limit_exceeded, ((PinnedChannelsLimitExceededException) th).d(), bzb0Var.a), 0, null, R.string.vkim_close, null, null, null, 951), null, null, null, 30);
                return;
            } else {
                zk70.e(th);
                return;
            }
        }
        if (yn50Var instanceof g.a) {
            cgb cgbVar = this.j;
            if (cgbVar == null) {
                cgbVar = null;
            }
            Iterator<hfz> it = cgbVar.h.f.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (it.next() instanceof fcf0) {
                    break;
                } else {
                    i3++;
                }
            }
            RecyclerView recyclerView = this.i;
            if (recyclerView == null) {
                recyclerView = null;
            }
            int i4 = f4m.e(recyclerView).bottom;
            RecyclerView recyclerView2 = this.i;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
            if (i4 == ((layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(i3)) == null) ? 0 : f4m.e(findViewByPosition).bottom)) {
                RecyclerView recyclerView3 = this.i;
                (recyclerView3 != null ? recyclerView3 : null).smoothScrollBy(0, cn70.b(32));
                return;
            }
            return;
        }
        int i5 = 4;
        int i6 = 6;
        if (yn50Var instanceof g.C0539g) {
            g.C0539g c0539g = (g.C0539g) yn50Var;
            g2v.c().getClass();
            bzb0.d(this.f, new ezy(bzb0Var.a, R.string.vkim_leave_channel_dialog_title, R.string.vkim_leave_channel_dialog_subtitle, R.string.vkim_leave_channel_dialog_close, R.string.vkim_channel_leave), new ge0(i5, this, c0539g), new j(i6, this, c0539g), null, 24);
            return;
        }
        if (yn50Var instanceof g.e) {
            g.e eVar = (g.e) yn50Var;
            g2v.c().getClass();
            RecyclerView recyclerView4 = this.i;
            Context context2 = (recyclerView4 != null ? recyclerView4 : null).getContext();
            long j = eVar.a;
            int i7 = ReportFragment.a0;
            ReportFragment.a a2 = ReportFragment.b.a();
            a2.K("community_channel");
            a2.m = a2.m.buildUpon().appendQueryParameter("channel_id", String.valueOf(j)).build();
            a2.N();
            a2.s(true);
            a2.k(context2);
            return;
        }
        if (yn50Var instanceof g.f) {
            g.f fVar = (g.f) yn50Var;
            bzb0.d(bzb0Var, new wul(bzb0Var.a, fVar.b, fVar.c), new f0(7, this, fVar), null, null, 28);
            return;
        }
        if (yn50Var instanceof g.h) {
            g.h.a aVar2 = ((g.h) yn50Var).a;
            boolean z3 = aVar2 instanceof g.h.a.c;
            Resources resources = this.p;
            ikv0.c.f fVar2 = ikv0.c.f.a;
            if (z3) {
                aVar = new ikv0.a(context);
                aVar.t = fVar2;
                aVar.u = new ikv0.d(new ikv0.d.c(resources.getString(R.string.vkim_suggested_channel_accepted_title, ((g.h.a.c) aVar2).b)), (ikv0.d.b) null, new ikv0.d.a(resources.getString(R.string.vkim_suggested_channel_open_action), null, new nk0(i5, this, aVar2), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
            } else if (aVar2 instanceof g.h.a.d) {
                aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_hide_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                aVar.u = new ikv0.d(new ikv0.d.c(resources.getString(R.string.vkim_suggested_channel_hidden_title, ((g.h.a.d) aVar2).b)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            } else if (aVar2 instanceof g.h.a.C0540a) {
                e0 e0Var = new e0(i5, this, aVar2);
                ikv0.a aVar3 = new ikv0.a(context);
                aVar3.t = fVar2;
                aVar3.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channel_was_hidden_from_all_folder)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_channels_return_channel_in_all_folder_action), new yza(0, e0Var));
                aVar = aVar3;
            } else {
                if (!(aVar2 instanceof g.h.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new ikv0.a(context);
                aVar.t = fVar2;
                aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channel_was_shown_from_all_folder)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
            }
            aVar.o = Integer.valueOf(cn70.b(56));
            aVar.n();
        }
    }

    @Override // xsna.lgb
    public final void k() {
        O(e.g.b);
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        List<hfz> list = ((bhb) ao50Var).a;
        cgb cgbVar = this.j;
        if (cgbVar == null) {
            cgbVar = null;
        }
        cgbVar.J0(list, new k9(this, 23));
    }

    @Override // xsna.lgb
    public final void o() {
        O(e.h.b);
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        this.m.dispose();
        super.onDestroyView();
    }

    @Override // xsna.lgb
    public final void p(long j, CharSequence charSequence) {
        O(new e.c(j, charSequence));
    }

    @Override // xsna.lgb
    public final void r(j0b j0bVar) {
        O(new e.u(j0bVar.b));
    }

    @Override // xsna.lgb
    public final void t() {
        O(e.k.b);
    }

    @Override // xsna.lgb
    public final void w(long j, ImStoryState imStoryState, WeakReference<View> weakReference) {
        imStoryState.getClass();
        O(new e.q(j, imStoryState == ImStoryState.NEW, weakReference));
    }

    @Override // xsna.lgb
    public final void x(j0b j0bVar) {
        O(new e.t(j0bVar.b));
    }
}
