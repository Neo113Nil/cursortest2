package androidx.media3.effect;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;
import androidx.media3.effect.r;
import b1.C2366u;
import b1.C2368w;
import b1.InterfaceC2367v;
import b1.V;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import e1.S;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import l1.AbstractC5352e;
import l1.AbstractC5366l;
import l1.N0;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: d, reason: collision with root package name */
    public final Queue f20671d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2367v f20672e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20673f;

    /* renamed from: g, reason: collision with root package name */
    public N0 f20674g;

    /* renamed from: h, reason: collision with root package name */
    public C2368w f20675h;

    /* renamed from: i, reason: collision with root package name */
    public int f20676i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f20677j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20678k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f20679a;

        /* renamed from: b, reason: collision with root package name */
        public final C2366u f20680b;

        /* renamed from: c, reason: collision with root package name */
        public final S f20681c;

        public a(Bitmap bitmap, C2366u c2366u, S s10) {
            this.f20679a = bitmap;
            this.f20680b = c2366u;
            this.f20681c = s10;
        }
    }

    public b(InterfaceC2367v interfaceC2367v, r rVar, boolean z10) {
        super(rVar);
        this.f20672e = interfaceC2367v;
        this.f20671d = new LinkedBlockingQueue();
        this.f20673f = z10;
    }

    public static /* synthetic */ void r(b bVar) {
        C2368w c2368w = bVar.f20675h;
        if (c2368w != null) {
            c2368w.a();
        }
        bVar.f20671d.clear();
    }

    public static /* synthetic */ void s(b bVar) {
        bVar.f20676i++;
        bVar.v();
    }

    public static /* synthetic */ void t(b bVar, Bitmap bitmap, C2366u c2366u, S s10) {
        bVar.w(bitmap, c2366u, s10);
        bVar.f20677j = false;
    }

    public static /* synthetic */ void u(b bVar) {
        if (!bVar.f20671d.isEmpty()) {
            bVar.f20677j = true;
        } else {
            ((N0) AbstractC4134a.e(bVar.f20674g)).g();
            AbstractC5366l.e("BitmapTextureManager", "SignalEOS", Long.MIN_VALUE);
        }
    }

    @Override // androidx.media3.effect.p
    public void d() {
        this.f20671d.clear();
        this.f20678k = false;
        this.f20677j = false;
        this.f20676i = 0;
        C2368w c2368w = this.f20675h;
        if (c2368w != null) {
            try {
                c2368w.a();
                this.f20675h = null;
            } catch (AbstractC4151s.a e10) {
                throw V.a(e10);
            }
        }
        super.d();
    }

    @Override // androidx.media3.effect.i.b
    public void e() {
        this.f20844a.j(new r.b() { // from class: l1.g
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.b.s(androidx.media3.effect.b.this);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public int g() {
        return 0;
    }

    @Override // androidx.media3.effect.p
    public void h(final Bitmap bitmap, final C2366u c2366u, final S s10) {
        this.f20844a.j(new r.b() { // from class: l1.i
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.b.t(androidx.media3.effect.b.this, bitmap, c2366u, s10);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void k() {
        this.f20844a.j(new r.b() { // from class: l1.h
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.b.r(androidx.media3.effect.b.this);
            }
        });
    }

    @Override // androidx.media3.effect.p
    public void p(i iVar) {
        AbstractC4134a.g(iVar instanceof N0);
        this.f20676i = 0;
        this.f20674g = (N0) iVar;
    }

    @Override // androidx.media3.effect.p
    public void q() {
        this.f20844a.j(new r.b() { // from class: l1.f
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.b.u(androidx.media3.effect.b.this);
            }
        });
    }

    public final void v() {
        if (this.f20671d.isEmpty() || this.f20676i == 0) {
            return;
        }
        a aVar = (a) this.f20671d.element();
        C2366u c2366u = aVar.f20680b;
        S s10 = aVar.f20681c;
        AbstractC4134a.g(aVar.f20681c.hasNext());
        long next = aVar.f20680b.f24633b + s10.next();
        if (!this.f20678k) {
            this.f20678k = true;
            x(c2366u, aVar.f20679a);
        }
        this.f20676i--;
        ((N0) AbstractC4134a.e(this.f20674g)).c(this.f20672e, (C2368w) AbstractC4134a.e(this.f20675h), next);
        AbstractC5366l.f("VideoFrameProcessor", "QueueBitmap", next, "%dx%d", Integer.valueOf(c2366u.f24632a.f20550v), Integer.valueOf(c2366u.f24632a.f20551w));
        if (aVar.f20681c.hasNext()) {
            return;
        }
        this.f20678k = false;
        ((a) this.f20671d.remove()).f20679a.recycle();
        if (this.f20671d.isEmpty() && this.f20677j) {
            ((N0) AbstractC4134a.e(this.f20674g)).g();
            AbstractC5366l.e("BitmapTextureManager", "SignalEOS", Long.MIN_VALUE);
            this.f20677j = false;
        }
    }

    public final void w(Bitmap bitmap, C2366u c2366u, S s10) {
        AbstractC4134a.b(s10.hasNext(), "Bitmap queued but no timestamps provided.");
        this.f20671d.add(new a(bitmap, c2366u, s10));
        v();
    }

    public final void x(C2366u c2366u, Bitmap bitmap) {
        boolean hasGainmap;
        Gainmap gainmap;
        try {
            C2368w c2368w = this.f20675h;
            if (c2368w != null) {
                c2368w.a();
            }
            int s10 = AbstractC4151s.s(bitmap);
            androidx.media3.common.a aVar = c2366u.f24632a;
            this.f20675h = new C2368w(s10, -1, -1, aVar.f20550v, aVar.f20551w);
            if (Build.VERSION.SDK_INT >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    N0 n02 = (N0) AbstractC4134a.e(this.f20674g);
                    gainmap = bitmap.getGainmap();
                    n02.h(AbstractC5352e.a(AbstractC4134a.e(gainmap)));
                }
            }
            if (this.f20673f) {
                ((N0) AbstractC4134a.e(this.f20674g)).a();
            }
        } catch (AbstractC4151s.a e10) {
            throw V.a(e10);
        }
    }
}
