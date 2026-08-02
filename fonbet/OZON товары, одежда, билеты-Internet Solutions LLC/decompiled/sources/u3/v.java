package u3;

import F3.InterfaceC3018x;
import android.util.Base64;
import j3.AbstractC7252H;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import u3.InterfaceC9928b;
import u3.O;

/* loaded from: classes.dex */
public final class v implements O {

    /* renamed from: h, reason: collision with root package name */
    public static final u f99877h = new u();

    /* renamed from: i, reason: collision with root package name */
    private static final Random f99878i = new Random();

    /* renamed from: d, reason: collision with root package name */
    private Object f99882d;

    /* renamed from: f, reason: collision with root package name */
    private String f99884f;

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7252H.c f99879a = new AbstractC7252H.c();

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7252H.b f99880b = new AbstractC7252H.b();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f99881c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private AbstractC7252H f99883e = AbstractC7252H.EMPTY;

    /* renamed from: g, reason: collision with root package name */
    private long f99885g = -1;

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f99886a;

        /* renamed from: b, reason: collision with root package name */
        private int f99887b;

        /* renamed from: c, reason: collision with root package name */
        private long f99888c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC3018x.b f99889d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f99890e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f99891f;

        public a(String str, int i11, InterfaceC3018x.b bVar) {
            this.f99886a = str;
            this.f99887b = i11;
            this.f99888c = bVar == null ? -1L : bVar.f8754d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f99889d = bVar;
        }

        public final boolean i(int i11, InterfaceC3018x.b bVar) {
            if (bVar == null) {
                return i11 == this.f99887b;
            }
            long j11 = bVar.f8754d;
            InterfaceC3018x.b bVar2 = this.f99889d;
            return bVar2 == null ? !bVar.b() && j11 == this.f99888c : j11 == bVar2.f8754d && bVar.f8752b == bVar2.f8752b && bVar.f8753c == bVar2.f8753c;
        }

        public final boolean j(InterfaceC9928b.a aVar) {
            InterfaceC3018x.b bVar = aVar.f99807d;
            if (bVar == null) {
                return this.f99887b != aVar.f99806c;
            }
            long j11 = this.f99888c;
            if (j11 == -1) {
                return false;
            }
            if (bVar.f8754d > j11) {
                return true;
            }
            InterfaceC3018x.b bVar2 = this.f99889d;
            if (bVar2 == null) {
                return false;
            }
            AbstractC7252H abstractC7252H = aVar.f99805b;
            int indexOfPeriod = abstractC7252H.getIndexOfPeriod(bVar.f8751a);
            int indexOfPeriod2 = abstractC7252H.getIndexOfPeriod(bVar2.f8751a);
            if (bVar.f8754d < bVar2.f8754d || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            boolean b11 = bVar.b();
            int i11 = bVar2.f8752b;
            if (!b11) {
                int i12 = bVar.f8755e;
                return i12 == -1 || i12 > i11;
            }
            int i13 = bVar.f8752b;
            if (i13 > i11) {
                return true;
            }
            if (i13 == i11) {
                return bVar.f8753c > bVar2.f8753c;
            }
            return false;
        }

        public final void k(int i11, InterfaceC3018x.b bVar) {
            if (this.f99888c == -1 && i11 == this.f99887b && bVar != null) {
                long i12 = v.this.i();
                long j11 = bVar.f8754d;
                if (j11 >= i12) {
                    this.f99888c = j11;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        
            if (r0 < r6.getWindowCount()) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean l(AbstractC7252H abstractC7252H, AbstractC7252H abstractC7252H2) {
            int i11 = this.f99887b;
            if (i11 < abstractC7252H.getWindowCount()) {
                v vVar = v.this;
                abstractC7252H.getWindow(i11, vVar.f99879a);
                for (int i12 = vVar.f99879a.f68959n; i12 <= vVar.f99879a.f68960o; i12++) {
                    int indexOfPeriod = abstractC7252H2.getIndexOfPeriod(abstractC7252H.getUidOfPeriod(i12));
                    if (indexOfPeriod != -1) {
                        i11 = abstractC7252H2.getPeriod(indexOfPeriod, vVar.f99880b).f68939c;
                        break;
                    }
                }
                i11 = -1;
            }
            this.f99887b = i11;
            if (i11 == -1) {
                return false;
            }
            InterfaceC3018x.b bVar = this.f99889d;
            return bVar == null || abstractC7252H2.getIndexOfPeriod(bVar.f8751a) != -1;
        }
    }

    public static String a() {
        byte[] bArr = new byte[12];
        f99878i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private void f(a aVar) {
        if (aVar.f99888c != -1) {
            this.f99885g = aVar.f99888c;
        }
        this.f99884f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        a aVar = this.f99881c.get(this.f99884f);
        return (aVar == null || aVar.f99888c == -1) ? this.f99885g + 1 : aVar.f99888c;
    }

    private a j(int i11, InterfaceC3018x.b bVar) {
        HashMap<String, a> hashMap = this.f99881c;
        a aVar = null;
        long j11 = Long.MAX_VALUE;
        for (a aVar2 : hashMap.values()) {
            aVar2.k(i11, bVar);
            if (aVar2.i(i11, bVar)) {
                long j12 = aVar2.f99888c;
                if (j12 == -1 || j12 < j11) {
                    aVar = aVar2;
                    j11 = j12;
                } else if (j12 == j11) {
                    int i12 = m3.N.f74289a;
                    if (aVar.f99889d != null && aVar2.f99889d != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String a11 = a();
        a aVar3 = new a(a11, i11, bVar);
        hashMap.put(a11, aVar3);
        return aVar3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u3.O$a] */
    private void m(InterfaceC9928b.a aVar) {
        boolean isEmpty = aVar.f99805b.isEmpty();
        HashMap<String, a> hashMap = this.f99881c;
        if (isEmpty) {
            String str = this.f99884f;
            if (str != null) {
                a aVar2 = hashMap.get(str);
                aVar2.getClass();
                f(aVar2);
                return;
            }
            return;
        }
        a aVar3 = hashMap.get(this.f99884f);
        int i11 = aVar.f99806c;
        InterfaceC3018x.b bVar = aVar.f99807d;
        a j11 = j(i11, bVar);
        this.f99884f = j11.f99886a;
        n(aVar);
        if (bVar == null || !bVar.b()) {
            return;
        }
        long j12 = bVar.f8754d;
        if (aVar3 != null && aVar3.f99888c == j12 && aVar3.f99889d != null && aVar3.f99889d.f8752b == bVar.f8752b && aVar3.f99889d.f8753c == bVar.f8753c) {
            return;
        }
        this.f99882d.onAdPlaybackStarted(aVar, j(i11, new InterfaceC3018x.b(j12, bVar.f8751a)).f99886a, j11.f99886a);
    }

    public final synchronized boolean e(InterfaceC9928b.a aVar, String str) {
        a aVar2 = this.f99881c.get(str);
        if (aVar2 == null) {
            return false;
        }
        aVar2.k(aVar.f99806c, aVar.f99807d);
        return aVar2.i(aVar.f99806c, aVar.f99807d);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, u3.O$a] */
    public final synchronized void g(InterfaceC9928b.a aVar) {
        ?? r22;
        try {
            String str = this.f99884f;
            if (str != null) {
                a aVar2 = this.f99881c.get(str);
                aVar2.getClass();
                f(aVar2);
            }
            Iterator<a> it = this.f99881c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f99890e && (r22 = this.f99882d) != 0) {
                    r22.onSessionFinished(aVar, next.f99886a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String h() {
        return this.f99884f;
    }

    public final synchronized String k(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar) {
        return j(abstractC7252H.getPeriodByUid(bVar.f8751a, this.f99880b).f68939c, bVar).f99886a;
    }

    public final void l(O.a aVar) {
        this.f99882d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:16:0x0024, B:18:0x0030, B:20:0x003a, B:24:0x0047, B:26:0x0053, B:27:0x0059, B:29:0x005d, B:31:0x0063, B:33:0x007c, B:34:0x00ce, B:36:0x00d4, B:37:0x00e0, B:39:0x00ec, B:41:0x00f2), top: B:3:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, u3.O$a] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, u3.O$a] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, u3.O$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void n(InterfaceC9928b.a aVar) {
        a aVar2;
        this.f99882d.getClass();
        if (aVar.f99805b.isEmpty()) {
            return;
        }
        InterfaceC3018x.b bVar = aVar.f99807d;
        if (bVar != null) {
            if (bVar.f8754d < i()) {
                return;
            }
            a aVar3 = this.f99881c.get(this.f99884f);
            if (aVar3 != null && aVar3.f99888c == -1 && aVar3.f99887b != aVar.f99806c) {
                return;
            }
        }
        a j11 = j(aVar.f99806c, aVar.f99807d);
        if (this.f99884f == null) {
            this.f99884f = j11.f99886a;
        }
        InterfaceC3018x.b bVar2 = aVar.f99807d;
        if (bVar2 != null && bVar2.b()) {
            InterfaceC3018x.b bVar3 = aVar.f99807d;
            InterfaceC3018x.b bVar4 = new InterfaceC3018x.b(bVar3.f8754d, bVar3.f8751a, bVar3.f8752b);
            a j12 = j(aVar.f99806c, bVar4);
            if (!j12.f99890e) {
                j12.f99890e = true;
                aVar.f99805b.getPeriodByUid(aVar.f99807d.f8751a, this.f99880b);
                this.f99880b.d(aVar.f99807d.f8752b);
                aVar2 = j11;
                this.f99882d.onSessionCreated(new InterfaceC9928b.a(aVar.f99804a, aVar.f99805b, aVar.f99806c, bVar4, Math.max(0L, m3.N.g0(0L) + m3.N.g0(this.f99880b.f68941e)), aVar.f99809f, aVar.f99810g, aVar.f99811h, aVar.f99812i, aVar.f99813j), j12.f99886a);
                if (!aVar2.f99890e) {
                    aVar2.f99890e = true;
                    this.f99882d.onSessionCreated(aVar, aVar2.f99886a);
                }
                if (aVar2.f99886a.equals(this.f99884f) && !aVar2.f99891f) {
                    aVar2.f99891f = true;
                    this.f99882d.onSessionActive(aVar, aVar2.f99886a);
                }
            }
        }
        aVar2 = j11;
        if (!aVar2.f99890e) {
        }
        if (aVar2.f99886a.equals(this.f99884f)) {
            aVar2.f99891f = true;
            this.f99882d.onSessionActive(aVar, aVar2.f99886a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, u3.O$a] */
    public final synchronized void o(InterfaceC9928b.a aVar, int i11) {
        try {
            this.f99882d.getClass();
            boolean z11 = i11 == 0;
            Iterator<a> it = this.f99881c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f99890e) {
                        boolean equals = next.f99886a.equals(this.f99884f);
                        boolean z12 = z11 && equals && next.f99891f;
                        if (equals) {
                            f(next);
                        }
                        this.f99882d.onSessionFinished(aVar, next.f99886a, z12);
                    }
                }
            }
            m(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, u3.O$a] */
    public final synchronized void p(InterfaceC9928b.a aVar) {
        try {
            this.f99882d.getClass();
            AbstractC7252H abstractC7252H = this.f99883e;
            this.f99883e = aVar.f99805b;
            Iterator<a> it = this.f99881c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.l(abstractC7252H, this.f99883e) && !next.j(aVar)) {
                }
                it.remove();
                if (next.f99890e) {
                    if (next.f99886a.equals(this.f99884f)) {
                        f(next);
                    }
                    this.f99882d.onSessionFinished(aVar, next.f99886a, false);
                }
            }
            m(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
