package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.a70;
import defpackage.cw3;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ u(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        AccessToken accessToken;
        String string;
        Profile profile;
        com.facebook.appevents.l lVar;
        AccessToken p;
        String string2;
        switch (this.a) {
            case 0:
                Context context = w.j;
                if (context != null) {
                    return context.getCacheDir();
                }
                Intrinsics.i("applicationContext");
                throw null;
            default:
                w wVar = w.a;
                b bVar = k.f;
                i i = i.f.i();
                SharedPreferences sharedPreferences = i.b.a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string2);
                        Date date = AccessToken.l;
                        accessToken = com.facebook.appevents.g.m(jSONObject);
                    } catch (JSONException unused) {
                    }
                    if (accessToken != null) {
                        i.c(accessToken, false);
                    }
                    k j = bVar.j();
                    string = ((c) j.b).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                    if (string != null) {
                        try {
                            profile = new Profile(new JSONObject(string));
                        } catch (JSONException unused2) {
                        }
                        if (profile != null) {
                            j.a(profile, false);
                        }
                        Date date2 = AccessToken.l;
                        if (com.facebook.appevents.g.q() && ((Profile) bVar.j().c) == null && (p = com.facebook.appevents.g.p()) != null) {
                            if (com.facebook.appevents.g.q()) {
                                bVar.j().a(null, true);
                            } else {
                                com.facebook.internal.k0.p(new b(6), p.e);
                            }
                        }
                        Context a = w.a();
                        String str = w.d;
                        if (k0.c()) {
                            com.facebook.appevents.l lVar2 = new com.facebook.appevents.l(a, str);
                            ScheduledThreadPoolExecutor b = com.facebook.appevents.l.b();
                            if (b == null) {
                                a70.r("Required value was null.");
                                return null;
                            }
                            b.execute(new v(4, a, lVar2));
                        }
                        if (!cw3.a.contains(k0.class)) {
                            try {
                                Context a2 = w.a();
                                ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
                                applicationInfo.getClass();
                                Bundle bundle = applicationInfo.metaData;
                                if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                    com.facebook.appevents.l lVar3 = new com.facebook.appevents.l(a2, (String) null);
                                    Bundle bundle2 = new Bundle();
                                    if (!com.facebook.internal.k0.w()) {
                                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    }
                                    if (k0.c()) {
                                        lVar3.d(bundle2, "fb_auto_applink");
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            } catch (Throwable th) {
                                cw3.a(k0.class, th);
                            }
                        }
                        Context applicationContext = w.a().getApplicationContext();
                        applicationContext.getClass();
                        lVar = new com.facebook.appevents.l(applicationContext, (String) null);
                        if (!cw3.a.contains(lVar)) {
                            try {
                                com.facebook.appevents.i.c(1);
                            } catch (Throwable th2) {
                                cw3.a(lVar, th2);
                            }
                        }
                        return null;
                    }
                    profile = null;
                    if (profile != null) {
                    }
                    Date date22 = AccessToken.l;
                    if (com.facebook.appevents.g.q()) {
                        if (com.facebook.appevents.g.q()) {
                        }
                    }
                    Context a3 = w.a();
                    String str2 = w.d;
                    if (k0.c()) {
                    }
                    if (!cw3.a.contains(k0.class)) {
                    }
                    Context applicationContext2 = w.a().getApplicationContext();
                    applicationContext2.getClass();
                    lVar = new com.facebook.appevents.l(applicationContext2, (String) null);
                    if (!cw3.a.contains(lVar)) {
                    }
                    return null;
                }
                accessToken = null;
                if (accessToken != null) {
                }
                k j2 = bVar.j();
                string = ((c) j2.b).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string != null) {
                }
                profile = null;
                if (profile != null) {
                }
                Date date222 = AccessToken.l;
                if (com.facebook.appevents.g.q()) {
                }
                Context a32 = w.a();
                String str22 = w.d;
                if (k0.c()) {
                }
                if (!cw3.a.contains(k0.class)) {
                }
                Context applicationContext22 = w.a().getApplicationContext();
                applicationContext22.getClass();
                lVar = new com.facebook.appevents.l(applicationContext22, (String) null);
                if (!cw3.a.contains(lVar)) {
                }
                return null;
        }
    }
}
