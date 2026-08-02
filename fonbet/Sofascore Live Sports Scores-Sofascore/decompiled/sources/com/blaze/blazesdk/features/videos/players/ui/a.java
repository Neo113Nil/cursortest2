package com.blaze.blazesdk.features.videos.players.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.models.AnalyticsPlayerViewingTransitionState;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.videos.models.args.b;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.c;
import com.blaze.blazesdk.features.videos.models.ui.g;
import com.blaze.blazesdk.features.videos.models.ui.h;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.D;
import com.blaze.blazesdk.players.models.H;
import com.blaze.blazesdk.players.models.N;
import com.blaze.blazesdk.players.models.P;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerButtonsStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.google.android.gms.cast.framework.CastContext;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a1n;
import defpackage.a70;
import defpackage.apm;
import defpackage.arl;
import defpackage.asf;
import defpackage.awm;
import defpackage.blm;
import defpackage.bqm;
import defpackage.bzm;
import defpackage.c1m;
import defpackage.ce;
import defpackage.cnb;
import defpackage.cqm;
import defpackage.csl;
import defpackage.dim;
import defpackage.drm;
import defpackage.dsl;
import defpackage.dxm;
import defpackage.eom;
import defpackage.etl;
import defpackage.eu8;
import defpackage.fam;
import defpackage.fdi;
import defpackage.ffm;
import defpackage.fnb;
import defpackage.fsm;
import defpackage.ful;
import defpackage.fzk;
import defpackage.g51;
import defpackage.g8m;
import defpackage.gim;
import defpackage.gym;
import defpackage.h5a;
import defpackage.hda;
import defpackage.hdm;
import defpackage.hrm;
import defpackage.hul;
import defpackage.i4m;
import defpackage.ie;
import defpackage.l1n;
import defpackage.lol;
import defpackage.lu3;
import defpackage.lz;
import defpackage.lzm;
import defpackage.mm3;
import defpackage.mri;
import defpackage.mzm;
import defpackage.n4m;
import defpackage.nq8;
import defpackage.nxm;
import defpackage.oum;
import defpackage.psm;
import defpackage.qdm;
import defpackage.qgm;
import defpackage.rim;
import defpackage.ryl;
import defpackage.s5m;
import defpackage.sq3;
import defpackage.sum;
import defpackage.szm;
import defpackage.tcm;
import defpackage.ttk;
import defpackage.tz9;
import defpackage.u6b;
import defpackage.u9m;
import defpackage.uzm;
import defpackage.vam;
import defpackage.vfm;
import defpackage.vjm;
import defpackage.vt;
import defpackage.vwl;
import defpackage.vzm;
import defpackage.w0m;
import defpackage.w3m;
import defpackage.wca;
import defpackage.wom;
import defpackage.wpm;
import defpackage.x5m;
import defpackage.xhm;
import defpackage.xtl;
import defpackage.y0n;
import defpackage.y6a;
import defpackage.ya4;
import defpackage.yhk;
import defpackage.zca;
import defpackage.zqm;
import defpackage.ztm;
import defpackage.zyd;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a extends ful implements csl {
    public static final /* synthetic */ int I = 0;
    public Function0 A;
    public Function0 B;
    public final vt C;
    public final vzm D;
    public final vzm E;
    public final vzm F;
    public final bzm G;
    public boolean H;
    public final b p;
    public final dxm q;
    public lzm r;
    public dsl s;
    public boolean t;
    public ie u;
    public vzm v;
    public Function1 w;
    public Function0 x;
    public Function0 y;
    public Function1 z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.features.videos.players.ui.a$a, reason: collision with other inner class name */
    public static final class C0017a {
        public C0017a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new C0017a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull b bVar, @Nullable Bundle bundle, @NotNull u6b u6bVar, @NotNull ttk ttkVar) {
        super(context, u6bVar, ttkVar);
        context.getClass();
        bVar.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.p = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_videos_player_view, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.blaze_player_container_mockup;
        View B = nq8.B(R.id.blaze_player_container_mockup, inflate);
        if (B != null) {
            i = R.id.blaze_videosBlockUserInteraction;
            View B2 = nq8.B(R.id.blaze_videosBlockUserInteraction, inflate);
            if (B2 != null) {
                i = R.id.blaze_videosFirstTimeSlide;
                FirstTimeSlideCustomView firstTimeSlideCustomView = (FirstTimeSlideCustomView) nq8.B(R.id.blaze_videosFirstTimeSlide, inflate);
                if (firstTimeSlideCustomView != null) {
                    i = R.id.blaze_videosViewPager;
                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.blaze_videosViewPager, inflate);
                    if (viewPager2 != null) {
                        this.q = new dxm(constraintLayout, B, B2, firstTimeSlideCustomView, viewPager2);
                        this.w = new fsm(16);
                        this.C = new vt(context, 23);
                        this.D = new vzm(this, 1);
                        this.E = new vzm(this, 2);
                        this.F = new vzm(this, 3);
                        this.G = new bzm(this);
                        setupViewModel(bundle);
                        setClosedCaptionBottomSheetResultListener(u6bVar);
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0276 -> B:72:0x027f). Please report as a decompilation issue!!! */
    public static final void D(a aVar) {
        aVar.z();
        dxm dxmVar = aVar.q;
        FirstTimeSlideCustomView firstTimeSlideCustomView = dxmVar.d;
        ViewPager2 viewPager2 = dxmVar.e;
        firstTimeSlideCustomView.getClass();
        firstTimeSlideCustomView.setVisibility(8);
        b bVar = aVar.p;
        if (!bVar.k) {
            arl.c(aVar.getActivity(), true);
        }
        BlazeVideosPlayerStyle playerStyle = aVar.getPlayerStyle();
        if (playerStyle != null) {
            int backgroundColor = playerStyle.getBackgroundColor();
            dxmVar.a.setBackgroundColor(backgroundColor);
            Window window = aVar.getActivity().getWindow();
            if (window != null) {
                window.setStatusBarColor(backgroundColor);
            }
        }
        aVar.h(BlazePlayerType.VIDEOS);
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = ((w3m) aVar.getViewModel()).F0;
        int i = 2;
        if (aVar2 != null) {
            szm szmVar = new szm(aVar, i);
            if ((aVar2 instanceof a.b) || (aVar2 instanceof a.C0011a)) {
                a.d b = aVar2.b();
                if (b instanceof a.d.C0014a) {
                    szmVar.invoke();
                } else {
                    if (!(b instanceof g)) {
                        zzl.b();
                        return;
                    }
                    Unit unit = Unit.a;
                }
            } else {
                if (!(aVar2 instanceof a.e)) {
                    zzl.b();
                    return;
                }
                Unit unit2 = Unit.a;
            }
        }
        Window window2 = aVar.getActivity().getWindow();
        if (window2 != null) {
            window2.addFlags(128);
        }
        try {
            w3m w3mVar = (w3m) aVar.getViewModel();
            etl videoManagerFactory = aVar.getVideoManagerFactory();
            w3mVar.getClass();
            videoManagerFactory.getClass();
            w3mVar.c = videoManagerFactory;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        try {
            com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode = aVar.getPlayerPresentationMode();
            vwl vwlVar = (playerPresentationMode == null || !h.c(playerPresentationMode)) ? vwl.TEXTURE_VIEW : vwl.SURFACE_VIEW;
            Context context = aVar.getContext();
            context.getClass();
            vwlVar.getClass();
            LayoutInflater from = LayoutInflater.from(context);
            from.getClass();
            aVar.setPlayerRendererBridge(new qdm(from, vwlVar, null));
            lzm lzmVar = new lzm(aVar, aVar.s, aVar.getViewScope(), bVar.a);
            aVar.r = lzmVar;
            viewPager2.setAdapter(lzmVar);
            viewPager2.getClass();
            viewPager2.setVisibility(4);
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.a(aVar.G);
            viewPager2.setUserInputEnabled(false);
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
        try {
            aVar.o(new oum(aVar, null));
            aVar.o(new ya4(aVar, null));
            aVar.o(new eu8(aVar, null));
            aVar.o(new zca(aVar, null));
            aVar.o(new fnb(aVar, null));
            aVar.o(new zyd(aVar, null));
            aVar.o(new mri(aVar, null));
            aVar.o(new fzk(aVar, null));
            aVar.o(new lol(aVar, null));
            aVar.o(new hul(aVar, null));
            h5a.E(((w3m) aVar.getViewModel()).T, aVar.getLifecycleOwner(), aVar.getCancellables$blazesdk_release(), new gym(aVar.C));
            h5a.E(((w3m) aVar.getViewModel()).z, aVar.getLifecycleOwner(), aVar.getCancellables$blazesdk_release(), new gym(aVar.D));
            h5a.E(((w3m) aVar.getViewModel()).G, aVar.getLifecycleOwner(), aVar.getCancellables$blazesdk_release(), new gym(aVar.E));
            h5a.E(((w3m) aVar.getViewModel()).H, aVar.getLifecycleOwner(), aVar.getCancellables$blazesdk_release(), new gym(aVar.F));
            try {
                aVar.o(new eom(aVar, null));
                aVar.o(new zqm(aVar, null));
            } catch (Throwable th3) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
            }
            aVar.o(new blm(aVar, null));
        } catch (Throwable th4) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
        }
        BlazeVideosAdsConfigType blazeVideosAdsConfigType = bVar.g;
        if (blazeVideosAdsConfigType == null) {
            blazeVideosAdsConfigType = BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG;
        }
        BlazeVideosAdsConfigType blazeVideosAdsConfigType2 = blazeVideosAdsConfigType;
        int i2 = aVar.getResources().getConfiguration().orientation;
        w3m w3mVar2 = (w3m) aVar.getViewModel();
        w3mVar2.getClass();
        blazeVideosAdsConfigType2.getClass();
        if (w3mVar2.l != null && w3mVar2.D() != null) {
            apm apmVar = w3mVar2.l;
            int i3 = apmVar == null ? -1 : u9m.a[apmVar.ordinal()];
            if (i3 == -1 || i3 == 1 || i3 == 2) {
                c1m.basePrepareMediaFor$default(w3mVar2, w3mVar2.D(), false, true, true, null, 18, null);
                return;
            } else {
                zzl.b();
                return;
            }
        }
        try {
        } catch (Throwable th5) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
        }
        if (w3mVar2.l0) {
            try {
                x5m.safeViewModelScopeIO$default(w3mVar2, null, new vfm(w3mVar2.n0, w3mVar2, w3mVar2.H(), blazeVideosAdsConfigType2, i2, null), 1, null);
            } catch (Throwable th6) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th6, null);
            }
        } else {
            try {
                x5m.safeViewModelScopeIO$default(w3mVar2, null, new xhm(w3mVar2, blazeVideosAdsConfigType2, i2, null), 1, null);
            } catch (Throwable th7) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th7, null);
            }
        }
        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
    }

    private final com.blaze.blazesdk.features.videos.models.ui.a getPlayerPresentationMode() {
        if (t()) {
            return ((w3m) getViewModel()).F0;
        }
        return null;
    }

    private final BlazeVideosPlayerStyle getPlayerStyle() {
        com.blaze.blazesdk.features.videos.models.ui.a aVar = ((w3m) getViewModel()).F0;
        if (aVar != null) {
            return h.a(aVar);
        }
        return null;
    }

    private final void setClosedCaptionBottomSheetResultListener(u6b u6bVar) {
        getActivity().k().i0("ClosedCaptionBottomSheetRequestKey", u6bVar, new uzm(this));
    }

    private final void setPlayerViewResizeMode(n4m n4mVar) {
        ((qdm) getPlayerRendererBridge()).a.setResizeMode(0);
    }

    private final void setupViewModel(Bundle bundle) {
        b bVar = this.p;
        try {
            n(bVar.b, w3m.class);
            A();
            apm c = c(bundle);
            F(c);
            w();
            if (bundle != null && !((w3m) getViewModel()).J()) {
                j(H.APP_CLOSE);
                return;
            }
            if (!bVar.k) {
                ConstraintLayout constraintLayout = this.q.a;
                constraintLayout.getClass();
                lz.s(constraintLayout);
            }
            BlazeVideosPlayerStyle playerStyle = getPlayerStyle();
            if (playerStyle != null) {
                this.s = new dsl(getActivity(), playerStyle);
            }
            ((w3m) getViewModel()).l = c;
            setOnShareChooserDismissed(new vzm(this, 0));
            B();
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                I();
            } else {
                if (i != 2) {
                    return;
                }
                H();
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            throw th;
        }
    }

    public static void updatePipMode$default(a aVar, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (aVar.t()) {
            ((w3m) aVar.getViewModel()).b0(i, str, z);
        }
    }

    public final void B() {
        sum sumVar;
        w3m w3mVar = (w3m) getViewModel();
        sum sumVar2 = (sum) w3mVar.V.getValue();
        if (Intrinsics.c(sumVar2, psm.a)) {
            sumVar = ztm.a;
        } else {
            sum sumVar3 = hrm.a;
            if (Intrinsics.c(sumVar2, sumVar3)) {
                apm apmVar = w3mVar.l;
                int i = apmVar == null ? -1 : u9m.a[apmVar.ordinal()];
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            zzl.b();
                            return;
                        }
                    }
                }
                sumVar = ztm.a;
            } else {
                sumVar3 = ztm.a;
                if (!Intrinsics.c(sumVar2, sumVar3)) {
                    zzl.b();
                    return;
                }
            }
            sumVar = sumVar3;
        }
        w3mVar.V.l(sumVar);
        Unit unit = Unit.a;
        o(new nxm(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00ea, code lost:
    
        if (r1.C(r12, r13, r2) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02e5, code lost:
    
        if (r1.K(r4, r2) != r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02c6, code lost:
    
        if (r1.x(r7, r8, r2) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x029a, code lost:
    
        if (r1.A(r8, r10, r7, r2) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0259, code lost:
    
        if (r1.y(r6, r7, r2) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x022a, code lost:
    
        if (r5.E(r6, r7, r2) == r3) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010f, code lost:
    
        if (r0.F(r1, r2) == r3) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(n4m n4mVar, boolean z, sq3 sq3Var) {
        ffm ffmVar;
        dxm dxmVar;
        n4m n4mVar2;
        boolean z2;
        dxm dxmVar2;
        n4m n4mVar3;
        a aVar;
        lzm lzmVar;
        boolean z3;
        a aVar2;
        com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode;
        boolean z4;
        com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode2;
        lzm lzmVar2;
        dxm dxmVar3;
        lzm lzmVar3;
        a aVar3;
        lzm lzmVar4;
        lzm lzmVar5;
        boolean z5;
        a aVar4;
        lzm lzmVar6;
        RecyclerView recyclerView;
        if (sq3Var instanceof ffm) {
            ffmVar = (ffm) sq3Var;
            int i = ffmVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                ffmVar.y = i - Integer.MIN_VALUE;
                Object obj = ffmVar.w;
                lu3 lu3Var = lu3.a;
                final int i2 = 2;
                final int i3 = 0;
                final int i4 = 4;
                final int i5 = 1;
                switch (ffmVar.y) {
                    case 0:
                        y6a.M(obj);
                        lzm lzmVar7 = this.r;
                        List list = lzmVar7 != null ? lzmVar7.a.f : null;
                        if (list != null && !list.isEmpty() && J()) {
                            lzm lzmVar8 = this.r;
                            dxmVar = this.q;
                            if (lzmVar8 != null) {
                                w0m playerRendererBridge = getPlayerRendererBridge();
                                int currentItem = dxmVar.e.getCurrentItem();
                                ffmVar.r = this;
                                n4mVar2 = n4mVar;
                                ffmVar.s = n4mVar2;
                                ffmVar.t = dxmVar;
                                ffmVar.u = dxmVar;
                                z2 = z;
                                ffmVar.v = z2;
                                ffmVar.y = 1;
                                break;
                            } else {
                                n4mVar2 = n4mVar;
                                z2 = z;
                            }
                            dxmVar2 = dxmVar;
                            n4mVar3 = n4mVar2;
                            aVar = this;
                            lzmVar = aVar.r;
                            if (lzmVar != null) {
                                int currentItem2 = dxmVar.e.getCurrentItem();
                                ffmVar.r = aVar;
                                ffmVar.s = n4mVar3;
                                ffmVar.t = dxmVar2;
                                ffmVar.u = dxmVar;
                                ffmVar.v = z2;
                                ffmVar.y = 2;
                                break;
                            }
                            z3 = z2;
                            dxm dxmVar4 = dxmVar2;
                            aVar2 = aVar;
                            final asf asfVar = new asf();
                            playerPresentationMode = aVar2.getPlayerPresentationMode();
                            final int i6 = 3;
                            if (playerPresentationMode != null) {
                                z4 = true;
                                h.b(playerPresentationMode, new Function0() { // from class: tzm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i4;
                                        asf asfVar2 = asfVar;
                                        switch (i7) {
                                            case 0:
                                                int i8 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                            case 1:
                                                int i9 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 2:
                                                int i10 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 3:
                                                int i11 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            default:
                                                int i12 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, new Function0() { // from class: tzm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i3;
                                        asf asfVar2 = asfVar;
                                        switch (i7) {
                                            case 0:
                                                int i8 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                            case 1:
                                                int i9 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 2:
                                                int i10 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 3:
                                                int i11 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            default:
                                                int i12 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, new Function0() { // from class: tzm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i5;
                                        asf asfVar2 = asfVar;
                                        switch (i7) {
                                            case 0:
                                                int i8 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                            case 1:
                                                int i9 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 2:
                                                int i10 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 3:
                                                int i11 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            default:
                                                int i12 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, new Function0() { // from class: tzm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i2;
                                        asf asfVar2 = asfVar;
                                        switch (i7) {
                                            case 0:
                                                int i8 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                            case 1:
                                                int i9 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 2:
                                                int i10 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 3:
                                                int i11 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            default:
                                                int i12 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                }, new Function0() { // from class: tzm
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i7 = i6;
                                        asf asfVar2 = asfVar;
                                        switch (i7) {
                                            case 0:
                                                int i8 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                            case 1:
                                                int i9 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 2:
                                                int i10 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            case 3:
                                                int i11 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = false;
                                                break;
                                            default:
                                                int i12 = com.blaze.blazesdk.features.videos.players.ui.a.I;
                                                asfVar2.a = true;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            } else {
                                z4 = true;
                            }
                            ((w3m) aVar2.getViewModel()).t(n4mVar3, asfVar.a);
                            playerPresentationMode2 = aVar2.getPlayerPresentationMode();
                            if (playerPresentationMode2 != null) {
                                if (!(playerPresentationMode2 instanceof a.b) && !(playerPresentationMode2 instanceof a.C0011a)) {
                                    if (!(playerPresentationMode2 instanceof a.e)) {
                                        zzl.b();
                                        break;
                                    } else {
                                        aVar2.l(n4mVar3);
                                        Unit unit = Unit.a;
                                    }
                                } else {
                                    a.d b = playerPresentationMode2.b();
                                    if (!(b instanceof a.d.C0014a)) {
                                        if (!(b instanceof g)) {
                                            zzl.b();
                                            break;
                                        } else {
                                            Unit unit2 = Unit.a;
                                        }
                                    } else {
                                        if (((w3m) aVar2.getViewModel()).h0) {
                                            aVar2.l(n4mVar3);
                                        }
                                        Unit unit3 = Unit.a;
                                    }
                                }
                            }
                            aVar2.setPlayerViewResizeMode(n4mVar3);
                            dxm dxmVar5 = aVar2.q;
                            mm3 mm3Var = new mm3();
                            ConstraintLayout constraintLayout = dxmVar5.a;
                            View view = dxmVar5.b;
                            mm3Var.e(constraintLayout);
                            mm3Var.c(view.getId());
                            mm3Var.s(view.getId());
                            mm3Var.j(view.getId()).d.w = 0.5f;
                            mm3Var.f(view.getId(), 3, constraintLayout.getId(), 3);
                            mm3Var.f(view.getId(), 6, constraintLayout.getId(), 6);
                            mm3Var.f(view.getId(), 7, constraintLayout.getId(), 7);
                            mm3Var.f(view.getId(), 4, constraintLayout.getId(), 4);
                            mm3Var.a(constraintLayout);
                            lzmVar2 = aVar2.r;
                            if (lzmVar2 != null) {
                                Boolean bool = (Boolean) ((w3m) aVar2.getViewModel()).H.d();
                                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                int currentItem3 = dxmVar.e.getCurrentItem();
                                ffmVar.r = aVar2;
                                ffmVar.s = dxmVar4;
                                ffmVar.t = dxmVar;
                                ffmVar.u = null;
                                ffmVar.v = z3;
                                ffmVar.y = 3;
                                break;
                            }
                            dxmVar3 = dxmVar4;
                            lzmVar3 = aVar2.r;
                            if (lzmVar3 != null) {
                                int currentItem4 = dxmVar.e.getCurrentItem();
                                wpm wpmVar = (wpm) ((w3m) aVar2.getViewModel()).I0.getValue();
                                ffmVar.r = aVar2;
                                ffmVar.s = dxmVar3;
                                ffmVar.t = dxmVar;
                                ffmVar.u = null;
                                ffmVar.v = z3;
                                ffmVar.y = 4;
                                break;
                            }
                            aVar3 = aVar2;
                            lzmVar4 = aVar3.r;
                            if (lzmVar4 != null) {
                                ViewPager2 viewPager2 = dxmVar.e;
                                int currentItem5 = viewPager2.getCurrentItem();
                                boolean z6 = viewPager2.getCurrentItem() > 0 ? z4 : false;
                                int currentItem6 = viewPager2.getCurrentItem();
                                lzm lzmVar9 = aVar3.r;
                                boolean z7 = currentItem6 < (lzmVar9 != null ? lzmVar9.getItemCount() + (-1) : -1) ? z4 : false;
                                ffmVar.r = aVar3;
                                ffmVar.s = dxmVar3;
                                ffmVar.t = dxmVar;
                                ffmVar.u = null;
                                ffmVar.v = z3;
                                ffmVar.y = 5;
                                break;
                            }
                            lzmVar5 = aVar3.r;
                            if (lzmVar5 != null) {
                                int currentItem7 = dxmVar.e.getCurrentItem();
                                s5m s5mVar = (s5m) ((w3m) aVar3.getViewModel()).O0.getValue();
                                ffmVar.r = aVar3;
                                ffmVar.s = dxmVar3;
                                ffmVar.t = dxmVar;
                                ffmVar.u = null;
                                ffmVar.v = z3;
                                ffmVar.y = 6;
                                break;
                            }
                            z5 = z3;
                            aVar4 = aVar3;
                            if (z5 && (r1 = aVar4.r) != null) {
                                int currentItem8 = dxmVar.e.getCurrentItem();
                                ffmVar.r = aVar4;
                                ffmVar.s = dxmVar3;
                                ffmVar.t = null;
                                ffmVar.u = null;
                                ffmVar.y = 7;
                                break;
                            }
                            lzmVar6 = aVar4.r;
                            if (lzmVar6 != null && (recyclerView = lzmVar6.d) != null) {
                                recyclerView.post(new xtl(recyclerView, 7));
                            }
                            c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        }
                        break;
                    case 1:
                        boolean z8 = ffmVar.v;
                        dxmVar = ffmVar.u;
                        dxmVar2 = ffmVar.t;
                        n4mVar3 = (n4m) ffmVar.s;
                        aVar = ffmVar.r;
                        y6a.M(obj);
                        z2 = z8;
                        lzmVar = aVar.r;
                        if (lzmVar != null) {
                        }
                        z3 = z2;
                        dxm dxmVar42 = dxmVar2;
                        aVar2 = aVar;
                        final asf asfVar2 = new asf();
                        playerPresentationMode = aVar2.getPlayerPresentationMode();
                        final int i62 = 3;
                        if (playerPresentationMode != null) {
                        }
                        ((w3m) aVar2.getViewModel()).t(n4mVar3, asfVar2.a);
                        playerPresentationMode2 = aVar2.getPlayerPresentationMode();
                        if (playerPresentationMode2 != null) {
                        }
                        aVar2.setPlayerViewResizeMode(n4mVar3);
                        dxm dxmVar52 = aVar2.q;
                        mm3 mm3Var2 = new mm3();
                        ConstraintLayout constraintLayout2 = dxmVar52.a;
                        View view2 = dxmVar52.b;
                        mm3Var2.e(constraintLayout2);
                        mm3Var2.c(view2.getId());
                        mm3Var2.s(view2.getId());
                        mm3Var2.j(view2.getId()).d.w = 0.5f;
                        mm3Var2.f(view2.getId(), 3, constraintLayout2.getId(), 3);
                        mm3Var2.f(view2.getId(), 6, constraintLayout2.getId(), 6);
                        mm3Var2.f(view2.getId(), 7, constraintLayout2.getId(), 7);
                        mm3Var2.f(view2.getId(), 4, constraintLayout2.getId(), 4);
                        mm3Var2.a(constraintLayout2);
                        lzmVar2 = aVar2.r;
                        if (lzmVar2 != null) {
                        }
                        dxmVar3 = dxmVar42;
                        lzmVar3 = aVar2.r;
                        if (lzmVar3 != null) {
                        }
                        aVar3 = aVar2;
                        lzmVar4 = aVar3.r;
                        if (lzmVar4 != null) {
                        }
                        lzmVar5 = aVar3.r;
                        if (lzmVar5 != null) {
                        }
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                            int currentItem82 = dxmVar.e.getCurrentItem();
                            ffmVar.r = aVar4;
                            ffmVar.s = dxmVar3;
                            ffmVar.t = null;
                            ffmVar.u = null;
                            ffmVar.y = 7;
                            break;
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                            recyclerView.post(new xtl(recyclerView, 7));
                            break;
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 2:
                        z3 = ffmVar.v;
                        dxmVar = ffmVar.u;
                        dxmVar2 = ffmVar.t;
                        n4mVar3 = (n4m) ffmVar.s;
                        aVar = ffmVar.r;
                        y6a.M(obj);
                        dxm dxmVar422 = dxmVar2;
                        aVar2 = aVar;
                        final asf asfVar22 = new asf();
                        playerPresentationMode = aVar2.getPlayerPresentationMode();
                        final int i622 = 3;
                        if (playerPresentationMode != null) {
                        }
                        ((w3m) aVar2.getViewModel()).t(n4mVar3, asfVar22.a);
                        playerPresentationMode2 = aVar2.getPlayerPresentationMode();
                        if (playerPresentationMode2 != null) {
                        }
                        aVar2.setPlayerViewResizeMode(n4mVar3);
                        dxm dxmVar522 = aVar2.q;
                        mm3 mm3Var22 = new mm3();
                        ConstraintLayout constraintLayout22 = dxmVar522.a;
                        View view22 = dxmVar522.b;
                        mm3Var22.e(constraintLayout22);
                        mm3Var22.c(view22.getId());
                        mm3Var22.s(view22.getId());
                        mm3Var22.j(view22.getId()).d.w = 0.5f;
                        mm3Var22.f(view22.getId(), 3, constraintLayout22.getId(), 3);
                        mm3Var22.f(view22.getId(), 6, constraintLayout22.getId(), 6);
                        mm3Var22.f(view22.getId(), 7, constraintLayout22.getId(), 7);
                        mm3Var22.f(view22.getId(), 4, constraintLayout22.getId(), 4);
                        mm3Var22.a(constraintLayout22);
                        lzmVar2 = aVar2.r;
                        if (lzmVar2 != null) {
                        }
                        dxmVar3 = dxmVar422;
                        lzmVar3 = aVar2.r;
                        if (lzmVar3 != null) {
                        }
                        aVar3 = aVar2;
                        lzmVar4 = aVar3.r;
                        if (lzmVar4 != null) {
                        }
                        lzmVar5 = aVar3.r;
                        if (lzmVar5 != null) {
                        }
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 3:
                        z3 = ffmVar.v;
                        dxmVar = ffmVar.t;
                        dxmVar3 = (dxm) ffmVar.s;
                        aVar2 = ffmVar.r;
                        y6a.M(obj);
                        z4 = true;
                        lzmVar3 = aVar2.r;
                        if (lzmVar3 != null) {
                        }
                        aVar3 = aVar2;
                        lzmVar4 = aVar3.r;
                        if (lzmVar4 != null) {
                        }
                        lzmVar5 = aVar3.r;
                        if (lzmVar5 != null) {
                        }
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 4:
                        z3 = ffmVar.v;
                        dxmVar = ffmVar.t;
                        dxmVar3 = (dxm) ffmVar.s;
                        a aVar5 = ffmVar.r;
                        y6a.M(obj);
                        aVar3 = aVar5;
                        z4 = true;
                        lzmVar4 = aVar3.r;
                        if (lzmVar4 != null) {
                        }
                        lzmVar5 = aVar3.r;
                        if (lzmVar5 != null) {
                        }
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 5:
                        z3 = ffmVar.v;
                        dxmVar = ffmVar.t;
                        dxmVar3 = (dxm) ffmVar.s;
                        aVar3 = ffmVar.r;
                        y6a.M(obj);
                        z4 = true;
                        lzmVar5 = aVar3.r;
                        if (lzmVar5 != null) {
                        }
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 6:
                        z3 = ffmVar.v;
                        dxmVar = ffmVar.t;
                        dxmVar3 = (dxm) ffmVar.s;
                        aVar3 = ffmVar.r;
                        y6a.M(obj);
                        z4 = true;
                        z5 = z3;
                        aVar4 = aVar3;
                        if (z5) {
                        }
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    case 7:
                        aVar4 = ffmVar.r;
                        y6a.M(obj);
                        z4 = true;
                        lzmVar6 = aVar4.r;
                        if (lzmVar6 != null) {
                        }
                        c1m.saveMediaViewingRecord$blazesdk_release$default(aVar4.getViewModel(), null, z4 ? 1 : 0, null);
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        ffmVar = new ffm(this, sq3Var);
        Object obj2 = ffmVar.w;
        lu3 lu3Var2 = lu3.a;
        final int i22 = 2;
        final int i32 = 0;
        final int i42 = 4;
        final int i52 = 1;
        switch (ffmVar.y) {
        }
        return null;
    }

    public final void E(rim rimVar) {
        View decorView;
        rimVar.getClass();
        if (rimVar instanceof qgm) {
            fam famVar = ((w3m) getViewModel()).e;
            this.t = famVar != null ? famVar.isPlaying() : false;
            ((w3m) getViewModel()).B(false);
            BlazeVideosPlayerStyle playerStyle = getPlayerStyle();
            if (playerStyle != null) {
                int backgroundColor = playerStyle.getBackgroundColor();
                Window window = getActivity().getWindow();
                if (window == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                decorView.setBackgroundColor(backgroundColor);
                return;
            }
            return;
        }
        boolean z = rimVar instanceof hdm;
        dxm dxmVar = this.q;
        if (z) {
            hdm hdmVar = (hdm) rimVar;
            float f = hdmVar.a;
            float f2 = hdmVar.b;
            ConstraintLayout constraintLayout = dxmVar.a;
            constraintLayout.setTranslationY(f * 0.3f);
            float f3 = 1.0f - ((f2 > 1.0f ? 1.0f : f2) * 0.12f);
            constraintLayout.setScaleX(f3);
            constraintLayout.setScaleY(f3);
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            constraintLayout.setAlpha(1.0f - (f2 * 0.15f));
            return;
        }
        if (!(rimVar instanceof vam)) {
            if (rimVar instanceof g8m) {
                dxmVar.a.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(new OvershootInterpolator(1.2f)).withEndAction(new xtl(this, 15)).start();
                return;
            } else {
                zzl.b();
                return;
            }
        }
        Context context = getContext();
        if (context != null) {
            cnb.triggerHapticFeedback$default(context, null, 1, null);
        }
        u();
        j(H.SWIPE);
    }

    public final void F(apm apmVar) {
        String a;
        BlazeVideosPlayerButtonsStyle buttons;
        BlazeVideosPlayerButtonStyle pip;
        AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode;
        wom womVar = null;
        b bVar = this.p;
        if (apmVar == null) {
            w3m w3mVar = (w3m) getViewModel();
            BlazeCachingLevel blazeCachingLevel = bVar.j;
            if (blazeCachingLevel != null) {
                w3mVar.D0 = blazeCachingLevel;
            } else {
                w3mVar.getClass();
            }
            w3m w3mVar2 = (w3m) getViewModel();
            String str = bVar.b;
            w3mVar2.getClass();
            str.getClass();
            w3mVar2.f = str;
            w3m w3mVar3 = (w3m) getViewModel();
            String str2 = bVar.c;
            w3mVar3.getClass();
            str2.getClass();
            w3mVar3.i = str2;
            ((w3m) getViewModel()).p0 = bVar.f;
            ((w3m) getViewModel()).n0 = bVar.h;
            ((w3m) getViewModel()).m0 = 0;
            ((w3m) getViewModel()).l0 = bVar.i;
            ((w3m) getViewModel()).k = bVar.d;
            ((w3m) getViewModel()).U = bVar.l;
            ((w3m) getViewModel()).F0 = bVar.a;
            ((w3m) getViewModel()).j = bVar.n;
            ((w3m) getViewModel()).G0 = bVar.o;
            ((w3m) getViewModel()).i0 = bVar.m;
            w3m w3mVar4 = (w3m) getViewModel();
            com.blaze.blazesdk.features.videos.models.ui.a aVar = w3mVar4.F0;
            if (aVar != null) {
                if (aVar instanceof a.b) {
                    playerViewingMode = h.c(aVar) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_PREVIEW;
                } else if (aVar instanceof a.C0011a) {
                    playerViewingMode = h.c(aVar) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_INTERACTIVE;
                } else {
                    if (!(aVar instanceof a.e)) {
                        zzl.b();
                        return;
                    }
                    playerViewingMode = AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                }
                if (playerViewingMode != null) {
                    w3mVar4.e0(playerViewingMode, false);
                }
            }
            com.blaze.blazesdk.features.videos.models.ui.a aVar2 = w3mVar4.F0;
            BlazeVideosPlayerStyle a2 = aVar2 != null ? h.a(aVar2) : null;
            drm.onEvent$default(w3mVar4.P0, new i4m.a((a2 == null || (buttons = a2.getButtons()) == null || (pip = buttons.getPip()) == null || !pip.isVisible()) ? false : true), false, 2, null);
        }
        w3m w3mVar5 = (w3m) getViewModel();
        String H = w3mVar5.H();
        wom womVar2 = hda.d;
        if (Intrinsics.c(womVar2 != null ? womVar2.b() : null, H)) {
            hda.d = null;
            CountDownTimer countDownTimer = hda.e;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (hda.d != null) {
                hda.e = new cqm().start();
            }
            womVar = womVar2;
        }
        w3mVar5.g0 = womVar;
        wom womVar3 = ((w3m) getViewModel()).g0;
        if (womVar3 == null) {
            return;
        }
        com.blaze.blazesdk.features.videos.models.ui.a aVar3 = bVar.a;
        if (aVar3 instanceof a.C0011a) {
            if (Intrinsics.c(womVar3.b(), bVar.b) && !h.c(aVar3) && (a = womVar3.a()) != null) {
                ((w3m) getViewModel()).n0 = a;
            }
        } else if (!(aVar3 instanceof a.b) && !(aVar3 instanceof a.e)) {
            zzl.b();
            return;
        }
        boolean isPlaying = ((g51) womVar3.c()).isPlaying();
        aVar3.getClass();
        ((w3m) getViewModel()).i0 = ((aVar3 instanceof a.b) && (((a.b) aVar3).c instanceof a.d.C0014a)) ? true : isPlaying;
    }

    public final void G(boolean z) {
        try {
            w3m w3mVar = (w3m) getViewModel();
            w3mVar.getClass();
            w3mVar.h0(new w3m.a.b(true));
            w3mVar.m0(z);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void H() {
        com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode = getPlayerPresentationMode();
        if (playerPresentationMode != null) {
            a.d b = playerPresentationMode.b();
            if (b instanceof a.d.C0014a) {
                o(new y0n(this, null));
                Unit unit = Unit.a;
            } else if (b instanceof g) {
                Unit unit2 = Unit.a;
            } else {
                zzl.b();
            }
        }
    }

    public final void I() {
        com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode = getPlayerPresentationMode();
        if (playerPresentationMode != null) {
            a.d b = playerPresentationMode.b();
            if (b instanceof a.d.C0014a) {
                o(new l1n(this, null));
                Unit unit = Unit.a;
            } else if (b instanceof g) {
                Unit unit2 = Unit.a;
            } else {
                zzl.b();
            }
        }
    }

    public final boolean J() {
        w3m w3mVar = (w3m) getViewModel();
        Integer t = tz9.t(w3mVar.t, w3mVar.D());
        ViewPager2 viewPager2 = this.q.e;
        return Intrinsics.c(t, viewPager2 != null ? Integer.valueOf(viewPager2.getCurrentItem()) : null);
    }

    public final void K() {
        fam famVar;
        if (t()) {
            w3m w3mVar = (w3m) getViewModel();
            boolean z = ((bqm) w3mVar.P0.a.getValue()) instanceof vjm;
            if (z && (famVar = w3mVar.e) != null) {
                famVar.pause();
            }
            drm.reset$default(w3mVar.P0, false, 1, null);
            if (z) {
                w3mVar.g0(H.PIP_DISMISSED);
                mzm.a(w3mVar);
                w3mVar.l0(false);
            }
        }
    }

    public final void L() {
        com.blaze.blazesdk.features.videos.models.ui.a playerPresentationMode = getPlayerPresentationMode();
        if (playerPresentationMode != null) {
            szm szmVar = new szm(this, 1);
            if (!(playerPresentationMode instanceof a.b)) {
                if (playerPresentationMode instanceof a.C0011a) {
                    szmVar.invoke();
                    return;
                } else if (playerPresentationMode instanceof a.e) {
                    szmVar.invoke();
                    return;
                } else {
                    zzl.b();
                    return;
                }
            }
            a.d dVar = ((a.b) playerPresentationMode).c;
            if (dVar instanceof a.d.C0014a) {
                szmVar.invoke();
            } else if (!(dVar instanceof g)) {
                zzl.b();
            } else {
                M();
                Unit unit = Unit.a;
            }
        }
    }

    public final void M() {
        B b;
        AnalyticsPlayerViewingTransitionState.PlayerViewingMode playerViewingMode;
        ExoPlayer d;
        ie ieVar = this.u;
        if (ieVar == null || (b = ((w3m) getViewModel()).p0) == null) {
            return;
        }
        N n = N.b;
        n.getClass();
        B copy$default = B.copy$default(b, null, null, null, null, null, null, 63, null);
        copy$default.getClass();
        copy$default.b = n;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = ((w3m) getViewModel()).F0;
        if (aVar != null) {
            h.c(aVar);
            w3m w3mVar = (w3m) getViewModel();
            com.blaze.blazesdk.features.videos.models.ui.a aVar2 = w3mVar.F0;
            if (aVar2 != null) {
                if (aVar2 instanceof a.b) {
                    playerViewingMode = h.c(aVar2) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_PREVIEW : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                } else if (aVar2 instanceof a.C0011a) {
                    playerViewingMode = h.c(aVar2) ? AnalyticsPlayerViewingTransitionState.PlayerViewingMode.INLINE_INTERACTIVE : AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                } else {
                    if (!(aVar2 instanceof a.e)) {
                        zzl.b();
                        return;
                    }
                    playerViewingMode = AnalyticsPlayerViewingTransitionState.PlayerViewingMode.FULLSCREEN;
                }
                w3mVar.e0(playerViewingMode, true);
                fam famVar = w3mVar.e;
                if (famVar != null && (d = famVar.d()) != null) {
                    w3mVar.f0 = true;
                    w3mVar.x();
                    String H = w3mVar.H();
                    n4m D = w3mVar.D();
                    hda.d = new wom.a(H, d, D != null ? D.a : null, (String) w3mVar.g.getValue());
                    CountDownTimer countDownTimer = hda.e;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    if (hda.d != null) {
                        hda.e = new cqm().start();
                    }
                }
            }
            b bVar = this.p;
            String str = bVar.b;
            ttk storeOwner = getStoreOwner();
            ful.o.getClass();
            ful.b.a(str, storeOwner);
            this.v = new vzm(this, 4);
            VideosPlayerActivity.a aVar3 = VideosPlayerActivity.u;
            Context context = getContext();
            context.getClass();
            String str2 = bVar.b;
            String str3 = bVar.c;
            String str4 = bVar.d;
            WidgetType widgetType = bVar.e;
            BlazeVideosAdsConfigType blazeVideosAdsConfigType = bVar.g;
            n4m D2 = ((w3m) getViewModel()).D();
            com.blaze.blazesdk.features.videos.models.args.a aVar4 = new com.blaze.blazesdk.features.videos.models.args.a(bVar.a.a(c.a), str2, str3, str4, widgetType, copy$default, blazeVideosAdsConfigType, D2 != null ? D2.a : null, bVar.i, bVar.j, false, false, false, null, null, 28672, null);
            aVar3.getClass();
            VideosPlayerActivity.a.a(context, this, aVar4, ieVar);
        }
    }

    @Override // defpackage.ful
    public final void f(u6b u6bVar) {
        this.H = false;
        this.s = null;
    }

    @Nullable
    public final Function1<B, Unit> getNotifyOnFullScreenDismissal() {
        return this.w;
    }

    @Nullable
    public final Function0<Unit> getOnExitPipToFullscreenRequested() {
        return this.B;
    }

    @Nullable
    public final Function0<Unit> getOnForceRotationRequested() {
        return this.x;
    }

    @Nullable
    public final Function0<Unit> getOnHardExitRequested() {
        return this.A;
    }

    @Nullable
    public final Function0<Unit> getOnPipRequested() {
        return this.y;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnPlaybackStateChangedInPip() {
        return this.z;
    }

    @Nullable
    public final View getPlayerSourceView() {
        return this.q.e;
    }

    @Override // defpackage.ful
    public final void j(H h) {
        fam famVar;
        tcm a;
        CastContext castContext;
        h.getClass();
        if (t()) {
            w3m w3mVar = (w3m) getViewModel();
            w3mVar.getClass();
            try {
                w3mVar.g0(h);
                n4m D = w3mVar.D();
                if (D != null) {
                    x5m.safeViewModelScopeIO$default(w3mVar, null, new awm(w3mVar, D, (Pair) w3mVar.o.b, null), 1, null);
                }
                if (w3mVar.K() && (famVar = w3mVar.e) != null && (a = famVar.a()) != null && (castContext = ((com.blaze.blazesdk.players.a) a).g) != null) {
                    wca.n(castContext);
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        b bVar = this.p;
        if (bVar.k) {
            x();
            return;
        }
        com.blaze.blazesdk.features.videos.models.ui.a aVar = bVar.a;
        szm szmVar = new szm(this, 0);
        aVar.getClass();
        if ((aVar instanceof a.b) || (aVar instanceof a.C0011a)) {
            szmVar.invoke();
        } else if (!(aVar instanceof a.e)) {
            zzl.b();
        } else {
            getActivity().finish();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.ful, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.u != null) {
            return;
        }
        try {
            this.u = getActivity().getActivityResultRegistry().c("VideosPlayerCustomView_full_screen_launcher_".concat(((w3m) getViewModel()).H()), new ce(3), new uzm(this));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        P p;
        i iVar;
        int i;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        o(new ryl(this, null));
        if (((w3m) getViewModel()).L()) {
            return;
        }
        w3m w3mVar = (w3m) getViewModel();
        int i2 = configuration.orientation;
        if (w3mVar.L()) {
            i = 1;
        } else {
            List Z = w3mVar.Z(i2, w3mVar.o0);
            w3mVar.o0 = Z;
            ArrayList Y = w3m.Y(Z);
            w3mVar.t = Y;
            if (!Y.isEmpty()) {
                fdi fdiVar = w3mVar.u;
                fdiVar.getClass();
                fdiVar.m(null, Y);
            }
            B b = w3mVar.p0;
            if (b == null || (p = b.d) == null) {
                p = (w3mVar.h0 || (iVar = w3mVar.G0) == null || !iVar.b) ? P.DEVICE_ROTATION : P.INITIAL_REQUEST;
            }
            D d = i2 != 1 ? i2 != 2 ? D.PORTRAIT : D.LANDSCAPE : D.PORTRAIT;
            if (b != null) {
                d.getClass();
                b.f = d;
            }
            B b2 = w3mVar.p0;
            if (b2 != null) {
                b2.d = p;
            }
            n4m D = w3mVar.D();
            gim gimVar = D != null ? D.b : null;
            if (gimVar instanceof gim.e) {
                gim.e eVar = (gim.e) gimVar;
                i = 1;
                mzm.b(w3mVar, EventActionName.VIEWING_ORIENTATION_CHANGED, mzm.createVideosPlayerProps$default(w3mVar, eVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
            } else {
                i = 1;
            }
            B b3 = w3mVar.p0;
            if (b3 != null) {
                b3.d = null;
            }
        }
        int i3 = configuration.orientation;
        if (i3 == i) {
            I();
        } else {
            if (i3 != 2) {
                return;
            }
            H();
        }
    }

    @Override // defpackage.ful
    public final void q(u6b u6bVar) {
        d();
        w3m w3mVar = (w3m) getViewModel();
        if (w3mVar.f0) {
            return;
        }
        w3mVar.j0 = false;
        if (w3mVar.K() || w3mVar.L()) {
            return;
        }
        w3mVar.B(false);
    }

    @Override // defpackage.ful
    public final void r() {
        super.r();
        ie ieVar = this.u;
        if (ieVar != null) {
            ieVar.b();
        }
        this.u = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
    }

    @Override // defpackage.ful
    public final void s(u6b u6bVar) {
        u6bVar.getClass();
        super.s(u6bVar);
        w3m w3mVar = (w3m) getViewModel();
        dim dimVar = w3mVar.P0.b;
        if (dimVar != null) {
            boolean z = dimVar.b;
            w3mVar.j0 = true;
            w3mVar.h0(new w3m.a.b(false));
            w3mVar.i0 = z;
            List Z = w3mVar.Z(dimVar.a, w3mVar.o0);
            w3mVar.o0 = Z;
            ArrayList Y = w3m.Y(Z);
            w3mVar.t = Y;
            if (!Y.isEmpty()) {
                fdi fdiVar = w3mVar.u;
                fdiVar.getClass();
                fdiVar.m(null, Y);
            }
            w3mVar.B(z);
            return;
        }
        boolean z2 = w3mVar.d0;
        w3mVar.d0 = false;
        com.blaze.blazesdk.features.videos.models.ui.a aVar = w3mVar.F0;
        if (aVar != null) {
            a.d b = aVar.b();
            if (b instanceof a.d.C0014a) {
                if (w3mVar.M) {
                    w3mVar.j0 = true;
                    w3mVar.M = false;
                    w3mVar.B(true);
                } else if (z2) {
                    w3mVar.j0 = true;
                    w3mVar.k(a1n.a, false);
                } else {
                    w3mVar.j0 = true;
                }
                Unit unit = Unit.a;
            } else if (!(b instanceof g)) {
                zzl.b();
                return;
            } else {
                w3mVar.j0 = true;
                Unit unit2 = Unit.a;
            }
        }
        if (w3mVar.L()) {
            return;
        }
        w3mVar.h0(new w3m.a.b(true));
    }

    public final void setNotifyOnFullScreenDismissal(@Nullable Function1<? super B, Unit> function1) {
        this.w = function1;
    }

    public final void setOnExitPipToFullscreenRequested(@Nullable Function0<Unit> function0) {
        this.B = function0;
    }

    public final void setOnForceRotationRequested(@Nullable Function0<Unit> function0) {
        this.x = function0;
    }

    public final void setOnHardExitRequested(@Nullable Function0<Unit> function0) {
        this.A = function0;
    }

    public final void setOnPipRequested(@Nullable Function0<Unit> function0) {
        this.y = function0;
    }

    public final void setOnPlaybackStateChangedInPip(@Nullable Function1<? super Boolean, Unit> function1) {
        this.z = function1;
    }

    @Override // defpackage.ful
    public final void u() {
        Function0 function0 = this.A;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.ful
    public final void v() {
        try {
            w3m w3mVar = (w3m) getViewModel();
            Context context = getContext();
            w3mVar.m0(context != null && cnb.f(context) == 0);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ful
    public final BlazeContentExtraInfo y() {
        w3m w3mVar = (w3m) getViewModel();
        w3m w3mVar2 = (w3m) getViewModel();
        return w3mVar.W(tz9.t(w3mVar2.t, w3mVar2.D()));
    }

    public /* synthetic */ a(Context context, b bVar, Bundle bundle, u6b u6bVar, ttk ttkVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bVar, (i & 4) != 0 ? null : bundle, u6bVar, ttkVar);
    }
}
