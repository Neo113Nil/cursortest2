package androidx.media3.exoplayer.dash;

import H1.O;
import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.source.b0;
import b1.C2334C;
import b1.C2338G;
import b1.InterfaceC2358l;
import e1.J;
import e1.Z;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import m1.O0;
import p1.C6033c;

/* loaded from: classes.dex */
public final class n implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final D1.b f21086a;

    /* renamed from: b, reason: collision with root package name */
    public final b f21087b;

    /* renamed from: f, reason: collision with root package name */
    public C6033c f21091f;

    /* renamed from: g, reason: collision with root package name */
    public long f21092g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21094i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21095j;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f21090e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f21089d = Z.A(this);

    /* renamed from: c, reason: collision with root package name */
    public final S1.b f21088c = new S1.b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f21096a;

        /* renamed from: b, reason: collision with root package name */
        public final long f21097b;

        public a(long j10, long j11) {
            this.f21096a = j10;
            this.f21097b = j11;
        }
    }

    public interface b {
        void a(long j10);

        void b();
    }

    public final class c implements O {

        /* renamed from: a, reason: collision with root package name */
        public final b0 f21098a;

        /* renamed from: b, reason: collision with root package name */
        public final O0 f21099b = new O0();

        /* renamed from: c, reason: collision with root package name */
        public final Q1.b f21100c = new Q1.b();

        /* renamed from: d, reason: collision with root package name */
        public long f21101d = -9223372036854775807L;

        public c(D1.b bVar) {
            this.f21098a = b0.m(bVar);
        }

        @Override // H1.O
        public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
            return this.f21098a.e(interfaceC2358l, i10, z10);
        }

        @Override // H1.O
        public void c(androidx.media3.common.a aVar) {
            this.f21098a.c(aVar);
        }

        @Override // H1.O
        public void f(J j10, int i10, int i11) {
            this.f21098a.a(j10, i10);
        }

        @Override // H1.O
        public void g(long j10, int i10, int i11, int i12, O.a aVar) {
            this.f21098a.g(j10, i10, i11, i12, aVar);
            m();
        }

        public final Q1.b h() {
            this.f21100c.f();
            if (this.f21098a.U(this.f21099b, this.f21100c, 0, false) != -4) {
                return null;
            }
            this.f21100c.q();
            return this.f21100c;
        }

        public boolean i(long j10) {
            return n.this.j(j10);
        }

        public void j(B1.e eVar) {
            long j10 = this.f21101d;
            if (j10 == -9223372036854775807L || eVar.f563h > j10) {
                this.f21101d = eVar.f563h;
            }
            n.this.m(eVar);
        }

        public boolean k(B1.e eVar) {
            long j10 = this.f21101d;
            return n.this.n(j10 != -9223372036854775807L && j10 < eVar.f562g);
        }

        public final void l(long j10, long j11) {
            n.this.f21089d.sendMessage(n.this.f21089d.obtainMessage(1, new a(j10, j11)));
        }

        public final void m() {
            while (this.f21098a.N(false)) {
                Q1.b h10 = h();
                if (h10 != null) {
                    long j10 = h10.f54110f;
                    C2334C a10 = n.this.f21088c.a(h10);
                    if (a10 != null) {
                        S1.a aVar = (S1.a) a10.d(0);
                        if (n.h(aVar.f10536a, aVar.f10537b)) {
                            n(j10, aVar);
                        }
                    }
                }
            }
            this.f21098a.t();
        }

        public final void n(long j10, S1.a aVar) {
            long f10 = n.f(aVar);
            if (f10 == -9223372036854775807L) {
                return;
            }
            l(j10, f10);
        }

        public void o() {
            this.f21098a.V();
        }
    }

    public n(C6033c c6033c, b bVar, D1.b bVar2) {
        this.f21091f = c6033c;
        this.f21087b = bVar;
        this.f21086a = bVar2;
    }

    public static long f(S1.a aVar) {
        try {
            return Z.i1(Z.H(aVar.messageData));
        } catch (C2338G unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final Map.Entry e(long j10) {
        return this.f21090e.ceilingEntry(Long.valueOf(j10));
    }

    public final void g(long j10, long j11) {
        Long l10 = (Long) this.f21090e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f21090e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f21090e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f21095j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f21096a, aVar.f21097b);
        return true;
    }

    public final void i() {
        if (this.f21093h) {
            this.f21094i = true;
            this.f21093h = false;
            this.f21087b.b();
        }
    }

    public boolean j(long j10) {
        C6033c c6033c = this.f21091f;
        boolean z10 = false;
        if (!c6033c.f62903d) {
            return false;
        }
        if (this.f21094i) {
            return true;
        }
        Map.Entry e10 = e(c6033c.f62907h);
        if (e10 != null && ((Long) e10.getValue()).longValue() < j10) {
            this.f21092g = ((Long) e10.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f21086a);
    }

    public final void l() {
        this.f21087b.a(this.f21092g);
    }

    public void m(B1.e eVar) {
        this.f21093h = true;
    }

    public boolean n(boolean z10) {
        if (!this.f21091f.f62903d) {
            return false;
        }
        if (this.f21094i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f21095j = true;
        this.f21089d.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator it = this.f21090e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f21091f.f62907h) {
                it.remove();
            }
        }
    }

    public void q(C6033c c6033c) {
        this.f21094i = false;
        this.f21092g = -9223372036854775807L;
        this.f21091f = c6033c;
        p();
    }
}
