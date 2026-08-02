package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.X3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* loaded from: classes2.dex */
public class l4 {
    private final com.applovin.impl.sdk.l a;
    private final Context b = com.applovin.impl.sdk.l.p();
    private String c;

    public l4(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.b.getResources().openRawResource(R.raw.omsdk_v1_6_2)));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            this.c = sb.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb.append(readLine);
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
            }
        } catch (Throwable th3) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_6_2.js", th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.b);
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("OpenMeasurementService", "Init " + (d() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : X3.i.t) + " and took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
        h();
    }

    private void h() {
        this.a.s0().a((k5) new u6(this.a, "OpenMeasurementService", new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                l4.this.f();
            }
        }), f6.b.OTHER);
    }

    public String a() {
        return this.c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.a.a(z4.b0), AppLovinSdk.VERSION);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.a.p0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.a.a(z4.a0)).booleanValue()) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.l4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    l4.this.g();
                }
            });
        }
    }

    public String a(String str, Map map) {
        String str2;
        try {
            if (e()) {
                String a = m4.a(this.a, map);
                if (StringUtils.isValidString(a)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.c, str2);
        } catch (Throwable th) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
