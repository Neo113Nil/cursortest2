package t2;

import H1.C1180m;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.trackselection.F;
import androidx.media3.exoplayer.trackselection.n;
import b1.AbstractC2339H;
import b1.AbstractC2346O;
import b1.InterfaceC2341J;
import b1.T;
import com.google.common.collect.B;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import java.util.ArrayList;
import o1.InterfaceC5772y;
import t2.C6423u0;
import t2.InterfaceC6383a;
import t2.InterfaceC6399i;
import w1.InterfaceC6697b;

/* renamed from: t2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6423u0 implements InterfaceC6383a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65565a;

    /* renamed from: b, reason: collision with root package name */
    public final E f65566b;

    /* renamed from: c, reason: collision with root package name */
    public final C6395g f65567c;

    /* renamed from: d, reason: collision with root package name */
    public final ExoPlayer f65568d;

    /* renamed from: e, reason: collision with root package name */
    public int f65569e;

    /* renamed from: t2.u0$b */
    public static final class b implements InterfaceC6383a.b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65570a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC6399i.a f65571b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC4143j f65572c;

        /* renamed from: d, reason: collision with root package name */
        public final D.a f65573d;

        /* renamed from: e, reason: collision with root package name */
        public final F.a f65574e;

        /* renamed from: f, reason: collision with root package name */
        public final LogSessionId f65575f;

        public b(Context context, InterfaceC6399i.a aVar, InterfaceC4143j interfaceC4143j, D.a aVar2, F.a aVar3, LogSessionId logSessionId) {
            this.f65570a = context;
            this.f65571b = aVar;
            this.f65572c = interfaceC4143j;
            this.f65573d = aVar2;
            this.f65574e = aVar3;
            this.f65575f = logSessionId;
        }

        public static /* synthetic */ androidx.media3.exoplayer.trackselection.F b(n.e eVar, Context context) {
            androidx.media3.exoplayer.trackselection.n nVar = new androidx.media3.exoplayer.trackselection.n(context);
            nVar.m(eVar);
            return nVar;
        }

        @Override // t2.InterfaceC6383a.b
        public InterfaceC6383a a(E e10, Looper looper, InterfaceC6383a.c cVar, InterfaceC6383a.C0908a c0908a) {
            D.a aVar;
            F.a aVar2;
            D.a aVar3 = this.f65573d;
            if (aVar3 == null) {
                C1180m c1180m = new C1180m();
                if (e10.f65016d) {
                    c1180m.o(4);
                }
                aVar = new androidx.media3.exoplayer.source.r(this.f65570a, c1180m);
            } else {
                aVar = aVar3;
            }
            F.a aVar4 = this.f65574e;
            if (aVar4 == null) {
                final n.e G10 = new n.e.a(this.f65570a).x0(true).s0(false).G();
                aVar2 = new F.a() { // from class: t2.v0
                    @Override // androidx.media3.exoplayer.trackselection.F.a
                    public final androidx.media3.exoplayer.trackselection.F a(Context context) {
                        return C6423u0.b.b(n.e.this, context);
                    }
                };
            } else {
                aVar2 = aVar4;
            }
            return new C6423u0(this.f65570a, e10, aVar, this.f65571b, c0908a.f65192a, looper, cVar, this.f65572c, aVar2, this.f65575f);
        }
    }

    /* renamed from: t2.u0$c */
    public final class c implements InterfaceC2341J.d {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6383a.c f65576a;

        public c(InterfaceC6383a.c cVar) {
            this.f65576a = cVar;
        }

        @Override // b1.InterfaceC2341J.d
        public void J(AbstractC2339H abstractC2339H) {
            Throwable cause = abstractC2339H.getCause();
            if ((cause instanceof m1.N0) && ((m1.N0) cause).f56118a == 1) {
                AbstractC4156x.e("ExoPlayerAssetLoader", "Releasing the player timed out.", abstractC2339H);
            } else {
                this.f65576a.d(C6427w0.a(abstractC2339H, ((Integer) AbstractC4134a.e((Integer) C6427w0.f65601d.getOrDefault(abstractC2339H.a(), 1000))).intValue()));
            }
        }

        @Override // b1.InterfaceC2341J.d
        public void d0(AbstractC2346O abstractC2346O, int i10) {
            int i11;
            try {
                if (C6423u0.this.f65569e != 1) {
                    return;
                }
                AbstractC2346O.c cVar = new AbstractC2346O.c();
                abstractC2346O.n(0, cVar);
                if (cVar.f24387k) {
                    return;
                }
                long j10 = cVar.f24389m;
                C6423u0 c6423u0 = C6423u0.this;
                if (j10 > 0 && j10 != -9223372036854775807L) {
                    i11 = 2;
                    c6423u0.f65569e = i11;
                    this.f65576a.f(cVar.f24389m);
                }
                i11 = 3;
                c6423u0.f65569e = i11;
                this.f65576a.f(cVar.f24389m);
            } catch (RuntimeException e10) {
                this.f65576a.d(C6427w0.a(e10, 1000));
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        @Override // b1.InterfaceC2341J.d
        public void g0(b1.T t10) {
            try {
                ?? c10 = t10.c(1);
                int i10 = c10;
                if (t10.c(2)) {
                    i10 = c10 + 1;
                }
                C6423u0.i(t10);
                if (i10 > 0) {
                    this.f65576a.c(i10);
                    C6423u0.this.f65568d.play();
                    return;
                }
                String str = "The asset loader has no audio or video track to output.";
                if (k1.i(C6423u0.this.f65565a, C6423u0.this.f65566b.f65013a)) {
                    str = "The asset loader has no audio or video track to output. Try setting an image duration on input image MediaItems.";
                }
                this.f65576a.d(C6427w0.a(new IllegalStateException(str), 1001));
            } catch (RuntimeException e10) {
                this.f65576a.d(C6427w0.a(e10, 1000));
            }
        }
    }

    /* renamed from: t2.u0$d */
    public static final class d implements m1.m1 {

        /* renamed from: a, reason: collision with root package name */
        public final j1 f65578a = new j1();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65579b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65580c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f65581d;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC6399i.a f65582e;

        /* renamed from: f, reason: collision with root package name */
        public final int f65583f;

        /* renamed from: g, reason: collision with root package name */
        public final InterfaceC6383a.c f65584g;

        /* renamed from: h, reason: collision with root package name */
        public final LogSessionId f65585h;

        public d(boolean z10, boolean z11, boolean z12, InterfaceC6399i.a aVar, int i10, InterfaceC6383a.c cVar, LogSessionId logSessionId) {
            this.f65579b = z10;
            this.f65580c = z11;
            this.f65581d = z12;
            this.f65582e = aVar;
            this.f65583f = i10;
            this.f65584g = cVar;
            this.f65585h = logSessionId;
        }

        @Override // m1.m1
        public androidx.media3.exoplayer.p[] b(Handler handler, F1.O o10, InterfaceC5772y interfaceC5772y, C1.h hVar, InterfaceC6697b interfaceC6697b) {
            ArrayList arrayList = new ArrayList();
            if (!this.f65579b) {
                arrayList.add(new C6417r0(this.f65582e, this.f65578a, this.f65584g, this.f65585h));
            }
            if (!this.f65580c) {
                arrayList.add(new C6421t0(this.f65581d, this.f65582e, this.f65583f, this.f65578a, this.f65584g, this.f65585h));
            }
            return (androidx.media3.exoplayer.p[]) arrayList.toArray(new androidx.media3.exoplayer.p[0]);
        }
    }

    public static void i(b1.T t10) {
        for (int i10 = 0; i10 < t10.a().size(); i10++) {
            int d10 = ((T.a) t10.a().get(i10)).d();
            if (d10 != 1 && d10 != 2) {
                AbstractC4156x.i("ExoPlayerAssetLoader", "Unsupported track type: " + d10);
            }
        }
    }

    @Override // t2.InterfaceC6383a
    public int e(K0 k02) {
        if (this.f65569e == 2) {
            long duration = this.f65568d.getDuration();
            k02.f65093a = e1.Z.k1(Math.min(this.f65568d.getCurrentPosition(), duration), duration);
        }
        return this.f65569e;
    }

    @Override // t2.InterfaceC6383a
    public com.google.common.collect.B g() {
        B.a aVar = new B.a();
        String c10 = this.f65567c.c();
        if (c10 != null) {
            aVar.f(1, c10);
        }
        String d10 = this.f65567c.d();
        if (d10 != null) {
            aVar.f(2, d10);
        }
        return aVar.c();
    }

    @Override // t2.InterfaceC6383a
    public void release() {
        this.f65568d.release();
        this.f65569e = 0;
    }

    @Override // t2.InterfaceC6383a
    public void start() {
        this.f65568d.P(this.f65566b.f65013a);
        this.f65568d.g();
        this.f65569e = 1;
    }

    public C6423u0(Context context, E e10, D.a aVar, InterfaceC6399i.a aVar2, int i10, Looper looper, InterfaceC6383a.c cVar, InterfaceC4143j interfaceC4143j, F.a aVar3, LogSessionId logSessionId) {
        this.f65565a = context;
        this.f65566b = e10;
        C6395g c6395g = new C6395g(aVar2);
        this.f65567c = c6395g;
        androidx.media3.exoplayer.trackselection.F a10 = aVar3.a(context);
        ExoPlayer.b q10 = new ExoPlayer.b(context, new d(e10.f65014b, e10.f65015c, e10.f65016d, c6395g, i10, cVar, logSessionId)).o(aVar).p(a10).m(new e.b().b(50000, 50000, 100, 200).a()).n(looper).q(false);
        if (aVar2 instanceof C6424v) {
            q10.j(((C6424v) aVar2).o());
        }
        if (interfaceC4143j != InterfaceC4143j.f45530a) {
            q10.l(interfaceC4143j);
        }
        ExoPlayer i11 = q10.i();
        this.f65568d = i11;
        i11.p(new c(cVar));
        this.f65569e = 0;
    }
}
