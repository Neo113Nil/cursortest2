package oe0;

import Sc.r;
import ag.InterfaceC5020b;
import android.location.Location;
import java.util.concurrent.atomic.AtomicBoolean;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class y implements ag.c<ag.f> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f78256a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f78257b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10737n f78258c;

    y(o oVar, AtomicBoolean atomicBoolean, C10737n c10737n) {
        this.f78256a = oVar;
        this.f78257b = atomicBoolean;
        this.f78258c = c10737n;
    }

    @Override // ag.c
    public final void a(ag.f fVar) {
        InterfaceC5020b interfaceC5020b;
        interfaceC5020b = this.f78256a.f78224d;
        ((ag.d) interfaceC5020b).a(this);
        if (this.f78257b.compareAndSet(false, true)) {
            Location b11 = fVar.b();
            C10737n c10737n = this.f78258c;
            if (b11 != null) {
                c10737n.resumeWith(Sc.r.a(b11));
            } else {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Sc.r.a(Sc.s.a(new dj.f())));
            }
        }
    }
}
