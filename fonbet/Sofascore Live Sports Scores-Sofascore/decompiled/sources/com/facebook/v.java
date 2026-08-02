package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.cw3;
import defpackage.yd0;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                String str = (String) this.c;
                w wVar = w.a;
                if (cw3.a.contains(wVar)) {
                    return;
                }
                try {
                    com.facebook.internal.c b = com.facebook.internal.h.b(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String concat = str.concat("ping");
                    long j = sharedPreferences.getLong(concat, 0L);
                    try {
                        JSONObject a = zd0.a(yd0.a, b, com.facebook.appevents.g.o(context), w.f(context), context);
                        String r = com.facebook.appevents.j.r();
                        if (r != null) {
                            a.put("install_referrer", r);
                        }
                        String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                        w.t.getClass();
                        String str2 = d0.j;
                        d0 C = com.moloco.sdk.internal.publisher.h0.C(null, format, a, null);
                        if (j == 0 && C.c().c == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(concat, System.currentTimeMillis());
                            edit.apply();
                            b bVar = com.facebook.internal.a0.a;
                            synchronized (w.b) {
                            }
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        throw new q("An error occurred while publishing install.", e);
                    }
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    cw3.a(wVar, th);
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                f0 f0Var = (f0) this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    z zVar = (z) pair.first;
                    Object obj = pair.second;
                    obj.getClass();
                    zVar.a((g0) obj);
                }
                Iterator it2 = f0Var.c.iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).a.run();
                }
                return;
            case 2:
                com.facebook.appevents.b bVar2 = (com.facebook.appevents.b) this.b;
                com.facebook.appevents.e eVar = (com.facebook.appevents.e) this.c;
                if (cw3.a.contains(com.facebook.appevents.i.class)) {
                    return;
                }
                try {
                    bVar2.getClass();
                    c0 c0Var = com.facebook.appevents.i.a;
                    synchronized (c0Var) {
                        com.facebook.appevents.t k = c0Var.k(bVar2);
                        if (k != null) {
                            k.a(eVar);
                        }
                    }
                    if (com.facebook.appevents.j.q() != 2 && com.facebook.appevents.i.a.j() > 100) {
                        com.facebook.appevents.i.d(5);
                        return;
                    } else {
                        if (com.facebook.appevents.i.c == null) {
                            com.facebook.appevents.i.c = com.facebook.appevents.i.b.schedule(com.facebook.appevents.i.d, 15L, TimeUnit.SECONDS);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    cw3.a(com.facebook.appevents.i.class, th2);
                    return;
                }
            case 3:
                com.facebook.appevents.b bVar3 = (com.facebook.appevents.b) this.b;
                com.facebook.appevents.t tVar = (com.facebook.appevents.t) this.c;
                if (cw3.a.contains(com.facebook.appevents.i.class)) {
                    return;
                }
                try {
                    com.facebook.appevents.j.w(bVar3, tVar);
                    return;
                } catch (Throwable th3) {
                    cw3.a(com.facebook.appevents.i.class, th3);
                    return;
                }
            case 4:
                Context context2 = (Context) this.b;
                com.facebook.appevents.l lVar = (com.facebook.appevents.l) this.c;
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                for (int i2 = 0; i2 < 11; i2++) {
                    String str3 = strArr[i2];
                    String str4 = strArr2[i2];
                    try {
                        Class.forName(str3);
                        bundle.putInt(str4, 1);
                        i |= 1 << i2;
                    } catch (ClassNotFoundException unused2) {
                    }
                }
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (sharedPreferences2.getInt("kitsBitmask", 0) != i) {
                    sharedPreferences2.edit().putInt("kitsBitmask", i).apply();
                    lVar.g(bundle, "fb_sdk_initialize");
                    return;
                }
                return;
            case 5:
                com.facebook.login.r rVar = (com.facebook.login.r) this.b;
                Bundle bundle2 = (Bundle) this.c;
                if (cw3.a.contains(com.facebook.login.r.class)) {
                    return;
                }
                try {
                    rVar.a(bundle2, "fb_mobile_login_heartbeat");
                    return;
                } catch (Throwable th4) {
                    cw3.a(com.facebook.login.r.class, th4);
                    return;
                }
            case 6:
                ((MolocoUnityShowCallback) this.b).onAdShowFailed((String) this.c, "Ad cannot be shown as it was not loaded");
                return;
            case 7:
                MolocoUnityShowCallback molocoUnityShowCallback = (MolocoUnityShowCallback) this.b;
                MolocoAdError molocoAdError = (MolocoAdError) this.c;
                molocoUnityShowCallback.onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
                return;
            default:
                View view = (View) this.b;
                Function0 function0 = (Function0) this.c;
                view.setVisibility(8);
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
