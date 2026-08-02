package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ironsource.C4267cg;
import com.ironsource.C4452n4;
import com.ironsource.Of;
import com.ironsource.S8;
import com.ironsource.Xf;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;
import xsna.n93;
import xsna.o93;
import xsna.vao0;
import xsna.wao0;

/* loaded from: classes13.dex */
public final class TestSuiteActivity extends Activity implements S8 {
    private RelativeLayout a;
    private C4267cg b;
    private Xf c;
    private OnBackInvokedCallback d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets windowInsets) {
        int systemBars;
        Insets insets;
        int i;
        int i2;
        systemBars = WindowInsets.Type.systemBars();
        insets = windowInsets.getInsets(systemBars);
        i = insets.top;
        i2 = insets.bottom;
        view.setPadding(0, i, 0, i2);
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }

    private final JSONObject d() {
        String b = new Of().b(this);
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
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.a;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new vao0());
            RelativeLayout relativeLayout2 = this.a;
            (relativeLayout2 != null ? relativeLayout2 : null).requestApplyInsets();
        }
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            return null;
        }
        return relativeLayout;
    }

    @Override // com.ironsource.S8
    public void onClosed() {
        runOnUiThread(new n93(this, 8));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C4267cg c4267cg = new C4267cg(this, this, d(), c());
        this.b = c4267cg;
        Xf xf = new Xf(c4267cg);
        this.c = xf;
        xf.d();
        RelativeLayout relativeLayout2 = this.a;
        if (relativeLayout2 == null) {
            relativeLayout2 = null;
        }
        C4267cg c4267cg2 = this.b;
        relativeLayout2.addView((c4267cg2 != null ? c4267cg2 : null).d(), e());
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        f();
        Xf xf = this.c;
        if (xf == null) {
            xf = null;
        }
        xf.a();
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        C4267cg c4267cg = this.b;
        (c4267cg != null ? c4267cg : null).a();
        super.onDestroy();
    }

    @Override // com.ironsource.S8
    public void onUIReady() {
        runOnUiThread(new o93(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity) {
        C4267cg c4267cg = testSuiteActivity.b;
        if (c4267cg == null) {
            c4267cg = null;
        }
        if (c4267cg.c().getParent() == null) {
            RelativeLayout relativeLayout = testSuiteActivity.a;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            C4267cg c4267cg2 = testSuiteActivity.b;
            if (c4267cg2 == null) {
                c4267cg2 = null;
            }
            relativeLayout.removeView(c4267cg2.d());
            RelativeLayout relativeLayout2 = testSuiteActivity.a;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            C4267cg c4267cg3 = testSuiteActivity.b;
            if (c4267cg3 == null) {
                c4267cg3 = null;
            }
            relativeLayout2.addView(c4267cg3.c(), testSuiteActivity.e());
            C4267cg c4267cg4 = testSuiteActivity.b;
            (c4267cg4 != null ? c4267cg4 : null).b();
        }
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    private final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            wao0 wao0Var = new wao0();
            this.d = wao0Var;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, wao0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity) {
        testSuiteActivity.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
