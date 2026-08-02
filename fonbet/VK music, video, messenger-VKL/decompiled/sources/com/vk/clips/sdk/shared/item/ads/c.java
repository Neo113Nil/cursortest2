package com.vk.clips.sdk.shared.item.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.sdk.facade.api.MyTargetFacadeClickTarget;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.mvi.MviLazyViewContainer;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a01;
import xsna.aaz;
import xsna.agj0;
import xsna.ah5;
import xsna.ao50;
import xsna.b01;
import xsna.bgj0;
import xsna.blk;
import xsna.c01;
import xsna.c11;
import xsna.cz0;
import xsna.d01;
import xsna.d7;
import xsna.dg;
import xsna.di5;
import xsna.e01;
import xsna.e0a;
import xsna.e4;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.ez0;
import xsna.f01;
import xsna.fot;
import xsna.fpf0;
import xsna.fw0;
import xsna.fxc0;
import xsna.fy0;
import xsna.g01;
import xsna.g5s0;
import xsna.gdg0;
import xsna.ggb0;
import xsna.gm50;
import xsna.gxp0;
import xsna.gy0;
import xsna.gzs;
import xsna.h01;
import xsna.h20;
import xsna.h4;
import xsna.hfm0;
import xsna.hme;
import xsna.hy0;
import xsna.hym0;
import xsna.hz0;
import xsna.i01;
import xsna.i3i0;
import xsna.i4;
import xsna.i5s0;
import xsna.iih0;
import xsna.iw0;
import xsna.izs;
import xsna.j01;
import xsna.j4b0;
import xsna.j5g;
import xsna.j5s0;
import xsna.jw0;
import xsna.jym0;
import xsna.jz0;
import xsna.k01;
import xsna.k15;
import xsna.kaf;
import xsna.kih0;
import xsna.km50;
import xsna.kxc;
import xsna.l01;
import xsna.lh5;
import xsna.lw0;
import xsna.ly0;
import xsna.lyc;
import xsna.m01;
import xsna.m5s0;
import xsna.m7;
import xsna.mh5;
import xsna.mk50;
import xsna.msy;
import xsna.n01;
import xsna.ny0;
import xsna.o01;
import xsna.o5s0;
import xsna.o7;
import xsna.ojh0;
import xsna.okh0;
import xsna.oy0;
import xsna.oz0;
import xsna.pb;
import xsna.pih0;
import xsna.pw0;
import xsna.pz0;
import xsna.q6q0;
import xsna.qu0;
import xsna.qz0;
import xsna.rfc;
import xsna.rl3;
import xsna.rlh0;
import xsna.rz0;
import xsna.s3q0;
import xsna.su;
import xsna.sz0;
import xsna.twb;
import xsna.tz0;
import xsna.ux0;
import xsna.uz0;
import xsna.v6;
import xsna.vf0;
import xsna.vk50;
import xsna.vx0;
import xsna.vz0;
import xsna.we7;
import xsna.wkh0;
import xsna.wp50;
import xsna.wx0;
import xsna.wz0;
import xsna.x7k0;
import xsna.xn50;
import xsna.xod;
import xsna.xp50;
import xsna.xw0;
import xsna.xx0;
import xsna.xz0;
import xsna.y6;
import xsna.ycg0;
import xsna.yg;
import xsna.yof;
import xsna.yux;
import xsna.yx0;
import xsna.yz0;
import xsna.zrx0;
import xsna.zw0;
import xsna.zx0;
import xsna.zy;
import xsna.zz0;

/* compiled from: AdsItemMviView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class c extends MviLazyViewContainer<b, c11, AdsItemAction> implements jw0 {
    public final Object A;
    public final ux0 B;
    public final oz0 C;
    public final vx0 D;
    public final Object E;
    public final i3i0 F;
    public final Object G;
    public final Object H;
    public final x7k0 I;
    public final Object J;
    public boolean K;
    public boolean L;
    public final Object M;
    public final hym0 N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final lw0 g;
    public final yof h;
    public final xod i;
    public final lyc j;
    public final gxp0 k;
    public final yux l;
    public final pih0 m;
    public final hme n;
    public final int o;
    public final boolean p;
    public final kaf q;
    public final gzs<Integer> r;
    public List<? extends View> s;
    public List<? extends View> t;
    public List<? extends View> u;
    public final Object v;
    public final Object w;
    public final Object x;
    public wp50 y;
    public final Object z;

    /* compiled from: AdsItemMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdsItemViewEvent.OnVideoFocusChanged.values().length];
            try {
                iArr[AdsItemViewEvent.OnVideoFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsItemViewEvent.OnVideoFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AdsItemViewEvent.OnItemViewFocusChanged.values().length];
            try {
                iArr2[AdsItemViewEvent.OnItemViewFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [xsna.vx0] */
    public c(Context context, lw0 lw0Var, yof yofVar, xod xodVar, kxc kxcVar, okh0 okh0Var, lyc lycVar, gxp0 gxp0Var, yux yuxVar, pih0 pih0Var, hme hmeVar, int i, pb pbVar, boolean z, gzs gzsVar) {
        super(context);
        this.g = lw0Var;
        this.h = yofVar;
        this.i = xodVar;
        this.j = lycVar;
        this.k = gxp0Var;
        this.l = yuxVar;
        this.m = pih0Var;
        this.n = hmeVar;
        this.o = i;
        this.p = z;
        this.q = kaf.a;
        this.r = gzsVar;
        EmptyList emptyList = EmptyList.b;
        this.s = emptyList;
        this.t = emptyList;
        this.u = emptyList;
        vf0 vf0Var = new vf0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = msy.a(lazyThreadSafetyMode, vf0Var);
        this.w = msy.a(lazyThreadSafetyMode, new yg(this, 2));
        int i2 = 1;
        this.x = msy.a(lazyThreadSafetyMode, new v6(this, i2));
        this.z = msy.a(lazyThreadSafetyMode, new y6(this, i2));
        this.A = msy.a(lazyThreadSafetyMode, new com.vk.catalog2.common.ui.holders.a(2, this, context));
        ux0 ux0Var = new ux0(this, 0);
        this.B = ux0Var;
        this.C = new oz0(ux0Var);
        this.D = new gxp0.a() { // from class: xsna.vx0
            @Override // xsna.gxp0.a
            public final void X2(ixp0 ixp0Var) {
                com.vk.clips.sdk.shared.item.ads.c.this.B.a(new AdsItemViewEvent.i(ixp0Var));
            }
        };
        this.E = msy.a(lazyThreadSafetyMode, new wx0(0, context, this));
        this.F = new i3i0(kxcVar, new xx0(0));
        this.G = msy.a(lazyThreadSafetyMode, new j(this, 3));
        o7 o7Var = new o7(this, 2);
        this.H = msy.a(lazyThreadSafetyMode, new e4(this, 1));
        this.I = new x7k0(pbVar, o7Var);
        this.J = msy.a(lazyThreadSafetyMode, new fy0(0, okh0Var, this));
        this.K = !z;
        this.M = msy.a(lazyThreadSafetyMode, new gy0(this, 0));
        this.N = new hym0(new jym0(lw0Var.b(), o7Var));
        int i3 = 1;
        this.O = msy.a(lazyThreadSafetyMode, new h4(i3, this, context));
        this.P = msy.a(lazyThreadSafetyMode, new i4(i3, this, context));
        this.Q = msy.a(lazyThreadSafetyMode, new zy(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final iih0 getAnalyticsCallbackWrapper() {
        return (iih0) this.x.getValue();
    }

    private final lh5 getAutoPlayInstanceAdapter() {
        this.g.getClass();
        return mh5.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final fot getGestureDetector() {
        return (fot) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aaz getLinkHelper() {
        return (aaz) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cz0 getOverlayRenderLayer() {
        return (cz0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final jz0 getRenderEventsHandler() {
        return (jz0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cz0 getRenderLayerDefault() {
        return (cz0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cz0 getRenderLayerRedesign() {
        return (cz0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final j5s0 getRenderer() {
        return (j5s0) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ycg0 getRestrictionDialogHelper() {
        return (ycg0) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final gdg0 getRestrictionViewEventConsumer() {
        return (gdg0) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final o5s0 getVideoBaseViewsContainer() {
        return (o5s0) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final com.vk.clips.sdk.shared.item.ads.events.a getViewEventVideoBaseImmediateHandler() {
        return (com.vk.clips.sdk.shared.item.ads.events.a) this.J.getValue();
    }

    public static jz0 k(c cVar) {
        return new jz0(cVar.getVideoBaseViewsContainer());
    }

    public static com.vk.clips.sdk.shared.item.ads.events.a l(okh0 okh0Var, c cVar) {
        return new com.vk.clips.sdk.shared.item.ads.events.a(okh0Var, new di5(cVar.getVideoTextureViewAdapter(), cVar.getAutoPlayInstanceAdapter()), cVar.F, new dg(cVar, 1), cVar.getRenderer(), cVar.g.i(), new ah5(cVar, cVar.getVideoBaseViewsContainer().d(), cVar.getLinkHelper(), new m7(cVar, 3)));
    }

    public static j5s0 m(c cVar) {
        return new j5s0(cVar.getVideoBaseViewsContainer(), cVar.F);
    }

    public static s3q0 n(c cVar, ez0 ez0Var) {
        cVar.getOverlayRenderLayer().getRenderer().getValue().c(ez0Var);
        return s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0257, code lost:
    
        if (r13.s() != 1) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s3q0 o(c cVar, xw0 xw0Var) {
        String string;
        lw0 lw0Var = cVar.g;
        hym0 hym0Var = cVar.N;
        izs izsVar = null;
        if (xw0Var instanceof xw0.l) {
            Context context = cVar.getContext();
            xw0.l lVar = (xw0.l) xw0Var;
            jym0 jym0Var = hym0Var.a;
            if (lVar instanceof xw0.l.a) {
                jym0Var.a.a(context, ((xw0.l.a) lVar).a, wkh0.b.C3939b.a, null, new hfm0(izsVar, 3));
            } else {
                if (!(lVar instanceof xw0.l.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                xw0.l.b bVar = (xw0.l.b) lVar;
                jym0Var.a.a(context, bVar.a, wkh0.b.a.a, bVar.b, new ggb0(jym0Var, 19));
            }
        } else if (xw0Var instanceof xw0.o) {
            Context context2 = cVar.getContext();
            xw0.o oVar = (xw0.o) xw0Var;
            if (!(oVar instanceof xw0.o.a)) {
                hym0Var.getClass();
                throw new NoWhenBranchMatchedException();
            }
            jym0 jym0Var2 = hym0Var.a;
            jym0Var2.a.d(context2, ((xw0.o.a) oVar).a, wkh0.b.C3939b.a, new twb(izsVar, 2));
        } else if (xw0Var instanceof xw0.f) {
            SdkClipVideoFile sdkClipVideoFile = ((xw0.f) xw0Var).a;
            ny0 ny0Var = cVar.getVideoUIEventListener().b;
            ny0.c cVar2 = ny0Var.b;
            if (cVar2 instanceof ny0.a) {
                ny0.a aVar = (ny0.a) cVar2;
                if (!epx.f(aVar.b.r1(), sdkClipVideoFile.r1())) {
                    we7.l(sdkClipVideoFile, 0L, null);
                    we7.k(sdkClipVideoFile, 0L);
                    we7.j(sdkClipVideoFile, 0L);
                }
                aVar.b = sdkClipVideoFile;
            } else if (cVar2 instanceof ny0.b) {
                ny0.b bVar2 = (ny0.b) cVar2;
                ux0 ux0Var = ny0Var.a;
                bVar2.getClass();
                ny0.a aVar2 = new ny0.a(ux0Var, sdkClipVideoFile);
                Long l = bVar2.a;
                if (l != null) {
                    aVar2.a(l.longValue());
                }
                ny0Var.b = aVar2;
            }
        } else if (xw0Var instanceof xw0.b) {
            cVar.k.f(false);
        } else if (xw0Var instanceof xw0.n) {
            xw0.n nVar = (xw0.n) xw0Var;
            kih0 kih0Var = nVar.a;
            wp50 wp50Var = nVar.b;
            if (kih0Var.isPlaying()) {
                kih0Var.c();
                if (wp50Var == null) {
                    kih0Var.i();
                }
                cVar.getFeature().j.b(fw0.b.a);
            } else {
                kih0Var.D();
                if (wp50Var == null) {
                    kih0Var.j();
                }
                VideoTextureViewAdapter.a.a(cVar.getVideoBaseViewsContainer().getVideoTextureViewAdapter(), kih0Var, "AdsItemMviView.togglePlay", null, null, null, 28);
                kih0Var.f();
                cVar.getFeature().j.b(fw0.c.a);
            }
        } else if (xw0Var instanceof xw0.i) {
            kih0 kih0Var2 = ((xw0.i) xw0Var).a;
            kih0Var2.I();
            kih0Var2.play();
        } else if (xw0Var instanceof xw0.j) {
            x7k0 x7k0Var = cVar.I;
            Context context3 = cVar.getContext();
            xw0.j jVar = (xw0.j) xw0Var;
            if (!(jVar instanceof xw0.j.a)) {
                x7k0Var.getClass();
                throw new NoWhenBranchMatchedException();
            }
            x7k0Var.a.a(context3, ((xw0.j.a) jVar).a);
        } else {
            int i = 1;
            if (xw0Var instanceof xw0.k) {
                xw0.k kVar = (xw0.k) xw0Var;
                if (!(kVar instanceof xw0.k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th = ((xw0.k.a) kVar).a;
                Context context4 = cVar.getContext();
                boolean z = th instanceof VKApiExecutionException;
                int i2 = R.string.network_error;
                if (z) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    Log.e("ThrowableUtils", "", vKApiExecutionException);
                    int s = vKApiExecutionException.s();
                    if (s != -2 && s != 14 && s != 17 && s != 24) {
                        if (vKApiExecutionException.s() <= 0 || !vKApiExecutionException.x()) {
                            switch (vKApiExecutionException.s()) {
                                case -3:
                                case 10:
                                    i2 = R.string.internal_server_error;
                                    break;
                                case -1:
                                    break;
                                case 15:
                                case 200:
                                case 201:
                                case 203:
                                case 211:
                                case PLACEMENT_SLEEP_VALUE:
                                    i2 = R.string.access_error;
                                    break;
                                case 103:
                                    i2 = R.string.rate_limit_error;
                                    break;
                                case 129:
                                    i2 = R.string.invalid_photo_format_error;
                                    break;
                                case 300:
                                    i2 = R.string.album_full_error;
                                    break;
                                case 800:
                                    i2 = R.string.video_already_added_error;
                                    break;
                                case 953:
                                    i2 = R.string.invalid_name_error;
                                    break;
                                case 5800:
                                    i2 = R.string.self_money_transfer_error;
                                    break;
                                default:
                                    i2 = R.string.error;
                                    break;
                            }
                            string = context4.getString(i2);
                        } else {
                            string = vKApiExecutionException.getMessage();
                            if (string == null) {
                                switch (vKApiExecutionException.s()) {
                                    case -3:
                                    case 10:
                                        i2 = R.string.internal_server_error;
                                        break;
                                    case -1:
                                        break;
                                    case 15:
                                    case 200:
                                    case 201:
                                    case 203:
                                    case 211:
                                    case PLACEMENT_SLEEP_VALUE:
                                        i2 = R.string.access_error;
                                        break;
                                    case 103:
                                        i2 = R.string.rate_limit_error;
                                        break;
                                    case 129:
                                        i2 = R.string.invalid_photo_format_error;
                                        break;
                                    case 300:
                                        i2 = R.string.album_full_error;
                                        break;
                                    case 800:
                                        i2 = R.string.video_already_added_error;
                                        break;
                                    case 953:
                                        i2 = R.string.invalid_name_error;
                                        break;
                                    case 5800:
                                        i2 = R.string.self_money_transfer_error;
                                        break;
                                    default:
                                        i2 = R.string.error;
                                        break;
                                }
                                string = context4.getString(i2);
                            }
                        }
                        enj.r(context4, string, 0);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    rfc a2 = fpf0.a(th.getClass());
                    if (!a2.equals(fpf0.a(ConnectException.class)) && !a2.equals(fpf0.a(SocketException.class)) && !a2.equals(fpf0.a(SocketTimeoutException.class)) && !a2.equals(fpf0.a(UnknownHostException.class)) && !a2.equals(fpf0.a(ProtocolException.class))) {
                        if (z) {
                            VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) th;
                            if (vKApiExecutionException2.s() != -1) {
                            }
                        }
                        enj.q(R.string.error, 0, context4);
                    }
                    enj.q(R.string.network_error, 0, context4);
                }
            } else if (xw0Var instanceof xw0.h) {
                ((xw0.h) xw0Var).a.O();
            } else if (xw0Var instanceof xw0.g) {
                kih0 kih0Var3 = ((xw0.g) xw0Var).a;
                if (kih0Var3.a()) {
                    VideoTextureViewAdapter.a.a(cVar.getVideoBaseViewsContainer().getVideoTextureViewAdapter(), kih0Var3, "AdsItemMviView.replayAds", null, null, null, 28);
                    kih0Var3.h();
                }
            } else if (xw0Var instanceof xw0.a) {
                xw0.a aVar3 = (xw0.a) xw0Var;
                SdkClipVideoFile sdkClipVideoFile2 = aVar3.a;
                kih0 kih0Var4 = aVar3.b;
                lw0Var.getClass();
                fxc0.B().d(k15.z(sdkClipVideoFile2));
                kih0Var4.play();
            } else if (xw0Var instanceof xw0.m) {
                cVar.getAutoPlayInstanceAdapter().H();
                cVar.m.ai(new ClipViewerAnalyticsEvent.a.b(((xw0.m) xw0Var).a));
            } else if (xw0Var instanceof xw0.c) {
                Activity L = blk.L(cVar);
                if (L != null) {
                    lw0Var.e().b(L, new h20(cVar, i));
                }
            } else if (xw0Var instanceof xw0.d) {
                wp50 wp50Var2 = cVar.y;
                if (wp50Var2 != null) {
                    wp50Var2.f(new xp50.j(cVar.getOverlayRenderLayer().c().getValue().g(), MyTargetFacadeClickTarget.CTA_BUTTON));
                }
            } else {
                if (!(xw0Var instanceof xw0.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(cVar, new AdsItemAction.i(((xw0.e) xw0Var).a));
            }
        }
        return s3q0.a;
    }

    public static s3q0 p(c cVar, fw0 fw0Var) {
        if (fw0Var instanceof fw0.b) {
            if (cVar.K) {
                cVar.getOverlayRenderLayer().c().getValue().d();
            }
        } else if (fw0Var instanceof fw0.c) {
            if (cVar.K) {
                cVar.getOverlayRenderLayer().c().getValue().c();
            }
        } else {
            if (!(fw0Var instanceof fw0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (cVar.K) {
                cVar.getOverlayRenderLayer().c().getValue().e();
            }
        }
        return s3q0.a;
    }

    public static s3q0 q(c cVar, String str) {
        cVar.getRenderEventsHandler().a.c().o0(str, null);
        return s3q0.a;
    }

    public static void r(c cVar, AdsItemViewEvent adsItemViewEvent) {
        wp50 wp50Var;
        wp50 wp50Var2;
        com.vk.clips.sdk.shared.item.ads.events.a viewEventVideoBaseImmediateHandler = cVar.getViewEventVideoBaseImmediateHandler();
        agj0 agj0Var = viewEventVideoBaseImmediateHandler.b;
        g5s0 g5s0Var = viewEventVideoBaseImmediateHandler.a;
        boolean z = adsItemViewEvent instanceof AdsItemViewEvent.b;
        if (z) {
            AdsItemViewEvent.b bVar = (AdsItemViewEvent.b) adsItemViewEvent;
            qu0 qu0Var = bVar.c;
            kih0 kih0Var = qu0Var.c;
            g5s0Var.a(bVar.b, kih0Var, bVar.d, null);
            agj0Var.a(kih0Var, qu0Var.d);
        } else if (adsItemViewEvent instanceof i01) {
            g5s0Var.a.a(((i01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof l01) {
            g5s0Var.a.a(null);
        } else if (adsItemViewEvent instanceof h01) {
            g5s0Var.a.a(((h01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof e01) {
            g5s0Var.a.a(((e01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof k01) {
            g5s0Var.a.a(((k01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof g01) {
            g5s0Var.a.a(((g01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof d01) {
            g5s0Var.a.a(((d01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof f01) {
            g5s0Var.f(((f01) adsItemViewEvent).b);
        } else if (adsItemViewEvent instanceof n01) {
            rlh0 rlh0Var = ((n01) adsItemViewEvent).b;
            i5s0 i5s0Var = g5s0Var.a;
            m5s0 m5s0Var = i5s0Var.b;
            if (m5s0Var instanceof m5s0.a) {
                i5s0Var.b(m5s0.a.a((m5s0.a) m5s0Var, null, rlh0Var, false, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            }
        } else if (adsItemViewEvent instanceof m01) {
            g5s0Var.g();
        } else {
            if (adsItemViewEvent instanceof AdsItemViewEvent.OnVideoFocusChanged) {
                g5s0Var.e(adsItemViewEvent == AdsItemViewEvent.OnVideoFocusChanged.FOCUSED);
            } else if (adsItemViewEvent instanceof AdsItemViewEvent.g) {
                g5s0Var.d();
                bgj0 bgj0Var = agj0Var.a.b;
                if ((bgj0Var instanceof bgj0.a) && (wp50Var2 = ((bgj0.a) bgj0Var).b) != null) {
                    wp50Var2.f(xp50.l.a);
                }
            } else if (adsItemViewEvent instanceof AdsItemViewEvent.h) {
                m5s0 m5s0Var2 = g5s0Var.a.b;
                if (m5s0Var2 instanceof m5s0.a) {
                    ((m5s0.a) m5s0Var2).b.D();
                    g5s0Var.f.c(g5s0Var);
                }
                bgj0 bgj0Var2 = agj0Var.a.b;
                if ((bgj0Var2 instanceof bgj0.a) && (wp50Var = ((bgj0.a) bgj0Var2).b) != null) {
                    wp50Var.f(xp50.n.a);
                }
            } else if (adsItemViewEvent instanceof AdsItemViewEvent.k) {
                agj0Var.a.a(bgj0.b.a);
            } else if (adsItemViewEvent instanceof AdsItemViewEvent.FeedEnterTransitionAnimation) {
                g5s0Var.b(adsItemViewEvent == AdsItemViewEvent.FeedEnterTransitionAnimation.START);
            }
        }
        if (z) {
            AdsItemViewEvent.b bVar2 = (AdsItemViewEvent.b) adsItemViewEvent;
            qu0 qu0Var2 = bVar2.c;
            xn50.a.c(cVar, new AdsItemAction.a.C0643a(bVar2.b, qu0Var2.b, qu0Var2.c, bVar2.d, cVar.k.c(), bVar2.e, qu0Var2.d));
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.k) {
            xn50.a.c(cVar, AdsItemAction.a.b.b);
            return;
        }
        if (adsItemViewEvent instanceof j01) {
            xn50.a.c(cVar, new AdsItemAction.t.h(((j01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof i01) {
            xn50.a.c(cVar, new AdsItemAction.t.g(((i01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof l01) {
            xn50.a.c(cVar, new AdsItemAction.t.j());
            return;
        }
        if (adsItemViewEvent instanceof h01) {
            xn50.a.c(cVar, new AdsItemAction.t.f(((h01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof e01) {
            e01 e01Var = (e01) adsItemViewEvent;
            xn50.a.c(cVar, new AdsItemAction.t.c(e01Var.b, e01Var.c, e01Var.d, e01Var.e));
            return;
        }
        if (adsItemViewEvent instanceof k01) {
            xn50.a.c(cVar, new AdsItemAction.t.i(((k01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof f01) {
            xn50.a.c(cVar, new AdsItemAction.t.d(((f01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof g01) {
            xn50.a.c(cVar, new AdsItemAction.t.e(((g01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof d01) {
            xn50.a.c(cVar, new AdsItemAction.t.b(((d01) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof c01) {
            xn50.a.c(cVar, new AdsItemAction.t.a(((c01) adsItemViewEvent).b));
            return;
        }
        if ((adsItemViewEvent instanceof n01) || (adsItemViewEvent instanceof m01)) {
            return;
        }
        if (adsItemViewEvent instanceof o01) {
            xn50.a.c(cVar, AdsItemAction.t.k.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.OnVideoFocusChanged) {
            int i = a.$EnumSwitchMapping$0[((AdsItemViewEvent.OnVideoFocusChanged) adsItemViewEvent).ordinal()];
            if (i == 1) {
                xn50.a.c(cVar, AdsItemAction.HandleVideoFocusChanged.FOCUSED);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(cVar, AdsItemAction.HandleVideoFocusChanged.UNFOCUSED);
                return;
            }
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.OnItemViewFocusChanged) {
            int i2 = a.$EnumSwitchMapping$1[((AdsItemViewEvent.OnItemViewFocusChanged) adsItemViewEvent).ordinal()];
            if (i2 == 1) {
                xn50.a.c(cVar, AdsItemAction.HandleOnItemViewFocusChanged.FOCUSED);
                return;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(cVar, AdsItemAction.HandleOnItemViewFocusChanged.UNFOCUSED);
                return;
            }
        }
        if ((adsItemViewEvent instanceof AdsItemViewEvent.g) || (adsItemViewEvent instanceof AdsItemViewEvent.h) || (adsItemViewEvent instanceof AdsItemViewEvent.FeedEnterTransitionAnimation)) {
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.o) {
            xn50.a.c(cVar, AdsItemAction.o.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.a) {
            xn50.a.c(cVar, AdsItemAction.d.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.e) {
            xn50.a.c(cVar, AdsItemAction.g.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.i) {
            xn50.a.c(cVar, new AdsItemAction.j(((AdsItemViewEvent.i) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.j) {
            wp50 wp50Var3 = cVar.y;
            if (wp50Var3 != null) {
                wp50Var3.f(new xp50.j(cVar.getOverlayRenderLayer().c().getValue().b(), MyTargetFacadeClickTarget.TITLE));
                return;
            } else {
                xn50.a.c(cVar, AdsItemAction.k.b);
                return;
            }
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.d) {
            xn50.a.c(cVar, AdsItemAction.f.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.c) {
            xn50.a.c(cVar, AdsItemAction.e.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.l) {
            xn50.a.c(cVar, AdsItemAction.l.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.m) {
            xn50.a.c(cVar, AdsItemAction.m.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.n) {
            xn50.a.c(cVar, AdsItemAction.n.b);
            return;
        }
        if (adsItemViewEvent instanceof AdsItemViewEvent.f) {
            xn50.a.c(cVar, AdsItemAction.h.b);
            return;
        }
        if (adsItemViewEvent instanceof qz0) {
            xn50.a.c(cVar, AdsItemAction.b.C0644b.b);
            return;
        }
        if (adsItemViewEvent instanceof pz0) {
            xn50.a.c(cVar, AdsItemAction.b.a.b);
            return;
        }
        if (adsItemViewEvent instanceof rz0) {
            xn50.a.c(cVar, new AdsItemAction.b.c(((rz0) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof tz0) {
            xn50.a.c(cVar, new AdsItemAction.b.e(((tz0) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof sz0) {
            xn50.a.c(cVar, new AdsItemAction.b.d(((sz0) adsItemViewEvent).b));
            return;
        }
        if (adsItemViewEvent instanceof wz0) {
            xn50.a.c(cVar, AdsItemAction.c.C0645c.b);
            return;
        }
        if (adsItemViewEvent instanceof uz0) {
            xn50.a.c(cVar, AdsItemAction.c.a.b);
            return;
        }
        if (adsItemViewEvent instanceof vz0) {
            xn50.a.c(cVar, AdsItemAction.c.b.b);
            return;
        }
        if (adsItemViewEvent instanceof xz0) {
            xn50.a.c(cVar, AdsItemAction.q.a.b);
            return;
        }
        if (adsItemViewEvent instanceof yz0) {
            xn50.a.c(cVar, AdsItemAction.q.b.b);
            return;
        }
        if (adsItemViewEvent instanceof b01) {
            xn50.a.c(cVar, AdsItemAction.s.b.b);
            return;
        }
        if (adsItemViewEvent instanceof zz0) {
            xn50.a.c(cVar, com.vk.clips.sdk.shared.item.ads.a.b);
            return;
        }
        if (!(adsItemViewEvent instanceof a01)) {
            throw new NoWhenBranchMatchedException();
        }
        wp50 wp50Var4 = cVar.y;
        if (wp50Var4 != null) {
            wp50Var4.f(new xp50.j(cVar.getOverlayRenderLayer().c().getValue().getRootContainer(), MyTargetFacadeClickTarget.BACKGROUND));
        } else {
            xn50.a.c(cVar, AdsItemAction.s.a.b);
        }
    }

    public static ly0 s(c cVar, Context context) {
        lyc lycVar = cVar.j;
        lw0 lw0Var = cVar.g;
        return new ly0(cVar, lycVar, lw0Var.a(), cVar.getAnalyticsCallbackWrapper(), lw0Var.j(), cVar.getLinkHelper(), new zrx0(new q6q0(context, new com.vk.im.engine.internal.api_commands.messages.a(cVar, 4)), lw0Var.g(cVar.getAnalyticsCallbackWrapper(), new i(cVar, 1), cVar), cVar.getRestrictionDialogHelper()));
    }

    public static s3q0 t(c cVar, boolean z) {
        cVar.getOverlayRenderLayer().getRenderer().getValue().b(z);
        return s3q0.a;
    }

    public static ycg0 u(c cVar) {
        return new ycg0(cVar.getRestrictionViewEventConsumer());
    }

    public static cz0 v(c cVar) {
        return cVar.getRenderLayerDefault();
    }

    @Override // xsna.jw0
    public final void E0() {
        this.B.a(AdsItemViewEvent.FeedEnterTransitionAnimation.START);
    }

    @Override // xsna.jw0
    public final void F0(boolean z) {
        this.B.a(z ? AdsItemViewEvent.OnVideoFocusChanged.FOCUSED : AdsItemViewEvent.OnVideoFocusChanged.UNFOCUSED);
    }

    @Override // xsna.xn50
    @SuppressLint({"WrongThread"})
    public final mk50 Fl() {
        if (this.p) {
            return new mk50.b(R.layout.fullscreen_ads_item_lite);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fullscreen_ads_item, (ViewGroup) null, false);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.fullscreen_ads_item_controls_stub);
        viewStub.setLayoutResource(getOverlayRenderLayer().b());
        viewStub.inflate();
        return new mk50.c(inflate);
    }

    @Override // xsna.jw0
    public final void G0() {
        this.B.a(AdsItemViewEvent.a.b);
    }

    @Override // xsna.jw0
    public final void H0(qu0 qu0Var) {
        SdkClipVideoFile sdkClipVideoFile = qu0Var.a;
        kih0 kih0Var = qu0Var.c;
        long position = kih0Var.getPosition();
        if (position < 0) {
            position = 0;
        }
        hz0 hz0Var = new hz0(new hz0.a(we7.l(sdkClipVideoFile, position, null), we7.k(sdkClipVideoFile, position), we7.j(sdkClipVideoFile, position)));
        this.y = qu0Var.d;
        ClipVideoFileAdapter copy = sdkClipVideoFile.copy();
        ClipVideoFile clipVideoFile = copy.m;
        clipVideoFile.U1 = sdkClipVideoFile.U6();
        clipVideoFile.V1 = sdkClipVideoFile.L5();
        clipVideoFile.W1 = sdkClipVideoFile.S6();
        this.B.a(new AdsItemViewEvent.b(copy, qu0Var, new j4b0(kih0Var), hz0Var));
    }

    @Override // xsna.jw0
    public final void I0(float f) {
        getOverlayRenderLayer().getRenderer().getValue().d(f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        c11 c11Var = (c11) ao50Var;
        getVideoBaseViewsContainer().getVideoTextureViewAdapter().getClass();
        int i = 0;
        int i2 = 1;
        if (!this.p || this.K) {
            w();
        } else {
            this.s = rl3.I(new View[]{getVideoBaseViewsContainer().getVideoTextureViewAdapter().getView(), getVideoBaseViewsContainer().c(), getVideoBaseViewsContainer().b().getView()});
            this.t = Collections.singletonList(getVideoBaseViewsContainer().m());
            this.u = EmptyList.b;
        }
        gm50.a.b(this, c11Var.a, new p(this, i2));
        gm50.a.b(this, c11Var.b, new zx0(this, i));
        this.L = true;
    }

    @Override // xsna.jw0
    public final void O() {
        this.B.a(AdsItemViewEvent.FeedEnterTransitionAnimation.FINISH);
    }

    @Override // com.vk.mvi.MviLazyViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        b bVar = (b) vk50Var;
        bVar.i.a(new yx0(this, 0), getViewOwner());
        bVar.j.a(new d7(this, 2), getViewOwner());
        bVar.k.a(new hy0(1, getNavigationDelegate(), ly0.class, "onNewEventReceived", "onNewEventReceived(Lcom/vk/clips/sdk/shared/item/ads/events/navigation/AdsItemNavigationEvent;)V", 0, 0), getViewOwner());
    }

    @Override // xsna.jw0
    public final void a() {
        this.y = null;
        this.B.a(AdsItemViewEvent.k.b);
    }

    @Override // xsna.jw0
    public final void c(boolean z) {
        this.B.a(z ? AdsItemViewEvent.OnItemViewFocusChanged.FOCUSED : AdsItemViewEvent.OnItemViewFocusChanged.UNFOCUSED);
    }

    @Override // xsna.jw0
    public List<View> getFadeTransitionViews() {
        return this.t;
    }

    @Override // xsna.jw0
    public List<View> getFastFadeViews() {
        return this.u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ly0 getNavigationDelegate() {
        return (ly0) this.A.getValue();
    }

    @Override // xsna.jw0
    public List<View> getTranslationTransitionViews() {
        return this.s;
    }

    @Override // xsna.jw0
    public gxp0.a getUiVisibilityConfigChangedListener() {
        return this.D;
    }

    @Override // xsna.jw0
    public VideoTextureViewAdapter getVideoTextureViewAdapter() {
        return getVideoBaseViewsContainer().getVideoTextureViewAdapter();
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B.a(AdsItemViewEvent.g.b);
    }

    @Override // com.vk.mvi.MviLazyViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.K) {
            cleanupLayoutState(getOverlayRenderLayer().c().getValue().getRootContainer());
            cleanupLayoutState(getOverlayRenderLayer().c().getValue().f());
        }
        this.B.a(AdsItemViewEvent.h.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getGestureDetector().a(motionEvent);
        return true;
    }

    @Override // xsna.jw0
    public void setControlsView(View view) {
        if (this.K) {
            return;
        }
        addView(view);
        if (this.L) {
            w();
        }
        this.K = true;
        getOverlayRenderLayer().getRenderer().getValue().a();
    }

    public final void w() {
        oy0 value = getOverlayRenderLayer().c().getValue();
        this.s = e43.l(getVideoBaseViewsContainer().getVideoTextureViewAdapter().getView(), getVideoBaseViewsContainer().c(), getVideoBaseViewsContainer().b().getView());
        this.t = j5g.u0(value.getFadeTransitionViews(), Collections.singletonList(getVideoBaseViewsContainer().m()));
        this.u = value.getFastFadeViews();
        getOverlayRenderLayer().c().getValue().a();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        d dVar = new d(getOverlayRenderLayer().a().getValue());
        iih0 analyticsCallbackWrapper = getAnalyticsCallbackWrapper();
        lw0 lw0Var = this.g;
        su suVar = new su(lw0Var.h());
        ojh0 h = lw0Var.h();
        iw0 iw0Var = new iw0(getContext(), new e0a(lw0Var.h()), new pw0(this.i));
        return new b(dVar, analyticsCallbackWrapper, this.h, new com.vk.movika.sdk.base.logic.interactor.b(this, 1), iw0Var, suVar, h, zw0.a, this.n);
    }

    @Override // xsna.jw0
    public oz0 getVideoUIEventListener() {
        return this.C;
    }

    private static /* synthetic */ void getRenderLayerRedesign$annotations() {
    }
}
