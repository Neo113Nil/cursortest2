package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.fragment.app.FragmentActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookRequestError;
import com.facebook.internal.k0;
import com.facebook.login.LoginClient;
import defpackage.bm9;
import defpackage.fa4;
import defpackage.ja4;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    @NotNull
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a(0);
    public static boolean i;
    public String d;
    public final String e;
    public final String f;
    public final String g;
    public final com.facebook.j h;

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
        this.g = "custom_tab";
        this.h = com.facebook.j.CHROME_CUSTOM_TAB;
        String bigInteger = new BigInteger(100, new SecureRandom()).toString(32);
        bigInteger.getClass();
        this.e = bigInteger;
        i = false;
        this.f = com.facebook.internal.h.e(super.getF());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.g;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: g, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r9.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(int i2, int i3, Intent intent) {
        LoginClient.Request request;
        String str;
        int parseInt;
        boolean z = false;
        if (intent != null) {
            int i4 = CustomTabMainActivity.c;
        }
        if (i2 == 1 && (request = d().g) != null) {
            if (i3 != -1) {
                s(request, null, new com.facebook.s());
                return false;
            }
            if (intent != null) {
                int i5 = CustomTabMainActivity.c;
                str = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                str = null;
            }
            if (str != null && (kotlin.text.c.v(str, "fbconnect://cct.", false) || kotlin.text.c.v(str, super.getF(), false))) {
                Uri parse = Uri.parse(str);
                Bundle F = k0.F(parse.getQuery());
                F.putAll(k0.F(parse.getFragment()));
                try {
                    String string = F.getString("state");
                    if (string != null) {
                        z = Intrinsics.c(new JSONObject(string).getString("7_challenge"), this.e);
                    }
                } catch (JSONException unused) {
                }
                if (z) {
                    String string2 = F.getString("error");
                    if (string2 == null) {
                        string2 = F.getString("error_type");
                    }
                    String string3 = F.getString("error_msg");
                    if (string3 == null) {
                        string3 = F.getString("error_message");
                    }
                    if (string3 == null) {
                        string3 = F.getString("error_description");
                    }
                    String string4 = F.getString("error_code");
                    if (string4 != null) {
                        try {
                            parseInt = Integer.parseInt(string4);
                        } catch (NumberFormatException unused2) {
                        }
                        if (!k0.A(string2) && k0.A(string3) && parseInt == -1) {
                            if (F.containsKey("access_token")) {
                                s(request, F, null);
                            } else {
                                com.facebook.w.c().execute(new com.appsflyer.internal.p(3, this, request, F));
                            }
                        } else if (string2 == null && (string2.equals("access_denied") || string2.equals("OAuthAccessDeniedException"))) {
                            s(request, null, new com.facebook.s());
                        } else if (parseInt != 4201) {
                            s(request, null, new com.facebook.s());
                        } else {
                            s(request, null, new com.facebook.x(new FacebookRequestError(parseInt, string2, string3), string3));
                        }
                    }
                    parseInt = -1;
                    if (!k0.A(string2)) {
                    }
                    if (string2 == null) {
                    }
                    if (parseInt != 4201) {
                    }
                } else {
                    s(request, null, new com.facebook.q("Invalid state parameter"));
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final void k(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.e);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        fa4 fa4Var;
        fa4 fa4Var2;
        request.getClass();
        int i2 = request.n;
        LoginClient d = d();
        if (this.f.length() == 0) {
            return 0;
        }
        Bundle o = o(request);
        n(o, request);
        if (i) {
            o.putString("cct_over_app_switch", "1");
        }
        if (com.facebook.w.n) {
            if (i2 == 2) {
                fa4 fa4Var3 = b.b;
                Uri a = k0.a(k0.q(), o, "oauth/authorize");
                ReentrantLock reentrantLock = b.d;
                reentrantLock.lock();
                if (b.c == null && (fa4Var2 = b.b) != null) {
                    b.c = fa4Var2.c(null);
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                ja4 ja4Var = b.c;
                if (ja4Var != null) {
                    try {
                        ((bm9) ja4Var.b).S1(ja4Var.c, a, ja4Var.a(null));
                    } catch (RemoteException unused) {
                    }
                }
                reentrantLock.unlock();
            } else {
                fa4 fa4Var4 = b.b;
                Uri a2 = k0.a(k0.o(), o, com.facebook.w.d() + "/dialog/oauth");
                ReentrantLock reentrantLock2 = b.d;
                reentrantLock2.lock();
                if (b.c == null && (fa4Var = b.b) != null) {
                    b.c = fa4Var.c(null);
                }
                reentrantLock2.unlock();
                reentrantLock2.lock();
                ja4 ja4Var2 = b.c;
                if (ja4Var2 != null) {
                    try {
                        ((bm9) ja4Var2.b).S1(ja4Var2.c, a2, ja4Var2.a(null));
                    } catch (RemoteException unused2) {
                    }
                }
                reentrantLock2.unlock();
            }
        }
        FragmentActivity f = d.f();
        if (f == null) {
            return 0;
        }
        Intent intent = new Intent(f, (Class<?>) CustomTabMainActivity.class);
        int i3 = CustomTabMainActivity.c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", o);
        String str = this.d;
        if (str == null) {
            str = com.facebook.internal.h.c();
            this.d = str;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", str);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", com.appsflyer.internal.i.e(i2));
        LoginFragment loginFragment = d.c;
        if (loginFragment != null) {
            loginFragment.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final void n(Bundle bundle, LoginClient.Request request) {
        request.getClass();
        super.n(bundle, request);
        String str = request.f;
        String str2 = request.e;
        if (str2 == null || str2.length() == 0) {
            str2 = (str == null || str.length() == 0) ? this.f : "intent://".concat(str);
        }
        bundle.putString("redirect_uri", str2);
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public final String q() {
        return "chrome_custom_tab";
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* renamed from: r, reason: from getter */
    public final com.facebook.j getH() {
        return this.h;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.e);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.g = "custom_tab";
        this.h = com.facebook.j.CHROME_CUSTOM_TAB;
        this.e = parcel.readString();
        this.f = com.facebook.internal.h.e(super.getF());
    }
}
