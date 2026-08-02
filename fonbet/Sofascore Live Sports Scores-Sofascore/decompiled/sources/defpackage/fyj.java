package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fyj implements ne0 {
    public static final l10 r = l10.c();
    public static final fyj s = new fyj();
    public final ConcurrentHashMap a;
    public r38 d;
    public y48 e;
    public l48 f;
    public vff g;
    public o78 h;
    public Context j;
    public oi3 k;
    public wmf l;
    public oe0 m;
    public if0 n;
    public String o;
    public String p;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public boolean q = false;
    public final ThreadPoolExecutor i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public fyj() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static String a(nde ndeVar) {
        if (ndeVar.e()) {
            fsj f = ndeVar.f();
            long q = f.q();
            Locale locale = Locale.ENGLISH;
            return bf3.k("trace metric: ", f.getName(), " (duration: ", new DecimalFormat("#.####").format(q / 1000.0d), "ms)");
        }
        if (ndeVar.b()) {
            wad c = ndeVar.c();
            long r2 = c.z() ? c.r() : 0L;
            String valueOf = c.v() ? String.valueOf(c.m()) : "UNKNOWN";
            Locale locale2 = Locale.ENGLISH;
            return mz1.o(mz1.s("network request trace: ", c.getUrl(), " (responseCode: ", valueOf, ", responseTime: "), new DecimalFormat("#.####").format(r2 / 1000.0d), "ms)");
        }
        if (!ndeVar.a()) {
            return "log";
        }
        qv8 g = ndeVar.g();
        Locale locale3 = Locale.ENGLISH;
        boolean n = g.n();
        int k = g.k();
        int j = g.j();
        StringBuilder sb = new StringBuilder("gauges (hasMetadata: ");
        sb.append(n);
        sb.append(", cpuGaugeCount: ");
        sb.append(k);
        sb.append(", memoryGaugeCount: ");
        return fc6.h(j, ")", sb);
    }

    public final void b(mde mdeVar) {
        if (mdeVar.e()) {
            this.m.b("_fstec");
        } else if (mdeVar.b()) {
            this.m.b("_fsntc");
        }
    }

    public final void c(fsj fsjVar, of0 of0Var) {
        this.i.execute(new kdc(18, this, fsjVar, of0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02a1, code lost:
    
        if (defpackage.wmf.a(r0.f().r()) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0412, code lost:
    
        b(r0);
        defpackage.fyj.r.d("Event dropped due to device sampling - %s", a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02fa, code lost:
    
        if (defpackage.oi3.p(r13) != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0371, code lost:
    
        if (defpackage.wmf.a(r0.f().r()) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0410, code lost:
    
        if (defpackage.wmf.a(r0.c().n()) != false) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(lde ldeVar, of0 of0Var) {
        boolean z;
        boolean b;
        cj3 cj3Var;
        xi3 xi3Var;
        double doubleValue;
        oj3 oj3Var;
        double doubleValue2;
        String str;
        boolean z2 = true;
        if (!this.c.get()) {
            ConcurrentHashMap concurrentHashMap = this.a;
            Integer num = (Integer) concurrentHashMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
            int intValue = num.intValue();
            Integer num2 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
            int intValue2 = num2.intValue();
            Integer num3 = (Integer) concurrentHashMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
            int intValue3 = num3.intValue();
            if (ldeVar.e() && intValue > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            } else if (ldeVar.b() && intValue2 > 0) {
                concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            } else {
                if (!ldeVar.a() || intValue3 <= 0) {
                    r.a("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", a(ldeVar), num, num2, num3);
                    return;
                }
                concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            }
            r.a("Transport is not initialized yet, %s will be queued for to be dispatched later", a(ldeVar));
            this.b.add(new gde(ldeVar, of0Var));
            return;
        }
        l10 l10Var = r;
        if (this.k.o() && (!this.n.i() || this.q)) {
            try {
                str = (String) Tasks.await(((k48) this.f).c(), ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                l10Var.b("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                if0 if0Var = this.n;
                if0Var.m(of0Var);
                if (!ldeVar.e()) {
                }
                if0Var = (if0) if0Var.mo27clone();
                if (this.e == null) {
                    this.e = y48.a();
                }
                y48 y48Var = this.e;
                if0Var.j(y48Var == null ? new HashMap(y48Var.a) : Collections.EMPTY_MAP);
                ldeVar.d(if0Var);
                mde mdeVar = (mde) ldeVar.build();
                if (!this.k.o()) {
                }
                z2 = false;
                if (z2) {
                }
            } catch (ExecutionException e2) {
                l10Var.b("Unable to retrieve Installation Id: %s", e2.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                if0 if0Var2 = this.n;
                if0Var2.m(of0Var);
                if (!ldeVar.e()) {
                }
                if0Var2 = (if0) if0Var2.mo27clone();
                if (this.e == null) {
                }
                y48 y48Var2 = this.e;
                if0Var2.j(y48Var2 == null ? new HashMap(y48Var2.a) : Collections.EMPTY_MAP);
                ldeVar.d(if0Var2);
                mde mdeVar2 = (mde) ldeVar.build();
                if (!this.k.o()) {
                }
                z2 = false;
                if (z2) {
                }
            } catch (TimeoutException e3) {
                l10Var.b("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
                if0 if0Var22 = this.n;
                if0Var22.m(of0Var);
                if (!ldeVar.e()) {
                }
                if0Var22 = (if0) if0Var22.mo27clone();
                if (this.e == null) {
                }
                y48 y48Var22 = this.e;
                if0Var22.j(y48Var22 == null ? new HashMap(y48Var22.a) : Collections.EMPTY_MAP);
                ldeVar.d(if0Var22);
                mde mdeVar22 = (mde) ldeVar.build();
                if (!this.k.o()) {
                }
                z2 = false;
                if (z2) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.n.l(str);
            } else {
                l10Var.getClass();
            }
        }
        if0 if0Var222 = this.n;
        if0Var222.m(of0Var);
        if (!ldeVar.e() || ldeVar.b()) {
            if0Var222 = (if0) if0Var222.mo27clone();
            if (this.e == null && this.c.get()) {
                this.e = y48.a();
            }
            y48 y48Var222 = this.e;
            if0Var222.j(y48Var222 == null ? new HashMap(y48Var222.a) : Collections.EMPTY_MAP);
        }
        ldeVar.d(if0Var222);
        mde mdeVar222 = (mde) ldeVar.build();
        if (!this.k.o()) {
            if (mdeVar222.h().k()) {
                Context context = this.j;
                Pattern pattern = ode.a;
                ArrayList arrayList = new ArrayList();
                if (mdeVar222.e()) {
                    arrayList.add(new x48(mdeVar222.f()));
                }
                if (mdeVar222.b()) {
                    arrayList.add(new w48(mdeVar222.c(), context));
                }
                if (mdeVar222.i()) {
                    arrayList.add(new t48(mdeVar222.h()));
                }
                if (mdeVar222.a()) {
                    arrayList.add(new v48(mdeVar222.g()));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((ode) it.next()).a()) {
                        }
                    }
                    wmf wmfVar = this.l;
                    wmfVar.getClass();
                    double d = 1.0d;
                    if (mdeVar222.e()) {
                        oi3 oi3Var = wmfVar.a;
                        oi3Var.getClass();
                        synchronized (oj3.class) {
                            oj3Var = oj3.h;
                            if (oj3Var == null) {
                                oj3Var = new oj3();
                                oj3.h = oj3Var;
                            }
                        }
                        jvd jvdVar = oi3Var.a.getDouble("fpr_vc_trace_sampling_rate");
                        if (jvdVar.b() && oi3.p(((Double) jvdVar.a()).doubleValue())) {
                            oi3Var.c.e("com.google.firebase.perf.TraceSamplingRate", ((Double) jvdVar.a()).doubleValue());
                            doubleValue2 = ((Double) jvdVar.a()).doubleValue();
                        } else {
                            jvd b2 = oi3Var.b(oj3Var);
                            doubleValue2 = (b2.b() && oi3.p(((Double) b2.a()).doubleValue())) ? ((Double) b2.a()).doubleValue() : oi3Var.a.isLastFetchFailed() ? 0.001d : 1.0d;
                        }
                        if (wmfVar.b >= doubleValue2) {
                        }
                    }
                    if (mdeVar222.e() && mdeVar222.f().getName().startsWith("_st_") && mdeVar222.f().l()) {
                        oi3 oi3Var2 = wmfVar.a;
                        oi3Var2.getClass();
                        synchronized (xi3.class) {
                            xi3Var = xi3.h;
                            if (xi3Var == null) {
                                xi3Var = new xi3();
                                xi3.h = xi3Var;
                            }
                        }
                        jvd i = oi3Var2.i(xi3Var);
                        if (i.b()) {
                            doubleValue = ((Double) i.a()).doubleValue() / 100.0d;
                        }
                        jvd jvdVar2 = oi3Var2.a.getDouble("fpr_vc_fragment_sampling_rate");
                        if (jvdVar2.b() && oi3.p(((Double) jvdVar2.a()).doubleValue())) {
                            oi3Var2.c.e("com.google.firebase.perf.FragmentSamplingRate", ((Double) jvdVar2.a()).doubleValue());
                            doubleValue = ((Double) jvdVar2.a()).doubleValue();
                        } else {
                            jvd b3 = oi3Var2.b(xi3Var);
                            doubleValue = (b3.b() && oi3.p(((Double) b3.a()).doubleValue())) ? ((Double) b3.a()).doubleValue() : 0.0d;
                        }
                        if (wmfVar.c >= doubleValue) {
                        }
                    }
                    if (mdeVar222.b()) {
                        oi3 oi3Var3 = wmfVar.a;
                        oi3Var3.getClass();
                        synchronized (cj3.class) {
                            cj3Var = cj3.h;
                            if (cj3Var == null) {
                                cj3Var = new cj3();
                                cj3.h = cj3Var;
                            }
                        }
                        jvd jvdVar3 = oi3Var3.a.getDouble("fpr_vc_network_request_sampling_rate");
                        if (jvdVar3.b() && oi3.p(((Double) jvdVar3.a()).doubleValue())) {
                            oi3Var3.c.e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) jvdVar3.a()).doubleValue());
                            d = ((Double) jvdVar3.a()).doubleValue();
                        } else {
                            jvd b4 = oi3Var3.b(cj3Var);
                            if (b4.b() && oi3.p(((Double) b4.a()).doubleValue())) {
                                d = ((Double) b4.a()).doubleValue();
                            } else if (oi3Var3.a.isLastFetchFailed()) {
                                d = 0.001d;
                            }
                        }
                        if (wmfVar.b >= d) {
                        }
                    }
                    wmf wmfVar2 = this.l;
                    wmfVar2.getClass();
                    if ((!mdeVar222.e() || (!(mdeVar222.f().getName().equals("_fs") || mdeVar222.f().getName().equals("_bs")) || mdeVar222.f().m() <= 0)) && !mdeVar222.a()) {
                        if (mdeVar222.b()) {
                            b = wmfVar2.e.b();
                        } else if (mdeVar222.e()) {
                            b = wmfVar2.d.b();
                        } else {
                            z = true;
                        }
                        z = !b;
                    } else {
                        z = false;
                    }
                    if (z) {
                        b(mdeVar222);
                        r.d("Rate limited (per device) - %s", a(mdeVar222));
                    }
                    if (z2) {
                        l10 l10Var2 = r;
                        if (mdeVar222.e()) {
                            String a = a(mdeVar222);
                            String name = mdeVar222.f().getName();
                            boolean startsWith = name.startsWith("_st_");
                            String str2 = this.p;
                            String str3 = this.o;
                            l10Var2.d("Logging %s. In a minute, visit the Firebase console to view your data: %s", a, startsWith ? fc6.n(oyn.G(str2, str3), "/troubleshooting/trace/SCREEN_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide") : fc6.n(oyn.G(str2, str3), "/troubleshooting/trace/DURATION_TRACE/", name, "?utm_source=perf-android-sdk&utm_medium=android-ide"));
                        } else {
                            l10Var2.d("Logging %s", a(mdeVar222));
                        }
                        o78 o78Var = this.h;
                        l10 l10Var3 = o78.d;
                        if (o78Var.c == null) {
                            wxj wxjVar = (wxj) o78Var.b.get();
                            if (wxjVar != null) {
                                o78Var.c = ((xxj) wxjVar).a(o78Var.a, new kn5("proto"), new hg6(23));
                            } else {
                                l10Var3.getClass();
                            }
                        }
                        p03 p03Var = o78Var.c;
                        if (p03Var != null) {
                            p03Var.x(new cu0(null, mdeVar222, i7f.a, null), new ogj(15));
                        } else {
                            l10Var3.getClass();
                        }
                        SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
                        return;
                    }
                    return;
                }
                l10.c().getClass();
                r.e("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", a(mdeVar222));
                break;
            }
            r.e("App Instance ID is null or empty, dropping %s", a(mdeVar222));
        } else {
            r.d("Performance collection is not enabled, dropping %s", a(mdeVar222));
        }
        z2 = false;
        if (z2) {
        }
    }

    @Override // defpackage.ne0
    public final void onUpdateAppState(of0 of0Var) {
        int i = 0;
        this.q = of0Var == of0.FOREGROUND;
        if (this.c.get()) {
            this.i.execute(new eyj(this, i));
        }
    }
}
