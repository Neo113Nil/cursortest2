package g6;

import V5.k;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l6.AbstractC7878a;
import m6.AbstractC8090c;
import p6.l;

/* loaded from: classes8.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final R5.e f63898a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f63899b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f63900c;

    /* renamed from: d, reason: collision with root package name */
    final n f63901d;

    /* renamed from: e, reason: collision with root package name */
    private final W5.d f63902e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f63903f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f63904g;

    /* renamed from: h, reason: collision with root package name */
    private m<Bitmap> f63905h;

    /* renamed from: i, reason: collision with root package name */
    private a f63906i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f63907j;

    /* renamed from: k, reason: collision with root package name */
    private a f63908k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f63909l;

    /* renamed from: m, reason: collision with root package name */
    private T5.m<Bitmap> f63910m;

    /* renamed from: n, reason: collision with root package name */
    private a f63911n;

    /* renamed from: o, reason: collision with root package name */
    private int f63912o;

    /* renamed from: p, reason: collision with root package name */
    private int f63913p;

    /* renamed from: q, reason: collision with root package name */
    private int f63914q;

    static class a extends AbstractC8090c<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f63915a;

        /* renamed from: b, reason: collision with root package name */
        final int f63916b;

        /* renamed from: c, reason: collision with root package name */
        private final long f63917c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f63918d;

        a(Handler handler, int i11, long j11) {
            this.f63915a = handler;
            this.f63916b = i11;
            this.f63917c = j11;
        }

        final Bitmap a() {
            return this.f63918d;
        }

        @Override // m6.h
        public final void onLoadCleared(Drawable drawable) {
            this.f63918d = null;
        }

        @Override // m6.h
        public final void onResourceReady(@NonNull Object obj, n6.c cVar) {
            this.f63918d = (Bitmap) obj;
            Handler handler = this.f63915a;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f63917c);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            g gVar = g.this;
            if (i11 == 1) {
                gVar.k((a) message.obj);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            gVar.f63901d.clear((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.c cVar, R5.e eVar, int i11, int i12, b6.j jVar, Bitmap bitmap) {
        W5.d c11 = cVar.c();
        n n11 = com.bumptech.glide.c.n(cVar.e());
        m<Bitmap> apply = com.bumptech.glide.c.n(cVar.e()).asBitmap().apply((AbstractC7878a<?>) l6.i.diskCacheStrategyOf(k.f28204a).useAnimationPool(true).skipMemoryCache(true).override(i11, i12));
        this.f63900c = new ArrayList();
        this.f63901d = n11;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f63902e = c11;
        this.f63899b = handler;
        this.f63905h = apply;
        this.f63898a = eVar;
        l(jVar, bitmap);
    }

    private void j() {
        if (!this.f63903f || this.f63904g) {
            return;
        }
        a aVar = this.f63911n;
        if (aVar != null) {
            this.f63911n = null;
            k(aVar);
            return;
        }
        this.f63904g = true;
        R5.e eVar = this.f63898a;
        long uptimeMillis = SystemClock.uptimeMillis() + eVar.i();
        eVar.b();
        this.f63908k = new a(this.f63899b, eVar.e(), uptimeMillis);
        this.f63905h.apply((AbstractC7878a<?>) l6.i.signatureOf(new o6.d(Double.valueOf(Math.random())))).load(eVar).into((m<Bitmap>) this.f63908k);
    }

    final void a() {
        this.f63900c.clear();
        Bitmap bitmap = this.f63909l;
        if (bitmap != null) {
            this.f63902e.c(bitmap);
            this.f63909l = null;
        }
        this.f63903f = false;
        a aVar = this.f63906i;
        n nVar = this.f63901d;
        if (aVar != null) {
            nVar.clear(aVar);
            this.f63906i = null;
        }
        a aVar2 = this.f63908k;
        if (aVar2 != null) {
            nVar.clear(aVar2);
            this.f63908k = null;
        }
        a aVar3 = this.f63911n;
        if (aVar3 != null) {
            nVar.clear(aVar3);
            this.f63911n = null;
        }
        this.f63898a.c();
        this.f63907j = true;
    }

    final ByteBuffer b() {
        return this.f63898a.f().asReadOnlyBuffer();
    }

    final Bitmap c() {
        a aVar = this.f63906i;
        return aVar != null ? aVar.a() : this.f63909l;
    }

    final int d() {
        a aVar = this.f63906i;
        if (aVar != null) {
            return aVar.f63916b;
        }
        return -1;
    }

    final Bitmap e() {
        return this.f63909l;
    }

    final int f() {
        return this.f63898a.g();
    }

    final int g() {
        return this.f63914q;
    }

    final int h() {
        return this.f63898a.d() + this.f63912o;
    }

    final int i() {
        return this.f63913p;
    }

    final void k(a aVar) {
        this.f63904g = false;
        boolean z11 = this.f63907j;
        Handler handler = this.f63899b;
        if (z11) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f63903f) {
            this.f63911n = aVar;
            return;
        }
        if (aVar.a() != null) {
            Bitmap bitmap = this.f63909l;
            if (bitmap != null) {
                this.f63902e.c(bitmap);
                this.f63909l = null;
            }
            a aVar2 = this.f63906i;
            this.f63906i = aVar;
            ArrayList arrayList = this.f63900c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        j();
    }

    final void l(T5.m<Bitmap> mVar, Bitmap bitmap) {
        p6.k.c(mVar, "Argument must not be null");
        this.f63910m = mVar;
        p6.k.c(bitmap, "Argument must not be null");
        this.f63909l = bitmap;
        this.f63905h = this.f63905h.apply((AbstractC7878a<?>) new l6.i().transform(mVar));
        this.f63912o = l.c(bitmap);
        this.f63913p = bitmap.getWidth();
        this.f63914q = bitmap.getHeight();
    }

    final void m(g6.c cVar) {
        if (this.f63907j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.f63900c;
        if (arrayList.contains(cVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(cVar);
        if (!isEmpty || this.f63903f) {
            return;
        }
        this.f63903f = true;
        this.f63907j = false;
        j();
    }

    final void n(g6.c cVar) {
        ArrayList arrayList = this.f63900c;
        arrayList.remove(cVar);
        if (arrayList.isEmpty()) {
            this.f63903f = false;
        }
    }
}
