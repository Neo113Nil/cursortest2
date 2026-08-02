package k6;

import T7.A;
import T7.C1662b;
import T7.C1682w;
import T7.Y;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.GraphRequest;
import g6.C4331C;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static SensorManager f54250c;

    /* renamed from: d, reason: collision with root package name */
    public static l f54251d;

    /* renamed from: e, reason: collision with root package name */
    public static String f54252e;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f54255h;

    /* renamed from: a, reason: collision with root package name */
    public static final e f54248a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final m f54249b = new m();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f54253f = new AtomicBoolean(true);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f54254g = new AtomicBoolean(false);

    public static final void d(String str) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            C1662b e10 = C1662b.f11059f.e(C4331C.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((e10 == null ? null : e10.h()) != null) {
                jSONArray.put(e10.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(p6.g.f() ? "1" : "0");
            Locale A10 = Y.A();
            jSONArray.put(A10.getLanguage() + '_' + ((Object) A10.getCountry()));
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", jSONArray2);
            GraphRequest.c cVar = GraphRequest.f30314n;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z10 = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            JSONObject c10 = cVar.B(null, format, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f54254g;
            if (c10 == null || !c10.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f54251d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f54252e = null;
            }
            f54255h = false;
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void e() {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            f54253f.set(false);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void f() {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            f54253f.set(true);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final String g() {
        if (Y7.a.d(e.class)) {
            return null;
        }
        try {
            if (f54252e == null) {
                f54252e = UUID.randomUUID().toString();
            }
            String str = f54252e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (Y7.a.d(e.class)) {
            return false;
        }
        try {
            return f54254g.get();
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return false;
        }
    }

    public static final void j(Activity activity) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            g.f54257f.a().f(activity);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f54253f.get()) {
                g.f54257f.a().h(activity);
                l lVar = f54251d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f54250c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f54249b);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void l(Activity activity) {
        e eVar;
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (f54253f.get()) {
                g.f54257f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String m10 = C4331C.m();
                final C1682w f10 = A.f(m10);
                if (!Intrinsics.areEqual(f10 == null ? null : Boolean.valueOf(f10.b()), Boolean.TRUE)) {
                    if (f54248a.i()) {
                    }
                    eVar = f54248a;
                    if (eVar.i() || f54254g.get()) {
                    }
                    eVar.c(m10);
                    return;
                }
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                if (sensorManager == null) {
                    return;
                }
                f54250c = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                l lVar = new l(activity);
                f54251d = lVar;
                m mVar = f54249b;
                mVar.a(new m.b() { // from class: k6.c
                    @Override // k6.m.b
                    public final void onShake() {
                        e.m(C1682w.this, m10);
                    }
                });
                sensorManager.registerListener(mVar, defaultSensor, 2);
                if (f10 != null && f10.b()) {
                    lVar.h();
                }
                eVar = f54248a;
                if (eVar.i()) {
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void m(C1682w c1682w, String appId) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z10 = c1682w != null && c1682w.b();
            boolean s10 = C4331C.s();
            if (z10 && s10) {
                f54248a.c(appId);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final void n(boolean z10) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            f54254g.set(z10);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public final void c(final String str) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (f54255h) {
                return;
            }
            f54255h = true;
            C4331C.t().execute(new Runnable() { // from class: k6.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final boolean i() {
        Y7.a.d(this);
        return false;
    }
}
