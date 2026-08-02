package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.appevents.e;
import com.facebook.w;
import com.ironsource.U3;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q19 {
    public static final q19 a = new q19();
    public static boolean b;
    public static r19 c;
    public static String d;

    static {
        q19.class.toString().getClass();
    }

    public final boolean a() {
        if (cw3.a.contains(this)) {
            return false;
        }
        try {
            if (!b || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e) {
                r19 r19Var = c;
                if (r19Var == null) {
                    Intrinsics.i("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e.toString());
                Unit unit = Unit.a;
                r19Var.a(bundle, "gps_ara_failed");
                return false;
            } catch (Exception e2) {
                r19 r19Var2 = c;
                if (r19Var2 == null) {
                    Intrinsics.i("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                Unit unit2 = Unit.a;
                r19Var2.a(bundle2, "gps_ara_failed");
                return false;
            }
        } catch (Throwable th) {
            cw3.a(this, th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public final String b(e eVar) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = eVar.a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                this = i5h.l(i5h.o(e5h.b(keys), new oo(jSONObject, 19)), U3.j.c);
                return this;
            }
            return "";
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final void c(String str, e eVar) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                String string = eVar.a.getString("_eventName");
                if (Intrinsics.c(string, "_removed_")) {
                    return;
                }
                string.getClass();
                if (!StringsKt.J(string, "gps", false) && a()) {
                    Context a2 = w.a();
                    try {
                        MeasurementManager c2 = sw9.c(a2.getSystemService(sw9.g()));
                        if (c2 == null) {
                            c2 = MeasurementManager.get(a2.getApplicationContext());
                        }
                        if (c2 == null) {
                            r19 r19Var = c;
                            if (r19Var == null) {
                                Intrinsics.i("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            Unit unit = Unit.a;
                            r19Var.a(bundle, "gps_ara_failed");
                            return;
                        }
                        String b2 = b(eVar);
                        StringBuilder sb = new StringBuilder();
                        String str2 = d;
                        if (str2 == null) {
                            Intrinsics.i("serverUri");
                            throw null;
                        }
                        sb.append(str2);
                        sb.append("?app_id=");
                        sb.append(str);
                        sb.append('&');
                        sb.append(b2);
                        Uri parse = Uri.parse(sb.toString());
                        parse.getClass();
                        c2.registerTrigger(parse, w.c(), new p19(0));
                    } catch (Error e) {
                        r19 r19Var2 = c;
                        if (r19Var2 == null) {
                            Intrinsics.i("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e.toString());
                        Unit unit2 = Unit.a;
                        r19Var2.a(bundle2, "gps_ara_failed");
                    } catch (Exception e2) {
                        r19 r19Var3 = c;
                        if (r19Var3 == null) {
                            Intrinsics.i("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e2.toString());
                        Unit unit3 = Unit.a;
                        r19Var3.a(bundle3, "gps_ara_failed");
                    }
                }
            } catch (Throwable th) {
                cw3.a(this, th);
            }
        } catch (Throwable th2) {
            cw3.a(this, th2);
        }
    }

    public final void d(String str, e eVar) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            w.c().execute(new o19(str, eVar, 0));
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
