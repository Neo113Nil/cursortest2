package androidx.lifecycle;

import Ph.C0;
import androidx.lifecycle.AbstractC2185j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2187l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2185j f20398a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2185j.b f20399b;

    /* renamed from: c, reason: collision with root package name */
    public final C2181f f20400c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2191p f20401d;

    public C2187l(AbstractC2185j lifecycle, AbstractC2185j.b minState, C2181f dispatchQueue, final C0 parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f20398a = lifecycle;
        this.f20399b = minState;
        this.f20400c = dispatchQueue;
        InterfaceC2191p interfaceC2191p = new InterfaceC2191p() { // from class: androidx.lifecycle.k
            @Override // androidx.lifecycle.InterfaceC2191p
            public final void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
                C2187l.c(C2187l.this, parentJob, interfaceC2193s, aVar);
            }
        };
        this.f20401d = interfaceC2191p;
        if (lifecycle.b() != AbstractC2185j.b.f20390a) {
            lifecycle.a(interfaceC2191p);
        } else {
            C0.a.b(parentJob, null, 1, null);
            b();
        }
    }

    public static final void c(C2187l c2187l, C0 c02, InterfaceC2193s source, AbstractC2185j.a aVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        if (source.getLifecycle().b() == AbstractC2185j.b.f20390a) {
            C0.a.b(c02, null, 1, null);
            c2187l.b();
        } else if (source.getLifecycle().b().compareTo(c2187l.f20399b) < 0) {
            c2187l.f20400c.h();
        } else {
            c2187l.f20400c.i();
        }
    }

    public final void b() {
        this.f20398a.d(this.f20401d);
        this.f20400c.g();
    }
}
