package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.D;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.y;
import b1.AbstractC2346O;
import n1.G1;

/* loaded from: classes.dex */
public interface j {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final G1 f21342a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC2346O f21343b;

        /* renamed from: c, reason: collision with root package name */
        public final D.b f21344c;

        /* renamed from: d, reason: collision with root package name */
        public final long f21345d;

        /* renamed from: e, reason: collision with root package name */
        public final long f21346e;

        /* renamed from: f, reason: collision with root package name */
        public final float f21347f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f21348g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f21349h;

        /* renamed from: i, reason: collision with root package name */
        public final long f21350i;

        /* renamed from: j, reason: collision with root package name */
        public final long f21351j;

        public a(G1 g12, AbstractC2346O abstractC2346O, D.b bVar, long j10, long j11, float f10, boolean z10, boolean z11, long j12, long j13) {
            this.f21342a = g12;
            this.f21343b = abstractC2346O;
            this.f21344c = bVar;
            this.f21345d = j10;
            this.f21346e = j11;
            this.f21347f = f10;
            this.f21348g = z10;
            this.f21349h = z11;
            this.f21350i = j12;
            this.f21351j = j13;
        }
    }

    boolean a(a aVar);

    void b(G1 g12);

    void c(a aVar, m0 m0Var, y[] yVarArr);

    D1.b d();

    void e(G1 g12);

    boolean f(AbstractC2346O abstractC2346O, D.b bVar, long j10);

    boolean g(a aVar);

    long h(G1 g12);

    boolean i(G1 g12);

    void j(G1 g12);
}
