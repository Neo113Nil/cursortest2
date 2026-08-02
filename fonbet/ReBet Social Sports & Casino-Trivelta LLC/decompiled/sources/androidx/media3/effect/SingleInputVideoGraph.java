package androidx.media3.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.effect.SingleInputVideoGraph;
import b1.C2345N;
import b1.C2357k;
import b1.InterfaceC2360n;
import b1.U;
import b1.V;
import b1.W;
import b1.X;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.S;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class SingleInputVideoGraph implements X {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20646a;

    /* renamed from: b, reason: collision with root package name */
    public final W.b f20647b;

    /* renamed from: c, reason: collision with root package name */
    public final C2357k f20648c;

    /* renamed from: d, reason: collision with root package name */
    public final X.b f20649d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2360n f20650e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f20651f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20652g;

    /* renamed from: h, reason: collision with root package name */
    public W f20653h;

    /* renamed from: i, reason: collision with root package name */
    public C2345N f20654i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20656k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f20657l;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC3445z f20655j = AbstractC3445z.t();

    /* renamed from: m, reason: collision with root package name */
    public int f20658m = -1;

    public static final class Factory implements X.a {

        /* renamed from: a, reason: collision with root package name */
        public final W.b f20659a;

        public Factory(W.b bVar) {
            this.f20659a = bVar;
        }

        @Override // b1.X.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SingleInputVideoGraph a(Context context, C2357k c2357k, InterfaceC2360n interfaceC2360n, X.b bVar, Executor executor, long j10, boolean z10) {
            return new SingleInputVideoGraph(context, this.f20659a, c2357k, bVar, interfaceC2360n, executor, z10);
        }
    }

    public class a implements W.c {

        /* renamed from: a, reason: collision with root package name */
        public long f20660a;

        public a() {
        }

        @Override // b1.W.c
        public void a(final V v10) {
            SingleInputVideoGraph.this.f20651f.execute(new Runnable() { // from class: l1.O0
                @Override // java.lang.Runnable
                public final void run() {
                    SingleInputVideoGraph.this.f20649d.a(v10);
                }
            });
        }

        @Override // b1.W.c
        public void b(final long j10, final boolean z10) {
            if (j10 == 0) {
                SingleInputVideoGraph.this.f20657l = true;
            }
            this.f20660a = j10;
            SingleInputVideoGraph.this.f20651f.execute(new Runnable() { // from class: l1.S0
                @Override // java.lang.Runnable
                public final void run() {
                    SingleInputVideoGraph.this.f20649d.b(j10, z10);
                }
            });
        }

        @Override // b1.W.c
        public void c() {
            SingleInputVideoGraph.this.f20651f.execute(new Runnable() { // from class: l1.Q0
                @Override // java.lang.Runnable
                public final void run() {
                    SingleInputVideoGraph.this.f20649d.c(SingleInputVideoGraph.a.this.f20660a);
                }
            });
        }

        @Override // b1.W.c
        public void d(final int i10, final int i11) {
            SingleInputVideoGraph.this.f20651f.execute(new Runnable() { // from class: l1.R0
                @Override // java.lang.Runnable
                public final void run() {
                    SingleInputVideoGraph.this.f20649d.d(i10, i11);
                }
            });
        }

        @Override // b1.W.c
        public void e(final float f10) {
            SingleInputVideoGraph.this.f20651f.execute(new Runnable() { // from class: l1.P0
                @Override // java.lang.Runnable
                public final void run() {
                    SingleInputVideoGraph.this.f20649d.e(f10);
                }
            });
        }
    }

    public SingleInputVideoGraph(Context context, W.b bVar, C2357k c2357k, X.b bVar2, InterfaceC2360n interfaceC2360n, Executor executor, boolean z10) {
        this.f20646a = context;
        this.f20647b = bVar;
        this.f20648c = c2357k;
        this.f20649d = bVar2;
        this.f20650e = interfaceC2360n;
        this.f20651f = executor;
        this.f20652g = z10;
    }

    @Override // b1.X
    public void a(long j10) {
        AbstractC4134a.i(this.f20653h);
        this.f20653h.a(j10);
    }

    @Override // b1.X
    public boolean b(int i10) {
        AbstractC4134a.i(this.f20653h);
        return this.f20653h.j();
    }

    @Override // b1.X
    public void c(C2345N c2345n) {
        this.f20654i = c2345n;
        W w10 = this.f20653h;
        if (w10 != null) {
            w10.c(c2345n);
        }
    }

    @Override // b1.X
    public void d(int i10, int i11, androidx.media3.common.a aVar, List list, long j10) {
        AbstractC4134a.i(this.f20653h);
        this.f20653h.i(i11, aVar, new AbstractC3445z.a().k(list).k(this.f20655j).m(), j10);
    }

    @Override // b1.X
    public void e() {
        ((W) AbstractC4134a.i(this.f20653h)).e();
    }

    @Override // b1.X
    public void f(List list) {
        this.f20655j = AbstractC3445z.o(list);
    }

    @Override // b1.X
    public void flush() {
        AbstractC4134a.i(this.f20653h);
        this.f20653h.flush();
    }

    @Override // b1.X
    public Surface g(int i10) {
        AbstractC4134a.i(this.f20653h);
        return this.f20653h.d();
    }

    @Override // b1.X
    public boolean h() {
        return this.f20657l;
    }

    @Override // b1.X
    public int i(int i10) {
        AbstractC4134a.i(this.f20653h);
        return this.f20653h.k();
    }

    @Override // b1.X
    public void initialize() {
    }

    @Override // b1.X
    public void j(U u10) {
        AbstractC4134a.b(u10.equals(U.f24521a), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
    }

    @Override // b1.X
    public void k(int i10) {
        AbstractC4134a.i(Boolean.valueOf(this.f20653h == null && !this.f20656k));
        AbstractC4134a.h(this.f20658m == -1, "This VideoGraph supports only one input.");
        this.f20658m = i10;
        W a10 = this.f20647b.a(this.f20646a, this.f20650e, this.f20648c, this.f20652g, Ta.r.a(), new a());
        this.f20653h = a10;
        C2345N c2345n = this.f20654i;
        if (c2345n != null) {
            a10.c(c2345n);
        }
    }

    @Override // b1.X
    public void l(int i10) {
        AbstractC4134a.i(this.f20653h);
        this.f20653h.f();
    }

    @Override // b1.X
    public boolean m(int i10, Bitmap bitmap, S s10) {
        AbstractC4134a.i(this.f20653h);
        return this.f20653h.b(bitmap, s10);
    }

    @Override // b1.X
    public void release() {
        if (this.f20656k) {
            return;
        }
        W w10 = this.f20653h;
        if (w10 != null) {
            w10.release();
        }
        this.f20656k = true;
    }
}
