package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import defpackage.a70;
import defpackage.bka;
import defpackage.dyh;
import defpackage.fyj;
import defpackage.l10;
import defpackage.l7h;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.ode;
import defpackage.oe0;
import defpackage.oi3;
import defpackage.pe0;
import defpackage.w1l;
import defpackage.wt3;
import defpackage.wxf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class Trace extends pe0 implements Parcelable, l7h {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final l10 m = l10.c();
    public final WeakReference a;
    public final Trace b;
    public final GaugeManager c;
    public final String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final List g;
    public final ArrayList h;
    public final fyj i;
    public final wxf j;
    public Timer k;
    public Timer l;

    static {
        new ConcurrentHashMap();
        CREATOR = new dyh(13);
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : oe0.a());
        this.a = new WeakReference(this);
        this.b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List n = w1l.n();
        this.g = n;
        parcel.readList(n, PerfSession.class.getClassLoader());
        if (z) {
            this.i = null;
            this.j = null;
            this.c = null;
        } else {
            this.i = fyj.s;
            this.j = new wxf(18);
            this.c = GaugeManager.getInstance();
        }
    }

    @Override // defpackage.l7h
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            m.getClass();
        } else {
            if (this.k == null || b()) {
                return;
            }
            this.g.add(perfSession);
        }
    }

    public final boolean b() {
        return this.l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() {
        try {
            if ((this.k != null) && !b()) {
                m.e("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.b.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String c = ode.c(str);
        l10 l10Var = m;
        if (c != null) {
            l10Var.b("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            l10Var.e("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            l10Var.e("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        AtomicLong atomicLong = counter.b;
        atomicLong.addAndGet(j);
        if (l10Var.a) {
            atomicLong.get();
        }
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f;
        l10 l10Var = m;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean b = b();
            String str3 = this.d;
            if (b) {
                Locale locale = Locale.ENGLISH;
                a70.p(lnb.o("Trace '", str3, "' has been stopped"));
            } else {
                if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                    Locale locale2 = Locale.ENGLISH;
                    a70.p("Exceeds max limit of number of attributes - 5");
                }
                ode.b(str, str2);
            }
            l10Var.a("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            l10Var.b("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String c = ode.c(str);
        l10 l10Var = m;
        if (c != null) {
            l10Var.b("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            l10Var.e("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (b()) {
            l10Var.e("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        counter.b.set(j);
        l10Var.a("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (b()) {
            m.getClass();
        } else {
            this.f.remove(str);
        }
    }

    @Keep
    public void start() {
        String str;
        String str2;
        boolean o = oi3.e().o();
        l10 l10Var = m;
        if (!o) {
            l10Var.getClass();
            return;
        }
        Pattern pattern = ode.a;
        String str3 = this.d;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else {
            if (str3.startsWith("_")) {
                int[] D = wt3.D(6);
                int length = D.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        switch (D[i]) {
                            case 1:
                                str2 = "_as";
                                break;
                            case 2:
                                str2 = "_astui";
                                break;
                            case 3:
                                str2 = "_astfd";
                                break;
                            case 4:
                                str2 = "_asti";
                                break;
                            case 5:
                                str2 = "_fs";
                                break;
                            case 6:
                                str2 = "_bs";
                                break;
                            default:
                                throw null;
                        }
                        if (!str2.equals(str3)) {
                            i++;
                        }
                    } else if (!str3.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            l10Var.b("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.k != null) {
            l10Var.b("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.j.getClass();
        this.k = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.a);
        a(perfSession);
        if (perfSession.c) {
            this.c.collectGaugeMetricOnce(perfSession.b);
        }
    }

    @Keep
    public void stop() {
        Timer timer = this.k;
        String str = this.d;
        l10 l10Var = m;
        if (timer == null) {
            l10Var.b("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (b()) {
            l10Var.b("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.a);
        unregisterForAppState();
        this.j.getClass();
        Timer timer2 = new Timer();
        this.l = timer2;
        if (this.b == null) {
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) mz1.h(arrayList, 1);
                if (trace.l == null) {
                    trace.l = timer2;
                }
            }
            if (str.isEmpty()) {
                l10Var.getClass();
                return;
            }
            this.i.c(new bka(this, 24).c(), getAppState());
            if (SessionManager.getInstance().perfSession().c) {
                this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.h);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.k, 0);
        parcel.writeParcelable(this.l, 0);
        synchronized (this.g) {
            parcel.writeList(this.g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, fyj fyjVar, wxf wxfVar, oe0 oe0Var) {
        super(oe0Var);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.a = new WeakReference(this);
        this.b = null;
        this.d = str.trim();
        this.h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.j = wxfVar;
        this.i = fyjVar;
        this.g = w1l.n();
        this.c = gaugeManager;
    }
}
