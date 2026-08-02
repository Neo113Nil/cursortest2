package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class j2 implements i2 {
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;

    public j2(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
    }

    @Override // com.applovin.impl.i2
    public InputStream a(String str, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.a.a(z4.Y2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.a.a(z4.Z2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int httpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
        this.a.E().a("loadResource", str, httpUrlConnectionGetResponseCode, httpURLConnection.getResponseMessage());
        if (s0.a(httpUrlConnectionGetResponseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream urlConnectionGetInputStream = AppLovinNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", hashMap);
        this.a.g().d(f2.R, hashMap);
        return urlConnectionGetInputStream;
    }
}
