package com.vk.network.eventhub.impl;

import android.os.SystemClock;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.j1n;
import xsna.l5m;
import xsna.yzp;

/* compiled from: EventHubServiceReporter.kt */
/* loaded from: classes3.dex */
public final class c implements yzp {
    public static volatile String b;
    public static volatile Long k;
    public static volatile Long l;
    public static volatile Long m;
    public static final c a = new c();
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final AtomicInteger d = new AtomicInteger(0);
    public static final AtomicInteger e = new AtomicInteger(0);
    public static final AtomicInteger f = new AtomicInteger(0);
    public static final AtomicInteger g = new AtomicInteger(0);
    public static final AtomicInteger h = new AtomicInteger(0);
    public static final AtomicInteger i = new AtomicInteger(0);
    public static final AtomicInteger j = new AtomicInteger(0);

    /* compiled from: EventHubServiceReporter.kt */
    public static abstract class a {

        /* compiled from: EventHubServiceReporter.kt */
        /* renamed from: com.vk.network.eventhub.impl.c$a$a, reason: collision with other inner class name */
        public static final class C1363a extends a {
            public final IOException a;

            public C1363a(IOException iOException) {
                this.a = iOException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1363a) && epx.f(this.a, ((C1363a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "InputOutputException(e=" + this.a + ')';
            }
        }

        /* compiled from: EventHubServiceReporter.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1361001562;
            }

            public final String toString() {
                return "Interrupted";
            }
        }

        /* compiled from: EventHubServiceReporter.kt */
        /* renamed from: com.vk.network.eventhub.impl.c$a$c, reason: collision with other inner class name */
        public static final class C1364c extends a {
            public final Exception a;

            public C1364c(Exception exc) {
                this.a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1364c) && epx.f(this.a, ((C1364c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UnknownException(e=" + this.a + ')';
            }
        }

        /* compiled from: EventHubServiceReporter.kt */
        public static final class d extends a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1956161986;
            }

            public final String toString() {
                return "WriteReject";
            }
        }
    }

    public static void c() {
        Preference.B("master_service_perf_prefs");
        String str = b;
        if (str != null) {
            Preference.H("master_service_perf_prefs", "userSessionId", str);
        }
        k = null;
        l = null;
        m = null;
        c.set(0);
        d.set(0);
        e.set(0);
        f.set(0);
        g.set(0);
        h.set(0);
        i.set(0);
        j.set(0);
    }

    public static Long d(String str) {
        long m2 = Preference.m(0L, "master_service_perf_prefs", str);
        Long valueOf = Long.valueOf(m2);
        if (m2 != 0) {
            return valueOf;
        }
        return null;
    }

    public static void e(a aVar) {
        if (aVar instanceof a.C1363a) {
            Preference.F(i.incrementAndGet(), "master_service_perf_prefs", "sendRefusedIOException");
        } else if (aVar instanceof a.b) {
            Preference.F(h.incrementAndGet(), "master_service_perf_prefs", "sendRefusedInterrupted");
        } else if (aVar instanceof a.C1364c) {
            Preference.F(j.incrementAndGet(), "master_service_perf_prefs", "sendRefusedUnknown");
        } else {
            if (!(aVar instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Preference.F(g.incrementAndGet(), "master_service_perf_prefs", "sendRefusedRejected");
        }
        g();
    }

    public static void f(long j2, j1n j1nVar) {
        String str;
        Throwable th;
        Long l2 = k;
        if (l2 == null) {
            L l3 = L.a;
            l3.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l3, L.LogType.w, new Object[]{"EventHubServiceReporter", "sendSummary cancelled: connection requested time not set"});
            return;
        }
        long longValue = l2.longValue();
        Long l4 = l;
        String str2 = null;
        Integer valueOf = l4 != null ? Integer.valueOf((int) (l4.longValue() - longValue)) : null;
        Long l5 = l;
        Integer valueOf2 = l5 != null ? Integer.valueOf((int) (j2 - l5.longValue())) : null;
        Long l6 = m;
        Integer valueOf3 = j1nVar != null ? l6 != null ? Integer.valueOf((int) (j2 - l6.longValue())) : null : null;
        int i2 = d.get();
        if (i2 == 0 && (j1nVar == null || (j1nVar instanceof j1n.b) || ((j1nVar instanceof j1n.a) && ((j1n.a) j1nVar).a == 1000))) {
            L l7 = L.a;
            l7.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l7, L.LogType.w, new Object[]{"EventHubServiceReporter", "sendSummary cancelled: ignoring empty event"});
            return;
        }
        l5m l5mVar = new l5m(null, null, 3);
        String h2 = DevNullEventKey.MASTER_SERVICE.h();
        String str3 = b;
        if (j1nVar == null || (str = j1nVar.a()) == null) {
            str = "appclosed";
        }
        String str4 = str;
        j1n.f fVar = j1nVar instanceof j1n.f ? (j1n.f) j1nVar : null;
        if (fVar != null && (th = fVar.a) != null) {
            str2 = th.getMessage();
        }
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h2, null, "session_summary", valueOf, str3, valueOf2, str4, valueOf3, str2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(e.get()), null, Integer.valueOf(f.get()), null, Integer.valueOf(c.get()), null, Integer.valueOf(i2), null, Integer.valueOf(g.get()), null, Integer.valueOf(h.get()), null, Integer.valueOf(i.get()), null, Integer.valueOf(j.get()), 1431830018, 1, null);
        if (BuildInfo.h()) {
            L l8 = L.a;
            l8.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l8, L.LogType.d, new Object[]{"EventHubServiceReporter", "Report " + schemeStat$TypeDevNullItem});
            }
        }
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    public static void g() {
        Preference.F(SystemClock.uptimeMillis() / 1000, "master_service_perf_prefs", "closeTime");
    }

    @Override // xsna.yzp
    public final String a() {
        return b;
    }

    @Override // xsna.yzp
    public final void b() {
        Long d2 = d("closeTime");
        if (d2 != null) {
            String s = Preference.s("master_service_perf_prefs", "userSessionId", "");
            if (s.length() <= 0) {
                s = null;
            }
            b = s;
            k = d("connectRequestedTime");
            l = d("connectedTime");
            m = d("closeRequestedTime");
            c.set((int) Preference.m(0L, "master_service_perf_prefs", "receivedMsgCount"));
            d.set((int) Preference.m(0L, "master_service_perf_prefs", "sentMsgCount"));
            e.set((int) Preference.m(0L, "master_service_perf_prefs", "receivedTraffic"));
            f.set((int) Preference.m(0L, "master_service_perf_prefs", "sentTraffic"));
            g.set((int) Preference.m(0L, "master_service_perf_prefs", "sendRefusedRejected"));
            h.set((int) Preference.m(0L, "master_service_perf_prefs", "sendRefusedInterrupted"));
            i.set((int) Preference.m(0L, "master_service_perf_prefs", "sendRefusedIOException"));
            j.set((int) Preference.m(0L, "master_service_perf_prefs", "sendRefusedUnknown"));
            f(d2.longValue(), null);
        }
        c();
        String uuid = UUID.randomUUID().toString();
        b = uuid;
        Preference.H("master_service_perf_prefs", "userSessionId", uuid);
    }
}
