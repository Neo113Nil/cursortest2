package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.f5p;
import defpackage.okn;
import defpackage.rfn;
import defpackage.rha;
import defpackage.ujg;
import defpackage.v3p;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class HsdpShimActivity extends Activity {
    public String a = null;
    public boolean b = false;

    public final void a(boolean z) {
        HashMap hashMap;
        okn oknVar;
        IBinder windowToken = getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            a70.r("windowToken is null");
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("target_package_name");
        if (stringExtra == null) {
            a70.r("targetPackageName is null");
            return;
        }
        v3p N = f5p.N(this, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        if (z || !stringExtra.equals(this.a) || (oknVar = (okn) ((rfn) N).c.get(stringExtra)) == null || oknVar.a != 2) {
            this.a = stringExtra;
            this.b = false;
            String stringExtra2 = intent.getStringExtra(Payload.RFR);
            if (stringExtra2 == null) {
                a70.r("referrer is null");
                return;
            }
            String stringExtra3 = intent.getStringExtra("deeplink_url");
            if (stringExtra3 == null) {
                a70.r("deeplinkUrl is null");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("auto_trigger", false);
            Bundle bundleExtra = intent.getBundleExtra("extra_query_params_bundle");
            if (bundleExtra != null) {
                hashMap = new HashMap();
                for (String str : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str, string);
                }
            } else {
                hashMap = null;
            }
            ((rfn) N).a(stringExtra, stringExtra3, windowToken, rha.F(this, getResources().getConfiguration().screenWidthDp), rha.G(this), booleanExtra, new ujg(this, stringExtra, stringExtra2, hashMap, 29));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hsdp_shim_activity);
        Window window = getWindow();
        window.setLayout(-1, -1);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        a(false);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
