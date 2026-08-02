package com.vk.newsfeed.impl.fragments.video.tree;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.common.links.LinksParserData;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.miniplayer.dialog.VideoMinimizableDialogHeaderViewHolder;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.stickers.bridge.GiftData;
import com.vk.webapp.fragments.ReportFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import org.chromium.base.version_info.VersionConstants;
import xsna.a920;
import xsna.aa;
import xsna.acs0;
import xsna.akd0;
import xsna.anj;
import xsna.awt0;
import xsna.b2c0;
import xsna.b3g0;
import xsna.b9c0;
import xsna.bfg;
import xsna.bhu;
import xsna.bin0;
import xsna.bja0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.by2;
import xsna.c9c0;
import xsna.cbg;
import xsna.ce60;
import xsna.cuz;
import xsna.d9c0;
import xsna.dhr0;
import xsna.dw20;
import xsna.e43;
import xsna.eg00;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.fae;
import xsna.fnj;
import xsna.fxc0;
import xsna.g2v;
import xsna.g3f0;
import xsna.gbg0;
import xsna.gcs0;
import xsna.gd60;
import xsna.gqh0;
import xsna.gxp;
import xsna.hd60;
import xsna.hf8;
import xsna.hl60;
import xsna.hvr0;
import xsna.iag;
import xsna.iah0;
import xsna.ics0;
import xsna.id60;
import xsna.jcf0;
import xsna.jjc;
import xsna.kud0;
import xsna.l2c0;
import xsna.lpj;
import xsna.m33;
import xsna.m3g0;
import xsna.m3r;
import xsna.m7m;
import xsna.mhy;
import xsna.msy;
import xsna.n3g0;
import xsna.ni5;
import xsna.npu;
import xsna.o25;
import xsna.o2u0;
import xsna.o4l0;
import xsna.p870;
import xsna.pcs0;
import xsna.pjb0;
import xsna.qbc0;
import xsna.qi6;
import xsna.rcs0;
import xsna.rdg;
import xsna.s1c0;
import xsna.sbs0;
import xsna.sf2;
import xsna.t11;
import xsna.t6g0;
import xsna.tcs0;
import xsna.tfm0;
import xsna.u1c0;
import xsna.u2b0;
import xsna.u3g0;
import xsna.up2;
import xsna.v0n;
import xsna.v5t0;
import xsna.vdg;
import xsna.x0n;
import xsna.xzb0;
import xsna.y0y0;
import xsna.y9t0;
import xsna.yrn;
import xsna.z0y0;
import xsna.z2f0;
import xsna.z4d0;
import xsna.z6u;
import xsna.zal0;
import xsna.zou;
import xsna.zyl0;

/* compiled from: VideoCommentsTreeInPlayerFragment.kt */
/* loaded from: classes4.dex */
public final class VideoCommentsTreeInPlayerFragment extends FragmentImpl implements bfg<c9c0>, com.vk.libvideo.miniplayer.dialog.a, d9c0 {
    public static final String[] c0 = {"com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED", "android.net.conn.CONNECTIVITY_CHANGE", "com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED", "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID"};
    public final g3f0 N;
    public final v5t0 O;
    public final acs0 P;
    public dw20 Q;
    public final Object R;
    public final VideoCommentsTreeInPlayerFragment$receiver$1 S;
    public GestureDetector T;
    public final c U;
    public pjb0 V;
    public final bpn0 W;
    public final l2c0 X;
    public final Object Y;
    public final bpn0 Z;
    public final b2c0 a0;
    public final a920 b0;

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public final class a implements gxp {
        public a() {
        }

        @Override // xsna.gxp
        public final by2 c(Throwable th) {
            return new by2(0, 7, new zyl0(VideoCommentsTreeInPlayerFragment.this, 16));
        }
    }

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public final class b extends eg00<u1c0> {
        @Override // xsna.eg00, xsna.zjf0
        public final void b(RecyclerView.e0 e0Var) {
            super.b(e0Var);
            if (e0Var instanceof qi6) {
                ((qi6) e0Var).I6();
            }
        }
    }

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            VideoCommentsTreeInPlayerFragment.this.P.b.lg();
            return true;
        }
    }

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public static final class f extends z2f0 {
        public f() {
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void a() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void b() {
            VideoCommentsTreeInPlayerFragment.this.P.t();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void c() {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }

        @Override // xsna.z2f0, xsna.x2f0
        public final void f(m3r m3rVar) {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment$receiver$1] */
    public VideoCommentsTreeInPlayerFragment() {
        g3f0 g3f0Var = new g3f0(new f(), 1);
        this.N = g3f0Var;
        xzb0 xzb0Var = new xzb0(new bin0() { // from class: xsna.scs0
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.bin0
            public final Object get() {
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return (String) VideoCommentsTreeInPlayerFragment.this.R.getValue();
            }
        }, new bin0() { // from class: xsna.ncs0
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.bin0
            public final Object get() {
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return (String) VideoCommentsTreeInPlayerFragment.this.R.getValue();
            }
        }, new d(), new z6u(27), new e());
        jcf0 jcf0Var = new jcf0(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b9c0 b9c0Var = new b9c0(msy.a(lazyThreadSafetyMode, jcf0Var), xzb0Var);
        v5t0 v5t0Var = new v5t0(this, null);
        this.O = v5t0Var;
        gcs0 gcs0Var = new gcs0(new ics0(msy.a(lazyThreadSafetyMode, new z4d0(this, 29))), new fae(msy.a(lazyThreadSafetyMode, new tfm0(this, 17))), msy.a(lazyThreadSafetyMode, new hvr0(this, 4)), this, v5t0Var, msy.a(lazyThreadSafetyMode, new akd0(this, 19)));
        this.P = new acs0(this, gcs0Var);
        this.R = msy.a(lazyThreadSafetyMode, new qbc0(this, 26));
        this.S = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                v5t0 v5t0Var2 = VideoCommentsTreeInPlayerFragment.this.O;
                if (v5t0Var2 != null) {
                    v5t0Var2.Z3(intent);
                }
            }
        };
        this.U = new c();
        this.W = new bpn0(new gqh0(this, 13));
        this.X = new l2c0();
        this.Y = msy.a(lazyThreadSafetyMode, new rcs0(0));
        this.Z = new bpn0(new kud0(7));
        b2c0 b2c0Var = new b2c0(v5t0Var.G, g3f0Var);
        b2c0Var.n = new b();
        b2c0Var.m = b9c0Var;
        this.a0 = b2c0Var;
        this.b0 = new a920();
        v5t0Var.H = gcs0Var;
    }

    @Override // xsna.d9c0
    public final void Ae() {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        acs0.c cVar = this.P.p;
        if (cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(true);
    }

    @Override // xsna.bfg
    public final void Ah() {
        this.P.n();
    }

    @Override // xsna.bfg
    public final void Df() {
        sbs0 sbs0Var;
        acs0 acs0Var = this.P;
        Context mo2getContext = acs0Var.a.mo2getContext();
        if (mo2getContext != null && t11.d()) {
            HashSet hashSet = iah0.a;
            if (fnj.d(mo2getContext) || !iah0.s(mo2getContext) || (sbs0Var = acs0Var.f) == null) {
                return;
            }
            sbs0Var.c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ai5
    public final y9t0 Eh(int i) {
        u1c0 u1c0Var;
        if (i >= 0) {
            b2c0 b2c0Var = this.a0;
            if (i < b2c0Var.getItemCount() && (u1c0Var = (u1c0) b2c0Var.c.c(i)) != null) {
                return new y9t0(u1c0Var.a(), new ni5((String) this.R.getValue(), null, u1c0Var.e(), 10));
            }
        }
        return null;
    }

    @Override // xsna.d9c0
    public final CharSequence Hf(CharSequence charSequence, PodcastAttachment podcastAttachment, LinksParserData linksParserData, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        gd60 a2 = hd60.a();
        MusicTrack musicTrack = podcastAttachment.f;
        int i = musicTrack.f;
        pjb0 pjb0Var = this.V;
        if (pjb0Var != null) {
            pjb0Var.d = musicTrack;
            pjb0Var.e = musicPlaybackLaunchContext;
        } else {
            pjb0Var = null;
        }
        return a2.d(charSequence, LinksParserData.a(linksParserData, i, pjb0Var));
    }

    @Override // xsna.bfg
    public final void I9() {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            u3g0Var.b();
        }
    }

    @Override // xsna.bfg
    public final void Ic(boolean z) {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            u3g0Var.Ic(z);
        }
    }

    @Override // xsna.bfg
    public final void Jg(NewsComment newsComment, aa aaVar) {
        this.P.r(newsComment, aaVar);
    }

    @Override // xsna.bfg
    public final boolean L7() {
        return false;
    }

    @Override // xsna.d9c0
    public final s1c0 M0() {
        s1c0.a aVar = new s1c0.a();
        aVar.e = false;
        aVar.b = true;
        aVar.d = true;
        aVar.g = true;
        aVar.h = true;
        aVar.i = false;
        aVar.k = true;
        aVar.o = true;
        aVar.m = true;
        aVar.n = true;
        sf2 sf2Var = new sf2();
        sf2Var.b = mo2getContext();
        aVar.s = sf2Var.a();
        return aVar.a();
    }

    @Override // xsna.bfg
    public final void Nh(UserId userId, String str) {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            u3g0Var.Nh(userId, str);
        }
    }

    @Override // xsna.d9c0
    public final void P6(VideoFile videoFile) {
        dw20 dw20Var = this.Q;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.Q = hd60.a().u1(activity, videoFile);
        }
    }

    @Override // xsna.bfg
    public final boolean Pj() {
        return false;
    }

    @Override // xsna.bfg
    public final void Ql(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        this.P.u(popupStickerAnimation, o4l0Var);
    }

    @Override // xsna.bfg
    public final void Rb(int i) {
        this.P.p(this.a0.getItemCount() + i);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        this.P.d();
    }

    @Override // xsna.d9c0
    public final void S2(NewsEntry newsEntry) {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        u3g0 u3g0Var;
        m3g0 m3g0Var;
        RecyclerPaginatedView recyclerPaginatedView2;
        acs0 acs0Var = this.P;
        acs0.c cVar = acs0Var.p;
        if (cVar != null && (recyclerPaginatedView2 = cVar.c) != null) {
            recyclerPaginatedView2.gl();
        }
        u3g0 u3g0Var2 = acs0Var.n;
        if (u3g0Var2 != null && (m3g0Var = u3g0Var2.c) != null) {
            b3g0 b3g0Var = m3g0Var.b;
            n3g0 n3g0Var = m3g0Var.l;
            if (n3g0Var != null) {
                n3g0Var.b(b3g0Var.p());
                n3g0Var.f(b3g0Var.i0());
                n3g0Var.d(b3g0Var.f0());
                n3g0Var.a();
            }
        }
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("show_writebar_attach", true) : true;
        if (((Boolean) this.Z.getValue()).booleanValue() && !z && (u3g0Var = acs0Var.n) != null) {
            u3g0Var.l();
        }
        v5t0 v5t0Var = this.O;
        this.a0.p.N = v5t0Var != null ? v5t0Var.h0() : false;
        y2();
        Bundle arguments2 = getArguments();
        if (!(arguments2 != null ? arguments2.getBoolean("BottomSheetCommentsFragment.can_comment", true) : true)) {
            eo();
        }
        this.T = new GestureDetector(getActivity(), this.U);
        acs0.c cVar2 = acs0Var.p;
        if (cVar2 == null || (recyclerPaginatedView = cVar2.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.addOnItemTouchListener(new tcs0(this));
    }

    @Override // xsna.d9c0
    public final void S8() {
        RecyclerPaginatedView recyclerPaginatedView;
        acs0.c cVar = this.P.p;
        if (cVar == null || (recyclerPaginatedView = cVar.c) == null) {
            return;
        }
        recyclerPaginatedView.fj(null, new a());
    }

    @Override // xsna.d9c0
    public final void V4() {
        RecyclerPaginatedView recyclerPaginatedView;
        acs0.c cVar = this.P.p;
        if (cVar == null || (recyclerPaginatedView = cVar.c) == null) {
            return;
        }
        recyclerPaginatedView.e0();
    }

    @Override // xsna.bfg
    public final boolean W1() {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            return f4m.h(u3g0Var.e);
        }
        return false;
    }

    @Override // xsna.bfg
    public final void Xh(String str, ArrayList arrayList) {
        this.P.q(str, arrayList);
    }

    @Override // xsna.d9c0
    public final boolean Yc(NewsEntry newsEntry) {
        return false;
    }

    @Override // xsna.bfg
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = this.P.j;
        if (bVar != null) {
            bVar.b(cVar);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        return this.P.f();
    }

    @Override // xsna.d9c0
    public final void a7(VideoFile videoFile) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(videoFile.w9().Ab(VideoUrl.EXTERNAL_URL)));
        Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (true) {
            if (!it.hasNext()) {
                intent.addFlags(268435456);
                break;
            }
            ResolveInfo next = it.next();
            if (epx.f(next.activityInfo.packageName, "com.google.android.youtube")) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                break;
            }
        }
        startActivityForResult(intent, 10500);
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Override // xsna.bfg
    public final void bm(int i) {
        this.P.o.i = i;
    }

    @Override // xsna.d9c0
    public final void c4() {
        this.b0.notifyDataSetChanged();
    }

    @Override // xsna.bfg
    public final void d0() {
        acs0 acs0Var = this.P;
        mhy.b(acs0Var.a.mo2getContext());
        u3g0 u3g0Var = acs0Var.n;
        if (u3g0Var != null) {
            u3g0Var.clearFocus();
        }
    }

    @Override // xsna.bfg
    public final void d6(int i) {
        Context mo2getContext = this.P.a.mo2getContext();
        if (mo2getContext != null) {
            zal0.H(g2v.d().a(), mo2getContext, i, GiftData.d, null, "comment", null, 96);
        }
    }

    @Override // xsna.bfg
    public final void eg(NewsComment newsComment) {
        this.P.c(newsComment);
    }

    public final void eo() {
        String str = null;
        v5t0 v5t0Var = this.O;
        Integer valueOf = v5t0Var != null ? Integer.valueOf(v5t0Var.g0()) : null;
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            if (valueOf != null && (valueOf.intValue() > 0 || !o25.a().b())) {
                str = requireContext().getString(com.vkontakte.android.R.string.disable_comment_video_text);
            }
            u3g0Var.c(str);
        }
    }

    @Override // xsna.bfg
    public final void ge(final int i) {
        iag iagVar;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        Integer num = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int s = linearLayoutManager.s();
        int w = linearLayoutManager.w();
        acs0 acs0Var = this.P;
        cbg cbgVar = (cbg) acs0Var.o.c.c(i);
        if (cbgVar != null && (iagVar = cbgVar.a) != null) {
            num = Integer.valueOf(iagVar.getId());
        }
        if (num != null) {
            acs0Var.o.i = num.intValue();
        }
        int itemCount = this.a0.getItemCount() + i;
        if (itemCount < s || itemCount > w) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.o(new RecyclerView.l.a() { // from class: xsna.ocs0
                    @Override // androidx.recyclerview.widget.RecyclerView.l.a
                    public final void a() {
                        String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                        VideoCommentsTreeInPlayerFragment.this.Rb(i);
                    }
                });
            } else {
                Rb(i);
            }
        }
    }

    @Override // xsna.dkf0
    public final int getAdapterOffset() {
        return 0;
    }

    @Override // xsna.dkf0
    public final int getItemCount() {
        return this.a0.getItemCount();
    }

    @Override // xsna.dkf0
    public final RecyclerView getRecyclerView() {
        RecyclerPaginatedView recyclerPaginatedView;
        acs0.c cVar = this.P.p;
        if (cVar == null || (recyclerPaginatedView = cVar.c) == null) {
            return null;
        }
        return recyclerPaginatedView.getRecyclerView();
    }

    @Override // xsna.ai5
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.POST;
    }

    @Override // xsna.bfg
    public final com.vk.lists.c gj(c.h hVar) {
        acs0.c cVar = this.P.p;
        RecyclerPaginatedView recyclerPaginatedView = cVar != null ? cVar.c : null;
        if (hVar.f == null) {
            hVar.f = recyclerPaginatedView.getDataInfoProvider();
        }
        return hVar.a();
    }

    @Override // xsna.d9c0
    public final void hk(int i) {
        VideoMinimizableDialogHeaderViewHolder videoMinimizableDialogHeaderViewHolder;
        TextView textView;
        CharSequence c2 = bhu.c(i, getString(com.vkontakte.android.R.string.video_comments_title));
        acs0.c cVar = this.P.p;
        if (cVar == null || (videoMinimizableDialogHeaderViewHolder = cVar.d) == null || (textView = videoMinimizableDialogHeaderViewHolder.c) == null) {
            return;
        }
        textView.setText(c2);
    }

    @Override // xsna.bfg
    public final void in() {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            u3g0Var.in();
        }
    }

    @Override // xsna.bfg
    public final void k0() {
        WriteBar writeBar;
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        writeBar.setVisibility(u3g0Var.o);
    }

    @Override // xsna.bfg
    public final void k6(boolean z) {
        this.P.l(z);
    }

    @Override // xsna.d9c0
    public final void le() {
        RecyclerPaginatedView recyclerPaginatedView;
        RecyclerView recyclerView;
        acs0.c cVar = this.P.p;
        if (cVar == null || (recyclerPaginatedView = cVar.c) == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.suppressLayout(false);
    }

    @Override // xsna.bfg
    public final void nf() {
        this.P.o.N0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.P.e(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v5t0 v5t0Var = this.O;
        if (v5t0Var != null) {
            v5t0Var.Y0(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        acs0 acs0Var = this.P;
        acs0Var.g();
        vdg vdgVar = acs0Var.o;
        IntentFilter intentFilter = new IntentFilter();
        for (int i = 0; i < 4; i++) {
            intentFilter.addAction(c0[i]);
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str = hf8.a;
        VideoCommentsTreeInPlayerFragment$receiver$1 videoCommentsTreeInPlayerFragment$receiver$1 = this.S;
        anj.d(context, videoCommentsTreeInPlayerFragment$receiver$1, intentFilter, str, 4);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(zou.a);
        Context context2 = e43.a;
        cuz.a(context2 != null ? context2 : null).b(videoCommentsTreeInPlayerFragment$receiver$1, intentFilter2);
        ce60.b.getClass();
        p870 f2 = p870.f();
        v5t0 v5t0Var = this.O;
        f2.b(101, v5t0Var);
        p870.f().b(102, v5t0Var);
        p870.f().b(104, v5t0Var);
        p870.f().b(100, v5t0Var);
        p870.f().b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, v5t0Var);
        p870.f().b(125, v5t0Var);
        p870.f().b(113, v5t0Var);
        p870.f().a(113, 100, v5t0Var);
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, v5t0Var);
        p870.f().b(120, v5t0Var);
        p870.f().b(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, v5t0Var);
        p870.f().b(130, v5t0Var);
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, v5t0Var);
        p870.f().b(134, v5t0Var);
        p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, v5t0Var);
        p870.f().b(147, v5t0Var);
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        b2c0 b2c0Var = this.a0;
        a920 a920Var = this.b0;
        a920Var.K0(b2c0Var);
        a920Var.K0(vdgVar);
        vdgVar.j = (String) this.R.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = fxc0.B().J().h1() ? com.vkontakte.android.R.layout.fragment_video_comments_tree_v2 : com.vkontakte.android.R.layout.fragment_video_comments_tree;
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        return LayoutInflater.from(new lpj(mo2getContext, dhr0.u().c)).inflate(i, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        boolean isStateSaved = isStateSaved();
        v5t0 v5t0Var = this.O;
        if (!isStateSaved && v5t0Var != null) {
            v5t0Var.z();
        }
        ce60.b.getClass();
        p870.f().g(v5t0Var);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        VideoCommentsTreeInPlayerFragment$receiver$1 videoCommentsTreeInPlayerFragment$receiver$1 = this.S;
        enj.s(context, videoCommentsTreeInPlayerFragment$receiver$1);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        cuz.a(context2).d(videoCommentsTreeInPlayerFragment$receiver$1);
        npu.a().a = null;
        this.P.h();
        if (v5t0Var != null) {
            v5t0Var.onDestroy();
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        hl60 hl60Var = hl60.a;
        hl60.b();
        super.onDestroyView();
        this.P.i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        hl60 hl60Var = hl60.a;
        hl60.b();
        acs0 acs0Var = this.P;
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
        this.N.a.a();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.P.t();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u3g0 u3g0Var = this.P.n;
        Bundle o = u3g0Var != null ? u3g0Var.o() : null;
        if (o != null) {
            bundle.putBundle("STATE_REPLY_BAR_VIEW", o);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        acs0 acs0Var = this.P;
        acs0Var.getClass();
        o25.a().b0(acs0Var.m);
        v5t0 v5t0Var = this.O;
        this.a0.q = v5t0Var != null ? v5t0Var.u : null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        acs0 acs0Var = this.P;
        acs0Var.getClass();
        o25.a().B(acs0Var.m);
        acs0Var.d();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerPaginatedView recyclerPaginatedView;
        VideoMinimizableDialogHeaderViewHolder videoMinimizableDialogHeaderViewHolder;
        TextView textView;
        RecyclerPaginatedView recyclerPaginatedView2;
        final RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        acs0 acs0Var = this.P;
        acs0Var.j(view, bundle);
        acs0.c cVar = acs0Var.p;
        v5t0 v5t0Var = this.O;
        if (cVar != null && (recyclerPaginatedView2 = cVar.c) != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
            yrn yrnVar = new yrn(m33.a(com.vkontakte.android.R.drawable.archived_comment_divider, requireContext()), iah0.a(8.0f));
            yrnVar.m = new pcs0();
            recyclerView.addItemDecoration(yrnVar);
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.vkontakte.android.R.dimen.vk_toolbar_separator_height);
            recyclerView.addItemDecoration(this.X);
            yrn yrnVar2 = new yrn(new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_separator_primary_alpha)), dimensionPixelSize);
            yrnVar2.o = gbg0.a(getResources(), 16.0f);
            yrnVar2.m = v5t0Var;
            recyclerView.addItemDecoration(yrnVar2);
            if (com.vk.toggle.d.i()) {
                recyclerView.addItemDecoration(((Boolean) this.Y.getValue()).booleanValue() ? new x0n(recyclerView) : new v0n(recyclerView));
                recyclerView.setOnHoverListener(new View.OnHoverListener() { // from class: xsna.qcs0
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view2, MotionEvent motionEvent) {
                        String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                        return new n0n().a(RecyclerView.this, motionEvent);
                    }
                });
            }
        }
        acs0.c cVar2 = acs0Var.p;
        if (cVar2 != null && (videoMinimizableDialogHeaderViewHolder = cVar2.d) != null && (textView = videoMinimizableDialogHeaderViewHolder.c) != null) {
            textView.setText(com.vkontakte.android.R.string.video_comments_title);
        }
        FragmentActivity activity = getActivity();
        this.V = activity != null ? new pjb0(activity, (u2b0) this.W.getValue()) : null;
        this.a0.N0(up2.f(m7m.d(this), requireContext(), this));
        acs0.c cVar3 = acs0Var.p;
        if (cVar3 != null && (recyclerPaginatedView = cVar3.c) != null) {
            recyclerPaginatedView.setAdapter(this.b0);
        }
        if (v5t0Var != null) {
            v5t0Var.I1(getArguments());
        }
    }

    @Override // xsna.bfg
    public final void r1(bja0.a aVar) {
        this.P.s(aVar);
    }

    @Override // xsna.d9c0
    public final void rd(boolean z) {
        VideoMinimizableDialogHeaderViewHolder videoMinimizableDialogHeaderViewHolder;
        View view;
        acs0.c cVar = this.P.p;
        if (cVar == null || (videoMinimizableDialogHeaderViewHolder = cVar.d) == null || (view = videoMinimizableDialogHeaderViewHolder.d) == null) {
            return;
        }
        awt0.v(view, z);
    }

    @Override // xsna.bfg
    public final void s2() {
        sbs0 sbs0Var;
        acs0 acs0Var = this.P;
        acs0Var.getClass();
        if (!fxc0.B().J().W() || (sbs0Var = acs0Var.f) == null) {
            return;
        }
        sbs0Var.b();
    }

    @Override // xsna.bfg
    public final boolean t2() {
        this.P.a();
        return true;
    }

    @Override // xsna.bfg
    public final void u1(com.vk.lists.c cVar) {
        acs0.c cVar2 = this.P.p;
        cVar.b(cVar2 != null ? cVar2.c : null, true, true, 0L, null);
    }

    @Override // xsna.bfg
    public final void ua(boolean z) {
        WriteBar writeBar;
        if (!z) {
            eo();
            return;
        }
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        writeBar.n0();
    }

    @Override // xsna.bfg
    public final void wf(int i) {
        this.P.o(this.a0.getItemCount() + i);
    }

    @Override // xsna.bfg
    public final void x(int i) {
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var != null) {
            u3g0Var.x(i);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        v5t0 v5t0Var = this.O;
        if (v5t0Var != null) {
            v5t0Var.r1(uiTrackingScreen);
        }
    }

    @Override // xsna.bfg
    public final void y2() {
        WriteBar writeBar;
        u3g0 u3g0Var = this.P.n;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        bwt0.p0(writeBar, true);
    }

    @Override // xsna.bfg
    public final void y7(ReportFragment.a aVar) {
        aVar.g(4330, this.P.a);
    }

    @Override // xsna.bfg
    public final boolean z(rdg rdgVar) {
        return this.P.k(rdgVar);
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

    @Override // xsna.d9c0
    public final void R1() {
    }

    @Override // xsna.bfg
    public final void V0() {
    }

    @Override // xsna.d9c0
    public final void a1() {
    }

    @Override // xsna.bfg
    public final FragmentImpl g() {
        return this;
    }

    @Override // xsna.d9c0
    public final void invalidateOptionsMenu() {
    }

    @Override // xsna.bfg
    public final void jl() {
    }

    @Override // xsna.bfg
    public final void o0() {
    }

    @Override // xsna.d9c0
    public final void pa() {
    }

    @Override // xsna.bfg
    public final void ub() {
    }

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public static final class d implements o2u0 {
        @Override // xsna.o2u0
        public final void F2(String str) {
        }

        @Override // xsna.o2u0
        public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        }

        @Override // xsna.o2u0
        public final void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        }
    }

    @Override // xsna.bfg
    public final void Ch(String str) {
    }

    @Override // xsna.d9c0
    public final void E3(long j) {
    }

    @Override // xsna.d9c0
    public final void Il(boolean z) {
    }

    @Override // xsna.bfg
    public final void Lm(iag iagVar) {
    }

    @Override // xsna.d9c0
    public final void Mj(Post post) {
    }

    @Override // xsna.bfg
    public final void Za(iag iagVar) {
    }

    @Override // xsna.bfg
    public final void f6(boolean z) {
    }

    @Override // xsna.d9c0
    public final void setTitle(int i) {
    }

    @Override // xsna.bfg
    public final void y5(iag iagVar) {
    }

    @Override // xsna.d9c0
    public final void ym(boolean z) {
    }

    /* compiled from: VideoCommentsTreeInPlayerFragment.kt */
    public static final class e implements id60 {
        @Override // xsna.id60
        public final void a(UserId userId, boolean z) {
        }
    }

    @Override // xsna.d9c0
    public final void Db(Post post, PostingCreationEntryPoint postingCreationEntryPoint) {
    }

    @Override // xsna.bfg
    public final void Ec(UserId userId, NewsComment newsComment) {
    }

    @Override // xsna.bfg
    public final void Cd(UserId userId, String str, LinkButton linkButton) {
    }
}
