package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.f6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class s5 extends k5 {
    private final com.applovin.impl.sdk.network.e g;
    private final AppLovinPostbackListener h;
    private final f6.b i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            s5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (s5.this.h != null) {
                s5.this.h.onPostbackSuccess(s5.this.g.f());
            }
        }
    }

    public s5(com.applovin.impl.sdk.network.e eVar, f6.b bVar, com.applovin.impl.sdk.l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", lVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.g = eVar;
        this.h = appLovinPostbackListener;
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.g, b());
        bVar.a(this.i);
        b().s0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.g.f())) {
            if (this.g.u()) {
                b().z0().a(this.g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    class b extends o6 {
        final String n;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
            this.n = s5.this.g.f();
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, Object obj, int i) {
            if (obj instanceof String) {
                for (String str2 : this.a.c(z4.i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                s0.c(jSONObject, this.a);
                                s0.b(jSONObject, this.a);
                                s0.a(jSONObject, this.a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (s5.this.h != null) {
                s5.this.h.onPostbackSuccess(this.n);
            }
            if (s5.this.g.t()) {
                this.a.u().a(s5.this.g.s(), this.n, i, obj, null, true);
            }
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, Object obj) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to dispatch postback. Error code: " + i + " URL: " + this.n);
            }
            if (s5.this.h != null) {
                s5.this.h.onPostbackFailure(this.n, i);
            }
            if (s5.this.g.t()) {
                this.a.u().a(s5.this.g.s(), this.n, i, obj, str2, false);
            }
        }
    }
}
