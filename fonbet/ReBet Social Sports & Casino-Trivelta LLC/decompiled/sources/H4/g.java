package H4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.load.n;
import com.bumptech.glide.m;
import com.bumptech.glide.util.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.gifdecoder.a f4770a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4771b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4772c;

    /* renamed from: d, reason: collision with root package name */
    public final m f4773d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f4774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4775f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4776g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4777h;

    /* renamed from: i, reason: collision with root package name */
    public l f4778i;

    /* renamed from: j, reason: collision with root package name */
    public a f4779j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4780k;

    /* renamed from: l, reason: collision with root package name */
    public a f4781l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f4782m;

    /* renamed from: n, reason: collision with root package name */
    public n f4783n;

    /* renamed from: o, reason: collision with root package name */
    public a f4784o;

    /* renamed from: p, reason: collision with root package name */
    public int f4785p;

    /* renamed from: q, reason: collision with root package name */
    public int f4786q;

    /* renamed from: r, reason: collision with root package name */
    public int f4787r;

    public static class a extends M4.c {

        /* renamed from: d, reason: collision with root package name */
        public final Handler f4788d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4789e;

        /* renamed from: f, reason: collision with root package name */
        public final long f4790f;

        /* renamed from: g, reason: collision with root package name */
        public Bitmap f4791g;

        public a(Handler handler, int i10, long j10) {
            this.f4788d = handler;
            this.f4789e = i10;
            this.f4790f = j10;
        }

        public Bitmap f() {
            return this.f4791g;
        }

        @Override // M4.j
        public void j(Drawable drawable) {
            this.f4791g = null;
        }

        @Override // M4.j
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void m(Bitmap bitmap, N4.d dVar) {
            this.f4791g = bitmap;
            this.f4788d.sendMessageAtTime(this.f4788d.obtainMessage(1, this), this.f4790f);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f4773d.p((a) message.obj);
            return false;
        }
    }

    public g(com.bumptech.glide.c cVar, com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, n nVar, Bitmap bitmap) {
        this(cVar.g(), com.bumptech.glide.c.u(cVar.i()), aVar, null, i(com.bumptech.glide.c.u(cVar.i()), i10, i11), nVar, bitmap);
    }

    public static com.bumptech.glide.load.g g() {
        return new O4.c(Double.valueOf(Math.random()));
    }

    public static l i(m mVar, int i10, int i11) {
        return mVar.k().a(((L4.h) ((L4.h) L4.h.k0(com.bumptech.glide.load.engine.j.f29824b).i0(true)).c0(true)).T(i10, i11));
    }

    public void a() {
        this.f4772c.clear();
        n();
        q();
        a aVar = this.f4779j;
        if (aVar != null) {
            this.f4773d.p(aVar);
            this.f4779j = null;
        }
        a aVar2 = this.f4781l;
        if (aVar2 != null) {
            this.f4773d.p(aVar2);
            this.f4781l = null;
        }
        a aVar3 = this.f4784o;
        if (aVar3 != null) {
            this.f4773d.p(aVar3);
            this.f4784o = null;
        }
        this.f4770a.clear();
        this.f4780k = true;
    }

    public ByteBuffer b() {
        return this.f4770a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.f4779j;
        return aVar != null ? aVar.f() : this.f4782m;
    }

    public int d() {
        a aVar = this.f4779j;
        if (aVar != null) {
            return aVar.f4789e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.f4782m;
    }

    public int f() {
        return this.f4770a.a();
    }

    public int h() {
        return this.f4787r;
    }

    public int j() {
        return this.f4770a.g() + this.f4785p;
    }

    public int k() {
        return this.f4786q;
    }

    public final void l() {
        if (!this.f4775f || this.f4776g) {
            return;
        }
        if (this.f4777h) {
            k.a(this.f4784o == null, "Pending target must be null when starting from the first frame");
            this.f4770a.e();
            this.f4777h = false;
        }
        a aVar = this.f4784o;
        if (aVar != null) {
            this.f4784o = null;
            m(aVar);
            return;
        }
        this.f4776g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f4770a.d();
        this.f4770a.advance();
        this.f4781l = new a(this.f4771b, this.f4770a.f(), uptimeMillis);
        this.f4778i.a(L4.h.n0(g())).A0(this.f4770a).u0(this.f4781l);
    }

    public void m(a aVar) {
        this.f4776g = false;
        if (this.f4780k) {
            this.f4771b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f4775f) {
            if (this.f4777h) {
                this.f4771b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f4784o = aVar;
                return;
            }
        }
        if (aVar.f() != null) {
            n();
            a aVar2 = this.f4779j;
            this.f4779j = aVar;
            for (int size = this.f4772c.size() - 1; size >= 0; size--) {
                ((b) this.f4772c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f4771b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    public final void n() {
        Bitmap bitmap = this.f4782m;
        if (bitmap != null) {
            this.f4774e.c(bitmap);
            this.f4782m = null;
        }
    }

    public void o(n nVar, Bitmap bitmap) {
        this.f4783n = (n) k.d(nVar);
        this.f4782m = (Bitmap) k.d(bitmap);
        this.f4778i = this.f4778i.a(new L4.h().d0(nVar));
        this.f4785p = com.bumptech.glide.util.l.i(bitmap);
        this.f4786q = bitmap.getWidth();
        this.f4787r = bitmap.getHeight();
    }

    public final void p() {
        if (this.f4775f) {
            return;
        }
        this.f4775f = true;
        this.f4780k = false;
        l();
    }

    public final void q() {
        this.f4775f = false;
    }

    public void r(b bVar) {
        if (this.f4780k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f4772c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f4772c.isEmpty();
        this.f4772c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    public void s(b bVar) {
        this.f4772c.remove(bVar);
        if (this.f4772c.isEmpty()) {
            q();
        }
    }

    public g(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, m mVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, l lVar, n nVar, Bitmap bitmap) {
        this.f4772c = new ArrayList();
        this.f4773d = mVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f4774e = dVar;
        this.f4771b = handler;
        this.f4778i = lVar;
        this.f4770a = aVar;
        o(nVar, bitmap);
    }
}
