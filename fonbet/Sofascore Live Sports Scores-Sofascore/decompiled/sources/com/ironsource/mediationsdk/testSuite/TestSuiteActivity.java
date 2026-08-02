package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C3990ag;
import com.ironsource.C4157k4;
import com.ironsource.Mf;
import com.ironsource.P8;
import com.ironsource.Vf;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.i7j;
import defpackage.j7j;
import defpackage.k7j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class TestSuiteActivity extends Activity implements P8 {
    private RelativeLayout a;
    private C3990ag b;
    private Vf c;

    @Nullable
    private OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets windowInsets) {
        int i;
        int i2;
        view.getClass();
        windowInsets.getClass();
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        insets.getClass();
        i = insets.top;
        i2 = insets.bottom;
        view.setPadding(0, i, 0, i2);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity) {
        testSuiteActivity.getClass();
        C3990ag c3990ag = testSuiteActivity.b;
        if (c3990ag == null) {
            Intrinsics.i("mWebViewWrapper");
            throw null;
        }
        if (c3990ag.c().getParent() == null) {
            RelativeLayout relativeLayout = testSuiteActivity.a;
            if (relativeLayout == null) {
                Intrinsics.i("mContainer");
                throw null;
            }
            C3990ag c3990ag2 = testSuiteActivity.b;
            if (c3990ag2 == null) {
                Intrinsics.i("mWebViewWrapper");
                throw null;
            }
            relativeLayout.removeView(c3990ag2.d());
            RelativeLayout relativeLayout2 = testSuiteActivity.a;
            if (relativeLayout2 == null) {
                Intrinsics.i("mContainer");
                throw null;
            }
            C3990ag c3990ag3 = testSuiteActivity.b;
            if (c3990ag3 == null) {
                Intrinsics.i("mWebViewWrapper");
                throw null;
            }
            relativeLayout2.addView(c3990ag3.c(), testSuiteActivity.e());
            C3990ag c3990ag4 = testSuiteActivity.b;
            if (c3990ag4 != null) {
                c3990ag4.b();
            } else {
                Intrinsics.i("mWebViewWrapper");
                throw null;
            }
        }
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject d() {
        String b = new Mf().b(this);
        if (b != null) {
            try {
                if (b.length() != 0) {
                    return new JSONObject(b);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private final RelativeLayout.LayoutParams e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.a;
            if (relativeLayout == null) {
                Intrinsics.i("mContainer");
                throw null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new i7j());
            RelativeLayout relativeLayout2 = this.a;
            if (relativeLayout2 != null) {
                relativeLayout2.requestApplyInsets();
            } else {
                Intrinsics.i("mContainer");
                throw null;
            }
        }
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.i("mContainer");
        throw null;
    }

    @Override // com.ironsource.P8
    public void onClosed() {
        runOnUiThread(new k7j(this, 0));
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C3990ag c3990ag = new C3990ag(this, this, d(), c());
        this.b = c3990ag;
        Vf vf = new Vf(c3990ag);
        this.c = vf;
        vf.d();
        RelativeLayout relativeLayout2 = this.a;
        if (relativeLayout2 == null) {
            Intrinsics.i("mContainer");
            throw null;
        }
        C3990ag c3990ag2 = this.b;
        if (c3990ag2 == null) {
            Intrinsics.i("mWebViewWrapper");
            throw null;
        }
        relativeLayout2.addView(c3990ag2.d(), e());
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        f();
        Vf vf = this.c;
        if (vf == null) {
            Intrinsics.i("mNativeBridge");
            throw null;
        }
        vf.a();
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            Intrinsics.i("mContainer");
            throw null;
        }
        relativeLayout.removeAllViews();
        C3990ag c3990ag = this.b;
        if (c3990ag == null) {
            Intrinsics.i("mWebViewWrapper");
            throw null;
        }
        c3990ag.a();
        super.onDestroy();
    }

    @Override // com.ironsource.P8
    public void onUIReady() {
        runOnUiThread(new k7j(this, 1));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            j7j j7jVar = new j7j();
            this.d = j7jVar;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, j7jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity) {
        testSuiteActivity.getClass();
        testSuiteActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }
}
