package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.B5;
import com.ironsource.C2356c1;
import com.ironsource.C2459he;
import com.ironsource.C2497k;
import com.ironsource.C2515l;
import com.ironsource.C2524l8;
import com.ironsource.C2556n4;
import com.ironsource.C2614q8;
import com.ironsource.C2703v8;
import com.ironsource.C2751y2;
import com.ironsource.InterfaceC2738x7;
import com.ironsource.InterfaceC2747xg;
import com.ironsource.Jb;
import com.ironsource.O9;
import com.ironsource.Pc;
import com.ironsource.X3;
import com.ironsource.bh;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes7.dex */
public class ControllerActivity extends Activity implements Pc, InterfaceC2747xg {
    private static final String o = "ControllerActivity";
    private static final int p = 1;
    private static String q = "removeWebViewContainerView | mContainer is null";
    private static String r = "removeWebViewContainerView | view is null";
    private String a;
    private v b;
    private RelativeLayout c;
    private FrameLayout d;
    private InterfaceC2738x7 e;
    private OnBackInvokedCallback f;
    private String h;
    private C2356c1 l;
    private boolean m;
    private boolean n;
    public int currentRequestedRotation = -1;
    private boolean g = false;
    private Handler i = new Handler();
    private final Runnable j = new a();
    final RelativeLayout.LayoutParams k = new RelativeLayout.LayoutParams(-1, -1);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.g));
        }
    }

    class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.i.removeCallbacks(controllerActivity.j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.i.postDelayed(controllerActivity2.j, 500L);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.EnumC0225v.Gone);
        this.b.F();
        this.b.G();
        this.b.g(this.h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(X3.i.A), intent.getIntExtra(X3.i.B, 0));
    }

    private boolean e() {
        return this.a == null;
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(o, "OnBackInvokedCallback");
        if (C2751y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f);
            Logger.i(o, "OnBackInvokedCallback unregistered");
            this.f = null;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.c == null) {
                throw new Exception(q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.d.getParent();
            View a2 = a(viewGroup2);
            if (a2 == null) {
                throw new Exception(r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) a2.getParent()) != null) {
                viewGroup.removeView(a2);
            }
            viewGroup2.removeView(this.d);
        } catch (Exception e) {
            C2556n4.d().a(e);
            C2703v8.a(C2459he.s, new C2614q8().a(B5.A, e.getMessage()).a());
            Logger.i(o, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    private void j() {
        int L = this.e.L(this);
        String str = o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (L == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (L == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (L == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (L != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void k() {
        int L = this.e.L(this);
        String str = o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (L == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (L == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (L == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (L != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.ironsource.Pc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(o, "onBackPressed");
        if (C2751y2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Pc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = Jb.Y().a();
        try {
            new C2515l(this).a();
            new C2497k(this).a();
            v vVar = (v) O9.b((Context) this).a().k();
            this.b = vVar;
            vVar.s().setId(1);
            this.b.a((Pc) this);
            this.b.a((InterfaceC2747xg) this);
            Intent intent = getIntent();
            this.h = intent.getStringExtra(X3.i.m);
            this.g = intent.getBooleanExtra(X3.i.v, false);
            this.a = intent.getStringExtra("adViewId");
            this.m = false;
            this.n = intent.getBooleanExtra(X3.i.z0, false);
            if (this.g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.c = relativeLayout;
            setContentView(relativeLayout, this.k);
            this.d = a(this.a);
            if (this.c.findViewById(1) == null && this.d.getParent() != null) {
                finish();
            }
            d();
            this.c.addView(this.d, this.k);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (this.m) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.b.y()) {
            this.b.x();
            return true;
        }
        if (this.g && (i == 25 || i == 24)) {
            this.i.removeCallbacks(this.j);
            this.i.postDelayed(this.j, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.Pc
    public void onOrientationChanged(String str, int i) {
        a(str, i);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.i(o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.n) {
                this.b.E();
            }
            this.b.b(false, "main");
            this.b.g(this.h, X3.i.t0);
        }
        if (isFinishing()) {
            this.m = true;
            c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.i(o, X3.i.u0);
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.n) {
                this.b.I();
            }
            this.b.b(true, "main");
            this.b.g(this.h, X3.i.u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.i(o, "onStart");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.i(o, "onStop");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(o, "onUserLeaveHint");
        v vVar = this.b;
        if (vVar != null) {
            vVar.g(this.h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC2747xg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC2747xg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC2747xg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC2747xg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC2747xg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.g && z) {
            runOnUiThread(this.j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            Logger.i(o, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            f();
        } else {
            b();
        }
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.ControllerActivity$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    ControllerActivity.this.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f);
        }
    }

    private void b() {
        runOnUiThread(new d());
    }

    private FrameLayout a(String str) {
        if (!b(str)) {
            return this.b.s();
        }
        return bh.a(getApplicationContext(), C2524l8.a().a(str).getPresentingView());
    }

    private void a(String str, int i) {
        if (str != null) {
            if (X3.i.C.equalsIgnoreCase(str)) {
                j();
                return;
            }
            if (X3.i.D.equalsIgnoreCase(str)) {
                k();
                return;
            }
            if ("device".equalsIgnoreCase(str)) {
                if (this.e.x(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return C2524l8.a().a(this.a).getPresentingView();
    }
}
