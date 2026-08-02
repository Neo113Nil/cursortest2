package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewRenderProcessClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.BuildConfig;
import defpackage.a0n;
import defpackage.bf3;
import defpackage.dii;
import defpackage.dmi;
import defpackage.g51;
import defpackage.h2d;
import defpackage.hr2;
import defpackage.iol;
import defpackage.j2d;
import defpackage.joa;
import defpackage.k13;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lm5;
import defpackage.lnb;
import defpackage.me4;
import defpackage.mz1;
import defpackage.o40;
import defpackage.p2g;
import defpackage.s9a;
import defpackage.t6j;
import defpackage.u2g;
import defpackage.w1l;
import defpackage.w2g;
import defpackage.wem;
import defpackage.xqm;
import defpackage.xtl;
import defpackage.xw3;
import defpackage.yda;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class GestureDetectorOnGestureListenerC3889xi extends D2 implements C, K2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Wf, Eh {
    public static final C3372di g1 = new C3372di();
    public static final C3346ci h1 = new C3346ci();
    public static final String i1 = "xi";
    public static final M1 j1 = new M1(Boolean.FALSE, new xqm(15), false, true);
    public String A;
    public final GestureDetector A0;
    public Jc B;
    public final Uk B0;
    public boolean C;
    public boolean C0;
    public JSONObject D;
    public boolean D0;
    public JSONObject E;
    public C3334c6 E0;
    public boolean F;
    public InterfaceC3282a6 F0;
    public boolean G;
    public String G0;
    public boolean H;
    public Vf H0;
    public boolean I;
    public M0 I0;
    public EnumC3481ho J;
    public final AtomicBoolean J0;
    public boolean K;
    public boolean K0;
    public boolean L;
    public U L0;
    public String M;
    public String M0;
    public final AtomicBoolean N;
    public boolean N0;
    public final Object O;
    public Wo O0;
    public final Object P;
    public boolean P0;
    public boolean Q;
    public Map Q0;
    public final boolean R;
    public final C3475hi R0;
    public View S;
    public final C3863wi S0;
    public WebChromeClient.CustomViewCallback T;
    public String T0;
    public int U;
    public final C3604mi U0;
    public boolean V;
    public final C3500ii V0;
    public boolean W;
    public final C3423fi W0;
    public boolean X0;
    public L4 Y0;
    public D8 Z0;
    public long a0;
    public boolean a1;
    public final byte b;
    public String b0;
    public C3837vi b1;
    public final Set c;
    public final AtomicBoolean c0;
    public S8 c1;
    public String d;
    public ViewTreeObserver.OnGlobalLayoutListener d0;
    public final C3708qi d1;
    public final boolean e;
    public Hi e0;
    public final C3320bi e1;
    public String f;
    public final joa f0;
    public Uo f1;
    public volatile long g;
    public C3809ug g0;
    public final Bi h;
    public final joa h0;
    public final InterfaceC3880x9 i;
    public String i0;
    public final Yi j;
    public Map j0;
    public final Jo k;
    public J2 k0;
    public final C3638o0 l;
    public C l0;
    public final AdConfig m;
    public boolean m0;
    public volatile boolean n;
    public InterfaceC3871x0 n0;
    public volatile boolean o;
    public AbstractC3429fo o0;
    public volatile boolean p;
    public final boolean p0;
    public InterfaceC3731rg q;
    public int q0;
    public byte r;
    public String r0;
    public final Fj s;
    public int[] s0;
    public final joa t;
    public long t0;
    public WeakReference u;
    public int u0;
    public WeakReference v;
    public final C3449gi v0;
    public WeakReference w;
    public final C3552ki w0;
    public AbstractC3941zi x;
    public int x0;
    public final h2d y;
    public int y0;
    public volatile yda z;
    public Bc z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GestureDetectorOnGestureListenerC3889xi(Context context, byte b, Set set, String str, boolean z, String str2, long j, Bi bi, InterfaceC3880x9 interfaceC3880x9, Yi yi, Jo jo, C3638o0 c3638o0, AdConfig adConfig) {
        super(r0);
        context.getClass();
        str2.getClass();
        yi.getClass();
        jo.getClass();
        adConfig.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = b;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = j;
        this.h = bi;
        this.i = interfaceC3880x9;
        this.j = yi;
        this.k = jo;
        this.l = c3638o0;
        this.m = adConfig;
        this.p = true;
        this.q = new C3785ti(this);
        this.s = new Fj(interfaceC3880x9);
        final int i = 0;
        this.t = ypa.b(new Function0() { // from class: r0n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this;
                switch (i2) {
                    case 0:
                        return GestureDetectorOnGestureListenerC3889xi.c(gestureDetectorOnGestureListenerC3889xi);
                    default:
                        return GestureDetectorOnGestureListenerC3889xi.b(gestureDetectorOnGestureListenerC3889xi);
                }
            }
        });
        this.u = new WeakReference(null);
        this.v = new WeakReference(null);
        this.y = new j2d();
        this.A = "Default";
        this.F = true;
        this.G = true;
        this.I = true;
        this.J = EnumC3481ho.UNKNOWN;
        this.N = new AtomicBoolean(false);
        this.O = new Object();
        this.P = new Object();
        this.R = true;
        this.U = -1;
        this.a0 = Long.MIN_VALUE;
        this.c0 = new AtomicBoolean(false);
        ysa ysaVar = ysa.b;
        final char c = 1 == true ? 1 : 0;
        this.f0 = ypa.a(ysaVar, new Function0() { // from class: r0n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = c;
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this;
                switch (i2) {
                    case 0:
                        return GestureDetectorOnGestureListenerC3889xi.c(gestureDetectorOnGestureListenerC3889xi);
                    default:
                        return GestureDetectorOnGestureListenerC3889xi.b(gestureDetectorOnGestureListenerC3889xi);
                }
            }
        });
        this.h0 = ypa.b(new xqm(14));
        this.v0 = new C3449gi(this);
        this.w0 = new C3552ki(this);
        this.x0 = Integer.MIN_VALUE;
        this.y0 = Integer.MIN_VALUE;
        this.J0 = new AtomicBoolean(true);
        this.R0 = new C3475hi(this);
        this.S0 = new C3863wi(this);
        this.T0 = "html";
        this.U0 = new C3604mi(this, context);
        this.V0 = new C3500ii(this);
        this.W0 = new C3423fi(this);
        i1.getClass();
        toString();
        g1.getClass();
        j1.a();
        this.l0 = this;
        this.p0 = true;
        this.H0 = new Vf();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b == 1);
        this.A0 = gestureDetector;
        this.B0 = new Uk(this);
        if (this.n && this.z0 == null) {
            this.z0 = new Bc(this);
        }
        if (bi != null) {
            this.e0 = new Hi(bi);
        }
        AbstractC3294ai.a(this, interfaceC3880x9);
        if (c3638o0 != null) {
            setAdType(c3638o0.a);
            this.X0 = c3638o0.b;
            this.a0 = c3638o0.c;
            this.m0 = c3638o0.d;
            setCreativeId(c3638o0.e);
            this.n0 = c3638o0.i;
            this.r0 = c3638o0.j;
            this.T0 = c3638o0.g;
            String str3 = c3638o0.h;
            if (str3 != null) {
                setAdSize(str3);
            }
            setTelemetryManagerMap(c3638o0.k);
            b(c3638o0.f);
        }
        this.b1 = new C3837vi(this);
        this.c1 = new C3578li(this);
        this.d1 = new C3708qi(this);
        this.e1 = getAdConfig().getRendering().getDisableShowCustomView() ? new C3320bi(this) : new C3397ei(this);
        this.f1 = (this.X0 || N3.a(context)) ? new Uo(0, 44, 44, 0) : new Uo(0, 0, 0, 0);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        return ((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLpConfig();
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.h0.getValue();
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    private final Kk getScrollThrottler() {
        return (Kk) this.f0.getValue();
    }

    private final void setAdSize(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "setAdSize "));
        }
        T5 t5 = R5.a;
        this.q0 = (int) (R5.b() * Integer.parseInt(((String[]) new Regex("x").h(str).toArray(new String[0]))[0]));
        this.t0 = ((int) (R5.b() * Integer.parseInt(((String[]) new Regex("x").h(str).toArray(new String[0]))[1]))) * this.q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setOmidViewableAd(Vk vk) {
        Jf jf;
        boolean z;
        String str;
        Jf jf2;
        AdSessionContext createHtmlAdSessionContext;
        Map map;
        if (this.a1) {
            D8 d8 = this.Z0;
            if (d8 != null) {
                AbstractC3429fo abstractC3429fo = this.o0;
                abstractC3429fo.getClass();
                String str2 = this.r0;
                abstractC3429fo.getClass();
                vk.getClass();
                Context context = (Context) d8.h.get();
                if (context != null) {
                    d8.i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    ku3 ku3Var = d8.d;
                    Context context2 = context;
                    Oe oe = new Oe(ku3Var, d8.c);
                    HashMap hashMap = vk.b;
                    Object obj = hashMap.get("customReferenceData");
                    String str3 = obj instanceof String ? (String) obj : null;
                    Object obj2 = hashMap.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = hashMap.get("macros");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = d8.a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(k13.r(omidTrackers, 10));
                    for (HtmlOmidTracker htmlOmidTracker : omidTrackers) {
                        arrayList.add(new Nf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                        map2 = map2;
                        context2 = context2;
                    }
                    Map map3 = map2;
                    Context context3 = context2;
                    if (map3 == null) {
                        map = lm5.a;
                        map.getClass();
                    } else {
                        map = map3;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    Mf mf = new Mf(context3, this, abstractC3429fo, ku3Var, oe, new C3931z8(arrayList, map, str3, str2, Intrinsics.c(bool, Boolean.TRUE)), d8.c);
                    d8.p = mf;
                    jf2 = mf;
                }
            }
            jf = null;
            jf2 = jf;
        } else {
            jf = null;
            Object obj4 = vk.b.get("omidAdSession");
            InterfaceC3432g1 interfaceC3432g1 = obj4 instanceof InterfaceC3432g1 ? (InterfaceC3432g1) obj4 : null;
            if (vk.b.containsKey("deferred")) {
                Object obj5 = vk.b.get("deferred");
                obj5.getClass();
                if (((Boolean) obj5).booleanValue()) {
                    z = true;
                    Object obj6 = vk.b.get("customReferenceData");
                    str = !(obj6 instanceof String) ? (String) obj6 : null;
                    if (z && interfaceC3432g1 != null) {
                        String str4 = this.r0;
                        Sf sf = Rf.a;
                        sf.getClass();
                        createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf.b, this, str4, str);
                        createHtmlAdSessionContext.getClass();
                        C3886xf c3886xf = (C3886xf) interfaceC3432g1;
                        if (createHtmlAdSessionContext != null) {
                            c3886xf.c = createHtmlAdSessionContext;
                        }
                    }
                    if (interfaceC3432g1 != null) {
                        AbstractC3429fo abstractC3429fo2 = this.o0;
                        abstractC3429fo2.getClass();
                        jf2 = new Jf(this, abstractC3429fo2, interfaceC3432g1, this.i);
                    }
                    jf2 = jf;
                }
            }
            z = false;
            Object obj62 = vk.b.get("customReferenceData");
            if (!(obj62 instanceof String)) {
            }
            if (z) {
                String str42 = this.r0;
                Sf sf2 = Rf.a;
                sf2.getClass();
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf2.b, this, str42, str);
                createHtmlAdSessionContext.getClass();
                C3886xf c3886xf2 = (C3886xf) interfaceC3432g1;
                if (createHtmlAdSessionContext != null) {
                }
            }
            if (interfaceC3432g1 != null) {
            }
            jf2 = jf;
        }
        if (jf2 != null) {
            this.o0 = jf2;
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str5 = i1;
            str5.getClass();
            ((C3906y9) interfaceC3880x9).b(str5, this.a1 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Context context = AbstractC3424fj.a;
        context.getClass();
        return Pa.a(context, BuildConfig.FLAVOR).a.getBoolean("enableImraidLogs", false);
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            i1.getClass();
            toString();
            if (((Activity) this.v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                int i = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i++;
                }
                if (activity != null) {
                    this.v = new WeakReference(activity);
                    Unit unit = Unit.a;
                }
            }
        }
    }

    public void C() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onImpressionFired "));
        }
        F();
        D8 d8 = this.Z0;
        if (d8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = d8.j;
            Mf mf = d8.p;
            if (mf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                Oe oe = mf.e;
                if (skippable) {
                    if (oe != null) {
                        oe.a(skipOffset, autoplay);
                    }
                } else if (oe != null) {
                    oe.a(autoplay);
                }
                Oe oe2 = mf.e;
                if (oe2 != null) {
                    AdEvents adEvents = oe2.e;
                    InterfaceC3880x9 interfaceC3880x92 = oe2.b;
                    if (adEvents != null) {
                        if (interfaceC3880x92 != null) {
                            ((C3906y9) interfaceC3880x92).a(AbstractC3406f1.f, "registerImpression");
                        }
                        X4.a(oe2.a, new C3277a1(oe2, null));
                    } else if (interfaceC3880x92 != null) {
                        ((C3906y9) interfaceC3880x92).a(AbstractC3406f1.f, "Failed to registerImpression: AdEvent is null");
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onUserLandingCompleted "));
        }
        h("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "processUnload "));
        }
        if (this.N.get()) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x93).b(str3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.D0) {
            InterfaceC3880x9 interfaceC3880x94 = this.i;
            if (interfaceC3880x94 != null) {
                String str4 = i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x94).b(str4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.P0) {
            return;
        }
        this.P0 = true;
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        xtl xtlVar = new xtl(this, 17);
        executorC3520jc.getClass();
        executorC3520jc.a.post(xtlVar);
    }

    public final void F() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "recordContextualData "));
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.a();
        }
    }

    public final void G() {
        String str;
        C3845w0 c3845w0;
        String str2;
        String str3;
        String str4;
        C3845w0 c3845w02;
        String str5;
        C3716r1 c3716r1;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str6 = i1;
            ((C3906y9) interfaceC3880x9).a(str6, w1l.f(this, str6, "sendTelemetryEventForNetworkLoad "));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.C0 ? (short) 2212 : (short) 2211));
        Bi bi = this.h;
        if (bi != null && (c3716r1 = bi.j) != null) {
            linkedHashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - c3716r1.a.c));
        }
        Bi bi2 = this.h;
        if (bi2 != null && (c3845w02 = bi2.a) != null && (str5 = c3845w02.f) != null) {
            linkedHashMap.put("plType", str5);
        }
        Bi bi3 = this.h;
        if (bi3 != null && (str4 = bi3.f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        Bi bi4 = this.h;
        if (bi4 != null && (str3 = bi4.b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        Bi bi5 = this.h;
        if (bi5 != null && (c3845w0 = bi5.a) != null && (str2 = c3845w0.e) != null) {
            linkedHashMap.put("adType", str2);
        }
        Bi bi6 = this.h;
        if (bi6 != null && (str = bi6.d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        Bi bi7 = this.h;
        if (bi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(bi7.h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setCurrentPosition "));
        }
        this.E = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.E;
            if (jSONObject != null) {
                jSONObject.put("x", N3.b(r0[0] / R5.b()));
            }
            JSONObject jSONObject2 = this.E;
            if (jSONObject2 != null) {
                jSONObject2.put("y", N3.b(r0[1] / R5.b()));
            }
            int b = N3.b(getWidth() / R5.b());
            int b2 = N3.b(getHeight() / R5.b());
            JSONObject jSONObject3 = this.E;
            if (jSONObject3 != null) {
                jSONObject3.put("width", b);
            }
            JSONObject jSONObject4 = this.E;
            if (jSONObject4 != null) {
                jSONObject4.put("height", b2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.P) {
            this.G = false;
            this.P.notifyAll();
            Unit unit = Unit.a;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setDefaultPosition "));
        }
        int[] iArr = new int[2];
        this.D = new JSONObject();
        WeakReference weakReference = this.w;
        if (weakReference == null) {
            ViewParent parent = getParent();
            weakReference = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
            this.w = weakReference;
        }
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.D;
                if (jSONObject != null) {
                    jSONObject.put("x", N3.b(iArr[0] / R5.b()));
                }
                JSONObject jSONObject2 = this.D;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", N3.b(iArr[1] / R5.b()));
                }
                WeakReference weakReference3 = this.w;
                int b = N3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / R5.b());
                WeakReference weakReference4 = this.w;
                int b2 = N3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / R5.b());
                JSONObject jSONObject3 = this.D;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", b);
                }
                JSONObject jSONObject4 = this.D;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", b2);
                }
            } catch (JSONException unused) {
                Unit unit = Unit.a;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.D;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.D;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.D;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.D;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                Unit unit2 = Unit.a;
            }
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            Unit unit3 = Unit.a;
        }
    }

    public final void J() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setFallbackImpressionMinPercentageViewed "));
        }
        this.y0 = "video".equals(this.G0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : "audio".equals(this.G0) ? "audio".equals(getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final void K() {
        this.x0 = "video".equals(this.G0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : "audio".equals(this.G0) ? "audio".equals(getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
    }

    public final void L() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setFallbackImpressionParams "));
        }
        K();
        J();
        M();
    }

    public final void M() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setFallbackImpressionType "));
        }
        String adType = getAdType();
        this.r = Intrinsics.c(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : Intrinsics.c(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void N() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setImpressionParams "));
        }
        if (this.c == null) {
            L();
            return;
        }
        try {
            L();
            for (Vk vk : this.c) {
                if (vk.a == 2) {
                    if (vk.b.containsKey("type")) {
                        Object obj = vk.b.get("type");
                        obj.getClass();
                        this.r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (vk.b.containsKey("time")) {
                        Object obj2 = vk.b.get("time");
                        obj2.getClass();
                        this.x0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (vk.b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = vk.b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        obj3.getClass();
                        this.y0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.r == 2) {
                        if (vk.b.containsKey("pixel")) {
                            Object obj4 = vk.b.get("pixel");
                            obj4.getClass();
                            this.u0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (vk.b.containsKey("frame")) {
                            Object obj5 = vk.b.get("frame");
                            this.s0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x93).b(str3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setIsViewHardwareAccelerated "));
        }
        this.C = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "skipFromInterActive "));
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.h();
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "startTrackingAudioVolume "));
        }
        if (!z() || this.e) {
            return;
        }
        C3689q c3689q = C3689q.a;
        C3449gi c3449gi = this.v0;
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        c3449gi.getClass();
        xw3.L(C3689q.g, null, null, new C3559l(interfaceC3880x92, c3449gi, null), 3);
    }

    public final void R() {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        Set<View> keySet;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "startTrackingExposure "));
        }
        if (!z() || this.e) {
            gestureDetectorOnGestureListenerC3889xi = this;
            InterfaceC3880x9 interfaceC3880x92 = gestureDetectorOnGestureListenerC3889xi.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            gestureDetectorOnGestureListenerC3889xi = this;
            gestureDetectorOnGestureListenerC3889xi.L0 = new U(gestureDetectorOnGestureListenerC3889xi, (friendlyViews == null || (keySet = friendlyViews.keySet()) == null) ? new LinkedHashSet() : CollectionsKt.V0(keySet), getAdConfig().getMraid3().getExposureChangeInterval(), this.w0, this.i);
        }
        U u = gestureDetectorOnGestureListenerC3889xi.L0;
        if (u != null) {
            u.a();
        }
    }

    public final void S() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "stopTrackingAudioVolume "));
        }
        C3689q c3689q = C3689q.a;
        C3449gi c3449gi = this.v0;
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        c3449gi.getClass();
        xw3.L(C3689q.g, null, null, new C3611n(interfaceC3880x92, c3449gi, null), 3);
    }

    public final void T() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "stopTrackingExposure "));
        }
        U u = this.L0;
        if (u != null) {
            u.b();
        }
    }

    public final void U() {
        new G3(this, !this.H, !this.K, this.i).a(this.f1);
    }

    public final long V() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "timeSincePodShow "));
        }
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        if (interfaceC3871x0 != null) {
            return ((AbstractC3587m1) interfaceC3871x0).U();
        }
        return 0L;
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "ad dismissed");
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a();
        }
        M0 m0 = this.I0;
        if (m0 == null) {
            Intrinsics.i("adQualityManager");
            throw null;
        }
        if (m0.d.get()) {
            m0.a("session end is already triggered");
            return;
        }
        if (!m0.a.getEnabled()) {
            m0.a("config kill switch - false. ad quality will skip");
        } else if (m0.g == null) {
            m0.a("setup not done. ignore trigger");
        } else {
            m0.d.set(true);
            m0.a(false);
        }
    }

    public final void X() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "unregisterBackButtonPressedEventListener "));
        }
        this.M = null;
    }

    public final void Y() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "updateActivitiesOrientationProperties "));
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Vf vf = this.H0;
        vf.getClass();
        X8 x8 = ((InMobiAdActivity) activity).a;
        if (x8 != null) {
            x8.a(vf);
        } else {
            Intrinsics.i("orientationHandler");
            throw null;
        }
    }

    public final void a(AbstractC3941zi abstractC3941zi) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "initialize "));
        }
        int i = Build.VERSION.SDK_INT;
        if (Intrinsics.c(this.T0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.x = abstractC3941zi;
        ViewParent parent = getParent();
        this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        Dc dc = new Dc(url, maxRetries, retryInterval, expiry, interfaceC3880x92);
        if (url != null) {
            xw3.L(L9.c, null, null, new Cc(dc, null), 3);
        } else if (interfaceC3880x92 != null) {
            String str2 = dc.f;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).b(str2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.e1);
        if (!this.e) {
            Ha ha = new Ha(this.b, this);
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                ha.c = interfaceC3880x93;
            }
            addJavascriptInterface(ha, "sdkController");
        }
        this.B = new Jc(this, this.i);
        this.I0 = new M0(getAdConfig().getAdQuality(), this.i);
        if (i >= 29) {
            WebViewRenderProcessClient di = new Di(this.i, this.e0);
            Object value = AbstractC3851w6.c.getValue();
            value.getClass();
            setWebViewRenderProcessClient((ExecutorService) value, di);
        }
        C3638o0 c3638o0 = this.l;
        if (c3638o0 != null && (adQualityControl = c3638o0.n) != null) {
            M0 m0 = this.I0;
            if (m0 == null) {
                Intrinsics.i("adQualityManager");
                throw null;
            }
            m0.a("adQuality session setup");
            if (!m0.a.getEnabled()) {
                m0.a("config kill switch while setup - false. ad quality will skip");
            } else if (m0.c.get()) {
                m0.a("session already started. skip");
            } else {
                m0.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon == null || beacon.length() != 0) {
                    m0.g = adQualityControl;
                } else {
                    m0.a("no beacon received. aborting...");
                    ku3 ku3Var = F0.e;
                    if (ku3Var != null) {
                        s9a.o(ku3Var, new CancellationException("Shutdown"));
                    }
                    F0.e = null;
                    m0.a("session end - cleanup");
                    m0.g = null;
                    m0.f.clear();
                    m0.c.set(false);
                    m0.d.set(false);
                    m0.a("ad quality session is already in progress. skipping...");
                }
            }
        }
        C3638o0 c3638o02 = this.l;
        if (c3638o02 != null && (watermarkData = c3638o02.m) != null) {
            setWatermark(watermarkData);
        }
        C3638o0 c3638o03 = this.l;
        if (c3638o03 != null ? Intrinsics.c(c3638o03.l, Boolean.TRUE) : false) {
            l();
        }
    }

    public final void b(Bc bc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        bc.getClass();
        motionEvent.getClass();
        motionEvent2.getClass();
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, dii.c(" Rotation detected " + bc.i + " \n " + motionEvent + " \n " + motionEvent2));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent.getX(1))), Integer.valueOf(N3.c(motionEvent.getY(1))))));
        jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent2.getX())), Integer.valueOf(N3.c(motionEvent2.getY())))));
        jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent2.getX(1))), Integer.valueOf(N3.c(motionEvent2.getY(1))))));
        h("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void c(int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "showPodAdAtIndex " + this + " " + i);
        }
        if (this.J == EnumC3481ho.VISIBLE && this.n0 != null && !this.N.get()) {
            InterfaceC3871x0 interfaceC3871x0 = this.n0;
            if (interfaceC3871x0 != null) {
                interfaceC3871x0.a(i, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).b(str2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 com.inmobi.media.hb, still in use, count: 2, list:
          (r0v4 com.inmobi.media.hb) from 0x0093: MOVE (r19v0 com.inmobi.media.hb) = (r0v4 com.inmobi.media.hb) (LINE:148)
          (r0v4 com.inmobi.media.hb) from 0x004d: MOVE (r19v2 com.inmobi.media.hb) = (r0v4 com.inmobi.media.hb) (LINE:78)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.inmobi.media.D2
    public final com.inmobi.media.C3468hb d() {
        /*
            r20 = this;
            r5 = r20
            com.inmobi.media.x9 r0 = r5.i
            if (r0 == 0) goto L13
            java.lang.String r1 = com.inmobi.media.GestureDetectorOnGestureListenerC3889xi.i1
            java.lang.String r2 = "initLandingPageHandler "
            java.lang.String r2 = defpackage.w1l.f(r5, r1, r2)
            com.inmobi.media.y9 r0 = (com.inmobi.media.C3906y9) r0
            r0.a(r1, r2)
        L13:
            com.inmobi.media.ib r2 = new com.inmobi.media.ib
            boolean r7 = r5.e
            java.lang.String r8 = r5.f
            com.inmobi.media.core.config.models.AdConfig r0 = r5.getAdConfig()
            boolean r9 = r0.getCctEnabled()
            com.inmobi.media.core.config.models.AdConfig r0 = r5.getAdConfig()
            boolean r10 = r0.getPartialTabsEnabled()
            com.inmobi.media.Bi r0 = r5.h
            r1 = 0
            if (r0 == 0) goto L33
            com.inmobi.media.ads.network.common.model.InlineParams r0 = r0.m
            r11 = r0
        L31:
            r6 = r2
            goto L35
        L33:
            r11 = r1
            goto L31
        L35:
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r6
            com.inmobi.media.hb r0 = new com.inmobi.media.hb
            r3 = r1
            android.content.Context r1 = r5.getContext()
            r1.getClass()
            r4 = r3
            com.inmobi.media.ii r3 = r5.V0
            r6 = r4
            com.inmobi.media.mi r4 = r5.U0
            boolean r7 = r5.e
            if (r7 == 0) goto L51
            r19 = r0
            goto Lb2
        L51:
            com.inmobi.media.mb r8 = new com.inmobi.media.mb
            com.inmobi.media.Bi r6 = r5.h
            if (r6 == 0) goto L5f
            com.inmobi.media.w0 r6 = r6.a
            if (r6 == 0) goto L5f
            long r6 = r6.a
        L5d:
            r9 = r6
            goto L62
        L5f:
            r6 = 0
            goto L5d
        L62:
            java.lang.String r6 = r5.getImpressionId()
            java.lang.String r7 = ""
            if (r6 != 0) goto L6c
            r11 = r7
            goto L6d
        L6c:
            r11 = r6
        L6d:
            com.inmobi.media.Bi r6 = r5.h
            if (r6 == 0) goto L79
            com.inmobi.media.w0 r12 = r6.a
            if (r12 == 0) goto L79
            java.lang.String r12 = r12.f
            if (r12 != 0) goto L7a
        L79:
            r12 = r7
        L7a:
            if (r6 == 0) goto L84
            com.inmobi.media.w0 r13 = r6.a
            if (r13 == 0) goto L84
            java.lang.String r13 = r13.e
            if (r13 != 0) goto L85
        L84:
            r13 = r7
        L85:
            if (r6 == 0) goto L8b
            java.lang.String r14 = r6.b
            if (r14 != 0) goto L8c
        L8b:
            r14 = r7
        L8c:
            if (r6 == 0) goto L92
            java.lang.String r15 = r6.f
            if (r15 != 0) goto L93
        L92:
            r15 = r7
        L93:
            r19 = r0
            if (r6 == 0) goto L9f
            java.lang.String r0 = r6.d
            if (r0 != 0) goto L9c
            goto L9f
        L9c:
            r16 = r0
            goto La1
        L9f:
            r16 = r7
        La1:
            if (r6 == 0) goto La8
            boolean r0 = r6.h
        La5:
            r17 = r0
            goto Laa
        La8:
            r0 = 0
            goto La5
        Laa:
            java.lang.String r0 = r5.f
            r18 = r0
            r8.<init>(r9, r11, r12, r13, r14, r15, r16, r17, r18)
            r6 = r8
        Lb2:
            com.inmobi.media.x9 r7 = r5.i
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r5)
            r0 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC3889xi.d():com.inmobi.media.hb");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!Float.isNaN(motionEvent.getX()) && !Float.isNaN(motionEvent.getY())) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "dispatchTouchEvent "));
            }
            this.B0.a(motionEvent);
            if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
                a(motionEvent);
            }
            setViewTouchTimestamp(SystemClock.elapsedRealtime());
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.K0) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "dispatchTouchEvent Invalid Coordinates " + motionEvent);
            }
            this.K0 = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        C3915yi c3915yi;
        boolean z = this.e;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (z) {
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            C3334c6 c3334c6 = new C3334c6("IN_CUSTOM_BROWSER", new xqm(16), new a0n(11), new t6j(26), this.i, this.c1, getAdConfig().getCustomBrowser().getInt().getLoadCompletionDeBounce());
            this.E0 = c3334c6;
            c3915yi = c3334c6;
        } else {
            if (interfaceC3880x9 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).c(str2, "view is ad. Using RenderViewClient");
            }
            C3915yi c3915yi2 = new C3915yi(this.e0, this.i, new iol(this, 19));
            String adType = getAdType();
            c3915yi2.b = Intrinsics.c(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : Intrinsics.c(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            c3915yi = c3915yi2;
        }
        setWebViewClient(c3915yi);
    }

    public final void f(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "fireStateChange " + this + " " + str);
        }
        h("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void g(String str) {
        str.getClass();
        boolean enabled = getAdConfig().getPingV2().getEnabled();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (enabled) {
            if (interfaceC3880x9 != null) {
                String str2 = i1;
                ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "handlePing "));
            }
            C3809ug c3809ug = this.g0;
            if (c3809ug == null) {
                c3809ug = new C3809ug(this.q, this.e0);
                this.g0 = c3809ug;
            }
            xw3.L(L9.d, null, null, new C3757sg(c3809ug, str, null), 3);
            return;
        }
        if (interfaceC3880x9 != null) {
            String str3 = i1;
            ((C3906y9) interfaceC3880x9).a(str3, w1l.f(this, str3, "pings v2 is disabled "));
        }
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            a.put("trigger", "unknown");
            a.put("retryCount", String.valueOf(0));
            AbstractC3939zg.a("PingFailed", a);
        }
        InterfaceC3731rg interfaceC3731rg = this.q;
        EnumC3463h6[] enumC3463h6Arr = EnumC3463h6.a;
        ((C3785ti) interfaceC3731rg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    @NotNull
    public AdConfig getAdConfig() {
        return this.m;
    }

    @Nullable
    public final C3638o0 getAdMetaData() {
        return this.l;
    }

    @Nullable
    public final InterfaceC3871x0 getAdPodHandler() {
        return this.n0;
    }

    @NotNull
    public final M0 getAdQualityManager() {
        M0 m0 = this.I0;
        if (m0 != null) {
            return m0;
        }
        Intrinsics.i("adQualityManager");
        throw null;
    }

    @Nullable
    public String getAdType() {
        return this.i0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.m0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    @NotNull
    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.v;
    }

    @Nullable
    public final String getBeaconUrl() {
        return this.M0;
    }

    @NotNull
    public final Uo getCloseAssetArea() {
        return this.f1;
    }

    public final long getConfiguredArea() {
        return this.t0;
    }

    @NotNull
    public Context getContainerContext() {
        Activity activity = (Activity) this.u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        context.getClass();
        return context;
    }

    @Nullable
    public final String getContentURL() {
        return this.r0;
    }

    @Nullable
    public final L4 getContextualDataHandler() {
        return this.Y0;
    }

    @NotNull
    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    @Nullable
    public String getCreativeId() {
        return this.b0;
    }

    @NotNull
    public final String getCurrentPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    @NotNull
    public final Object getCurrentPositionMonitor() {
        return this.P;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        if (interfaceC3871x0 != null) {
            return ((AbstractC3587m1) interfaceC3871x0).l(this);
        }
        return 0;
    }

    @Nullable
    public Object getDataModel() {
        return null;
    }

    @NotNull
    public final String getDefaultPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.D;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    @NotNull
    public final Object getDefaultPositionMonitor() {
        return this.O;
    }

    @Nullable
    public final InterfaceC3282a6 getEmbeddedBrowserJsCallbacks() {
        return this.F0;
    }

    @Nullable
    public final U getExposureTracker() {
        return this.L0;
    }

    @Nullable
    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.j0;
    }

    @Nullable
    public final Activity getFullScreenActivity() {
        return (Activity) this.u.get();
    }

    @NotNull
    public B getFullScreenEventsListener() {
        return this.d1;
    }

    @Nullable
    public String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.r;
    }

    @Nullable
    public final S8 getInAppActivityBrowserClientListener() {
        return this.c1;
    }

    @NotNull
    public final String getLandingScheme() {
        return this.f;
    }

    @NotNull
    public final AbstractC3941zi getListener() {
        AbstractC3941zi abstractC3941zi = this.x;
        if (abstractC3941zi != null) {
            return abstractC3941zi;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "listener getter "));
        }
        C3346ci c3346ci = h1;
        this.x = c3346ci;
        return c3346ci;
    }

    @Nullable
    public final String getMCreativeType() {
        return this.G0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.y0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.x0;
    }

    @Nullable
    public final AbstractC3429fo getMViewableAd() {
        return this.o0;
    }

    @NotNull
    public String getMarkupType() {
        return this.T0;
    }

    @NotNull
    public final String getMarkupTypeAdUnit() {
        return this.T0;
    }

    @Nullable
    public final Jc getMediaProcessor() {
        return this.B;
    }

    public final int getMinimumPixelsPainted() {
        return this.u0;
    }

    @NotNull
    public final String getMraidJsString() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "mraidJsString getter "));
        }
        Context context = getContext();
        context.getClass();
        context.getClass();
        ConcurrentHashMap concurrentHashMap = Qa.b;
        String string = Pa.a(context, "mraid_js_store").a.getString("mraid_js_string", null);
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (string == null) {
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).a(str2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(e){}};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,\ne=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var e=this.listeners;e[c]||(e[c]=new EventListeners(c));e[c].broadcast(b)}catch(d){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nb.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(d){imraidview.showAlert(\"setOrientationProperties: \"+d+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"open: \"+b)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var b=\"\";null!=a&&(b=a);try{sdkController.playVideo(\"window.mraidview\",b)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===\ntypeof JSON){var d=\"\",c;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(c=0;c<b.length;c++)0<c&&(d+=\",\"),d+=a.stringifyArg(b[c]);return d+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,f;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(f in a)null!==a[f]&&(c||(b+=\",\"),b=b+'\"'+f+'\":',c=typeof a[f],b=\"number\"===c||\"boolean\"===c?b+a[f]:\"function\"===typeof a[f]?b+'\"\"':a[f]instanceof\nObject?b+this.stringify(args[i][f]):b+'\"'+a[f]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var b;switch(a.orientation){case 0:case 180:b=\"portrait\";break;case 90:case 270:b=\"landscape\";break;default:b=\"none\"}return{orientation:b,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(k){imraidview.showAlert(\"executeNativesetExpandProperties: \"+k+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(b){var c,k;try{c=parseInt(b.width);k=parseInt(b.height);if(isNaN(c)||isNaN(k)||1>c||1>k)throw\"Invalid\";b.width=c;b.height=k;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(f){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",f=0;f<b;f++)c+=a[f];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0);\"function\"===typeof b.iosBannerExposureChange&&b.iosBannerExposureChange(a)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=\nfunction(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=\na.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):\n(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),b.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};\na.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=\nb.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+c+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+\na;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",\nb)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,d=\"\",e=0;e<c;e++)d+=b[e];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,d,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.openInlineInstaller=function(b,c,d){try{\"undefined\"==typeof b&&(b=null),\"undefined\"==typeof d&&(d=null),sdkController.openInlineInstaller(\"window.imraidview\",\nb,c,d)}catch(e){a.showAlert(\"openInlineInstaller: \"+e)}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==a||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(d){}};\na.customExpand=function(b,c,d,e,f){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,d,e,f)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+\nk+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=\nfunction(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,\nvoid 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=c&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(d){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=\nfunction(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};\na.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=\nfunction(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendMessage: \"+d)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===\ntypeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):sdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):\nsdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};var e=function(){try{var a=window.mraidview.getSdkVersionInt();return 1110===a||1111===a}catch(b){return!1}},d=0,k=function(a,b){var c=Number(a);return!isNaN(c)&&\nisFinite(c)?Math.round(c*b):a};a.createVideoPlayer=function(b){try{if(!(0<d))try{d=\"number\"===typeof window.devicePixelRatio&&0<window.devicePixelRatio?window.devicePixelRatio:1}catch(c){d=1}if(e())try{var f=b.config;\"undefined\"!==typeof f.playbackUpdateInterval&&null!==f.playbackUpdateInterval&&(f.playbackInterval=f.playbackUpdateInterval);var g=f.videoViewPosition;null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.x&&null!==g.x)&&(g.x=k(g.x,d));null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==\ntypeof g.y&&null!==g.y)&&(g.y=k(g.y,d))}catch(l){a.showAlert(\"applyCreateVideoPlayerContractPatch: \"+l)}h();n();sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(r){a.showAlert(\"createVideoPlayer: \"+r)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,d){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");\nsdkController.executeVideoPlayerActions(\"window.imraidview\",b,JSON.stringify(d))}catch(e){a.showAlert(\"executeVideoPlayerActions: \"+e)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{l(),sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}};var f=null,g=!1,h=function(){if(!g&&e())try{f=window.imraid.broadcastEvent,\nwindow.imraid.broadcastEvent=function(b){try{if(1<arguments.length&&\"VideoPlayerPosition\"===arguments[0]&&window.mraidview){var c=arguments[1];c&&(\"undefined\"!==typeof c.x&&null!==c.x)&&(c.x=k(c.x,1/d));c&&(\"undefined\"!==typeof c.y&&null!==c.y)&&(c.y=k(c.y,1/d))}if(\"function\"===typeof f)return f.apply(this,arguments)}catch(e){a.showAlert(\"originalBroadcastEvent failed: \"+e)}},g=!0}catch(b){l(),a.showAlert(\"Registering listener failed: \"+b)}},l=function(){try{g&&(window.imraid.broadcastEvent=f,f=null,\ng=!1)}catch(b){a.showAlert(\"Unregistering listener failed: \"+b)}},n=function(){try{if(window.imraid&&!(\"function\"!==typeof window.imraid.addEventListener||\"function\"!==typeof window.imraid.broadcastEvent)&&!window.imraid.__videoErrorRelaysRegistered)window.imraid.addEventListener(\"VideoPlaybackError\",function(b){try{window.imraid.broadcastEvent(\"error\",{command:\"VideoPlayerError\",errorCode:b&&b.errorCode},\"VideoPlaybackError\")}catch(c){a.showAlert(\"VideoPlaybackError relay failed: \"+c)}}),window.imraid.addEventListener(\"VideoCommandError\",\nfunction(b){try{window.imraid.broadcastEvent(\"error\",{command:b&&b.jsCommand,errorMsg:b&&b.errorMessage},\"VideoCommandError\")}catch(c){a.showAlert(\"VideoCommandError relay failed: \"+c)}}),window.imraid.__videoErrorRelaysRegistered=!0}catch(b){a.showAlert(\"registerVideoErrorRelays failed: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,f){var g=arguments.length,h,l=null;if(3>g){if(\"function\"===typeof arguments[g-1])h=arguments[g-1];else return;l={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],l={reason:11,url:arguments[1]});\"function\"!==!h&&(l?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(l))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,f)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,e,g){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,e,g)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.openInlineInstaller=b.openInlineInstaller;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=\nb.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=\nb.showWebView;a.sendMessage=b.sendMessage;a.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}try{a.addEventListener(\"orientationChange\",\nfunction(a){\"function\"===typeof b.fireSafeAreaChangeEventOnOrientationChange&&b.fireSafeAreaChangeEventOnOrientationChange(a)})}catch(e){b&&\"function\"===typeof b.log&&b.log(\"orientationChange listener registration failed: \"+e)}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(a){try{\"number\"===typeof a&&Number.isFinite(a)&&1120<=getSdkVersionInt()?sdkController.fireAdFailed(\"window.imaiview\",a):sdkController.fireAdFailed(\"window.imaiview\")}catch(c){sdkController.fireAdFailed(\"window.imaiview\")}};\na.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(k){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(s){n=\nl=0}imIsObjValid(k)?imIsObjValid(d)?(m=k.url,q=k.fallbackUrl,p=k.urlType,f=d.url,g=d.pingWV,h=d.fr):(m=k.url,p=k.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"number\"!=typeof p||null==p)p=0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(f)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(t){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(f=d.url,g=d.pingWV,h=d.fr);try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=\n!0;if(0>g||1<g)g=!0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");b.onUserInteraction(k)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        if (interfaceC3880x92 != null) {
            String str3 = i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).a(str3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    @NotNull
    public final Vf getOrientationProperties() {
        return this.H0;
    }

    public final long getPlacementId() {
        return this.a0;
    }

    public byte getPlacementType() {
        return this.b;
    }

    @Nullable
    public final HtmlVideoPlaybackState getPlaybackState() {
        D8 d8 = this.Z0;
        if (d8 == null) {
            return null;
        }
        if (d8.g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (d8.q.get() == A8.INIT) {
            EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
            d8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return d8.k.a();
    }

    @Nullable
    public C getReferenceContainer() {
        return this.l0;
    }

    @Nullable
    public final Hi getRenderViewTelemetry() {
        return this.e0;
    }

    @NotNull
    public final JSONArray getRenderableAdIndexes() {
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        return interfaceC3871x0 != null ? ((AbstractC3587m1) interfaceC3871x0).w() : new JSONArray();
    }

    @NotNull
    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    @NotNull
    public final Yi getRoute() {
        return this.j;
    }

    @Nullable
    public final JSONObject getSafeArea() {
        Wo wo = this.O0;
        if (wo != null) {
            Integer f = R5.f();
            Vo vo = (f == null && (f = R5.g) == null) ? null : (Vo) wo.d.get(f);
            if (vo != null) {
                return vo.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.N0;
    }

    public final long getShowTimeStamp() {
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        if (interfaceC3871x0 != null) {
            return ((AbstractC3587m1) interfaceC3871x0).x();
        }
        return 0L;
    }

    @NotNull
    public final C3760sj getSiblingWebviewManager() {
        return (C3760sj) this.t.getValue();
    }

    @Nullable
    public Map<String, C3742s1> getTelemetryManagerMap() {
        return this.Q0;
    }

    @NotNull
    public Fk getTelemetryOnAdImpression() {
        Map<String, C3742s1> telemetryManagerMap = getTelemetryManagerMap();
        return new Fk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.G0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.P0;
    }

    @NotNull
    public final InterfaceC3584lo getVISIBILITY_CHANGE_LISTENER() {
        return this.W0;
    }

    @Nullable
    public View getVideoContainerView() {
        return null;
    }

    @NotNull
    public final String getViewState() {
        return this.A;
    }

    @Override // com.inmobi.media.Eh
    public long getViewTouchTimestamp() {
        return this.g;
    }

    @NotNull
    public AbstractC3429fo getViewableAd() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "viewableAd getter "));
        }
        if (this.o0 == null) {
            this.o0 = new N9(this, new C3455go(this), new C3904y7(this.r, this.G0, this.x0, this.y0, getVisibilityTrackingMinPercentage(), this.i), this.i);
            Set<Vk> set = this.c;
            if (set != null) {
                for (Vk vk : set) {
                    try {
                        if (vk.a == 3) {
                            setOmidViewableAd(vk);
                        }
                        Unit unit = Unit.a;
                    } catch (Exception e) {
                        InterfaceC3880x9 interfaceC3880x92 = this.i;
                        if (interfaceC3880x92 != null) {
                            String str2 = i1;
                            str2.getClass();
                            ((C3906y9) interfaceC3880x92).b(str2, dmi.q("Exception occurred while creating the HTML viewable ad : ", e.getMessage()));
                            Unit unit2 = Unit.a;
                        }
                    }
                }
            }
        }
        AbstractC3429fo abstractC3429fo = this.o0;
        abstractC3429fo.getClass();
        return abstractC3429fo;
    }

    @Nullable
    public final int[] getViewableFrameArray() {
        return this.s0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return "audio".equals(getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    @NotNull
    public final Jo getWebViewFactory() {
        return this.k;
    }

    @NotNull
    public final To getWindowInsetListener() {
        return this.S0;
    }

    @NotNull
    public final Fj getWvStateMachine() {
        return this.s;
    }

    public final void h(String str) {
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).c(str2, "injectJavaScript " + this + " - " + str);
        }
        ExecutorC3520jc executorC3520jc = (ExecutorC3520jc) AbstractC3851w6.e.getValue();
        wem wemVar = new wem(20, this, str);
        executorC3520jc.getClass();
        executorC3520jc.a.postAtFrontOfQueue(wemVar);
    }

    public final void i(String str) {
        str.getClass();
        Hi hi = this.e0;
        if (hi != null) {
            hi.b();
        }
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "loadDataInWebView "));
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadDataWithBaseURL("", str, "text/html", com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME, null);
    }

    public final void j() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "deferredDestroy "));
        }
        super.destroy();
    }

    public final void k() {
        if (this.N.get()) {
            return;
        }
        if (!this.I) {
            this.I = true;
            return;
        }
        g();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.d0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.d0 = null;
        }
        this.N.set(true);
        this.k.a(this.j.b);
        Wo wo = this.O0;
        if (wo != null) {
            wo.a();
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.b();
        }
        this.Q = true;
        this.U = -1;
        D8 d8 = this.Z0;
        if (d8 != null) {
            InterfaceC3880x9 interfaceC3880x9 = d8.c;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("HybridVideoPlayerHandler", "destroy");
            }
            d8.a();
            Mf mf = d8.p;
            if (mf != null) {
                InterfaceC3880x9 interfaceC3880x92 = mf.g;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).c("Mf", "stopOmidSession");
                }
                Oe oe = mf.e;
                if (oe != null) {
                    AdSession adSession = oe.c;
                    InterfaceC3880x9 interfaceC3880x93 = oe.b;
                    if (adSession != null) {
                        if (interfaceC3880x93 != null) {
                            ((C3906y9) interfaceC3880x93).a(AbstractC3406f1.f, "stopAdSession");
                        }
                        AdSession adSession2 = oe.c;
                        if (adSession2 != null) {
                            adSession2.finish();
                        }
                        oe.c = null;
                    } else if (interfaceC3880x93 != null) {
                        ((C3906y9) interfaceC3880x93).a(AbstractC3406f1.f, "Failed to stopAdSession. adSession is null");
                    }
                }
            }
            d8.p = null;
            N3.a(d8.d);
        }
        this.Z0 = null;
        removeJavascriptInterface("sdkController");
        Jc jc = this.B;
        if (jc != null) {
            C3624nc c3624nc = jc.d;
            if (c3624nc != null) {
                c3624nc.a();
            }
            jc.d = null;
            C3624nc c3624nc2 = jc.e;
            if (c3624nc2 != null) {
                c3624nc2.a();
            }
            jc.e = null;
            C3624nc c3624nc3 = jc.f;
            if (c3624nc3 != null) {
                c3624nc3.a();
            }
            jc.f = null;
        }
        this.u.clear();
        this.v.clear();
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC3429fo abstractC3429fo = this.o0;
        if (abstractC3429fo != null) {
            abstractC3429fo.d();
        }
        AbstractC3429fo abstractC3429fo2 = this.o0;
        if (abstractC3429fo2 != null) {
            abstractC3429fo2.a();
        }
        C3809ug c3809ug = this.g0;
        if (c3809ug != null) {
            N8 n8 = C3550kg.b;
            if (n8 != null) {
                String str = c3809ug.c;
                str.getClass();
                n8.b.remove(str);
                Iterator it = n8.b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3876x5 c3876x5 = C3550kg.c;
            if (c3876x5 != null) {
                String str2 = c3809ug.c;
                str2.getClass();
                c3876x5.b.remove(str2);
                Iterator it2 = c3876x5.b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c3809ug.d.set(true);
        }
        this.g0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.F0 = null;
        this.x = null;
        this.l0 = null;
        this.n0 = null;
        this.C0 = false;
        this.c1 = null;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            xw3.L(L9.f, null, null, new C3526ji(viewGroup, this, null), 3);
        }
    }

    public final void l() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "disableHardwareAcceleration called. "));
        }
        try {
            setLayerType(1, null);
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    public final void m() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "dismissCurrentIntAdViewContainerInShowNextPodFlow "));
        }
        Jc jc = this.B;
        if (jc != null) {
            C3805uc c3805uc = jc.c;
            if (c3805uc != null) {
                c3805uc.b();
            }
            jc.c = null;
        }
        if ("Default".equals(this.A)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.k.b(new a0n(9));
            }
            InMobiAdActivity.t.remove(hashCode());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r5.equals("html5video") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0118, code lost:
    
        if (r4.C == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011c, code lost:
    
        if (r4.R == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        r4 = r4.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0121, code lost:
    
        if (r4 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        r5 = com.inmobi.media.GestureDetectorOnGestureListenerC3889xi.i1;
        r5.getClass();
        ((com.inmobi.media.C3906y9) r4).c(r5, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        if (r5.equals("inlineVideo") == false) goto L80;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0145 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).c(str2, "supports " + this + " " + str);
        }
        boolean z = false;
        if (str != null) {
            switch (str.hashCode()) {
                case -1886160473:
                    if (str.equals("playVideo")) {
                        return true;
                    }
                    break;
                case -1647691422:
                    break;
                case -988153970:
                    if (str.equals("pingV2")) {
                        AdConfig.PingsV2Config pingV2 = getAdConfig().getPingV2();
                        InterfaceC3880x9 interfaceC3880x92 = this.i;
                        if (interfaceC3880x92 != null) {
                            String str3 = i1;
                            str3.getClass();
                            ((C3906y9) interfaceC3880x92).a(str3, com.appsflyer.internal.i.j("supports(pingV2) ", pingV2.getEnabled()));
                        }
                        return pingV2.getEnabled();
                    }
                    break;
                case -315615134:
                    str.equals("streaming");
                    break;
                case -168584769:
                    if (str.equals("edge-to-edge")) {
                        if (getPlacementType() != 1) {
                            InterfaceC3880x9 interfaceC3880x93 = this.i;
                            if (interfaceC3880x93 != null) {
                                String str4 = i1;
                                str4.getClass();
                                ((C3906y9) interfaceC3880x93).b(str4, "EDGE_TO_EDGE is only supported for fullscreen ads. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        if (!this.X0) {
                            Context context = getContext();
                            context.getClass();
                            return N3.a(context);
                        }
                        InterfaceC3880x9 interfaceC3880x94 = this.i;
                        if (interfaceC3880x94 != null) {
                            String str5 = i1;
                            str5.getClass();
                            ((C3906y9) interfaceC3880x94).b(str5, "Ad is in Immersive mode. supports(edge-to-edge) = false");
                        }
                        return false;
                    }
                    break;
                case 886211909:
                    if (str.equals("openInlineInstaller")) {
                        return true;
                    }
                    break;
                case 1137617595:
                    if (str.equals(U3.i.v)) {
                        return this.X0;
                    }
                    break;
                case 1509574865:
                    break;
                case 1511497695:
                    if (str.equals("hybridVideo") && getAdConfig().getHybridNative().getIsEnabled()) {
                        String maxSupportedPlayerVersion = getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
                        Hi hi = this.e0;
                        try {
                            AbstractC3738rn.a(maxSupportedPlayerVersion);
                            return true;
                        } catch (Ig e) {
                            if (hi != null) {
                                hi.a(e.a);
                            }
                        }
                    }
                    return false;
                case 1642189884:
                    if (!str.equals("saveContent")) {
                    }
                    break;
                case 1772979069:
                    str.equals("redirectFraudDetection");
                    break;
            }
        }
        return false;
    }

    public final void o() {
        Activity fullScreenActivity;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "finishFullScreenActivity "));
        }
        InMobiAdActivity.t.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if ("Default".equals(this.A)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        if (interfaceC3871x0 == null || !interfaceC3871x0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            fullScreenActivity2.getClass();
            ((InMobiAdActivity) fullScreenActivity2).e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.U == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.U);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Xh xh;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onAttachedToWindow "));
        }
        super.onAttachedToWindow();
        if (!this.e) {
            if (Intrinsics.c(this.j.b, BuildConfig.FLAVOR)) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        Jc jc = this.B;
        if (jc != null) {
            C3624nc c3624nc = jc.d;
            if (c3624nc != null) {
                c3624nc.b();
            }
            C3624nc c3624nc2 = jc.e;
            if (c3624nc2 != null) {
                c3624nc2.b();
            }
            C3624nc c3624nc3 = jc.f;
            if (c3624nc3 != null) {
                c3624nc3.b();
            }
        }
        O();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3880x9 interfaceC3880x93 = this.i;
        if (interfaceC3880x93 == null || (xh = ((C3906y9) interfaceC3880x93).a) == null) {
            return;
        }
        xh.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onDetachedFromWindow "));
        }
        C3334c6 c3334c6 = this.E0;
        if (c3334c6 != null) {
            C3334c6.a(c3334c6, 8, true, null, 12);
            C3683pj c3683pj = c3334c6.m;
            if (!c3683pj.f && c3683pj.a > 0) {
                c3683pj.f = true;
                c3683pj.g = EnumC3631nj.DONE;
                c3683pj.a();
            }
            s9a.o(c3683pj.d, null);
        }
        Jc jc = this.B;
        if (jc != null) {
            C3624nc c3624nc = jc.d;
            if (c3624nc != null) {
                c3624nc.a();
            }
            C3624nc c3624nc2 = jc.e;
            if (c3624nc2 != null) {
                c3624nc2.a();
            }
            C3624nc c3624nc3 = jc.f;
            if (c3624nc3 != null) {
                c3624nc3.a();
            }
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "Detached from window");
        }
        M0 m0 = this.I0;
        if (m0 == null) {
            Intrinsics.i("adQualityManager");
            throw null;
        }
        if (m0.d.get()) {
            m0.a("session end is already triggered");
        } else if (!m0.a.getEnabled()) {
            m0.a("config kill switch - false. ad quality will skip");
        } else if (m0.g == null) {
            m0.a("setup not done. ignore trigger");
        } else {
            m0.d.set(true);
            m0.a(false);
        }
        if (this.J0.get()) {
            xw3.L(L9.c, null, null, new C3733ri(this, null), 3);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x93).b(str3, lnb.o("Detaching WebView from window encountered an error ( ", e.getMessage(), " )"));
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.n) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).c(str2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.i;
        if (interfaceC3880x93 != null) {
            String str3 = i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x93).a(str3, "onDoubleTapEvent detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (motionEvent.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(N3.c(motionEvent.getX()));
                jSONArray.put(N3.c(motionEvent.getY()));
            } catch (JSONException e) {
                InterfaceC3880x9 interfaceC3880x94 = this.i;
                if (interfaceC3880x94 != null) {
                    String str4 = i1;
                    str4.getClass();
                    ((C3906y9) interfaceC3880x94).a(str4, "Exception in onDoubleTap", e);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            h("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        if (!this.n) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).c(str2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent2.getX())), Integer.valueOf(N3.c(motionEvent2.getY())))));
            jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Float.valueOf(f), Float.valueOf(f2))));
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x93).a(str3, "Exception in onFling", e);
            }
        }
        h("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.n) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).c(str2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.i;
        if (interfaceC3880x93 != null) {
            String str3 = i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x93).a(str3, "onLongPress detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(motionEvent.getX()));
            jSONArray.put(N3.c(motionEvent.getY()));
        } catch (JSONException e) {
            InterfaceC3880x9 interfaceC3880x94 = this.i;
            if (interfaceC3880x94 != null) {
                String str4 = i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x94).a(str4, "Exception in onLongPress", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        if (this.e && !this.W) {
            this.W = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            g1.getClass();
            JSONObject a = C3372di.a("IN_CUSTOM_BROWSER", "onScroll");
            a.getClass();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC3889xi != null) {
                gestureDetectorOnGestureListenerC3889xi.c(a);
            }
            return false;
        }
        boolean z = this.n;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (!z) {
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "onScroll detected \n " + motionEvent + " \n " + motionEvent2);
        }
        if (!this.e) {
            Kk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - scrollThrottler.b < scrollThrottler.a) {
                scrollThrottler.b = elapsedRealtime;
            } else {
                scrollThrottler.b = elapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent.getX())), Integer.valueOf(N3.c(motionEvent.getY())))));
                        jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c(motionEvent2.getX())), Integer.valueOf(N3.c(motionEvent2.getY())))));
                    } catch (Exception e) {
                        InterfaceC3880x9 interfaceC3880x92 = this.i;
                        if (interfaceC3880x92 != null) {
                            String str3 = i1;
                            str3.getClass();
                            ((C3906y9) interfaceC3880x92).a(str3, "Exception in onScroll", e);
                        }
                    }
                    h("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        motionEvent.getClass();
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!this.n) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).c(str2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.i;
        if (interfaceC3880x93 != null) {
            String str3 = i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x93).a(str3, "onSingleTapConfirmed detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(motionEvent.getX()));
            jSONArray.put(N3.c(motionEvent.getY()));
        } catch (JSONException e) {
            InterfaceC3880x9 interfaceC3880x94 = this.i;
            if (interfaceC3880x94 != null) {
                String str4 = i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x94).a(str4, "Exception in onSingleTapConfirmed", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "onSingleTapUp detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "onSizeChanged "));
        }
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "onSizeChanged (" + i + ", " + i2 + ")");
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        a(N3.b(i / R5.b()), N3.b(i2 / R5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!Float.isNaN(motionEvent.getX()) && !Float.isNaN(motionEvent.getY())) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onTouchEvent "));
            }
            if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
                a(motionEvent);
            }
            setViewTouchTimestamp(SystemClock.elapsedRealtime());
            return super.onTouchEvent(motionEvent);
        }
        if (!this.K0) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).b(str2, "onTouchEvent Invalid Coordinates " + motionEvent);
            }
            this.K0 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "onWindowFocusChanged " + this + " - " + z);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (isShown()) {
                C3826v7 c3826v7 = C3904y7.k;
                if (c3826v7.b(this, this, this.y0) && c3826v7.a(this, this, this.y0)) {
                    z = true;
                }
            }
            z = false;
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).c(str, "onWindowVisibilityChanged " + this + " " + i);
        }
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        boolean z2 = i == 0;
        if (z2) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C3826v7 c3826v7 = C3904y7.k;
                if (c3826v7.b(this, this, visibilityTrackingMinPercentage) && c3826v7.a(this, this, visibilityTrackingMinPercentage)) {
                    z = true;
                }
            }
        } else {
            z = z2;
        }
        d(z);
    }

    public final void p() {
        AdQualityControl adQualityControl;
        Activity activity;
        AdQualityControl adQualityControl2;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, dmi.l(Build.VERSION.SDK_INT, "fireAQSession - ", getAdType(), " type - sdk - "));
        }
        if (!Intrinsics.c(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.u.get()) == null) {
            M0 m0 = this.I0;
            if (m0 == null) {
                Intrinsics.i("adQualityManager");
                throw null;
            }
            if (!m0.a()) {
                m0.a("session state invalid");
                return;
            }
            m0.a("session start trigger...");
            m0.c.set(true);
            AdQualityControl adQualityControl3 = m0.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = m0.g) == null) {
                return;
            }
            m0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000.0f), false, (C3475hi) null);
            return;
        }
        M0 m02 = this.I0;
        if (m02 == null) {
            Intrinsics.i("adQualityManager");
            throw null;
        }
        if (!m02.a()) {
            m02.a("session state invalid");
            return;
        }
        m02.a("session start trigger...");
        m02.c.set(true);
        AdQualityControl adQualityControl4 = m02.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = m02.g) == null) {
            return;
        }
        m02.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000.0f), false, (C3475hi) null);
    }

    public final void q() {
        if (this.N.get()) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).b(str, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).a(str2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            ku3 ku3Var = Hl.a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            a.put(Payload.LATENCY, Long.valueOf(elapsedRealtime));
            hi.h = elapsedRealtime;
            String a2 = hi.a("FireAdReady");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        InterfaceC3880x9 interfaceC3880x93 = this.i;
        if (interfaceC3880x93 != null) {
            String str3 = i1;
            ((C3906y9) interfaceC3880x93).a(str3, w1l.f(this, str3, "fireAdReady "));
        }
        this.C0 = true;
        if (this.r == 0) {
            u();
        }
        xw3.L(L9.c, null, null, new C3811ui(this, null), 3);
        getListener().h(this);
    }

    public final void r() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "fireBackButtonPressedEvent "));
        }
        String str2 = this.M;
        if (str2 != null) {
            a(str2, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "fireClickTrackers "));
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.f();
        }
        v();
        getListener().b(this);
    }

    public final void setAdPodHandler(@Nullable InterfaceC3871x0 interfaceC3871x0) {
        this.n0 = interfaceC3871x0;
    }

    public void setAdType(@Nullable String str) {
        this.i0 = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.m0 = z;
    }

    public final void setAndUpdateViewState(@NotNull String str) {
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).c(str2, w1l.f(this, str2, "setAndUpdateViewState "));
        }
        this.A = str;
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str3 = i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x92).a(str3, dmi.q("set state:", this.A));
        }
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        f(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z) {
        this.L = z;
    }

    public final void setBannerHolderActivity(@NotNull WeakReference<Activity> weakReference) {
        weakReference.getClass();
        this.v = weakReference;
    }

    public final void setBeaconUrl(@Nullable String str) {
        this.M0 = str;
    }

    public final void setBlobProvider(@Nullable J2 j2) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setBlobProvider "));
        }
        this.k0 = j2;
    }

    public final void setCloseAssetArea(@NotNull Uo uo) {
        uo.getClass();
        if (!this.X0) {
            Context context = getContext();
            context.getClass();
            if (!N3.a(context)) {
                return;
            }
        }
        this.f1 = new Uo(0, uo.b, uo.c, 0);
    }

    public final void setConfiguredArea(long j) {
        this.t0 = getWidth() * getHeight();
    }

    public final void setContentURL(@Nullable String str) {
        this.r0 = str;
    }

    public final void setContextualDataHandler(@Nullable L4 l4) {
        this.Y0 = l4;
    }

    public void setCreativeId(@Nullable String str) {
        this.b0 = str;
    }

    public final void setDisableBackButton(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setDisableBackButton "));
        }
        this.L = z;
    }

    public final void setEmbeddedBrowserJsCallbacks(@Nullable InterfaceC3282a6 interfaceC3282a6) {
        this.F0 = interfaceC3282a6;
    }

    public final void setEnableNativeGestures(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "enableNativeGestures " + this + " " + z);
        }
        boolean z2 = this.n;
        this.n = z;
        if (z && !z2) {
            if (this.z0 == null) {
                this.z0 = new Bc(this);
            }
        } else {
            if (z || !z2) {
                return;
            }
            this.z0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "setEnableTouchBeginCallback " + this + " " + z);
        }
        this.p = z;
    }

    public final void setEnableTouchEndCallback(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "setEnableTouchEndCallback " + this + " " + z);
        }
        this.o = z;
    }

    public void setExitAnimation(int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setExitAnimation "));
        }
        this.U = i;
    }

    public final void setExposureTracker(@Nullable U u) {
        this.L0 = u;
    }

    public void setFriendlyViews(@Nullable Map<View, FriendlyObstructionPurpose> map) {
        this.j0 = map;
    }

    public void setFullScreenActivityContext(@Nullable Activity activity) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setFullScreenActivityContext "));
        }
        this.u = new WeakReference(activity);
        Y();
        if (this.e || activity == null) {
            return;
        }
        Wo wo = this.O0;
        if (wo != null) {
            wo.a();
        }
        this.O0 = new Wo(activity, this.S0, this.i);
    }

    public final void setImmersiveMode(boolean z) {
        this.X0 = z;
    }

    public void setImpressionId(@Nullable String str) {
        this.d = str;
    }

    public final void setInAppActivityBrowserClientListener(@Nullable S8 s8) {
        this.c1 = s8;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(@Nullable C3571lb c3571lb) {
        C3334c6 c3334c6 = this.E0;
        if (c3334c6 != null) {
            c3334c6.k = c3571lb;
            c3334c6.l = new C3519jb(c3571lb, c3334c6);
        }
    }

    public final void setLandingScheme(@NotNull String str) {
        str.getClass();
        this.f = str;
    }

    public final void setMCreativeType(@Nullable String str) {
        this.G0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i) {
        this.y0 = i;
    }

    public final void setMImpressionMinTimeViewed(int i) {
        this.x0 = i;
    }

    public final void setMViewableAd(@Nullable AbstractC3429fo abstractC3429fo) {
        this.o0 = abstractC3429fo;
    }

    public final void setMarkupTypeAdUnit(@NotNull String str) {
        str.getClass();
        this.T0 = str;
    }

    public final void setOrientationProperties(@NotNull Vf vf) {
        vf.getClass();
        this.H0 = vf;
    }

    public final void setPingAckListener(@NotNull InterfaceC3731rg interfaceC3731rg) {
        interfaceC3731rg.getClass();
        this.q = interfaceC3731rg;
    }

    public final void setPingManager(@NotNull C3809ug c3809ug) {
        c3809ug.getClass();
        this.g0 = c3809ug;
    }

    public final void setPlacementId(long j) {
        this.a0 = j;
    }

    public void setReferenceContainer(@Nullable C c) {
        this.l0 = c;
    }

    public final void setRenderViewEventListener(@Nullable AbstractC3941zi abstractC3941zi) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setRenderViewEventListener "));
        }
        this.x = abstractC3941zi;
    }

    public final void setRenderViewTelemetry(@Nullable Hi hi) {
        this.e0 = hi;
    }

    public final void setScrollable(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "setScrollable "));
        }
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setShouldFireLandingPageBeacons(boolean z) {
        this.N0 = z;
    }

    public void setTelemetryManagerMap(@Nullable Map<String, C3742s1> map) {
        this.Q0 = map;
    }

    public final void setUnloaded(boolean z) {
        this.P0 = z;
    }

    public final void setUseCustomClose(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "setUseCustomClose " + this + " " + z);
        }
        this.H = z;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(@NotNull WatermarkData watermarkData) {
        watermarkData.getClass();
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        byte[] decode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        decode.getClass();
        if (!this.c0.get()) {
            this.c0.set(true);
            this.d0 = new hr2(this, decode, watermarkData, 1);
            getViewTreeObserver().addOnGlobalLayoutListener(this.d0);
        } else {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).c(str2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "stopLoading "));
        }
        if (this.N.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "fireEvent " + this + " 2");
        }
    }

    public void u() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "fireImpression "));
        }
        if ("video".equals(this.G0) || "audio".equals(this.G0)) {
            return;
        }
        F();
        h("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "fireOnUserInteraction "));
        }
        h("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "firePopupBlockedEvent "));
        }
        h("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void x() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.b();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (Intrinsics.c(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.c(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public final void j(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "loadScript "));
        }
        loadUrl(str);
    }

    public final void setPreloadView(boolean z) {
    }

    public final void l(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "registerBackButtonPressedEventListener "));
        }
        this.M = str;
    }

    public final void i() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "completeFromInterActive "));
        }
        L4 l4 = this.Y0;
        if (l4 != null) {
            l4.g();
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, "completeFromInterActive");
        }
    }

    public static final Unit f() {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.D();
        }
        return Unit.a;
    }

    public final void f(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "processUseCustomCloseRequest " + this + " " + z);
        }
        setUseCustomClose(z);
        U();
    }

    public final void h() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "closeAll "));
        }
        InterfaceC3871x0 interfaceC3871x0 = this.n0;
        if (interfaceC3871x0 != null) {
            interfaceC3871x0.b();
        }
        x();
    }

    public static final short m(String str) {
        str.getClass();
        return Short.parseShort(str);
    }

    public static final C3760sj c(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        return new C3760sj(gestureDetectorOnGestureListenerC3889xi.k, gestureDetectorOnGestureListenerC3889xi.i);
    }

    public final void c(String str, String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str3 = i1;
            str3.getClass();
            StringBuilder sb = new StringBuilder("sendTelemetryForAutoRedirectFraud ");
            sb.append(this);
            sb.append(" ");
            sb.append(str);
            ((C3906y9) interfaceC3880x9).c(str3, mz1.o(sb, " ", str2));
        }
        HashMap hashMap = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            hashMap.put("creativeId", creativeId);
        }
        hashMap.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        hashMap.put("adType", str2);
        a("BlockAutoRedirection", hashMap);
    }

    public final void c(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "fireViewableChange " + this + " " + z);
        }
        h("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    public static final Unit c(Fi fi) {
        fi.getClass();
        fi.n();
        return Unit.a;
    }

    public final void c(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).c(str2, w1l.f(this, str2, "evaluateScript "));
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.Eh
    public final boolean c() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void c(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str4 = i1;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "retrievedBlob");
        }
        a(str, dmi.r(str2, "(", str3, ");"));
    }

    public final void c(JSONObject jSONObject) {
        jSONObject.getClass();
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onLpLifeCycleEvent "));
            }
            h("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jSONObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).c(str2, w1l.f(this, str2, "fireShowWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC3889xi.h("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    public final void g() {
        i1.getClass();
        toString();
        yda ydaVar = this.z;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        this.z = null;
    }

    public final void e(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "fireDetectAutoRedirectFraud " + this + " " + str);
        }
        h("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void e(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "processDisableCloseRegionRequest " + this + " " + z);
        }
        this.K = z;
        U();
    }

    public final void d(boolean z) {
        EnumC3481ho enumC3481ho = z ? EnumC3481ho.VISIBLE : EnumC3481ho.HIDDEN;
        if (this.J != enumC3481ho) {
            if (!this.Q) {
                this.J = enumC3481ho;
                if (z) {
                    getListener().i(this);
                }
                c(z);
                M0 m0 = this.I0;
                if (m0 != null) {
                    EnumC3481ho enumC3481ho2 = this.J;
                    enumC3481ho2.getClass();
                    m0.h = enumC3481ho2;
                }
                p();
            }
            D8 d8 = this.Z0;
            if (d8 == null || d8.g.get() || !D8.a(d8, new A8[]{A8.LOADED, A8.PLAYING, A8.PAUSED}, null, null, null, 14) || d8.l == z) {
                return;
            }
            d8.l = z;
            AtomicBoolean atomicBoolean = d8.g;
            if (z) {
                if (atomicBoolean.get()) {
                    return;
                }
                V7 v7 = d8.k;
                if (v7.t == Jg.STATE_PAUSED) {
                    v7.e();
                    V7 v72 = d8.k;
                    Jg jg = Jg.STATE_PLAYING;
                    v72.getClass();
                    jg.getClass();
                    v72.t = jg;
                    return;
                }
                return;
            }
            if (!atomicBoolean.get() && ((g51) d8.k.p).isPlaying()) {
                d8.k.f();
                V7 v73 = d8.k;
                Jg jg2 = Jg.STATE_PAUSED;
                v73.getClass();
                jg2.getClass();
                v73.t = jg2;
            }
        }
    }

    public final void d(JSONObject jSONObject) {
        short s;
        Object a = P3.a(new o40(jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE), 4));
        p2g p2gVar = w2g.b;
        if (a instanceof u2g) {
            return;
        }
        short shortValue = ((Number) a).shortValue();
        Hi hi = this.e0;
        if (hi != null) {
            Map a2 = hi.a();
            switch (shortValue) {
                case 101:
                    s = 2261;
                    break;
                case 102:
                    s = 2262;
                    break;
                case 103:
                    s = 2263;
                    break;
                case 104:
                    s = 2267;
                    break;
                case 105:
                    s = 2266;
                    break;
                case 106:
                    s = 2265;
                    break;
                case 107:
                    s = 2264;
                    break;
                default:
                    switch (shortValue) {
                        case MRAID_ERROR_VALUE:
                            s = 2268;
                            break;
                        case INVALID_IFA_STATUS_VALUE:
                            s = 2269;
                            break;
                        case 303:
                            s = 2270;
                            break;
                        case AD_EXPIRED_VALUE:
                            s = 2271;
                            break;
                        case MRAID_BRIDGE_ERROR_VALUE:
                            s = 2272;
                            break;
                        case 306:
                            s = 2273;
                            break;
                        case AD_EXPIRED_ON_PLAY_VALUE:
                            s = 2274;
                            break;
                        case AD_WIN_NOTIFICATION_ERROR_VALUE:
                            s = 2275;
                            break;
                        case ASSET_FAILED_TO_DELETE_VALUE:
                            s = 2276;
                            break;
                        case AD_HTML_FAILED_TO_LOAD_VALUE:
                            s = 2277;
                            break;
                        case MRAID_JS_CALL_EMPTY_VALUE:
                            s = 2278;
                            break;
                        case DEEPLINK_OPEN_FAILED_VALUE:
                            s = 2280;
                            break;
                        case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                            s = 2281;
                            break;
                        default:
                            s = shortValue;
                            break;
                    }
            }
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            long j = hi.c;
            ku3 ku3Var = Hl.a;
            a2.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("CompanionWebViewLoadFailed", a2, EnumC3943zk.SDK);
        }
    }

    public static final void d(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        try {
            if (gestureDetectorOnGestureListenerC3889xi.N.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
            if (interfaceC3880x9 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).a(str3, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC3889xi.c(str2);
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x92 = gestureDetectorOnGestureListenerC3889xi.i;
            if (interfaceC3880x92 != null) {
                String str4 = i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, dmi.q("SDK encountered an unexpected error injecting JavaScript in the Ad container; ", e.getMessage()));
            }
        }
    }

    public final void d(String str) {
        str.getClass();
        if (this.P0) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str2 = i1;
                str2.getClass();
                ((C3906y9) interfaceC3880x9).a(str2, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.D0 = true;
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            long j = hi.c;
            ku3 ku3Var = Hl.a;
            a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a2 = hi.a("FireAdFailed");
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b(a2, a, EnumC3943zk.SDK);
        }
        getListener().a(this, str);
    }

    public static String d(int i) {
        return ljg.j(i, "SDK_");
    }

    public final void b(float f, float f2) {
        boolean z = this.o;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (!z) {
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(f));
            jSONArray.put(N3.c(f2));
        } catch (JSONException e) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).a(str3, "Exception in onTouchEnd", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    public static final Kk b(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        return new Kk(gestureDetectorOnGestureListenerC3889xi.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public void b() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "destroyContainer "));
        }
        k();
        this.k.b(new a0n(8));
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.p0 && omidConfig.isOmidEnabled()) {
            Rf.a.getClass();
            if (Omid.isActive()) {
                new Ci(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void b(Tf tf) {
        tf.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "handle orientationChange " + this + " " + tf);
        }
        a(Uf.a(tf));
    }

    public final void b(String str, String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str3 = i1;
            ((C3906y9) interfaceC3880x9).a(str3, w1l.f(this, str3, "processMediaPlaybackRequest "));
        }
        if (this.P0) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str4 = i1;
                str4.getClass();
                ((C3906y9) interfaceC3880x92).b(str4, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.b) {
            InterfaceC3880x9 interfaceC3880x93 = this.i;
            if (interfaceC3880x93 != null) {
                String str5 = i1;
                str5.getClass();
                ((C3906y9) interfaceC3880x93).b(str5, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null) {
            InterfaceC3880x9 interfaceC3880x94 = this.i;
            if (interfaceC3880x94 != null) {
                String str6 = i1;
                str6.getClass();
                ((C3906y9) interfaceC3880x94).b(str6, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        Jc jc = this.B;
        if (jc != null) {
            jc.a(activity, str2);
        }
    }

    public void n() {
        InterfaceC3871x0 interfaceC3871x0;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "dismissCurrentViewContainer "));
        }
        Jc jc = this.B;
        if (jc != null) {
            C3805uc c3805uc = jc.c;
            if (c3805uc != null) {
                c3805uc.b();
            }
            jc.c = null;
        }
        if ("Default".equals(this.A)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z = parent instanceof ViewGroup;
            if (z) {
                this.k.b(new a0n(10));
            }
            if (1 == this.b) {
                o();
            } else if (z) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.J != EnumC3481ho.VISIBLE || (interfaceC3871x0 = this.n0) == null) {
            return;
        }
        interfaceC3871x0.a(this, getFullScreenActivity());
    }

    public static final Unit b(Fi fi) {
        fi.getClass();
        fi.n();
        return Unit.a;
    }

    public final void b(int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "loadPodAd "));
        }
        if (this.J == EnumC3481ho.VISIBLE && this.n0 != null && !this.N.get()) {
            InterfaceC3871x0 interfaceC3871x0 = this.n0;
            if (interfaceC3871x0 != null) {
                interfaceC3871x0.a(i, this);
                return;
            }
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).b(str2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void b(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "fireNextAdShowComplete "));
        }
        String l = bf3.l("window.imraidview.broadcastEvent('adShowSuccess',", ");", z);
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).a(str2, mz1.j(getCurrentRenderingPodAdIndex(), l, " Index: "));
        }
        h(l);
    }

    public final void b(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).c(str2, "creativeType " + this + " " + str);
        }
        this.G0 = str;
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str4 = i1;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.e);
        }
        h("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, bf3.k("broadcastEvent('", str, "Successful','", str3, "');"));
    }

    public final void b(JSONObject jSONObject) {
        jSONObject.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onCTLifeCycleEvent "));
        }
        h("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jSONObject + ");");
    }

    public final void b(String str, Map map) {
        str.getClass();
        map.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "fireLandingPageTracker "));
        }
        getListener().a(this, str, map);
    }

    public final void b(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).c(str2, w1l.f(this, str2, "fireLoadWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        Hi hi = this.e0;
        jSONObject.put(Payload.LATENCY, hi != null ? hi.h : 0L);
        gestureDetectorOnGestureListenerC3889xi.h("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void k(String str) {
        str.getClass();
        Hi hi = this.e0;
        if (hi != null) {
            hi.b();
        }
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "loadUrlInWebView "));
        }
        this.Q = false;
        if (this.N.get()) {
            return;
        }
        loadUrl(str);
    }

    public final void a(Bc bc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        bc.getClass();
        motionEvent.getClass();
        motionEvent2.getClass();
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, dii.c(" onScaleDetected\n " + motionEvent + " \n " + motionEvent2));
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray((Collection) kotlin.collections.b.j(Integer.valueOf(N3.c((motionEvent2.getX(1) + motionEvent2.getX()) / 2.0f)), Integer.valueOf(N3.c((motionEvent2.getY(1) + motionEvent2.getY()) / 2.0f)))));
            h("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).c(str2, "Pinch gesture is disabled from config");
        }
    }

    public /* synthetic */ GestureDetectorOnGestureListenerC3889xi(Context context, byte b, LinkedHashSet linkedHashSet, String str, String str2, long j, Bi bi, InterfaceC3880x9 interfaceC3880x9, Yi yi, Jo jo, C3638o0 c3638o0, AdConfig adConfig, int i) {
        this(context, b, (i & 4) != 0 ? null : linkedHashSet, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? "DEFAULT" : str2, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? null : bi, interfaceC3880x9, yi, jo, c3638o0, adConfig);
    }

    public final void a(float f, float f2) {
        boolean z = this.p;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (!z) {
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                ((C3906y9) interfaceC3880x9).c(str, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(N3.c(f));
            jSONArray.put(N3.c(f2));
        } catch (JSONException e) {
            InterfaceC3880x9 interfaceC3880x92 = this.i;
            if (interfaceC3880x92 != null) {
                String str3 = i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x92).a(str3, "Exception in onTouchBegin", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    public static final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).c(str, "adding overlay to renderview");
        }
        Context context = gestureDetectorOnGestureListenerC3889xi.getContext();
        context.getClass();
        FrameLayout a = AbstractC3947zo.a(context, bArr, watermarkData.getAlpha());
        a.getClass();
        if (gestureDetectorOnGestureListenerC3889xi.getParent() != null) {
            ViewParent parent = gestureDetectorOnGestureListenerC3889xi.getParent();
            parent.getClass();
            ((ViewGroup) parent).addView(a, 0);
        }
        gestureDetectorOnGestureListenerC3889xi.getViewableAd().a(a, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = gestureDetectorOnGestureListenerC3889xi.d0;
        if (onGlobalLayoutListener != null) {
            gestureDetectorOnGestureListenerC3889xi.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            gestureDetectorOnGestureListenerC3889xi.d0 = null;
        }
    }

    public final void a(String str, String str2, boolean z) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        Exception exc;
        Activity activity;
        str.getClass();
        str2.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                try {
                    String str3 = i1;
                    str3.getClass();
                    ((C3906y9) interfaceC3880x9).a(str3, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
                } catch (Exception e) {
                    exc = e;
                    gestureDetectorOnGestureListenerC3889xi = this;
                }
            }
            if (Intrinsics.c(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.u.get()) != null) {
                joa joaVar = F0.a;
                try {
                    F0.a(activity, this, str, z, jSONObject, this.R0);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    gestureDetectorOnGestureListenerC3889xi = this;
                }
            } else {
                gestureDetectorOnGestureListenerC3889xi = this;
                try {
                    joa joaVar2 = F0.a;
                    F0.a(gestureDetectorOnGestureListenerC3889xi, gestureDetectorOnGestureListenerC3889xi, str, z, jSONObject, gestureDetectorOnGestureListenerC3889xi.R0);
                    return;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            gestureDetectorOnGestureListenerC3889xi = this;
        }
        exc = e;
        InterfaceC3880x9 interfaceC3880x92 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x92 != null) {
            String str4 = i1;
            str4.getClass();
            ((C3906y9) interfaceC3880x92).a(str4, "issue wile reporting ad", exc);
        }
    }

    public final void a(MotionEvent motionEvent) {
        Bc bc;
        if (this.e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            g1.getClass();
            JSONObject a = C3372di.a("IN_CUSTOM_BROWSER", "onInteraction");
            a.getClass();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = InMobiAdActivity.u;
            if (gestureDetectorOnGestureListenerC3889xi != null) {
                gestureDetectorOnGestureListenerC3889xi.c(a);
            }
        }
        if (this.b == 1 && (bc = this.z0) != null) {
            bc.a(motionEvent);
        }
        this.A0.onTouchEvent(motionEvent);
    }

    public final void a(Bc bc) {
        bc.getClass();
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3880x9 interfaceC3880x9 = this.i;
            if (interfaceC3880x9 != null) {
                String str = i1;
                str.getClass();
                JSONArray jSONArray = bc.j;
                Integer valueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
                ((C3906y9) interfaceC3880x9).a(str, dii.c("onPanDetected\n " + valueOf + " \n " + bc.j));
            }
            h("window.imraidview.onGestureDetected('2', '" + bc.j + "');");
            return;
        }
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).c(str2, "Pan gesture is disabled from config");
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        Mf mf;
        relativeLayout.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        D8 d8 = this.Z0;
        if (d8 != null) {
            relativeLayout.getClass();
            if (d8.g.get()) {
                return;
            }
            InterfaceC3880x9 interfaceC3880x92 = d8.c;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (d8.i && (mf = d8.p) != null) {
                relativeLayout.getClass();
                InterfaceC3880x9 interfaceC3880x93 = mf.g;
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).c("Mf", "startOmidSession");
                }
                Oe oe = mf.e;
                if (oe != null) {
                    relativeLayout.getClass();
                    AdSession adSession = oe.c;
                    InterfaceC3880x9 interfaceC3880x94 = oe.b;
                    if (adSession != null) {
                        if (interfaceC3880x94 != null) {
                            ((C3906y9) interfaceC3880x94).a(AbstractC3406f1.f, "registerAdView");
                        }
                        X4.a(oe.a, new Z0(oe, relativeLayout, null));
                    } else if (interfaceC3880x94 != null) {
                        ((C3906y9) interfaceC3880x94).a(AbstractC3406f1.f, "Failed to registerAdView. adSession is null");
                    }
                }
                Oe oe2 = mf.e;
                if (oe2 != null) {
                    AdSession adSession2 = oe2.c;
                    InterfaceC3880x9 interfaceC3880x95 = oe2.b;
                    if (adSession2 != null) {
                        if (interfaceC3880x95 != null) {
                            ((C3906y9) interfaceC3880x95).a(AbstractC3406f1.f, "startAdSession");
                        }
                        X4.a(oe2.a, new C3329c1(oe2, null));
                    } else if (interfaceC3880x95 != null) {
                        ((C3906y9) interfaceC3880x95).a(AbstractC3406f1.f, "Failed to startAdSession. adSession is null");
                    }
                }
            }
            d8.k.a(relativeLayout);
            d8.k.e();
            d8.o = true;
        }
    }

    public final void a(EnumC3879x8 enumC3879x8, Object obj) {
        if (obj instanceof String) {
            obj = lnb.m(obj, "'", "'");
        }
        String str = "window.imraid.broadcastEvent('" + enumC3879x8.a + "', " + obj + ");";
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).b(str2, "fireHtmlVideoEvents: ".concat(str));
        }
        h(str);
    }

    public final void a(HashMap hashMap) {
        Mf mf;
        Oe oe;
        hashMap.getClass();
        getListener().a(hashMap);
        D8 d8 = this.Z0;
        if (d8 == null || (mf = d8.p) == null || (oe = mf.e) == null) {
            return;
        }
        oe.a(InteractionType.CLICK);
    }

    public static final Unit a(JSONObject jSONObject) {
        jSONObject.getClass();
        SparseArray sparseArray = InMobiAdActivity.t;
        jSONObject.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.c(jSONObject);
        }
        return Unit.a;
    }

    public static final Unit a(String str, Map map) {
        str.getClass();
        map.getClass();
        SparseArray sparseArray = InMobiAdActivity.t;
        str.getClass();
        map.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = InMobiAdActivity.u;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            gestureDetectorOnGestureListenerC3889xi.b(str, map);
        }
        return Unit.a;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "initContextualData "));
        }
        this.Y0 = new L4(ad != null ? ad.getContextData() : null, this.a0);
    }

    public static final Unit a(Fi fi) {
        fi.getClass();
        fi.b();
        return Unit.a;
    }

    public final void a(String str, boolean z) {
        str.getClass();
        if (!z) {
            k(str);
            return;
        }
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "loadHtmlUrl: prefetching URL content before WebView load");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Hi hi = this.e0;
        if (hi != null) {
            Map a = hi.a();
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("HtmlUrlPrefetchStarted", a, EnumC3943zk.SDK);
        }
        this.z = xw3.L(L9.c, null, null, new C3656oi(str, this, elapsedRealtime, null), 3);
    }

    @Override // com.inmobi.media.Eh
    public final void a(String str) {
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "sendFraudBeaconAndTelemetryEvent "));
        }
        e(str);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(str, adType);
    }

    public final void a(boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "fireNextAdLoadComplete "));
        }
        String l = bf3.l("window.imraidview.broadcastEvent('adLoadSuccess',", ");", z);
        InterfaceC3880x9 interfaceC3880x92 = this.i;
        if (interfaceC3880x92 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x92).c(str2, mz1.j(getCurrentRenderingPodAdIndex(), l, " Index: "));
        }
        h(l);
    }

    public final void a(int i, int i2) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            StringBuilder sb = new StringBuilder("fireSizeChanged ");
            sb.append(this);
            sb.append(" w-");
            sb.append(i);
            ((C3906y9) interfaceC3880x9).a(str, me4.g(i2, " h-", sb));
        }
        h(lnb.j(i, i2, "window.mraidview.broadcastEvent('sizeChange',", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, ");"));
    }

    public final void a(int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "fireOrientationChange " + this + " " + i);
        }
        h("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    public final void a(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "fireError " + this + " - " + jSONObject);
        }
        h("window.imraidview.broadcastEvent('error','" + jSONObject + "', '" + str + "');");
        d(jSONObject);
    }

    public final void a(String str, String str2, String str3) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str4 = i1;
            str4.getClass();
            StringBuilder sb = new StringBuilder("fireError ");
            sb.append(this);
            sb.append(" - ");
            sb.append(str2);
            ((C3906y9) interfaceC3880x9).a(str4, mz1.o(sb, " - ", str3));
        }
        if (str == null || str3 == null) {
            return;
        }
        a(str, bf3.k("broadcastEvent('error',\"", str2, "\", \"", str3, "\")"));
    }

    public final void a(String str, String str2) {
        str2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str3 = i1;
            ((C3906y9) interfaceC3880x9).a(str3, w1l.f(this, str3, "fireJavaScriptCallback "));
        }
        if (str == null) {
            return;
        }
        h(str + "." + str2);
    }

    public final void a(String str, HashMap hashMap) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).a(str2, w1l.f(this, str2, "processTelemetryEvent "));
        }
        getListener().a(str, hashMap);
    }

    public void a(Vf vf) {
        vf.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "setOrientationProperties "));
        }
        this.H0 = vf;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        gestureDetectorOnGestureListenerC3889xi.getListener().j(gestureDetectorOnGestureListenerC3889xi);
    }

    @Override // com.inmobi.media.Wf
    public final void a(Tf tf) {
        tf.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "onOrientationUpdate "));
        }
    }

    public final void a(Tf tf, Vo vo) {
        JSONObject jSONObject;
        Uo uo;
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).c(str, w1l.f(this, str, "fireOnSafeAreaChanged "));
        }
        vo.getClass();
        tf.getClass();
        try {
            vo.getClass();
            tf.getClass();
            uo = (Uo) vo.a.get(tf);
        } catch (Exception unused) {
        }
        if (uo != null) {
            jSONObject = uo.a();
            jSONObject.put(U3.i.n, Uf.a(tf));
            h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
        }
        jSONObject = null;
        h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "shouldRenderPopup "));
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.Eh
    public final boolean a() {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            long viewTouchTimestamp = getViewTouchTimestamp();
            long userTouchResetTime = getRenderingConfig().getUserTouchResetTime();
            StringBuilder o = ljg.o("hasUserInteracted ", viewTouchTimestamp, " ");
            o.append(userTouchResetTime);
            ((C3906y9) interfaceC3880x9).a(str, o.toString());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.m0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception exc) {
        exc.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            ((C3906y9) interfaceC3880x9).a(str, w1l.f(this, str, "handlePingException "), exc);
        }
        InterfaceC3731rg interfaceC3731rg = this.q;
        EnumC3463h6[] enumC3463h6Arr = EnumC3463h6.a;
        ((C3785ti) interfaceC3731rg).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
        joa joaVar = AbstractC3286aa.a;
        AbstractC3776t9.a(exc);
    }

    public static final Unit a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z) {
        InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).c(str, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC3889xi.getListener().a(gestureDetectorOnGestureListenerC3889xi, z);
        return Unit.a;
    }

    public final void a(boolean z, short s) {
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str = i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).c(str, "fireRenderProcessGoneTelemetry");
        }
        Hi hi = this.e0;
        if (hi != null) {
            hi.a(z, s);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.i;
        if (interfaceC3880x9 != null) {
            String str2 = i1;
            ((C3906y9) interfaceC3880x9).c(str2, w1l.f(this, str2, "fireDestroyWebViewSuccess "));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC3889xi.h("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
