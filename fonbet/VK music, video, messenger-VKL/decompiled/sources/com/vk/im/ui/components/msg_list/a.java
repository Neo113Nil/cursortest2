package com.vk.im.ui.components.msg_list;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.ArraySet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k0;
import androidx.recyclerview.widget.m;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.User;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;
import com.vk.im.reporters.api.channel.ChannelStubAttachesReporter;
import com.vk.im.ui.components.msg_list.c;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.reporters.ShareType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vk.toggle.features.ImFeatures;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.completable.p;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a14;
import xsna.a1w;
import xsna.abi0;
import xsna.ams;
import xsna.amt;
import xsna.an10;
import xsna.asu0;
import xsna.axs0;
import xsna.b010;
import xsna.b0y;
import xsna.b9w;
import xsna.bbi0;
import xsna.bgk0;
import xsna.bpn0;
import xsna.bu0;
import xsna.bvm;
import xsna.by20;
import xsna.c2y;
import xsna.c5g;
import xsna.cau0;
import xsna.cew;
import xsna.chr;
import xsna.cj30;
import xsna.cn70;
import xsna.cu1;
import xsna.cu4;
import xsna.cw;
import xsna.d2y;
import xsna.dhd0;
import xsna.dke0;
import xsna.dvm;
import xsna.e2l0;
import xsna.e3m;
import xsna.e43;
import xsna.e810;
import xsna.e9w;
import xsna.el30;
import xsna.enj;
import xsna.epx;
import xsna.ers;
import xsna.f410;
import xsna.f870;
import xsna.f9w;
import xsna.fbw;
import xsna.fl30;
import xsna.fm20;
import xsna.fmm;
import xsna.fsq;
import xsna.ftx0;
import xsna.fv9;
import xsna.g34;
import xsna.g5g;
import xsna.g5v;
import xsna.gdw;
import xsna.gmm;
import xsna.gtx0;
import xsna.gzs;
import xsna.h1l;
import xsna.h34;
import xsna.hg1;
import xsna.hl30;
import xsna.hr4;
import xsna.hy0;
import xsna.i0q0;
import xsna.i140;
import xsna.i5v0;
import xsna.ie8;
import xsna.ifq0;
import xsna.ig1;
import xsna.ij8;
import xsna.il30;
import xsna.ipo0;
import xsna.iq4;
import xsna.ir4;
import xsna.izi0;
import xsna.izm0;
import xsna.izs;
import xsna.j3f0;
import xsna.j41;
import xsna.j5g;
import xsna.jl30;
import xsna.joa0;
import xsna.js4;
import xsna.jwg0;
import xsna.k9w;
import xsna.kkm;
import xsna.kq4;
import xsna.kw2;
import xsna.kwg0;
import xsna.l500;
import xsna.l5v0;
import xsna.l9w;
import xsna.lav;
import xsna.laz;
import xsna.li30;
import xsna.lis;
import xsna.llm;
import xsna.lq4;
import xsna.lxz;
import xsna.lz2;
import xsna.m1y;
import xsna.m20;
import xsna.mcl0;
import xsna.mpo0;
import xsna.msy;
import xsna.mxv;
import xsna.n5u0;
import xsna.nm30;
import xsna.nz;
import xsna.o0w;
import xsna.o25;
import xsna.o3y;
import xsna.o6p;
import xsna.ok30;
import xsna.om1;
import xsna.orw;
import xsna.p5y;
import xsna.p8s0;
import xsna.p9w;
import xsna.pbw;
import xsna.pjm;
import xsna.pro0;
import xsna.q0w0;
import xsna.q9;
import xsna.qgm;
import xsna.qk30;
import xsna.ql30;
import xsna.qtd0;
import xsna.r3h;
import xsna.rk30;
import xsna.rlh;
import xsna.rmg;
import xsna.rrz;
import xsna.rtr0;
import xsna.ru1;
import xsna.ry30;
import xsna.s2b;
import xsna.s2n0;
import xsna.s3q0;
import xsna.s5p;
import xsna.sb;
import xsna.sgk0;
import xsna.srg;
import xsna.sux;
import xsna.sxd0;
import xsna.sxv;
import xsna.t6g0;
import xsna.tk30;
import xsna.tmz;
import xsna.u370;
import xsna.u7q0;
import xsna.u90;
import xsna.ua80;
import xsna.ub80;
import xsna.ucs;
import xsna.udo;
import xsna.ug30;
import xsna.uk30;
import xsna.ur4;
import xsna.uxv;
import xsna.v14;
import xsna.v1f0;
import xsna.v2n0;
import xsna.vb80;
import xsna.vci0;
import xsna.vex;
import xsna.vm30;
import xsna.vv20;
import xsna.w1w0;
import xsna.wg30;
import xsna.wjf0;
import xsna.wjs;
import xsna.wk70;
import xsna.wl30;
import xsna.wz30;
import xsna.x14;
import xsna.xg30;
import xsna.xk30;
import xsna.xl30;
import xsna.xwv;
import xsna.xyt;
import xsna.y04;
import xsna.y040;
import xsna.y730;
import xsna.yh1;
import xsna.ym30;
import xsna.yx5;
import xsna.z580;
import xsna.z9x0;
import xsna.zdw;
import xsna.zfh0;
import xsna.zk30;
import xsna.zl30;
import xsna.zls;
import xsna.zos;
import xsna.zqn0;

/* compiled from: MsgListComponent.kt */
/* loaded from: classes2.dex */
public final class a extends i5v0 implements wjs.a {
    public static final f9w P0 = e9w.b("MsgListComponentNew");
    public static final long Q0 = TimeUnit.HOURS.toMillis(4);
    public static final Object R0 = new Object();
    public static final Object S0 = new Object();
    public static final SparseIntArray T0 = new SparseIntArray();
    public static final SparseIntArray U0 = new SparseIntArray();
    public final zdw A;
    public Set<Integer> A0;
    public final q0w0 B;
    public final LinkedHashMap B0;
    public final Lazy C;
    public final LinkedHashMap C0;
    public final z9x0 D;
    public Integer D0;
    public final Object E;
    public MsgReadAsLastData E0;
    public final bpn0 F;
    public boolean F0;
    public final js4 G;
    public int G0;
    public final bpn0 H;
    public final jl30 H0;
    public final bpn0 I;
    public final dke0 I0;
    public final kkm J;
    public final v2n0 J0;
    public final Handler K;
    public final v2n0 K0;
    public final orw L;
    public final v2n0 L0;
    public final h34 M;
    public final v2n0 M0;
    public final lq4 N;
    public final bpn0 N0;
    public final h1l O;
    public final com.vk.im.ui.components.msg_list.c O0;
    public final gmm P;
    public final e2l0 Q;
    public final sxd0 R;
    public final fv9 S;
    public final g5v T;
    public final bbi0 U;
    public final o6p V;
    public final mpo0 W;
    public final izm0 X;
    public io.reactivex.rxjava3.disposables.c Y;
    public io.reactivex.rxjava3.disposables.c Z;
    public io.reactivex.rxjava3.disposables.c a0;
    public final wjs b0;
    public io.reactivex.rxjava3.disposables.c c0;
    public io.reactivex.rxjava3.disposables.c d0;
    public io.reactivex.rxjava3.disposables.c e0;
    public io.reactivex.rxjava3.disposables.c f0;
    public final io.reactivex.rxjava3.disposables.b g0;
    public io.reactivex.rxjava3.disposables.c h0;
    public io.reactivex.rxjava3.disposables.c i0;
    public final il30 j;
    public n5u0 j0;
    public final Context k;
    public ym30.a k0;
    public final a1w l;
    public final l9w l0;
    public final String m;
    public final bpn0 m0;
    public long n;
    public final C1148a n0;
    public vm30 o;
    public sxv o0;
    public boolean p;
    public final d p0;
    public boolean q;
    public uxv q0;
    public boolean r;
    public final e r0;
    public ChatFragment.j s;
    public final c s0;
    public boolean t;
    public final b t0;
    public boolean u;
    public final com.vk.im.ui.components.msg_list.d u0;
    public boolean v;
    public boolean v0;
    public gzs<Boolean> w;
    public MsgListOpenMode w0;
    public boolean x;
    public final ArrayList x0;
    public final u90 y;
    public final Stack<Integer> y0;
    public final mxv z;
    public Integer z0;

    /* compiled from: MsgListComponent.kt */
    /* renamed from: com.vk.im.ui.components.msg_list.a$a, reason: collision with other inner class name */
    public static final class C1148a implements zqn0.c {
        public C1148a() {
        }

        @Override // xsna.zqn0.c
        public final void a() {
            a.this.I1();
        }

        @Override // xsna.zqn0.c
        public final void b() {
            a.this.I1();
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final class b extends kw2 {
        public b() {
        }

        @Override // xsna.kw2, xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            if (bgk0Var.equals(sgk0.a)) {
                a.this.p1().b();
            }
            u();
        }

        @Override // xsna.kw2, xsna.kr4
        public final void d(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            a.this.p1().onError(th.getMessage());
            u();
        }

        @Override // xsna.kw2, xsna.kr4
        public final void l(ir4 ir4Var, bgk0 bgk0Var, SpeakerType speakerType) {
            FragmentActivity activity;
            int i;
            ChatFragment.j jVar = a.this.s;
            if (jVar != null && (activity = ChatFragment.this.getActivity()) != null) {
                int i2 = iq4.$EnumSwitchMapping$0[speakerType.ordinal()];
                if (i2 == 1) {
                    i = 0;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
                activity.setVolumeControlStream(i);
            }
            u();
        }

        @Override // xsna.kw2, xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            a.this.p1().onError(th.getMessage());
            u();
        }

        @Override // xsna.kw2, xsna.kr4
        public final void o(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            a.this.p1().onError(th.getMessage());
            u();
        }

        @Override // xsna.kw2, xsna.kr4
        public final void r(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var, float f) {
            a.this.p1().a();
            u();
        }

        @Override // xsna.kw2
        public final void u() {
            a aVar = a.this;
            lq4 lq4Var = aVar.N;
            hr4 hr4Var = new hr4(0);
            ur4 b = aVar.o1().b();
            hr4Var.a = b != null ? b.a : 0;
            hr4Var.b = aVar.o1().u();
            hr4Var.c = aVar.o1().isPlaying();
            hr4Var.d = aVar.o1().o();
            lq4Var.getClass();
            bpn0 bpn0Var = i0q0.a;
            lq4Var.c = hr4Var;
            Iterator it = lq4Var.a.iterator();
            while (it.hasNext()) {
                ((kq4.a) it.next()).i(hr4Var);
            }
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final class c implements js4.a {
        public c() {
        }

        @Override // xsna.js4.a
        public final void a(xwv xwvVar) {
            lq4 lq4Var = a.this.N;
            pro0.a();
            lq4Var.e(xwvVar.f);
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final class d implements ub80 {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.ub80
        public final void c(ClickableSpan clickableSpan, View view) {
            boolean z = clickableSpan instanceof ifq0;
            a aVar = a.this;
            if (z) {
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    RecyclerView.e0 findContainingViewHolder = vm30Var.u.findContainingViewHolder(view);
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar2 = findContainingViewHolder instanceof com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a ? (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) findContainingViewHolder : null;
                    Msg msg = aVar2 != null ? aVar2.p.R : null;
                    if (msg != null) {
                        clickableSpan = new i140(((ifq0) clickableSpan).a(), msg.d);
                    }
                }
                clickableSpan = (ifq0) clickableSpan;
            }
            sxv sxvVar = aVar.o0;
            if (sxvVar != null) {
                sxvVar.c(clickableSpan, view);
            }
            gdw gdwVar = aVar.l0.a;
            if (!(clickableSpan instanceof ifq0)) {
                gdwVar.getClass();
                return;
            }
            k9w k9wVar = gdwVar.a;
            if (((Regex) laz.u.getValue()).a(Uri.parse(((ifq0) clickableSpan).a()).toString())) {
                k9wVar.a.a(new ImCallClickAnalyticsItem.e(ImCallTypeAnalyticsItem.GROUP));
            }
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final class e implements vb80 {
        public e() {
        }

        @Override // xsna.vb80
        public final void k(ClickableSpan clickableSpan, View view) {
            uxv uxvVar = a.this.q0;
            if (uxvVar != null) {
                uxvVar.k(clickableSpan, view);
            }
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Collection<? extends Msg>, io.reactivex.rxjava3.core.a> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.a invoke(Collection<? extends Msg> collection) {
            return a.c1((a) this.receiver, collection);
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            bool.getClass();
            vm30 vm30Var = ((a) this.receiver).o;
            if (vm30Var != null) {
                vm30Var.e0.dismiss();
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            a aVar = (a) this.receiver;
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                vm30Var.e0.dismiss();
            }
            a.P0.a(th2);
            vm30 vm30Var2 = aVar.o;
            if (vm30Var2 != null) {
                vm30Var2.H(th2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgListComponent.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<Collection<? extends Msg>, io.reactivex.rxjava3.core.a> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.a invoke(Collection<? extends Msg> collection) {
            return a.c1((a) this.receiver, collection);
        }
    }

    public a(il30 il30Var) {
        this.j = il30Var;
        u90 u90Var = il30Var.b;
        this.k = u90Var.B();
        a1w a1wVar = il30Var.c;
        this.l = a1wVar;
        zdw zdwVar = il30Var.h;
        ry30 d2 = zdwVar.d.d();
        this.m = "MsgListComponentNew";
        this.p = il30Var.q;
        this.q = true;
        this.r = true;
        this.u = il30Var.p;
        this.v = il30Var.o;
        this.y = u90Var;
        this.z = il30Var.g;
        a1wVar.getClass();
        this.A = zdwVar;
        this.B = zdwVar.f().b;
        this.C = il30Var.j;
        this.D = il30Var.u;
        this.E = msy.a(LazyThreadSafetyMode.NONE, new lz2(17));
        bpn0 bpn0Var = new bpn0(new b010(this, 3));
        this.F = bpn0Var;
        this.G = il30Var.i;
        this.H = new bpn0(new cu1(22));
        this.I = new bpn0(new bu0(19));
        this.J = il30Var.s;
        this.K = new Handler();
        pbw pbwVar = zdwVar.d;
        this.L = pbwVar.h();
        h34 h34Var = il30Var.y;
        this.M = h34Var;
        lq4 lq4Var = il30Var.z;
        this.N = lq4Var;
        h1l h1lVar = il30Var.A;
        this.O = h1lVar;
        gmm gmmVar = il30Var.B;
        this.P = gmmVar;
        e2l0 e2l0Var = il30Var.C;
        this.Q = e2l0Var;
        sxd0 sxd0Var = il30Var.D;
        this.R = sxd0Var;
        fv9 fv9Var = il30Var.E;
        this.S = fv9Var;
        g5v g5vVar = il30Var.F;
        this.T = g5vVar;
        bbi0 bbi0Var = il30Var.G;
        this.U = bbi0Var;
        o6p o6pVar = il30Var.H;
        this.V = o6pVar;
        mpo0 mpo0Var = il30Var.I;
        this.W = mpo0Var;
        izm0 izm0Var = il30Var.J;
        this.X = izm0Var;
        this.b0 = new wjs(a1wVar, this);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.g0 = bVar;
        this.j0 = new n5u0(bVar, new i(1, this, a.class, "updateMessagesContentCompletable", "updateMessagesContentCompletable(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Completable;", 0));
        this.l0 = new l9w(a1wVar.r().O.x());
        this.m0 = new bpn0(new vv20(this, 1));
        this.n0 = new C1148a();
        this.p0 = new d();
        this.r0 = new e();
        this.s0 = new c();
        this.t0 = new b();
        this.u0 = new com.vk.im.ui.components.msg_list.d(this);
        this.w0 = MsgListOpenAtUnreadMode.b;
        Peer.Unknown unknown = Peer.Unknown.e;
        this.x0 = new ArrayList();
        this.y0 = new Stack<>();
        this.A0 = new LinkedHashSet();
        this.B0 = new LinkedHashMap();
        this.C0 = new LinkedHashMap();
        jl30 jl30Var = new jl30(il30Var.v, il30Var.w);
        this.H0 = jl30Var;
        dke0 dke0Var = new dke0(pbwVar.t().B());
        dke0Var.b = il30Var.M;
        this.I0 = dke0Var;
        this.J0 = pbwVar.t().z();
        this.K0 = pbwVar.t().h();
        this.L0 = pbwVar.t().C();
        this.M0 = pbwVar.t().q();
        this.N0 = new bpn0(new vex(this, 5));
        int i2 = 27;
        com.vk.im.ui.components.msg_list.c cVar = new com.vk.im.ui.components.msg_list.c(il30Var, il30Var.a, a1wVar, il30Var.d, il30Var.m, il30Var.l, il30Var.k, d2, new yh1(this, i2), new nz(this, i2), jl30Var);
        w1w0 w1w0Var = zdwVar.i;
        zl30 zl30Var = cVar.o;
        zl30Var.d.q(w1w0Var);
        long j = a1wVar.a.q;
        tk30 tk30Var = zl30Var.d;
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, j, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, 1073741823));
        tk30Var.m((b9w) bpn0Var.getValue());
        tk30Var.i(h34Var);
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, gmmVar, null, null, null, null, null, null, -1, 1073725439));
        tk30Var.j(lq4Var);
        tk30Var.k(h1lVar);
        tk30Var.p(e2l0Var);
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, fv9Var, null, null, null, null, null, null, null, null, null, -1, 1073739775));
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, mpo0Var, null, null, null, -1, 1073610751));
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, izm0Var, null, null, -1, 1073479679));
        tk30Var.l(g5vVar);
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, bbi0Var, null, null, null, null, null, -1, 1073709055));
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, o6pVar, null, null, null, null, -1, 1073676287));
        tk30Var.n(il30Var.t);
        tk30Var.o(sxd0Var);
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, il30Var.N, null, -1, 1073217535));
        this.O0 = cVar;
    }

    public static boolean A1(io.reactivex.rxjava3.disposables.c cVar) {
        return (cVar == null || cVar.h()) ? false : true;
    }

    public static boolean B1(Msg msg) {
        StickerItem stickerItem;
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser != null && msgFromUser.i) {
            Attach Q7 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, new mcl0(20), false);
            AttachSticker attachSticker = Q7 instanceof AttachSticker ? (AttachSticker) Q7 : null;
            if (attachSticker != null && (stickerItem = attachSticker.g) != null && stickerItem.z9()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean G1(qtd0 qtd0Var) {
        if (qtd0Var.t1()) {
            User user = qtd0Var instanceof User ? (User) qtd0Var : null;
            if (user != null) {
                int i2 = user.z;
                return i2 == 3 || i2 == 1;
            }
            return false;
        }
        if (qtd0Var.Va()) {
            Group group = qtd0Var instanceof Group ? (Group) qtd0Var : null;
            if (group == null || !group.Cb()) {
            }
        }
        return false;
    }

    public static final void b1(a aVar, ClipVideoFile clipVideoFile, UserId userId, boolean z) {
        Owner owner;
        Owner owner2 = clipVideoFile.v0;
        Object obj = null;
        if (epx.f(owner2 != null ? owner2.b : null, userId)) {
            Owner owner3 = clipVideoFile.v0;
            if (owner3 != null) {
                owner3.g(4, z);
                return;
            }
            return;
        }
        Iterator<T> it = clipVideoFile.N1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((CoOwnerItem) next).d.b, userId)) {
                obj = next;
                break;
            }
        }
        CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
        if (coOwnerItem == null || (owner = coOwnerItem.d) == null) {
            return;
        }
        owner.g(4, z);
    }

    public static final p c1(a aVar, Collection collection) {
        a1w a1wVar = aVar.l;
        t6g0 t6g0Var = t6g0.b;
        return new p(a1wVar.C(aVar, new wk70(null, collection, t6g0.d().k0().b(aVar.n), 1)));
    }

    public final boolean C1() {
        return this.O0.g().b > 0;
    }

    public final boolean D1(Msg msg) {
        if (msg instanceof MsgFromUser) {
            return !((MsgFromUser) msg).hc();
        }
        return false;
    }

    public final boolean E1(Msg msg) {
        ArrayList arrayList = this.x0;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Msg) it.next()).b == msg.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean F1() {
        return !this.x0.isEmpty();
    }

    public final void H1() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            rk30 rk30Var = (rk30) vm30Var.s.getValue();
            RecyclerView recyclerView = vm30Var.u;
            if (epx.f(recyclerView.getItemAnimator(), rk30Var)) {
                return;
            }
            recyclerView.setItemAnimator(rk30Var);
        }
    }

    public final void I1() {
        p9w p9wVar = this.l.r().f;
        ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.CALLS_INCOMING;
        String c2 = p9wVar.c(type);
        boolean f2 = p9wVar.c.f();
        boolean z = true;
        com.vk.im.ui.components.msg_list.c cVar = this.O0;
        if (!f2) {
            cVar.getClass();
            cVar.l(true, new wl30(cVar, z, 0));
            return;
        }
        zqn0 zqn0Var = zqn0.a;
        if (zqn0Var.e(c2)) {
            zqn0Var.c();
            boolean z2 = (u370.e((NotificationManager) zqn0.e.getValue(), c2) && p9wVar.h(type)) ? false : true;
            cVar.getClass();
            cVar.l(true, new wl30(cVar, z2, 0));
        }
    }

    public final void J1(Dialog dialog) {
        if (dialog != null) {
            int gc = dialog.gc();
            int fc = dialog.fc();
            gmm gmmVar = this.P;
            gmmVar.getClass();
            bpn0 bpn0Var = i0q0.a;
            if (gmmVar.d < gc || gmmVar.c < fc) {
                gmmVar.d = gc;
                gmmVar.c = fc;
                Iterator it = gmmVar.b.iterator();
                while (it.hasNext()) {
                    ((fmm.a) it.next()).Y1();
                }
            }
            gmmVar.e = dialog.Jb();
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.h0 = f870.I(dialog);
            vm30Var.P(!r5.m);
            vm30Var.R();
        }
    }

    @Override // xsna.j8i
    public final void K0(Configuration configuration) {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.r();
        }
    }

    public final void K1(Msg msg) {
        Dialog f2;
        vm30 vm30Var;
        Dialog f3 = this.O0.f();
        if (this.e && this.v0 && f3 != null && f3.Xb().k()) {
            int i2 = 0;
            if (this.p) {
                r2(f3, msg, false);
            }
            if (!this.p || f3.Ec()) {
                return;
            }
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: notifyLatestVisibleMsgChanged " + msg.d});
            }
            com.vk.im.ui.components.msg_list.c cVar = this.O0;
            Dialog f4 = cVar.f();
            int i3 = 1;
            if (f4 != null ? f4.Qb() : false) {
                List<Msg> k = cVar.e.d.c().k();
                Msg msg2 = null;
                for (int h2 = e43.h(k); -1 < h2; h2--) {
                    Msg msg3 = k.get(h2);
                    if (msg3.d <= this.O0.o.e) {
                        break;
                    }
                    MsgFromUser msgFromUser = msg3 instanceof MsgFromUser ? (MsgFromUser) msg3 : null;
                    if (msgFromUser != null && msgFromUser.i && msgFromUser.S0()) {
                        msg2 = msg3;
                    }
                }
                if (msg2 != null) {
                    this.l.D(this, new u7q0(msg2));
                }
            }
            com.vk.im.ui.components.msg_list.c cVar2 = this.O0;
            Dialog f5 = cVar2.f();
            int i4 = 8;
            if ((f5 != null ? f5.Qb() : false) && (((f2 = cVar2.f()) == null || !f2.Cc()) && (vm30Var = this.o) != null && vm30Var.f().contains(msg))) {
                if (!(msg.d <= this.O0.o.e) && B1(msg)) {
                    List<Msg> k2 = cVar2.e.d.c().k();
                    int h3 = e43.h(k2);
                    while (true) {
                        if (-1 >= h3) {
                            break;
                        }
                        Msg msg4 = k2.get(h3);
                        if (msg4.b == msg.b) {
                            t6g0 t6g0Var = t6g0.b;
                            this.g0.b(x.B(t6g0.d().I0().e(this.n), t6g0.d().I0().b(), new hl30(new yx5(9), i2)).m(asu0.a.d()).subscribe(new y730(new ij8(20, this, msg), i3), new m20(new zos(i4), 28)));
                            break;
                        } else if (B1(msg4)) {
                            break;
                        } else {
                            h3--;
                        }
                    }
                }
            }
            if (f3.Vb() && this.O0.o.e < f3.Ub()) {
                com.vk.im.ui.components.msg_list.c cVar3 = this.O0;
                int Ub = f3.Ub();
                cVar3.getClass();
                cVar3.l(false, new rrz(cVar3, Ub, i3));
                this.l.D(this, new qgm(f3.Zb(), f3.Ub(), this.m, i4));
                return;
            }
            if (f3.Qb() && msg.i && !f3.Fc(msg)) {
                int i5 = this.O0.o.e;
                int i6 = msg.d;
                if (i5 < i6) {
                    com.vk.im.ui.components.msg_list.c cVar4 = this.O0;
                    cVar4.getClass();
                    cVar4.l(false, new rrz(cVar4, i6, i3));
                    this.l.D(this, new qgm(f3.Zb(), msg.d, this.m, i4));
                }
            }
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        u90 u90Var = this.y;
        Context B = u90Var.B();
        bpn0 bpn0Var = enj.a;
        Activity h2 = e3m.h(B);
        LayoutInflater from = LayoutInflater.from(u90Var.B());
        k0 o = this.B.d.o();
        boolean z = this.v;
        boolean z2 = this.u;
        b9w b9wVar = (b9w) this.F.getValue();
        fbw fbwVar = (fbw) this.N0.getValue();
        zdw zdwVar = this.A;
        j3f0 e2 = zdwVar.e();
        a1w a1wVar = this.l;
        v1f0 f2 = e2 != null ? e2.f(a1wVar) : null;
        j3f0 e3 = zdwVar.e();
        xyt e4 = e3 != null ? e3.e(a1wVar) : null;
        il30 il30Var = this.j;
        ql30 ql30Var = il30Var.R;
        wg30 wg30Var = new wg30(ql30Var.a, ql30Var.b, zdwVar);
        a1wVar.getClass();
        vm30 vm30Var = new vm30(h2, from, viewGroup, o, z, z2, this.A, b9wVar, new q9(a1wVar, 16), this.J, fbwVar, f2, e4, wg30Var, null, this.H0, il30Var.x, null, this.p0, this.r0, new wz30(0), il30Var.K, this.O, il30Var.L != 2, ((Boolean) this.H.getValue()).booleanValue(), false, null, 100810752);
        vm30Var.t0 = this.u0;
        vm30Var.I.L(true);
        vm30Var.z(true);
        vm30Var.y(this.G0);
        this.o = vm30Var;
        wjf0.c(vm30Var.u, new l500(this, 7));
        return this.o.t;
    }

    public final void L1(Peer peer, boolean z) {
        io.reactivex.rxjava3.internal.operators.single.c C = this.l.C(this, new s5p(peer, z));
        asu0 asu0Var = asu0.a;
        I0(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new fsq(new udo(this, 29), 8), new b0y(new el30(this, 0), 7)));
    }

    @Override // xsna.wjs.a
    public final void M() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.v0) {
            p2();
        }
        this.J0.onDestroy();
        this.K0.onDestroy();
        this.L0.onDestroy();
        this.M0.onDestroy();
        com.vk.im.ui.components.msg_list.c cVar = this.O0;
        io.reactivex.rxjava3.disposables.b bVar = cVar.l;
        cVar.j = false;
        io.reactivex.rxjava3.disposables.c cVar2 = cVar.m;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        cVar.m = null;
        bVar.dispose();
        io.reactivex.rxjava3.disposables.c cVar3 = cVar.p;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = cVar.q;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        l5v0 l5v0Var = cVar.e;
        l5v0Var.d.k();
        l5v0Var.p.e();
        l5v0Var.p.dispose();
        l5v0Var.d.onDestroy();
        l5v0Var.q.dispose();
        l5v0Var.j.f();
        cVar.n.f();
        this.M.a.clear();
        this.N.a.clear();
        this.P.b.clear();
        this.Q.a.clear();
        this.S.b.clear();
        mpo0 mpo0Var = this.W;
        mpo0Var.a.clear();
        mpo0Var.b.clear();
        this.T.f();
        o6p o6pVar = this.V;
        o6pVar.a.clear();
        o6pVar.b.clear();
        bbi0 bbi0Var = this.U;
        bbi0Var.getClass();
        bbi0Var.b = EmptySet.b;
        bbi0Var.a.clear();
        this.R.c.clear();
        this.O.d();
    }

    public final void M1(Peer peer) {
        ClipsRouter.j((ClipsRouter) this.j.O.invoke(), this.k, new ClipGridParams.OnlyId.Profile(com.vk.dto.common.a.b(peer)), o25.a().a(com.vk.dto.common.a.b(peer)), null, null, 56);
    }

    @Override // xsna.j8i
    public final void N0() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.t0 = null;
        }
        if (vm30Var != null) {
            vm30Var.b();
        }
        this.o = null;
        this.O0.k = false;
        io.reactivex.rxjava3.disposables.c cVar = this.e0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.e0 = null;
    }

    public final void N1(Msg msg) {
        this.O0.k(msg);
        int i2 = msg.d;
        this.T.e(MsgIdType.CNV_ID, i2);
    }

    public final void O1(Msg msg) {
        Dialog f2 = this.O0.f();
        if (f2 == null) {
            return;
        }
        r2(f2, msg, true);
    }

    public final void P1(Attach attach, Boolean bool, long j) {
        this.z.k().q(this.k, attach, bool, j);
    }

    @Override // xsna.j8i
    public final void Q0() {
        e2l0 e2l0Var = this.Q;
        if (e2l0Var.b != StickerAnimationState.DISABLE) {
            e2l0Var.d(StickerAnimationState.PLAY);
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.N();
        }
        k2("onStartView", true);
    }

    public final void Q1(MsgListOpenMode msgListOpenMode) {
        List<Attach> K0;
        if ((msgListOpenMode instanceof MsgListOpenAtMsgMode) && epx.f(this.j.r, "conversation_link")) {
            gtx0 d2 = this.O0.d(((MsgListOpenAtMsgMode) msgListOpenMode).c);
            if (d2 != null) {
                Attach attach = null;
                com.vk.im.engine.models.messages.a aVar = d2 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) d2 : null;
                if (aVar != null && (K0 = aVar.K0()) != null) {
                    attach = (Attach) j5g.a0(K0);
                }
                if (attach != null && (attach instanceof AttachGift) && ((AttachGift) attach).g()) {
                    P1(attach, Boolean.FALSE, this.n);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final void R0() {
        fbw fbwVar;
        e2l0 e2l0Var = this.Q;
        if (e2l0Var.b != StickerAnimationState.DISABLE) {
            e2l0Var.d(StickerAnimationState.PAUSE);
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.O();
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null && (fbwVar = vm30Var2.e) != null) {
            fbwVar.a();
        }
        z9x0 z9x0Var = this.D;
        LinkedHashSet linkedHashSet = z9x0Var.h;
        z9x0Var.a(linkedHashSet, linkedHashSet);
        z9x0Var.g.clear();
        ChannelStubAttachesReporter channelStubAttachesReporter = z9x0Var.d;
        if (channelStubAttachesReporter != null) {
            channelStubAttachesReporter.a();
        }
        p8s0 p8s0Var = (p8s0) this.E.getValue();
        LinkedHashSet linkedHashSet2 = p8s0Var.c;
        p8s0Var.a(linkedHashSet2, linkedHashSet2);
    }

    public final void R1(Msg msg) {
        if (E1(msg)) {
            rmg rmgVar = new rmg(msg, 27);
            ArrayList arrayList = this.x0;
            g5g.D(arrayList, true, rmgVar);
            u2();
            ChatFragment.j jVar = this.s;
            if (jVar != null) {
                jVar.b(new ArrayList(arrayList));
            }
        }
        v1();
    }

    @Override // xsna.j8i
    public final void S0(View view) {
        k2("onViewCreated", false);
    }

    public final void S1(ArrayList arrayList) {
        ArrayList arrayList2 = this.x0;
        if (arrayList2.containsAll(arrayList)) {
            arrayList2.removeAll(arrayList);
            u2();
            ChatFragment.j jVar = this.s;
            if (jVar != null) {
                jVar.b(new ArrayList(arrayList2));
            }
        }
        v1();
    }

    public final void T1(xl30 xl30Var, m.d dVar, String str) {
        Dialog f2;
        final vm30 vm30Var = this.o;
        if (vm30Var == null) {
            return;
        }
        boolean z = xl30Var.e;
        MsgListOpenMode msgListOpenMode = xl30Var.d;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = xl30Var.c;
        zfh0 g2 = z ? vm30Var.g(str) : null;
        boolean z2 = false;
        com.vk.im.ui.components.msg_list.c cVar = this.O0;
        if (msgListOpenMode != null) {
            vm30 vm30Var2 = this.o;
            if (vm30Var2 != null) {
                wjf0.c(vm30Var2.u, new l500(this, 7));
            }
            e2(list, dVar, str.concat("->renderMsgListState.openMode"));
            MsgReadAsLastData msgReadAsLastData = this.E0;
            if (g2 != null) {
                vm30Var.t(g2, true, str.concat("->renderMsgListState.openMode"));
            } else if (msgListOpenMode instanceof MsgListOpenAtMsgMode) {
                MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) msgListOpenMode;
                vm30Var.l(msgListOpenAtMsgMode.b, msgListOpenAtMsgMode.c, str.concat("->renderMsgListState.MsgListOpenAtMsgMode"));
            } else if (msgListOpenMode instanceof MsgListOpenAtLatestMode) {
                vm30Var.j(str.concat("->renderMsgListState.MsgListOpenAtLatestMode"));
            } else {
                if (this.F0 && msgReadAsLastData != null) {
                    int i2 = msgReadAsLastData.a;
                    if (this.p && (f2 = cVar.f()) != null) {
                        Msg d2 = cVar.d(i2);
                        MsgFromUser msgFromUser = d2 instanceof MsgFromUser ? (MsgFromUser) d2 : null;
                        if (msgFromUser != null) {
                            boolean Ea = msgFromUser.Ea();
                            boolean z3 = msgFromUser.A4(false) || msgFromUser.D3(AttachChannelMessage.class, false);
                            Integer num = msgReadAsLastData.d;
                            int Ub = f2.Ub();
                            if (((num != null && num.intValue() == Ub) || i2 == f2.Ub()) && msgReadAsLastData.b == 1 && msgFromUser.T == null) {
                                z2 = true;
                            }
                            if ((Ea && z2) || (z3 && z2)) {
                                vm30 vm30Var3 = this.o;
                                if (vm30Var3 != null) {
                                    ig1 ig1Var = new ig1(19, this, msgReadAsLastData);
                                    RecyclerView recyclerView = vm30Var3.u;
                                    recyclerView.removeOnScrollListener(vm30Var3.O);
                                    ig1Var.invoke();
                                    recyclerView.postDelayed(new ucs(vm30Var3, 1), 1000L);
                                }
                            }
                        }
                    }
                }
                Dialog f3 = cVar.f();
                if (f3 == null || !f3.Qb()) {
                    vm30Var.j(str.concat("->renderMsgListState.openModeElse"));
                } else {
                    final String concat = str.concat("->renderMsgListState.hasUnreadIncoming");
                    ok30 ok30Var = vm30Var.H;
                    int i3 = vm30Var.h0.e;
                    final int i4 = -1;
                    if (ok30Var != null) {
                        int i5 = -1;
                        for (int size = ok30Var.f.size() - 1; -1 < size; size--) {
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(size, ok30Var.f);
                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0 = gVar != null ? gVar.E0() : null;
                            if (E0 != null && !E0.t && !E0.q) {
                                if (E0.c <= i3) {
                                    break;
                                } else {
                                    i5 = size;
                                }
                            }
                        }
                        i4 = i5 - 1;
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i4, ok30Var.f);
                        if (gVar2 == null || !gVar2.v0()) {
                            i4 = i5;
                        }
                    }
                    L.d(new gzs() { // from class: xsna.hm30
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder a = vq.a("ChatScrollIssue: instantScrollToFirstUnread position=", i4, '/');
                            a.append(vm30Var.H.f.size() - 1);
                            a.append(", chain=");
                            a.append(concat);
                            return a.toString();
                        }
                    });
                    vm30Var.m(i4, vm30Var.Z, concat);
                }
            }
        } else {
            e2(list, dVar, str.concat("->renderMsgListState.notOpenModeNEW"));
            List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list3 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 : list3) {
                    arrayList.add(gVar3 instanceof rtr0 ? (rtr0) gVar3 : null);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    rtr0 rtr0Var = (rtr0) it.next();
                    String str2 = rtr0Var != null ? rtr0Var.f : null;
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                Set S02 = j5g.S0(arrayList2);
                if (!this.W.b.keySet().containsAll(S02)) {
                    x b2 = this.j.f.b(this, new llm(S02, Source.ACTUAL));
                    asu0 asu0Var = asu0.a;
                    b0 m = b2.q(asu0Var.c()).m(asu0Var.d());
                    om1 om1Var = new om1(new ie8(1, this, a.class, "setThemeNames", "setThemeNames(Ljava/util/Map;)V", 0, 6), 27);
                    int i6 = kwg0.a;
                    this.g0.b(m.subscribe(om1Var, new jwg0("MsgListComponentNew")));
                }
            }
            this.R.d(cVar.h(), null);
            J1(cVar.f());
            if (xl30Var.g) {
                Z1(str.concat("->renderMsgListState.notOpenMode"), xl30Var.f);
            } else if (g2 != null) {
                vm30Var.t(g2, false, str.concat("->renderMsgListState.notOpenMode"));
            }
        }
        ChatFragment.j jVar = this.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar2 = ChatFragment.w1;
            chatFragment.po();
        }
        cVar.getClass();
        li30 li30Var = xl30Var.h;
        if (li30Var == null) {
            return;
        }
        cVar.c.c(li30Var.a);
    }

    public final void U1() {
        io.reactivex.rxjava3.disposables.c cVar = this.a0;
        if (cVar != null) {
            cVar.dispose();
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
        this.a0 = null;
    }

    public final void V1() {
        wjs wjsVar = this.b0;
        io.reactivex.rxjava3.disposables.c cVar = wjsVar.d;
        if (cVar != null) {
            cVar.dispose();
        }
        wjsVar.d = null;
    }

    public final void W1() {
        this.b0.b();
    }

    @Override // xsna.i5v0
    public final a1w X0() {
        return this.l;
    }

    public final void X1(long j, MsgListOpenMode msgListOpenMode) {
        jl30 jl30Var = this.H0;
        jl30Var.a.c(jl30Var.k());
        if (epx.f(this.j.r, "message_push")) {
            dke0 dke0Var = this.I0;
            if (dke0Var.b != null) {
                dke0Var.c = true;
                dke0Var.a.b();
            } else {
                dke0Var.c = false;
            }
        }
        boolean z = this.n == j;
        boolean f2 = epx.f(this.w0, msgListOpenMode);
        if (z && f2) {
            return;
        }
        if (this.v0) {
            p2();
        }
        if (j != 0) {
            m2(j, msgListOpenMode);
        }
    }

    @Override // xsna.i5v0
    public final vm30 Y0() {
        return this.o;
    }

    public final void Y1() {
        io.reactivex.rxjava3.disposables.c cVar = this.c0;
        if (cVar != null) {
            cVar.dispose();
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
        this.c0 = null;
    }

    @Override // xsna.i5v0
    public final void Z0(pjm pjmVar) {
        this.k0 = pjmVar;
    }

    public final void Z1(String str, boolean z) {
        if (!this.v0 || this.O0.j) {
            return;
        }
        boolean z2 = this.O0.e.d.c().e;
        Dialog f2 = this.O0.f();
        boolean Qb = f2 != null ? f2.Qb() : false;
        MsgListOpenAtLatestMode msgListOpenAtLatestMode = MsgListOpenAtLatestMode.b;
        this.w0 = msgListOpenAtLatestMode;
        if (z2) {
            this.O0.j(msgListOpenAtLatestMode);
            return;
        }
        if (Qb) {
            if (z) {
                vm30 vm30Var = this.o;
                if (vm30Var != null) {
                    vm30Var.K(str.concat("->scrollToLatest"));
                    return;
                }
                return;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            vm30 vm30Var2 = this.o;
            if (vm30Var2 != null) {
                vm30Var2.k(str.concat("->scrollToLatest"));
                return;
            }
            return;
        }
        if (z) {
            vm30 vm30Var3 = this.o;
            if (vm30Var3 != null) {
                vm30Var3.J(str.concat("->scrollToLatest"));
                return;
            }
            return;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        vm30 vm30Var4 = this.o;
        if (vm30Var4 != null) {
            vm30Var4.j(str.concat("->scrollToLatest"));
        }
    }

    public final void a2(MsgIdType msgIdType, int i2, String str) {
        if (!this.v0 || this.O0.j) {
            return;
        }
        if (u1(msgIdType, i2)) {
            vm30 vm30Var = this.o;
            if (vm30Var != null) {
                vm30Var.L(msgIdType, i2, str);
                return;
            }
            return;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: scrollToMsg NOMSG " + i2 + ' ' + msgIdType + " tag=" + str});
        }
        MsgListOpenAtMsgMode msgListOpenAtMsgMode = new MsgListOpenAtMsgMode(msgIdType, i2);
        this.w0 = msgListOpenAtMsgMode;
        this.O0.j(msgListOpenAtMsgMode);
    }

    public final void b2(boolean z) {
        this.t = z;
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.p(z);
        }
        l2();
    }

    public final void c2(ChatFragment.j jVar) {
        this.s = jVar;
    }

    @Override // xsna.wjs.a
    public final void d0(qtd0 qtd0Var) {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 == null || !(qtd0Var instanceof User)) {
            return;
        }
        User user = (User) qtd0Var;
        if (user.z == 1) {
            zls.o(ams.a(), vm30Var2.a, user.R == SocialButtonType.FOLLOW, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(Msg msg) {
        ChatFragment.j jVar;
        Dialog f2;
        if (E1(msg)) {
            return;
        }
        ArrayList arrayList = this.x0;
        if (arrayList.isEmpty() && (msg instanceof MsgFromUser) && (f2 = this.O0.f()) != null) {
            if (f2.T8() && com.vk.im.engine.utils.a.j(msg)) {
                vm30 vm30Var = this.o;
                if (vm30Var != null) {
                    MsgFromUser msgFromUser = (MsgFromUser) msg;
                    fm20 fm20Var = new fm20(this, 3);
                    RecyclerView recyclerView = vm30Var.u;
                    int a = qk30.a(vm30Var.H, MsgIdType.LOCAL_ID, msgFromUser.b);
                    View findViewByPosition = a == -1 ? null : vm30Var.I.findViewByPosition(a);
                    if (findViewByPosition == null) {
                        vm30Var.u(msgFromUser);
                        vm30.M(msgFromUser.d, cn70.b(3) + cn70.b(75) + vm30Var.j0, MsgIdType.CNV_ID, vm30Var);
                        recyclerView.addOnScrollListener(new vm30.h(new ru1(vm30Var, msgFromUser, fm20Var, 4)));
                    } else {
                        int[] iArr = new int[2];
                        findViewByPosition.getLocationInWindow(iArr);
                        int[] iArr2 = new int[2];
                        recyclerView.getLocationInWindow(iArr2);
                        boolean z = (iArr[1] - (iArr2[1] + vm30Var.j0)) - cn70.b(75) < cn70.b(3);
                        boolean z2 = recyclerView.computeVerticalScrollOffset() > 0;
                        if (z && z2) {
                            vm30Var.u(msgFromUser);
                            vm30.M(msgFromUser.d, cn70.b(3) + cn70.b(75) + vm30Var.j0, MsgIdType.CNV_ID, vm30Var);
                            recyclerView.addOnScrollListener(new vm30.h(new s2b(vm30Var, msgFromUser, fm20Var, 6)));
                        } else {
                            if (vm30Var.u(msgFromUser)) {
                                vm30Var.m(0, cn70.b(3) + cn70.b(75) + vm30Var.j0, "scrollToAdditionalOffset");
                            }
                            recyclerView.post(new nm30(vm30Var, msgFromUser, fm20Var, 0));
                        }
                    }
                }
                arrayList.add(msg);
                u2();
                jVar = this.s;
                if (jVar == null) {
                    jVar.b(new ArrayList(arrayList));
                    return;
                }
                return;
            }
        }
        v1();
        arrayList.add(msg);
        u2();
        jVar = this.s;
        if (jVar == null) {
        }
    }

    public final void d2(boolean z) {
        mpo0 mpo0Var = this.W;
        mpo0Var.getClass();
        bpn0 bpn0Var = i0q0.a;
        mpo0Var.c = z;
        Iterator it = mpo0Var.a.iterator();
        while (it.hasNext()) {
            ((ipo0.a) it.next()).C5();
        }
    }

    public final void e1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (E1((Msg) it.next())) {
                it.remove();
            }
        }
        ArrayList arrayList3 = this.x0;
        arrayList3.addAll(arrayList2);
        u2();
        ChatFragment.j jVar = this.s;
        if (jVar != null) {
            jVar.b(new ArrayList(arrayList3));
        }
        v1();
    }

    public final void e2(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, m.d dVar, String str) {
        List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2;
        if (this.O0.j && ((list2 = list) == null || list2.isEmpty())) {
            vm30 vm30Var = this.o;
            if (vm30Var != null) {
                vm30.x(vm30Var, null, "showFullScreenLoader", 8);
                return;
            }
            return;
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            vm30Var2.w(dVar, list, str, this.O0.k);
        }
    }

    public final void f1(Attach attach) {
        a14 a14Var = new a14(attach);
        a1w a1wVar = this.l;
        a1wVar.D(this, a14Var);
        a1wVar.D(this, new y04(attach.xb()));
    }

    public final void f2(boolean z) {
        this.x = z;
    }

    public final void g1(Attach attach) {
        Integer num;
        File i1;
        String path;
        ArrayList o = e43.o(Integer.valueOf(attach.xb()));
        ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
        if (ftx0Var != null && (i1 = ftx0Var.i1()) != null && (path = i1.getPath()) != null) {
            o.addAll(k1(path));
        }
        if (this.v0) {
            int size = o.size();
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Number) o.get(i2)).intValue();
                T0.delete(intValue);
                U0.delete(intValue);
                g34.a aVar = (g34.a) this.M.a.get(Integer.valueOf(intValue));
                if (aVar != null) {
                    aVar.f(intValue);
                }
            }
        }
        int xb = attach.xb();
        if (this.A0.contains(Integer.valueOf(xb))) {
            this.C0.put(Integer.valueOf(xb), Double.valueOf(100.0d));
            this.A0.remove(Integer.valueOf(xb));
            t2();
            if (!this.A0.isEmpty() || (num = this.z0) == null) {
                return;
            }
            this.l.D(this, new cj30(num.intValue()));
        }
    }

    public final void g2(boolean z) {
        this.v = z;
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.r0 = z;
            vm30Var.R();
        }
    }

    public final void h1(Integer num, String str) {
        il30 il30Var = this.j;
        il30Var.getClass();
        il30Var.r = str;
        this.I0.b = num;
    }

    public final void h2(gzs<Boolean> gzsVar) {
        this.w = gzsVar;
    }

    public final void i1() {
        ArrayList arrayList = this.x0;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
            u2();
            ChatFragment.j jVar = this.s;
            if (jVar != null) {
                jVar.b(new ArrayList(0));
            }
        }
        v1();
    }

    public final void i2(boolean z) {
        e2l0 e2l0Var = this.Q;
        if (z) {
            e2l0Var.d(StickerAnimationState.PLAY);
        } else {
            e2l0Var.d(StickerAnimationState.DISABLE);
        }
    }

    public final void j1(int i2) {
        this.g0.b(new io.reactivex.rxjava3.internal.operators.single.b(new y040(this.k, this.l, Collections.singletonList(Integer.valueOf(i2)))).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new c2y(new rlh(this, 25), 7), new xk30(new d2y(this, 8), 0)));
    }

    public final void j2(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        mpo0 mpo0Var = this.W;
        mpo0Var.getClass();
        bpn0 bpn0Var = i0q0.a;
        mpo0Var.b = linkedHashMap;
        Iterator it = mpo0Var.a.iterator();
        while (it.hasNext()) {
            ((ipo0.a) it.next()).U3();
        }
    }

    public final Collection<Integer> k1(String str) {
        vm30 vm30Var = this.o;
        if (vm30Var == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = vm30Var.u;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != null) {
                Object findContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                chr chrVar = findContainingViewHolder instanceof chr ? (chr) findContainingViewHolder : null;
                if (chrVar != null) {
                    arrayList.addAll(chrVar.v(str));
                }
            }
        }
        return arrayList;
    }

    public final void k2(String str, boolean z) {
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list;
        com.vk.im.ui.components.msg_list.c cVar = this.O0;
        if (!cVar.k) {
            Pair<xl30, c.a> P02 = cVar.f.P0();
            xl30 i2 = P02.i();
            c.a j = P02.j();
            m.d dVar = j.a;
            j.a = null;
            T1(i2, dVar, str);
            cVar.k = z || !((list = P02.i().c) == null || list.isEmpty());
        }
        if (cVar.k && this.e0 == null) {
            this.e0 = hg1.h(cVar.g.a0(asu0.a.d()), new e810(this, 6));
        }
    }

    @Override // xsna.wjs.a
    public final void l0(Throwable th) {
        P0.a(th);
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            vm30Var2.H(th);
        }
    }

    public final Msg l1(int i2) {
        return this.O0.e(Integer.valueOf(i2));
    }

    public final void l2() {
        MsgListEmptyViewState.DrawStyle drawStyle;
        boolean z = this.t;
        if (z) {
            drawStyle = MsgListEmptyViewState.DrawStyle.CONTRAST;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            drawStyle = MsgListEmptyViewState.DrawStyle.NORMAL;
        }
        MsgListEmptyViewState.DrawStyle drawStyle2 = drawStyle;
        com.vk.im.ui.components.msg_list.c cVar = this.O0;
        Dialog f2 = cVar.f();
        if (f2 == null) {
            f2 = new Dialog();
            f2.setId(this.n);
        }
        Dialog dialog = f2;
        a1w a1wVar = this.l;
        cau0 cau0Var = a1wVar.r().h;
        dialog.uc();
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(cVar.h().Ob());
        ers e2 = cVar.e.e();
        if (e2 == null) {
            e2 = ers.g;
        }
        ers ersVar = e2;
        boolean z2 = (BuildInfo.t() || BuildInfo.r()) ? false : true;
        boolean f3 = epx.f(o25.a().o().k, Boolean.TRUE);
        a1wVar.r().getClass();
        MsgListEmptyViewState.ForDialog forDialog = new MsgListEmptyViewState.ForDialog(dialog, profilesSimpleInfo, ersVar, z2, f3, true, MsgListEmptyViewState.ForDialog.Motivation.TEXT_TO_VIEW_PROFILE, drawStyle2);
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.v(forDialog);
        }
    }

    public final View m1(int i2) {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            return vm30Var.e(i2);
        }
        return null;
    }

    public final void m2(long j, MsgListOpenMode msgListOpenMode) {
        if (this.v0) {
            throw new IllegalStateException("Already observing dialog #" + this.n);
        }
        a1w a1wVar = this.l;
        if (a1wVar.u()) {
            this.A.u.getClass();
            this.E0 = cew.f(j);
            io.reactivex.rxjava3.disposables.c cVar = this.d0;
            if (cVar != null) {
                cVar.dispose();
            }
            m1 a = a1wVar.l.a();
            asu0 asu0Var = asu0.a;
            this.d0 = a.a0(asu0Var.d()).subscribe(new z580(this));
            f fVar = new f(1, this, a.class, "updateMessagesContentCompletable", "updateMessagesContentCompletable(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Completable;", 0);
            io.reactivex.rxjava3.disposables.b bVar = this.g0;
            this.j0 = new n5u0(bVar, fVar);
            b9w b9wVar = (b9w) this.F.getValue();
            if (b9wVar != null) {
                b9wVar.d(String.valueOf(j));
            }
            this.G.e(this.s0);
            o1().v(this.t0);
            this.i0 = io.reactivex.rxjava3.kotlin.c.f(3, this.z.d().T().m().d, null, null, new f410(this, 6));
            this.v0 = true;
            this.n = j;
            this.w0 = msgListOpenMode;
            a1wVar.q();
            T0.clear();
            U0.clear();
            i1();
            vm30 vm30Var = this.o;
            if (vm30Var != null) {
                vm30Var.t0 = this.u0;
            }
            com.vk.im.ui.components.msg_list.c cVar2 = this.O0;
            cVar2.a();
            if (this.j.n && (msgListOpenMode instanceof MsgListOpenAtMsgMode)) {
                MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) msgListOpenMode;
                this.T.e(msgListOpenAtMsgMode.b, msgListOpenAtMsgMode.c);
            }
            io.reactivex.rxjava3.disposables.c cVar3 = this.h0;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            this.h0 = cVar2.i.a0(asu0Var.d()).subscribe(new zk30(new r3h(this, 28), 0));
            io.reactivex.rxjava3.disposables.c cVar4 = this.f0;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            this.f0 = this.J.c.a0(asu0Var.d()).subscribe(new fl30(new srg(this, 29), 0));
            cVar2.j(msgListOpenMode);
            bVar.b(a1wVar.E(this, new axs0()).subscribe(new amt(new lxz(this, 5), 10), new lav(new sux(4), 7)));
            zqn0.a.b(this.n0);
            I1();
        }
    }

    public final void n1(int i2, ShareType shareType) {
        Msg e2 = this.O0.e(Integer.valueOf(i2));
        if ((e2 instanceof MsgFromUser) && ((MsgFromUser) e2).Qb()) {
            mxv mxvVar = this.z;
            o0w.C(mxvVar.b(), this.y, mxvVar.b().b(this.l.q(), Collections.singletonList(e2)), this.x, 4);
            xg30.b(shareType);
        }
    }

    public final void n2(Msg msg) {
        if (!this.v0 || A1(this.Y)) {
            return;
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.I();
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.Y = this.l.E(this, new bvm(Peer.a.b(this.n), msg.b, this.m)).subscribe(new tmz(new g(1, this, a.class, "onPinnedMsgAttachSuccess", "onPinnedMsgAttachSuccess(Z)V", 0), 3), new cw(new h(1, this, a.class, "onPinnedMsgAttachError", "onPinnedMsgAttachError(Ljava/lang/Throwable;)V", 0), 29));
    }

    public final ir4 o1() {
        return (ir4) this.C.getValue();
    }

    public final void o2() {
        if (!this.v0 || A1(this.Y)) {
            return;
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            com.vk.im.popup.b bVar = vm30Var.e0;
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            bVar.b(new joa0(com.vk.toggle.b.A.a(imFeatures)), new by20(vm30Var, 2));
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        int i2 = 0;
        this.Z = this.l.E(this, new dvm(Peer.a.b(this.n), false, this.m)).subscribe(new j41(new hy0(1, this, a.class, "onPinnedMsgDetachSuccess", "onPinnedMsgDetachSuccess(Z)V", i2, 7), 24), new o3y(new cu4(1, this, a.class, "onPinnedMsgDetachError", "onPinnedMsgDetachError(Ljava/lang/Throwable;)V", i2, 6), 5));
    }

    public final s2n0 p1() {
        return (s2n0) this.m0.getValue();
    }

    public final void p2() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.t0 = null;
        }
        b9w b9wVar = (b9w) this.F.getValue();
        if (b9wVar != null) {
            b9wVar.d(null);
        }
        o1().y(this.t0);
        this.G.d(this.s0);
        this.K.removeCallbacksAndMessages(R0);
        this.T.d();
        U1();
        Y1();
        V1();
        W1();
        io.reactivex.rxjava3.disposables.c cVar = this.d0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d0 = null;
        this.g0.e();
        io.reactivex.rxjava3.disposables.c cVar2 = this.h0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.h0 = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.i0;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.i0 = null;
        io.reactivex.rxjava3.disposables.c cVar4 = this.f0;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        this.f0 = null;
        i1();
        this.n = 0L;
        this.w0 = MsgListOpenAtUnreadMode.b;
        Peer.Unknown unknown = Peer.Unknown.e;
        this.O0.a();
        T0.clear();
        U0.clear();
        ChatFragment.j jVar = this.s;
        if (jVar != null) {
            jVar.a(false);
        }
        this.v0 = false;
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            wjf0.c(vm30Var2.u, new l500(this, 7));
        }
        zqn0.a.j(this.n0);
    }

    public final String q1() {
        return this.m;
    }

    public final void q2(ug30.z zVar, boolean z) {
        this.z.d().T().j(zVar.c, com.vk.dto.common.a.b(zVar.a), zVar.b, z ? t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT_EMPTY) : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT), null, (r22 & 32) != 0 ? false : false, (r22 & 128) != 0 ? null : null, (r22 & 256) != 0 ? null : null, (r22 & 512) != 0 ? null : null, null);
    }

    public final int r1() {
        double d2;
        Set entrySet = this.C0.entrySet();
        ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
        Iterator it = entrySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Double d3 = (Double) this.B0.get(entry.getKey());
            if (d3 != null) {
                d2 = d3.doubleValue();
            }
            arrayList.add(new Pair(Double.valueOf(d2), entry.getValue()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            d2 += ((Number) pair.j()).doubleValue() * ((Number) pair.i()).doubleValue();
        }
        return an10.a(d2);
    }

    public final void r2(Dialog dialog, Msg msg, boolean z) {
        if (dialog.tc() || dialog.rc() || dialog.Va() || !dialog.Gb() || !(msg instanceof MsgFromUser)) {
            return;
        }
        MsgFromUser msgFromUser = (MsgFromUser) msg;
        Integer num = msgFromUser.R;
        Msg d2 = num != null ? this.O0.d(num.intValue()) : null;
        MsgFromUser msgFromUser2 = d2 instanceof MsgFromUser ? (MsgFromUser) d2 : null;
        if (msgFromUser2 == null) {
            x1(dialog, msgFromUser, null, z);
            return;
        }
        Integer num2 = msgFromUser.R;
        if (num2 != null) {
            int intValue = num2.intValue();
            Integer num3 = msgFromUser2.R;
            if (num3 != null) {
                Pair pair = intValue > num3.intValue() ? new Pair(msg, msgFromUser2) : new Pair(msgFromUser2, msg);
                MsgFromUser msgFromUser3 = (MsgFromUser) pair.d();
                MsgFromUser msgFromUser4 = (MsgFromUser) pair.g();
                if (msgFromUser3.d + 1 == msgFromUser4.d) {
                    x1(dialog, msgFromUser3, msgFromUser4, z);
                } else {
                    x1(dialog, msgFromUser3, null, z);
                }
            }
        }
    }

    public final qtd0 s1(long j) {
        return this.O0.e.e.b().Cb(Long.valueOf(j));
    }

    public final void s2(int i2, int i3, int i4) {
        if (this.A0.contains(Integer.valueOf(i2))) {
            this.C0.put(Integer.valueOf(i2), Double.valueOf((i3 / i4) * 100));
            t2();
        }
    }

    public final Collection<Msg> t1() {
        vm30 vm30Var = this.o;
        return vm30Var != null ? vm30Var.f() : EmptyList.b;
    }

    public final void t2() {
        v14 v14Var;
        int r1 = r1();
        vm30 vm30Var = this.o;
        if (vm30Var == null || (v14Var = vm30Var.u0) == null) {
            return;
        }
        View view = v14Var.Hn().Y;
        x14 x14Var = view instanceof x14 ? (x14) view : null;
        if (x14Var == null) {
            return;
        }
        x14Var.setProgress(r1);
    }

    @Override // xsna.wjs.a
    public final void u(Throwable th) {
        P0.a(th);
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.e0.dismiss();
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            vm30Var2.H(th);
        }
    }

    public final boolean u1(MsgIdType msgIdType, int i2) {
        return this.O0.e.d.c().r(msgIdType, i2);
    }

    public final void u2() {
        bbi0 bbi0Var = this.U;
        Set<Integer> set = bbi0Var.b;
        ArraySet arraySet = new ArraySet();
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            arraySet.add(Integer.valueOf(((Msg) it.next()).b));
        }
        bbi0Var.b = arraySet;
        bpn0 bpn0Var = i0q0.a;
        Iterator it2 = bbi0Var.a.iterator();
        while (it2.hasNext()) {
            ((abi0.a) it2.next()).h(bbi0Var.b());
        }
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            ok30 ok30Var = vm30Var.H;
            vm30Var.A(arraySet.isEmpty());
            vci0 vci0Var = vm30Var.n0;
            if (vci0Var != null) {
                vci0Var.m(!arraySet.isEmpty());
            }
            Set<Integer> set2 = set;
            Iterator it3 = izi0.j(j5g.E0(set2, arraySet), j5g.E0(arraySet, set2)).iterator();
            while (it3.hasNext()) {
                Iterator it4 = ok30Var.x0(MsgIdType.LOCAL_ID, ((Number) it3.next()).intValue()).iterator();
                while (it4.hasNext()) {
                    ok30Var.notifyItemChanged(((Number) it4.next()).intValue());
                }
            }
        }
    }

    @Override // xsna.wjs.a
    public final void v(qtd0 qtd0Var) {
        boolean z = qtd0Var instanceof User;
        User user = z ? (User) qtd0Var : null;
        boolean z2 = user != null && user.z == 2;
        if (z && ((User) qtd0Var).R == SocialButtonType.FOLLOW) {
            vm30 vm30Var = this.o;
            if (vm30Var != null) {
                vm30Var.e0.b(new dhd0(false), new m1y(vm30Var, 8));
                return;
            }
            return;
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            vm30Var2.E(z2);
        }
    }

    public final void v1() {
        vm30 vm30Var = this.o;
        if (vm30Var != null) {
            vm30Var.i();
        }
    }

    public final void w1(MsgIdType msgIdType, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        g5v g5vVar = this.T;
        Pair<Integer, ? extends MsgIdType> pair = g5vVar.b;
        if (pair == null ? false : pair.equals(new Pair(valueOf, msgIdType))) {
            return;
        }
        g5vVar.d();
        g5vVar.e(msgIdType, i2);
        Handler handler = this.K;
        Object obj = R0;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new sb(this, 5), obj, SystemClock.uptimeMillis() + 2000);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(Dialog dialog, MsgFromUser msgFromUser, MsgFromUser msgFromUser2, boolean z) {
        MsgReadAsLastData.MsgType msgType;
        MsgReadAsLastData.MsgType msgType2;
        Integer num = this.D0;
        if (msgFromUser.i) {
            if (msgFromUser.Ea()) {
                msgType = MsgReadAsLastData.MsgType.CLIP;
            } else if (msgFromUser.A4(false)) {
                msgType = MsgReadAsLastData.MsgType.WALL_POST;
            } else if (msgFromUser.D3(AttachChannelMessage.class, false)) {
                msgType = MsgReadAsLastData.MsgType.CHANNEL_POST;
            }
            msgType2 = msgType;
            if (msgType2 == null) {
                Integer valueOf = msgFromUser2 != null ? Integer.valueOf(msgFromUser2.d) : null;
                int i2 = msgFromUser.d;
                if (!z && num != null) {
                    int intValue = num.intValue();
                    if (valueOf != null) {
                        i2 = valueOf.intValue();
                    }
                    if (intValue >= i2) {
                        return;
                    }
                }
                this.D0 = Integer.valueOf(Math.max(msgFromUser2 != null ? msgFromUser2.d : msgFromUser.d, num != null ? num.intValue() : 0));
                zdw zdwVar = this.A;
                a1w a1wVar = this.l;
                if (!z && msgFromUser.T == null) {
                    if ((msgFromUser2 != null ? msgFromUser2.T : null) == null) {
                        long longValue = dialog.Sb().longValue();
                        int i3 = msgFromUser.d;
                        Integer valueOf2 = msgFromUser2 != null ? Integer.valueOf(msgFromUser2.d) : null;
                        cew cewVar = zdwVar.u;
                        cew cewVar2 = zdwVar.u;
                        cewVar.getClass();
                        MsgReadAsLastData f2 = cew.f(longValue);
                        if (f2 != null) {
                            int i4 = f2.b;
                            int i5 = f2.a;
                            if (i3 == i5) {
                                int i6 = i4 + 1;
                                Integer num2 = f2.d;
                                cewVar2.getClass();
                                MsgReadAsLastData g2 = cew.g(cew.h(), longValue);
                                cew.k(cew.h(), longValue, new MsgReadAsLastData(i5, i6, g2 != null ? g2.f() : false, num2, msgType2));
                                if (i4 < 2) {
                                    a1wVar.x(new ua80(this.n));
                                    return;
                                }
                                return;
                            }
                        }
                        MsgReadAsLastData msgReadAsLastData = new MsgReadAsLastData(i3, 1, false, valueOf2, msgType2);
                        cewVar2.getClass();
                        cew.k(cew.h(), longValue, msgReadAsLastData);
                        a1wVar.x(new ua80(this.n));
                        return;
                    }
                }
                cew cewVar3 = zdwVar.u;
                long j = this.n;
                int i7 = msgFromUser.d;
                Integer valueOf3 = msgFromUser2 != null ? Integer.valueOf(msgFromUser2.d) : null;
                cewVar3.getClass();
                MsgReadAsLastData g3 = cew.g(cew.h(), j);
                cew.k(cew.h(), j, new MsgReadAsLastData(i7, 2, g3 != null ? g3.f() : false, valueOf3, msgType2));
                a1wVar.x(new ua80(this.n));
                return;
            }
            return;
        }
        msgType2 = null;
        if (msgType2 == null) {
        }
    }

    public final boolean y1(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!D1((Msg) arrayList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.wjs.a
    public final void z(qtd0 qtd0Var) {
        if ((qtd0Var instanceof User) && ((User) qtd0Var).R == SocialButtonType.FOLLOW) {
            vm30 vm30Var = this.o;
            if (vm30Var != null) {
                com.vk.im.popup.b bVar = vm30Var.e0;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                bVar.b(new dhd0(com.vk.toggle.b.A.a(imFeatures)), new p5y(vm30Var, 10));
                return;
            }
            return;
        }
        vm30 vm30Var2 = this.o;
        if (vm30Var2 != null) {
            com.vk.im.popup.b bVar2 = vm30Var2.e0;
            ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures2.getClass();
            bVar2.b(new lis(com.vk.toggle.b.A.a(imFeatures2)), new b010(vm30Var2, 4));
        }
    }

    public final boolean z1(Collection<? extends Msg> collection) {
        Dialog f2 = this.O0.f();
        List<Peer.Type> list = com.vk.im.engine.utils.a.b;
        return com.vk.im.engine.utils.a.e(this.l.r(), f2, collection);
    }
}
