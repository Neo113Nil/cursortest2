package t2;

import H1.C1177j;
import H1.J;
import H1.O;
import android.content.Context;
import b1.InterfaceC2358l;
import com.twilio.voice.AudioFormat;
import e1.AbstractC4134a;
import e2.s;
import h1.AbstractC4417m;
import h1.C4418n;
import h1.C4419o;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65055b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65056c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65057d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65058e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.common.a f65059f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.media3.common.a f65060g;

    public H0(long j10, long j11, long j12, long j13, boolean z10, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        this.f65054a = j10;
        this.f65055b = j11;
        this.f65056c = j12;
        this.f65057d = j13;
        this.f65058e = z10;
        this.f65059f = aVar;
        this.f65060g = aVar2;
    }

    public static H0 a(Context context, String str, long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        androidx.media3.common.a aVar;
        b2.n nVar = new b2.n(s.a.f45617a, 16);
        a aVar2 = new a();
        boolean z10 = false;
        C4419o c4419o = new C4419o(context, false);
        try {
            long b10 = c4419o.b(new C4418n.b().j(str).a());
            AbstractC4134a.g(b10 != 0);
            C1177j c1177j = new C1177j(c4419o, 0L, b10);
            AbstractC4134a.h(nVar.j(c1177j), "The MP4 file is invalid");
            nVar.c(aVar2);
            H1.I i10 = new H1.I();
            while (!aVar2.f65063c) {
                int g10 = nVar.g(c1177j, i10);
                if (g10 == 1) {
                    c4419o.close();
                    long b11 = c4419o.b(new C4418n.b().j(str).h(i10.f4333a).a());
                    if (b11 != -1) {
                        b11 += i10.f4333a;
                    }
                    c1177j = new C1177j(c4419o, i10.f4333a, b11);
                } else if (g10 == -1 && !aVar2.f65063c) {
                    throw new IllegalStateException("The MP4 file is invalid");
                }
            }
            long m10 = nVar.m();
            if (aVar2.f65061a != -1) {
                aVar = (androidx.media3.common.a) AbstractC4134a.e(((a.C0907a) AbstractC4134a.e((a.C0907a) aVar2.f65064d.get(2))).f65065a);
                AbstractC4134a.g(m10 != -9223372036854775807L);
                j13 = nVar.w(m10, aVar2.f65061a).f4334a.f4339a;
                if (j10 != -9223372036854775807L) {
                    J.a w10 = nVar.w(j10, aVar2.f65061a);
                    j11 = m10;
                    j12 = w10.f4334a.f4339a;
                    if (j10 != j12) {
                        j12 = w10.f4335b.f4339a;
                        if (j10 > j12) {
                            j12 = Long.MIN_VALUE;
                        }
                    }
                    long[] v10 = nVar.v(aVar2.f65061a);
                    j14 = v10.length > 0 ? v10[0] : -9223372036854775807L;
                    int d10 = e1.Z.d(v10, j10, true, false);
                    if (d10 < v10.length && v10[d10] == j12) {
                        z10 = true;
                    }
                } else {
                    j11 = m10;
                    j12 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                }
            } else {
                j11 = m10;
                j12 = -9223372036854775807L;
                j13 = -9223372036854775807L;
                j14 = -9223372036854775807L;
                aVar = null;
            }
            H0 h02 = new H0(j11, j13, j14, j12, z10, aVar, aVar2.f65062b != -1 ? (androidx.media3.common.a) AbstractC4134a.e(((a.C0907a) AbstractC4134a.e((a.C0907a) aVar2.f65064d.get(1))).f65065a) : null);
            AbstractC4417m.a(c4419o);
            nVar.release();
            return h02;
        } catch (Throwable th2) {
            AbstractC4417m.a(c4419o);
            nVar.release();
            throw th2;
        }
    }

    public static final class a implements H1.r {

        /* renamed from: c, reason: collision with root package name */
        public boolean f65063c;

        /* renamed from: a, reason: collision with root package name */
        public int f65061a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f65062b = -1;

        /* renamed from: d, reason: collision with root package name */
        public final Map f65064d = new HashMap();

        @Override // H1.r
        public H1.O c(int i10, int i11) {
            if (i11 == 2) {
                this.f65061a = i10;
            } else if (i11 == 1) {
                this.f65062b = i10;
            }
            C0907a c0907a = (C0907a) this.f65064d.get(Integer.valueOf(i11));
            if (c0907a != null) {
                return c0907a;
            }
            C0907a c0907a2 = new C0907a();
            this.f65064d.put(Integer.valueOf(i11), c0907a2);
            return c0907a2;
        }

        @Override // H1.r
        public void q(H1.J j10) {
            this.f65063c = true;
        }

        @Override // H1.r
        public void s() {
        }

        /* renamed from: t2.H0$a$a, reason: collision with other inner class name */
        public static final class C0907a implements H1.O {

            /* renamed from: a, reason: collision with root package name */
            public androidx.media3.common.a f65065a;
            private final byte[] byteArray = new byte[AudioFormat.AUDIO_SAMPLE_RATE_16000];

            @Override // H1.O
            public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
                int i12 = i10;
                while (i12 > 0) {
                    boolean z11 = false;
                    int read = interfaceC2358l.read(this.byteArray, 0, Math.min(i12, this.byteArray.length));
                    if (read != -1) {
                        z11 = true;
                    }
                    AbstractC4134a.g(z11);
                    i12 -= read;
                }
                return i10;
            }

            @Override // H1.O
            public void c(androidx.media3.common.a aVar) {
                this.f65065a = aVar;
            }

            @Override // H1.O
            public void f(e1.J j10, int i10, int i11) {
                while (i10 > 0) {
                    int min = Math.min(i10, this.byteArray.length);
                    j10.q(this.byteArray, 0, min);
                    i10 -= min;
                }
            }

            @Override // H1.O
            public void g(long j10, int i10, int i11, int i12, O.a aVar) {
            }
        }
    }
}
