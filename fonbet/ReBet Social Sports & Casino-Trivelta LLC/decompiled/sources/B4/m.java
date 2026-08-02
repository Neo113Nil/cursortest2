package B4;

import java.util.Queue;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h f744a;

    public class a extends com.bumptech.glide.util.h {
        public a(long j10) {
            super(j10);
        }

        @Override // com.bumptech.glide.util.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final Queue f746d = com.bumptech.glide.util.l.g(0);

        /* renamed from: a, reason: collision with root package name */
        public int f747a;

        /* renamed from: b, reason: collision with root package name */
        public int f748b;

        /* renamed from: c, reason: collision with root package name */
        public Object f749c;

        public static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f746d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        public final void b(Object obj, int i10, int i11) {
            this.f749c = obj;
            this.f748b = i10;
            this.f747a = i11;
        }

        public void c() {
            Queue queue = f746d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f748b == bVar.f748b && this.f747a == bVar.f747a && this.f749c.equals(bVar.f749c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f747a * 31) + this.f748b) * 31) + this.f749c.hashCode();
        }
    }

    public m(long j10) {
        this.f744a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b a10 = b.a(obj, i10, i11);
        Object g10 = this.f744a.g(a10);
        a10.c();
        return g10;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f744a.k(b.a(obj, i10, i11), obj2);
    }
}
