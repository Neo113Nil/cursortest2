package lh;

import f0.AbstractC4221b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kh.AbstractC5255a;
import kh.AbstractC5257c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5589e;
import mh.f;
import org.jetbrains.annotations.NotNull;

/* renamed from: lh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5466a extends AbstractC5255a {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f55860k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55861l;

    /* renamed from: n, reason: collision with root package name */
    public static final f f55863n;

    /* renamed from: o, reason: collision with root package name */
    public static final C5466a f55864o;

    /* renamed from: p, reason: collision with root package name */
    public static final f f55865p;

    /* renamed from: q, reason: collision with root package name */
    public static final f f55866q;

    /* renamed from: h, reason: collision with root package name */
    public final f f55867h;

    /* renamed from: i, reason: collision with root package name */
    public C5466a f55868i;

    @NotNull
    private volatile /* synthetic */ Object nextRef;

    @NotNull
    private volatile /* synthetic */ int refCount;

    /* renamed from: j, reason: collision with root package name */
    public static final e f55859j = new e(null);

    /* renamed from: m, reason: collision with root package name */
    public static final f f55862m = new d();

    /* renamed from: lh.a$b */
    public static final class b extends AbstractC5589e {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // mh.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5466a V0() {
            return new C5466a(ih.b.f49148a.b(4096), null, this, 0 == true ? 1 : 0);
        }

        @Override // mh.AbstractC5589e, mh.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void O1(C5466a instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            ih.b.f49148a.a(instance.g());
        }
    }

    /* renamed from: lh.a$c */
    public static final class c extends AbstractC5589e {
        @Override // mh.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5466a V0() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        @Override // mh.AbstractC5589e, mh.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void O1(C5466a instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
        }
    }

    /* renamed from: lh.a$d */
    public static final class d implements f {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f.a.a(this);
        }

        @Override // mh.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5466a V0() {
            return (C5466a) AbstractC5257c.a().V0();
        }

        @Override // mh.f
        public void dispose() {
            AbstractC5257c.a().dispose();
        }

        @Override // mh.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void O1(C5466a instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            AbstractC5257c.a().O1(instance);
        }
    }

    /* renamed from: lh.a$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5466a a() {
            return C5466a.f55864o;
        }

        public final f b() {
            return C5466a.f55863n;
        }

        public final f c() {
            return C5466a.f55862m;
        }

        public e() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C0805a c0805a = new C0805a();
        f55863n = c0805a;
        f55864o = new C5466a(ih.c.f49149a.a(), 0 == true ? 1 : 0, c0805a, 0 == true ? 1 : 0);
        f55865p = new b();
        f55866q = new c();
        f55860k = AtomicReferenceFieldUpdater.newUpdater(C5466a.class, Object.class, "nextRef");
        f55861l = AtomicIntegerFieldUpdater.newUpdater(C5466a.class, "refCount");
    }

    public /* synthetic */ C5466a(ByteBuffer byteBuffer, C5466a c5466a, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, c5466a, fVar);
    }

    public final int A() {
        return this.refCount;
    }

    public void B(f pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        if (C()) {
            C5466a c5466a = this.f55868i;
            if (c5466a != null) {
                E();
                c5466a.B(pool);
            } else {
                f fVar = this.f55867h;
                if (fVar != null) {
                    pool = fVar;
                }
                pool.O1(this);
            }
        }
    }

    public final boolean C() {
        int i10;
        int i11;
        do {
            i10 = this.refCount;
            if (i10 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i11 = i10 - 1;
        } while (!f55861l.compareAndSet(this, i10, i11));
        return i11 == 0;
    }

    public final void D(C5466a c5466a) {
        if (c5466a == null) {
            x();
        } else {
            w(c5466a);
        }
    }

    public final void E() {
        if (!f55861l.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        x();
        this.f55868i = null;
    }

    public final void F() {
        int i10;
        do {
            i10 = this.refCount;
            if (i10 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i10 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f55861l.compareAndSet(this, i10, 1));
    }

    @Override // kh.AbstractC5255a
    public final void q() {
        if (this.f55868i != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.q();
        this.nextRef = null;
    }

    public final void w(C5466a c5466a) {
        if (!AbstractC4221b.a(f55860k, this, null, c5466a)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public final C5466a x() {
        return (C5466a) f55860k.getAndSet(this, null);
    }

    public final C5466a y() {
        return (C5466a) this.nextRef;
    }

    public final C5466a z() {
        return this.f55868i;
    }

    public C5466a(ByteBuffer byteBuffer, C5466a c5466a, f fVar) {
        super(byteBuffer, null);
        this.f55867h = fVar;
        if (c5466a == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.f55868i = c5466a;
    }

    /* renamed from: lh.a$a, reason: collision with other inner class name */
    public static final class C0805a implements f {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            f.a.a(this);
        }

        @Override // mh.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C5466a V0() {
            return C5466a.f55859j.a();
        }

        @Override // mh.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void O1(C5466a instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (instance != C5466a.f55859j.a()) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // mh.f
        public void dispose() {
        }
    }
}
