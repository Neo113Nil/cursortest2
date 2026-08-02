package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.c0;
import com.facebook.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.cw3;
import defpackage.fc6;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "com/facebook/c0", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LoginClient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new a(5);
    public LoginMethodHandler[] a;
    public int b;
    public LoginFragment c;
    public q d;
    public c0 e;
    public boolean f;
    public Request g;
    public Map h;
    public LinkedHashMap i;
    public r j;
    public int k;
    public int l;

    public final void a(String str, String str2, boolean z) {
        Map map = this.h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.h == null) {
            this.h = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f) {
            return true;
        }
        FragmentActivity f = f();
        if ((f != null ? f.checkCallingOrSelfPermission("android.permission.INTERNET") : -1) == 0) {
            this.f = true;
            return true;
        }
        FragmentActivity f2 = f();
        String string = f2 != null ? f2.getString(R.string.com_facebook_internet_permission_error_title) : null;
        String string2 = f2 != null ? f2.getString(R.string.com_facebook_internet_permission_error_message) : null;
        Request request = this.g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        c(new Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void c(Result result) {
        LoginClient loginClient;
        result.getClass();
        int i = result.a;
        LoginMethodHandler g = g();
        if (g != null) {
            loginClient = this;
            loginClient.i(g.getF(), com.appsflyer.internal.i.c(i), result.d, result.e, g.a);
        } else {
            loginClient = this;
        }
        Map map = loginClient.h;
        if (map != null) {
            result.g = map;
        }
        LinkedHashMap linkedHashMap = loginClient.i;
        if (linkedHashMap != null) {
            result.h = linkedHashMap;
        }
        loginClient.a = null;
        loginClient.b = -1;
        loginClient.g = null;
        loginClient.h = null;
        loginClient.k = 0;
        loginClient.l = 0;
        q qVar = loginClient.d;
        if (qVar != null) {
            LoginFragment loginFragment = (LoginFragment) qVar.a;
            loginFragment.b = null;
            int i2 = i == 2 ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", result);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            FragmentActivity activity = loginFragment.getActivity();
            if (!loginFragment.isAdded() || activity == null) {
                return;
            }
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    public final void d(Result result) {
        Result result2;
        result.getClass();
        AccessToken accessToken = result.b;
        if (accessToken != null) {
            Date date = AccessToken.l;
            if (com.facebook.appevents.g.q()) {
                if (accessToken == null) {
                    com.facebook.t.a("Can't validate without a token");
                    return;
                }
                AccessToken p = com.facebook.appevents.g.p();
                if (p != null) {
                    try {
                        if (Intrinsics.c(p.i, accessToken.i)) {
                            result2 = new Result(this.g, 1, result.b, result.c, null, null);
                            c(result2);
                            return;
                        }
                    } catch (Exception e) {
                        Request request = this.g;
                        String message = e.getMessage();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("Caught exception");
                        if (message != null) {
                            arrayList.add(message);
                        }
                        c(new Result(request, 3, null, null, TextUtils.join(": ", arrayList), null));
                        return;
                    }
                }
                Request request2 = this.g;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("User logged in as different Facebook user.");
                result2 = new Result(request2, 3, null, null, TextUtils.join(": ", arrayList2), null);
                c(result2);
                return;
            }
        }
        c(result);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FragmentActivity f() {
        LoginFragment loginFragment = this.c;
        if (loginFragment != null) {
            return loginFragment.getActivity();
        }
        return null;
    }

    public final LoginMethodHandler g() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.b;
        if (i < 0 || (loginMethodHandlerArr = this.a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1, r3 != null ? r3.d : null) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r h() {
        String b;
        String str;
        r rVar = this.j;
        if (rVar != null) {
            if (!cw3.a.contains(rVar)) {
                try {
                    str = rVar.a;
                } catch (Throwable th) {
                    cw3.a(rVar, th);
                }
                Request request = this.g;
            }
            str = null;
            Request request2 = this.g;
        }
        Context f = f();
        if (f == null) {
            f = com.facebook.w.a();
        }
        Request request3 = this.g;
        if (request3 == null || (b = request3.d) == null) {
            b = com.facebook.w.b();
        }
        rVar = new r(f, b);
        this.j = rVar;
        return rVar;
    }

    public final void i(String str, String str2, String str3, String str4, Map map) {
        Request request = this.g;
        if (request == null) {
            h().b("fb_mobile_login_method_complete", str);
            return;
        }
        r h = h();
        String str5 = request.g;
        String str6 = request.o ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (cw3.a.contains(h)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = r.d;
            Bundle t = f1.t(str5);
            t.putString("2_result", str2);
            if (str3 != null) {
                t.putString("5_error_message", str3);
            }
            if (str4 != null) {
                t.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                t.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            t.putString("3_method", str);
            h.a(t, str6);
        } catch (Throwable th) {
            cw3.a(h, th);
        }
    }

    public final void j(int i, int i2, Intent intent) {
        this.k++;
        if (this.g != null) {
            if (intent != null) {
                int i3 = CustomTabMainActivity.c;
                if (intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                    k();
                    return;
                }
            }
            LoginMethodHandler g = g();
            if (g != null) {
                if ((g instanceof KatanaProxyLoginMethodHandler) && intent == null && this.k < this.l) {
                    return;
                }
                g.i(i, i2, intent);
            }
        }
    }

    public final void k() {
        LoginClient loginClient;
        LoginMethodHandler g = g();
        if (g != null) {
            loginClient = this;
            loginClient.i(g.getF(), "skipped", null, null, g.a);
        } else {
            loginClient = this;
        }
        LoginMethodHandler[] loginMethodHandlerArr = loginClient.a;
        while (loginMethodHandlerArr != null) {
            int i = loginClient.b;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            loginClient.b = i + 1;
            LoginMethodHandler g2 = loginClient.g();
            if (g2 != null) {
                if (!(g2 instanceof WebViewLoginMethodHandler) || loginClient.b()) {
                    Request request = loginClient.g;
                    if (request == null) {
                        continue;
                    } else {
                        int l = g2.l(request);
                        loginClient.k = 0;
                        if (l > 0) {
                            r h = loginClient.h();
                            String str = request.g;
                            String f = g2.getF();
                            String str2 = request.o ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!cw3.a.contains(h)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = r.d;
                                    Bundle t = f1.t(str);
                                    t.putString("3_method", f);
                                    h.a(t, str2);
                                } catch (Throwable th) {
                                    cw3.a(h, th);
                                }
                            }
                            loginClient.l = l;
                        } else {
                            r h2 = loginClient.h();
                            String str3 = request.g;
                            String f2 = g2.getF();
                            String str4 = request.o ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!cw3.a.contains(h2)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = r.d;
                                    Bundle t2 = f1.t(str3);
                                    t2.putString("3_method", f2);
                                    h2.a(t2, str4);
                                } catch (Throwable th2) {
                                    cw3.a(h2, th2);
                                }
                            }
                            loginClient.a("not_tried", g2.getF(), true);
                        }
                        if (l > 0) {
                            return;
                        }
                    }
                } else {
                    loginClient.a("no_internet_permission", "1", false);
                }
            }
        }
        Request request2 = loginClient.g;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            loginClient.c(new Result(request2, 3, null, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        k0.L(parcel, this.h);
        k0.L(parcel, this.i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new p();
        public final int a;
        public final AccessToken b;
        public final AuthenticationToken c;
        public final String d;
        public final String e;
        public final Request f;
        public Map g;
        public HashMap h;

        public Result(Parcel parcel) {
            String readString = parcel.readString();
            readString = readString == null ? "error" : readString;
            int i = 0;
            if (readString == null) {
                yhk.s("Name is null");
            } else if (readString.equals("SUCCESS")) {
                i = 1;
            } else if (readString.equals("CANCEL")) {
                i = 2;
            } else if (readString.equals("ERROR")) {
                i = 3;
            } else {
                a70.p("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(readString));
            }
            this.a = i;
            this.b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.g = k0.H(parcel);
            this.h = k0.H(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.getClass();
            int i2 = this.a;
            if (i2 == 1) {
                str = "SUCCESS";
            } else if (i2 == 2) {
                str = "CANCEL";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str = "ERROR";
            }
            parcel.writeString(str);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
            k0.L(parcel, this.g);
            k0.L(parcel, this.h);
        }

        public Result(Request request, int i, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            if (i != 0) {
                this.f = request;
                this.b = accessToken;
                this.c = authenticationToken;
                this.d = str;
                this.a = i;
                this.e = str2;
                return;
            }
            throw null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Request implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new o();
        public final int a;
        public Set b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public boolean h;
        public final String i;
        public final String j;
        public final String k;
        public String l;
        public boolean m;
        public final int n;
        public boolean o;
        public boolean p;
        public final boolean q;
        public final String r;
        public final String s;
        public final String t;
        public final String u;
        public final int v;

        /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Request(Parcel parcel) {
            int i;
            String readString;
            String readString2;
            int i2;
            String readString3;
            String readString4 = parcel.readString();
            com.facebook.internal.h.j(readString4, "loginBehavior");
            int i3 = 4;
            int i4 = 2;
            int i5 = 0;
            if (readString4 != null) {
                if (readString4.equals("NATIVE_WITH_FALLBACK")) {
                    i = 1;
                } else if (readString4.equals("NATIVE_ONLY")) {
                    i = 2;
                } else if (readString4.equals("KATANA_ONLY")) {
                    i = 3;
                } else if (readString4.equals("WEB_ONLY")) {
                    i = 4;
                } else if (readString4.equals("DIALOG_ONLY")) {
                    i = 5;
                } else if (readString4.equals("DEVICE_AUTH")) {
                    i = 6;
                } else {
                    a70.p("No enum constant com.facebook.login.LoginBehavior.".concat(readString4));
                }
                this.a = i;
                ArrayList arrayList = new ArrayList();
                parcel.readStringList(arrayList);
                this.b = new HashSet(arrayList);
                readString = parcel.readString();
                if (readString != null) {
                    if (readString == null) {
                        yhk.s("Name is null");
                    } else if (!readString.equals("NONE")) {
                        if (readString.equals("ONLY_ME")) {
                            i3 = 2;
                        } else if (readString.equals("FRIENDS")) {
                            i3 = 3;
                        } else if (!readString.equals("EVERYONE")) {
                            a70.p("No enum constant com.facebook.login.DefaultAudience.".concat(readString));
                        }
                        this.c = i3;
                        String readString5 = parcel.readString();
                        com.facebook.internal.h.j(readString5, "applicationId");
                        this.d = readString5;
                        this.e = parcel.readString();
                        this.f = parcel.readString();
                        String readString6 = parcel.readString();
                        com.facebook.internal.h.j(readString6, "authId");
                        this.g = readString6;
                        this.h = parcel.readByte() == 0;
                        this.i = parcel.readString();
                        String readString7 = parcel.readString();
                        com.facebook.internal.h.j(readString7, "authType");
                        this.j = readString7;
                        this.k = parcel.readString();
                        this.l = parcel.readString();
                        this.m = parcel.readByte() == 0;
                        readString2 = parcel.readString();
                        if (readString2 != null) {
                            if (readString2 == null) {
                                yhk.s("Name is null");
                            } else if (!readString2.equals("FACEBOOK")) {
                                if (readString2.equals("INSTAGRAM")) {
                                    i2 = 2;
                                    this.n = i2;
                                    this.o = parcel.readByte() == 0;
                                    this.p = parcel.readByte() == 0;
                                    this.q = parcel.readByte() == 0;
                                    this.r = parcel.readString();
                                    String readString8 = parcel.readString();
                                    com.facebook.internal.h.j(readString8, "nonce");
                                    this.s = readString8;
                                    this.t = parcel.readString();
                                    this.u = parcel.readString();
                                    readString3 = parcel.readString();
                                    if (readString3 != null) {
                                        if (readString3 != null) {
                                            if (readString3.equals("S256")) {
                                                i4 = 1;
                                            } else if (!readString3.equals("PLAIN")) {
                                                a70.p("No enum constant com.facebook.login.CodeChallengeMethod.".concat(readString3));
                                            }
                                            i5 = i4;
                                        } else {
                                            yhk.s("Name is null");
                                        }
                                        i4 = 0;
                                        i5 = i4;
                                    }
                                    this.v = i5;
                                }
                                a70.p("No enum constant com.facebook.login.LoginTargetApp.".concat(readString2));
                            }
                            i2 = 0;
                            this.n = i2;
                            this.o = parcel.readByte() == 0;
                            this.p = parcel.readByte() == 0;
                            this.q = parcel.readByte() == 0;
                            this.r = parcel.readString();
                            String readString82 = parcel.readString();
                            com.facebook.internal.h.j(readString82, "nonce");
                            this.s = readString82;
                            this.t = parcel.readString();
                            this.u = parcel.readString();
                            readString3 = parcel.readString();
                            if (readString3 != null) {
                            }
                            this.v = i5;
                        }
                        i2 = 1;
                        this.n = i2;
                        this.o = parcel.readByte() == 0;
                        this.p = parcel.readByte() == 0;
                        this.q = parcel.readByte() == 0;
                        this.r = parcel.readString();
                        String readString822 = parcel.readString();
                        com.facebook.internal.h.j(readString822, "nonce");
                        this.s = readString822;
                        this.t = parcel.readString();
                        this.u = parcel.readString();
                        readString3 = parcel.readString();
                        if (readString3 != null) {
                        }
                        this.v = i5;
                    }
                    i3 = 0;
                    this.c = i3;
                    String readString52 = parcel.readString();
                    com.facebook.internal.h.j(readString52, "applicationId");
                    this.d = readString52;
                    this.e = parcel.readString();
                    this.f = parcel.readString();
                    String readString62 = parcel.readString();
                    com.facebook.internal.h.j(readString62, "authId");
                    this.g = readString62;
                    this.h = parcel.readByte() == 0;
                    this.i = parcel.readString();
                    String readString72 = parcel.readString();
                    com.facebook.internal.h.j(readString72, "authType");
                    this.j = readString72;
                    this.k = parcel.readString();
                    this.l = parcel.readString();
                    this.m = parcel.readByte() == 0;
                    readString2 = parcel.readString();
                    if (readString2 != null) {
                    }
                    i2 = 1;
                    this.n = i2;
                    this.o = parcel.readByte() == 0;
                    this.p = parcel.readByte() == 0;
                    this.q = parcel.readByte() == 0;
                    this.r = parcel.readString();
                    String readString8222 = parcel.readString();
                    com.facebook.internal.h.j(readString8222, "nonce");
                    this.s = readString8222;
                    this.t = parcel.readString();
                    this.u = parcel.readString();
                    readString3 = parcel.readString();
                    if (readString3 != null) {
                    }
                    this.v = i5;
                }
                i3 = 1;
                this.c = i3;
                String readString522 = parcel.readString();
                com.facebook.internal.h.j(readString522, "applicationId");
                this.d = readString522;
                this.e = parcel.readString();
                this.f = parcel.readString();
                String readString622 = parcel.readString();
                com.facebook.internal.h.j(readString622, "authId");
                this.g = readString622;
                this.h = parcel.readByte() == 0;
                this.i = parcel.readString();
                String readString722 = parcel.readString();
                com.facebook.internal.h.j(readString722, "authType");
                this.j = readString722;
                this.k = parcel.readString();
                this.l = parcel.readString();
                this.m = parcel.readByte() == 0;
                readString2 = parcel.readString();
                if (readString2 != null) {
                }
                i2 = 1;
                this.n = i2;
                this.o = parcel.readByte() == 0;
                this.p = parcel.readByte() == 0;
                this.q = parcel.readByte() == 0;
                this.r = parcel.readString();
                String readString82222 = parcel.readString();
                com.facebook.internal.h.j(readString82222, "nonce");
                this.s = readString82222;
                this.t = parcel.readString();
                this.u = parcel.readString();
                readString3 = parcel.readString();
                if (readString3 != null) {
                }
                this.v = i5;
            }
            yhk.s("Name is null");
            i = 0;
            this.a = i;
            ArrayList arrayList2 = new ArrayList();
            parcel.readStringList(arrayList2);
            this.b = new HashSet(arrayList2);
            readString = parcel.readString();
            if (readString != null) {
            }
            i3 = 1;
            this.c = i3;
            String readString5222 = parcel.readString();
            com.facebook.internal.h.j(readString5222, "applicationId");
            this.d = readString5222;
            this.e = parcel.readString();
            this.f = parcel.readString();
            String readString6222 = parcel.readString();
            com.facebook.internal.h.j(readString6222, "authId");
            this.g = readString6222;
            this.h = parcel.readByte() == 0;
            this.i = parcel.readString();
            String readString7222 = parcel.readString();
            com.facebook.internal.h.j(readString7222, "authType");
            this.j = readString7222;
            this.k = parcel.readString();
            this.l = parcel.readString();
            this.m = parcel.readByte() == 0;
            readString2 = parcel.readString();
            if (readString2 != null) {
            }
            i2 = 1;
            this.n = i2;
            this.o = parcel.readByte() == 0;
            this.p = parcel.readByte() == 0;
            this.q = parcel.readByte() == 0;
            this.r = parcel.readString();
            String readString822222 = parcel.readString();
            com.facebook.internal.h.j(readString822222, "nonce");
            this.s = readString822222;
            this.t = parcel.readString();
            this.u = parcel.readString();
            readString3 = parcel.readString();
            if (readString3 != null) {
            }
            this.v = i5;
        }

        public final boolean a() {
            for (String str : this.b) {
                t tVar = w.b;
                if (str != null && (kotlin.text.c.v(str, "publish", false) || kotlin.text.c.v(str, "manage", false) || w.c.contains(str))) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            parcel.getClass();
            parcel.writeString(com.appsflyer.internal.i.t(this.a));
            parcel.writeStringList(new ArrayList(this.b));
            parcel.writeString(com.appsflyer.internal.i.s(this.c));
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeString(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            int i2 = this.n;
            if (i2 == 1) {
                str = "FACEBOOK";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str = "INSTAGRAM";
            }
            parcel.writeString(str);
            parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeString(this.u);
            int i3 = this.v;
            parcel.writeString(i3 != 0 ? com.appsflyer.internal.i.r(i3) : null);
        }

        public Request(Set set, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
            str2.getClass();
            this.a = 1;
            this.b = set == null ? new HashSet() : set;
            this.c = 3;
            this.j = "rerequest";
            this.d = str;
            this.e = str6;
            this.f = str7;
            this.g = str2;
            this.n = 1;
            if (str3.length() == 0) {
                this.s = fc6.C();
            } else {
                this.s = str3;
            }
            this.t = str4;
            this.u = str5;
            this.v = i;
        }
    }
}
