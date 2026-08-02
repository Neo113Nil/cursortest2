package io.sentry.transport;

import io.sentry.C4665a3;
import io.sentry.C4866x2;
import io.sentry.EnumC4774l;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4765j0;
import io.sentry.J;
import io.sentry.util.C4843a;
import io.sentry.util.D;
import io.sentry.util.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final o f52759a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f52760b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f52761c;

    /* renamed from: d, reason: collision with root package name */
    public final List f52762d;

    /* renamed from: e, reason: collision with root package name */
    public Timer f52763e;

    /* renamed from: f, reason: collision with root package name */
    public final C4843a f52764f;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.y1();
        }
    }

    public interface b {
        void D0(z zVar);
    }

    public z(o oVar, F3 f32) {
        this.f52761c = new ConcurrentHashMap();
        this.f52762d = new CopyOnWriteArrayList();
        this.f52763e = null;
        this.f52764f = new C4843a();
        this.f52759a = oVar;
        this.f52760b = f32;
    }

    public static /* synthetic */ void r(z zVar, io.sentry.hints.f fVar) {
        zVar.getClass();
        fVar.e();
        zVar.f52760b.getLogger().c(EnumC4788n3.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    public boolean A0(EnumC4774l enumC4774l) {
        Date date;
        Date date2 = new Date(this.f52759a.a());
        Date date3 = (Date) this.f52761c.get(EnumC4774l.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC4774l.Unknown.equals(enumC4774l) || (date = (Date) this.f52761c.get(enumC4774l)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean D0() {
        Date date = new Date(this.f52759a.a());
        Iterator it = this.f52761c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = (Date) this.f52761c.get((EnumC4774l) it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void J(b bVar) {
        this.f52762d.add(bVar);
    }

    public final long T1(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public final void U(EnumC4774l enumC4774l, Date date) {
        Date date2 = (Date) this.f52761c.get(enumC4774l);
        if (date2 == null || date.after(date2)) {
            this.f52761c.put(enumC4774l, date);
            y1();
            InterfaceC4765j0 d10 = this.f52764f.d();
            try {
                if (this.f52763e == null) {
                    this.f52763e = new Timer(true);
                }
                this.f52763e.schedule(new a(), date);
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public void Y1(b bVar) {
        this.f52762d.remove(bVar);
    }

    public void Z1(String str, String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                U(EnumC4774l.All, new Date(this.f52759a.a() + T1(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] split = str3.replace(" ", "").split(":", -1);
            if (split.length > 0) {
                long T12 = T1(split[0]);
                if (split.length > 1) {
                    String str4 = split[1];
                    Date date = new Date(this.f52759a.a() + T12);
                    if (str4 == null || str4.isEmpty()) {
                        U(EnumC4774l.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            EnumC4774l enumC4774l = EnumC4774l.Unknown;
                            try {
                                String b10 = D.b(str5);
                                if (b10 != null) {
                                    enumC4774l = EnumC4774l.valueOf(b10);
                                } else {
                                    this.f52760b.getLogger().c(EnumC4788n3.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.f52760b.getLogger().a(EnumC4788n3.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!EnumC4774l.Unknown.equals(enumC4774l)) {
                                U(enumC4774l, date);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f52764f.d();
        try {
            Timer timer = this.f52763e;
            if (timer != null) {
                timer.cancel();
                this.f52763e = null;
            }
            if (d10 != null) {
                d10.close();
            }
            this.f52762d.clear();
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public final boolean m1(String str) {
        Iterator it = z0(str).iterator();
        while (it.hasNext()) {
            if (A0((EnumC4774l) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void n1(J j10, final boolean z10) {
        io.sentry.util.l.h(j10, io.sentry.hints.q.class, new l.a() { // from class: io.sentry.transport.w
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.q) obj).c(false);
            }
        });
        io.sentry.util.l.h(j10, io.sentry.hints.l.class, new l.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                ((io.sentry.hints.l) obj).d(z10);
            }
        });
        io.sentry.util.l.h(j10, io.sentry.hints.f.class, new l.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.l.a
            public final void accept(Object obj) {
                z.r(z.this, (io.sentry.hints.f) obj);
            }
        });
    }

    public C4866x2 w0(C4866x2 c4866x2, J j10) {
        ArrayList arrayList = null;
        for (C4665a3 c4665a3 : c4866x2.c()) {
            if (m1(c4665a3.O().e().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4665a3);
                this.f52760b.getClientReportRecorder().d(io.sentry.clientreport.f.RATELIMIT_BACKOFF, c4665a3);
            }
        }
        if (arrayList == null) {
            return c4866x2;
        }
        this.f52760b.getLogger().c(EnumC4788n3.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (C4665a3 c4665a32 : c4866x2.c()) {
            if (!arrayList.contains(c4665a32)) {
                arrayList2.add(c4665a32);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new C4866x2(c4866x2.b(), arrayList2);
        }
        this.f52760b.getLogger().c(EnumC4788n3.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        n1(j10, false);
        return null;
    }

    public final void y1() {
        Iterator it = this.f52762d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).D0(this);
        }
    }

    public final List z0(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(EnumC4774l.Attachment);
            case "replay_video":
                return Collections.singletonList(EnumC4774l.Replay);
            case "profile_chunk":
                return Arrays.asList(EnumC4774l.ProfileChunkUi, EnumC4774l.ProfileChunk);
            case "profile":
                return Collections.singletonList(EnumC4774l.Profile);
            case "feedback":
                return Collections.singletonList(EnumC4774l.Feedback);
            case "log":
                return Arrays.asList(EnumC4774l.LogItem, EnumC4774l.LogByte);
            case "span":
                return Collections.singletonList(EnumC4774l.Span);
            case "event":
                return Collections.singletonList(EnumC4774l.Error);
            case "trace_metric":
                return Arrays.asList(EnumC4774l.TraceMetric, EnumC4774l.TraceMetricByte);
            case "check_in":
                return Collections.singletonList(EnumC4774l.Monitor);
            case "session":
                return Collections.singletonList(EnumC4774l.Session);
            case "transaction":
                return Collections.singletonList(EnumC4774l.Transaction);
            default:
                return Collections.singletonList(EnumC4774l.Unknown);
        }
    }

    public z(F3 f32) {
        this(m.b(), f32);
    }
}
