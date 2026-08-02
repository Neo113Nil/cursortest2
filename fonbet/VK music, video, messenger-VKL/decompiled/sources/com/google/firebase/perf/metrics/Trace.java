package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import xsna.bvf;
import xsna.dez0;
import xsna.ra2;
import xsna.tdp0;
import xsna.txi;
import xsna.u93;
import xsna.wsi0;
import xsna.xop0;
import xsna.xv90;
import xsna.xy9;
import xsna.y93;
import xsna.zr;

/* loaded from: classes13.dex */
public class Trace extends y93 implements Parcelable, wsi0 {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final ra2 n = ra2.d();
    public final WeakReference<wsi0> b;
    public final Trace c;
    public final GaugeManager d;
    public final String e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public final List<PerfSession> h;
    public final ArrayList i;
    public final xop0 j;
    public final bvf k;
    public Timer l;
    public Timer m;

    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    public Trace(@NonNull String str, @NonNull xop0 xop0Var, @NonNull bvf bvfVar, @NonNull u93 u93Var) {
        this(str, xop0Var, bvfVar, u93Var, GaugeManager.getInstance());
    }

    @Override // xsna.wsi0
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            n.h();
        } else {
            if (this.l == null || d()) {
                return;
            }
            this.h.add(perfSession);
        }
    }

    public final void b(@NonNull String str, @NonNull String str2) {
        if (d()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(zr.a("Trace '", this.e, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            xv90.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    @VisibleForTesting
    public final boolean d() {
        return this.m != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.l != null) && !d()) {
                n.i("Trace '%s' is started but not stopped when it is destructed!", this.e);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.g.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.g);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.f.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.c.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String c = xv90.c(str);
        ra2 ra2Var = n;
        if (c != null) {
            ra2Var.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        Timer timer = this.l;
        String str2 = this.e;
        if (timer == null) {
            ra2Var.i("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (d()) {
            ra2Var.i("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        AtomicLong atomicLong = counter.c;
        atomicLong.addAndGet(j);
        ra2Var.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        ra2 ra2Var = n;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            ra2Var.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.e);
            z = true;
        } catch (Exception e) {
            ra2Var.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.g.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String c = xv90.c(str);
        ra2 ra2Var = n;
        if (c != null) {
            ra2Var.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c);
            return;
        }
        Timer timer = this.l;
        String str2 = this.e;
        if (timer == null) {
            ra2Var.i("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (d()) {
            ra2Var.i("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        counter.c.set(j);
        ra2Var.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!d()) {
            this.g.remove(str);
            return;
        }
        ra2 ra2Var = n;
        if (ra2Var.b) {
            ra2Var.a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    @Keep
    public void start() {
        String str;
        boolean o = txi.e().o();
        ra2 ra2Var = n;
        if (!o) {
            ra2Var.a();
            return;
        }
        String str2 = this.e;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else {
            if (str2.startsWith(BundleUtil.UNDERLINE_TAG)) {
                Constants$TraceNames[] values = Constants$TraceNames.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (values[i].toString().equals(str2)) {
                            break;
                        } else {
                            i++;
                        }
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            ra2Var.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.l != null) {
            ra2Var.c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.k.getClass();
        this.l = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.b);
        a(perfSession);
        if (perfSession.d) {
            this.d.collectGaugeMetricOnce(perfSession.c);
        }
    }

    @Keep
    public void stop() {
        Timer timer = this.l;
        String str = this.e;
        ra2 ra2Var = n;
        if (timer == null) {
            ra2Var.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (d()) {
            ra2Var.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.b);
        unregisterForAppState();
        this.k.getClass();
        Timer timer2 = new Timer();
        this.m = timer2;
        if (this.c == null) {
            ArrayList arrayList = this.i;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) xy9.b(1, arrayList);
                if (trace.m == null) {
                    trace.m = timer2;
                }
            }
            if (str.isEmpty()) {
                if (ra2Var.b) {
                    ra2Var.a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.j.e(new tdp0(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().d) {
                this.d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().c);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeString(this.e);
        parcel.writeList(this.i);
        parcel.writeMap(this.f);
        parcel.writeParcelable(this.l, 0);
        parcel.writeParcelable(this.m, 0);
        synchronized (this.h) {
            parcel.writeList(this.h);
        }
    }

    public Trace(@NonNull String str, @NonNull xop0 xop0Var, @NonNull bvf bvfVar, @NonNull u93 u93Var, @NonNull GaugeManager gaugeManager) {
        super(u93Var);
        this.b = new WeakReference<>(this);
        this.c = null;
        this.e = str.trim();
        this.i = new ArrayList();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.k = bvfVar;
        this.j = xop0Var;
        this.h = dez0.b();
        this.d = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : u93.a());
        this.b = new WeakReference<>(this);
        this.c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.e = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f = concurrentHashMap;
        this.g = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.m = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List b = dez0.b();
        this.h = b;
        parcel.readList(b, PerfSession.class.getClassLoader());
        if (z) {
            this.j = null;
            this.k = null;
            this.d = null;
        } else {
            this.j = xop0.t;
            this.k = new bvf();
            this.d = GaugeManager.getInstance();
        }
    }
}
