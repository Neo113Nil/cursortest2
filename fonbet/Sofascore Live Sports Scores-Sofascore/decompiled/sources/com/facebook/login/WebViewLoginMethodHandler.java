package com.facebook.login;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.k0;
import com.facebook.internal.s0;
import com.facebook.login.LoginClient;
import com.ironsource.U3;
import defpackage.wt3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "com/facebook/login/z", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new a(6);
    public s0 d;
    public String e;
    public final String f;
    public final com.facebook.j g;

    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f = "web_view";
        this.g = com.facebook.j.WEB_VIEW;
        this.e = parcel.readString();
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void b() {
        s0 s0Var = this.d;
        if (s0Var != null) {
            if (s0Var != null) {
                s0Var.cancel();
            }
            this.d = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getC() {
        return this.f;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        FragmentActivity fragmentActivity;
        s0 s0Var;
        Uri a;
        request.getClass();
        String str = request.e;
        Bundle o = o(request);
        n(o, request);
        a0 a0Var = new a0(this, request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            com.facebook.w wVar = com.facebook.w.a;
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        this.e = jSONObject2;
        a("e2e", jSONObject2);
        FragmentActivity f = d().f();
        if (f == null) {
            return 0;
        }
        boolean x = k0.x(f);
        String str2 = request.d;
        str2.getClass();
        com.facebook.internal.h.j(str2, "applicationId");
        String str3 = this.e;
        str3.getClass();
        String str4 = x ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String str5 = request.j;
        str5.getClass();
        int i = request.a;
        if (i == 0) {
            throw null;
        }
        int i2 = request.n;
        if (i2 == 0) {
            throw null;
        }
        boolean z = request.o;
        boolean z2 = request.p;
        boolean z3 = str == null || str.length() == 0;
        if (!o.containsKey("redirect_uri")) {
            o.putString("redirect_uri", str4);
        }
        o.putString("client_id", str2);
        o.putString("e2e", str3);
        o.putString("response_type", i2 == 2 ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        o.putString("return_scopes", "true");
        o.putString("auth_type", str5);
        o.putString("login_behavior", com.appsflyer.internal.i.t(i));
        if (z) {
            o.putString("fx_app", com.appsflyer.internal.i.e(i2));
        }
        if (z2) {
            o.putString("skip_dedupe", "true");
        }
        if (z3) {
            int i3 = s0.m;
            if (i2 == 0) {
                throw null;
            }
            s0.b(f);
            fragmentActivity = f;
            s0Var = new s0(fragmentActivity, "oauth", o, i2, a0Var);
        } else {
            int i4 = z.o;
            str.getClass();
            if (i2 == 0) {
                throw null;
            }
            Bundle bundle = new Bundle(o);
            bundle.putString(U3.i.d, "touch");
            bundle.putString("client_id", com.facebook.w.b());
            bundle.putString("sdk", "android-18.3.0");
            if (y.a[wt3.C(i2)] == 1) {
                a = k0.a(k0.q(), bundle, "oauth/authorize");
            } else {
                a = k0.a(k0.o(), bundle, com.facebook.w.d() + "/dialog/oauth");
            }
            s0.b(f);
            String uri = a.toString();
            uri.getClass();
            z zVar = new z(f, uri, str);
            zVar.c = a0Var;
            fragmentActivity = f;
            s0Var = zVar;
        }
        this.d = s0Var;
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.q = this.d;
        facebookDialogFragment.p(fragmentActivity.k(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r, reason: from getter */
    public final com.facebook.j getG() {
        return this.g;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }

    public WebViewLoginMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
        this.f = "web_view";
        this.g = com.facebook.j.WEB_VIEW;
    }
}
