package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.task.PostTask;

/* loaded from: classes6.dex */
public final class TraceEvent implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f78523a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f78524b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f78525c;

    /* loaded from: classes10.dex */
    static class a implements Printer {

        /* renamed from: a, reason: collision with root package name */
        private String f78526a;

        a() {
        }

        void a(String str) {
            String a11;
            boolean b11 = EarlyTraceEvent.b();
            if (TraceEvent.f78523a || b11) {
                if (TraceEvent.f78525c) {
                    a11 = "Looper.dispatch: EVENT_NAME_FILTERED";
                } else {
                    int indexOf = str.indexOf(40, 18);
                    int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
                    String substring = indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
                    int indexOf3 = str.indexOf(125, 18);
                    int indexOf4 = indexOf3 == -1 ? -1 : str.indexOf(58, indexOf3);
                    if (indexOf4 == -1) {
                        indexOf4 = str.length();
                    }
                    a11 = V.e.a("Looper.dispatch: ", substring, "(", indexOf3 != -1 ? str.substring(indexOf3 + 2, indexOf4) : "", ")");
                }
                this.f78526a = a11;
                if (!TraceEvent.f78523a) {
                    EarlyTraceEvent.a();
                } else {
                    new r();
                    N.M_y76mct(this.f78526a);
                }
            }
        }

        void b(String str) {
            boolean b11 = EarlyTraceEvent.b();
            if ((TraceEvent.f78523a || b11) && this.f78526a != null) {
                if (TraceEvent.f78523a) {
                    new r();
                    N.MLJecZJ9();
                } else {
                    EarlyTraceEvent.c();
                }
            }
            this.f78526a = null;
        }

        @Override // android.util.Printer
        public final void println(String str) {
            if (str.startsWith(">")) {
                a(str);
            } else {
                b(str);
            }
        }
    }

    /* loaded from: classes10.dex */
    private static final class b extends a implements MessageQueue.IdleHandler {

        /* renamed from: b, reason: collision with root package name */
        private long f78527b;

        /* renamed from: c, reason: collision with root package name */
        private long f78528c;

        /* renamed from: d, reason: collision with root package name */
        private int f78529d;

        /* renamed from: e, reason: collision with root package name */
        private int f78530e;

        /* renamed from: f, reason: collision with root package name */
        private int f78531f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f78532g;

        b() {
        }

        private final void c() {
            if (TraceEvent.f78523a && !this.f78532g) {
                this.f78527b = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                this.f78532g = true;
                Log.v("TraceEvt_LooperMonitor", "attached idle handler");
                return;
            }
            if (!this.f78532g || TraceEvent.f78523a) {
                return;
            }
            Looper.myQueue().removeIdleHandler(this);
            this.f78532g = false;
            Log.v("TraceEvt_LooperMonitor", "detached idle handler");
        }

        @Override // org.chromium.base.TraceEvent.a
        final void a(String str) {
            if (this.f78531f == 0) {
                TraceEvent.k();
            }
            this.f78528c = SystemClock.elapsedRealtime();
            c();
            super.a(str);
        }

        @Override // org.chromium.base.TraceEvent.a
        final void b(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f78528c;
            if (elapsedRealtime > 16) {
                String str2 = "observed a task that took " + elapsedRealtime + "ms: " + str;
                TraceEvent.o(str2);
                Log.println(5, "TraceEvt_LooperMonitor", str2);
            }
            super.b(str);
            c();
            this.f78529d++;
            this.f78531f++;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f78527b == 0) {
                this.f78527b = elapsedRealtime;
            }
            long j11 = elapsedRealtime - this.f78527b;
            this.f78530e++;
            TraceEvent.j("Looper.queueIdle", this.f78531f + " tasks since last idle.");
            if (j11 > 48) {
                String str = this.f78529d + " tasks and " + this.f78530e + " idles processed so far, " + this.f78531f + " tasks bursted and " + j11 + "ms elapsed since last idle";
                TraceEvent.o(str);
                Log.println(3, "TraceEvt_LooperMonitor", str);
            }
            this.f78527b = elapsedRealtime;
            this.f78531f = 0;
            return true;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final a f78533a;

        static {
            f78533a = org.chromium.base.c.b().d() ? new b() : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    static final class d implements MessageQueue.IdleHandler {

        /* renamed from: b, reason: collision with root package name */
        private static d f78534b;

        /* renamed from: a, reason: collision with root package name */
        private long f78535a;

        public static void a() {
            new r();
            boolean MnfJQqTB = N.MnfJQqTB();
            d dVar = f78534b;
            if (dVar == null && MnfJQqTB) {
                f78534b = new d();
                Looper.myQueue().addIdleHandler(f78534b);
            } else {
                if (dVar == null || MnfJQqTB) {
                    return;
                }
                Looper.myQueue().removeIdleHandler(f78534b);
                f78534b = null;
            }
        }

        public static void b() {
            PostTask.d(new q());
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.f78535a;
            if (j11 != 0 && elapsedRealtime - j11 <= 1000) {
                return true;
            }
            this.f78535a = elapsedRealtime;
            TraceEvent.s();
            return true;
        }
    }

    @CalledByNative
    public static void dumpViewHierarchy(long j11, Object obj) {
        ApplicationStatus.c();
    }

    public static void j(String str, String str2) {
        EarlyTraceEvent.a();
        if (f78523a) {
            new r();
            N.M9XfPu17(str, str2);
        }
    }

    public static void k() {
        EarlyTraceEvent.c();
        if (f78523a) {
            new r();
            N.Mw73xTww(null, 0L);
        }
    }

    public static void m(long j11) {
        if (EarlyTraceEvent.b()) {
            System.nanoTime();
            synchronized (EarlyTraceEvent.f78468b) {
                if (EarlyTraceEvent.b()) {
                    throw null;
                }
            }
        }
        if (f78523a) {
            new r();
            N.MffNhCLU(j11);
        }
    }

    public static void o(String str) {
        if (f78523a) {
            new r();
            N.ML40H8ed("TraceEvent.LooperMonitor:IdleStats", str);
        }
    }

    public static void p() {
        new r();
        N.MFFzPOVw();
    }

    static void q() {
        f78524b = true;
        if (f78523a) {
            d.b();
        }
    }

    public static TraceEvent r(String str) {
        if (!EarlyTraceEvent.b() && !f78523a) {
            return null;
        }
        TraceEvent traceEvent = new TraceEvent();
        j(str, null);
        return traceEvent;
    }

    public static void s() {
        if (f78523a) {
            new r();
            if (N.MnfJQqTB()) {
                j("instantAndroidViewHierarchy", null);
                ApplicationStatus.c();
                final ArrayList arrayList = new ArrayList();
                if (arrayList.isEmpty()) {
                    EarlyTraceEvent.c();
                    if (f78523a) {
                        new r();
                        N.Mw73xTww(null, 0L);
                        return;
                    }
                    return;
                }
                final long hashCode = arrayList.hashCode();
                PostTask.b(new Runnable() { // from class: org.chromium.base.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        new r();
                        N.Ml5G_GLY(hashCode, arrayList);
                    }
                }, 0);
                EarlyTraceEvent.c();
                if (f78523a) {
                    new r();
                    N.Mw73xTww(null, hashCode);
                }
            }
        }
    }

    @CalledByNative
    public static void setEnabled(boolean z11) {
        if (z11) {
            synchronized (EarlyTraceEvent.f78468b) {
                try {
                    if (EarlyTraceEvent.b()) {
                        throw null;
                    }
                } finally {
                }
            }
        }
        if (f78523a != z11) {
            f78523a = z11;
            ThreadUtils.a().getLooper().setMessageLogging(z11 ? c.f78533a : null);
        }
        if (f78523a) {
            synchronized (EarlyTraceEvent.f78468b) {
                try {
                    ArrayList arrayList = EarlyTraceEvent.f78469c;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            EarlyTraceEvent.b bVar = (EarlyTraceEvent.b) it.next();
                            new r();
                            bVar.getClass();
                            N.MvcVeOsg(0L, 0L);
                        }
                        EarlyTraceEvent.f78469c.clear();
                    }
                    ArrayList arrayList2 = EarlyTraceEvent.f78470d;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            EarlyTraceEvent.a aVar = (EarlyTraceEvent.a) it2.next();
                            new r();
                            aVar.getClass();
                            N.MbWHcONC(0L, 0L, 0);
                        }
                        EarlyTraceEvent.f78470d.clear();
                    }
                } finally {
                }
            }
        }
        if (f78524b) {
            d.b();
        }
    }

    @CalledByNative
    public static void setEventNameFilteringEnabled(boolean z11) {
        f78525c = z11;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        EarlyTraceEvent.c();
        if (f78523a) {
            new r();
            N.Mw73xTww(null, 0L);
        }
    }
}
