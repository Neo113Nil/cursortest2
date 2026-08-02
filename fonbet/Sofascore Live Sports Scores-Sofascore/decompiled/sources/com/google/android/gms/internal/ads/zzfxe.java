package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import defpackage.x3o;
import defpackage.zhg;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfxe extends zzfxa {
    public WebView e;
    public Long f;
    public final Map g;

    public zzfxe(String str, Map map) {
        super(str);
        this.f = null;
        this.g = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final void a() {
        WebView webView = new WebView(zzfwp.b.a);
        this.e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.e.getSettings().setAllowContentAccess(false);
        this.e.getSettings().setAllowFileAccess(false);
        this.e.setWebViewClient(new zhg(this, 3));
        this.b = new zzfyc(this.e);
        zzfwr.b(this.e, null);
        Map map = this.g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final void b() {
        super.b();
        new Handler().postDelayed(new x3o(this), Math.max(4000 - (this.f == null ? 4000L : (System.nanoTime() - this.f.longValue()) / 1000000), 2000L));
        this.e = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final void d(zzfvq zzfvqVar, zzfvo zzfvoVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(zzfvoVar.d);
        Iterator it = unmodifiableMap.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        e(zzfvqVar, zzfvoVar, jSONObject);
    }
}
