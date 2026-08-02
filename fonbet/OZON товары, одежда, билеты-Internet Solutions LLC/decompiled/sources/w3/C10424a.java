package w3;

import F3.C3013s;
import J3.j;
import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j3.C7266h;
import j3.C7270l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m3.C8069k;
import m3.N;
import p3.C8847g;
import s3.InterfaceC9588b;
import u3.P;
import w3.C10425b;
import w3.g;
import w3.i;
import w3.o;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10424a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List<C7270l.b> f103394a;

    /* renamed from: b, reason: collision with root package name */
    private final o f103395b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2242a f103396c;

    /* renamed from: d, reason: collision with root package name */
    private final b f103397d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f103398e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f103399f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f103400g;

    /* renamed from: h, reason: collision with root package name */
    private final C8069k<i.a> f103401h;

    /* renamed from: i, reason: collision with root package name */
    private final J3.h f103402i;

    /* renamed from: j, reason: collision with root package name */
    private final P f103403j;

    /* renamed from: k, reason: collision with root package name */
    private final s f103404k;

    /* renamed from: l, reason: collision with root package name */
    private final UUID f103405l;

    /* renamed from: m, reason: collision with root package name */
    private final Looper f103406m;

    /* renamed from: n, reason: collision with root package name */
    private final e f103407n;

    /* renamed from: o, reason: collision with root package name */
    private int f103408o;

    /* renamed from: p, reason: collision with root package name */
    private int f103409p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f103410q;

    /* renamed from: r, reason: collision with root package name */
    private c f103411r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC9588b f103412s;

    /* renamed from: t, reason: collision with root package name */
    private g.a f103413t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f103414u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f103415v;

    /* renamed from: w, reason: collision with root package name */
    private o.a f103416w;

    /* renamed from: x, reason: collision with root package name */
    private o.c f103417x;

    /* renamed from: w3.a$a, reason: collision with other inner class name */
    public interface InterfaceC2242a {
    }

    /* renamed from: w3.a$b */
    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.a$c */
    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f103418a;

        public c(Looper looper) {
            super(looper);
        }

        public final synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f103418a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            Exception exc;
            long j11;
            d dVar = (d) message.obj;
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    u uVar = C10424a.this.f103404k;
                    UUID unused = C10424a.this.f103405l;
                    exc = ((s) uVar).b((o.c) dVar.f103422c);
                } else {
                    if (i11 != 2) {
                        throw new RuntimeException();
                    }
                    exc = ((s) C10424a.this.f103404k).a(C10424a.this.f103405l, (o.a) dVar.f103422c);
                }
            } catch (v e11) {
                d dVar2 = (d) message.obj;
                if (dVar2.f103421b) {
                    int i12 = dVar2.f103423d + 1;
                    dVar2.f103423d = i12;
                    ((J3.h) C10424a.this.f103402i).getClass();
                    if (i12 <= 3) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        Throwable fVar = e11.getCause() instanceof IOException ? (IOException) e11.getCause() : new f(e11.getCause());
                        J3.i iVar = C10424a.this.f103402i;
                        int i13 = dVar2.f103423d;
                        ((J3.h) iVar).getClass();
                        if (!(fVar instanceof j3.v) && !(fVar instanceof FileNotFoundException) && !(fVar instanceof p3.o) && !(fVar instanceof j.g)) {
                            int i14 = C8847g.f80059b;
                            while (fVar != null) {
                                if (!(fVar instanceof C8847g) || ((C8847g) fVar).f80060a != 2008) {
                                    fVar = fVar.getCause();
                                }
                            }
                            j11 = Math.min((i13 - 1) * 1000, 5000);
                            if (j11 != -9223372036854775807L) {
                                synchronized (this) {
                                    try {
                                        if (!this.f103418a) {
                                            sendMessageDelayed(Message.obtain(message), j11);
                                            return;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                        j11 = -9223372036854775807L;
                        if (j11 != -9223372036854775807L) {
                        }
                    }
                }
                exc = e11;
            } catch (Exception e12) {
                m3.s.g("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e12);
                exc = e12;
            }
            J3.i iVar2 = C10424a.this.f103402i;
            long j12 = dVar.f103420a;
            iVar2.getClass();
            synchronized (this) {
                try {
                    if (!this.f103418a) {
                        C10424a.this.f103407n.obtainMessage(message.what, Pair.create(dVar.f103422c, exc)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: w3.a$d */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f103420a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f103421b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f103422c;

        /* renamed from: d, reason: collision with root package name */
        public int f103423d;

        public d(long j11, boolean z11, long j12, Object obj) {
            this.f103420a = j11;
            this.f103421b = z11;
            this.f103422c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: w3.a$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i11 = message.what;
            C10424a c10424a = C10424a.this;
            if (i11 == 1) {
                C10424a.g(c10424a, obj, obj2);
            } else {
                if (i11 != 2) {
                    return;
                }
                C10424a.h(c10424a, obj, obj2);
            }
        }
    }

    /* renamed from: w3.a$f */
    public static final class f extends IOException {
    }

    public C10424a(UUID uuid, o oVar, InterfaceC2242a interfaceC2242a, b bVar, List list, boolean z11, boolean z12, byte[] bArr, HashMap hashMap, s sVar, Looper looper, J3.h hVar, P p11) {
        this.f103405l = uuid;
        this.f103396c = interfaceC2242a;
        this.f103397d = bVar;
        this.f103395b = oVar;
        this.f103398e = z11;
        this.f103399f = z12;
        if (bArr != null) {
            this.f103415v = bArr;
            this.f103394a = null;
        } else {
            list.getClass();
            this.f103394a = Collections.unmodifiableList(list);
        }
        this.f103400g = hashMap;
        this.f103404k = sVar;
        this.f103401h = new C8069k<>();
        this.f103402i = hVar;
        this.f103403j = p11;
        this.f103408o = 2;
        this.f103406m = looper;
        this.f103407n = new e(looper);
    }

    static void g(C10424a c10424a, Object obj, Object obj2) {
        if (obj == c10424a.f103417x) {
            if (c10424a.f103408o == 2 || c10424a.o()) {
                c10424a.f103417x = null;
                boolean z11 = obj2 instanceof Exception;
                InterfaceC2242a interfaceC2242a = c10424a.f103396c;
                if (z11) {
                    ((C10425b.f) interfaceC2242a).b((Exception) obj2, false);
                    return;
                }
                try {
                    c10424a.f103395b.h((byte[]) obj2);
                    ((C10425b.f) interfaceC2242a).a();
                } catch (Exception e11) {
                    ((C10425b.f) interfaceC2242a).b(e11, true);
                }
            }
        }
    }

    static void h(C10424a c10424a, Object obj, Object obj2) {
        if (obj == c10424a.f103416w && c10424a.o()) {
            c10424a.f103416w = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                c10424a.q(false, (Throwable) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                C8069k<i.a> c8069k = c10424a.f103401h;
                byte[] e11 = c10424a.f103395b.e(c10424a.f103414u, bArr);
                if (c10424a.f103415v != null && e11 != null && e11.length != 0) {
                    c10424a.f103415v = e11;
                }
                c10424a.f103408o = 4;
                Iterator<i.a> it = c8069k.y1().iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } catch (Exception e12) {
                e = e12;
                c10424a.q(true, e);
            } catch (NoSuchMethodError e13) {
                e = e13;
                c10424a.q(true, e);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:31|(2:32|33)|(6:35|36|37|38|(1:40)|42)|45|36|37|38|(0)|42) */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071 A[Catch: NumberFormatException -> 0x0075, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0075, blocks: (B:38:0x0069, B:40:0x0071), top: B:37:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m(boolean z11) {
        long min;
        long j11;
        String str;
        String str2;
        Pair pair = null;
        o oVar = this.f103395b;
        boolean z12 = true;
        if (this.f103399f) {
            return;
        }
        byte[] bArr = this.f103414u;
        int i11 = N.f74289a;
        if (this.f103415v == null) {
            v(bArr, 1, z11);
            return;
        }
        if (this.f103408o != 4) {
            try {
                oVar.d(this.f103414u, this.f103415v);
            } catch (Exception | NoSuchMethodError e11) {
                p(1, e11);
                z12 = false;
            }
            if (!z12) {
                return;
            }
        }
        if (C7266h.f69064d.equals(this.f103405l)) {
            x();
            byte[] bArr2 = this.f103414u;
            Map<String, String> a11 = bArr2 == null ? null : oVar.a(bArr2);
            if (a11 != null) {
                long j12 = -9223372036854775807L;
                try {
                    str2 = a11.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j11 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j11);
                    str = a11.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j12 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j12));
                }
                j11 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j11);
                str = a11.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j12));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            m3.s.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            v(bArr, 2, z11);
            return;
        }
        if (min <= 0) {
            p(2, new t());
            return;
        }
        this.f103408o = 4;
        Iterator<i.a> it = this.f103401h.y1().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private boolean o() {
        int i11 = this.f103408o;
        return i11 == 3 || i11 == 4;
    }

    private void p(int i11, Throwable th2) {
        int i12;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i12 = N.y(N.z(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !l.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i12 = 6007;
                    } else if (th2 instanceof w) {
                        i12 = 6001;
                    } else if (th2 instanceof C10425b.d) {
                        i12 = 6003;
                    } else if (th2 instanceof t) {
                        i12 = 6008;
                    } else if (i11 != 1) {
                        if (i11 == 2) {
                            i12 = 6004;
                        } else if (i11 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i12 = 6002;
            }
            i12 = 6006;
        }
        this.f103413t = new g.a(i12, th2);
        m3.s.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            Iterator<i.a> it = this.f103401h.y1().iterator();
            while (it.hasNext()) {
                it.next().e((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!l.c(th2) && !l.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f103408o != 4) {
            this.f103408o = 1;
        }
    }

    private void q(boolean z11, Throwable th2) {
        if ((th2 instanceof NotProvisionedException) || l.b(th2)) {
            ((C10425b.f) this.f103396c).d(this);
        } else {
            p(z11 ? 1 : 2, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean u() {
        InterfaceC2242a interfaceC2242a = this.f103396c;
        o oVar = this.f103395b;
        if (o()) {
            return true;
        }
        try {
            byte[] c11 = oVar.c();
            this.f103414u = c11;
            oVar.m(c11, this.f103403j);
            this.f103412s = oVar.j(this.f103414u);
            this.f103408o = 3;
            Iterator<i.a> it = this.f103401h.y1().iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f103414u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((C10425b.f) interfaceC2242a).d(this);
            return false;
        } catch (Exception e11) {
            e = e11;
            if (l.b(e)) {
                p(1, e);
                return false;
            }
            ((C10425b.f) interfaceC2242a).d(this);
            return false;
        } catch (NoSuchMethodError e12) {
            e = e12;
            if (l.b(e)) {
            }
        }
    }

    private void v(byte[] bArr, int i11, boolean z11) {
        try {
            o.a l11 = this.f103395b.l(bArr, this.f103394a, i11, this.f103400g);
            this.f103416w = l11;
            c cVar = this.f103411r;
            int i12 = N.f74289a;
            l11.getClass();
            cVar.getClass();
            cVar.obtainMessage(2, new d(C3013s.a(), z11, SystemClock.elapsedRealtime(), l11)).sendToTarget();
        } catch (Exception | NoSuchMethodError e11) {
            q(true, e11);
        }
    }

    private void x() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f103406m;
        if (currentThread != looper.getThread()) {
            m3.s.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // w3.g
    public final void a(i.a aVar) {
        C10424a c10424a;
        C10424a c10424a2;
        C10425b.f fVar;
        long j11;
        Set set;
        long j12;
        Set set2;
        long j13;
        x();
        int i11 = this.f103409p;
        if (i11 <= 0) {
            m3.s.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i12 = i11 - 1;
        this.f103409p = i12;
        if (i12 == 0) {
            this.f103408o = 0;
            int i13 = N.f74289a;
            this.f103407n.removeCallbacksAndMessages(null);
            this.f103411r.a();
            this.f103411r = null;
            this.f103410q.quit();
            this.f103410q = null;
            this.f103412s = null;
            this.f103413t = null;
            this.f103416w = null;
            this.f103417x = null;
            byte[] bArr = this.f103414u;
            if (bArr != null) {
                this.f103395b.k(bArr);
                this.f103414u = null;
            }
        }
        if (aVar != null) {
            C8069k<i.a> c8069k = this.f103401h;
            c8069k.c(aVar);
            if (c8069k.b(aVar) == 0) {
                aVar.f();
            }
        }
        int i14 = this.f103409p;
        C10425b c10425b = C10425b.this;
        if (i14 == 1 && c10425b.f103439p > 0) {
            j12 = c10425b.f103435l;
            if (j12 != -9223372036854775807L) {
                set2 = c10425b.f103438o;
                set2.add(this);
                Handler handler = c10425b.f103444u;
                handler.getClass();
                Runnable runnable = new Runnable() { // from class: w3.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C10424a.this.a(null);
                    }
                };
                long uptimeMillis = SystemClock.uptimeMillis();
                j13 = c10425b.f103435l;
                handler.postAtTime(runnable, this, uptimeMillis + j13);
                c10425b.x();
            }
        }
        if (i14 == 0) {
            c10425b.f103436m.remove(this);
            c10424a = c10425b.f103441r;
            if (c10424a == this) {
                c10425b.f103441r = null;
            }
            c10424a2 = c10425b.f103442s;
            if (c10424a2 == this) {
                c10425b.f103442s = null;
            }
            fVar = c10425b.f103432i;
            fVar.c(this);
            j11 = c10425b.f103435l;
            if (j11 != -9223372036854775807L) {
                Handler handler2 = c10425b.f103444u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                set = c10425b.f103438o;
                set.remove(this);
            }
        }
        c10425b.x();
    }

    @Override // w3.g
    public final boolean b() {
        x();
        return this.f103398e;
    }

    @Override // w3.g
    public final InterfaceC9588b c() {
        x();
        return this.f103412s;
    }

    @Override // w3.g
    public final UUID d() {
        x();
        return this.f103405l;
    }

    @Override // w3.g
    public final void e(i.a aVar) {
        long j11;
        Set set;
        x();
        if (this.f103409p < 0) {
            m3.s.c("DefaultDrmSession", "Session reference count less than zero: " + this.f103409p);
            this.f103409p = 0;
        }
        C8069k<i.a> c8069k = this.f103401h;
        if (aVar != null) {
            c8069k.a(aVar);
        }
        int i11 = this.f103409p + 1;
        this.f103409p = i11;
        if (i11 == 1) {
            G10.a.h(this.f103408o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f103410q = handlerThread;
            handlerThread.start();
            this.f103411r = new c(this.f103410q.getLooper());
            if (u()) {
                m(true);
            }
        } else if (aVar != null && o() && c8069k.b(aVar) == 1) {
            aVar.d(this.f103408o);
        }
        C10425b c10425b = C10425b.this;
        j11 = c10425b.f103435l;
        if (j11 != -9223372036854775807L) {
            set = c10425b.f103438o;
            set.remove(this);
            Handler handler = c10425b.f103444u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // w3.g
    public final boolean f(String str) {
        x();
        byte[] bArr = this.f103414u;
        G10.a.i(bArr);
        return this.f103395b.f(str, bArr);
    }

    @Override // w3.g
    public final g.a getError() {
        x();
        if (this.f103408o == 1) {
            return this.f103413t;
        }
        return null;
    }

    @Override // w3.g
    public final int getState() {
        x();
        return this.f103408o;
    }

    public final boolean n(byte[] bArr) {
        x();
        return Arrays.equals(this.f103414u, bArr);
    }

    final void r(int i11) {
        if (i11 == 2 && this.f103408o == 4) {
            int i12 = N.f74289a;
            m(false);
        }
    }

    final void s() {
        if (u()) {
            m(true);
        }
    }

    final void t(Exception exc, boolean z11) {
        p(z11 ? 1 : 3, exc);
    }

    final void w() {
        o.c b11 = this.f103395b.b();
        this.f103417x = b11;
        c cVar = this.f103411r;
        int i11 = N.f74289a;
        b11.getClass();
        cVar.getClass();
        cVar.obtainMessage(1, new d(C3013s.a(), true, SystemClock.elapsedRealtime(), b11)).sendToTarget();
    }
}
