package C1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.source.D;
import b1.AbstractC2335D;
import com.google.common.collect.AbstractC3445z;
import d1.C3987c;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import e2.C4160b;
import e2.C4163e;
import e2.InterfaceC4169k;
import e2.l;
import e2.m;
import e2.p;
import e2.q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import m1.O0;

/* loaded from: classes.dex */
public final class i extends androidx.media3.exoplayer.c implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    public q f1072A;

    /* renamed from: B, reason: collision with root package name */
    public int f1073B;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f1074C;

    /* renamed from: D, reason: collision with root package name */
    public final h f1075D;

    /* renamed from: E, reason: collision with root package name */
    public final O0 f1076E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1077F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1078G;

    /* renamed from: H, reason: collision with root package name */
    public androidx.media3.common.a f1079H;

    /* renamed from: I, reason: collision with root package name */
    public long f1080I;

    /* renamed from: J, reason: collision with root package name */
    public long f1081J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1082K;

    /* renamed from: r, reason: collision with root package name */
    public final C4160b f1083r;

    /* renamed from: s, reason: collision with root package name */
    public final k1.f f1084s;

    /* renamed from: t, reason: collision with root package name */
    public a f1085t;

    /* renamed from: u, reason: collision with root package name */
    public final g f1086u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1087v;

    /* renamed from: w, reason: collision with root package name */
    public int f1088w;

    /* renamed from: x, reason: collision with root package name */
    public l f1089x;

    /* renamed from: y, reason: collision with root package name */
    public p f1090y;

    /* renamed from: z, reason: collision with root package name */
    public q f1091z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f1070a);
    }

    public static boolean A0(androidx.media3.common.a aVar) {
        return Objects.equals(aVar.f20543o, "application/x-media3-cues");
    }

    private long v0(long j10) {
        AbstractC4134a.g(j10 != -9223372036854775807L);
        return j10 - a0();
    }

    public static boolean x0(InterfaceC4169k interfaceC4169k, long j10) {
        return interfaceC4169k != null && interfaceC4169k.d() > 0 && interfaceC4169k.c(interfaceC4169k.d() - 1) > j10;
    }

    public final boolean B0(long j10) {
        if (this.f1077F || o0(this.f1076E, this.f1084s, 0) != -4) {
            return false;
        }
        if (this.f1084s.i()) {
            this.f1077F = true;
            return false;
        }
        this.f1084s.q();
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(this.f1084s.f54108d);
        C4163e a10 = this.f1083r.a(this.f1084s.f54110f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f1084s.f();
        return this.f1085t.b(a10, j10);
    }

    public final void C0() {
        this.f1090y = null;
        this.f1073B = -1;
        q qVar = this.f1091z;
        if (qVar != null) {
            qVar.o();
            this.f1091z = null;
        }
        q qVar2 = this.f1072A;
        if (qVar2 != null) {
            qVar2.o();
            this.f1072A = null;
        }
    }

    public final void D0() {
        C0();
        ((l) AbstractC4134a.e(this.f1089x)).release();
        this.f1089x = null;
        this.f1088w = 0;
    }

    public final void E0(long j10) {
        boolean B02 = B0(j10);
        long d10 = this.f1085t.d(this.f1080I);
        if (d10 == Long.MIN_VALUE && this.f1077F && !B02) {
            this.f1078G = true;
        }
        if (d10 != Long.MIN_VALUE && d10 <= j10) {
            B02 = true;
        }
        if (B02) {
            AbstractC3445z a10 = this.f1085t.a(j10);
            long c10 = this.f1085t.c(j10);
            I0(new C3987c(a10, v0(c10)));
            this.f1085t.e(c10);
        }
        this.f1080I = j10;
    }

    public final void F0(long j10) {
        boolean z10;
        this.f1080I = j10;
        if (this.f1072A == null) {
            ((l) AbstractC4134a.e(this.f1089x)).b(j10);
            try {
                this.f1072A = (q) ((l) AbstractC4134a.e(this.f1089x)).a();
            } catch (m e10) {
                w0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f1091z != null) {
            long u02 = u0();
            z10 = false;
            while (u02 <= j10) {
                this.f1073B++;
                u02 = u0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        q qVar = this.f1072A;
        if (qVar != null) {
            if (qVar.i()) {
                if (!z10 && u0() == LongCompanionObject.MAX_VALUE) {
                    if (this.f1088w == 2) {
                        G0();
                    } else {
                        C0();
                        this.f1078G = true;
                    }
                }
            } else if (qVar.f54116b <= j10) {
                q qVar2 = this.f1091z;
                if (qVar2 != null) {
                    qVar2.o();
                }
                this.f1073B = qVar.a(j10);
                this.f1091z = qVar;
                this.f1072A = null;
                z10 = true;
            }
        }
        if (z10) {
            AbstractC4134a.e(this.f1091z);
            I0(new C3987c(this.f1091z.b(j10), v0(t0(j10))));
        }
        if (this.f1088w == 2) {
            return;
        }
        while (!this.f1077F) {
            try {
                p pVar = this.f1090y;
                if (pVar == null) {
                    pVar = (p) ((l) AbstractC4134a.e(this.f1089x)).f();
                    if (pVar == null) {
                        return;
                    } else {
                        this.f1090y = pVar;
                    }
                }
                if (this.f1088w == 1) {
                    pVar.n(4);
                    ((l) AbstractC4134a.e(this.f1089x)).d(pVar);
                    this.f1090y = null;
                    this.f1088w = 2;
                    return;
                }
                int o02 = o0(this.f1076E, pVar, 0);
                if (o02 == -4) {
                    if (pVar.i()) {
                        this.f1077F = true;
                        this.f1087v = false;
                    } else {
                        androidx.media3.common.a aVar = this.f1076E.f56121b;
                        if (aVar == null) {
                            return;
                        }
                        pVar.f45613j = aVar.f20548t;
                        pVar.q();
                        this.f1087v &= !pVar.k();
                    }
                    if (!this.f1087v) {
                        ((l) AbstractC4134a.e(this.f1089x)).d(pVar);
                        this.f1090y = null;
                    }
                } else if (o02 == -3) {
                    return;
                }
            } catch (m e11) {
                w0(e11);
                return;
            }
        }
    }

    public final void G0() {
        D0();
        y0();
    }

    public void H0(long j10) {
        AbstractC4134a.g(y());
        this.f1081J = j10;
    }

    public final void I0(C3987c c3987c) {
        Handler handler = this.f1074C;
        if (handler != null) {
            handler.obtainMessage(1, c3987c).sendToTarget();
        } else {
            z0(c3987c);
        }
    }

    @Override // androidx.media3.exoplayer.q
    public int a(androidx.media3.common.a aVar) {
        if (A0(aVar) || this.f1086u.a(aVar)) {
            return androidx.media3.exoplayer.q.r(aVar.f20527O == 0 ? 4 : 2);
        }
        return AbstractC2335D.s(aVar.f20543o) ? androidx.media3.exoplayer.q.r(1) : androidx.media3.exoplayer.q.r(0);
    }

    @Override // androidx.media3.exoplayer.p
    public boolean b() {
        return this.f1078G;
    }

    @Override // androidx.media3.exoplayer.p
    public boolean c() {
        androidx.media3.common.a aVar = this.f1079H;
        if (aVar == null) {
            return true;
        }
        if (!A0((androidx.media3.common.a) AbstractC4134a.e(aVar))) {
            return !this.f1078G && (!this.f1077F || x0(this.f1091z, this.f1080I) || x0(this.f1072A, this.f1080I) || this.f1090y == null);
        }
        if (((a) AbstractC4134a.e(this.f1085t)).d(this.f1080I) != Long.MIN_VALUE) {
            return true;
        }
        try {
            v();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void d0() {
        this.f1079H = null;
        this.f1081J = -9223372036854775807L;
        s0();
        this.f1080I = -9223372036854775807L;
        if (this.f1089x != null) {
            D0();
        }
    }

    @Override // androidx.media3.exoplayer.c
    public void g0(long j10, boolean z10) {
        this.f1080I = j10;
        a aVar = this.f1085t;
        if (aVar != null) {
            aVar.clear();
        }
        s0();
        this.f1077F = false;
        this.f1078G = false;
        this.f1081J = -9223372036854775807L;
        androidx.media3.common.a aVar2 = this.f1079H;
        if (aVar2 == null || A0(aVar2)) {
            return;
        }
        if (this.f1088w != 0) {
            G0();
            return;
        }
        C0();
        l lVar = (l) AbstractC4134a.e(this.f1089x);
        lVar.flush();
        lVar.e(X());
    }

    @Override // androidx.media3.exoplayer.p, androidx.media3.exoplayer.q
    public String getName() {
        return "TextRenderer";
    }

    @Override // androidx.media3.exoplayer.p
    public void h(long j10, long j11) {
        if (y()) {
            long j12 = this.f1081J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                C0();
                this.f1078G = true;
            }
        }
        if (this.f1078G) {
            return;
        }
        if (A0((androidx.media3.common.a) AbstractC4134a.e(this.f1079H))) {
            AbstractC4134a.e(this.f1085t);
            E0(j10);
        } else {
            r0();
            F0(j10);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        z0((C3987c) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.c
    public void m0(androidx.media3.common.a[] aVarArr, long j10, long j11, D.b bVar) {
        androidx.media3.common.a aVar = aVarArr[0];
        this.f1079H = aVar;
        if (A0(aVar)) {
            this.f1085t = this.f1079H.f20524L == 1 ? new e() : new f();
            return;
        }
        r0();
        if (this.f1089x != null) {
            this.f1088w = 1;
        } else {
            y0();
        }
    }

    public final void r0() {
        AbstractC4134a.h(this.f1082K || Objects.equals(this.f1079H.f20543o, "application/cea-608") || Objects.equals(this.f1079H.f20543o, "application/x-mp4-cea-608") || Objects.equals(this.f1079H.f20543o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f1079H.f20543o + " samples (expected application/x-media3-cues).");
    }

    public final void s0() {
        I0(new C3987c(AbstractC3445z.t(), v0(this.f1080I)));
    }

    public final long t0(long j10) {
        int a10 = this.f1091z.a(j10);
        if (a10 == 0 || this.f1091z.d() == 0) {
            return this.f1091z.f54116b;
        }
        if (a10 != -1) {
            return this.f1091z.c(a10 - 1);
        }
        return this.f1091z.c(r2.d() - 1);
    }

    public final long u0() {
        if (this.f1073B == -1) {
            return LongCompanionObject.MAX_VALUE;
        }
        AbstractC4134a.e(this.f1091z);
        return this.f1073B >= this.f1091z.d() ? LongCompanionObject.MAX_VALUE : this.f1091z.c(this.f1073B);
    }

    public final void w0(m mVar) {
        AbstractC4156x.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f1079H, mVar);
        s0();
        G0();
    }

    public final void y0() {
        this.f1087v = true;
        l b10 = this.f1086u.b((androidx.media3.common.a) AbstractC4134a.e(this.f1079H));
        this.f1089x = b10;
        b10.e(X());
    }

    public final void z0(C3987c c3987c) {
        this.f1075D.n(c3987c.f44897a);
        this.f1075D.y(c3987c);
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        this.f1075D = (h) AbstractC4134a.e(hVar);
        this.f1074C = looper == null ? null : Z.y(looper, this);
        this.f1086u = gVar;
        this.f1083r = new C4160b();
        this.f1084s = new k1.f(1);
        this.f1076E = new O0();
        this.f1081J = -9223372036854775807L;
        this.f1080I = -9223372036854775807L;
        this.f1082K = false;
    }
}
