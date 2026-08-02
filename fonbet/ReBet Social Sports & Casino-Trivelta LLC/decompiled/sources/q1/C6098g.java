package q1;

import D1.k;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.source.C2223y;
import b1.AbstractC2356j;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.C4149p;
import e1.InterfaceC4148o;
import e1.Z;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.LongCompanionObject;
import n1.G1;
import q1.InterfaceC6089A;
import q1.InterfaceC6104m;
import q1.t;

/* renamed from: q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6098g implements InterfaceC6104m {

    /* renamed from: a, reason: collision with root package name */
    public final List f63250a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6089A f63251b;

    /* renamed from: c, reason: collision with root package name */
    public final a f63252c;

    /* renamed from: d, reason: collision with root package name */
    public final b f63253d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63254e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63255f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63256g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f63257h;

    /* renamed from: i, reason: collision with root package name */
    public final C4149p f63258i;

    /* renamed from: j, reason: collision with root package name */
    public final D1.k f63259j;

    /* renamed from: k, reason: collision with root package name */
    public final G1 f63260k;

    /* renamed from: l, reason: collision with root package name */
    public final M f63261l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f63262m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f63263n;

    /* renamed from: o, reason: collision with root package name */
    public final e f63264o;
    private byte[] offlineLicenseKeySetId;

    /* renamed from: p, reason: collision with root package name */
    public int f63265p;

    /* renamed from: q, reason: collision with root package name */
    public int f63266q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f63267r;

    /* renamed from: s, reason: collision with root package name */
    public c f63268s;
    private byte[] sessionId;

    /* renamed from: t, reason: collision with root package name */
    public k1.b f63269t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC6104m.a f63270u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC6089A.a f63271v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC6089A.d f63272w;

    /* renamed from: q1.g$a */
    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(C6098g c6098g);
    }

    /* renamed from: q1.g$b */
    public interface b {
        void a(C6098g c6098g, int i10);

        void b(C6098g c6098g, int i10);
    }

    /* renamed from: q1.g$c */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f63273a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, N n10) {
            d dVar = (d) message.obj;
            if (!dVar.f63276b) {
                return false;
            }
            int i10 = dVar.f63279e + 1;
            dVar.f63279e = i10;
            if (i10 > C6098g.this.f63259j.c(3)) {
                return false;
            }
            long b10 = C6098g.this.f63259j.b(new k.c(new C2223y(dVar.f63275a, n10.f63243a, n10.f63244b, n10.f63245c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f63277c, n10.f63246d), new androidx.media3.exoplayer.source.B(3), n10.getCause() instanceof IOException ? (IOException) n10.getCause() : new f(n10.getCause()), dVar.f63279e));
            if (b10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f63273a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b10);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C2223y.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f63273a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th2;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    th2 = C6098g.this.f63261l.a(C6098g.this.f63262m, (InterfaceC6089A.d) dVar.f63278d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    th2 = C6098g.this.f63261l.b(C6098g.this.f63262m, (InterfaceC6089A.a) dVar.f63278d);
                }
            } catch (N e10) {
                boolean a10 = a(message, e10);
                th2 = e10;
                if (a10) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC4156x.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                th2 = e11;
            }
            C6098g.this.f63259j.d(dVar.f63275a);
            synchronized (this) {
                try {
                    if (!this.f63273a) {
                        C6098g.this.f63264o.obtainMessage(message.what, Pair.create(dVar.f63278d, th2)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: q1.g$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f63275a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63276b;

        /* renamed from: c, reason: collision with root package name */
        public final long f63277c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f63278d;

        /* renamed from: e, reason: collision with root package name */
        public int f63279e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f63275a = j10;
            this.f63276b = z10;
            this.f63277c = j11;
            this.f63278d = obj;
        }
    }

    /* renamed from: q1.g$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C6098g.this.C(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                C6098g.this.w(obj, obj2);
            }
        }
    }

    /* renamed from: q1.g$f */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C6098g(UUID uuid, InterfaceC6089A interfaceC6089A, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, M m10, Looper looper, D1.k kVar, G1 g12) {
        if (i10 == 1 || i10 == 3) {
            AbstractC4134a.e(bArr);
        }
        this.f63262m = uuid;
        this.f63252c = aVar;
        this.f63253d = bVar;
        this.f63251b = interfaceC6089A;
        this.f63254e = i10;
        this.f63255f = z10;
        this.f63256g = z11;
        if (bArr != null) {
            this.offlineLicenseKeySetId = bArr;
            this.f63250a = null;
        } else {
            this.f63250a = Collections.unmodifiableList((List) AbstractC4134a.e(list));
        }
        this.f63257h = hashMap;
        this.f63261l = m10;
        this.f63258i = new C4149p();
        this.f63259j = kVar;
        this.f63260k = g12;
        this.f63265p = 2;
        this.f63263n = looper;
        this.f63264o = new e(looper);
    }

    public void A() {
        if (D()) {
            r(true);
        }
    }

    public void B(Exception exc, boolean z10) {
        v(exc, z10 ? 1 : 3);
    }

    public final void C(Object obj, Object obj2) {
        if (obj == this.f63272w) {
            if (this.f63265p == 2 || u()) {
                this.f63272w = null;
                if (obj2 instanceof Exception) {
                    this.f63252c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f63251b.e((byte[]) obj2);
                    this.f63252c.b();
                } catch (Exception e10) {
                    this.f63252c.a(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D() {
        if (u()) {
            return true;
        }
        try {
            byte[] c10 = this.f63251b.c();
            this.sessionId = c10;
            this.f63251b.i(c10, this.f63260k);
            this.f63269t = this.f63251b.h(this.sessionId);
            final int i10 = 3;
            this.f63265p = 3;
            q(new InterfaceC4148o() { // from class: q1.b
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    ((t.a) obj).k(i10);
                }
            });
            AbstractC4134a.e(this.sessionId);
            return true;
        } catch (NotProvisionedException unused) {
            this.f63252c.c(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (x.d(e)) {
                v(e, 1);
                return false;
            }
            this.f63252c.c(this);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (x.d(e)) {
            }
        }
    }

    public final void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.f63271v = this.f63251b.m(bArr, this.f63250a, i10, this.f63257h);
            ((c) Z.i(this.f63268s)).b(2, AbstractC4134a.e(this.f63271v), z10);
        } catch (Exception | NoSuchMethodError e10) {
            x(e10, true);
        }
    }

    public void F() {
        this.f63272w = this.f63251b.b();
        ((c) Z.i(this.f63268s)).b(1, AbstractC4134a.e(this.f63272w), true);
    }

    public final boolean G() {
        try {
            this.f63251b.d(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            v(e10, 1);
            return false;
        }
    }

    public final void H() {
        if (Thread.currentThread() != this.f63263n.getThread()) {
            AbstractC4156x.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f63263n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // q1.InterfaceC6104m
    public final UUID a() {
        H();
        return this.f63262m;
    }

    @Override // q1.InterfaceC6104m
    public void b(t.a aVar) {
        H();
        if (this.f63266q < 0) {
            AbstractC4156x.d("DefaultDrmSession", "Session reference count less than zero: " + this.f63266q);
            this.f63266q = 0;
        }
        if (aVar != null) {
            this.f63258i.a(aVar);
        }
        int i10 = this.f63266q + 1;
        this.f63266q = i10;
        if (i10 == 1) {
            AbstractC4134a.g(this.f63265p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f63267r = handlerThread;
            handlerThread.start();
            this.f63268s = new c(this.f63267r.getLooper());
            if (D()) {
                r(true);
            }
        } else if (aVar != null && u() && this.f63258i.b(aVar) == 1) {
            aVar.k(this.f63265p);
        }
        this.f63253d.b(this, this.f63266q);
    }

    @Override // q1.InterfaceC6104m
    public boolean c() {
        H();
        return this.f63255f;
    }

    @Override // q1.InterfaceC6104m
    public void d(t.a aVar) {
        H();
        int i10 = this.f63266q;
        if (i10 <= 0) {
            AbstractC4156x.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f63266q = i11;
        if (i11 == 0) {
            this.f63265p = 0;
            ((e) Z.i(this.f63264o)).removeCallbacksAndMessages(null);
            ((c) Z.i(this.f63268s)).c();
            this.f63268s = null;
            ((HandlerThread) Z.i(this.f63267r)).quit();
            this.f63267r = null;
            this.f63269t = null;
            this.f63270u = null;
            this.f63271v = null;
            this.f63272w = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.f63251b.k(bArr);
                this.sessionId = null;
            }
        }
        if (aVar != null) {
            this.f63258i.c(aVar);
            if (this.f63258i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f63253d.a(this, this.f63266q);
    }

    @Override // q1.InterfaceC6104m
    public final k1.b f() {
        H();
        return this.f63269t;
    }

    @Override // q1.InterfaceC6104m
    public Map g() {
        H();
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.f63251b.a(bArr);
    }

    @Override // q1.InterfaceC6104m
    public final InterfaceC6104m.a getError() {
        H();
        if (this.f63265p == 1) {
            return this.f63270u;
        }
        return null;
    }

    @Override // q1.InterfaceC6104m
    public final int getState() {
        H();
        return this.f63265p;
    }

    @Override // q1.InterfaceC6104m
    public boolean h(String str) {
        H();
        return this.f63251b.j((byte[]) AbstractC4134a.i(this.sessionId), str);
    }

    public final void q(InterfaceC4148o interfaceC4148o) {
        Iterator it = this.f63258i.J().iterator();
        while (it.hasNext()) {
            interfaceC4148o.accept((t.a) it.next());
        }
    }

    public final void r(boolean z10) {
        if (this.f63256g) {
            return;
        }
        byte[] bArr = (byte[]) Z.i(this.sessionId);
        int i10 = this.f63254e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.offlineLicenseKeySetId == null || G()) {
                    E(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            AbstractC4134a.e(this.offlineLicenseKeySetId);
            AbstractC4134a.e(this.sessionId);
            E(this.offlineLicenseKeySetId, 3, z10);
            return;
        }
        if (this.offlineLicenseKeySetId == null) {
            E(bArr, 1, z10);
            return;
        }
        if (this.f63265p == 4 || G()) {
            long s10 = s();
            if (this.f63254e != 0 || s10 > 60) {
                if (s10 <= 0) {
                    v(new L(), 2);
                    return;
                } else {
                    this.f63265p = 4;
                    q(new InterfaceC4148o() { // from class: q1.f
                        @Override // e1.InterfaceC4148o
                        public final void accept(Object obj) {
                            ((t.a) obj).j();
                        }
                    });
                    return;
                }
            }
            AbstractC4156x.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + s10);
            E(bArr, 2, z10);
        }
    }

    public final long s() {
        if (!AbstractC2356j.f24594d.equals(this.f63262m)) {
            return LongCompanionObject.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC4134a.e(P.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean t(byte[] bArr) {
        H();
        return Arrays.equals(this.sessionId, bArr);
    }

    public final boolean u() {
        int i10 = this.f63265p;
        return i10 == 3 || i10 == 4;
    }

    public final void v(final Throwable th2, int i10) {
        this.f63270u = new InterfaceC6104m.a(th2, x.b(th2, i10));
        AbstractC4156x.e("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            q(new InterfaceC4148o() { // from class: q1.e
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    ((t.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!x.e(th2) && !x.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f63265p != 4) {
            this.f63265p = 1;
        }
    }

    public final void w(Object obj, Object obj2) {
        if (obj == this.f63271v && u()) {
            this.f63271v = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                x((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f63254e == 3) {
                    this.f63251b.l((byte[]) Z.i(this.offlineLicenseKeySetId), bArr);
                    q(new InterfaceC4148o() { // from class: q1.c
                        @Override // e1.InterfaceC4148o
                        public final void accept(Object obj3) {
                            ((t.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] l10 = this.f63251b.l(this.sessionId, bArr);
                int i10 = this.f63254e;
                if ((i10 == 2 || (i10 == 0 && this.offlineLicenseKeySetId != null)) && l10 != null && l10.length != 0) {
                    this.offlineLicenseKeySetId = l10;
                }
                this.f63265p = 4;
                q(new InterfaceC4148o() { // from class: q1.d
                    @Override // e1.InterfaceC4148o
                    public final void accept(Object obj3) {
                        ((t.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                x(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                x(e, true);
            }
        }
    }

    public final void x(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || x.d(th2)) {
            this.f63252c.c(this);
        } else {
            v(th2, z10 ? 1 : 2);
        }
    }

    public final void y() {
        if (this.f63254e == 0 && this.f63265p == 4) {
            Z.i(this.sessionId);
            r(false);
        }
    }

    public void z(int i10) {
        if (i10 != 2) {
            return;
        }
        y();
    }
}
