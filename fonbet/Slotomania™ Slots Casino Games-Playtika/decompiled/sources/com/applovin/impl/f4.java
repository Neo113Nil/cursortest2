package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class f4 implements i2 {
    private final com.applovin.impl.sdk.l a;
    private final com.applovin.impl.sdk.p b;
    private final AtomicReference c = new AtomicReference();

    public f4(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
    }

    private OkHttpClient a() {
        Object obj = this.c.get();
        if (obj == null) {
            synchronized (this.c) {
                obj = this.c.get();
                if (obj == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long intValue = ((Integer) this.a.a(z4.Y2)).intValue();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    obj = builder.connectTimeout(intValue, timeUnit).readTimeout(((Integer) this.a.a(z4.Z2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                    if (obj == null) {
                        obj = this.c;
                    }
                    this.c.set(obj);
                }
            }
        }
        if (obj == this.c) {
            obj = null;
        }
        return (OkHttpClient) obj;
    }

    @Override // com.applovin.impl.i2
    public InputStream a(String str, Map map) {
        Response execute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int code = execute.code();
        this.a.E().a("loadResource", str, code, execute.message());
        if (s0.a(code)) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody body = execute.body();
        if (body == null) {
            return null;
        }
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", hashMap);
        CollectionUtils.putStringIfValid("details", execute.protocol().name(), hashMap);
        this.a.g().d(f2.R, hashMap);
        return body.byteStream();
    }
}
