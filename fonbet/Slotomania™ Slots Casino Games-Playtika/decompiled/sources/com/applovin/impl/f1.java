package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.n1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.protocol.App;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.cordova.device.Device;

/* loaded from: classes4.dex */
public class f1 implements n1.a {
    private static WeakReference m;
    private static final AtomicBoolean n = new AtomicBoolean();
    private final com.applovin.impl.sdk.l a;
    private final Context b;
    private final Map c;
    private final e1 e;
    private n1 g;
    private j7 h;
    private int i;
    private boolean j;
    private long k;
    private boolean l;
    private final Object d = new Object();
    private WeakReference f = new WeakReference(null);

    class a extends LinkedHashMap {
        a(int i) {
            super(i);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    class b extends com.applovin.impl.b {
        b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Started Creative Debugger");
                if (!f1.this.h() || f1.m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = f1.m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(f1.this.e, f1.this.a.e());
                }
                f1.n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.p.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = f1.m = null;
            }
        }
    }

    class c implements d.b {
        final /* synthetic */ Object a;

        c(Object obj) {
            this.a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new r1(this.a, f1.this.a.J().b()), f1.this.a);
            f1.n.set(false);
        }
    }

    public f1(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        Context p = com.applovin.impl.sdk.l.p();
        this.b = p;
        this.c = new a(10);
        this.e = new e1(p);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.b, MaxCreativeDebuggerDisplayedAdActivity.class, this.a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.a.E().a(f2.d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.a.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.i = 0;
    }

    private void m() {
        this.a.e().a(new b());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    public boolean g() {
        return ((Boolean) this.a.a(z4.o1)).booleanValue() && this.a.p0().isCreativeDebuggerEnabled();
    }

    public void k() {
        n1 n1Var = this.g;
        if (n1Var != null) {
            n1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.j = ((Boolean) this.a.a(z4.p1)).booleanValue();
            if (this.g == null) {
                this.g = new n1(this.a, this);
            }
            this.g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object a2 = this.a.J().a();
        if (a2 != null) {
            e(a2);
            return;
        }
        synchronized (this.d) {
            arrayList = new ArrayList(this.c.values());
        }
        Collections.reverse(arrayList);
        this.e.a(arrayList, this.a);
        if (!this.l) {
            m();
            this.l = true;
        }
        com.applovin.impl.sdk.p.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.b, MaxCreativeDebuggerActivity.class);
    }

    @Override // com.applovin.impl.n1.a
    public void b() {
        if (this.i == 0) {
            this.h = j7.a(TimeUnit.SECONDS.toMillis(3L), this.a, new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    f1.this.j();
                }
            });
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!y3.a(obj) || c(obj)) {
                String b2 = b(obj);
                synchronized (this.d) {
                    r1 r1Var = (r1) this.c.get(b2);
                    if (r1Var != null) {
                        r1Var.a(obj);
                    } else {
                        this.c.put(b2, new r1(obj, System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof a3 ? ((a3) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.n1.a
    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    f1.this.e();
                }
            });
            this.i = 0;
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f.get() == null && !h()) {
            Activity b2 = this.a.e().b();
            if (b2 == null) {
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View findViewById = b2.findViewById(R.id.content);
                if (findViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) findViewById;
                    final View a2 = a(frameLayout, b2);
                    frameLayout.addView(a2);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    a2.startAnimation(alphaAnimation);
                    final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda0
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            f1.this.a(a2, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            f1.this.a(a2, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                        }
                    }, TimeUnit.SECONDS.toMillis(5L));
                    this.f = new WeakReference(a2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener(null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f = new WeakReference(null);
    }

    public String b(r1 r1Var) {
        com.applovin.impl.sdk.ad.b c2 = r1Var.c();
        a3 e = r1Var.e();
        if (c2 != null) {
            return "json_v3!" + Base64.encodeToString(c2.getOriginalFullResponse().toString().getBytes(), 2);
        }
        if (e != null) {
            return e.E();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a2;
                    a2 = f1.this.a(frameLayout, view, motionEvent);
                    return a2;
                }
            });
        } else {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f1.this.a(view);
                }
            });
        }
        button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        return button;
    }

    private String b(Object obj) {
        String T;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            T = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            T = obj instanceof a3 ? ((a3) obj).T() : null;
        }
        return StringUtils.isValidString(T) ? T : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    f1.this.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(r1 r1Var, Context context, boolean z) {
        String a2 = a(r1Var);
        x2 x2Var = new x2();
        if (z) {
            x2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        x2Var.b(a2);
        String b2 = b(r1Var);
        if (b2 != null) {
            x2Var.a("\nBid Response:\n");
            x2Var.a(b2);
        }
        String str = r1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", x2Var.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", x2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.a.p0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return;
            } catch (ActivityNotFoundException unused) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
                return;
            }
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, createChooser);
    }

    public String a(r1 r1Var) {
        x2 x2Var = new x2();
        x2Var.b("Ad Info:\n");
        a3 e = r1Var.e();
        com.applovin.impl.sdk.ad.b c2 = r1Var.c();
        if (e != null) {
            x2Var.a(e);
        } else if (c2 != null) {
            x2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(c2).b(c2);
        }
        x2Var.a(this.a);
        x2Var.a("Epoch Timestamp (ms)", Long.valueOf(r1Var.b()));
        x2 x2Var2 = new x2();
        Map G = this.a.B().G();
        x2Var2.a("Platform", "fireos".equals(G.get("platform")) ? "Fire OS" : X3.d).a("OS Version", Build.VERSION.RELEASE).a(Device.TAG, String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("App Package Name", this.b.getPackageName()).a("App Version", G.get(App.JsonKeys.APP_VERSION)).a("App Version Code", G.get("app_version_code")).a("User ID", this.a.y0().e() != null ? this.a.y0().e() : "None");
        x2Var.a("\nApp Info:").a(x2Var2.toString());
        x2 x2Var3 = new x2();
        x2Var3.a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(z4.R3)).a("AppLovin Random Token", this.a.j0()).a("Ad Review Version", j.b()).a(a(r1Var.a())).a("MD", this.a.a(z4.t));
        x2Var.a("\nDebug Info:\n").a(w4.b(x2Var3.toString(), q7.a(this.a), w4.a.V2, this.a));
        return x2Var.toString();
    }

    private Bundle a(Object obj) {
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a2 = q7.a(obj);
        Bundle a3 = this.a.k().a(a2);
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("CreativeDebuggerService", "Serve id: " + a2);
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("CreativeDebuggerService", "Public data: " + a3);
        }
        if (a3 == null) {
            return null;
        }
        for (String str : a3.keySet()) {
            Object obj2 = a3.get(str);
            a3.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a3);
        }
        return a3;
    }
}
