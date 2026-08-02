package Bh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rh.EnumC6295m;
import rh.InterfaceC6290h;
import rh.InterfaceC6292j;
import uh.InterfaceC6579c;
import yh.AbstractC6897f;
import yh.InterfaceC6893b;
import zh.C6995c;

/* loaded from: classes3.dex */
public final class m implements k {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f942u = Logger.getLogger(m.class.getName());

    /* renamed from: v, reason: collision with root package name */
    public static final oh.e f943v = oh.e.a("exception.type");

    /* renamed from: w, reason: collision with root package name */
    public static final oh.e f944w = oh.e.a("exception.message");

    /* renamed from: x, reason: collision with root package name */
    public static final oh.e f945x = oh.e.a("exception.stacktrace");

    /* renamed from: a, reason: collision with root package name */
    public final v f946a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6292j f947b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6292j f948c;

    /* renamed from: d, reason: collision with root package name */
    public final x f949d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC6295m f950e;

    /* renamed from: f, reason: collision with root package name */
    public final Bh.a f951f;

    /* renamed from: g, reason: collision with root package name */
    public final Ah.c f952g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC6897f f953h;

    /* renamed from: i, reason: collision with root package name */
    public final long f954i;

    /* renamed from: k, reason: collision with root package name */
    public String f956k;

    /* renamed from: l, reason: collision with root package name */
    public C6995c f957l;

    /* renamed from: m, reason: collision with root package name */
    public List f958m;

    /* renamed from: o, reason: collision with root package name */
    public List f960o;

    /* renamed from: p, reason: collision with root package name */
    public int f961p;

    /* renamed from: r, reason: collision with root package name */
    public long f963r;

    /* renamed from: t, reason: collision with root package name */
    public Thread f965t;

    /* renamed from: j, reason: collision with root package name */
    public final Object f955j = new Object();

    /* renamed from: n, reason: collision with root package name */
    public int f959n = 0;

    /* renamed from: q, reason: collision with root package name */
    public Ch.d f962q = Ch.d.a();

    /* renamed from: s, reason: collision with root package name */
    public a f964s = a.NOT_ENDED;

    public enum a {
        NOT_ENDED,
        ENDING,
        ENDED
    }

    public m(InterfaceC6292j interfaceC6292j, String str, AbstractC6897f abstractC6897f, EnumC6295m enumC6295m, InterfaceC6292j interfaceC6292j2, v vVar, x xVar, Bh.a aVar, Ah.c cVar, C6995c c6995c, List list, int i10, long j10) {
        this.f947b = interfaceC6292j;
        this.f953h = abstractC6897f;
        this.f948c = interfaceC6292j2;
        this.f960o = list;
        this.f961p = i10;
        this.f956k = str;
        this.f950e = enumC6295m;
        this.f949d = xVar;
        this.f952g = cVar;
        this.f951f = aVar;
        this.f954i = j10;
        this.f957l = c6995c;
        this.f946a = vVar;
    }

    public static m v(InterfaceC6292j interfaceC6292j, String str, AbstractC6897f abstractC6897f, EnumC6295m enumC6295m, InterfaceC6290h interfaceC6290h, InterfaceC6579c interfaceC6579c, v vVar, x xVar, InterfaceC6893b interfaceC6893b, Ah.c cVar, C6995c c6995c, List list, int i10, long j10) {
        Bh.a a10;
        boolean z10;
        long c10;
        if (interfaceC6290h instanceof m) {
            a10 = ((m) interfaceC6290h).f951f;
            z10 = false;
        } else {
            a10 = Bh.a.a(interfaceC6893b);
            z10 = true;
        }
        Bh.a aVar = a10;
        if (j10 != 0) {
            c10 = j10;
        } else {
            c10 = z10 ? aVar.c() : aVar.b();
        }
        m mVar = new m(interfaceC6292j, str, abstractC6897f, enumC6295m, interfaceC6290h.a(), vVar, xVar, aVar, cVar, c6995c, list, i10, c10);
        if (xVar.F()) {
            xVar.D1(interfaceC6579c, mVar);
        }
        return mVar;
    }

    @Override // rh.InterfaceC6290h, Bh.l
    public InterfaceC6292j a() {
        return this.f947b;
    }

    @Override // Bh.l
    public Ch.c c() {
        y h10;
        synchronized (this.f955j) {
            List m10 = m();
            List n10 = n();
            oh.g l10 = l();
            C6995c c6995c = this.f957l;
            h10 = y.h(this, m10, n10, l10, c6995c == null ? 0 : c6995c.e(), this.f959n, this.f961p, this.f962q, this.f956k, this.f963r, this.f964s == a.ENDED);
        }
        return h10;
    }

    public final void d(long j10) {
        synchronized (this.f955j) {
            try {
                if (this.f964s != a.NOT_ENDED) {
                    f942u.log(Level.FINE, "Calling end() on an ended or ending Span.");
                    return;
                }
                this.f963r = j10;
                this.f965t = Thread.currentThread();
                this.f964s = a.ENDING;
                x xVar = this.f949d;
                if (xVar instanceof Eh.b) {
                    Eh.b bVar = (Eh.b) xVar;
                    if (bVar.i0()) {
                        bVar.n0(this);
                    }
                }
                synchronized (this.f955j) {
                    this.f964s = a.ENDED;
                }
                if (this.f949d.S1()) {
                    this.f949d.M1(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // rh.InterfaceC6290h
    public void end() {
        d(this.f951f.b());
    }

    public final oh.g l() {
        C6995c c6995c = this.f957l;
        return (c6995c == null || c6995c.isEmpty()) ? oh.g.empty() : this.f964s == a.ENDED ? this.f957l : this.f957l.f();
    }

    public final List m() {
        List list = this.f960o;
        return (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(this.f960o);
    }

    public final List n() {
        List list = this.f958m;
        return list == null ? Collections.EMPTY_LIST : this.f964s == a.ENDED ? Collections.unmodifiableList(list) : Collections.unmodifiableList(new ArrayList(this.f958m));
    }

    public AbstractC6897f o() {
        return this.f953h;
    }

    public EnumC6295m p() {
        return this.f950e;
    }

    public InterfaceC6292j q() {
        return this.f948c;
    }

    public Ah.c r() {
        return this.f952g;
    }

    public long s() {
        return this.f954i;
    }

    public final boolean t() {
        a aVar = this.f964s;
        if (aVar != a.NOT_ENDED) {
            return aVar == a.ENDING && Thread.currentThread() == this.f965t;
        }
        return true;
    }

    public String toString() {
        String str;
        String valueOf;
        String valueOf2;
        long j10;
        long j11;
        long j12;
        synchronized (this.f955j) {
            str = this.f956k;
            valueOf = String.valueOf(this.f957l);
            valueOf2 = String.valueOf(this.f962q);
            j10 = this.f959n;
            j11 = this.f963r;
            j12 = this.f961p;
        }
        return "SdkSpan{traceId=" + this.f947b.d() + ", spanId=" + this.f947b.c() + ", parentSpanContext=" + this.f948c + ", name=" + str + ", kind=" + this.f950e + ", attributes=" + valueOf + ", status=" + valueOf2 + ", totalRecordedEvents=" + j10 + ", totalRecordedLinks=" + j12 + ", startEpochNanos=" + this.f954i + ", endEpochNanos=" + j11 + "}";
    }

    @Override // rh.InterfaceC6290h
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public k g(oh.e eVar, Object obj) {
        if (eVar == null || eVar.getKey().isEmpty() || obj == null) {
            return this;
        }
        synchronized (this.f955j) {
            try {
                if (!t()) {
                    f942u.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                    return this;
                }
                if (this.f957l == null) {
                    this.f957l = C6995c.d(this.f946a.d(), this.f946a.c());
                }
                this.f957l.g(eVar, obj);
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
