package f7;

import H7.f;
import H7.o;
import android.util.SparseArray;
import e7.InterfaceC4184b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4264b implements InterfaceC4184b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f46436e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Class f46437f = C4264b.class;

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.animated.impl.c f46438a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46439b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f46440c;

    /* renamed from: d, reason: collision with root package name */
    public H6.a f46441d;

    /* renamed from: f7.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H6.a b(H6.a aVar) {
            try {
                if (H6.a.isValid(aVar)) {
                    Intrinsics.checkNotNull(aVar);
                    if (aVar.z0() instanceof f) {
                        Object z02 = aVar.z0();
                        Intrinsics.checkNotNull(z02, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((f) z02).D();
                    }
                }
                H6.a.U(aVar);
                return null;
            } finally {
                H6.a.U(aVar);
            }
        }

        public final H6.a c(H6.a aVar) {
            f V10 = f.V(aVar, o.f4868d, 0);
            Intrinsics.checkNotNullExpressionValue(V10, "of(...)");
            return H6.a.D0(V10);
        }

        public a() {
        }
    }

    public C4264b(com.facebook.imagepipeline.animated.impl.c animatedFrameCache, boolean z10) {
        Intrinsics.checkNotNullParameter(animatedFrameCache, "animatedFrameCache");
        this.f46438a = animatedFrameCache;
        this.f46439b = z10;
        this.f46440c = new SparseArray();
    }

    @Override // e7.InterfaceC4184b
    public synchronized void a(int i10, H6.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        try {
            H6.a c10 = f46436e.c(bitmapReference);
            if (c10 == null) {
                H6.a.U(c10);
                return;
            }
            H6.a a10 = this.f46438a.a(i10, c10);
            if (H6.a.isValid(a10)) {
                H6.a.U((H6.a) this.f46440c.get(i10));
                this.f46440c.put(i10, a10);
                E6.a.z(f46437f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f46440c);
            }
            H6.a.U(c10);
        } catch (Throwable th2) {
            H6.a.U(null);
            throw th2;
        }
    }

    @Override // e7.InterfaceC4184b
    public synchronized void b(int i10, H6.a bitmapReference, int i11) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        f(i10);
        H6.a aVar = null;
        try {
            aVar = f46436e.c(bitmapReference);
            if (aVar != null) {
                H6.a.U(this.f46441d);
                this.f46441d = this.f46438a.a(i10, aVar);
            }
        } finally {
            H6.a.U(aVar);
        }
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a c(int i10) {
        return f46436e.b(H6.a.B(this.f46441d));
    }

    @Override // e7.InterfaceC4184b
    public synchronized void clear() {
        try {
            H6.a.U(this.f46441d);
            this.f46441d = null;
            int size = this.f46440c.size();
            for (int i10 = 0; i10 < size; i10++) {
                H6.a.U((H6.a) this.f46440c.valueAt(i10));
            }
            this.f46440c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // e7.InterfaceC4184b
    public synchronized boolean contains(int i10) {
        return this.f46438a.b(i10);
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a d(int i10, int i11, int i12) {
        if (!this.f46439b) {
            return null;
        }
        return f46436e.b(this.f46438a.d());
    }

    @Override // e7.InterfaceC4184b
    public synchronized H6.a e(int i10) {
        return f46436e.b(this.f46438a.c(i10));
    }

    public final synchronized void f(int i10) {
        H6.a aVar = (H6.a) this.f46440c.get(i10);
        if (aVar != null) {
            this.f46440c.delete(i10);
            H6.a.U(aVar);
            E6.a.z(f46437f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f46440c);
        }
    }
}
