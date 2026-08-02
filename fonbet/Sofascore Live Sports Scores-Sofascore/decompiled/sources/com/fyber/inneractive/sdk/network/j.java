package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j extends l {
    public final HttpURLConnection g;

    public j(HttpURLConnection httpURLConnection, int i, FilterInputStream filterInputStream, Map map, String str) {
        this.g = httpURLConnection;
        this.a = i;
        this.c = filterInputStream;
        this.d = map;
        this.e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
