package com.vk.video.ui.discovery.minimizable;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.metrics.performance.animation.motionlayout.MotionLayoutScreenType;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.transition.DiscoveryScreenTransitions$Portrait;
import com.vk.video.ui.discovery.minimizable.motion.touches.TouchActionInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.NoWhenBranchMatchedException;
import xsna.aa30;
import xsna.afl0;
import xsna.bws0;
import xsna.eb30;
import xsna.ejf0;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.fvq0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.fys;
import xsna.gfs;
import xsna.ghn0;
import xsna.gzs;
import xsna.iah0;
import xsna.icn0;
import xsna.man;
import xsna.nb30;
import xsna.oa30;
import xsna.of;
import xsna.oqh0;
import xsna.orj0;
import xsna.ow90;
import xsna.pa30;
import xsna.q3s0;
import xsna.q6s0;
import xsna.qa30;
import xsna.qjo0;
import xsna.rzl0;
import xsna.s3q0;
import xsna.wa30;

/* compiled from: VideoMinimizableDiscoveryMotionStatesManager.kt */
/* loaded from: classes7.dex */
public final class m {
    public final Context a;
    public final int b;
    public final of c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final com.vk.movika.sdk.android.defaultplayer.control.n h;
    public final rzl0 i;
    public VideoAnnounceState j;
    public boolean l;
    public boolean m;
    public boolean n;
    public b p;
    public VideoMinimizableState q;
    public boolean r;
    public boolean s;
    public fys t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList y;
    public final eb30 z;
    public boolean k = true;
    public float o = 1.7777778f;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Context context, boolean z, int i, of ofVar, boolean z2, boolean z3, boolean z4, boolean z5, com.vk.movika.sdk.android.defaultplayer.control.n nVar, rzl0 rzl0Var) {
        this.a = context;
        this.b = i;
        this.c = ofVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = nVar;
        this.i = rzl0Var;
        this.p = z ? b.a.a : b.c.a;
        this.q = VideoMinimizableState.Hidden.b;
        this.t = fys.d.a;
        this.y = new ArrayList();
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_DISCOVERY_EPISODES_REDESIGN;
        videoFeatures.getClass();
        int i2 = com.vk.toggle.b.A.a(videoFeatures) ? R.id.videoDialogHeaderRoot : fxc0.B().J().h1() ? R.id.videoDialogHeaderRootV2 : R.id.videoDialogHeaderRootLegacy;
        MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = ofVar instanceof MotionLayoutWithFixedTouches ? (MotionLayoutWithFixedTouches) ofVar : null;
        this.z = motionLayoutWithFixedTouches != null ? new eb30(motionLayoutWithFixedTouches, z4) : null;
        ow90 ow90Var = ow90.a;
        MotionLayoutScreenType motionLayoutScreenType = MotionLayoutScreenType.VIDEO_DISCOVERY;
        View view = (View) ofVar;
        wa30 wa30Var = new wa30(view, ofVar);
        qa30 qa30Var = ow90.l;
        if (qa30Var == null) {
            qa30Var = new qa30(Choreographer.getInstance(), ow90.e);
            ow90.l = qa30Var;
        }
        gfs gfsVar = new gfs(qa30Var.b.a, new qa30.a(motionLayoutScreenType, qa30Var.a));
        oa30.a aVar = new oa30.a(gfsVar);
        pa30 pa30Var = new pa30(gfsVar, wa30Var);
        wa30Var.b = aVar;
        view.addOnAttachStateChangeListener(pa30Var);
        this.r = context.getResources().getConfiguration().orientation == 2;
        if (z4) {
            DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait = DiscoveryScreenTransitions$Portrait.DiscoveryToMiniplayer;
            TouchActionInfo.c.b.a aVar2 = new TouchActionInfo.c.b.a(R.id.playerContainer);
            TouchActionInfo.b.C1989b c1989b = TouchActionInfo.b.C1989b.a;
            TouchActionInfo.Direction direction = TouchActionInfo.Direction.Down;
            TouchActionInfo touchActionInfo = new TouchActionInfo(discoveryScreenTransitions$Portrait, aVar2, direction, c1989b, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496);
            ofVar.e1(TouchActionInfo.a(touchActionInfo, DiscoveryScreenTransitions$Portrait.DiscoveryVideoMatchRatioToMiniplayer, null, 510));
            ofVar.e1(touchActionInfo);
            ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToMiniplayer, new TouchActionInfo.c.b.a(R.id.playerContainer), direction, c1989b, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
            ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Portrait.DialogFullscreenToMiniplayer, new TouchActionInfo.c.b.a(R.id.playerContainer), direction, c1989b, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        }
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait2 = DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDialogFullscreen;
        TouchActionInfo.c.b.C1990b c1990b = new TouchActionInfo.c.b.C1990b("nested_scroll_source");
        TouchActionInfo.a.b bVar = TouchActionInfo.a.b.a;
        TouchActionInfo.b.a aVar3 = new TouchActionInfo.b.a(false);
        TouchActionInfo.Direction direction2 = TouchActionInfo.Direction.Up;
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Portrait2, c1990b, direction2, aVar3, bVar, 3.0f, (TouchActionInfo.d.a) null, (q3s0) null, 384));
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait3 = DiscoveryScreenTransitions$Portrait.DiscoveryToDiscoveryWithDialogUnderVideo;
        TouchActionInfo touchActionInfo2 = new TouchActionInfo(discoveryScreenTransitions$Portrait3, new TouchActionInfo.c.b.C1990b("nested_scroll_source"), direction2, new TouchActionInfo.b.a(false), (TouchActionInfo.a) null, 1.5f, new TouchActionInfo.d.a(new orj0(this, 21)), (q3s0) null, 272);
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait4 = DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo;
        ofVar.e1(TouchActionInfo.a(touchActionInfo2, discoveryScreenTransitions$Portrait4, null, 510));
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait5 = DiscoveryScreenTransitions$Portrait.FullscreenToDiscoveryWithDialogUnderVideo;
        ofVar.e1(TouchActionInfo.a(touchActionInfo2, discoveryScreenTransitions$Portrait5, new TouchActionInfo.d.a(new oqh0(this, 16)), 382));
        ofVar.e1(touchActionInfo2);
        TouchActionInfo.c.b.a aVar4 = new TouchActionInfo.c.b.a(i2);
        TouchActionInfo.b.C1989b c1989b2 = TouchActionInfo.b.C1989b.a;
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Portrait2, aVar4, direction2, c1989b2, (TouchActionInfo.a) null, 3.0f, (TouchActionInfo.d.a) null, (q3s0) null, 400));
        TouchActionInfo touchActionInfo3 = new TouchActionInfo(discoveryScreenTransitions$Portrait3, new TouchActionInfo.c.b.a(i2), direction2, c1989b2, (TouchActionInfo.a) null, 1.5f, new TouchActionInfo.d.a(new ghn0(this, 12)), (q3s0) null, 272);
        ofVar.e1(TouchActionInfo.a(touchActionInfo3, discoveryScreenTransitions$Portrait4, null, 510));
        ofVar.e1(TouchActionInfo.a(touchActionInfo3, discoveryScreenTransitions$Portrait5, new TouchActionInfo.d.a(new ejf0(this, 21)), 382));
        ofVar.e1(touchActionInfo3);
        TouchActionInfo touchActionInfo4 = new TouchActionInfo(DiscoveryScreenTransitions$Portrait.HiddenToDiscovery, new TouchActionInfo.c.b.a(R.id.playerContainer), direction2, c1989b2, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496);
        ofVar.e1(TouchActionInfo.a(touchActionInfo4, DiscoveryScreenTransitions$Portrait.HiddenToDiscoveryMatchVideoRatio, null, 510));
        ofVar.e1(touchActionInfo4);
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait6 = DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToHidden;
        TouchActionInfo.c.b.a aVar5 = new TouchActionInfo.c.b.a(R.id.playerContainer);
        TouchActionInfo.Direction direction3 = TouchActionInfo.Direction.Down;
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Portrait6, aVar5, direction3, c1989b2, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Portrait.DialogFullscreenToHidden, new TouchActionInfo.c.b.a(R.id.playerContainer), direction3, c1989b2, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Portrait2, new TouchActionInfo.c.b.C1990b("compose_nested_scroll_source"), direction2, new TouchActionInfo.b.a(false), bVar, 3.0f, (TouchActionInfo.d.a) null, (q3s0) null, 384));
        TouchActionInfo touchActionInfo5 = new TouchActionInfo(discoveryScreenTransitions$Portrait3, new TouchActionInfo.c.b.C1990b("compose_nested_scroll_source"), direction2, new TouchActionInfo.b.a(false), (TouchActionInfo.a) null, 1.5f, new TouchActionInfo.d.a(new icn0(this, 11)), (q3s0) null, 272);
        ofVar.e1(TouchActionInfo.a(touchActionInfo5, discoveryScreenTransitions$Portrait4, null, 510));
        ofVar.e1(TouchActionInfo.a(touchActionInfo5, discoveryScreenTransitions$Portrait5, new TouchActionInfo.d.a(new qjo0(this, 9)), 382));
        ofVar.e1(touchActionInfo5);
        String[] strArr = {"comments_header", "comments_thread_header"};
        int i3 = 0;
        while (true) {
            int i4 = 4;
            if (i3 >= 2) {
                break;
            }
            String str = strArr[i3];
            DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait7 = DiscoveryScreenTransitions$Portrait.DiscoveryWithDialogUnderVideoToDialogFullscreen;
            TouchActionInfo.c.a aVar6 = new TouchActionInfo.c.a(str);
            TouchActionInfo.a.C1988a c1988a = TouchActionInfo.a.C1988a.a;
            TouchActionInfo.b.C1989b c1989b3 = TouchActionInfo.b.C1989b.a;
            TouchActionInfo.Direction direction4 = TouchActionInfo.Direction.Up;
            ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Portrait7, aVar6, direction4, c1989b3, c1988a, 3.0f, (TouchActionInfo.d.a) null, (q3s0) null, 384));
            TouchActionInfo touchActionInfo6 = new TouchActionInfo(DiscoveryScreenTransitions$Portrait.DiscoveryToDiscoveryWithDialogUnderVideo, new TouchActionInfo.c.a(str), direction4, c1989b3, (TouchActionInfo.a) null, 1.5f, new TouchActionInfo.d.a(new q6s0(this, i4)), (q3s0) null, 272);
            ofVar.e1(TouchActionInfo.a(touchActionInfo6, DiscoveryScreenTransitions$Portrait.DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo, null, 510));
            ofVar.e1(TouchActionInfo.a(touchActionInfo6, DiscoveryScreenTransitions$Portrait.FullscreenToDiscoveryWithDialogUnderVideo, new TouchActionInfo.d.a(new afl0(this, 15)), 382));
            ofVar.e1(touchActionInfo6);
            i3++;
        }
        if (z4) {
            DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape = DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToMiniplayer;
            TouchActionInfo.c.b.a aVar7 = new TouchActionInfo.c.b.a(R.id.playerContainer);
            TouchActionInfo.b.C1989b c1989b4 = TouchActionInfo.b.C1989b.a;
            TouchActionInfo.Direction direction5 = TouchActionInfo.Direction.Down;
            ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Landscape, aVar7, direction5, c1989b4, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
            DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape2 = DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreenWithDialog;
            TouchActionInfo.c.b.a aVar8 = new TouchActionInfo.c.b.a(R.id.playerContainer);
            TouchActionInfo.a.c cVar = TouchActionInfo.a.c.a;
            TouchActionInfo.Direction direction6 = TouchActionInfo.Direction.Up;
            ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Landscape2, aVar8, direction6, c1989b4, cVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 480));
            ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Landscape.MiniplayerToFullscreen, new TouchActionInfo.c.b.a(R.id.playerContainer), direction6, c1989b4, cVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 480));
            ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Landscape.DiscoveryToMiniplayer, new TouchActionInfo.c.b.a(R.id.playerContainer), direction5, c1989b4, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        }
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape3 = DiscoveryScreenTransitions$Landscape.DiscoveryToHidden;
        TouchActionInfo.c.b.a aVar9 = new TouchActionInfo.c.b.a(R.id.playerContainer);
        TouchActionInfo.b.C1989b c1989b5 = TouchActionInfo.b.C1989b.a;
        TouchActionInfo.Direction direction7 = TouchActionInfo.Direction.Down;
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Landscape3, aVar9, direction7, c1989b5, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Landscape.DiscoveryWithDialogToHidden, new TouchActionInfo.c.b.a(R.id.playerContainer), direction7, c1989b5, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        ofVar.e1(new TouchActionInfo(DiscoveryScreenTransitions$Landscape.FullscreenToFullscreenWithDialog, new TouchActionInfo.c.b.a(R.id.dialogContainer), TouchActionInfo.Direction.Left, c1989b5, (TouchActionInfo.a) null, 3.0f, (TouchActionInfo.d.a) null, (q3s0) null, 464));
        if (this.g) {
            Integer[] numArr = {Integer.valueOf(R.id.playerContainer), Integer.valueOf(R.id.similar_slider), Integer.valueOf(R.id.about_video_fullscreen_recycler), Integer.valueOf(R.id.similar_slider_header)};
            ArrayList arrayList = new ArrayList(4);
            for (int i5 = 0; i5 < 4; i5++) {
                arrayList.add(new TouchActionInfo(DiscoveryScreenTransitions$Landscape.FullscreenToFullscreenWithSimilar, new TouchActionInfo.c.b.a(numArr[i5].intValue()), TouchActionInfo.Direction.Up, TouchActionInfo.b.C1989b.a, (TouchActionInfo.a) null, 1.0f, new TouchActionInfo.d.a(new fyd0(this, 21)), (q3s0) null, 336));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ofVar.e1((TouchActionInfo) it.next());
            }
        }
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape4 = DiscoveryScreenTransitions$Landscape.DiscoveryToDiscoveryWithDialog;
        TouchActionInfo.c.b.C1990b c1990b2 = new TouchActionInfo.c.b.C1990b("nested_scroll_source");
        TouchActionInfo.b.a aVar10 = new TouchActionInfo.b.a(false);
        TouchActionInfo.Direction direction8 = TouchActionInfo.Direction.Up;
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Landscape4, c1990b2, direction8, aVar10, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        ofVar.e1(new TouchActionInfo(discoveryScreenTransitions$Landscape4, new TouchActionInfo.c.b.a(i2), direction8, TouchActionInfo.b.C1989b.a, (TouchActionInfo.a) null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (TouchActionInfo.d.a) null, (q3s0) null, 496));
        this.c.W2(new bws0(this));
    }

    public static boolean h(nb30 nb30Var) {
        return nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery || nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio || nb30Var == DiscoveryScreenMotionStates$Landscape.Discovery || nb30Var == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog || nb30Var == DiscoveryScreenMotionStates$Portrait.DialogFullscreen || nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo || nb30Var == DiscoveryScreenMotionStates$Landscape.Fullscreen || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar || nb30Var == DiscoveryScreenMotionStates$Portrait.Fullscreen;
    }

    public static void m(final m mVar, final boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        final boolean z2 = (i & 2) != 0;
        mVar.getClass();
        mVar.a(new gzs() { // from class: xsna.aws0
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0074, code lost:
            
                if (r3 != false) goto L45;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0076, code lost:
            
                r2 = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0078, code lost:
            
                if (r3 != false) goto L45;
             */
            @Override // xsna.gzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape;
                com.vk.video.ui.discovery.minimizable.m mVar2 = com.vk.video.ui.discovery.minimizable.m.this;
                nb30 c = mVar2.c();
                nb30 nb30Var = DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
                boolean z3 = z;
                if (c != nb30Var && c != (r4 = DiscoveryScreenMotionStates$Portrait.DialogFullscreen)) {
                    DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape2 = DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog;
                    if (c != discoveryScreenMotionStates$Landscape2 && c != (discoveryScreenMotionStates$Landscape = DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog)) {
                        if (z2 || epx.f(c, nb30.a.b) || c == DiscoveryScreenMotionStates$Portrait.Discovery || c == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio || c == DiscoveryScreenMotionStates$Landscape.Discovery || c == DiscoveryScreenMotionStates$Landscape.Fullscreen || c == DiscoveryScreenMotionStates$Portrait.Fullscreen || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo) {
                            boolean z4 = mVar2.r;
                            if (z4 && mVar2.e) {
                                nb30Var = discoveryScreenMotionStates$Landscape;
                            } else if (z4) {
                                nb30Var = discoveryScreenMotionStates$Landscape2;
                            } else if (c == DiscoveryScreenMotionStates$Portrait.Fullscreen && fxc0.B().J().V()) {
                                mVar2.v = true;
                            }
                        } else {
                            b.c cVar = b.c.a;
                            mVar2.p = cVar;
                            mVar2.h.invoke(mVar2.q, cVar);
                        }
                    }
                    nb30Var = c;
                } else if (z3) {
                    nb30Var = DiscoveryScreenMotionStates$Portrait.DialogFullscreen;
                }
                if (!epx.f(nb30Var, c)) {
                    mVar2.r(nb30Var);
                }
                return s3q0.a;
            }
        });
    }

    public static nb30 q(int i) {
        Object obj;
        Object obj2;
        Iterator<E> it = DiscoveryScreenMotionStates$Portrait.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DiscoveryScreenMotionStates$Portrait) obj).h() == i) {
                break;
            }
        }
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait = (DiscoveryScreenMotionStates$Portrait) obj;
        if (discoveryScreenMotionStates$Portrait != null) {
            return discoveryScreenMotionStates$Portrait;
        }
        Iterator<E> it2 = DiscoveryScreenMotionStates$Landscape.i().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((DiscoveryScreenMotionStates$Landscape) obj2).h() == i) {
                break;
            }
        }
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape = (DiscoveryScreenMotionStates$Landscape) obj2;
        if (discoveryScreenMotionStates$Landscape != null) {
            return discoveryScreenMotionStates$Landscape;
        }
        man manVar = man.b;
        manVar.getClass();
        man manVar2 = i == man.c ? manVar : null;
        return manVar2 != null ? manVar2 : nb30.a.b;
    }

    public final void a(gzs<s3q0> gzsVar) {
        of ofVar = this.c;
        boolean z = ofVar instanceof MotionLayoutWithFixedTouches;
        ArrayList arrayList = this.y;
        if (z) {
            if (((MotionLayoutWithFixedTouches) ofVar).q5()) {
                arrayList.add(gzsVar);
                return;
            } else {
                gzsVar.invoke();
                return;
            }
        }
        if (ofVar.getState() instanceof aa30.b) {
            arrayList.add(gzsVar);
        } else {
            gzsVar.invoke();
        }
    }

    public final void b() {
        if (g()) {
            boolean z = this.r;
            r((z && this.e) ? c() == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog ? DiscoveryScreenMotionStates$Landscape.Fullscreen : DiscoveryScreenMotionStates$Landscape.Discovery : z ? DiscoveryScreenMotionStates$Landscape.Fullscreen : this.v ? DiscoveryScreenMotionStates$Portrait.Fullscreen : this.x ? DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio : DiscoveryScreenMotionStates$Portrait.Discovery);
        } else {
            b.a aVar = b.a.a;
            this.p = aVar;
            this.h.invoke(this.q, aVar);
            p();
        }
    }

    public final nb30 c() {
        aa30 state = this.c.getState();
        if (state instanceof aa30.a) {
            return ((aa30.a) state).a;
        }
        if (state instanceof aa30.b) {
            return nb30.a.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void d(VideoTransitionSource videoTransitionSource) {
        int i;
        if (h(c())) {
            return;
        }
        boolean z = this.d;
        of ofVar = this.c;
        if (z && videoTransitionSource != null) {
            if (epx.f(c(), this.r ? DiscoveryScreenMotionStates$Landscape.Hidden : DiscoveryScreenMotionStates$Portrait.Hidden)) {
                HashSet hashSet = iah0.a;
                if (!fnj.d(this.a) && !this.r) {
                    eb30 eb30Var = this.z;
                    if (eb30Var != null) {
                        MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = eb30Var.a;
                        Rect e = f4m.e(motionLayoutWithFixedTouches);
                        float f = videoTransitionSource.b;
                        int i2 = e.left;
                        float f2 = videoTransitionSource.c;
                        int i3 = e.top;
                        int i4 = ((int) (f + videoTransitionSource.d)) - i2;
                        int i5 = videoTransitionSource.e;
                        Rect rect = new Rect(((int) f) - i2, ((int) f2) - i3, i4, ((int) (f2 + i5)) - i3);
                        androidx.constraintlayout.widget.b Z4 = motionLayoutWithFixedTouches.Z4(R.id.discovery_enter_start);
                        int i6 = videoTransitionSource.f;
                        int i7 = (i6 >= i5 || (i = rect.top) >= i5) ? rect.top : (i6 - i5) + i;
                        float f3 = i7;
                        float width = (motionLayoutWithFixedTouches.getWidth() / 1.7777778f) + f3;
                        if (i6 != i5 || width >= motionLayoutWithFixedTouches.getBottom()) {
                            Z4.H(f3, R.id.playerContainer);
                            Z4.H(f3, R.id.contentContainer);
                            Z4.H(f3, R.id.relatedVideoItemsBackground);
                            Z4.G(R.id.playerContainer, 3, 0);
                        } else {
                            Z4.G(R.id.playerContainer, 3, i7);
                            Z4.H(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.id.playerContainer);
                            Z4.H(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.id.contentContainer);
                            Z4.H(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, R.id.relatedVideoItemsBackground);
                        }
                        motionLayoutWithFixedTouches.l5(R.id.discovery_enter_start, Z4);
                    }
                    if (ofVar instanceof MotionLayoutWithFixedTouches) {
                        MotionLayoutWithFixedTouches motionLayoutWithFixedTouches2 = (MotionLayoutWithFixedTouches) ofVar;
                        int currentState = motionLayoutWithFixedTouches2.getCurrentState();
                        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait = DiscoveryScreenMotionStates$Portrait.ReadyToStart;
                        motionLayoutWithFixedTouches2.h5(currentState, discoveryScreenMotionStates$Portrait.h());
                        motionLayoutWithFixedTouches2.setProgress(1.0f);
                        motionLayoutWithFixedTouches2.h5(discoveryScreenMotionStates$Portrait.h(), e().h());
                    } else {
                        k(DiscoveryScreenMotionStates$Portrait.ReadyToStart);
                    }
                }
            }
        }
        ofVar.D(e());
    }

    public final nb30 e() {
        b bVar = this.p;
        boolean f = epx.f(bVar, b.a.a);
        boolean z = this.e;
        if (f) {
            fys fysVar = this.t;
            if ((((fysVar instanceof fys.b) && ((fys.b) fysVar).c) || ((fysVar instanceof fys.c) && ((fys.c) fysVar).a)) && !this.r) {
                return DiscoveryScreenMotionStates$Portrait.Fullscreen;
            }
            HashSet hashSet = iah0.a;
            if (fnj.d(this.a) && (this.t instanceof fys.b) && this.r) {
                return DiscoveryScreenMotionStates$Landscape.Fullscreen;
            }
            boolean z2 = this.r;
            return (z2 && z && !this.w) ? DiscoveryScreenMotionStates$Landscape.Discovery : z2 ? DiscoveryScreenMotionStates$Landscape.Fullscreen : (c() == DiscoveryScreenMotionStates$Landscape.Fullscreen && this.u) ? DiscoveryScreenMotionStates$Portrait.Fullscreen : this.x ? DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio : DiscoveryScreenMotionStates$Portrait.Discovery;
        }
        if (bVar instanceof b.C1972b) {
            boolean z3 = this.r;
            if (z3 && z) {
                return DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog;
            }
            if (z3) {
                return DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog;
            }
            if (c() != DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || !this.u || !fxc0.B().J().V()) {
                return (c() == DiscoveryScreenMotionStates$Landscape.Fullscreen && this.u) ? DiscoveryScreenMotionStates$Portrait.Fullscreen : DiscoveryScreenMotionStates$Portrait.DialogFullscreen;
            }
            this.v = true;
            return DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
        }
        if (!(bVar instanceof b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z4 = this.r;
        if (z4 && z) {
            return DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog;
        }
        if (z4) {
            return DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog;
        }
        if (c() != DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || !this.u || !fxc0.B().J().V()) {
            return (c() == DiscoveryScreenMotionStates$Landscape.Fullscreen && this.u) ? DiscoveryScreenMotionStates$Portrait.Fullscreen : DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
        }
        this.v = true;
        return DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
    }

    public final VideoMinimizableState f(nb30 nb30Var) {
        if (nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo || nb30Var == DiscoveryScreenMotionStates$Portrait.DialogFullscreen) {
            return this.v ? new VideoMinimizableState.FullscreenVertical(true) : VideoMinimizableState.Expanded.Compact.b;
        }
        if (nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery || nb30Var == DiscoveryScreenMotionStates$Landscape.Discovery || nb30Var == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog) {
            return VideoMinimizableState.Expanded.Compact.b;
        }
        if (nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio) {
            return new VideoMinimizableState.Expanded.MatchRatio(this.o);
        }
        if (nb30Var == DiscoveryScreenMotionStates$Landscape.Fullscreen || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog) {
            return new VideoMinimizableState.FullscreenHorizontal(false, nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar);
        }
        return (nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo) ? new VideoMinimizableState.FullscreenHorizontal(true, false) : nb30Var == DiscoveryScreenMotionStates$Portrait.Fullscreen ? new VideoMinimizableState.FullscreenVertical(false) : (nb30Var == DiscoveryScreenMotionStates$Portrait.Miniplayer || nb30Var == DiscoveryScreenMotionStates$Landscape.Miniplayer) ? new VideoMinimizableState.Collapsed(this.b) : (nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryPreparedToPip || nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryPreparedToPipMatchRatio || nb30Var == DiscoveryScreenMotionStates$Landscape.DiscoveryPreparedToPip) ? VideoMinimizableState.PreparedToPip.b : nb30Var.equals(man.b) ? VideoMinimizableState.Pip.b : VideoMinimizableState.Hidden.b;
    }

    public final boolean g() {
        nb30 c = c();
        return c == DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo || c == DiscoveryScreenMotionStates$Portrait.DialogFullscreen || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || c == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog;
    }

    public final boolean i() {
        nb30 c;
        return this.v || (c = c()) == DiscoveryScreenMotionStates$Landscape.Fullscreen || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo || c == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar || c == DiscoveryScreenMotionStates$Portrait.Fullscreen;
    }

    public final boolean j() {
        return this.o < 1.7777778f;
    }

    public final void k(nb30 nb30Var) {
        this.c.f1(nb30Var);
    }

    public final void l(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.7777778f;
        }
        this.o = f;
        this.x = j();
        eb30 eb30Var = this.z;
        if (eb30Var != null) {
            float f2 = this.o;
            eb30Var.c = f2;
            MotionLayoutWithFixedTouches motionLayoutWithFixedTouches = eb30Var.a;
            if (motionLayoutWithFixedTouches.getCurrentState() != R.id.expanded_match_ratio || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z4 = motionLayoutWithFixedTouches.Z4(R.id.expanded_match_ratio);
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.j(Z4);
                bVar.C(R.id.playerContainer, String.valueOf(eb30Var.c));
                s3q0 s3q0Var = s3q0.a;
                motionLayoutWithFixedTouches.l5(R.id.expanded_match_ratio, bVar);
            } else {
                androidx.constraintlayout.widget.b Z42 = motionLayoutWithFixedTouches.Z4(R.id.expanded_match_ratio);
                androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                bVar2.j(Z42);
                bVar2.C(R.id.playerContainer, String.valueOf(eb30Var.c));
                s3q0 s3q0Var2 = s3q0.a;
                motionLayoutWithFixedTouches.m5(R.id.expanded_match_ratio, bVar2, 100);
            }
            if (motionLayoutWithFixedTouches.getCurrentState() != R.id.prepared_to_pip_match_ratio || motionLayoutWithFixedTouches.q5()) {
                androidx.constraintlayout.widget.b Z43 = motionLayoutWithFixedTouches.Z4(R.id.prepared_to_pip_match_ratio);
                androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                bVar3.j(Z43);
                bVar3.C(R.id.playerContainer, String.valueOf(f2));
                motionLayoutWithFixedTouches.l5(R.id.prepared_to_pip_match_ratio, bVar3);
            } else {
                androidx.constraintlayout.widget.b Z44 = motionLayoutWithFixedTouches.Z4(R.id.prepared_to_pip_match_ratio);
                androidx.constraintlayout.widget.b bVar4 = new androidx.constraintlayout.widget.b();
                bVar4.j(Z44);
                bVar4.C(R.id.playerContainer, String.valueOf(f2));
                motionLayoutWithFixedTouches.m5(R.id.prepared_to_pip_match_ratio, bVar4, 100);
            }
        }
        boolean z = h(c()) && !i();
        boolean f3 = epx.f(this.p, b.a.a);
        boolean f4 = epx.f(e(), c());
        if (z && f3 && !f4) {
            r(e());
        }
        p();
    }

    public final void n(List<TouchActionInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TouchActionInfo) obj).h instanceof TouchActionInfo.d.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.e1((TouchActionInfo) it.next());
        }
    }

    public final void o(nb30 nb30Var) {
        this.q = f(nb30Var);
        b bVar = (nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery || nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio || nb30Var == DiscoveryScreenMotionStates$Landscape.Discovery || nb30Var == DiscoveryScreenMotionStates$Landscape.Fullscreen || nb30Var == DiscoveryScreenMotionStates$Portrait.Fullscreen || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo) ? b.a.a : (nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo || nb30Var == DiscoveryScreenMotionStates$Landscape.FullscreenWithDialog || nb30Var == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog) ? b.c.a : nb30Var == DiscoveryScreenMotionStates$Portrait.DialogFullscreen ? b.C1972b.a : epx.f(this.p, b.C1972b.a) ? b.c.a : this.p;
        this.p = bVar;
        this.h.invoke(this.q, bVar);
    }

    public final void p() {
        com.vk.video.ui.discovery.minimizable.motion.touches.a touchProcessor = this.c.getTouchProcessor();
        final fvq0 fvq0Var = new fvq0(this, 9);
        touchProcessor.g.replaceAll(new UnaryOperator() { // from class: xsna.bdp0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TouchActionInfo touchActionInfo = (TouchActionInfo) obj;
                Boolean bool = (Boolean) fvq0.this.invoke(touchActionInfo);
                if (bool == null) {
                    return touchActionInfo;
                }
                TouchActionInfo.d dVar = touchActionInfo.h;
                return (!(dVar instanceof TouchActionInfo.d.b) || Boolean.valueOf(((TouchActionInfo.d.b) dVar).a).equals(bool)) ? touchActionInfo : TouchActionInfo.a(touchActionInfo, null, new TouchActionInfo.d.b(bool.booleanValue()), 383);
            }
        });
    }

    public final void r(nb30 nb30Var) {
        this.c.D(nb30Var);
    }
}
