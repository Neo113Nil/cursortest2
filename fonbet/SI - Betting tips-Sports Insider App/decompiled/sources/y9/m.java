package y9;

import androidx.recyclerview.widget.u;
import com.google.android.gms.internal.measurement.d5;
import com.google.firebase.messaging.x;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.a0;
import com.logrocket.core.f0;
import com.logrocket.core.h0;
import io.sentry.i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wg.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements aa.f {

    /* renamed from: l, reason: collision with root package name */
    public static final i0 f25759l = new i0(3);

    /* renamed from: a, reason: collision with root package name */
    public final x f25760a;

    /* renamed from: b, reason: collision with root package name */
    public final LogRocketCore f25761b;

    /* renamed from: c, reason: collision with root package name */
    public final LogRocketCore f25762c;

    /* renamed from: d, reason: collision with root package name */
    public final u f25763d;

    /* renamed from: g, reason: collision with root package name */
    public final a0 f25766g;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f25768i;
    public final ba.d j;

    /* renamed from: k, reason: collision with root package name */
    public final FutureTask f25769k;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25764e = new AtomicBoolean(true);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25765f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f25767h = new AtomicBoolean(false);

    public m(x xVar, LogRocketCore logRocketCore, LogRocketCore logRocketCore2, u uVar, a0 a0Var) {
        new ArrayList();
        this.f25768i = new AtomicReference(a0.f6404a);
        this.j = new ba.d("uploader");
        this.f25769k = new FutureTask(f25759l);
        this.f25760a = xVar;
        this.f25761b = logRocketCore;
        this.f25762c = logRocketCore2;
        this.f25763d = uVar;
        this.f25766g = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(List list, boolean z5) {
        String str;
        Iterator it;
        boolean z7;
        LogRocketCore logRocketCore;
        HashSet hashSet;
        String string;
        Integer valueOf;
        boolean z10;
        Integer valueOf2;
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        boolean z11 = false;
        Integer num = null;
        j jVar = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            ba.d dVar = this.j;
            LogRocketCore logRocketCore2 = this.f25761b;
            if (!hasNext) {
                boolean z12 = z11;
                if (logRocketCore2 != null && z5) {
                    if (z12) {
                        if (num != null && logRocketCore2.N.f6447c == num.intValue()) {
                            logRocketCore2.f("Limited lookback CR detected - suspending session: " + logRocketCore2.N.f6446b + "/" + num);
                            logRocketCore2.f6463b.put(String.valueOf(num), Boolean.FALSE);
                            logRocketCore2.N.j = false;
                            aa.g gVar = new aa.g(aa.j.a("lr-limited-lookback"), new com.logrocket.core.m(logRocketCore2, 0), null, 30000, 30000);
                            logRocketCore2.P = gVar;
                            gVar.c();
                        }
                        dVar.o("Limited lookback CR detected - suspending session: " + num);
                    } else {
                        logRocketCore2.m();
                    }
                    ba.d dVar2 = logRocketCore2.f6382e;
                    v9.d dVar3 = logRocketCore2.j;
                    if (logRocketCore2.f6387k.compareAndSet(false, true)) {
                        dVar3.getClass();
                        ArrayList arrayList3 = dVar3.f24477e;
                        AtomicBoolean atomicBoolean = dVar3.j;
                        if (jVar != null) {
                            try {
                                JSONObject jSONObject = jVar.f25756b;
                                if (jSONObject != null) {
                                    dVar3.f24483l = Double.valueOf(jSONObject.getDouble("recordingConditionThreshold"));
                                }
                            } catch (JSONException e7) {
                                dVar3.f24482k.f("Recording condition threshold could not be parsed", e7);
                            }
                        }
                        ArrayList arrayList4 = dVar3.f24475c;
                        if (arrayList4.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                dVar3.g(((j) it3.next()).f25756b);
                            }
                            if (!arrayList4.isEmpty()) {
                                atomicBoolean.set(false);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                dVar3.j(((j) it4.next()).f25756b);
                            }
                            if (!arrayList3.isEmpty()) {
                                atomicBoolean.set(false);
                            }
                            dVar3.l();
                        }
                        dVar3.l();
                        boolean isEmpty = arrayList3.isEmpty();
                        String valueOf3 = String.valueOf(logRocketCore2.N.f6447c);
                        if (logRocketCore2.f6465d == 0) {
                            if (isEmpty) {
                                logRocketCore2.f6465d = 1;
                                dVar2.o("Lookback type set - NONE");
                            } else if (!logRocketCore2.f6463b.containsKey(valueOf3) || ((Boolean) logRocketCore2.f6463b.get(valueOf3)).booleanValue()) {
                                logRocketCore2.f6465d = 3;
                                dVar2.o("Lookback type set - FULL");
                            } else {
                                logRocketCore2.f6465d = 2;
                                logRocketCore2.c();
                                dVar2.o("Lookback type set - LIMITED");
                            }
                        }
                        if (!logRocketCore2.f6463b.containsKey(valueOf3)) {
                            logRocketCore2.f6463b.put(valueOf3, Boolean.valueOf(isEmpty));
                            logRocketCore2.N.j = isEmpty;
                            logRocketCore2.m();
                        }
                    }
                }
                return z12;
            }
            j jVar2 = (j) it2.next();
            int i5 = jVar2.f25755a;
            JSONObject jSONObject2 = jVar2.f25756b;
            switch (i5) {
                case 1:
                    str = "QUOTA_EXCEEDED";
                    break;
                case 2:
                    str = "USER_QUOTA_EXCEEDED";
                    break;
                case 3:
                    str = "APP_QUOTA_EXCEEDED";
                    break;
                case 4:
                    str = "BLOCK_RECORDING";
                    break;
                case 5:
                    str = "PAUSE_RECORDING";
                    break;
                case 6:
                    str = "START_NEW_SESSION";
                    break;
                case 7:
                    str = "SDK_VERSION_BLOCKED";
                    break;
                case 8:
                    str = "DASHBOARD_URL";
                    break;
                case 9:
                    str = "FILTERS";
                    break;
                case 10:
                    str = "RECORDING_CONDITION_THRESHOLD";
                    break;
                case 11:
                    str = "RECORDING_CONDITIONS";
                    break;
                case 12:
                    str = "SESSIONS_TRIGGERED";
                    break;
                case 13:
                    str = "SUSPEND_RECORDING";
                    break;
                case 14:
                    str = "EXTRA_QS_PARAMS";
                    break;
                case 15:
                    str = "ALLOW_THIRD_PARTY_URLS";
                    break;
                case 16:
                    str = "INACTIVITY_TIME_THRESHOLD";
                    break;
                default:
                    str = "null";
                    break;
            }
            dVar.a("Handling relay message ".concat(str));
            switch (k.f25757a[v.f.d(i5)]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    switch (i5) {
                        case 1:
                            str2 = "QUOTA_EXCEEDED";
                            break;
                        case 2:
                            str2 = "USER_QUOTA_EXCEEDED";
                            break;
                        case 3:
                            str2 = "APP_QUOTA_EXCEEDED";
                            break;
                        case 4:
                            str2 = "BLOCK_RECORDING";
                            break;
                        case 5:
                            str2 = "PAUSE_RECORDING";
                            break;
                        case 6:
                            str2 = "START_NEW_SESSION";
                            break;
                        case 7:
                            str2 = "SDK_VERSION_BLOCKED";
                            break;
                        case 8:
                            str2 = "DASHBOARD_URL";
                            break;
                        case 9:
                            str2 = "FILTERS";
                            break;
                        case 10:
                            str2 = "RECORDING_CONDITION_THRESHOLD";
                            break;
                        case 11:
                            str2 = "RECORDING_CONDITIONS";
                            break;
                        case 12:
                            str2 = "SESSIONS_TRIGGERED";
                            break;
                        case 13:
                            str2 = "SUSPEND_RECORDING";
                            break;
                        case 14:
                            str2 = "EXTRA_QS_PARAMS";
                            break;
                        case 15:
                            str2 = "ALLOW_THIRD_PARTY_URLS";
                            break;
                        case 16:
                            str2 = "INACTIVITY_TIME_THRESHOLD";
                            break;
                        default:
                            throw null;
                    }
                    throw new l(str2);
                case 8:
                    it = it2;
                    z7 = z11;
                    arrayList.add(jVar2);
                    z11 = z7;
                    it2 = it;
                case 9:
                    jVar = jVar2;
                case 10:
                    it = it2;
                    z7 = z11;
                    arrayList2.add(jVar2);
                    z11 = z7;
                    it2 = it;
                case 11:
                    it = it2;
                    z7 = z11;
                    if (z5 && (logRocketCore = this.f25762c) != null) {
                        if (jSONObject2 != null) {
                            try {
                                hashSet = new HashSet();
                                JSONArray jSONArray = jSONObject2.getJSONArray("sessionIDs");
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    hashSet.add(Integer.valueOf(jSONArray.getInt(i10)));
                                }
                            } catch (JSONException unused) {
                            }
                            if (hashSet != null) {
                                Iterator it5 = logRocketCore.f6464c.iterator();
                                while (it5.hasNext()) {
                                    Integer num2 = (Integer) it5.next();
                                    if (hashSet.contains(num2)) {
                                        logRocketCore.f6464c.remove(num2);
                                    }
                                }
                            }
                        }
                        hashSet = null;
                        if (hashSet != null) {
                        }
                    }
                    z11 = z7;
                    it2 = it;
                    break;
                case 12:
                    it = it2;
                    z7 = z11;
                    if (z5 && logRocketCore2 != null) {
                        if (jSONObject2 != null) {
                            try {
                                string = jSONObject2.getString("dashboardURL");
                            } catch (JSONException unused2) {
                            }
                            if (string != null) {
                                com.logrocket.core.f fVar = logRocketCore2.f6383f;
                                fVar.getClass();
                                fVar.f6426b = string;
                            }
                        }
                        string = null;
                        if (string != null) {
                        }
                    }
                    z11 = z7;
                    it2 = it;
                case 13:
                    it = it2;
                    if (jSONObject2 != null) {
                        try {
                            valueOf = Integer.valueOf(jSONObject2.getInt("sessionID"));
                        } catch (JSONException unused3) {
                        }
                        if (valueOf != null) {
                            num = valueOf;
                        }
                        z11 = true;
                        it2 = it;
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    z11 = true;
                    it2 = it;
                case 14:
                    u uVar = this.f25763d;
                    ba.d dVar4 = (ba.d) uVar.f2564d;
                    if (jSONObject2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object opt = jSONObject2.opt(next);
                            if (opt == null) {
                                dVar4.d("Extra query parameter '" + next + "' has a null value");
                            } else if (opt instanceof String) {
                                sb2.append("&");
                                sb2.append(d5.G(next, (String) opt));
                            } else if (opt instanceof Boolean) {
                                sb2.append("&");
                                sb2.append(d5.H(next, ((Boolean) opt).booleanValue()));
                            } else if (opt instanceof Integer) {
                                sb2.append("&");
                                sb2.append(d5.F(((Integer) opt).intValue(), next));
                            } else {
                                Iterator it6 = it2;
                                if (opt instanceof Long) {
                                    sb2.append("&");
                                    z10 = z11;
                                    sb2.append(next + "=" + ((Long) opt).longValue());
                                } else {
                                    z10 = z11;
                                    if (opt instanceof Double) {
                                        sb2.append("&");
                                        sb2.append(next + "=" + ((Double) opt).doubleValue());
                                    } else {
                                        StringBuilder p10 = d9.e.p("Could not serialize extra query parameter '", next, "' of type ");
                                        p10.append(opt.getClass().getName());
                                        dVar4.d(p10.toString());
                                    }
                                }
                                z11 = z10;
                                it2 = it6;
                            }
                        }
                        it = it2;
                        z7 = z11;
                        uVar.f2567g = sb2.toString();
                        z11 = z7;
                        it2 = it;
                    }
                    it = it2;
                    z7 = z11;
                    z11 = z7;
                    it2 = it;
                case 15:
                default:
                    it = it2;
                    z7 = z11;
                    z11 = z7;
                    it2 = it;
                case 16:
                    if (jSONObject2 != null) {
                        try {
                            valueOf2 = Integer.valueOf(jSONObject2.getInt("inactivityTimeMinutes"));
                        } catch (JSONException unused4) {
                        }
                        if (logRocketCore2 != null && valueOf2 != null) {
                            logRocketCore2.U = TimeUnit.MILLISECONDS.convert(Math.min(1440, Math.max(valueOf2.intValue(), 1)), TimeUnit.MINUTES);
                        }
                        it = it2;
                        z7 = z11;
                        z11 = z7;
                        it2 = it;
                    }
                    valueOf2 = null;
                    if (logRocketCore2 != null) {
                        logRocketCore2.U = TimeUnit.MILLISECONDS.convert(Math.min(1440, Math.max(valueOf2.intValue(), 1)), TimeUnit.MINUTES);
                    }
                    it = it2;
                    z7 = z11;
                    z11 = z7;
                    it2 = it;
            }
        }
    }

    public final void b(q qVar) {
        if (this.f25764e.get()) {
            x xVar = this.f25760a;
            xVar.getClass();
            int b10 = qVar.b(null);
            b m6 = ((androidx.appcompat.widget.a0) xVar.f6183b).m();
            if ((m6 != null ? m6.b() : 0L) + b10 > 52428800) {
                try {
                    try {
                        this.f25760a.t();
                        LogRocketCore.k("Flushed early due to large batch size");
                    } catch (IOException e7) {
                        this.j.e("Fatal error flushing event batch.", e7);
                        h0.c(e7);
                        throw new l("flushPersistenceError");
                    }
                } catch (l e9) {
                    this.j.j("Received shutdown signal when adding event: " + e9.f25758a);
                    LogRocketCore logRocketCore = this.f25761b;
                    if (logRocketCore != null) {
                        logRocketCore.s(e9.f25758a);
                    }
                }
            }
            x xVar2 = this.f25760a;
            synchronized (xVar2) {
                ((androidx.appcompat.widget.a0) xVar2.f6183b).i(qVar);
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) xVar2.f6183b;
                if (((c) a0Var.f682d) instanceof f) {
                    b m10 = a0Var.m();
                    if ((m10 != null ? m10.b() : 0L) + ((l4.e) xVar2.f6184c).f19359a > 52428800) {
                        throw new IOException("LogRocket is using too much memory. Disabling");
                    }
                }
            }
        }
    }

    @Override // aa.f
    public final void c() {
        ba.d dVar = this.j;
        x xVar = this.f25760a;
        try {
            if (this.f25764e.get()) {
                try {
                    xVar.t();
                    LogRocketCore logRocketCore = this.f25762c;
                    if (logRocketCore != null) {
                        String valueOf = String.valueOf(((f0) xVar.f6182a).f6447c);
                        if (logRocketCore.f6465d == 2 && logRocketCore.f6463b.containsKey(valueOf) && !((Boolean) logRocketCore.f6463b.get(valueOf)).booleanValue()) {
                            dVar.a("Limited lookback CR detected. Session unconfirmed and skipping upload. Pending batch count: " + ((ArrayList) ((l4.e) xVar.f6184c).f19360b).size());
                            return;
                        }
                    }
                    if (this.f25767h.get() || !this.f25765f.get()) {
                        return;
                    }
                    a0 a0Var = this.f25766g;
                    if (a0Var != a0.f6404a && a0Var != ((a0) this.f25768i.get())) {
                        return;
                    }
                    e();
                } catch (IOException e7) {
                    dVar.e("Fatal error flushing event batch.", e7);
                    h0.c(e7);
                    throw new l("flushPersistenceError");
                }
            }
        } catch (l e9) {
            StringBuilder sb2 = new StringBuilder("Received shutdown signal: ");
            String str = e9.f25758a;
            sb2.append(str);
            dVar.j(sb2.toString());
            LogRocketCore logRocketCore2 = this.f25761b;
            if (logRocketCore2 != null) {
                logRocketCore2.s(str);
            }
        }
    }

    @Override // aa.f
    public final void d() {
        c();
        this.f25764e.set(false);
        this.f25769k.run();
    }

    public final void e() {
        b bVar;
        x xVar = this.f25760a;
        synchronized (xVar) {
            Iterator it = ((ArrayList) ((l4.e) xVar.f6184c).f19360b).iterator();
            bVar = null;
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                if (bVar != null) {
                    if (!bVar.f25740a.f25735a.b(bVar2.f25740a.f25735a) || bVar.b() + bVar2.b() > 10485760) {
                        break;
                    } else {
                        bVar = g.j(bVar, bVar2);
                    }
                } else {
                    bVar = bVar2;
                }
            }
        }
        if (bVar != null) {
            boolean b10 = ((f0) this.f25760a.f6182a).b(bVar.f25740a.f25735a);
            try {
                this.j.o("Starting batch upload.");
                androidx.appcompat.widget.a i5 = this.f25763d.i(bVar);
                boolean z5 = false;
                boolean z7 = true;
                if (i5.f676a != 1) {
                    z7 = false;
                }
                if (!z7) {
                    this.j.o("Batch upload failed! Will retry at next tick.");
                    return;
                }
                if (i5.f677b) {
                    this.j.a("Successful upload with messages in result.");
                    z5 = a((ArrayList) i5.f678c, b10);
                } else {
                    this.j.a("Successful upload without messages in result.");
                }
                LogRocketCore logRocketCore = this.f25761b;
                if (logRocketCore != null && b10 && logRocketCore.A.get()) {
                    this.f25761b.r();
                }
                if (b10 && z5) {
                    this.j.o("Limited lookback CR detected. Session is unconfirmed. Suspending upload");
                } else {
                    this.f25760a.J(bVar);
                }
            } catch (l e7) {
                this.f25760a.K(bVar.f25740a.f25735a);
                if (b10) {
                    throw e7;
                }
            }
        }
    }

    public final void f() {
        try {
            this.f25769k.get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            this.j.d("Error when waiting for last upload, some events may be lost: " + e7.getMessage());
        }
    }
}
