package g7;

import android.graphics.Bitmap;
import android.util.SparseArray;
import d7.InterfaceC4012a;
import e7.InterfaceC4184b;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC6940d f47111a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.c f47112b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f47113c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f47114d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f47115e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f47116f;

    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4012a f47117a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4184b f47118b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47119c;

        /* renamed from: d, reason: collision with root package name */
        public final int f47120d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f47121e;

        public a(c cVar, InterfaceC4012a animationBackend, InterfaceC4184b bitmapFrameCache, int i10, int i11) {
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            this.f47121e = cVar;
            this.f47117a = animationBackend;
            this.f47118b = bitmapFrameCache;
            this.f47119c = i10;
            this.f47120d = i11;
        }

        public final boolean a(int i10, int i11) {
            H6.a d10;
            int i12 = 2;
            try {
                if (i11 == 1) {
                    d10 = this.f47118b.d(i10, this.f47117a.f(), this.f47117a.d());
                } else {
                    if (i11 != 2) {
                        return false;
                    }
                    d10 = this.f47121e.f47111a.b(this.f47117a.f(), this.f47117a.d(), this.f47121e.f47113c);
                    i12 = -1;
                }
                H6.a aVar = d10;
                boolean b10 = b(i10, aVar, i11);
                H6.a.U(aVar);
                return (b10 || i12 == -1) ? b10 : a(i10, i12);
            } catch (RuntimeException e10) {
                E6.a.H(this.f47121e.f47115e, "Failed to create frame bitmap", e10);
                return false;
            } finally {
                H6.a.U(null);
            }
        }

        public final boolean b(int i10, H6.a aVar, int i11) {
            if (H6.a.isValid(aVar) && aVar != null) {
                e7.c cVar = this.f47121e.f47112b;
                Object z02 = aVar.z0();
                Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
                if (cVar.a(i10, (Bitmap) z02)) {
                    E6.a.y(this.f47121e.f47115e, "Frame %d ready.", Integer.valueOf(i10));
                    synchronized (this.f47121e.f47116f) {
                        this.f47118b.a(i10, aVar, i11);
                        Unit unit = Unit.INSTANCE;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f47118b.contains(this.f47119c)) {
                    E6.a.y(this.f47121e.f47115e, "Frame %d is cached already.", Integer.valueOf(this.f47119c));
                    SparseArray sparseArray = this.f47121e.f47116f;
                    c cVar = this.f47121e;
                    synchronized (sparseArray) {
                        cVar.f47116f.remove(this.f47120d);
                        Unit unit = Unit.INSTANCE;
                    }
                    return;
                }
                if (a(this.f47119c, 1)) {
                    E6.a.y(this.f47121e.f47115e, "Prepared frame %d.", Integer.valueOf(this.f47119c));
                } else {
                    E6.a.k(this.f47121e.f47115e, "Could not prepare frame %d.", Integer.valueOf(this.f47119c));
                }
                SparseArray sparseArray2 = this.f47121e.f47116f;
                c cVar2 = this.f47121e;
                synchronized (sparseArray2) {
                    cVar2.f47116f.remove(this.f47120d);
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                SparseArray sparseArray3 = this.f47121e.f47116f;
                c cVar3 = this.f47121e;
                synchronized (sparseArray3) {
                    cVar3.f47116f.remove(this.f47120d);
                    Unit unit3 = Unit.INSTANCE;
                    throw th2;
                }
            }
        }
    }

    public c(AbstractC6940d platformBitmapFactory, e7.c bitmapFrameRenderer, Bitmap.Config bitmapConfig, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f47111a = platformBitmapFactory;
        this.f47112b = bitmapFrameRenderer;
        this.f47113c = bitmapConfig;
        this.f47114d = executorService;
        this.f47115e = c.class;
        this.f47116f = new SparseArray();
    }

    @Override // g7.b
    public boolean a(InterfaceC4184b bitmapFrameCache, InterfaceC4012a animationBackend, int i10) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        int g10 = g(animationBackend, i10);
        synchronized (this.f47116f) {
            try {
                try {
                    if (this.f47116f.get(g10) != null) {
                        E6.a.y(this.f47115e, "Already scheduled decode job for frame %d", Integer.valueOf(i10));
                        return true;
                    }
                    if (bitmapFrameCache.contains(i10)) {
                        E6.a.y(this.f47115e, "Frame %d is cached already.", Integer.valueOf(i10));
                        return true;
                    }
                    try {
                        a aVar = new a(this, animationBackend, bitmapFrameCache, i10, g10);
                        this.f47116f.put(g10, aVar);
                        this.f47114d.execute(aVar);
                        Unit unit = Unit.INSTANCE;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final int g(InterfaceC4012a interfaceC4012a, int i10) {
        return (interfaceC4012a.hashCode() * 31) + i10;
    }
}
