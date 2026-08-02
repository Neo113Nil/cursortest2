package com.vk.channels.impl.channel_screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stories.model.clickable.ClickableChannelPost;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.ui.components.msg_list.MsgListOpenAtLatestMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.log.L;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.observable.i;
import com.vk.movika.sdk.base.observable.k;
import com.vk.movika.sdk.base.ui.t;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.internal.operators.completable.p;
import io.reactivex.rxjava3.internal.operators.completable.y;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.j2;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.a1w;
import xsna.a3b;
import xsna.a8;
import xsna.ac;
import xsna.asu0;
import xsna.axs0;
import xsna.b3;
import xsna.b9w;
import xsna.bb;
import xsna.bbw;
import xsna.bd70;
import xsna.bg20;
import xsna.bn3;
import xsna.bpn0;
import xsna.bu00;
import xsna.bwt0;
import xsna.bzw;
import xsna.c2u;
import xsna.ca;
import xsna.cg20;
import xsna.cn70;
import xsna.cra;
import xsna.da;
import xsna.dhr0;
import xsna.dza;
import xsna.e10;
import xsna.e2l0;
import xsna.ea;
import xsna.eg20;
import xsna.epx;
import xsna.es00;
import xsna.ets0;
import xsna.eu0;
import xsna.eza;
import xsna.f1b;
import xsna.f2s;
import xsna.f5;
import xsna.fbw;
import xsna.fnv0;
import xsna.fts0;
import xsna.g2v;
import xsna.g7;
import xsna.g8;
import xsna.gc4;
import xsna.gza;
import xsna.gzs;
import xsna.h20;
import xsna.h6;
import xsna.h60;
import xsna.h8;
import xsna.ham;
import xsna.hb;
import xsna.hg;
import xsna.hg1;
import xsna.i2n0;
import xsna.i71;
import xsna.i7o0;
import xsna.i8;
import xsna.ies;
import xsna.ikv0;
import xsna.iou;
import xsna.itg0;
import xsna.iza;
import xsna.izs;
import xsna.j37;
import xsna.jbb;
import xsna.jd;
import xsna.ji3;
import xsna.jr3;
import xsna.jrb;
import xsna.js4;
import xsna.jt;
import xsna.k0j;
import xsna.k2n0;
import xsna.ka0;
import xsna.kb;
import xsna.kd;
import xsna.kju0;
import xsna.kkm;
import xsna.krb;
import xsna.kwg0;
import xsna.l4;
import xsna.la0;
import xsna.la2;
import xsna.ld;
import xsna.lju0;
import xsna.lua;
import xsna.lxa;
import xsna.m1;
import xsna.m8b;
import xsna.mdz;
import xsna.msy;
import xsna.mxa;
import xsna.mzp0;
import xsna.n20;
import xsna.na;
import xsna.nf1;
import xsna.nie;
import xsna.no;
import xsna.nu2;
import xsna.oa;
import xsna.of20;
import xsna.oo;
import xsna.oz50;
import xsna.p870;
import xsna.pa;
import xsna.pbw;
import xsna.pf1;
import xsna.ps2;
import xsna.pt;
import xsna.pv2;
import xsna.px0;
import xsna.q0w0;
import xsna.q1f0;
import xsna.q4b;
import xsna.q9;
import xsna.qf20;
import xsna.qi3;
import xsna.r1f0;
import xsna.r6;
import xsna.ra;
import xsna.ra0;
import xsna.rj1;
import xsna.rzp0;
import xsna.s1;
import xsna.s3q0;
import xsna.sf1;
import xsna.sf20;
import xsna.sf20.a;
import xsna.sg3;
import xsna.sh6;
import xsna.sv0;
import xsna.sx0;
import xsna.t6;
import xsna.tf20;
import xsna.tkb;
import xsna.trb;
import xsna.u0f0;
import xsna.u40;
import xsna.ucb;
import xsna.ud8;
import xsna.uds;
import xsna.v40;
import xsna.v6;
import xsna.vbb;
import xsna.vds;
import xsna.vf20;
import xsna.vg30;
import xsna.vm30;
import xsna.vtt0;
import xsna.w40;
import xsna.w8b;
import xsna.we0;
import xsna.wm1;
import xsna.x2b;
import xsna.x2y;
import xsna.x7q0;
import xsna.xa9;
import xsna.xm1;
import xsna.y6;
import xsna.ybb;
import xsna.yp1;
import xsna.z7;
import xsna.z9x0;
import xsna.zbb;
import xsna.zcb;
import xsna.zdw;
import xsna.zeb;
import xsna.zg;
import xsna.zjm0;

/* compiled from: ChannelFragment.kt */
/* loaded from: classes16.dex */
public abstract class ChannelFragment extends MultiComponentFragment implements ies, uds, vbb, fts0, vds {
    public static final /* synthetic */ int a1 = 0;
    public final Object A0;
    public final Object B0;
    public final q0w0 C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final f1b G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final Object M0;
    public final Object N0;
    public mxa O0;
    public PopupStickerView P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final z9x0 T0;
    public final zdw U;
    public final Object U0;
    public final a1w V;
    public final dhr0 V0;
    public final Object W;
    public final Object W0;
    public final Object X;
    public final Object X0;
    public final Object Y;
    public final dza Y0;
    public final Object Z;
    public final eza Z0;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final bpn0 d0;
    public View e0;
    public ViewGroup f0;
    public final Object g0;
    public final Object h0;
    public final OpenMessagesHistoryReporter i0;
    public final mdz<OpenMessagesHistoryReporter.Span> j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final io.reactivex.rxjava3.disposables.b p0;
    public final bpn0 q0;
    public final bpn0 r0;
    public final bpn0 s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public final bpn0 w0;
    public final gc4 x0;
    public final Object y0;
    public final Object z0;

    /* compiled from: ChannelFragment.kt */
    public static final class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(AppChannelFragment.class, null, null);
            g2v.c().getClass();
            if (z) {
                u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
            }
        }

        public final void A(int i) {
            this.j.putInt("post_id", i);
        }

        public final void B(ChannelHistoryOpenMode channelHistoryOpenMode) {
            this.j.putParcelable("channel_history_open_mode", channelHistoryOpenMode);
        }

        public final void C() {
            this.j.putBoolean("postponed_posts", true);
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            this.j.putString("performance_track_id", UUID.randomUUID().toString());
            return super.n(context);
        }

        public final void y(long j) {
            if (j == 0) {
                throw new IllegalArgumentException("Channel id is invalid = 0");
            }
            this.j.putLong("channel_id", j);
        }

        public final void z(ChannelEntryPoint channelEntryPoint) {
            if (channelEntryPoint != null) {
                this.j.putParcelable("entry_point", channelEntryPoint);
            }
        }
    }

    /* compiled from: ChannelFragment.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: ChannelFragment.kt */
    public final class c {
        public c() {
        }

        public final void a() {
            int i = ChannelFragment.a1;
            ChannelFragment.this.requireContext();
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ChannelFragment channelFragment = (ChannelFragment) this.receiver;
            vm30 vm30Var = channelFragment.ro().o;
            if (vm30Var != null) {
                vm30.x(vm30Var, null, "showFullScreenLoader", 8);
            }
            sf20 ro = channelFragment.ro();
            MsgListOpenMode so = channelFragment.so();
            bg20 bg20Var = ro.a.n;
            bg20Var.a.c((mdz) bg20Var.f.getValue());
            bg20Var.a.c((mdz) bg20Var.g.getValue());
            ro.k.d(so);
            return s3q0.a;
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ChannelFragment channelFragment = (ChannelFragment) this.receiver;
            int i = ChannelFragment.a1;
            channelFragment.getClass();
            if (g2v.c().b().V(channelFragment.kn(), "unknown")) {
                g2v.c().b().U(channelFragment.kn(), FolderType.CHANNELS);
            }
            channelFragment.finish();
            return s3q0.a;
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ChannelFragment) this.receiver).yo();
            return s3q0.a;
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<RestrictionBadge, s3q0> {
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(RestrictionBadge restrictionBadge) {
            ChannelFragment channelFragment = (ChannelFragment) this.receiver;
            ((i71) channelFragment.S0.getValue()).a(restrictionBadge, channelFragment.kn().getSupportFragmentManager());
            return s3q0.a;
        }
    }

    /* compiled from: ChannelFragment.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<Collection<? extends MsgFromChannel>, io.reactivex.rxjava3.core.a> {
        @Override // xsna.izs
        public final io.reactivex.rxjava3.core.a invoke(Collection<? extends MsgFromChannel> collection) {
            a3b a3bVar = (a3b) this.receiver;
            return new p(a3bVar.d.b(a3bVar, new x7q0(a3bVar.a, collection, a3bVar.b)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.dza] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsna.eza] */
    public ChannelFragment() {
        super(R.layout.im_channel_fragment_old);
        zdw zdwVar = i7o0.b;
        zdwVar = zdwVar == null ? null : zdwVar;
        this.U = zdwVar;
        a1w a1wVar = zdwVar.b;
        this.V = a1wVar;
        ca caVar = new ca(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, caVar);
        this.X = msy.a(lazyThreadSafetyMode, new kd(this, 16));
        this.Y = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(this, 12));
        this.Z = msy.a(lazyThreadSafetyMode, new b3(this, 13));
        this.a0 = msy.a(lazyThreadSafetyMode, new ra(this, 16));
        this.b0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 10));
        int i = 11;
        this.c0 = msy.a(lazyThreadSafetyMode, new hg(this, i));
        this.d0 = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.f(this, i));
        this.g0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 12));
        this.h0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 14));
        OpenMessagesHistoryReporter f2 = uo().n().f(UUID.randomUUID().toString());
        this.i0 = f2;
        mdz<OpenMessagesHistoryReporter.Span> mdzVar = new mdz<>(0L, OpenMessagesHistoryReporter.Span.ROOT, null);
        f2.c(mdzVar);
        this.j0 = mdzVar;
        this.k0 = msy.a(lazyThreadSafetyMode, new wm1(this, 12));
        this.l0 = msy.a(lazyThreadSafetyMode, new h20(this, 7));
        this.m0 = msy.a(lazyThreadSafetyMode, new bb(this, 12));
        this.n0 = msy.a(lazyThreadSafetyMode, new zg(this, 14));
        this.o0 = msy.a(lazyThreadSafetyMode, new defpackage.e(this, 15));
        this.p0 = new io.reactivex.rxjava3.disposables.b();
        this.q0 = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, 13));
        this.r0 = new bpn0(new ac(this, 13));
        this.s0 = new bpn0(new f5(this, 13));
        this.t0 = msy.a(lazyThreadSafetyMode, new m1(this, 13));
        this.u0 = msy.a(lazyThreadSafetyMode, new jd(this, 17));
        this.v0 = msy.a(lazyThreadSafetyMode, new ld(this, 16));
        this.w0 = new bpn0(new h6(this, 13));
        this.x0 = new gc4();
        this.y0 = msy.a(lazyThreadSafetyMode, new we0(this, 13));
        this.z0 = msy.a(lazyThreadSafetyMode, new s1(this, 14));
        this.A0 = msy.a(lazyThreadSafetyMode, new u40(this, 10));
        this.B0 = msy.a(lazyThreadSafetyMode, new v40(this, 11));
        this.C0 = zdwVar.f().b;
        this.D0 = msy.a(lazyThreadSafetyMode, new w40(this, 16));
        this.E0 = msy.a(lazyThreadSafetyMode, new px0(this, 12));
        this.F0 = msy.a(lazyThreadSafetyMode, new t(this, 16));
        this.G0 = ((kju0) oo()).d();
        this.H0 = msy.a(lazyThreadSafetyMode, new sx0(this, 11));
        this.I0 = msy.a(lazyThreadSafetyMode, new v6(this, 9));
        this.J0 = msy.a(lazyThreadSafetyMode, new y6(this, 11));
        this.K0 = msy.a(lazyThreadSafetyMode, new rj1(this, 12));
        this.L0 = msy.a(lazyThreadSafetyMode, new no(this, 11));
        this.M0 = msy.a(lazyThreadSafetyMode, new oo(this, 12));
        this.N0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.h(this, 14));
        this.Q0 = msy.a(lazyThreadSafetyMode, new j(this, 17));
        this.R0 = msy.a(lazyThreadSafetyMode, new xm1(this, 12));
        this.S0 = msy.a(lazyThreadSafetyMode, new ka0(this, 15));
        this.T0 = new z9x0(uo().v(), MessagesType.CHANNEL, a1wVar, uo().n().c(UUID.randomUUID().toString()));
        this.U0 = msy.a(lazyThreadSafetyMode, new la0(4));
        this.V0 = zdwVar.f;
        this.W0 = msy.a(lazyThreadSafetyMode, new na(this, 14));
        this.X0 = msy.a(lazyThreadSafetyMode, new ra0(this, 16));
        this.Y0 = new bd70() { // from class: xsna.dza
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                zjm0 zjm0Var = (zjm0) obj;
                int i4 = ChannelFragment.a1;
                ChannelFragment channelFragment = ChannelFragment.this;
                if (channelFragment.Ao(zjm0Var)) {
                    i0q0.j(new y(2, channelFragment, zjm0Var.g));
                }
            }
        };
        this.Z0 = new bd70() { // from class: xsna.eza
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                int i4 = ChannelFragment.a1;
                ChannelFragment channelFragment = ChannelFragment.this;
                if (channelFragment.Ao((zjm0) obj)) {
                    i0q0.j(new q86(channelFragment, 2));
                }
            }
        };
    }

    public final boolean Ao(zjm0 zjm0Var) {
        Object obj;
        UserId userId;
        if (zjm0Var == null) {
            return false;
        }
        ClickableStickers clickableStickers = zjm0Var.k.j;
        List<ClickableSticker> list = clickableStickers != null ? clickableStickers.d : null;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ClickableSticker) obj) instanceof ClickableChannelPost) {
                break;
            }
        }
        ClickableSticker clickableSticker = (ClickableSticker) obj;
        if (clickableSticker == null) {
            return false;
        }
        ClickableChannelPost clickableChannelPost = clickableSticker instanceof ClickableChannelPost ? (ClickableChannelPost) clickableSticker : null;
        return (clickableChannelPost == null || (userId = clickableChannelPost.f) == null || userId.b != mo()) ? false : true;
    }

    @Override // xsna.fts0
    public final void H0() {
        ets0 xo = xo();
        if (xo != null) {
            xo.c();
        }
    }

    @Override // xsna.fts0
    public final void Kb(boolean z) {
        ets0 xo = xo();
        if (xo != null) {
            ViewGroup viewGroup = this.f0;
            if (viewGroup == null) {
                viewGroup = null;
            }
            xo.b(viewGroup, R.id.channel_footer_container, mo(), z);
        }
    }

    @Override // xsna.vbb
    public final void P2() {
        View view = this.e0;
        if (view != null) {
            bwt0.c0(-2, view);
        }
    }

    @Override // xsna.vbb
    public final void P4() {
        View view = this.e0;
        if (view != null) {
            bwt0.c0(-1, view);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        requireContext();
        return -1;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Sn() {
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.IM_CHANNEL, null, false, 62).j();
        mzp0Var.init();
        this.i0.d(mzp0Var);
        this.J = mzp0Var;
    }

    @Override // xsna.fts0
    public final void U1() {
        ets0 xo = xo();
        if (xo != null) {
            xo.e();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        xo();
        requireContext();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ets0 xo = xo();
        if (xo == null || !xo.a0()) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ho(new ybb.b(new com.vk.movika.sdk.base.observable.a(ref$BooleanRef, 18)));
            if (!ref$BooleanRef.element) {
                if (!g2v.c().b().V(kn(), "unknown")) {
                    return false;
                }
                g2v.c().b().U(kn(), FolderType.CHANNELS);
                finish();
                return true;
            }
        }
        return true;
    }

    @Override // xsna.fts0
    public final void b0() {
        ets0 xo = xo();
        if (xo != null) {
            xo.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MultiComponentFragment, com.vk.im.mvicomponent.MviComponentFragment
    public final ViewGroup go(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        requireContext();
        this.f0 = (ViewGroup) layoutInflater.inflate(R.layout.im_channel_fragment_old, viewGroup, false);
        jrb po = po();
        ViewGroup viewGroup2 = this.f0;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        po.getClass();
        krb krbVar = po.a;
        trb trbVar = new trb(krbVar, viewGroup2);
        ViewStub viewStub = (ViewStub) trbVar.d.getValue();
        if (!krbVar.d) {
            bpn0 bpn0Var = trbVar.c;
            krbVar.D0(((ViewGroup) bpn0Var.getValue()).getContext(), (ViewGroup) bpn0Var.getValue(), viewStub, null);
            krbVar.V0();
        }
        vtt0.g((vtt0) trbVar.e.getValue(), false);
        po.b = trbVar;
        if (!isPostponed()) {
            m8b m8bVar = to();
            ViewGroup viewGroup3 = this.f0;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            io.reactivex.rxjava3.disposables.b bVar = m8bVar.p;
            m8bVar.z = viewGroup3;
            if (m8bVar.j.u()) {
                int i = 0;
                bVar.b(new r(new o(m8bVar.k.b(m8bVar, new axs0()).q(asu0.a.c()), new da(new r6(m8bVar, 14), 7)).h(new ea(new t6(m8bVar, 15), 12)).o(EmptyList.b), new e10(new com.vk.movika.sdk.base.hooks.p(m8bVar, 25), 10)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new nf1(new yp1(1, m8bVar, m8b.class, "handleUpdate", "handleUpdate(Ljava/util/List;)V", i, 2), 10), new sh6(new sg3(1, m8bVar, m8b.class, "handleError", "handleError(Ljava/lang/Throwable;)V", i, 1), 4)));
            }
            int i2 = 0;
            int i3 = 3;
            bVar.b(new i0(new i0(m8bVar.l.a(), new hg1.q()).U(new hg1.p()), new g7(new com.vk.movika.sdk.base.logic.interactor.p(m8bVar, 18), 9)).U(new pa(new oa(8), 8)).a0(asu0.a.d()).subscribe(new pf1(new qi3(1, m8bVar, m8b.class, "handleUpdate", "handleUpdate(Ljava/util/List;)V", i2, i3), 3), new ji3(new ud8(1, m8bVar, m8b.class, "handleError", "handleError(Ljava/lang/Throwable;)V", i2, i3), 9)));
        }
        ViewGroup viewGroup4 = this.f0;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        ViewGroup viewGroup5 = (ViewGroup) viewGroup4.findViewById(R.id.messages_list_container);
        sf20 ro = ro();
        tf20 tf20Var = ro.a;
        cg20 cg20Var = tf20Var.a;
        FragmentActivity fragmentActivity = cg20Var.a;
        LayoutInflater layoutInflater2 = cg20Var.b;
        RecyclerView.u uVar = cg20Var.e;
        zdw zdwVar = cg20Var.c;
        fbw fbwVar = tf20Var.j;
        r1f0 r1f0Var = tf20Var.k;
        u0f0 u0f0Var = tf20Var.l;
        vg30.a.C3889a c3889a = tf20Var.m;
        b9w b9wVar = (b9w) tf20Var.b.a;
        q9 q9Var = tf20Var.i;
        kkm kkmVar = cg20Var.d;
        sf20.b bVar2 = new sf20.b(ro.r);
        bg20 bg20Var = tf20Var.n;
        i2n0 i2n0Var = tf20Var.o;
        k2n0 k2n0Var = tf20Var.p;
        qf20 qf20Var = tf20Var.f;
        vm30 vm30Var = new vm30(fragmentActivity, layoutInflater2, viewGroup5, uVar, true, false, zdwVar, b9wVar, q9Var, kkmVar, fbwVar, r1f0Var, u0f0Var, c3889a, bVar2, bg20Var, i2n0Var, k2n0Var, new cra(qf20Var.a, ro), new nie(qf20Var.b, ro), null, false, ro.h, false, false, ro.b, tf20Var.r, 28311552);
        vm30Var.t0 = ro.new a();
        cg20Var.getClass();
        vm30Var.z(true);
        vm30Var.y(cn70.b(4));
        vm30.x(vm30Var, null, "showFullScreenLoader", 8);
        ro.o = vm30Var;
        viewGroup5.addView(vm30Var.t);
        ham hamVar = (ham) this.X0.getValue();
        ViewGroup viewGroup6 = this.f0;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        hamVar.d(viewGroup6);
        ViewGroup viewGroup7 = this.f0;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.e0 = viewGroup7.findViewById(R.id.channel_footer_container);
        ViewGroup viewGroup8 = this.f0;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.O0 = new mxa(viewGroup8);
        requireContext();
        ViewGroup viewGroup9 = this.f0;
        if (viewGroup9 == null) {
            return null;
        }
        return viewGroup9;
    }

    @Override // xsna.fts0
    public final void he(zbb.a aVar) {
        ets0 xo = xo();
        if (xo != null) {
            xo.d(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final void io() {
        this.i0.c((mdz) this.o0.getValue());
    }

    public abstract boolean isPostponed();

    public final lxa lo() {
        return (lxa) this.r0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final long mo() {
        return ((Number) this.v0.getValue()).longValue();
    }

    public final w8b no() {
        return (w8b) this.q0.getValue();
    }

    @Override // xsna.woo0
    public final int o7() {
        return dhr0.t.c(R.attr.vk_ui_background_content);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        q1f0 q1f0Var;
        super.onConfigurationChanged(configuration);
        po().a.getClass();
        vm30 vm30Var = ro().o;
        if (vm30Var != null) {
            vm30Var.r();
        }
        x2b.a aVar = ((x2b) this.J0.getValue()).q;
        if (aVar == null || (q1f0Var = aVar.a) == null) {
            return;
        }
        q1f0Var.i();
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        OpenMessagesHistoryReporter openMessagesHistoryReporter = this.i0;
        bu00.m(openMessagesHistoryReporter, bundle);
        mdz<OpenMessagesHistoryReporter.Span> a2 = this.j0.a(OpenMessagesHistoryReporter.Span.ON_CREATE);
        openMessagesHistoryReporter.c(a2);
        super.onCreate(bundle);
        sf20 ro = ro();
        MsgListOpenMode so = so();
        bg20 bg20Var = ro.a.n;
        bg20Var.a.c((mdz) bg20Var.f.getValue());
        bg20Var.a.c((mdz) bg20Var.g.getValue());
        ro.k.d(so);
        this.p0.b(((com.vk.im.ui.fragments.chat.c) this.z0.getValue()).b().a0(asu0.a.c()).subscribe(new pv2(new hb(this, 19), 5)));
        String string = requireArguments().getString("performance_track_id");
        if (string != null) {
            openMessagesHistoryReporter.m(string);
            s3q0 s3q0Var = s3q0.a;
        }
        openMessagesHistoryReporter.f(a2, null);
        p870 p870Var = (p870) this.Z.getValue();
        p870Var.b(102, this.Y0);
        p870Var.b(104, this.Z0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        po().a.G0();
        if (!isPostponed()) {
            to().G0();
        }
        sf20 ro = ro();
        eg20 eg20Var = ro.k;
        eg20Var.j.dispose();
        vf20 vf20Var = eg20Var.a;
        vf20Var.l.dispose();
        vf20Var.j.f();
        vf20Var.k.f();
        vf20Var.a.onDestroy();
        eg20Var.i.f();
        lua luaVar = ro.m;
        js4 js4Var = luaVar.a;
        js4Var.d(luaVar.d);
        js4Var.release();
        ro.d.a.clear();
        ro.e.a.clear();
        ro.h.d();
        ro.f.c.clear();
        ro.g.f();
        ro.j.a.clear();
        this.p0.e();
        lo().destroy();
        ((zcb) this.s0.getValue()).dispose();
        ((ImSyncStateStatReporter) this.A0.getValue()).shutdown();
        p870 p870Var = (p870) this.Z.getValue();
        p870Var.g(this.Y0);
        p870Var.g(this.Z0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        jrb po = po();
        trb trbVar = po.b;
        if (trbVar != null) {
            trbVar.a.H0();
        }
        po.b = null;
        if (!isPostponed()) {
            to().H0();
        }
        sf20 ro = ro();
        vm30 vm30Var = ro.o;
        if (vm30Var != null) {
            vm30Var.b();
        }
        ro.o = null;
        ro.p.e();
        ((com.vk.im.popup.a) this.t0.getValue()).dismiss();
        gza gzaVar = (gza) this.K0.getValue();
        ImageViewer.c<?> cVar = gzaVar.f;
        if (cVar != null) {
            cVar.a(false);
        }
        gzaVar.f = null;
        ucb vo = vo();
        ikv0 ikv0Var = vo.b;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        vo.b = null;
        ((ham) this.X0.getValue()).e();
        this.O0 = null;
        PopupStickerView popupStickerView = this.P0;
        if (popupStickerView != null) {
            popupStickerView.e();
        }
        this.P0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        tkb tkbVar = ((kju0) oo()).n;
        mo();
        tkbVar.a = 0L;
        super.onPause();
        trb trbVar = po().b;
        if (trbVar != null) {
            trbVar.a.W0();
        }
        if (!isPostponed()) {
            to().W0();
        }
        ro().e();
        q4b q4bVar = (q4b) this.R0.getValue();
        if (q4bVar != null) {
            io.reactivex.rxjava3.disposables.c cVar = q4bVar.c;
            if (cVar != null) {
                cVar.dispose();
            }
            q4bVar.c = null;
            q4bVar.b = null;
        }
        this.i0.b();
        ho(ybb.i.b);
        ets0 xo = xo();
        if (xo != null) {
            xo.onPause();
        }
        requireContext();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!isHidden()) {
            ((kju0) oo()).n.a = mo();
        }
        trb trbVar = po().b;
        if (trbVar != null) {
            trbVar.a.V0();
        }
        if (!isPostponed()) {
            to().V0();
        }
        ro().d();
        sf20 ro = ro();
        g2v.c().getClass();
        boolean i = fnv0.a.i();
        e2l0 e2l0Var = ro.j;
        e2l0Var.getClass();
        e2l0Var.d(i ? StickerAnimationState.PLAY : StickerAnimationState.DISABLE);
        lju0 lju0Var = ((kju0) oo()).o;
        final long mo = mo();
        final jbb jbbVar = lju0Var.a.b;
        jbbVar.getClass();
        m mVar = new m(new Callable() { // from class: xsna.hbb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                jbb jbbVar2 = jbb.this;
                jp9 jp9Var = jbbVar2.a;
                UserId c2 = jbbVar2.b.c();
                if (!fkq0.c(c2)) {
                    c2 = null;
                }
                jp9Var.a(mo, c2 != null ? Long.valueOf(c2.b) : null);
                return s3q0.a;
            }
        });
        asu0.a.getClass();
        y q = mVar.q(asu0.t());
        int i2 = kwg0.a;
        int i3 = 7;
        jbbVar.c.b(io.reactivex.rxjava3.kotlin.c.d(q, new sv0(i3), new nu2("ChannelRemoveMessagesNotificationsHandler", 2)));
        Bundle requireArguments = requireArguments();
        int i4 = requireArguments.getInt("post_id");
        if (i4 > 0) {
            ((iza) this.L0.getValue()).j(i4, mo());
            requireArguments.remove("post_id");
        }
        q4b q4bVar = (q4b) this.R0.getValue();
        if (q4bVar != null) {
            io.reactivex.rxjava3.subjects.f<List<Integer>> fVar = new io.reactivex.rxjava3.subjects.f<>();
            int i5 = 11;
            q4bVar.c = new l0(new i0(q.X(fVar.t0(1L).U(new l4(new la2(8), 10)), new j2(fVar).d(15L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.a.a(), Integer.MAX_VALUE, ArrayListSupplier.INSTANCE)).U(new h8(new g8(6), i3)), new kb(new i8(i5), i5)), new ps2(new j37(1, q4bVar.a, of20.class, "updateMessagesCounters", "updateMessagesCounters(Ljava/util/Collection;)Lio/reactivex/rxjava3/core/Completable;", 0, 1), i3)).subscribe();
            q4bVar.b = fVar;
        }
        ho(ybb.m.b);
        requireContext();
        this.i0.n(OpenMessagesHistoryReporter.MeasuringPoint.RESUMED);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bu00.o(bundle);
        ho(new ybb.n(bundle));
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        sf20 ro = ro();
        eg20 eg20Var = ro.k;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = eg20Var.q;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c f2 = io.reactivex.rxjava3.kotlin.c.f(3, yVar.a0(asu0Var.d()), null, null, new k0j(ro, 28));
        io.reactivex.rxjava3.disposables.b bVar = ro.p;
        bVar.b(f2);
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, eg20Var.s.a0(asu0Var.d()), null, null, new bzw(ro, 7)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, eg20Var.n.a0(asu0Var.d()), null, null, new c2u(ro, 12)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, eg20Var.h.a0(asu0Var.d()), null, null, new iou(ro, 13)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, eg20Var.k.a0(asu0Var.d()), null, null, new f2s(ro, 22)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, ro.m.c.a0(asu0Var.d()), null, null, new bbw(ro, 7)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, ro.t.c.a0(asu0Var.d()), null, null, new x2y(ro, 9)));
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, ((j1) ro.a.q.c.b).a0(asu0Var.d()), null, null, new es00(ro, 3)));
        sf20 ro2 = ro();
        boolean z = ((ham) this.X0.getValue()).d;
        vm30 vm30Var = ro2.o;
        if (vm30Var != null) {
            vm30Var.p(z);
        }
        io.reactivex.rxjava3.disposables.c subscribe = ((zcb) this.s0.getValue()).a().r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new bn3(new sf1(this, 18), 6), new com.vk.im.ui.components.dialogs_list.b(new jr3(4), 13));
        io.reactivex.rxjava3.disposables.b bVar2 = this.p0;
        bVar2.b(subscribe);
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = lo().e.r0(asu0Var.c()).a0(asu0Var.d());
        eu0 eu0Var = new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 15), 9);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        bVar2.b(itg0.m(a0.E(eu0Var, lVar, kVar, kVar)));
        int i = 9;
        bVar2.b(new i0(this.V.l.a(), new z7(new pt(15), 11)).a0(asu0Var.d()).subscribe(new h60(new a8(this, 16), i), new n20(new jt(i), 13)));
        this.i0.f((mdz) this.o0.getValue(), null);
        ho(new ybb.l(bundle));
        ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            bVar2.b(io.reactivex.rxjava3.kotlin.c.f(2, new j2(new io.reactivex.rxjava3.internal.operators.observable.y(lo().e.r0(asu0Var.c()).a0(asu0Var.d()).U(new ps2(new i(7), 6)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a)), null, new xa9(L.a, 1), new k(this, 16)));
        }
    }

    public final zeb oo() {
        zeb c2 = this.U.c();
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("ChannelsFeatureDependencies is not provided in imUiModule");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final jrb po() {
        return (jrb) this.B0.getValue();
    }

    public abstract AppChannelFragment.a qo();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final sf20 ro() {
        return (sf20) this.N0.getValue();
    }

    public final MsgListOpenMode so() {
        Serializer.StreamParcelableAdapter streamParcelableAdapter = (ChannelHistoryOpenMode) requireArguments().getParcelable("channel_history_open_mode");
        if (streamParcelableAdapter == null) {
            streamParcelableAdapter = ChannelHistoryOpenMode.OpenAtUnread.b;
        }
        if (streamParcelableAdapter instanceof ChannelHistoryOpenMode.OpenAtLatest) {
            return MsgListOpenAtLatestMode.b;
        }
        if (streamParcelableAdapter instanceof ChannelHistoryOpenMode.OpenAtUnread) {
            return MsgListOpenAtUnreadMode.b;
        }
        if (streamParcelableAdapter instanceof ChannelHistoryOpenMode.OpenAtMsgByLocalId) {
            return new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, ((ChannelHistoryOpenMode.OpenAtMsgByLocalId) streamParcelableAdapter).b);
        }
        if (streamParcelableAdapter instanceof ChannelHistoryOpenMode.OpenAtMsgByCnvId) {
            return new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, ((ChannelHistoryOpenMode.OpenAtMsgByCnvId) streamParcelableAdapter).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final m8b to() {
        return (m8b) this.E0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final pbw uo() {
        return (pbw) this.g0.getValue();
    }

    public final ucb vo() {
        return (ucb) this.d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final kkm wo() {
        return ((com.vk.im.ui.fragments.chat.c) this.z0.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ets0 xo() {
        return (ets0) this.h0.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(epx.f((ChannelEntryPoint) this.w0.getValue(), ChannelEntryPoint.FeedRecommendations.b) ? SchemeStat$EventItem.Type.CHANNEL_FEED_RECOM : SchemeStat$EventItem.Type.CHANNEL, Long.valueOf(mo()), null, null, null, null, 60, null);
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNEL;
    }

    public abstract void yo();

    public final void zo(PopupStickerAnimation popupStickerAnimation) {
        ViewGroup viewGroup = this.f0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.messages_list_container);
        if (viewGroup2 == null) {
            return;
        }
        PopupStickerView popupStickerView = new PopupStickerView(requireContext(), null, 0, 14, 0);
        popupStickerView.c(popupStickerAnimation, false, null, new defpackage.k(this, 8));
        viewGroup2.addView(popupStickerView, new FrameLayout.LayoutParams(-1, -1));
        this.P0 = popupStickerView;
    }
}
