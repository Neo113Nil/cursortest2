package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.z0;
import com.fyber.inneractive.sdk.web.v0;
import com.ironsource.C4427z5;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r {
    public final z0 a;
    public Context b;
    public String c;
    public final boolean d;
    public o e;
    public h1 i;
    public v0 k;
    public boolean l;
    public com.fyber.inneractive.sdk.ignite.m m;
    public volatile boolean f = false;
    public long h = 0;
    public final ArrayList j = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final boolean n = IAConfigManager.N.t.b.a(false, "should_decode_url");

    public r(boolean z, x xVar) {
        this.d = true;
        this.d = z;
        this.a = new z0(xVar);
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.b = context;
        this.c = str;
        this.e = oVar;
        this.l = z;
        this.h = System.currentTimeMillis();
        this.k = v0Var;
        this.m = mVar;
        b a = a(this.c);
        IAlog.d("%s EVENT_CLICK %s %s", "VAST_EVENT", a, str);
        if (a == null) {
            String str3 = this.c;
            try {
                try {
                    uri = this.n ? !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, C4427z5.O)) : Uri.parse(str3) : h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, C4427z5.O)) : Uri.parse(str3);
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String uri2 = uri.toString();
                    h1 h1Var = new h1(new m(this, uri2, str2), uri2);
                    this.i = h1Var;
                    IAConfigManager.N.r.a(h1Var);
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e);
                this.g.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e));
            }
        }
    }

    public final b a(String str) {
        Uri uri;
        z0 z0Var;
        boolean z;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.g.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.j.isEmpty()) {
            this.g.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a(uri, this)) {
                Context context = this.b;
                b a = context != null ? aVar.a(context, uri, this.g) : null;
                if (a != null) {
                    if (a.a == q.OPEN_GOOGLE_STORE && !(z = (z0Var = this.a).c) && !z) {
                        z0Var.c = true;
                        z0Var.b = System.currentTimeMillis();
                        com.fyber.inneractive.sdk.config.e eVar = IAConfigManager.N.w.b;
                        if (eVar != null) {
                            eVar.a.add(z0Var);
                        }
                    }
                    return a(a);
                }
            }
        }
        return null;
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.g.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.g.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (rVar.d) {
            Intent intent = new Intent(rVar.b, (Class<?>) InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.b instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = rVar.b;
                if (context != null) {
                    context.startActivity(intent);
                }
                ArrayList arrayList = rVar.g;
                boolean z = exc == null;
                q qVar = q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new j(str2, z, qVar, v.a(exc)));
                rVar.a(new b(str2, qVar, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                rVar.g.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.g.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.g;
        bVar.f.clear();
        bVar.f.addAll(arrayList);
        bVar.e = System.currentTimeMillis() - this.h;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.b.post(new n(this, bVar));
        return bVar;
    }
}
