package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.k0;
import com.facebook.login.LoginClient;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/WebLoginMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public String c;

    public void n(Bundle bundle, LoginClient.Request request) {
        request.getClass();
        int i = request.n;
        String str = request.e;
        if (str == null || str.length() == 0) {
            str = g();
        }
        bundle.putString("redirect_uri", str);
        boolean z = i == 2;
        String str2 = request.d;
        if (z) {
            bundle.putString(MBridgeConstans.APP_ID, str2);
        } else {
            bundle.putString("client_id", str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            com.facebook.w wVar = com.facebook.w.a;
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        bundle.putString("e2e", jSONObject2);
        if (i == 2) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.b.contains("openid")) {
                bundle.putString("nonce", request.s);
            }
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundle.putString("code_challenge", request.u);
        int i2 = request.v;
        bundle.putString("code_challenge_method", i2 != 0 ? com.appsflyer.internal.i.r(i2) : null);
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.j);
        bundle.putString("login_behavior", com.appsflyer.internal.i.t(request.a));
        com.facebook.w wVar2 = com.facebook.w.a;
        bundle.putString("sdk", "android-18.3.0");
        if (q() != null) {
            bundle.putString("sso", q());
        }
        bundle.putString("cct_prefetching", com.facebook.w.n ? "1" : "0");
        if (request.o) {
            bundle.putString("fx_app", com.appsflyer.internal.i.e(i));
        }
        if (request.p) {
            bundle.putString("skip_dedupe", "true");
        }
        if (request.q) {
            bundle.putString("force_confirmation", "true");
        }
        String str3 = request.r;
        if (str3 != null && str3.length() != 0) {
            bundle.putString("android_sso_context", request.r);
        }
        String str4 = request.l;
        if (str4 != null) {
            bundle.putString("messenger_page_id", str4);
            bundle.putString("reset_messenger_state", request.m ? "1" : "0");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle o(LoginClient.Request request) {
        request.getClass();
        Bundle bundle = new Bundle();
        Set set = request.b;
        if (set != null && !set.isEmpty()) {
            String join = TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, request.b);
            bundle.putString("scope", join);
            a("scope", join);
        }
        int i = request.c;
        if (i == 0) {
            i = 1;
        }
        bundle.putString("default_audience", com.appsflyer.internal.i.d(i));
        bundle.putString("state", c(request.g));
        Date date = AccessToken.l;
        AccessToken p = com.facebook.appevents.g.p();
        String str = p != null ? p.e : null;
        if (str != null) {
            Context f = d().f();
            if (f == null) {
                f = com.facebook.w.a();
            }
            if (str.equals(f.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
                bundle.putString("access_token", str);
                a("access_token", "1");
                bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
                com.facebook.w wVar = com.facebook.w.a;
                bundle.putString("ies", k0.c() ? "1" : "0");
                return bundle;
            }
        }
        FragmentActivity f2 = d().f();
        if (f2 != null) {
            com.facebook.internal.k0.c(f2);
        }
        a("access_token", "0");
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        com.facebook.w wVar2 = com.facebook.w.a;
        bundle.putString("ies", k0.c() ? "1" : "0");
        return bundle;
    }

    public String q() {
        return null;
    }

    /* renamed from: r */
    public abstract com.facebook.j getG();

    public final void s(LoginClient.Request request, Bundle bundle, com.facebook.q qVar) {
        LoginClient.Result result;
        LoginClient.Result result2;
        request.getClass();
        LoginClient d = d();
        String str = null;
        this.c = null;
        String str2 = request.e;
        if (str2 != null && str2.length() != 0 && !Intrinsics.c(str2, g())) {
            if (qVar instanceof com.facebook.s) {
                d.d(new LoginClient.Result(d.g, 2, null, null, "User canceled log in.", null));
                return;
            }
            if (qVar != null) {
                this.c = null;
                String message = qVar.getMessage();
                if (qVar instanceof com.facebook.x) {
                    FacebookRequestError facebookRequestError = ((com.facebook.x) qVar).b;
                    str = String.valueOf(facebookRequestError.b);
                    message = facebookRequestError.toString();
                }
                String str3 = str;
                LoginClient.Request request2 = d.g;
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                d.d(new LoginClient.Result(request2, 3, null, null, TextUtils.join(": ", arrayList), str3));
                return;
            }
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.c = bundle.getString("e2e");
            }
            try {
                AccessToken k = com.facebook.appevents.g.k(request.b, bundle, getG(), request.d);
                result2 = new LoginClient.Result(d.g, 1, k, com.facebook.appevents.g.l(bundle, request.s), null, null);
                if (d.f() != null) {
                    try {
                        CookieSyncManager.createInstance(d.f()).sync();
                    } catch (Exception unused) {
                    }
                    if (k != null) {
                        String str4 = k.e;
                        Context f = d().f();
                        if (f == null) {
                            f = com.facebook.w.a();
                        }
                        f.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str4).apply();
                    }
                }
            } catch (com.facebook.q e) {
                LoginClient.Request request3 = d.g;
                String message2 = e.getMessage();
                ArrayList arrayList2 = new ArrayList();
                if (message2 != null) {
                    arrayList2.add(message2);
                }
                result = new LoginClient.Result(request3, 3, null, null, TextUtils.join(": ", arrayList2), null);
            }
        } else if (qVar instanceof com.facebook.s) {
            result2 = new LoginClient.Result(d.g, 2, null, null, "User canceled log in.", null);
        } else {
            this.c = null;
            String message3 = qVar != null ? qVar.getMessage() : null;
            if (qVar instanceof com.facebook.x) {
                FacebookRequestError facebookRequestError2 = ((com.facebook.x) qVar).b;
                str = String.valueOf(facebookRequestError2.b);
                message3 = facebookRequestError2.toString();
            }
            String str5 = str;
            LoginClient.Request request4 = d.g;
            ArrayList arrayList3 = new ArrayList();
            if (message3 != null) {
                arrayList3.add(message3);
            }
            result = new LoginClient.Result(request4, 3, null, null, TextUtils.join(": ", arrayList3), str5);
            result2 = result;
        }
        if (!com.facebook.internal.k0.A(this.c)) {
            h(this.c);
        }
        d.d(result2);
    }
}
