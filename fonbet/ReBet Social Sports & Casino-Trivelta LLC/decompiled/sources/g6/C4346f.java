package g6;

import T7.Y;
import a1.C1908a;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import g6.C4338J;
import g6.C4346f;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: g6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4346f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f47052f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static C4346f f47053g;

    /* renamed from: a, reason: collision with root package name */
    public final C1908a f47054a;

    /* renamed from: b, reason: collision with root package name */
    public final C4341a f47055b;

    /* renamed from: c, reason: collision with root package name */
    public AccessToken f47056c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f47057d;

    /* renamed from: e, reason: collision with root package name */
    public Date f47058e;

    /* renamed from: g6.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GraphRequest c(AccessToken accessToken, GraphRequest.b bVar) {
            e f10 = f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f10.a());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest x10 = GraphRequest.f30314n.x(accessToken, f10.b(), bVar);
            x10.J(bundle);
            x10.I(EnumC4340L.GET);
            return x10;
        }

        public final GraphRequest d(AccessToken accessToken, GraphRequest.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest x10 = GraphRequest.f30314n.x(accessToken, "me/permissions", bVar);
            x10.J(bundle);
            x10.I(EnumC4340L.GET);
            return x10;
        }

        public final C4346f e() {
            C4346f c4346f;
            C4346f c4346f2 = C4346f.f47053g;
            if (c4346f2 != null) {
                return c4346f2;
            }
            synchronized (this) {
                c4346f = C4346f.f47053g;
                if (c4346f == null) {
                    C1908a b10 = C1908a.b(C4331C.l());
                    Intrinsics.checkNotNullExpressionValue(b10, "getInstance(applicationContext)");
                    C4346f c4346f3 = new C4346f(b10, new C4341a());
                    C4346f.f47053g = c4346f3;
                    c4346f = c4346f3;
                }
            }
            return c4346f;
        }

        public final e f(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            return Intrinsics.areEqual(graphDomain, "instagram") ? new c() : new b();
        }

        public a() {
        }
    }

    /* renamed from: g6.f$b */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f47059a = "oauth/access_token";

        /* renamed from: b, reason: collision with root package name */
        public final String f47060b = "fb_extend_sso_token";

        @Override // g6.C4346f.e
        public String a() {
            return this.f47060b;
        }

        @Override // g6.C4346f.e
        public String b() {
            return this.f47059a;
        }
    }

    /* renamed from: g6.f$c */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f47061a = "refresh_access_token";

        /* renamed from: b, reason: collision with root package name */
        public final String f47062b = "ig_refresh_token";

        @Override // g6.C4346f.e
        public String a() {
            return this.f47062b;
        }

        @Override // g6.C4346f.e
        public String b() {
            return this.f47061a;
        }
    }

    /* renamed from: g6.f$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f47063a;

        /* renamed from: b, reason: collision with root package name */
        public int f47064b;

        /* renamed from: c, reason: collision with root package name */
        public int f47065c;

        /* renamed from: d, reason: collision with root package name */
        public Long f47066d;

        /* renamed from: e, reason: collision with root package name */
        public String f47067e;

        public final String a() {
            return this.f47063a;
        }

        public final Long b() {
            return this.f47066d;
        }

        public final int c() {
            return this.f47064b;
        }

        public final int d() {
            return this.f47065c;
        }

        public final String e() {
            return this.f47067e;
        }

        public final void f(String str) {
            this.f47063a = str;
        }

        public final void g(Long l10) {
            this.f47066d = l10;
        }

        public final void h(int i10) {
            this.f47064b = i10;
        }

        public final void i(int i10) {
            this.f47065c = i10;
        }

        public final void j(String str) {
            this.f47067e = str;
        }
    }

    /* renamed from: g6.f$e */
    public interface e {
        String a();

        String b();
    }

    public C4346f(C1908a localBroadcastManager, C4341a accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.f47054a = localBroadcastManager;
        this.f47055b = accessTokenCache;
        this.f47057d = new AtomicBoolean(false);
        this.f47058e = new Date(0L);
    }

    public static final void l(C4346f this$0, AccessToken.a aVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m(aVar);
    }

    public static final void n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, C4339K response) {
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null || (optJSONArray = d10.optJSONArray(EventKeys.DATA)) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = optJSONArray.length();
        if (length <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("permission");
                String status = optJSONObject.optString("status");
                if (!Y.d0(optString) && !Y.d0(status)) {
                    Intrinsics.checkNotNullExpressionValue(status, "status");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String status2 = status.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(status2, "(this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                    int hashCode = status2.hashCode();
                    if (hashCode == -1309235419) {
                        if (status2.equals("expired")) {
                            expiredPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                    } else if (hashCode != 280295099) {
                        if (hashCode == 568196142 && status2.equals("declined")) {
                            declinedPermissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                    } else {
                        if (status2.equals("granted")) {
                            permissions.add(optString);
                        }
                        Log.w("AccessTokenManager", Intrinsics.stringPlus("Unexpected status: ", status2));
                    }
                }
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void o(d refreshResult, C4339K response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject d10 = response.d();
        if (d10 == null) {
            return;
        }
        refreshResult.f(d10.optString("access_token"));
        refreshResult.h(d10.optInt("expires_at"));
        refreshResult.i(d10.optInt("expires_in"));
        refreshResult.g(Long.valueOf(d10.optLong("data_access_expiration_time")));
        refreshResult.j(d10.optString("graph_domain", null));
    }

    public static final void p(d refreshResult, AccessToken accessToken, AccessToken.a aVar, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, C4346f this$0, C4338J it) {
        AccessToken accessToken2;
        a aVar2;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String a10 = refreshResult.a();
        int c10 = refreshResult.c();
        Long b10 = refreshResult.b();
        String e10 = refreshResult.e();
        try {
            a aVar3 = f47052f;
            if (aVar3.e().i() != null) {
                AccessToken i10 = aVar3.e().i();
                if ((i10 == null ? null : i10.getUserId()) == accessToken.getUserId()) {
                    if (!permissionsCallSucceeded.get() && a10 == null && c10 == 0) {
                        if (aVar != null) {
                            aVar.a(new C4357q("Failed to refresh access token"));
                        }
                        this$0.f47057d.set(false);
                        return;
                    }
                    Date expires = accessToken.getExpires();
                    if (refreshResult.c() != 0) {
                        aVar2 = aVar3;
                        expires = new Date(refreshResult.c() * 1000);
                    } else {
                        aVar2 = aVar3;
                        if (refreshResult.d() != 0) {
                            expires = new Date((refreshResult.d() * 1000) + new Date().getTime());
                        }
                    }
                    Date date = expires;
                    if (a10 == null) {
                        a10 = accessToken.getToken();
                    }
                    String str = a10;
                    String applicationId = accessToken.getApplicationId();
                    String userId = accessToken.getUserId();
                    Set permissions2 = permissionsCallSucceeded.get() ? permissions : accessToken.getPermissions();
                    Set declinedPermissions2 = permissionsCallSucceeded.get() ? declinedPermissions : accessToken.getDeclinedPermissions();
                    Set expiredPermissions2 = permissionsCallSucceeded.get() ? expiredPermissions : accessToken.getExpiredPermissions();
                    EnumC4347g source = accessToken.getSource();
                    Date date2 = new Date();
                    Date date3 = b10 != null ? new Date(b10.longValue() * 1000) : accessToken.getDataAccessExpirationTime();
                    if (e10 == null) {
                        e10 = accessToken.getGraphDomain();
                    }
                    accessToken2 = new AccessToken(str, applicationId, userId, permissions2, declinedPermissions2, expiredPermissions2, source, date, date2, date3, e10);
                    try {
                        aVar2.e().r(accessToken2);
                        this$0.f47057d.set(false);
                        if (aVar != null) {
                            aVar.b(accessToken2);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        this$0.f47057d.set(false);
                        if (aVar != null && accessToken2 != null) {
                            aVar.b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (aVar != null) {
                aVar.a(new C4357q("No current access token to refresh"));
            }
            this$0.f47057d.set(false);
        } catch (Throwable th3) {
            th = th3;
            accessToken2 = null;
        }
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k(null);
        }
    }

    public final AccessToken i() {
        return this.f47056c;
    }

    public final boolean j() {
        AccessToken f10 = this.f47055b.f();
        if (f10 == null) {
            return false;
        }
        s(f10, false);
        return true;
    }

    public final void k(final AccessToken.a aVar) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: g6.b
                @Override // java.lang.Runnable
                public final void run() {
                    C4346f.l(C4346f.this, aVar);
                }
            });
        }
    }

    public final void m(final AccessToken.a aVar) {
        final AccessToken i10 = i();
        if (i10 == null) {
            if (aVar == null) {
                return;
            }
            aVar.a(new C4357q("No current access token to refresh"));
            return;
        }
        if (!this.f47057d.compareAndSet(false, true)) {
            if (aVar == null) {
                return;
            }
            aVar.a(new C4357q("Refresh already in progress"));
            return;
        }
        this.f47058e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar2 = f47052f;
        C4338J c4338j = new C4338J(aVar2.d(i10, new GraphRequest.b() { // from class: g6.c
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                C4346f.n(atomicBoolean, hashSet, hashSet2, hashSet3, c4339k);
            }
        }), aVar2.c(i10, new GraphRequest.b() { // from class: g6.d
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                C4346f.o(C4346f.d.this, c4339k);
            }
        }));
        c4338j.c(new C4338J.a() { // from class: g6.e
            @Override // g6.C4338J.a
            public final void a(C4338J c4338j2) {
                C4346f.p(C4346f.d.this, i10, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, c4338j2);
            }
        });
        c4338j.h();
    }

    public final void q(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C4331C.l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f47054a.d(intent);
    }

    public final void r(AccessToken accessToken) {
        s(accessToken, true);
    }

    public final void s(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.f47056c;
        this.f47056c = accessToken;
        this.f47057d.set(false);
        this.f47058e = new Date(0L);
        if (z10) {
            if (accessToken != null) {
                this.f47055b.g(accessToken);
            } else {
                this.f47055b.a();
                Y y10 = Y.f11042a;
                Y.i(C4331C.l());
            }
        }
        if (Y.e(accessToken2, accessToken)) {
            return;
        }
        q(accessToken2, accessToken);
        t();
    }

    public final void t() {
        Context l10 = C4331C.l();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken e10 = companion.e();
        AlarmManager alarmManager = (AlarmManager) l10.getSystemService("alarm");
        if (companion.g()) {
            if ((e10 == null ? null : e10.getExpires()) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(l10, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, e10.getExpires().getTime(), PendingIntent.getBroadcast(l10, 0, intent, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
            } catch (Exception unused) {
            }
        }
    }

    public final boolean u() {
        AccessToken i10 = i();
        if (i10 == null) {
            return false;
        }
        long time = new Date().getTime();
        return i10.getSource().b() && time - this.f47058e.getTime() > 3600000 && time - i10.getLastRefresh().getTime() > 86400000;
    }
}
