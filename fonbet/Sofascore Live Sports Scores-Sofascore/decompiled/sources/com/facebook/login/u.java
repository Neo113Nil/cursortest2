package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.login.LoginClient;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.a70;
import defpackage.cw3;
import defpackage.np2;
import defpackage.yd;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class u extends yd {
    public final com.facebook.internal.g a;
    public final /* synthetic */ w b;

    public u(w wVar, com.facebook.internal.g gVar) {
        this.b = wVar;
        this.a = gVar;
    }

    @Override // defpackage.yd
    public final Intent a(Context context, Object obj) {
        int i;
        String str;
        Collection collection = (Collection) obj;
        collection.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(86) + 43;
        ArrayList x0 = CollectionsKt.x0(CollectionsKt.x0(CollectionsKt.x0(CollectionsKt.x0(CollectionsKt.w0(new np2('0', '9'), CollectionsKt.u0(new np2('a', 'z'), new np2('A', 'Z'))), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(nextInt);
        for (int i2 = 0; i2 < nextInt; i2++) {
            Character ch = (Character) x0.get(secureRandom.nextInt(x0.size()));
            ch.getClass();
            arrayList.add(ch);
        }
        String f0 = CollectionsKt.f0(arrayList, "", null, null, null, 62);
        if (!(uuid.length() == 0 ? false : !(StringsKt.O(uuid, ' ', 0, 6) >= 0)) || !com.facebook.appevents.j.t(f0)) {
            a70.p("Failed requirement.");
            return null;
        }
        HashSet hashSet = new HashSet(collection);
        hashSet.add("openid");
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        unmodifiableSet.getClass();
        try {
            str = com.facebook.appevents.j.p(f0);
            i = 1;
        } catch (com.facebook.q unused) {
            i = 2;
            str = f0;
        }
        Set W0 = CollectionsKt.W0(unmodifiableSet);
        String b = com.facebook.w.b();
        String uuid2 = UUID.randomUUID().toString();
        uuid2.getClass();
        com.facebook.internal.h.k();
        String str2 = com.facebook.w.f;
        String str3 = str2 == null ? "" : str2;
        com.facebook.internal.h.k();
        String str4 = com.facebook.w.g;
        LoginClient.Request request = new LoginClient.Request(W0, b, uuid2, uuid, f0, str, i, str3, str4 == null ? "" : str4);
        Date date = AccessToken.l;
        request.h = com.facebook.appevents.g.q();
        request.l = null;
        request.m = false;
        request.o = false;
        request.p = false;
        r a = v.a.a(context);
        String str5 = request.o ? "foa_mobile_login_start" : "fb_mobile_login_start";
        if (!cw3.a.contains(a)) {
            try {
                ScheduledExecutorService scheduledExecutorService = r.d;
                Bundle t = f1.t(request.g);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", "NATIVE_WITH_FALLBACK");
                    jSONObject.put("request_code", com.appsflyer.internal.i.a(1));
                    jSONObject.put("permissions", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, request.b));
                    jSONObject.put("default_audience", com.appsflyer.internal.i.s(request.c));
                    jSONObject.put("isReauthorize", request.h);
                    String str6 = a.c;
                    if (str6 != null) {
                        jSONObject.put("facebookVersion", str6);
                    }
                    int i3 = request.n;
                    if (i3 != 0) {
                        jSONObject.put("target_app", com.appsflyer.internal.i.e(i3));
                    }
                    t.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused2) {
                }
                a.a(t, str5);
            } catch (Throwable th) {
                cw3.a(a, th);
            }
        }
        Intent intent = new Intent();
        intent.setClass(com.facebook.w.a(), FacebookActivity.class);
        intent.setAction(com.appsflyer.internal.i.t(request.a));
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (com.facebook.w.a().getPackageManager().resolveActivity(intent, 0) != null) {
            return intent;
        }
        com.facebook.q qVar = new com.facebook.q("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        w.a(context, 3, null, qVar, false, request);
        throw qVar;
    }

    @Override // defpackage.yd
    public final Object c(Intent intent, int i) {
        s sVar;
        this.b.c(i, intent, null);
        int a = com.appsflyer.internal.i.a(1);
        com.facebook.internal.g gVar = this.a;
        if (gVar != null) {
            s sVar2 = (s) gVar.a.get(Integer.valueOf(a));
            if (sVar2 != null) {
                sVar2.a.c(i, intent, sVar2.b);
            } else {
                synchronized (com.facebook.internal.g.b) {
                    sVar = (s) com.facebook.internal.g.c.get(Integer.valueOf(a));
                }
                if (sVar != null) {
                    sVar.a.c(i, intent, sVar.b);
                }
            }
        }
        return new com.facebook.l(a, i, intent);
    }
}
