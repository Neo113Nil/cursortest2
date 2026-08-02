package v;

import androidx.concurrent.futures.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import v.X;

/* renamed from: v.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10133s0 implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f101369c;

    public /* synthetic */ C10133s0(int i11, Object obj, Object obj2) {
        this.f101367a = i11;
        this.f101368b = obj;
        this.f101369c = obj2;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object c(final b.a aVar) {
        switch (this.f101367a) {
            case 0:
                final X.g gVar = (X.g) this.f101368b;
                gVar.getClass();
                ScheduledExecutorService e11 = H.c.e();
                final AtomicReference atomicReference = (AtomicReference) this.f101369c;
                e11.execute(new Runnable() { // from class: v.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        X.g.d(X.g.this, atomicReference, aVar);
                    }
                });
                return "OnScreenFlashStart";
            default:
                a2.c((C.v0) this.f101369c, aVar, (a2) this.f101368b);
                return "setLinearZoom";
        }
    }
}
