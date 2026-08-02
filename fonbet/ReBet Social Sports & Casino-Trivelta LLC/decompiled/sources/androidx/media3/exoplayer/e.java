package androidx.media3.exoplayer;

import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2346O;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.HashMap;
import java.util.Iterator;
import n1.G1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final D1.g f21103a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21104b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21105c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21106d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21107e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21108f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21109g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21110h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f21111i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f21112j;

    /* renamed from: k, reason: collision with root package name */
    public long f21113k;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public D1.g f21114a;

        /* renamed from: b, reason: collision with root package name */
        public int f21115b = 50000;

        /* renamed from: c, reason: collision with root package name */
        public int f21116c = 50000;

        /* renamed from: d, reason: collision with root package name */
        public int f21117d = 1000;

        /* renamed from: e, reason: collision with root package name */
        public int f21118e = 2000;

        /* renamed from: f, reason: collision with root package name */
        public int f21119f = -1;

        /* renamed from: g, reason: collision with root package name */
        public boolean f21120g = false;

        /* renamed from: h, reason: collision with root package name */
        public int f21121h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f21122i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f21123j;

        public e a() {
            AbstractC4134a.g(!this.f21123j);
            this.f21123j = true;
            if (this.f21114a == null) {
                this.f21114a = new D1.g(true, PKIFailureInfo.notAuthorized);
            }
            return new e(this.f21114a, this.f21115b, this.f21116c, this.f21117d, this.f21118e, this.f21119f, this.f21120g, this.f21121h, this.f21122i);
        }

        public b b(int i10, int i11, int i12, int i13) {
            AbstractC4134a.g(!this.f21123j);
            e.l(i12, 0, "bufferForPlaybackMs", "0");
            e.l(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            e.l(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            e.l(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            e.l(i11, i10, "maxBufferMs", "minBufferMs");
            this.f21115b = i10;
            this.f21116c = i11;
            this.f21117d = i12;
            this.f21118e = i13;
            return this;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21124a;

        /* renamed from: b, reason: collision with root package name */
        public int f21125b;

        public c() {
        }
    }

    public e() {
        this(new D1.g(true, PKIFailureInfo.notAuthorized), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    public static void l(int i10, int i11, String str, String str2) {
        AbstractC4134a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    public static int o(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return PKIFailureInfo.unsupportedVersion;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return PKIFailureInfo.unsupportedVersion;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // androidx.media3.exoplayer.j
    public boolean a(j.a aVar) {
        long r02 = Z.r0(aVar.f21346e, aVar.f21347f);
        long j10 = aVar.f21349h ? this.f21107e : this.f21106d;
        long j11 = aVar.f21350i;
        if (j11 != -9223372036854775807L) {
            j10 = Math.min(j11 / 2, j10);
        }
        if (j10 <= 0 || r02 >= j10) {
            return true;
        }
        return !this.f21109g && this.f21103a.f() >= n();
    }

    @Override // androidx.media3.exoplayer.j
    public void b(G1 g12) {
        p(g12);
        if (this.f21112j.isEmpty()) {
            this.f21113k = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.j
    public void c(j.a aVar, m0 m0Var, y[] yVarArr) {
        c cVar = (c) AbstractC4134a.e((c) this.f21112j.get(aVar.f21342a));
        int i10 = this.f21108f;
        if (i10 == -1) {
            i10 = m(yVarArr);
        }
        cVar.f21125b = i10;
        r();
    }

    @Override // androidx.media3.exoplayer.j
    public D1.b d() {
        return this.f21103a;
    }

    @Override // androidx.media3.exoplayer.j
    public void e(G1 g12) {
        p(g12);
    }

    @Override // androidx.media3.exoplayer.j
    public boolean f(AbstractC2346O abstractC2346O, D.b bVar, long j10) {
        Iterator it = this.f21112j.values().iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f21124a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.j
    public boolean g(j.a aVar) {
        c cVar = (c) AbstractC4134a.e((c) this.f21112j.get(aVar.f21342a));
        boolean z10 = true;
        boolean z11 = this.f21103a.f() >= n();
        long j10 = this.f21104b;
        float f10 = aVar.f21347f;
        if (f10 > 1.0f) {
            j10 = Math.min(Z.l0(j10, f10), this.f21105c);
        }
        long max = Math.max(j10, 500000L);
        long j11 = aVar.f21346e;
        if (j11 < max) {
            if (!this.f21109g && z11) {
                z10 = false;
            }
            cVar.f21124a = z10;
            if (!z10 && j11 < 500000) {
                AbstractC4156x.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f21105c || z11) {
            cVar.f21124a = false;
        }
        return cVar.f21124a;
    }

    @Override // androidx.media3.exoplayer.j
    public long h(G1 g12) {
        return this.f21110h;
    }

    @Override // androidx.media3.exoplayer.j
    public boolean i(G1 g12) {
        return this.f21111i;
    }

    @Override // androidx.media3.exoplayer.j
    public void j(G1 g12) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f21113k;
        AbstractC4134a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f21113k = id2;
        if (!this.f21112j.containsKey(g12)) {
            this.f21112j.put(g12, new c());
        }
        q(g12);
    }

    public int m(y[] yVarArr) {
        int i10 = 0;
        for (y yVar : yVarArr) {
            if (yVar != null) {
                i10 += o(yVar.m().f24397c);
            }
        }
        return Math.max(13107200, i10);
    }

    public int n() {
        Iterator it = this.f21112j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((c) it.next()).f21125b;
        }
        return i10;
    }

    public final void p(G1 g12) {
        if (this.f21112j.remove(g12) != null) {
            r();
        }
    }

    public final void q(G1 g12) {
        c cVar = (c) AbstractC4134a.e((c) this.f21112j.get(g12));
        int i10 = this.f21108f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        cVar.f21125b = i10;
        cVar.f21124a = false;
    }

    public final void r() {
        if (this.f21112j.isEmpty()) {
            this.f21103a.g();
        } else {
            this.f21103a.h(n());
        }
    }

    public e(D1.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        l(i12, 0, "bufferForPlaybackMs", "0");
        l(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        l(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(i11, i10, "maxBufferMs", "minBufferMs");
        l(i15, 0, "backBufferDurationMs", "0");
        this.f21103a = gVar;
        this.f21104b = Z.a1(i10);
        this.f21105c = Z.a1(i11);
        this.f21106d = Z.a1(i12);
        this.f21107e = Z.a1(i13);
        this.f21108f = i14;
        this.f21109g = z10;
        this.f21110h = Z.a1(i15);
        this.f21111i = z11;
        this.f21112j = new HashMap();
        this.f21113k = -1L;
    }
}
