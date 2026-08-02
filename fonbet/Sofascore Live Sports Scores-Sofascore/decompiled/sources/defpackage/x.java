package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.android.billingclient.api.BillingClient;
import com.facebook.internal.c;
import com.facebook.internal.h;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.internal.s;
import com.facebook.internal.u;
import com.facebook.w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.inmobi.media.AbstractC3294ai;
import com.inmobi.media.E3;
import com.inmobi.media.F5;
import com.inmobi.media.Sk;
import com.inmobi.media.Yk;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.config.component.common.util.d;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.vungle.ads.internal.AnalyticsClient;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00db, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r9) >= 259200000) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9 A[Catch: all -> 0x00ac, Exception -> 0x010a, TryCatch #14 {Exception -> 0x010a, all -> 0x00ac, blocks: (B:56:0x008f, B:58:0x009f, B:61:0x00a6, B:62:0x00b3, B:64:0x00bf, B:66:0x00c5, B:74:0x0100, B:79:0x00df, B:80:0x00e2, B:84:0x00e9, B:85:0x00ae), top: B:55:0x008f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        lx9 lx9Var;
        Class b;
        String str;
        JSONObject jSONObject;
        jy0 jy0Var = null;
        r2 = null;
        r2 = null;
        ArrayList a = null;
        ArrayList a2 = null;
        jy0Var = null;
        jy0Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                if (cw3.a.contains(y.class)) {
                    return;
                }
                try {
                    Object systemService = w.a().getSystemService("activity");
                    systemService.getClass();
                    y.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th) {
                    cw3.a(y.class, th);
                    return;
                }
            case 1:
                nx9.d();
                return;
            case 2:
                if (md.f == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(w.a());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j != 0 && j2 != 0 && string != null) {
                        jy0 jy0Var2 = new jy0(Long.valueOf(j), Long.valueOf(j2));
                        jy0Var2.a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(w.a());
                        jy0Var2.f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new n6g(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                        jy0Var2.e = Long.valueOf(System.currentTimeMillis());
                        UUID fromString = UUID.fromString(string);
                        fromString.getClass();
                        jy0Var2.d = fromString;
                        jy0Var = jy0Var2;
                    }
                    md.f = jy0Var;
                    return;
                }
                return;
            case 3:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 4:
                AnalyticsClient.a();
                return;
            case 5:
                l0d l0dVar = xy.Q0;
                synchronized (l0dVar) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        Object[] objArr = l0dVar.a;
                        int i4 = l0dVar.b;
                        if (i3 < 30) {
                            while (i < i4) {
                                xy xyVar = (xy) objArr[i];
                                boolean showLayoutBounds = xyVar.getShowLayoutBounds();
                                Class cls = xy.N0;
                                xyVar.setShowLayoutBounds(ktm.w());
                                if (showLayoutBounds != xyVar.getShowLayoutBounds()) {
                                    xyVar.post(new hy(xyVar, 2));
                                }
                                i++;
                            }
                        } else {
                            while (i < i4) {
                                xy xyVar2 = (xy) objArr[i];
                                xyVar2.post(new hy(xyVar2, 3));
                                i++;
                            }
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 6:
                int i5 = ChatMessageInputView.x;
                return;
            case 7:
                return;
            case 8:
                E3.a();
                return;
            case 9:
                F5.F();
                return;
            case 10:
                F5.N();
                return;
            case 11:
                F5.P();
                return;
            case 12:
                F5.L();
                return;
            case 13:
                F5.J();
                return;
            case 14:
                F5.H();
                return;
            case 15:
                Context a3 = w.a();
                ArrayList f = lx9.f(a3, zw9.g);
                if (f.isEmpty()) {
                    Object obj = zw9.g;
                    if (!cw3.a.contains(lx9.class)) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            if (obj != null && (b = (lx9Var = lx9.a).b(a3, "com.android.vending.billing.IInAppBillingService")) != null && lx9Var.c(b, "getPurchaseHistory") != null) {
                                a2 = lx9Var.a(lx9Var.d(a3, obj));
                            }
                            a2 = arrayList;
                        } catch (Throwable th3) {
                            cw3.a(lx9.class, th3);
                        }
                    }
                    f = a2;
                }
                zw9.a(a3, f, false);
                return;
            case 16:
                Context a4 = w.a();
                zw9.a(a4, lx9.f(a4, zw9.g), false);
                Object obj2 = zw9.g;
                if (!cw3.a.contains(lx9.class)) {
                    try {
                        lx9 lx9Var2 = lx9.a;
                        a = lx9Var2.a(lx9Var2.e(a4, BillingClient.ProductType.SUBS, obj2));
                    } catch (Throwable th4) {
                        cw3.a(lx9.class, th4);
                    }
                }
                zw9.a(a4, a, true);
                return;
            case 17:
                InMobiSdk.b();
                return;
            case 18:
                Set set = cw3.a;
                if (set.contains(uic.class)) {
                    return;
                }
                try {
                    c b2 = h.b(w.a());
                    if (b2 == null || !b2.e) {
                        uic uicVar = uic.b;
                        if (!set.contains(uicVar)) {
                            try {
                                u k = com.facebook.internal.x.k(w.b(), false);
                                if (k != null && (str = k.j) != null) {
                                    try {
                                        cjc.a().clear();
                                        ufa.m(new JSONObject(str));
                                    } catch (JSONException unused2) {
                                    }
                                }
                            } catch (Throwable th5) {
                                cw3.a(uicVar, th5);
                            }
                        }
                        uic.c = true;
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    cw3.a(uic.class, th6);
                    return;
                }
            case 19:
                stc stcVar = stc.a;
                Set set2 = cw3.a;
                if (set2.contains(stc.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string2 = sharedPreferences.getString("models", null);
                    if (string2 != null && string2.length() != 0) {
                        jSONObject = new JSONObject(string2);
                        long j3 = sharedPreferences.getLong("model_request_timestamp", 0L);
                        if (q.b(o.ModelRequest) && jSONObject.length() != 0 && !set2.contains(stcVar) && j3 != 0) {
                            try {
                                break;
                            } catch (Throwable th7) {
                                cw3.a(stcVar, th7);
                            }
                        }
                        jSONObject = stcVar.c();
                        if (jSONObject != null) {
                            return;
                        }
                        sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        stcVar.a(jSONObject);
                        stcVar.b();
                        return;
                    }
                    jSONObject = new JSONObject();
                    long j32 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (q.b(o.ModelRequest)) {
                    }
                    jSONObject = stcVar.c();
                    if (jSONObject != null) {
                    }
                } catch (Exception unused3) {
                    return;
                } catch (Throwable th8) {
                    cw3.a(stc.class, th8);
                    return;
                }
                break;
            case 20:
                if (cw3.a.contains(stc.class)) {
                    return;
                }
                try {
                    hmi.a();
                    return;
                } catch (Throwable th9) {
                    cw3.a(stc.class, th9);
                    return;
                }
            case 21:
                Set set3 = cw3.a;
                if (set3.contains(stc.class)) {
                    return;
                }
                try {
                    if (!set3.contains(f7a.class)) {
                        try {
                            f7a.c = true;
                            f7a.d = s.b("FBSDKFeatureIntegritySample", w.b(), false);
                        } catch (Throwable th10) {
                            cw3.a(f7a.class, th10);
                        }
                    }
                    return;
                } catch (Throwable th11) {
                    cw3.a(stc.class, th11);
                    return;
                }
            case 22:
                return;
            case 23:
                Sk.b();
                return;
            case 24:
                if (cw3.a.contains(hmi.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = hmi.b;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    hmi.a.b();
                    return;
                } catch (Throwable th12) {
                    cw3.a(hmi.class, th12);
                    return;
                }
            case 25:
                Yk.d();
                return;
            case 26:
                AbstractC3294ai.c();
                return;
            default:
                d.b();
                return;
        }
    }

    public /* synthetic */ x(Object obj, int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }
}
