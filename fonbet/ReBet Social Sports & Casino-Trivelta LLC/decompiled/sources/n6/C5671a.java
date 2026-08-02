package n6;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import g6.C4331C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import n6.C5671a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5671a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5671a f57013a = new C5671a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f57014b = C5671a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f57015c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f57016d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f57017e;

    /* renamed from: f, reason: collision with root package name */
    public static ServiceConnection f57018f;

    /* renamed from: g, reason: collision with root package name */
    public static Application.ActivityLifecycleCallbacks f57019g;

    /* renamed from: h, reason: collision with root package name */
    public static Intent f57020h;

    /* renamed from: i, reason: collision with root package name */
    public static Object f57021i;

    /* renamed from: n6.a$a, reason: collision with other inner class name */
    public static final class ServiceConnectionC0831a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            C5671a c5671a = C5671a.f57013a;
            i iVar = i.f57053a;
            C5671a.f57021i = i.a(C4331C.l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    /* renamed from: n6.a$b */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final void c() {
            Context l10 = C4331C.l();
            i iVar = i.f57053a;
            ArrayList i10 = i.i(l10, C5671a.f57021i);
            C5671a c5671a = C5671a.f57013a;
            c5671a.f(l10, i10, false);
            c5671a.f(l10, i.j(l10, C5671a.f57021i), true);
        }

        public static final void d() {
            Context l10 = C4331C.l();
            i iVar = i.f57053a;
            ArrayList i10 = i.i(l10, C5671a.f57021i);
            if (i10.isEmpty()) {
                i10 = i.g(l10, C5671a.f57021i);
            }
            C5671a.f57013a.f(l10, i10, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                C4331C.t().execute(new Runnable() { // from class: n6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5671a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (Intrinsics.areEqual(C5671a.f57017e, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C4331C.t().execute(new Runnable() { // from class: n6.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5671a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void g() {
        C5671a c5671a = f57013a;
        c5671a.e();
        if (!Intrinsics.areEqual(f57016d, Boolean.FALSE) && p6.i.c()) {
            c5671a.h();
        }
    }

    public final void e() {
        if (f57016d != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f57016d = valueOf;
        if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            return;
        }
        f57017e = Boolean.valueOf(m.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        i.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f57020h = intent;
        f57018f = new ServiceConnectionC0831a();
        f57019g = new b();
    }

    public final void f(Context context, ArrayList arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = (String) it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                Intrinsics.checkNotNullExpressionValue(sku, "sku");
                Intrinsics.checkNotNullExpressionValue(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f57014b, "Error parsing in-app purchase data.", e10);
            }
        }
        i iVar = i.f57053a;
        for (Map.Entry entry : i.k(context, arrayList2, f57021i, z10).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) hashMap.get(str);
            if (str3 != null) {
                p6.i.f(str3, str2, z10);
            }
        }
    }

    public final void h() {
        if (f57015c.compareAndSet(false, true)) {
            Context l10 = C4331C.l();
            if (l10 instanceof Application) {
                Application application = (Application) l10;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f57019g;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f57020h;
                if (intent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f57018f;
                if (serviceConnection != null) {
                    l10.bindService(intent, serviceConnection, 1);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
