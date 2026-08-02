package h6;

import T7.C1682w;
import T7.J;
import a1.C1908a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4339K;
import g6.N;
import h6.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static ScheduledFuture f47794f;

    /* renamed from: a, reason: collision with root package name */
    public static final n f47789a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final String f47790b = n.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static final int f47791c = 100;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4479f f47792d = new C4479f();

    /* renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f47793e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g, reason: collision with root package name */
    public static final Runnable f47795g = new Runnable() { // from class: h6.i
        @Override // java.lang.Runnable
        public final void run() {
            n.o();
        }
    };

    public static final void g(final C4474a accessTokenAppId, final C4478e appEvent) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f47793e.execute(new Runnable() { // from class: h6.j
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(C4474a.this, appEvent);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void h(C4474a accessTokenAppId, C4478e appEvent) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            f47792d.a(accessTokenAppId, appEvent);
            if (p.f47798b.d() != p.b.EXPLICIT_ONLY && f47792d.d() > f47791c) {
                n(EnumC4467C.EVENT_THRESHOLD);
            } else if (f47794f == null) {
                f47794f = f47793e.schedule(f47795g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final GraphRequest i(final C4474a accessTokenAppId, final C4472H appEvents, boolean z10, final C4469E flushState) {
        if (Y7.a.d(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String b10 = accessTokenAppId.b();
            C1682w q10 = T7.A.q(b10, false);
            GraphRequest.c cVar = GraphRequest.f30314n;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b10}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            final GraphRequest A10 = cVar.A(null, format, null, null);
            A10.F(true);
            Bundle u10 = A10.u();
            if (u10 == null) {
                u10 = new Bundle();
            }
            u10.putString("access_token", accessTokenAppId.a());
            String e10 = C4470F.f47729b.e();
            if (e10 != null) {
                u10.putString("device_token", e10);
            }
            String k10 = s.f47813c.k();
            if (k10 != null) {
                u10.putString("install_referrer", k10);
            }
            A10.J(u10);
            int e11 = appEvents.e(A10, C4331C.l(), q10 != null ? q10.q() : false, z10);
            if (e11 == 0) {
                return null;
            }
            flushState.c(flushState.a() + e11);
            A10.E(new GraphRequest.b() { // from class: h6.l
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    n.j(C4474a.this, A10, appEvents, flushState, c4339k);
                }
            });
            return A10;
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
            return null;
        }
    }

    public static final void j(C4474a accessTokenAppId, GraphRequest postRequest, C4472H appEvents, C4469E flushState, C4339K response) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final List k(C4479f appEventCollection, C4469E flushResults) {
        if (Y7.a.d(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean z10 = C4331C.z(C4331C.l());
            ArrayList arrayList = new ArrayList();
            for (C4474a c4474a : appEventCollection.f()) {
                C4472H c10 = appEventCollection.c(c4474a);
                if (c10 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest i10 = i(c4474a, c10, z10, flushResults);
                if (i10 != null) {
                    arrayList.add(i10);
                    if (j6.d.f53690a.f()) {
                        j6.g.l(i10);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
            return null;
        }
    }

    public static final void l(final EnumC4467C reason) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f47793e.execute(new Runnable() { // from class: h6.h
                @Override // java.lang.Runnable
                public final void run() {
                    n.m(EnumC4467C.this);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void m(EnumC4467C reason) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            n(reason);
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void n(EnumC4467C reason) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f47792d.b(C4480g.a());
            try {
                C4469E u10 = u(reason, f47792d);
                if (u10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u10.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", u10.b());
                    C1908a.b(C4331C.l()).d(intent);
                }
            } catch (Exception e10) {
                Log.w(f47790b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void o() {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            f47794f = null;
            if (p.f47798b.d() != p.b.EXPLICIT_ONLY) {
                n(EnumC4467C.TIMER);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final Set p() {
        if (Y7.a.d(n.class)) {
            return null;
        }
        try {
            return f47792d.f();
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
            return null;
        }
    }

    public static final void q(final C4474a accessTokenAppId, GraphRequest request, C4339K response, final C4472H appEvents, C4469E flushState) {
        String str;
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError b10 = response.b();
            String str2 = "Success";
            EnumC4468D enumC4468D = EnumC4468D.SUCCESS;
            if (b10 != null) {
                if (b10.getErrorCode() == -1) {
                    str2 = "Failed: No Connectivity";
                    enumC4468D = EnumC4468D.NO_CONNECTIVITY;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), b10.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    enumC4468D = EnumC4468D.SERVER_ERROR;
                }
            }
            C4331C c4331c = C4331C.f46921a;
            if (C4331C.I(N.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.w()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                J.a aVar = T7.J.f10993e;
                N n10 = N.APP_EVENTS;
                String TAG = f47790b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.c(n10, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str2, str);
            }
            appEvents.b(b10 != null);
            EnumC4468D enumC4468D2 = EnumC4468D.NO_CONNECTIVITY;
            if (enumC4468D == enumC4468D2) {
                C4331C.t().execute(new Runnable() { // from class: h6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.r(C4474a.this, appEvents);
                    }
                });
            }
            if (enumC4468D == EnumC4468D.SUCCESS || flushState.b() == enumC4468D2) {
                return;
            }
            flushState.d(enumC4468D);
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void r(C4474a accessTokenAppId, C4472H appEvents) {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            o.a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void s() {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            f47793e.execute(new Runnable() { // from class: h6.k
                @Override // java.lang.Runnable
                public final void run() {
                    n.t();
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final void t() {
        if (Y7.a.d(n.class)) {
            return;
        }
        try {
            o oVar = o.f47796a;
            o.b(f47792d);
            f47792d = new C4479f();
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
        }
    }

    public static final C4469E u(EnumC4467C reason, C4479f appEventCollection) {
        if (Y7.a.d(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            C4469E c4469e = new C4469E();
            List k10 = k(appEventCollection, c4469e);
            if (k10.isEmpty()) {
                return null;
            }
            J.a aVar = T7.J.f10993e;
            N n10 = N.APP_EVENTS;
            String TAG = f47790b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.c(n10, TAG, "Flushing %d events due to %s.", Integer.valueOf(c4469e.a()), reason.toString());
            Iterator it = k10.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).k();
            }
            return c4469e;
        } catch (Throwable th2) {
            Y7.a.b(th2, n.class);
            return null;
        }
    }
}
