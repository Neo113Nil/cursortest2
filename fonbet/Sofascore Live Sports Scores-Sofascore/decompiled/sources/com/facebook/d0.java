package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import defpackage.a70;
import defpackage.ph0;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d0 {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final AccessToken a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public z g;
    public h0 h;
    public boolean i;

    static {
        char[] cArr = {'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(cArr[secureRandom.nextInt(64)]);
        }
        j = sb.toString();
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public d0(AccessToken accessToken, String str, Bundle bundle, h0 h0Var, z zVar) {
        this.a = accessToken;
        this.b = str;
        this.f = null;
        j(zVar);
        this.h = h0Var == null ? h0.a : h0Var;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.f = w.d();
    }

    public static String f() {
        String b = w.b();
        com.facebook.internal.h.k();
        String str = w.h;
        if (str == null) {
            t.a("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            return null;
        }
        if (b.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return b + '|' + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        HashSet hashSet;
        Bundle bundle = this.d;
        String e = e();
        boolean J = e != null ? StringsKt.J(e, "|", false) : false;
        if (e == null || !kotlin.text.c.v(e, "IG", false) || J || !i()) {
            if ((Intrinsics.c(w.e(), "instagram.com") ? true ^ i() : true) || J) {
                String e2 = e();
                if (e2 != null) {
                    bundle.putString("access_token", e2);
                }
                if (!bundle.containsKey("access_token")) {
                    w wVar = w.a;
                    com.facebook.internal.h.k();
                    if (w.h == null) {
                        t.a("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                        return;
                    }
                }
                bundle.putString("sdk", "android");
                bundle.putString("format", "json");
                hashSet = w.b;
                synchronized (hashSet) {
                }
                synchronized (hashSet) {
                }
                return;
            }
        }
        bundle.putString("access_token", f());
        if (!bundle.containsKey("access_token")) {
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        hashSet = w.b;
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z) {
        if (!z && this.h == h0.b) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (com.moloco.sdk.internal.publisher.h0.A(obj)) {
                buildUpon.appendQueryParameter(str2, com.moloco.sdk.internal.publisher.h0.D(obj).toString());
            } else if (this.h != h0.a) {
                a70.p(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String builder = buildUpon.toString();
        builder.getClass();
        return builder;
    }

    public final g0 c() {
        List X = ph0.X(new d0[]{this});
        X.getClass();
        ArrayList v = com.moloco.sdk.internal.publisher.h0.v(new f0(X));
        if (v.size() == 1) {
            return (g0) v.get(0);
        }
        t.a("invalid state: expected a single response");
        return null;
    }

    public final e0 d() {
        List X = ph0.X(new d0[]{this});
        X.getClass();
        f0 f0Var = new f0(X);
        com.facebook.internal.h.i(f0Var);
        e0 e0Var = new e0(f0Var);
        e0Var.executeOnExecutor(w.c(), new Void[0]);
        return e0Var;
    }

    public final String e() {
        Bundle bundle = this.d;
        AccessToken accessToken = this.a;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String str = accessToken.e;
                com.facebook.internal.a0.a.m(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String format;
        String str;
        if (this.h == h0.b && (str = this.b) != null && kotlin.text.c.n(str, "/videos", false)) {
            format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{w.e()}, 1));
        } else {
            String e = w.e();
            e.getClass();
            format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{e}, 1));
        }
        String h = h(format);
        a();
        return b(h, false);
    }

    public final String h(String str) {
        if (!(!Intrinsics.c(w.e(), "instagram.com") ? true : !i())) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{w.s}, 1));
        }
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(w.b());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(z zVar) {
        HashSet hashSet = w.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.g = zVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.h);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
