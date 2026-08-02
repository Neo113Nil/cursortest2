package com.vk.newsfeed.impl.fragments.video.thread;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.miniplayer.dialog.a;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.bridge.GiftData;
import com.vk.webapp.fragments.ReportFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.aa;
import xsna.acs0;
import xsna.afg;
import xsna.anj;
import xsna.bfg;
import xsna.bja0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.ce60;
import xsna.dhr0;
import xsna.e43;
import xsna.enj;
import xsna.f4m;
import xsna.fae;
import xsna.fxc0;
import xsna.g2v;
import xsna.hf8;
import xsna.hl60;
import xsna.iag;
import xsna.iah0;
import xsna.ics0;
import xsna.kcj0;
import xsna.kcs0;
import xsna.l6n0;
import xsna.lcs0;
import xsna.lpj;
import xsna.m33;
import xsna.mhy;
import xsna.msy;
import xsna.o25;
import xsna.o4l0;
import xsna.ofc0;
import xsna.p870;
import xsna.rdg;
import xsna.rrn0;
import xsna.sbs0;
import xsna.t11;
import xsna.t6g0;
import xsna.u3g0;
import xsna.vdg;
import xsna.xbs0;
import xsna.xh5;
import xsna.y0y0;
import xsna.yg5;
import xsna.yrn;
import xsna.z0y0;
import xsna.zal0;

/* compiled from: VideoCommentsThreadInPlayerFragment.kt */
/* loaded from: classes4.dex */
public final class VideoCommentsThreadInPlayerFragment extends FragmentImpl implements bfg<afg>, a {
    public static final /* synthetic */ int Q = 0;
    public final acs0 N;
    public final xbs0 O;
    public final VideoCommentsThreadInPlayerFragment$receiver$1 P;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment$receiver$1] */
    public VideoCommentsThreadInPlayerFragment() {
        ofc0 ofc0Var = new ofc0(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        xbs0 xbs0Var = new xbs0(new ics0(msy.a(lazyThreadSafetyMode, ofc0Var)), new fae(msy.a(lazyThreadSafetyMode, new rrn0(this, 14))), msy.a(lazyThreadSafetyMode, new kcj0(this, 15)), this, msy.a(lazyThreadSafetyMode, new l6n0(this, 11)));
        this.N = new acs0(this, xbs0Var);
        this.O = xbs0Var;
        this.P = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                xbs0 xbs0Var2 = VideoCommentsThreadInPlayerFragment.this.O;
                if (xbs0Var2 != null) {
                    xbs0Var2.Z3(intent);
                }
            }
        };
    }

    @Override // xsna.bfg
    public final void Ah() {
        this.N.n();
    }

    @Override // xsna.bfg
    public final void I9() {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            u3g0Var.b();
        }
    }

    @Override // xsna.bfg
    public final void Ic(boolean z) {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            u3g0Var.Ic(false);
        }
    }

    @Override // xsna.bfg
    public final void Jg(NewsComment newsComment, aa aaVar) {
        this.N.r(newsComment, aaVar);
    }

    @Override // xsna.bfg
    public final boolean L7() {
        return false;
    }

    @Override // xsna.bfg
    public final void Nh(UserId userId, String str) {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            u3g0Var.Nh(userId, str);
        }
    }

    @Override // xsna.bfg
    public final boolean Pj() {
        return false;
    }

    @Override // xsna.bfg
    public final void Ql(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        this.N.u(popupStickerAnimation, o4l0Var);
    }

    @Override // xsna.bfg
    public final void Rb(int i) {
        this.N.p(i);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        this.N.d();
    }

    @Override // xsna.bfg
    public final boolean W1() {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            return f4m.h(u3g0Var.e);
        }
        return false;
    }

    @Override // xsna.bfg
    public final void Xh(String str, ArrayList arrayList) {
        this.N.q(str, arrayList);
    }

    @Override // xsna.bfg
    public final void a(c cVar) {
        b bVar = this.N.j;
        if (bVar != null) {
            bVar.b(cVar);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return this.N.f();
    }

    @Override // xsna.bfg
    public final void bm(int i) {
        this.N.o.i = i;
    }

    @Override // xsna.bfg
    public final void d0() {
        acs0 acs0Var = this.N;
        mhy.b(acs0Var.a.mo2getContext());
        u3g0 u3g0Var = acs0Var.n;
        if (u3g0Var != null) {
            u3g0Var.clearFocus();
        }
    }

    @Override // xsna.bfg
    public final void d6(int i) {
        Context mo2getContext = this.N.a.mo2getContext();
        if (mo2getContext != null) {
            zal0.H(g2v.d().a(), mo2getContext, i, GiftData.d, null, "comment", null, 96);
        }
    }

    @Override // xsna.bfg
    public final void eg(NewsComment newsComment) {
        this.N.c(newsComment);
    }

    @Override // xsna.bfg
    public final com.vk.lists.c gj(c.h hVar) {
        acs0.c cVar = this.N.p;
        RecyclerPaginatedView recyclerPaginatedView = cVar != null ? cVar.c : null;
        if (hVar.f == null) {
            hVar.f = recyclerPaginatedView.getDataInfoProvider();
        }
        return hVar.a();
    }

    @Override // xsna.bfg
    public final void in() {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            u3g0Var.in();
        }
    }

    @Override // xsna.bfg
    public final void k0() {
        WriteBar writeBar;
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        writeBar.setVisibility(u3g0Var.o);
    }

    @Override // xsna.bfg
    public final void k6(boolean z) {
        this.N.l(z);
    }

    @Override // xsna.bfg
    public final void nf() {
        this.N.o.N0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.N.e(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        acs0 acs0Var = this.N;
        acs0Var.g();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.P, intentFilter, hf8.a, 4);
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        Bundle arguments = getArguments();
        if (arguments != null) {
            acs0Var.o.j = arguments.getString("referrer", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = fxc0.B().J().h1() ? R.layout.fragment_video_comments_tree_v2 : R.layout.fragment_video_comments_tree;
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(i, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ce60.b.getClass();
        p870.f().g(this.O);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.P);
        this.N.h();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.N.i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        acs0 acs0Var = this.N;
        u3g0 u3g0Var = acs0Var.n;
        if (u3g0Var != null && (writeBar = u3g0Var.e) != null) {
            y0y0 y0y0Var = writeBar.D;
            if (y0y0Var.c(null) && (z0y0Var = y0y0Var.d) != null) {
                y0y0Var.c.getInputState();
                z0y0Var.a(false, true);
            }
        }
        hl60.b();
        acs0Var.b();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.N.t();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u3g0 u3g0Var = this.N.n;
        Bundle o = u3g0Var != null ? u3g0Var.o() : null;
        if (o != null) {
            bundle.putBundle("STATE_REPLY_BAR_VIEW", o);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        acs0 acs0Var = this.N;
        acs0Var.getClass();
        o25.a().b0(acs0Var.m);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        acs0 acs0Var = this.N;
        acs0Var.getClass();
        o25.a().B(acs0Var.m);
        acs0Var.d();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerPaginatedView recyclerPaginatedView;
        super.onViewCreated(view, bundle);
        acs0 acs0Var = this.N;
        acs0Var.j(view, bundle);
        acs0.c cVar = acs0Var.p;
        if (cVar != null) {
            RecyclerView recyclerView = cVar.c.getRecyclerView();
            Drawable a = m33.a(R.drawable.vk_video_comments_thread_divider, requireContext());
            yrn yrnVar = new yrn(iah0.a(1.0f), iah0.a(1.0f), a, a);
            yrnVar.m = new kcs0();
            if (t11.d()) {
                yrnVar.j = iah0.a(16.0f);
            } else {
                yrnVar.j = iah0.a(6.0f);
            }
            yrnVar.l(iah0.a(12.0f), iah0.a(6.0f), iah0.a(12.0f), iah0.a(6.0f));
            recyclerView.addItemDecoration(yrnVar);
            yrn yrnVar2 = new yrn(m33.a(R.drawable.archived_comment_divider, requireContext()), iah0.a(8.0f));
            yrnVar2.m = new lcs0();
            recyclerView.addItemDecoration(yrnVar2);
            cVar.d.c.setText(R.string.comment_only_replies);
        }
        vdg vdgVar = acs0Var.o;
        acs0.c cVar2 = acs0Var.p;
        if (cVar2 != null && (recyclerPaginatedView = cVar2.c) != null) {
            recyclerPaginatedView.setAdapter(vdgVar);
        }
        xbs0 xbs0Var = this.O;
        if (xbs0Var != null) {
            xbs0Var.onCreate(getArguments());
        }
    }

    @Override // xsna.bfg
    public final void r1(bja0.a aVar) {
        this.N.s(aVar);
    }

    @Override // xsna.bfg
    public final void s2() {
        sbs0 sbs0Var;
        acs0 acs0Var = this.N;
        acs0Var.getClass();
        if (!fxc0.B().J().W() || (sbs0Var = acs0Var.f) == null) {
            return;
        }
        sbs0Var.b();
    }

    @Override // xsna.bfg
    public final boolean t2() {
        this.N.a();
        return true;
    }

    @Override // xsna.bfg
    public final void u1(com.vk.lists.c cVar) {
        acs0.c cVar2 = this.N.p;
        cVar.b(cVar2 != null ? cVar2.c : null, true, true, 0L, null);
    }

    @Override // xsna.bfg
    public final void ua(boolean z) {
        WriteBar writeBar;
        acs0 acs0Var = this.N;
        if (!z) {
            u3g0 u3g0Var = acs0Var.n;
            if (u3g0Var != null) {
                u3g0Var.c(requireContext().getString(R.string.disable_comment_video_text));
                return;
            }
            return;
        }
        u3g0 u3g0Var2 = acs0Var.n;
        if (u3g0Var2 == null || (writeBar = u3g0Var2.e) == null) {
            return;
        }
        writeBar.n0();
    }

    @Override // xsna.bfg
    public final void wf(int i) {
        this.N.o(i);
    }

    @Override // xsna.bfg
    public final void x(int i) {
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var != null) {
            u3g0Var.x(i);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        yg5 yg5Var;
        VideoFile A;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, A.r(), null, 40, null);
    }

    @Override // xsna.bfg
    public final void y2() {
        WriteBar writeBar;
        u3g0 u3g0Var = this.N.n;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        bwt0.p0(writeBar, true);
    }

    @Override // xsna.bfg
    public final void y7(ReportFragment.a aVar) {
        aVar.g(4330, this);
    }

    @Override // xsna.bfg
    public final boolean z(rdg rdgVar) {
        return this.N.k(rdgVar);
    }

    @Override // xsna.bfg
    public final void A7() {
    }

    @Override // xsna.bfg
    public final void B3() {
    }

    @Override // xsna.bfg
    public final void D() {
    }

    @Override // xsna.bfg
    public final void P5() {
    }

    @Override // xsna.bfg
    public final FragmentImpl g() {
        return this;
    }

    @Override // xsna.bfg
    public final void jl() {
    }

    @Override // xsna.bfg
    public final void ub() {
    }

    @Override // xsna.bfg
    public final void Ch(String str) {
    }

    @Override // xsna.bfg
    public final void Lm(iag iagVar) {
    }

    @Override // xsna.bfg
    public final void Za(iag iagVar) {
    }

    @Override // xsna.bfg
    public final void y5(iag iagVar) {
    }

    @Override // xsna.bfg
    public final void Ec(UserId userId, NewsComment newsComment) {
    }
}
