package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.media.MediaCodecInfo;
import android.view.View;
import com.facebook.d0;
import com.facebook.e0;
import com.facebook.f0;
import com.facebook.g0;
import com.facebook.internal.h;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.q;
import com.facebook.k0;
import com.facebook.w;
import com.facebook.z;
import com.mbridge.msdk.config.component.log.LogCpt;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.results.calendar.MaterialCalendarView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class sw9 implements xn3, bt8, n, vfh, wn3, f, hvb, puk, p3c {
    public final /* synthetic */ int a;

    public /* synthetic */ sw9(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new fb3(str + obj + ((Object) " at path ") + obj2, 9);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void k(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void n(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    @Override // defpackage.p3c, defpackage.q3c
    public int a(Object obj) {
        String str = ((z2c) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (lik.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Throwable) obj).getMessage();
                break;
            case 1:
            default:
                ((ExecutorService) obj).shutdown();
                break;
            case 2:
                ((Throwable) obj).getMessage();
                break;
        }
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        yi2 yi2Var = (yi2) obj;
        int C = wt3.C(yi2Var.h().l());
        return (C == 0 || C == 1 || C == 2 || C == 3) ? g0c.a(yi2Var) : j0c.a;
    }

    @Override // defpackage.hvb
    public int b(kx4 kx4Var, int i) {
        return wzb.b(0.33333334f * i);
    }

    @Override // com.facebook.internal.n
    public void d(boolean z) {
        File[] listFiles;
        File[] listFiles2;
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 3:
                if (z) {
                    synchronized (bw3.c) {
                        try {
                            w wVar = w.a;
                            if (k0.c()) {
                                k03.q();
                            }
                            if (bw3.d == null) {
                                bw3 bw3Var = new bw3(Thread.getDefaultUncaughtExceptionHandler(), i);
                                bw3.d = bw3Var;
                                Thread.setDefaultUncaughtExceptionHandler(bw3Var);
                            }
                        } finally {
                        }
                    }
                    if (q.b(o.CrashShield)) {
                        ok3.m = true;
                        if (k0.c() && !com.facebook.internal.k0.y()) {
                            File o = f6a.o();
                            if (o == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = o.listFiles(new dw3(8));
                                if (listFiles == null) {
                                    listFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                final e6a v = b6a.v(file);
                                if (v.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", v.toString());
                                        String str = d0.j;
                                        arrayList.add(h0.C(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{w.b()}, 1)), jSONObject, new z() { // from class: dq5
                                            @Override // com.facebook.z
                                            public final void a(g0 g0Var) {
                                                JSONObject jSONObject2;
                                                JSONObject jSONObject3;
                                                int i3 = i2;
                                                Object obj = v;
                                                switch (i3) {
                                                    case 0:
                                                        ArrayList arrayList2 = (ArrayList) obj;
                                                        g0Var.getClass();
                                                        try {
                                                            if (g0Var.c == null && (jSONObject2 = g0Var.d) != null && jSONObject2.getBoolean("success")) {
                                                                Iterator it = arrayList2.iterator();
                                                                while (it.hasNext()) {
                                                                    f6a.m(((cq5) it.next()).a);
                                                                }
                                                                break;
                                                            }
                                                        } catch (JSONException unused) {
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        e6a e6aVar = (e6a) obj;
                                                        g0Var.getClass();
                                                        try {
                                                            if (g0Var.c == null && (jSONObject3 = g0Var.d) != null && jSONObject3.getBoolean("success")) {
                                                                f6a.m(e6aVar.a);
                                                                break;
                                                            }
                                                        } catch (JSONException unused2) {
                                                            return;
                                                        }
                                                        break;
                                                }
                                            }
                                        }));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                f0 f0Var = new f0(arrayList);
                                String str2 = d0.j;
                                h.i(f0Var);
                                new e0(f0Var).executeOnExecutor(w.c(), new Void[0]);
                            }
                        }
                        cw3.b = true;
                    }
                    q.b(o.ThreadCheck);
                    return;
                }
                return;
            case 4:
                if (z) {
                    w wVar2 = w.a;
                    if (!k0.c() || com.facebook.internal.k0.y()) {
                        return;
                    }
                    File o2 = f6a.o();
                    if (o2 == null) {
                        listFiles2 = new File[0];
                    } else {
                        listFiles2 = o2.listFiles(new dw3(5));
                        listFiles2.getClass();
                    }
                    final ArrayList arrayList2 = new ArrayList();
                    for (File file2 : listFiles2) {
                        file2.getClass();
                        cq5 cq5Var = new cq5();
                        String name = file2.getName();
                        name.getClass();
                        cq5Var.a = name;
                        JSONObject z2 = f6a.z(name);
                        if (z2 != null) {
                            cq5Var.c = Long.valueOf(z2.optLong("timestamp", 0L));
                            cq5Var.b = z2.optString("error_message", null);
                        }
                        if (cq5Var.b != null && cq5Var.c != null) {
                            arrayList2.add(cq5Var);
                        }
                    }
                    n13.u(new z(27), arrayList2);
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < arrayList2.size() && i3 < 1000; i3++) {
                        jSONArray.put(arrayList2.get(i3));
                    }
                    f6a.E("error_reports", jSONArray, new z() { // from class: dq5
                        @Override // com.facebook.z
                        public final void a(g0 g0Var) {
                            JSONObject jSONObject2;
                            JSONObject jSONObject3;
                            int i32 = i;
                            Object obj = arrayList2;
                            switch (i32) {
                                case 0:
                                    ArrayList arrayList22 = (ArrayList) obj;
                                    g0Var.getClass();
                                    try {
                                        if (g0Var.c == null && (jSONObject2 = g0Var.d) != null && jSONObject2.getBoolean("success")) {
                                            Iterator it = arrayList22.iterator();
                                            while (it.hasNext()) {
                                                f6a.m(((cq5) it.next()).a);
                                            }
                                            break;
                                        }
                                    } catch (JSONException unused2) {
                                        return;
                                    }
                                    break;
                                default:
                                    e6a e6aVar = (e6a) obj;
                                    g0Var.getClass();
                                    try {
                                        if (g0Var.c == null && (jSONObject3 = g0Var.d) != null && jSONObject3.getBoolean("success")) {
                                            f6a.m(e6aVar.a);
                                            break;
                                        }
                                    } catch (JSONException unused22) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                if (z) {
                    AtomicBoolean atomicBoolean = b0.a;
                    synchronized (b0.class) {
                        Set set = cw3.a;
                        if (set.contains(b0.class)) {
                            return;
                        }
                        try {
                        } catch (Throwable th) {
                            cw3.a(b0.class, th);
                        }
                        if (b0.a.getAndSet(true)) {
                            return;
                        }
                        w wVar3 = w.a;
                        if (k0.c()) {
                            b0.a();
                        }
                        int i4 = y.a;
                        if (!set.contains(y.class)) {
                            try {
                                y.b.scheduleWithFixedDelay(y.d, 0L, 500L, TimeUnit.MILLISECONDS);
                            } catch (Throwable th2) {
                                cw3.a(y.class, th2);
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // defpackage.vfh
    public boolean e() {
        return false;
    }

    @Override // defpackage.puk
    public void j(View view, float f) {
        int i = MaterialCalendarView.C;
        view.setAlpha((float) Math.sqrt(1.0f - Math.min(1.0f, Math.abs(f))));
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        boolean a;
        a = LogCpt.a(eVar);
        return a;
    }
}
