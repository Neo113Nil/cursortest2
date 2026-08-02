package e6;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import io.sentry.android.core.w0;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f8690p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f8691r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static e f8692s;

    /* renamed from: a, reason: collision with root package name */
    public long f8693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8694b;

    /* renamed from: c, reason: collision with root package name */
    public TelemetryData f8695c;

    /* renamed from: d, reason: collision with root package name */
    public i6.d f8696d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f8697e;

    /* renamed from: f, reason: collision with root package name */
    public final c6.c f8698f;

    /* renamed from: g, reason: collision with root package name */
    public final l1.a f8699g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f8700h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f8701i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public n f8702k;

    /* renamed from: l, reason: collision with root package name */
    public final s.f f8703l;

    /* renamed from: m, reason: collision with root package name */
    public final s.f f8704m;

    /* renamed from: n, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.h0 f8705n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f8706o;

    public e(Context context, Looper looper) {
        c6.c cVar = c6.c.f3657e;
        this.f8693a = 10000L;
        this.f8694b = false;
        this.f8700h = new AtomicInteger(1);
        this.f8701i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f8702k = null;
        this.f8703l = new s.f(0);
        this.f8704m = new s.f(0);
        this.f8706o = true;
        this.f8697e = context;
        com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0(looper, this);
        Looper.getMainLooper();
        this.f8705n = h0Var;
        this.f8698f = cVar;
        this.f8699g = new l1.a(21);
        PackageManager packageManager = context.getPackageManager();
        if (q6.b.f22045f == null) {
            q6.b.f22045f = Boolean.valueOf(q6.b.e() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (q6.b.f22045f.booleanValue()) {
            this.f8706o = false;
        }
        h0Var.sendMessage(h0Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (f8691r) {
            try {
                e eVar = f8692s;
                if (eVar != null) {
                    eVar.f8701i.incrementAndGet();
                    com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
                    h0Var.sendMessageAtFrontOfQueue(h0Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status d(a aVar, ConnectionResult connectionResult) {
        String str = (String) aVar.f8668b.f19315c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(17, d9.e.n(new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), connectionResult.f4442c, connectionResult);
    }

    public static e e(Context context) {
        e eVar;
        synchronized (f8691r) {
            try {
                if (f8692s == null) {
                    Looper looper = g6.g0.b().getLooper();
                    context.getPackageName();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = c6.c.f3656d;
                    e eVar2 = new e(applicationContext, looper);
                    g6.f.A = g6.p.a(eVar2.f8697e);
                    f8692s = eVar2;
                }
                eVar = f8692s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final p b(d6.g gVar) {
        a aVar = gVar.f8254f;
        ConcurrentHashMap concurrentHashMap = this.j;
        p pVar = (p) concurrentHashMap.get(aVar);
        if (pVar == null) {
            pVar = new p(this, gVar);
            concurrentHashMap.put(aVar, pVar);
        }
        if (pVar.f8736f.b()) {
            this.f8704m.add(aVar);
        }
        pVar.q();
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(w7.g gVar, int i5, d6.g gVar2) {
        t tVar;
        e eVar;
        if (i5 == 0) {
            return;
        }
        a aVar = gVar2.f8254f;
        if (g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) g6.h.b().f9846a;
            boolean z5 = true;
            if (rootTelemetryConfiguration != null) {
                if (rootTelemetryConfiguration.f4528b) {
                    boolean z7 = rootTelemetryConfiguration.f4529c;
                    p pVar = (p) this.j.get(aVar);
                    if (pVar != null) {
                        Object obj = pVar.f8736f;
                        if (obj instanceof g6.e) {
                            g6.e eVar2 = (g6.e) obj;
                            if (eVar2.f9824w != null && !eVar2.r()) {
                                ConnectionTelemetryConfiguration a7 = t.a(pVar, eVar2, i5);
                                if (a7 != null) {
                                    pVar.f8745p++;
                                    z5 = a7.f4499c;
                                }
                            }
                        }
                    }
                    z5 = z7;
                }
            }
            eVar = this;
            tVar = new t(eVar, i5, aVar, z5 ? System.currentTimeMillis() : 0L, z5 ? SystemClock.elapsedRealtime() : 0L);
            if (tVar == null) {
                w7.m mVar = gVar.f24979a;
                com.google.android.gms.internal.measurement.h0 h0Var = eVar.f8705n;
                Objects.requireNonNull(h0Var);
                mVar.b(new r(0, h0Var), tVar);
                return;
            }
            return;
        }
        tVar = null;
        eVar = this;
        if (tVar == null) {
        }
    }

    public final void f(n nVar) {
        synchronized (f8691r) {
            try {
                if (this.f8702k != nVar) {
                    this.f8702k = nVar;
                    this.f8703l.clear();
                }
                this.f8703l.addAll(nVar.f8732f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g() {
        if (this.f8694b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) g6.h.b().f9846a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.f4528b) {
            return false;
        }
        int N = this.f8699g.N(203400000);
        return N == -1 || N == 0;
    }

    public final boolean h(ConnectionResult connectionResult, int i5) {
        PendingIntent pendingIntent;
        int i10 = connectionResult.f4441b;
        c6.c cVar = this.f8698f;
        cVar.getClass();
        if (i10 != 9) {
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    switch (i10) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            break;
                        default:
                            w0.m("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(connectionResult)));
                            return false;
                    }
            }
        }
        Context context = this.f8697e;
        if (!s6.a.p(context)) {
            int i11 = connectionResult.f4441b;
            if (i11 == 0 || (pendingIntent = connectionResult.f4442c) == null) {
                pendingIntent = null;
                Intent a7 = cVar.a(context, i11, null);
                if (a7 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a7, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i12 = connectionResult.f4441b;
                int i13 = GoogleApiActivity.f4457b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i5);
                intent.putExtra("notify_manager", true);
                cVar.f(context, new ConnectionResult(1, i12, PendingIntent.getActivity(context, 0, intent, h7.c.f10389a | 134217728), connectionResult.f4443d, connectionResult.f4444e));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0308  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        p pVar;
        boolean z5;
        Feature[] f6;
        int i5 = message.what;
        g6.i iVar = g6.i.f9849b;
        com.google.android.gms.internal.measurement.h0 h0Var = this.f8705n;
        ConcurrentHashMap concurrentHashMap = this.j;
        switch (i5) {
            case 1:
                this.f8693a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                h0Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    h0Var.sendMessageDelayed(h0Var.obtainMessage(12, (a) it.next()), this.f8693a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (p pVar2 : concurrentHashMap.values()) {
                    g6.v.d(pVar2.q.f8705n);
                    pVar2.f8744o = null;
                    pVar2.q();
                }
                return true;
            case 4:
            case 8:
            case 13:
                w wVar = (w) message.obj;
                d6.g gVar = wVar.f8762c;
                e0 e0Var = wVar.f8760a;
                p pVar3 = (p) concurrentHashMap.get(gVar.f8254f);
                if (pVar3 == null) {
                    pVar3 = b(gVar);
                }
                if (!pVar3.f8736f.b() || this.f8701i.get() == wVar.f8761b) {
                    pVar3.o(e0Var);
                    return true;
                }
                e0Var.a(f8690p);
                pVar3.p();
                return true;
            case 5:
                int i10 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        pVar = (p) it2.next();
                        if (pVar.f8740k == i10) {
                        }
                    } else {
                        pVar = null;
                    }
                }
                if (pVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 65);
                    sb2.append("Could not find API instance ");
                    sb2.append(i10);
                    sb2.append(" while trying to fail enqueued calls.");
                    w0.o("GoogleApiManager", sb2.toString(), new Exception());
                    return true;
                }
                int i11 = connectionResult.f4441b;
                if (i11 != 13) {
                    pVar.j(d(pVar.f8737g, connectionResult));
                    return true;
                }
                this.f8698f.getClass();
                AtomicBoolean atomicBoolean = c6.g.f3661a;
                String c2 = ConnectionResult.c(i11);
                String str = connectionResult.f4443d;
                pVar.j(new Status(17, d9.e.n(new StringBuilder(String.valueOf(c2).length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", c2, ": ", str), null, null));
                return true;
            case 6:
                Context context = this.f8697e;
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.f8679e;
                    cVar.a(new o(this));
                    AtomicBoolean atomicBoolean2 = cVar.f8680a;
                    AtomicBoolean atomicBoolean3 = cVar.f8681b;
                    if (!atomicBoolean3.get()) {
                        if (q6.d.b()) {
                            z5 = true;
                            if (!z5) {
                                this.f8693a = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z5 = atomicBoolean2.get();
                    if (!z5) {
                    }
                }
                return true;
            case 7:
                b((d6.g) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p pVar4 = (p) concurrentHashMap.get(message.obj);
                    g6.v.d(pVar4.q.f8705n);
                    if (pVar4.f8742m) {
                        pVar4.q();
                        return true;
                    }
                }
                return true;
            case 10:
                s.f fVar = this.f8704m;
                fVar.getClass();
                s.a aVar = new s.a(fVar);
                while (aVar.hasNext()) {
                    p pVar5 = (p) concurrentHashMap.remove((a) aVar.next());
                    if (pVar5 != null) {
                        pVar5.p();
                    }
                }
                fVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p pVar6 = (p) concurrentHashMap.get(message.obj);
                    e eVar = pVar6.q;
                    g6.v.d(eVar.f8705n);
                    boolean z7 = pVar6.f8742m;
                    if (z7) {
                        if (z7) {
                            e eVar2 = pVar6.q;
                            a aVar2 = pVar6.f8737g;
                            eVar2.f8705n.removeMessages(11, aVar2);
                            eVar2.f8705n.removeMessages(9, aVar2);
                            pVar6.f8742m = false;
                        }
                        pVar6.j(eVar.f8698f.b(eVar.f8697e, c6.d.f3659a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        ((g6.e) pVar6.f8736f).f("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    p pVar7 = (p) concurrentHashMap.get(message.obj);
                    g6.v.d(pVar7.q.f8705n);
                    g6.e eVar3 = (g6.e) pVar7.f8736f;
                    if (eVar3.q() && pVar7.j.isEmpty()) {
                        x5.h hVar = pVar7.f8738h;
                        if (((Map) hVar.f25409a).isEmpty() && ((Map) hVar.f25410b).isEmpty()) {
                            eVar3.f("Timing out service connection.");
                            return true;
                        }
                        pVar7.k();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                q qVar = (q) message.obj;
                if (concurrentHashMap.containsKey(qVar.f8746a)) {
                    p pVar8 = (p) concurrentHashMap.get(qVar.f8746a);
                    if (pVar8.f8743n.contains(qVar) && !pVar8.f8742m) {
                        if (((g6.e) pVar8.f8736f).q()) {
                            pVar8.g();
                            return true;
                        }
                        pVar8.q();
                        return true;
                    }
                }
                return true;
            case 16:
                q qVar2 = (q) message.obj;
                if (concurrentHashMap.containsKey(qVar2.f8746a)) {
                    p pVar9 = (p) concurrentHashMap.get(qVar2.f8746a);
                    if (pVar9.f8743n.remove(qVar2)) {
                        e eVar4 = pVar9.q;
                        eVar4.f8705n.removeMessages(15, qVar2);
                        eVar4.f8705n.removeMessages(16, qVar2);
                        Feature feature = qVar2.f8747b;
                        LinkedList<e0> linkedList = pVar9.f8735a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (e0 e0Var2 : linkedList) {
                            if ((e0Var2 instanceof v) && (f6 = ((v) e0Var2).f(pVar9)) != null) {
                                int length = f6.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    if (!g6.v.k(f6[i12], feature)) {
                                        i12++;
                                    } else if (i12 >= 0) {
                                        arrayList.add(e0Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            e0 e0Var3 = (e0) arrayList.get(i13);
                            linkedList.remove(e0Var3);
                            e0Var3.b(new d6.m(feature));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.f8695c;
                if (telemetryData != null) {
                    if (telemetryData.f4532a > 0 || g()) {
                        if (this.f8696d == null) {
                            this.f8696d = new i6.d(this.f8697e, null, i6.d.f10999m, iVar, d6.f.f8246c);
                        }
                        this.f8696d.d(telemetryData);
                    }
                    this.f8695c = null;
                    return true;
                }
                return true;
            case 18:
                u uVar = (u) message.obj;
                long j = uVar.f8758c;
                MethodInvocation methodInvocation = uVar.f8756a;
                int i14 = uVar.f8757b;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i14, Arrays.asList(methodInvocation));
                    if (this.f8696d == null) {
                        this.f8696d = new i6.d(this.f8697e, null, i6.d.f10999m, iVar, d6.f.f8246c);
                    }
                    this.f8696d.d(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.f8695c;
                if (telemetryData3 != null) {
                    List list = telemetryData3.f4533b;
                    if (telemetryData3.f4532a != i14 || (list != null && list.size() >= uVar.f8759d)) {
                        h0Var.removeMessages(17);
                        TelemetryData telemetryData4 = this.f8695c;
                        if (telemetryData4 != null) {
                            if (telemetryData4.f4532a > 0 || g()) {
                                if (this.f8696d == null) {
                                    this.f8696d = new i6.d(this.f8697e, null, i6.d.f10999m, iVar, d6.f.f8246c);
                                }
                                this.f8696d.d(telemetryData4);
                            }
                            this.f8695c = null;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.f8695c;
                        if (telemetryData5.f4533b == null) {
                            telemetryData5.f4533b = new ArrayList();
                        }
                        telemetryData5.f4533b.add(methodInvocation);
                    }
                }
                if (this.f8695c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(methodInvocation);
                    this.f8695c = new TelemetryData(i14, arrayList2);
                    h0Var.sendMessageDelayed(h0Var.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.f8694b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 20);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                w0.m("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final void i(ConnectionResult connectionResult, int i5) {
        if (h(connectionResult, i5)) {
            return;
        }
        com.google.android.gms.internal.measurement.h0 h0Var = this.f8705n;
        h0Var.sendMessage(h0Var.obtainMessage(5, i5, 0, connectionResult));
    }
}
