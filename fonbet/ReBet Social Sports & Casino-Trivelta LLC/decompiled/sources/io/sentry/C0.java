package io.sentry;

import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class C0 implements InterfaceC4809q1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.vendor.gson.stream.a f50203a;

    /* renamed from: b, reason: collision with root package name */
    public final Deque f50204b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f50205c = 0;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50206a;

        /* renamed from: b, reason: collision with root package name */
        public final io.sentry.vendor.gson.stream.b f50207b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f50208c;

        public b(int i10, io.sentry.vendor.gson.stream.b bVar) {
            this.f50206a = i10;
            this.f50207b = bVar;
        }
    }

    public C0(Reader reader) {
        this.f50203a = new io.sentry.vendor.gson.stream.a(reader);
    }

    public boolean B() {
        boolean w02 = this.f50203a.w0();
        r();
        return w02;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Float B1() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        J();
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void C() {
        this.f50203a.C();
        r();
    }

    @Override // io.sentry.InterfaceC4809q1
    public Object H1() {
        return new B0().e(this);
    }

    public void J() {
        this.f50203a.A0();
        r();
    }

    @Override // io.sentry.InterfaceC4809q1
    public String M0() {
        String M02 = this.f50203a.M0();
        r();
        return M02;
    }

    @Override // io.sentry.InterfaceC4809q1
    public TimeZone P(ILogger iLogger) {
        if (this.f50203a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            J();
            return null;
        }
        try {
            return TimeZone.getTimeZone(M0());
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, "Error when deserializing TimeZone", e10);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.InterfaceC4809q1
    public List P1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        Throwable th2;
        ILogger iLogger2;
        if (this.f50203a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            J();
            return null;
        }
        p();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!this.f50203a.hasNext()) {
                break;
            }
            b d10 = d(peek());
            try {
                arrayList.add(interfaceC4859w0.a(this, iLogger));
                k(d10);
                iLogger2 = iLogger;
            } catch (Exception e10) {
                iLogger2 = iLogger;
                try {
                    if (!U(iLogger2, e10, "Failed to deserialize object in list.", "Stream unrecoverable, aborting list deserialization.", d10)) {
                        k(d10);
                        break;
                    }
                    k(d10);
                } catch (Throwable th3) {
                    th2 = th3;
                    k(d10);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                k(d10);
                throw th2;
            }
            iLogger = iLogger2;
        }
        n();
        return arrayList;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Integer Q0() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(nextInt());
        }
        J();
        return null;
    }

    public final boolean U(ILogger iLogger, Exception exc, String str, String str2, b bVar) {
        iLogger.b(EnumC4788n3.WARNING, str, exc);
        try {
            w0(bVar);
            return true;
        } catch (Exception e10) {
            iLogger.b(EnumC4788n3.ERROR, str2, e10);
            return false;
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public Long U0() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(nextLong());
        }
        J();
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public String a1() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return M0();
        }
        J();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50203a.close();
    }

    public final b d(io.sentry.vendor.gson.stream.b bVar) {
        b bVar2 = new b(this.f50205c, bVar);
        this.f50204b.addLast(bVar2);
        return bVar2;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Double e0() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(nextDouble());
        }
        J();
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.sentry.InterfaceC4809q1
    public Map e1(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        Throwable th2;
        C0 c02;
        ILogger iLogger2;
        if (this.f50203a.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            J();
            return null;
        }
        m();
        HashMap hashMap = new HashMap();
        if (this.f50203a.hasNext()) {
            while (true) {
                String f02 = this.f50203a.f0();
                b d10 = d(peek());
                try {
                    hashMap.put(f02, interfaceC4859w0.a(this, iLogger));
                    k(d10);
                    c02 = this;
                    iLogger2 = iLogger;
                } catch (Exception e10) {
                    c02 = this;
                    iLogger2 = iLogger;
                    try {
                        if (!c02.U(iLogger2, e10, "Failed to deserialize object in map.", "Stream unrecoverable, aborting map deserialization.", d10)) {
                            k(d10);
                            break;
                        }
                        k(d10);
                    } catch (Throwable th3) {
                        th2 = th3;
                        k(d10);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    k(d10);
                    throw th2;
                }
                if (c02.f50203a.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && c02.f50203a.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    break;
                }
                iLogger = iLogger2;
            }
        }
        t();
        return hashMap;
    }

    @Override // io.sentry.InterfaceC4809q1
    public String f0() {
        return this.f50203a.f0();
    }

    @Override // io.sentry.InterfaceC4809q1
    public void g1(ILogger iLogger, Map map, String str) {
        b bVar = null;
        try {
            try {
                bVar = d(peek());
                map.put(str, H1());
                k(bVar);
            } catch (Exception e10) {
                iLogger.a(EnumC4788n3.ERROR, e10, "Error deserializing unknown key: %s", str);
                if (bVar != null) {
                    try {
                        w0(bVar);
                    } catch (Exception e11) {
                        iLogger.b(EnumC4788n3.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e11);
                    }
                }
                k(bVar);
            }
        } catch (Throwable th2) {
            k(bVar);
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public boolean hasNext() {
        return this.f50203a.hasNext();
    }

    @Override // io.sentry.InterfaceC4809q1
    public Date j0(ILogger iLogger) {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return InterfaceC4809q1.E0(M0(), iLogger);
        }
        J();
        return null;
    }

    public final void k(b bVar) {
        if (bVar == null) {
            return;
        }
        if (this.f50204b.isEmpty() || this.f50204b.peekLast() != bVar) {
            this.f50204b.remove(bVar);
        } else {
            this.f50204b.removeLast();
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public void m() {
        this.f50203a.m();
        r();
        this.f50205c++;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void n() {
        this.f50203a.n();
        this.f50205c--;
    }

    @Override // io.sentry.InterfaceC4809q1
    public double nextDouble() {
        double nextDouble = this.f50203a.nextDouble();
        r();
        return nextDouble;
    }

    @Override // io.sentry.InterfaceC4809q1
    public float nextFloat() {
        double nextDouble = this.f50203a.nextDouble();
        r();
        return (float) nextDouble;
    }

    @Override // io.sentry.InterfaceC4809q1
    public int nextInt() {
        int nextInt = this.f50203a.nextInt();
        r();
        return nextInt;
    }

    @Override // io.sentry.InterfaceC4809q1
    public long nextLong() {
        long nextLong = this.f50203a.nextLong();
        r();
        return nextLong;
    }

    @Override // io.sentry.InterfaceC4809q1
    public void p() {
        this.f50203a.p();
        r();
        this.f50205c++;
    }

    @Override // io.sentry.InterfaceC4809q1
    public Boolean p0() {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Boolean.valueOf(B());
        }
        J();
        return null;
    }

    @Override // io.sentry.InterfaceC4809q1
    public io.sentry.vendor.gson.stream.b peek() {
        return this.f50203a.peek();
    }

    @Override // io.sentry.InterfaceC4809q1
    public void q(boolean z10) {
        this.f50203a.q(z10);
    }

    public final void r() {
        b bVar = (b) this.f50204b.peekLast();
        if (bVar != null) {
            bVar.f50208c = true;
        }
    }

    @Override // io.sentry.InterfaceC4809q1
    public void t() {
        this.f50203a.t();
        this.f50205c--;
    }

    public final void w0(b bVar) {
        while (this.f50205c > bVar.f50206a) {
            io.sentry.vendor.gson.stream.b peek = peek();
            if (peek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                t();
            } else if (peek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                n();
            } else {
                C();
            }
        }
        if (bVar.f50208c || peek() != bVar.f50207b) {
            return;
        }
        C();
    }

    @Override // io.sentry.InterfaceC4809q1
    public Object x0(ILogger iLogger, InterfaceC4859w0 interfaceC4859w0) {
        if (this.f50203a.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return interfaceC4859w0.a(this, iLogger);
        }
        J();
        return null;
    }
}
