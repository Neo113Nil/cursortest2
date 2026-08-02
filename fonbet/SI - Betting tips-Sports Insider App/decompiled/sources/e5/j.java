package e5;

import io.sentry.b6;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8644a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8645b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8646c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8647d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8648e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8649f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8650g;

    public void c(io.sentry.l lVar, Date date) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8647d;
        Date date2 = (Date) concurrentHashMap.get(lVar);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(lVar, date);
            Iterator it = ((CopyOnWriteArrayList) this.f8648e).iterator();
            while (it.hasNext()) {
                ((io.sentry.transport.o) it.next()).C(this);
            }
            io.sentry.r a7 = ((io.sentry.util.a) this.f8650g).a();
            try {
                if (((Timer) this.f8649f) == null) {
                    this.f8649f = new Timer(true);
                }
                ((Timer) this.f8649f).schedule(new io.sentry.n(2, this), date);
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f8644a) {
            case 0:
                ((l5.d) ((ff.a) this.f8647d).get()).close();
                return;
            default:
                io.sentry.r a7 = ((io.sentry.util.a) this.f8650g).a();
                try {
                    Timer timer = (Timer) this.f8649f;
                    if (timer != null) {
                        timer.cancel();
                        this.f8649f = null;
                    }
                    a7.close();
                    ((CopyOnWriteArrayList) this.f8648e).clear();
                    return;
                } catch (Throwable th2) {
                    try {
                        a7.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
        }
    }

    public boolean k(io.sentry.l lVar) {
        Date date;
        ((io.sentry.transport.d) this.f8645b).getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8647d;
        Date date3 = (Date) concurrentHashMap.get(io.sentry.l.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.l.Unknown.equals(lVar) || (date = (Date) concurrentHashMap.get(lVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public j(b6 b6Var) {
        this.f8644a = 1;
        this.f8647d = new ConcurrentHashMap();
        this.f8648e = new CopyOnWriteArrayList();
        this.f8649f = null;
        this.f8650g = new io.sentry.util.a();
        this.f8645b = io.sentry.transport.d.f17127a;
        this.f8646c = b6Var;
    }
}
