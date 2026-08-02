package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import okhttp3.p;
import xsna.f8f0;

/* loaded from: classes14.dex */
public final class j1 extends s0 {
    final MyTrackerConfig.OkHttpClientProvider a;

    public j1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.a = okHttpClientProvider;
    }

    @Override // com.my.tracker.obfuscated.s0
    public s0.b a(String str) {
        s0.b d = s0.b.d();
        okhttp3.u uVar = null;
        uVar = null;
        try {
            x2.a("OkHttpGetRequest: send request to " + str);
            p.a aVar = new p.a();
            aVar.i(str);
            aVar.d();
            try {
                okhttp3.u execute = ((f8f0) this.a.getOkHttpClient().a(aVar.b())).execute();
                try {
                    int i = execute.e;
                    if (i == 200) {
                        x2.a("OkHttpGetRequest: response successfully received");
                        d.a = true;
                    } else {
                        x2.a("OkHttpGetRequest error: response code " + i);
                        d.a = false;
                    }
                    if (i == 200) {
                        x2.a("OkHttpGetRequest: processing server response");
                        okhttp3.v vVar = execute.h;
                        String string = vVar != null ? vVar.string() : null;
                        if (TextUtils.isEmpty(string)) {
                            x2.a("OkHttpGetRequest: response data is empty");
                        } else {
                            d.b = string;
                        }
                    }
                    execute.close();
                    return d;
                } catch (Throwable th) {
                    th = th;
                    uVar = execute;
                    try {
                        x2.a("OkHttpGetRequest error: error while sending data", th);
                        d.a = false;
                        d.c = "OkHttpGetRequest error: error while sending data";
                        return d;
                    } finally {
                        if (uVar != null) {
                            uVar.close();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
