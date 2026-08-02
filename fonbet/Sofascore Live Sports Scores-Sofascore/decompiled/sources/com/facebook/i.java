package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.bf3;
import defpackage.pic;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i {
    public static final b f = new b(1);
    public static i g;
    public final LocalBroadcastManager a;
    public final c b;
    public AccessToken c;
    public final AtomicBoolean d;
    public Date e;

    public i(LocalBroadcastManager localBroadcastManager, c cVar) {
        localBroadcastManager.getClass();
        this.a = localBroadcastManager;
        this.b = cVar;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    public final void a() {
        String str;
        String str2;
        AccessToken accessToken = this.c;
        if (accessToken == null) {
            return;
        }
        String str3 = accessToken.k;
        final int i = 0;
        final int i2 = 1;
        if (this.d.compareAndSet(false, true)) {
            this.e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            pic picVar = new pic();
            final d dVar = new d(atomicBoolean, hashSet, hashSet2, hashSet3, 0);
            final e eVar = new e(picVar);
            final f fVar = new f(picVar, accessToken, atomicBoolean, hashSet, hashSet2, hashSet3, this);
            Bundle f2 = bf3.f("fields", "permission,status");
            String str4 = d0.j;
            d0 B = com.moloco.sdk.internal.publisher.h0.B(accessToken, "me/permissions", dVar);
            B.d = f2;
            h0 h0Var = h0.a;
            B.h = h0Var;
            b bVar = (str3 == null ? Payload.SOURCE_FACEBOOK : str3).equals(Payload.SOURCE_INSTAGRAM) ? new b(3) : new b(2);
            Bundle bundle = new Bundle();
            int i3 = bVar.a;
            switch (i3) {
                case 2:
                    str = "fb_extend_sso_token";
                    break;
                default:
                    str = "ig_refresh_token";
                    break;
            }
            bundle.putString("grant_type", str);
            bundle.putString("client_id", accessToken.h);
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            switch (i3) {
                case 2:
                    str2 = "oauth/access_token";
                    break;
                default:
                    str2 = "refresh_access_token";
                    break;
            }
            d0 B2 = com.moloco.sdk.internal.publisher.h0.B(accessToken, str2, eVar);
            B2.d = bundle;
            B2.h = h0Var;
            if (Intrinsics.c(str3, "gaming")) {
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                z zVar = new z() { // from class: com.facebook.g
                    @Override // com.facebook.z
                    public final void a(g0 g0Var) {
                        int i4 = i;
                        f fVar2 = fVar;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        z zVar2 = dVar;
                        switch (i4) {
                            case 0:
                                g0Var.getClass();
                                ((d) zVar2).a(g0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    fVar2.run();
                                    break;
                                }
                                break;
                            default:
                                g0Var.getClass();
                                ((e) zVar2).a(g0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    fVar2.run();
                                    break;
                                }
                                break;
                        }
                    }
                };
                z zVar2 = new z() { // from class: com.facebook.g
                    @Override // com.facebook.z
                    public final void a(g0 g0Var) {
                        int i4 = i2;
                        f fVar2 = fVar;
                        AtomicInteger atomicInteger2 = atomicInteger;
                        z zVar22 = eVar;
                        switch (i4) {
                            case 0:
                                g0Var.getClass();
                                ((d) zVar22).a(g0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    fVar2.run();
                                    break;
                                }
                                break;
                            default:
                                g0Var.getClass();
                                ((e) zVar22).a(g0Var);
                                if (atomicInteger2.incrementAndGet() == 2) {
                                    fVar2.run();
                                    break;
                                }
                                break;
                        }
                    }
                };
                B.j(zVar);
                B2.j(zVar2);
                B.d();
                B2.d();
                return;
            }
            f0 f0Var = new f0(B, B2);
            h hVar = new h(fVar);
            ArrayList arrayList = f0Var.c;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            com.facebook.internal.h.i(f0Var);
            new e0(f0Var).executeOnExecutor(w.c(), new Void[0]);
        }
    }

    public final void b(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(w.a(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.a.sendBroadcast(intent);
    }

    public final void c(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.c;
        String str = accessToken2 != null ? accessToken2.i : null;
        String str2 = accessToken != null ? accessToken.i : null;
        int i = 1;
        if (str != null && !str.equals(str2)) {
            w.c().execute(new com.appsflyer.internal.w(i));
        }
        this.c = accessToken;
        this.d.set(false);
        this.e = new Date(0L);
        if (z) {
            SharedPreferences sharedPreferences = this.b.a;
            if (accessToken != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.a().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                com.facebook.internal.k0.c(w.a());
            }
        }
        if (accessToken2 == null ? accessToken == null : accessToken2.equals(accessToken)) {
            return;
        }
        b(accessToken2, accessToken);
        Context a = w.a();
        Date date = AccessToken.l;
        AccessToken p = com.facebook.appevents.g.p();
        AlarmManager alarmManager = (AlarmManager) a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (com.facebook.appevents.g.q()) {
            if ((p != null ? p.a : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(a, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, p.a.getTime(), PendingIntent.getBroadcast(a, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
