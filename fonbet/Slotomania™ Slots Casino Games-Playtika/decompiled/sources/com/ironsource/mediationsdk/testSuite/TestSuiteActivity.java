package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C2556n4;
import com.ironsource.Lf;
import com.ironsource.R8;
import com.ironsource.Uf;
import com.ironsource.Zf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.h;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class TestSuiteActivity extends Activity implements R8 {
    private RelativeLayout a;
    private Zf b;
    private Uf c;
    private OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final JSONObject d() {
        String b = new Lf().b(this);
        if (b != null) {
            try {
                if (b.length() != 0) {
                    return IronSourceNetworkBridge.jsonObjectInit(b);
                }
            } catch (Exception unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }
        return IronSourceNetworkBridge.jsonObjectInit();
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
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.a;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets a;
                    a = TestSuiteActivity.a(view, windowInsets);
                    return a;
                }
            });
            RelativeLayout relativeLayout3 = this.a;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            } else {
                relativeLayout2 = relativeLayout3;
            }
            relativeLayout2.requestApplyInsets();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(h.f, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.R8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.a(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        Zf zf = new Zf(this, this, d(), c());
        this.b = zf;
        Uf uf = new Uf(zf);
        this.c = uf;
        uf.d();
        RelativeLayout relativeLayout2 = this.a;
        Zf zf2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        Zf zf3 = this.b;
        if (zf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            zf2 = zf3;
        }
        relativeLayout2.addView(zf2.d(), e());
        a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        f();
        Uf uf = this.c;
        Zf zf = null;
        if (uf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            uf = null;
        }
        uf.a();
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        Zf zf2 = this.b;
        if (zf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            zf = zf2;
        }
        zf.a();
        super.onDestroy();
    }

    @Override // com.ironsource.R8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.b(TestSuiteActivity.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Zf zf = this$0.b;
        Zf zf2 = null;
        if (zf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            zf = null;
        }
        if (zf.c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            Zf zf3 = this$0.b;
            if (zf3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                zf3 = null;
            }
            relativeLayout.removeView(zf3.d());
            RelativeLayout relativeLayout2 = this$0.a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            Zf zf4 = this$0.b;
            if (zf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                zf4 = null;
            }
            relativeLayout2.addView(zf4.c(), this$0.e());
            Zf zf5 = this$0.b;
            if (zf5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                zf2 = zf5;
            }
            zf2.b();
        }
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    TestSuiteActivity.b();
                }
            };
            this.d = onBackInvokedCallback;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }
}
