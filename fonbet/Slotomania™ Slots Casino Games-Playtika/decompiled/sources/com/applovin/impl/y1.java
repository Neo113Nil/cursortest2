package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.f6;
import com.applovin.impl.j0;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class y1 implements AppLovinBroadcastManager.Receiver, a.b {
    protected int A;
    protected int B;
    protected boolean C;
    private ContentObserver D;
    private Float E;
    protected AppLovinAdClickListener F;
    protected AppLovinAdDisplayListener G;
    protected AppLovinAdVideoPlaybackListener H;
    protected j7 I;
    protected j7 J;
    protected boolean K;
    private final j0 L;
    private boolean M;
    protected final com.applovin.impl.sdk.ad.b a;
    protected final com.applovin.impl.sdk.l b;
    protected final com.applovin.impl.sdk.p c;
    protected Activity d;
    private final int e;
    private final Handler f;
    private final com.applovin.impl.b g;
    private final j.a h;
    private AppLovinAdView i;
    protected com.applovin.impl.adview.k j;
    protected final com.applovin.impl.adview.g k;
    protected final com.applovin.impl.adview.g l;
    protected final long m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private boolean p;
    private boolean q;
    protected long r;
    protected long s;
    private boolean t;
    protected boolean u;
    protected int v;
    protected boolean w;
    private int x;
    private final ArrayList y;
    protected int z;

    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            y1.this.a("web_view");
        }
    }

    class b implements j.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.j.a
        public void a(int i) {
            y1 y1Var = y1.this;
            if (y1Var.B != com.applovin.impl.sdk.j.h) {
                y1Var.C = true;
            }
            com.applovin.impl.adview.b f = y1Var.i.getController().f();
            if (f == null) {
                com.applovin.impl.sdk.p pVar = y1.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.j.a(i) && !com.applovin.impl.sdk.j.a(y1.this.B)) {
                f.a("javascript:al_muteSwitchOn();");
            } else if (i == 2) {
                f.a("javascript:al_muteSwitchOff();");
            }
            y1.this.B = i;
        }
    }

    class c extends com.applovin.impl.b {
        final /* synthetic */ com.applovin.impl.sdk.l a;

        c(com.applovin.impl.sdk.l lVar) {
            this.a = lVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(q7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (y1.this.z() && a(activity)) {
                y1.this.d();
            }
        }
    }

    class d extends ContentObserver {
        final /* synthetic */ com.applovin.impl.sdk.l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, com.applovin.impl.sdk.l lVar) {
            super(handler);
            this.a = lVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Float b = this.a.q().b();
            if (b == null || y1.this.E == null || b.equals(y1.this.E)) {
                return;
            }
            String str = b.floatValue() > y1.this.E.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", b.floatValue());
            y1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            y1.this.E = b;
        }
    }

    class e extends com.applovin.impl.b {
        final /* synthetic */ u4 a;

        e(u4 u4Var) {
            this.a = u4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.a.b(null);
                y1.this.b.e().b(this);
            }
        }
    }

    public interface g {
        void a(y1 y1Var);

        void a(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            y1.this.r = SystemClock.elapsedRealtime();
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.p pVar = y1.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            v2.a(y1.this.F, appLovinAd);
            y1.this.A++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y1 y1Var = y1.this;
            if (view != y1Var.k || !((Boolean) y1Var.b.a(z4.b2)).booleanValue()) {
                com.applovin.impl.sdk.p pVar = y1.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    y1.this.c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            y1.f(y1.this);
            if (y1.this.a.O0()) {
                y1.this.e("javascript:al_onCloseButtonTapped(" + y1.this.x + "," + y1.this.z + "," + y1.this.A + ");");
            }
            List H = y1.this.a.H();
            com.applovin.impl.sdk.p pVar2 = y1.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.c.a("AppLovinFullscreenActivity", "Handling close button tap " + y1.this.x + " with multi close delay: " + H);
            }
            if (H == null || H.size() <= y1.this.x) {
                y1.this.a("native_close_button");
                return;
            }
            y1.this.y.add(Long.valueOf(SystemClock.elapsedRealtime() - y1.this.r));
            List F = y1.this.a.F();
            if (F != null && F.size() > y1.this.x) {
                y1 y1Var2 = y1.this;
                y1Var2.k.a((e.a) F.get(y1Var2.x));
            }
            com.applovin.impl.sdk.p pVar3 = y1.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                y1.this.c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + H.get(y1.this.x));
            }
            y1.this.k.setVisibility(8);
            y1 y1Var3 = y1.this;
            y1Var3.a(y1Var3.k, ((Integer) H.get(y1Var3.x)).intValue(), new Runnable() { // from class: com.applovin.impl.y1$h$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    y1.h.this.a();
                }
            });
        }

        /* synthetic */ h(y1 y1Var, a aVar) {
            this();
        }
    }

    y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f = handler;
        this.m = SystemClock.elapsedRealtime();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.r = -1L;
        this.x = 0;
        this.y = new ArrayList();
        this.z = 0;
        this.A = 0;
        this.B = com.applovin.impl.sdk.j.h;
        this.M = false;
        this.a = bVar;
        this.b = lVar;
        this.c = lVar.Q();
        this.d = activity;
        this.e = bVar.T();
        this.F = appLovinAdClickListener;
        this.G = appLovinAdDisplayListener;
        this.H = appLovinAdVideoPlaybackListener;
        this.L = new j0(lVar);
        h hVar = new h(this, null);
        if (((Boolean) lVar.a(z4.r2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) lVar.a(z4.x2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        w1 w1Var = new w1(lVar.A0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.i = w1Var;
        w1Var.setAdClickListener(hVar);
        this.i.setAdDisplayListener(new a());
        bVar.i().putString("ad_view_address", g8.a(this.i));
        this.i.getController().a(this);
        e2 e2Var = new e2(map, lVar);
        if (e2Var.c()) {
            this.j = new com.applovin.impl.adview.k(e2Var, activity);
        }
        lVar.l().trackImpression(bVar);
        List H = bVar.H();
        if (bVar.s() >= 0 || H != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.q(), activity);
            this.k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y1.this.a(view);
            }
        });
        if (bVar.V0()) {
            this.h = new b();
        } else {
            this.h = null;
        }
        this.g = new c(lVar);
        if (bVar.R0()) {
            this.E = lVar.q().b();
            this.D = new d(handler, lVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.D);
        }
    }

    private void B() {
        if (this.h != null) {
            this.b.q().a(this.h);
        }
        if (this.g != null) {
            this.b.e().a(this.g);
        }
    }

    static /* synthetic */ int f(y1 y1Var) {
        int i = y1Var.x;
        y1Var.x = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.a.T() <= this.e && !com.applovin.impl.d.d(this.d)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.p = false;
            long c2 = this.a.c();
            if (c2 > 0) {
                a(c2).a(u4.i, new u4.b() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda1
                    @Override // com.applovin.impl.u4.b
                    public final void a(boolean z, Object obj, Object obj2) {
                        y1.this.a(z, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.a.A0().getAndSet(true)) {
            return;
        }
        this.b.s0().a((k5) new p6(this.a, this.b), f6.b.OTHER);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    protected abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j);

    protected boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.a.getType();
    }

    protected boolean i() {
        return this.d instanceof AppLovinFullscreenActivity;
    }

    protected void l() {
        if (this.p || this.q || !this.o.compareAndSet(false, true)) {
            return;
        }
        v2.b(this.G, this.a);
        this.b.J().b(this.a);
        HashMap hashMap = new HashMap();
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar != null) {
            CollectionUtils.putStringIfValid("source", bVar.w(), hashMap);
            CollectionUtils.putStringIfValid("details", h2.b(this.a), hashMap);
        }
        this.b.g().a(f2.H, this.a, hashMap);
    }

    protected abstract void m();

    protected void n() {
        j7 j7Var = this.I;
        if (j7Var != null) {
            j7Var.d();
        }
    }

    protected void o() {
        j7 j7Var = this.I;
        if (j7Var != null) {
            j7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        action.hashCode();
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.u) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    protected void p() {
        com.applovin.impl.adview.b f2;
        if (this.i == null || !this.a.u0() || (f2 = this.i.getController().f()) == null) {
            return;
        }
        this.L.a(f2, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.M) {
            a("back_button");
        }
        if (this.a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.i.destroy();
            this.i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.F = null;
        this.G = null;
        this.H = null;
        this.d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    protected void x() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.K = true;
    }

    public boolean y() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.p.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    private void f(final String str) {
        if (this.o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.c(str);
            }
        });
    }

    public AppLovinAdView b() {
        return this.i;
    }

    public void d(boolean z) {
        this.p = z;
    }

    public void e(boolean z) {
        this.q = z;
    }

    public boolean g() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.p = true;
            long f2 = this.a.f();
            if (f2 < 0) {
                return;
            }
            a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    y1.this.j();
                }
            }, f2);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        d("javascript:al_onWindowFocusChanged( " + z + " );");
        j7 j7Var = this.J;
        if (j7Var != null) {
            if (z) {
                j7Var.e();
            } else {
                j7Var.d();
            }
        }
    }

    public void e(String str) {
        a(str, 0L);
    }

    class f implements j0.c {
        f() {
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i, int i2) {
            Map a = h2.a((AppLovinAdImpl) y1.this.a);
            a.putAll(h2.a(y1.this.a));
            a.put("details", "detection_count=" + i + ",total_checks=" + i2);
            y1.this.b.E().d(f2.T0, a);
        }

        @Override // com.applovin.impl.j0.c
        public void a(int i, int i2, int i3) {
            Map a = h2.a((AppLovinAdImpl) y1.this.a);
            a.putAll(h2.a(y1.this.a));
            a.put("details", "detections_to_report=" + i + ",detection_count=" + i2 + ",total_checks=" + i3);
            y1.this.b.E().d(f2.U0, a);
            if (((Boolean) y1.this.b.a(z4.x6)).booleanValue()) {
                y1.this.x();
            }
            if (((Boolean) y1.this.b.a(z4.Q0)).booleanValue()) {
                y1.this.b.I().c(y1.this.a, com.applovin.impl.sdk.l.p());
            }
            if (((Boolean) y1.this.b.a(z4.t6)).booleanValue()) {
                y1.this.a("black_view_auto_dismiss");
                return;
            }
            y1 y1Var = y1.this;
            y1Var.M = ((Boolean) y1Var.b.a(z4.u6)).booleanValue();
            if (((Boolean) y1.this.b.a(z4.v6)).booleanValue()) {
                y1.this.A();
            }
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.l lVar, Activity activity, g gVar) {
        y1 b2Var;
        if (bVar instanceof r7) {
            try {
                b2Var = new b2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + lVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                b2Var = new c2(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + lVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                b2Var = new z1(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + lVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        b2Var.B();
        gVar.a(b2Var);
    }

    public void e() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b f2;
        AppLovinAdView appLovinAdView = this.i;
        if (appLovinAdView == null || (f2 = appLovinAdView.getController().f()) == null) {
            return;
        }
        f2.a(str);
    }

    protected void c(boolean z) {
        a(z, ((Long) this.b.a(z4.q2)).longValue());
        if (!this.a.t0()) {
            v2.a(this.G, this.a);
        }
        this.b.J().a(this.a);
        if (!this.a.t0() && (this.a.hasVideoUrl() || h())) {
            v2.a(this.H, this.a);
        }
        new p4(this.d).a(this.a);
        this.a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        g8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                y1.a(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    private void b(String str, Map map) {
        e(p8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                y1.b(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    protected int c() {
        int u = this.a.u();
        return (u <= 0 && ((Boolean) this.b.a(z4.p2)).booleanValue()) ? this.v + 1 : u;
    }

    protected void d(String str) {
        if (this.a.w0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    private void d(String str, Map map) {
        e(p8.d(str, map));
    }

    protected void c(long j) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.I = j7.a(j, this.b, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.k();
            }
        });
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    private void c(String str, Map map) {
        e(p8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Void r2, Void r3) {
        if (z) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private u4 a(long j) {
        final u4 u4Var = new u4("bringAdActivityToFront");
        final e eVar = new e(u4Var);
        this.b.e().a(eVar);
        Intent intent = new Intent(this.d, (Class<?>) (this.a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.d, intent);
        a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.a(eVar, u4Var);
            }
        }, j);
        return u4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, u4 u4Var) {
        this.b.e().b(bVar);
        if (u4Var.d()) {
            return;
        }
        u4Var.a((Object) null);
    }

    protected boolean a(boolean z) {
        List a2 = q7.a(z, this.a, this.b, this.d);
        if (a2.isEmpty()) {
            return false;
        }
        if (((Boolean) this.b.a(z4.X0)).booleanValue() && !q7.a(a2, this.a)) {
            a(a2, (com.applovin.impl.sdk.ad.a) this.a);
            return false;
        }
        String str = "Missing ad resources: " + a2;
        Map a3 = h2.a((AppLovinAdImpl) this.a);
        if (((Boolean) this.b.a(z4.Z5)).booleanValue()) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + a2);
            }
            if (((Boolean) this.b.a(z4.c6)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.G;
                if (appLovinAdDisplayListener instanceof n2) {
                    v2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                p2.a(this.a, this.G, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", a3);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            this.b.g().a(f2.G, this.a, hashMap);
            return ((Boolean) this.b.a(z4.b6)).booleanValue();
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + a2);
        }
        this.a.G0();
        a(str, "Streaming ad", a3);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long currentTimeMillis = System.currentTimeMillis();
        aVar.b(list);
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), hashMap);
        this.b.g().a(f2.L, aVar, hashMap);
    }

    public void a(p0.a aVar, p0.a aVar2, p0.a aVar3) {
        if (((Boolean) this.b.a(z4.J4)).booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("orientation", q7.b(this.d));
            if (aVar != null) {
                hashMap.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                hashMap.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                hashMap.put("nav_bar_insets", aVar3.e());
            }
            e(p8.a(hashMap));
        }
    }

    public void a(String str) {
        this.t = true;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.a != null ? r0.x() : 0L);
        if (((Boolean) this.b.a(z4.T6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.L.b();
        if (this.h != null) {
            this.b.q().b(this.h);
        }
        if (this.g != null) {
            this.b.e().b(this.g);
        }
        if (this.D != null) {
            this.d.getContentResolver().unregisterContentObserver(this.D);
            this.D = null;
        }
        if (i()) {
            if (this.q) {
                return;
            }
            ((AppLovinFullscreenActivity) this.d).finishFromSdk();
        } else {
            this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.b.Q().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
            }
            r();
        }
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i, KeyEvent keyEvent) {
        if (this.c == null || !com.applovin.impl.sdk.p.a()) {
            return;
        }
        this.c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    protected void a(final String str, long j) {
        if (j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                y1.this.b(str);
            }
        }, j);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j, final Runnable runnable) {
        if (j >= ((Long) this.b.a(z4.a2)).longValue()) {
            return;
        }
        this.J = j7.a(TimeUnit.SECONDS.toMillis(j), this.b, new Runnable() { // from class: com.applovin.impl.y1$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                y1.c(com.applovin.impl.adview.g.this, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(int i, boolean z, boolean z2, long j) {
        if (this.p || this.q || !this.n.compareAndSet(false, true)) {
            return;
        }
        if (this.a.hasVideoUrl() || h()) {
            v2.a(this.H, this.a, i, z2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        this.b.l().trackVideoEnd(this.a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
        long elapsedRealtime2 = this.r != -1 ? SystemClock.elapsedRealtime() - this.r : -1L;
        this.b.l().trackFullScreenAdClosed(this.a, elapsedRealtime2, this.y, j, this.C, this.B);
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + elapsedRealtime2 + "ms");
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap hashMap = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, hashMap);
        CollectionUtils.putStringIfValid("details", str2, hashMap);
        this.b.E().a(f2.V0, "missingCachedAdResources", hashMap);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.K = true;
    }

    protected void a(boolean z, long j) {
        if (this.a.J0()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    private void a(String str, Map map) {
        e(p8.a(str, map));
    }

    protected void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f);
    }
}
