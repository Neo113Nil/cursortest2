package com.applovin.adview;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.AppRestartDuringAdDetectionService;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.b5;
import com.applovin.impl.d;
import com.applovin.impl.e;
import com.applovin.impl.f2;
import com.applovin.impl.g;
import com.applovin.impl.g8;
import com.applovin.impl.h2;
import com.applovin.impl.i0;
import com.applovin.impl.o1;
import com.applovin.impl.p0;
import com.applovin.impl.p2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y1;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AppLovinFullscreenActivity extends Activity implements o1 {
    private static final Set n = Collections.newSetFromMap(new WeakHashMap());
    private static final Object o = new Object();
    public static p2 parentInterstitialWrapper;
    private l a;
    private y1 b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private boolean d;
    private com.applovin.impl.adview.activity.a e;
    private c f;
    private i0 g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ Boolean a;

        a(Boolean bool) {
            this.a = bool;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!AppLovinFullscreenActivity.this.m) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.a.a(z4.y2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int intValue = ((Integer) AppLovinFullscreenActivity.this.a.a(z4.y2)).intValue();
            Insets insets2 = windowInsets.getInsets(AppLovinFullscreenActivity.this.l ? intValue & (~WindowInsets.Type.displayCutout()) : intValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    private static class c implements OnBackInvokedCallback {
        private final Runnable a;

        protected c(Runnable runnable) {
            this.a = runnable;
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            this.a.run();
        }
    }

    public void configureSystemUiBars(boolean z, boolean z2, boolean z3, boolean z4) {
        this.m = z || z2 || z3;
        if (!p0.b() || !this.m) {
            getWindow().setFlags(1024, 1024);
            d.c(this);
            return;
        }
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        if (z3) {
            this.i = false;
            this.j = false;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        if (this.i) {
            d.b((Activity) this);
        } else {
            d.f(this);
        }
        if (this.j) {
            d.a((Activity) this);
        } else {
            d.e(this);
        }
    }

    @Override // com.applovin.impl.o1
    public void dismiss(String str) {
        if (p0.h() && this.f != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f);
            this.f = null;
        }
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.a(str);
        } else {
            finishFromSdk();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void finish() {
        l lVar = this.a;
        if (lVar != null && !this.d) {
            if (((Boolean) lVar.a(z4.c7)).booleanValue()) {
                p2 p2Var = parentInterstitialWrapper;
                Map a2 = h2.a((AppLovinAdImpl) (p2Var != null ? p2Var.f() : null));
                CollectionUtils.putStringIfValid("details", a(lVar), a2);
                lVar.E().d(f2.N0, a2);
            }
            if (((Boolean) lVar.a(z4.d7)).booleanValue()) {
                return;
            }
        }
        super.finish();
    }

    public void finishFromSdk() {
        this.d = true;
        finish();
    }

    public boolean isAllowingAdRenderingWithinDisplayCutout() {
        return this.l;
    }

    public boolean isHidingNavigationBar() {
        return this.j;
    }

    public boolean isHidingStatusBar() {
        return this.i;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            p.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            p.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(R.id.content);
        findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            p2 p2Var = parentInterstitialWrapper;
            if (p2Var != null && p2Var.f() != null) {
                p2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finishFromSdk();
            return;
        }
        this.a = AppLovinSdk.getInstance(this).a();
        p2 p2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b f = p2Var2 != null ? p2Var2.f() : null;
        Boolean bool = (Boolean) this.a.a(z4.J4);
        if (f != null) {
            this.i = f.U0();
            this.j = f.S0();
            this.k = f.T0();
            this.l = f.H0();
            this.m = f.L0();
        }
        if (p0.b() && (bool.booleanValue() || this.m)) {
            getWindow().setDecorFitsSystemWindows(false);
            findViewById.setOnApplyWindowInsetsListener(new a(bool));
            configureSystemUiBars(this.i, this.j, this.k, this.l);
        } else {
            findViewById.setFitsSystemWindows(true);
            if (p0.b()) {
                g8.a(findViewById, this.a);
            }
            configureSystemUiBars(this.i, this.j, this.k, this.l);
        }
        if (f != null) {
            g.a(f, this, this.a);
        }
        if (p0.h() && ((Boolean) this.a.a(z4.m6)).booleanValue()) {
            this.f = new c(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinFullscreenActivity.this.c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f);
        }
        a();
        b();
        Integer num = (Integer) this.a.a(z4.L6);
        if (num.intValue() > 0) {
            synchronized (o) {
                Set set = n;
                set.add(this);
                q7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.a.E());
            }
        }
        p2 p2Var3 = parentInterstitialWrapper;
        if (p2Var3 != null) {
            y1.a(p2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.a);
        this.e = aVar;
        bindService(intent, aVar, 1);
        if (p0.f()) {
            String str = this.a.p0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        l lVar = this.a;
        if (lVar != null) {
            if (((Boolean) lVar.a(z4.B2)).booleanValue()) {
                this.a.r0().b(b5.N);
                this.a.r0().b(b5.P);
                this.a.r0().b(b5.Q);
            }
            if (((Boolean) this.a.a(z4.U6)).booleanValue()) {
                stopService(new Intent(this, (Class<?>) AppRestartDuringAdDetectionService.class));
            }
        }
        if (this.g != null) {
            this.a.r0().b(b5.O);
            this.g.a();
            this.g = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.e;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        y1 y1Var = this.b;
        if (y1Var != null) {
            if (y1Var.g()) {
                this.b.r();
            } else {
                long a2 = this.b.a();
                if (a2 >= 0) {
                    if (a2 == 0) {
                        this.b.d(true);
                    }
                    final p2 p2Var = parentInterstitialWrapper;
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLovinFullscreenActivity.this.a(p2Var);
                        }
                    }, a2);
                } else {
                    a(this.b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.s();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        y1 y1Var;
        try {
            super.onResume();
            if (this.c.get() || (y1Var = this.b) == null) {
                return;
            }
            y1Var.t();
        } catch (IllegalArgumentException e) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.a.E().a("AppLovinFullscreenActivity", X3.i.u0, e);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        l lVar = this.a;
        if (lVar != null && ((Boolean) lVar.a(z4.U6)).booleanValue()) {
            if (z) {
                stopService(new Intent(this, (Class<?>) AppRestartDuringAdDetectionService.class));
            } else {
                getApplicationContext().startService(new Intent(getApplicationContext(), (Class<?>) AppRestartDuringAdDetectionService.class));
            }
        }
        if (this.b != null) {
            if (!this.c.getAndSet(false)) {
                this.b.b(z);
            }
            if (z) {
                configureSystemUiBars(this.i, this.j, this.k, this.l);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(y1 y1Var) {
        this.b = y1Var;
    }

    class b implements y1.g {
        b() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            AppLovinFullscreenActivity.this.b = y1Var;
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b f = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            p2.a(f, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            AppLovinFullscreenActivity.this.a.g().a(f2.G, f, hashMap);
        }
    }

    private void b() {
        l lVar = this.a;
        if (lVar == null || !((Boolean) lVar.a(z4.C2)).booleanValue()) {
            return;
        }
        final Long l = (Long) this.a.a(z4.D2);
        this.g = i0.a(l.longValue(), true, this.a, new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinFullscreenActivity.this.a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.q();
        }
        if (q7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        p0.a a2 = p0.a(windowInsets, this.a);
        p0.a c2 = p0.c(windowInsets, this.a);
        p0.a b2 = p0.b(windowInsets, this.a);
        String b3 = q7.b(this);
        p0.a(a2, b3);
        p0.c(c2, b3);
        p0.b(b2, b3);
        y1 y1Var = this.b;
        if (y1Var != null) {
            y1Var.a(a2, c2, b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(p2 p2Var) {
        boolean y = this.b.y();
        boolean i = (p2Var == null || !y) ? false : p2Var.i();
        if (!i) {
            this.b.d(false);
        }
        a(this.b, y, i);
    }

    private String a(l lVar) {
        Integer num = (Integer) lVar.a(z4.e7);
        if (num.intValue() < 0) {
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length <= num.intValue()) {
            return null;
        }
        return stackTrace[num.intValue()].toString();
    }

    private void a(y1 y1Var, boolean z, boolean z2) {
        y1Var.a("activity_destroyed_by_app_relaunch");
        if (this.a != null) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            p2 p2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b f = p2Var != null ? p2Var.f() : null;
            hashMap.putAll(h2.a((AppLovinAdImpl) f));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z2);
            if (f != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", f.T());
                JsonUtils.putInt(jSONObject, "reshow_count_from_render_process_gone", f.U());
            }
            hashMap.put("details", jSONObject.toString());
            this.a.E().d(f2.K0, hashMap);
        }
        y1Var.r();
    }

    private void a() {
        p2 p2Var;
        l lVar = this.a;
        if (lVar == null || !((Boolean) lVar.a(z4.B2)).booleanValue() || (p2Var = parentInterstitialWrapper) == null || p2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b f = parentInterstitialWrapper.f();
        List k = f.k();
        if (CollectionUtils.isEmpty(k)) {
            return;
        }
        e eVar = (e) k.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.a.r0().b(b5.P, jSONObject.toString());
        this.a.r0().b(b5.N, Long.valueOf(System.currentTimeMillis()));
        this.a.r0().b(b5.Q, CollectionUtils.toJsonString(h2.a((AppLovinAdImpl) f), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l) {
        this.h += l.longValue();
        this.a.r0().b(b5.O, Long.valueOf(this.h));
    }
}
