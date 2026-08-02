package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookRequestError;
import com.facebook.d0;
import com.facebook.g0;
import com.facebook.k0;
import com.facebook.login.LoginClient;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.internal.publisher.h0;
import defpackage.bf3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "com/facebook/appevents/g", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class LoginMethodHandler implements Parcelable {
    public HashMap a;
    public LoginClient b;

    public LoginMethodHandler(Parcel parcel) {
        HashMap hashMap;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (int i = 0; i < readInt; i++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
        }
        this.a = hashMap != null ? new LinkedHashMap(hashMap) : null;
    }

    public final void a(String str, String str2) {
        HashMap hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.a = hashMap;
        }
    }

    public final String c(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", getC());
            k(jSONObject);
        } catch (JSONException e) {
            e.getMessage();
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final LoginClient d() {
        LoginClient loginClient = this.b;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.i("loginClient");
        throw null;
    }

    /* renamed from: f */
    public abstract String getC();

    public String g() {
        return "fb" + com.facebook.w.b() + "://authorize/";
    }

    public final void h(String str) {
        String b;
        LoginClient.Request request = d().g;
        if (request == null || (b = request.d) == null) {
            b = com.facebook.w.b();
        }
        com.facebook.appevents.l lVar = new com.facebook.appevents.l(d().f(), b);
        Bundle f = bf3.f("fb_web_login_e2e", str);
        f.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        f.putString(MBridgeConstans.APP_ID, b);
        com.facebook.w wVar = com.facebook.w.a;
        if (k0.c()) {
            lVar.g(f, "fb_dialogs_web_login_dialog_complete");
        }
    }

    public boolean i(int i, int i2, Intent intent) {
        return false;
    }

    public final void j(Bundle bundle, LoginClient.Request request) {
        String string = bundle.getString("code");
        if (com.facebook.internal.k0.A(string)) {
            com.facebook.t.a("No code param found from the request");
            return;
        }
        if (string == null) {
            com.facebook.t.a("Failed to create code exchange request");
            return;
        }
        String g = g();
        String str = request.t;
        if (str == null) {
            str = "";
        }
        g.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", string);
        bundle2.putString("client_id", com.facebook.w.b());
        bundle2.putString("redirect_uri", g);
        bundle2.putString("code_verifier", str);
        String str2 = d0.j;
        d0 B = h0.B(null, "oauth/access_token", null);
        B.h = com.facebook.h0.a;
        B.d = bundle2;
        g0 c = B.c();
        FacebookRequestError facebookRequestError = c.c;
        if (facebookRequestError != null) {
            throw new com.facebook.x(facebookRequestError, facebookRequestError.a());
        }
        try {
            JSONObject jSONObject = c.b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || com.facebook.internal.k0.A(string2)) {
                throw new com.facebook.q("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e) {
            throw new com.facebook.q("Fail to process code exchange response: " + e.getMessage());
        }
    }

    public abstract int l(LoginClient.Request request);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        HashMap hashMap = this.a;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public void b() {
    }

    public void k(JSONObject jSONObject) {
    }
}
