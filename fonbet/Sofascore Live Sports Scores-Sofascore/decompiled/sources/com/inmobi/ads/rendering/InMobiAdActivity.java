package com.inmobi.ads.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.appsflyer.internal.i;
import com.inmobi.ads.R;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.AbstractC3286aa;
import com.inmobi.media.AbstractC3339cb;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3435g4;
import com.inmobi.media.AbstractC3941zi;
import com.inmobi.media.B;
import com.inmobi.media.Bi;
import com.inmobi.media.C;
import com.inmobi.media.C3285a9;
import com.inmobi.media.C3334c6;
import com.inmobi.media.C3360d6;
import com.inmobi.media.C3372di;
import com.inmobi.media.C3571lb;
import com.inmobi.media.C3638o0;
import com.inmobi.media.C3683pj;
import com.inmobi.media.C3708qi;
import com.inmobi.media.C3720r5;
import com.inmobi.media.C3906y9;
import com.inmobi.media.C3930z7;
import com.inmobi.media.EnumC3631nj;
import com.inmobi.media.F5;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.InterfaceC3880x9;
import com.inmobi.media.Jo;
import com.inmobi.media.N3;
import com.inmobi.media.Oi;
import com.inmobi.media.Q2;
import com.inmobi.media.R5;
import com.inmobi.media.V8;
import com.inmobi.media.Vf;
import com.inmobi.media.Wo;
import com.inmobi.media.X8;
import com.inmobi.media.Xb;
import com.inmobi.media.Y5;
import com.inmobi.media.Y8;
import com.inmobi.media.Yi;
import com.inmobi.media.Z8;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.ironsource.U3;
import com.ironsource.Wf;
import com.unity3d.ads.BuildConfig;
import defpackage.dmi;
import defpackage.h90;
import defpackage.hs4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.rob;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tz9;
import defpackage.w1l;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/rendering/InMobiAdActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/inmobi/media/Y8", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InMobiAdActivity extends Activity {
    public static final SparseArray t = new SparseArray();
    public static GestureDetectorOnGestureListenerC3889xi u;
    public X8 a;
    public V8 b;
    public GestureDetectorOnGestureListenerC3889xi c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public InterfaceC3880x9 h;
    public Wo i;
    public OnBackInvokedCallback j;
    public boolean k;
    public final ku3 l;
    public yda m;
    public boolean n;
    public boolean o;
    public RelativeLayout p;
    public FrameLayout q;
    public C3571lb r;
    public long s;

    public InMobiAdActivity() {
        smi o = tz9.o();
        hs4 hs4Var = z45.a;
        this.l = s9a.c(e.d(o, rob.a.f));
    }

    public static final boolean b(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3334c6 c3334c6;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC3889xi != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi.E0) != null) {
            C3334c6.a(c3334c6, 6, true, null, 12);
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC3889xi2 != null) {
            gestureDetectorOnGestureListenerC3889xi2.reload();
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
        view.setBackgroundColor(-7829368);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = inMobiAdActivity.c;
        if (gestureDetectorOnGestureListenerC3889xi2 != null && gestureDetectorOnGestureListenerC3889xi2.canGoForward() && (gestureDetectorOnGestureListenerC3889xi = inMobiAdActivity.c) != null) {
            gestureDetectorOnGestureListenerC3889xi.goForward();
        }
        return true;
    }

    public final void a(AdConfig.FormatCustomBrowserConfig formatCustomBrowserConfig) {
        View inflate = getLayoutInflater().inflate(R.layout.inmobi_in_app_browser_activity, (ViewGroup) null);
        if (inflate == null) {
            return;
        }
        this.p = (RelativeLayout) inflate.findViewById(R.id.inmobi_in_app_browser_webview_container);
        this.q = (FrameLayout) inflate.findViewById(R.id.inmobi_in_app_browser_loader_overlay);
        RelativeLayout.LayoutParams c = w1l.c(-1, -1, 10);
        c.addRule(2, R.id.inmobi_in_app_browser_bottom_bar);
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            viewGroup.addView(this.c, c);
            a(viewGroup);
            long loaderTimeout = formatCustomBrowserConfig.getLoaderTimeout();
            if (!this.o || loaderTimeout <= 0) {
                FrameLayout frameLayout = this.q;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
                FrameLayout frameLayout2 = this.q;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                this.k = true;
                if (this.n) {
                    Window window = getWindow();
                    window.getClass();
                    joa joaVar = Oi.a;
                    F5.a.getClass();
                    if (F5.t()) {
                        Oi.a(window, 3);
                    } else if (F5.r()) {
                        Oi.a(window, 1);
                    }
                    Window window2 = getWindow();
                    window2.getClass();
                    Oi.a(window2);
                }
                this.s = SystemClock.elapsedRealtime();
                AbstractC3339cb.a("InAppBrowserLoaderShown", this.r, (String) null, (Long) null);
                long loaderTimeout2 = formatCustomBrowserConfig.getLoaderTimeout();
                if (this.k) {
                    a();
                    this.m = xw3.L(this.l, null, null, new C3285a9(loaderTimeout2, this, null), 3);
                }
            }
        }
        setContentView(inflate);
    }

    public final void c() {
        C3334c6 c3334c6;
        C3930z7 c3930z7;
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onBackPressed");
        }
        int i = this.d;
        if (i == 102) {
            InterfaceC3880x9 interfaceC3880x92 = this.h;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c("InMobiAdActivity", "back pressed on ad");
            }
            V8 v8 = this.b;
            if (v8 == null || (c3930z7 = v8.c) == null) {
                return;
            }
            c3930z7.a();
            return;
        }
        if (i != 100 || this.k) {
            return;
        }
        InterfaceC3880x9 interfaceC3880x93 = this.h;
        if (interfaceC3880x93 != null) {
            ((C3906y9) interfaceC3880x93).c("InMobiAdActivity", "back pressed in browser");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.c;
        if (gestureDetectorOnGestureListenerC3889xi != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi.E0) != null) {
            C3334c6.a(c3334c6, 7, true, null, 12);
        }
        this.e = true;
        b();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(configuration);
        X8 x8 = this.a;
        if (x8 != null) {
            x8.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0136, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x006f, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0231  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        Object obj;
        int i;
        C3571lb c3571lb;
        Config a;
        AbstractC3941zi abstractC3941zi;
        String str;
        InterfaceC3880x9 interfaceC3880x9;
        super.onCreate(bundle);
        InterfaceC3880x9 interfaceC3880x92 = this.h;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("InMobiAdActivity", "onCreate called");
        }
        if (!AbstractC3424fj.d()) {
            b();
            InterfaceC3880x9 interfaceC3880x93 = this.h;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).b("InMobiAdActivity", "session not found. close");
            }
            Xb.a((byte) 2, "InMobi", "Session not found, AdActivity will be closed");
            return;
        }
        this.f = false;
        if (Build.VERSION.SDK_INT >= 29) {
            R5.c(this);
        }
        this.d = getIntent().getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        this.a = new X8(this);
        String stringExtra = getIntent().getStringExtra("loggerCacheKey");
        if (stringExtra != null) {
            try {
                WeakReference weakReference = (WeakReference) Y8.a.get(stringExtra);
                obj = weakReference != null ? weakReference.get() : null;
            } catch (ClassCastException unused) {
            }
        }
        i = this.d;
        if (i == 100) {
            if (i != 102) {
                return;
            }
            V8 v8 = new V8(this);
            InterfaceC3880x9 interfaceC3880x94 = this.h;
            if (interfaceC3880x94 != null) {
                v8.h = interfaceC3880x94;
            }
            X8 x8 = this.a;
            if (x8 == null) {
                Intrinsics.i("orientationHandler");
                throw null;
            }
            x8.b.add(v8);
            x8.a();
            this.b = v8;
            Intent intent = getIntent();
            intent.getClass();
            v8.a(intent, t);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        long longExtra = getIntent().getLongExtra("placementId", Long.MIN_VALUE);
        long longExtra2 = getIntent().getLongExtra("viewTouchTimestamp", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("allowAutoRedirection", false);
        String stringExtra3 = getIntent().getStringExtra("impressionId");
        String stringExtra4 = getIntent().getStringExtra("creativeId");
        boolean booleanExtra2 = getIntent().getBooleanExtra("supportLockScreen", false);
        this.n = getIntent().getBooleanExtra("isImmersive", false);
        this.o = getIntent().getBooleanExtra("supportBrowserLoader", false);
        try {
        } catch (Exception unused2) {
            c3571lb = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            c3571lb = (C3571lb) getIntent().getParcelableExtra("lpTelemetryControlInfo", C3571lb.class);
        } else {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("lpTelemetryControlInfo");
            if (parcelableExtra instanceof C3571lb) {
                c3571lb = (C3571lb) parcelableExtra;
            }
            c3571lb = null;
        }
        this.r = c3571lb;
        if (booleanExtra2) {
            getWindow().requestFeature(1);
            F5.a.getClass();
            if (Build.VERSION.SDK_INT >= 27) {
                setShowWhenLocked(true);
            } else {
                getWindow().addFlags(524288);
            }
        }
        AbstractC3941zi abstractC3941zi2 = GestureDetectorOnGestureListenerC3889xi.h1;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = u;
        if (gestureDetectorOnGestureListenerC3889xi != null) {
            abstractC3941zi2 = gestureDetectorOnGestureListenerC3889xi.getListener();
            a = gestureDetectorOnGestureListenerC3889xi.getAdConfig();
        } else {
            a = AbstractC3435g4.a.a(AdConfig.class);
        }
        Config config = a;
        AbstractC3941zi abstractC3941zi3 = abstractC3941zi2;
        long j = longExtra2 + 4;
        try {
            InterfaceC3880x9 interfaceC3880x95 = this.h;
            Jo jo = new Jo(interfaceC3880x95);
            abstractC3941zi = abstractC3941zi3;
            try {
                Yi yi = new Yi(BuildConfig.FLAVOR, "browser");
                try {
                    if (config == null) {
                        Intrinsics.i("adConfig");
                        throw null;
                    }
                    str = "InMobiAdActivity";
                    try {
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = new GestureDetectorOnGestureListenerC3889xi((Context) this, (byte) 1, (LinkedHashSet) null, stringExtra3, (String) null, j, (Bi) null, interfaceC3880x95, yi, jo, (C3638o0) null, (AdConfig) config, 164);
                        this.c = gestureDetectorOnGestureListenerC3889xi2;
                        gestureDetectorOnGestureListenerC3889xi2.setPlacementId(longExtra);
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi3 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi3 != null) {
                            gestureDetectorOnGestureListenerC3889xi3.setCreativeId(stringExtra4);
                        }
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi4 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi4 != null) {
                            gestureDetectorOnGestureListenerC3889xi4.setAllowAutoRedirection(booleanExtra);
                        }
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi5 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi5 != null) {
                            gestureDetectorOnGestureListenerC3889xi5.a(abstractC3941zi);
                        }
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi6 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi6 != null) {
                            gestureDetectorOnGestureListenerC3889xi6.setLandingPageTelemetryControlInfoOnWebViewClient(this.r);
                        }
                        a(((AdConfig) config).getCustomBrowser().getInt());
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi7 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi7 != null) {
                            gestureDetectorOnGestureListenerC3889xi7.setFullScreenActivityContext(this);
                        }
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi8 = this.c;
                        if (gestureDetectorOnGestureListenerC3889xi8 != null) {
                            stringExtra2.getClass();
                            gestureDetectorOnGestureListenerC3889xi8.loadUrl(stringExtra2);
                        }
                        X8 x82 = this.a;
                        if (x82 == null) {
                            Intrinsics.i("orientationHandler");
                            throw null;
                        }
                        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi9 = this.c;
                        gestureDetectorOnGestureListenerC3889xi9.getClass();
                        x82.b.add(gestureDetectorOnGestureListenerC3889xi9);
                        x82.a();
                        return;
                    } catch (Exception e) {
                        e = e;
                        abstractC3941zi = abstractC3941zi;
                        interfaceC3880x9 = this.h;
                        if (interfaceC3880x9 != null) {
                        }
                        joa joaVar = AbstractC3286aa.a;
                        AbstractC3286aa.a(new Q2(e));
                        abstractC3941zi.c();
                        b();
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                str = "InMobiAdActivity";
                interfaceC3880x9 = this.h;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a(str, "Exception while initializing In-App browser", e);
                }
                joa joaVar2 = AbstractC3286aa.a;
                AbstractC3286aa.a(new Q2(e));
                abstractC3941zi.c();
                b();
                return;
            }
        } catch (Exception e4) {
            e = e4;
            abstractC3941zi = abstractC3941zi3;
        }
        obj = null;
        this.h = (InterfaceC3880x9) obj;
        i = this.d;
        if (i == 100) {
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        V8 v8;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi;
        C3334c6 c3334c6;
        B fullScreenEventsListener;
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onDestroy");
        }
        int i = this.d;
        if (100 == i) {
            a();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = u;
            if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                gestureDetectorOnGestureListenerC3889xi2.c(C3372di.a("IN_CUSTOM_BROWSER", "onClose"));
            }
            u = null;
        } else if (102 == i && (v8 = this.b) != null && v8.e != null) {
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            v8.a(C3372di.a("IN_CUSTOM_EXPAND", "onClose"));
        }
        boolean z = this.e;
        int i2 = this.d;
        if (!z) {
            if (100 != i2 && 102 == i2) {
                V8 v82 = this.b;
                if (v82 != null) {
                    X8 x8 = this.a;
                    if (x8 == null) {
                        Intrinsics.i("orientationHandler");
                        throw null;
                    }
                    x8.b.remove(v82);
                    x8.a();
                    C3930z7 c3930z7 = v82.c;
                    if (c3930z7 != null) {
                        c3930z7.b();
                    }
                    RelativeLayout relativeLayout = v82.d;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    Y5 y5 = v82.e;
                    if (y5 != null) {
                        C3360d6 c3360d6 = y5.c;
                        if (c3360d6 != null) {
                            c3360d6.destroy();
                        }
                        y5.c = null;
                        y5.d = null;
                        y5.e = null;
                        Wo wo = y5.g;
                        if (wo != null) {
                            wo.a();
                        }
                        y5.removeAllViews();
                    }
                    v82.a.clear();
                    v82.b = null;
                    v82.c = null;
                    v82.d = null;
                    v82.e = null;
                }
                this.b = null;
            }
            if (100 == this.d && (gestureDetectorOnGestureListenerC3889xi = this.c) != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi.E0) != null) {
                C3334c6.a(c3334c6, 9, true, null, 12);
                C3683pj c3683pj = c3334c6.m;
                if (!c3683pj.f && c3683pj.a > 0) {
                    c3683pj.f = true;
                    c3683pj.g = EnumC3631nj.DONE;
                    c3683pj.a();
                }
                s9a.o(c3683pj.d, null);
            }
        } else if (100 == i2) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi3 = this.c;
            if (gestureDetectorOnGestureListenerC3889xi3 != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3889xi3.getFullScreenEventsListener()) != null) {
                try {
                    C3708qi c3708qi = (C3708qi) fullScreenEventsListener;
                    InterfaceC3880x9 interfaceC3880x92 = c3708qi.a.i;
                    if (interfaceC3880x92 != null) {
                        String str = GestureDetectorOnGestureListenerC3889xi.i1;
                        str.getClass();
                        ((C3906y9) interfaceC3880x92).a(str, Wf.m);
                    }
                    if ("Default".equals(c3708qi.a.getViewState())) {
                        c3708qi.a.setAndUpdateViewState("Hidden");
                    }
                    c3708qi.a.W();
                    GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi4 = this.c;
                    gestureDetectorOnGestureListenerC3889xi4.getClass();
                    gestureDetectorOnGestureListenerC3889xi4.b();
                    X8 x82 = this.a;
                    if (x82 == null) {
                        Intrinsics.i("orientationHandler");
                        throw null;
                    }
                    GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi5 = this.c;
                    gestureDetectorOnGestureListenerC3889xi5.getClass();
                    x82.b.remove(gestureDetectorOnGestureListenerC3889xi5);
                    x82.a();
                    this.c = null;
                } catch (Exception unused) {
                }
            }
        } else if (102 == i2) {
            V8 v83 = this.b;
            if (v83 != null) {
                X8 x83 = this.a;
                if (x83 == null) {
                    Intrinsics.i("orientationHandler");
                    throw null;
                }
                x83.b.remove(v83);
                x83.a();
                C3930z7 c3930z72 = v83.c;
                if (c3930z72 != null) {
                    c3930z72.b();
                }
                RelativeLayout relativeLayout2 = v83.d;
                if (relativeLayout2 != null) {
                    relativeLayout2.removeAllViews();
                }
                Y5 y52 = v83.e;
                if (y52 != null) {
                    C3360d6 c3360d62 = y52.c;
                    if (c3360d62 != null) {
                        c3360d62.destroy();
                    }
                    y52.c = null;
                    y52.d = null;
                    y52.e = null;
                    Wo wo2 = y52.g;
                    if (wo2 != null) {
                        wo2.a();
                    }
                    y52.removeAllViews();
                }
                v83.a.clear();
                v83.b = null;
                v83.c = null;
                v83.d = null;
                v83.e = null;
            }
            this.b = null;
        }
        Wo wo3 = this.i;
        if (wo3 != null) {
            wo3.a();
        }
        this.i = null;
        s9a.o(this.l, null);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        V8 v8;
        X8 x8;
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", i.j("multiWindow mode - ", z));
        }
        super.onMultiWindowModeChanged(z);
        if (z || (v8 = this.b) == null) {
            return;
        }
        C c = v8.b;
        Vf orientationProperties = (c == null || !(c instanceof GestureDetectorOnGestureListenerC3889xi)) ? null : ((GestureDetectorOnGestureListenerC3889xi) c).getOrientationProperties();
        if (orientationProperties == null || (x8 = this.a) == null) {
            return;
        }
        x8.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f = false;
        this.c = null;
        setIntent(intent);
        V8 v8 = this.b;
        if (v8 != null) {
            SparseArray sparseArray = t;
            intent.getClass();
            sparseArray.getClass();
            v8.a(intent, sparseArray);
            C3930z7 c3930z7 = v8.c;
            if (c3930z7 != null) {
                c3930z7.e();
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        V8 v8;
        super.onPause();
        int i = this.d;
        if (100 == i) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = u;
            if (gestureDetectorOnGestureListenerC3889xi != null) {
                GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                gestureDetectorOnGestureListenerC3889xi.c(C3372di.a("IN_CUSTOM_BROWSER", "onHidden"));
                return;
            }
            return;
        }
        if (102 != i || (v8 = this.b) == null || v8.e == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3889xi.g1.getClass();
        v8.a(C3372di.a("IN_CUSTOM_EXPAND", "onHidden"));
    }

    @Override // android.app.Activity
    public final void onResume() {
        C3930z7 c3930z7;
        B fullScreenEventsListener;
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", U3.i.u0);
        }
        super.onResume();
        if (this.e) {
            return;
        }
        int i = this.d;
        if (100 == i) {
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.c;
            if (gestureDetectorOnGestureListenerC3889xi != null && (fullScreenEventsListener = gestureDetectorOnGestureListenerC3889xi.getFullScreenEventsListener()) != null) {
                try {
                    if (!this.f) {
                        this.f = true;
                        ((C3708qi) fullScreenEventsListener).b();
                    }
                } catch (Exception unused) {
                }
            }
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = u;
            if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                GestureDetectorOnGestureListenerC3889xi.g1.getClass();
                gestureDetectorOnGestureListenerC3889xi2.c(C3372di.a("IN_CUSTOM_BROWSER", "onVisible"));
                return;
            }
            return;
        }
        if (102 == i) {
            V8 v8 = this.b;
            if (v8 != null && (c3930z7 = v8.c) != null && !c3930z7.h) {
                try {
                    c3930z7.h = true;
                    B fullScreenEventsListener2 = c3930z7.f.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        ((C3708qi) fullScreenEventsListener2).b();
                    }
                } catch (Exception unused2) {
                }
            }
            V8 v82 = this.b;
            if (v82 == null || v82.e == null) {
                return;
            }
            GestureDetectorOnGestureListenerC3889xi.g1.getClass();
            v82.a(C3372di.a("IN_CUSTOM_EXPAND", "onVisible"));
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        V8 v8;
        Window window;
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        F5.a.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.j == null) {
                this.j = new h90(this, 3);
            }
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.i("backInvokedCallback");
                throw null;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
        if (this.e || 102 != this.d || (v8 = this.b) == null) {
            return;
        }
        C3930z7 c3930z7 = v8.c;
        if (c3930z7 != null) {
            c3930z7.e();
        }
        C c = v8.b;
        if (c != null) {
            if ((c instanceof GestureDetectorOnGestureListenerC3889xi ? ((GestureDetectorOnGestureListenerC3889xi) c).X0 : false) && !F5.t() && F5.w()) {
                Object obj = v8.a.get();
                InMobiAdActivity inMobiAdActivity = obj instanceof InMobiAdActivity ? (InMobiAdActivity) obj : null;
                if (inMobiAdActivity == null || (window = inMobiAdActivity.getWindow()) == null) {
                    return;
                }
                window.getDecorView().setSystemUiVisibility(5638);
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        InterfaceC3880x9 interfaceC3880x9 = this.h;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        F5.a.getClass();
        if (Build.VERSION.SDK_INT >= 33 && this.j != null) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.j;
            if (onBackInvokedCallback == null) {
                Intrinsics.i("backInvokedCallback");
                throw null;
            }
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }
        if (this.d == 100) {
            a("ACTIVITY_STOP");
        }
    }

    public final void b() {
        if (isTaskRoot()) {
            F5.a.getClass();
            if (F5.x()) {
                finishAndRemoveTask();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        super.onMultiWindowModeChanged(z, configuration);
        onMultiWindowModeChanged(z);
    }

    public static final boolean c(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3334c6 c3334c6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC3889xi != null && gestureDetectorOnGestureListenerC3889xi.canGoBack()) {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi2 = inMobiAdActivity.c;
                if (gestureDetectorOnGestureListenerC3889xi2 != null) {
                    gestureDetectorOnGestureListenerC3889xi2.goBack();
                }
            } else {
                GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi3 = inMobiAdActivity.c;
                if (gestureDetectorOnGestureListenerC3889xi3 != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi3.E0) != null) {
                    C3334c6.a(c3334c6, 5, true, null, 12);
                }
                inMobiAdActivity.e = true;
                inMobiAdActivity.b();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final void a(InMobiAdActivity inMobiAdActivity) {
        inMobiAdActivity.c();
    }

    public final void a(String str) {
        C3334c6 c3334c6;
        C3683pj c3683pj;
        boolean z;
        str.getClass();
        if (this.k) {
            InterfaceC3880x9 interfaceC3880x9 = this.h;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("InMobiAdActivity", dmi.q("hideLoaderAndShowWebView reason=", str));
            }
            FrameLayout frameLayout = this.q;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.n) {
                Window window = getWindow();
                window.getClass();
                Oi.b(window);
                Window window2 = getWindow();
                window2.getClass();
                Oi.c(window2);
            }
            this.k = false;
            a();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.c;
            if (gestureDetectorOnGestureListenerC3889xi != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi.E0) != null && !(z = (c3683pj = c3334c6.m).f) && !z && c3683pj.a > 0) {
                c3683pj.f = true;
                c3683pj.g = EnumC3631nj.DONE;
                c3683pj.a();
            }
            AbstractC3339cb.a("InAppBrowserLoaderHidden", this.r, str, Long.valueOf(SystemClock.elapsedRealtime() - this.s));
        }
    }

    public final void a() {
        try {
            yda ydaVar = this.m;
            if (ydaVar != null && !ydaVar.isActive()) {
                throw ydaVar.k();
            }
            yda ydaVar2 = this.m;
            if (ydaVar2 != null) {
                ydaVar2.e(null);
            }
        } catch (Exception unused) {
        }
        this.m = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_bottom_bar)).getLayoutParams();
        layoutParams.getClass();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (N3.a(this)) {
            Wo wo = this.i;
            if (wo != null) {
                wo.a();
            }
            this.i = new Wo(this, new Z8(layoutParams2), this.h);
        }
        final int i = 2;
        C3720r5 c3720r5 = new C3720r5(this, (byte) 2, this.h);
        final int i2 = 0;
        c3720r5.setOnTouchListener(new View.OnTouchListener(this) { // from class: rx9
            public final /* synthetic */ InMobiAdActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i3 = i2;
                InMobiAdActivity inMobiAdActivity = this.b;
                switch (i3) {
                    case 0:
                        return InMobiAdActivity.a(inMobiAdActivity, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(inMobiAdActivity, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(inMobiAdActivity, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(inMobiAdActivity, view, motionEvent);
                }
            }
        });
        final int i3 = 3;
        C3720r5 c3720r52 = new C3720r5(this, (byte) 3, this.h);
        final int i4 = 1;
        c3720r52.setOnTouchListener(new View.OnTouchListener(this) { // from class: rx9
            public final /* synthetic */ InMobiAdActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i32 = i4;
                InMobiAdActivity inMobiAdActivity = this.b;
                switch (i32) {
                    case 0:
                        return InMobiAdActivity.a(inMobiAdActivity, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(inMobiAdActivity, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(inMobiAdActivity, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(inMobiAdActivity, view, motionEvent);
                }
            }
        });
        C3720r5 c3720r53 = new C3720r5(this, (byte) 4, this.h);
        c3720r53.setOnTouchListener(new View.OnTouchListener(this) { // from class: rx9
            public final /* synthetic */ InMobiAdActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i32 = i;
                InMobiAdActivity inMobiAdActivity = this.b;
                switch (i32) {
                    case 0:
                        return InMobiAdActivity.a(inMobiAdActivity, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(inMobiAdActivity, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(inMobiAdActivity, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(inMobiAdActivity, view, motionEvent);
                }
            }
        });
        C3720r5 c3720r54 = new C3720r5(this, (byte) 6, this.h);
        c3720r54.setOnTouchListener(new View.OnTouchListener(this) { // from class: rx9
            public final /* synthetic */ InMobiAdActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i32 = i3;
                InMobiAdActivity inMobiAdActivity = this.b;
                switch (i32) {
                    case 0:
                        return InMobiAdActivity.a(inMobiAdActivity, view, motionEvent);
                    case 1:
                        return InMobiAdActivity.b(inMobiAdActivity, view, motionEvent);
                    case 2:
                        return InMobiAdActivity.c(inMobiAdActivity, view, motionEvent);
                    default:
                        return InMobiAdActivity.d(inMobiAdActivity, view, motionEvent);
                }
            }
        });
        try {
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_close_slot)).addView(c3720r5);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_refresh_slot)).addView(c3720r52);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_back_slot)).addView(c3720r53);
            ((FrameLayout) viewGroup.findViewById(R.id.inmobi_in_app_browser_forward_slot)).addView(c3720r54);
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x9 = this.h;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("InMobiAdActivity", "Error setting up bottom bar buttons", e);
            }
        }
    }

    public static final boolean a(InMobiAdActivity inMobiAdActivity, View view, MotionEvent motionEvent) {
        C3334c6 c3334c6;
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = inMobiAdActivity.c;
            if (gestureDetectorOnGestureListenerC3889xi != null && (c3334c6 = gestureDetectorOnGestureListenerC3889xi.E0) != null) {
                C3334c6.a(c3334c6, 5, true, null, 12);
            }
            inMobiAdActivity.e = true;
            inMobiAdActivity.b();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
