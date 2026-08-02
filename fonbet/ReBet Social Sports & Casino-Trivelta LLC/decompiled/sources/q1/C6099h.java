package q1;

import ai.verisoul.sdk.Core;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.DrmInitData;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.g0;
import com.google.common.collect.m0;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import n1.G1;
import q1.C6098g;
import q1.C6099h;
import q1.InterfaceC6089A;
import q1.InterfaceC6104m;
import q1.t;
import q1.u;

/* renamed from: q1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6099h implements u {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f63281b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6089A.c f63282c;

    /* renamed from: d, reason: collision with root package name */
    public final M f63283d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f63284e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63285f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63286g;

    /* renamed from: h, reason: collision with root package name */
    public final g f63287h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.k f63288i;

    /* renamed from: j, reason: collision with root package name */
    public final C0874h f63289j;

    /* renamed from: k, reason: collision with root package name */
    public final long f63290k;

    /* renamed from: l, reason: collision with root package name */
    public final List f63291l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f63292m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f63293n;

    /* renamed from: o, reason: collision with root package name */
    public int f63294o;
    private byte[] offlineLicenseKeySetId;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC6089A f63295p;

    /* renamed from: q, reason: collision with root package name */
    public C6098g f63296q;

    /* renamed from: r, reason: collision with root package name */
    public C6098g f63297r;

    /* renamed from: s, reason: collision with root package name */
    public Looper f63298s;

    /* renamed from: t, reason: collision with root package name */
    public Handler f63299t;

    /* renamed from: u, reason: collision with root package name */
    public int f63300u;
    private final int[] useDrmSessionsForClearContentTrackTypes;

    /* renamed from: v, reason: collision with root package name */
    public G1 f63301v;

    /* renamed from: w, reason: collision with root package name */
    public volatile d f63302w;

    /* renamed from: q1.h$b */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public boolean f63306d;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f63303a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public UUID f63304b = AbstractC2356j.f24594d;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC6089A.c f63305c = J.f63235d;
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];

        /* renamed from: e, reason: collision with root package name */
        public boolean f63307e = true;

        /* renamed from: f, reason: collision with root package name */
        public D1.k f63308f = new D1.j();

        /* renamed from: g, reason: collision with root package name */
        public long f63309g = Core.sensorDataTimeout;

        public C6099h a(M m10) {
            return new C6099h(this.f63304b, this.f63305c, m10, this.f63303a, this.f63306d, this.useDrmSessionsForClearContentTrackTypes, this.f63307e, this.f63308f, this.f63309g);
        }

        public b b(Map map) {
            this.f63303a.clear();
            if (map != null) {
                this.f63303a.putAll(map);
            }
            return this;
        }

        public b c(D1.k kVar) {
            this.f63308f = (D1.k) AbstractC4134a.e(kVar);
            return this;
        }

        public b d(boolean z10) {
            this.f63306d = z10;
            return this;
        }

        public b e(boolean z10) {
            this.f63307e = z10;
            return this;
        }

        public b f(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                AbstractC4134a.a(z10);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public b g(UUID uuid, InterfaceC6089A.c cVar) {
            this.f63304b = (UUID) AbstractC4134a.e(uuid);
            this.f63305c = (InterfaceC6089A.c) AbstractC4134a.e(cVar);
            return this;
        }
    }

    /* renamed from: q1.h$c */
    public class c implements InterfaceC6089A.b {
        public c() {
        }

        @Override // q1.InterfaceC6089A.b
        public void a(InterfaceC6089A interfaceC6089A, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) AbstractC4134a.e(C6099h.this.f63302w)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* renamed from: q1.h$d */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C6098g c6098g : C6099h.this.f63291l) {
                if (c6098g.t(bArr)) {
                    c6098g.z(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: q1.h$e */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: q1.h$f */
    public class f implements u.b {

        /* renamed from: b, reason: collision with root package name */
        public final t.a f63312b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC6104m f63313c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f63314d;

        public f(t.a aVar) {
            this.f63312b = aVar;
        }

        public static /* synthetic */ void b(f fVar, androidx.media3.common.a aVar) {
            if (C6099h.this.f63294o == 0 || fVar.f63314d) {
                return;
            }
            C6099h c6099h = C6099h.this;
            fVar.f63313c = c6099h.t((Looper) AbstractC4134a.e(c6099h.f63298s), fVar.f63312b, aVar, false);
            C6099h.this.f63292m.add(fVar);
        }

        public static /* synthetic */ void c(f fVar) {
            if (fVar.f63314d) {
                return;
            }
            InterfaceC6104m interfaceC6104m = fVar.f63313c;
            if (interfaceC6104m != null) {
                interfaceC6104m.d(fVar.f63312b);
            }
            C6099h.this.f63292m.remove(fVar);
            fVar.f63314d = true;
        }

        public void d(final androidx.media3.common.a aVar) {
            ((Handler) AbstractC4134a.e(C6099h.this.f63299t)).post(new Runnable() { // from class: q1.i
                @Override // java.lang.Runnable
                public final void run() {
                    C6099h.f.b(C6099h.f.this, aVar);
                }
            });
        }

        @Override // q1.u.b
        public void release() {
            Z.l1((Handler) AbstractC4134a.e(C6099h.this.f63299t), new Runnable() { // from class: q1.j
                @Override // java.lang.Runnable
                public final void run() {
                    C6099h.f.c(C6099h.f.this);
                }
            });
        }
    }

    /* renamed from: q1.h$g */
    public class g implements C6098g.a {

        /* renamed from: a, reason: collision with root package name */
        public final Set f63316a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public C6098g f63317b;

        public g() {
        }

        @Override // q1.C6098g.a
        public void a(Exception exc, boolean z10) {
            this.f63317b = null;
            AbstractC3445z o10 = AbstractC3445z.o(this.f63316a);
            this.f63316a.clear();
            m0 it = o10.iterator();
            while (it.hasNext()) {
                ((C6098g) it.next()).B(exc, z10);
            }
        }

        @Override // q1.C6098g.a
        public void b() {
            this.f63317b = null;
            AbstractC3445z o10 = AbstractC3445z.o(this.f63316a);
            this.f63316a.clear();
            m0 it = o10.iterator();
            while (it.hasNext()) {
                ((C6098g) it.next()).A();
            }
        }

        @Override // q1.C6098g.a
        public void c(C6098g c6098g) {
            this.f63316a.add(c6098g);
            if (this.f63317b != null) {
                return;
            }
            this.f63317b = c6098g;
            c6098g.F();
        }

        public void d(C6098g c6098g) {
            this.f63316a.remove(c6098g);
            if (this.f63317b == c6098g) {
                this.f63317b = null;
                if (this.f63316a.isEmpty()) {
                    return;
                }
                C6098g c6098g2 = (C6098g) this.f63316a.iterator().next();
                this.f63317b = c6098g2;
                c6098g2.F();
            }
        }
    }

    /* renamed from: q1.h$h, reason: collision with other inner class name */
    public class C0874h implements C6098g.b {
        public C0874h() {
        }

        @Override // q1.C6098g.b
        public void a(final C6098g c6098g, int i10) {
            if (i10 == 1 && C6099h.this.f63294o > 0 && C6099h.this.f63290k != -9223372036854775807L) {
                C6099h.this.f63293n.add(c6098g);
                ((Handler) AbstractC4134a.e(C6099h.this.f63299t)).postAtTime(new Runnable() { // from class: q1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6098g.this.d(null);
                    }
                }, c6098g, SystemClock.uptimeMillis() + C6099h.this.f63290k);
            } else if (i10 == 0) {
                C6099h.this.f63291l.remove(c6098g);
                if (C6099h.this.f63296q == c6098g) {
                    C6099h.this.f63296q = null;
                }
                if (C6099h.this.f63297r == c6098g) {
                    C6099h.this.f63297r = null;
                }
                C6099h.this.f63287h.d(c6098g);
                if (C6099h.this.f63290k != -9223372036854775807L) {
                    ((Handler) AbstractC4134a.e(C6099h.this.f63299t)).removeCallbacksAndMessages(c6098g);
                    C6099h.this.f63293n.remove(c6098g);
                }
            }
            C6099h.this.C();
        }

        @Override // q1.C6098g.b
        public void b(C6098g c6098g, int i10) {
            if (C6099h.this.f63290k != -9223372036854775807L) {
                C6099h.this.f63293n.remove(c6098g);
                ((Handler) AbstractC4134a.e(C6099h.this.f63299t)).removeCallbacksAndMessages(c6098g);
            }
        }
    }

    public static boolean u(InterfaceC6104m interfaceC6104m) {
        if (interfaceC6104m.getState() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC6104m.a) AbstractC4134a.e(interfaceC6104m.getError())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    public static List y(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f20464c);
        for (int i10 = 0; i10 < drmInitData.f20464c; i10++) {
            DrmInitData.SchemeData i11 = drmInitData.i(i10);
            if ((i11.d(uuid) || (AbstractC2356j.f24593c.equals(uuid) && i11.d(AbstractC2356j.f24592b))) && (i11.data != null || z10)) {
                arrayList.add(i11);
            }
        }
        return arrayList;
    }

    public final InterfaceC6104m A(int i10, boolean z10) {
        InterfaceC6089A interfaceC6089A = (InterfaceC6089A) AbstractC4134a.e(this.f63295p);
        if ((interfaceC6089A.f() == 2 && C6090B.f63230c) || Z.V0(this.useDrmSessionsForClearContentTrackTypes, i10) == -1 || interfaceC6089A.f() == 1) {
            return null;
        }
        C6098g c6098g = this.f63296q;
        if (c6098g == null) {
            C6098g x10 = x(AbstractC3445z.t(), true, null, z10);
            this.f63291l.add(x10);
            this.f63296q = x10;
        } else {
            c6098g.b(null);
        }
        return this.f63296q;
    }

    public final void B(Looper looper) {
        if (this.f63302w == null) {
            this.f63302w = new d(looper);
        }
    }

    public final void C() {
        if (this.f63295p != null && this.f63294o == 0 && this.f63291l.isEmpty() && this.f63292m.isEmpty()) {
            ((InterfaceC6089A) AbstractC4134a.e(this.f63295p)).release();
            this.f63295p = null;
        }
    }

    public final void D() {
        m0 it = com.google.common.collect.E.m(this.f63293n).iterator();
        while (it.hasNext()) {
            ((InterfaceC6104m) it.next()).d(null);
        }
    }

    public final void E() {
        m0 it = com.google.common.collect.E.m(this.f63292m).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public void F(int i10, byte[] bArr) {
        AbstractC4134a.g(this.f63291l.isEmpty());
        if (i10 == 1 || i10 == 3) {
            AbstractC4134a.e(bArr);
        }
        this.f63300u = i10;
        this.offlineLicenseKeySetId = bArr;
    }

    public final void G(InterfaceC6104m interfaceC6104m, t.a aVar) {
        interfaceC6104m.d(aVar);
        if (this.f63290k != -9223372036854775807L) {
            interfaceC6104m.d(null);
        }
    }

    public final void H(boolean z10) {
        if (z10 && this.f63298s == null) {
            AbstractC4156x.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC4134a.e(this.f63298s)).getThread()) {
            AbstractC4156x.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f63298s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // q1.u
    public void a(Looper looper, G1 g12) {
        z(looper);
        this.f63301v = g12;
    }

    @Override // q1.u
    public int b(androidx.media3.common.a aVar) {
        H(false);
        int f10 = ((InterfaceC6089A) AbstractC4134a.e(this.f63295p)).f();
        DrmInitData drmInitData = aVar.f20547s;
        if (drmInitData == null) {
            if (Z.V0(this.useDrmSessionsForClearContentTrackTypes, AbstractC2335D.k(aVar.f20543o)) == -1) {
                return 0;
            }
        } else if (!v(drmInitData)) {
            return 1;
        }
        return f10;
    }

    @Override // q1.u
    public InterfaceC6104m c(t.a aVar, androidx.media3.common.a aVar2) {
        H(false);
        AbstractC4134a.g(this.f63294o > 0);
        AbstractC4134a.i(this.f63298s);
        return t(this.f63298s, aVar, aVar2, true);
    }

    @Override // q1.u
    public u.b d(t.a aVar, androidx.media3.common.a aVar2) {
        AbstractC4134a.g(this.f63294o > 0);
        AbstractC4134a.i(this.f63298s);
        f fVar = new f(aVar);
        fVar.d(aVar2);
        return fVar;
    }

    @Override // q1.u
    public final void g() {
        H(true);
        int i10 = this.f63294o;
        this.f63294o = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f63295p == null) {
            InterfaceC6089A a10 = this.f63282c.a(this.f63281b);
            this.f63295p = a10;
            a10.g(new c());
        } else if (this.f63290k != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f63291l.size(); i11++) {
                ((C6098g) this.f63291l.get(i11)).b(null);
            }
        }
    }

    @Override // q1.u
    public final void release() {
        H(true);
        int i10 = this.f63294o - 1;
        this.f63294o = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f63290k != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f63291l);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C6098g) arrayList.get(i11)).d(null);
            }
        }
        E();
        C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC6104m t(Looper looper, t.a aVar, androidx.media3.common.a aVar2, boolean z10) {
        List list;
        B(looper);
        DrmInitData drmInitData = aVar2.f20547s;
        if (drmInitData == null) {
            return A(AbstractC2335D.k(aVar2.f20543o), z10);
        }
        C6098g c6098g = null;
        Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            list = y((DrmInitData) AbstractC4134a.e(drmInitData), this.f63281b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f63281b);
                AbstractC4156x.e("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new InterfaceC6104m.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f63285f) {
            Iterator it = this.f63291l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6098g c6098g2 = (C6098g) it.next();
                if (Objects.equals(c6098g2.f63250a, list)) {
                    c6098g = c6098g2;
                    break;
                }
            }
        } else {
            c6098g = this.f63297r;
        }
        if (c6098g != null) {
            c6098g.b(aVar);
            return c6098g;
        }
        C6098g x10 = x(list, false, aVar, z10);
        if (!this.f63285f) {
            this.f63297r = x10;
        }
        this.f63291l.add(x10);
        return x10;
    }

    public final boolean v(DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (y(drmInitData, this.f63281b, true).isEmpty()) {
            if (drmInitData.f20464c != 1 || !drmInitData.i(0).d(AbstractC2356j.f24592b)) {
                return false;
            }
            AbstractC4156x.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f63281b);
        }
        String str = drmInitData.f20463b;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str)) {
            return true;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final C6098g w(List list, boolean z10, t.a aVar) {
        AbstractC4134a.e(this.f63295p);
        C6098g c6098g = new C6098g(this.f63281b, this.f63295p, this.f63287h, this.f63289j, list, this.f63300u, this.f63286g | z10, z10, this.offlineLicenseKeySetId, this.f63284e, this.f63283d, (Looper) AbstractC4134a.e(this.f63298s), this.f63288i, (G1) AbstractC4134a.e(this.f63301v));
        c6098g.b(aVar);
        if (this.f63290k != -9223372036854775807L) {
            c6098g.b(null);
        }
        return c6098g;
    }

    public final C6098g x(List list, boolean z10, t.a aVar, boolean z11) {
        C6098g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f63293n.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f63292m.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f63293n.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    public final synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f63298s;
            if (looper2 == null) {
                this.f63298s = looper;
                this.f63299t = new Handler(looper);
            } else {
                AbstractC4134a.g(looper2 == looper);
                AbstractC4134a.e(this.f63299t);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C6099h(UUID uuid, InterfaceC6089A.c cVar, M m10, HashMap hashMap, boolean z10, int[] iArr, boolean z11, D1.k kVar, long j10) {
        AbstractC4134a.e(uuid);
        AbstractC4134a.b(!AbstractC2356j.f24592b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63281b = uuid;
        this.f63282c = cVar;
        this.f63283d = m10;
        this.f63284e = hashMap;
        this.f63285f = z10;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.f63286g = z11;
        this.f63288i = kVar;
        this.f63287h = new g();
        this.f63289j = new C0874h();
        this.f63300u = 0;
        this.f63291l = new ArrayList();
        this.f63292m = g0.h();
        this.f63293n = g0.h();
        this.f63290k = j10;
    }
}
