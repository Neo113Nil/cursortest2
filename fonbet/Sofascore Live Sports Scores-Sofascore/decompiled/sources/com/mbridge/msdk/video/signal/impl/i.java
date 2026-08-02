package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.U3;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i extends b {
    private WebView a;
    private int b = 0;

    public i(WebView webView) {
        this.a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(U3.i.n, U3.i.C);
            } else {
                jSONObject.put(U3.i.n, U3.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.a, U3.i.n, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i) {
        super.a(i);
        this.b = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.b;
    }
}
