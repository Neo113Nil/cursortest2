package hg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r0 implements eg.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f10751a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10753c;

    /* renamed from: d, reason: collision with root package name */
    public final eg.l f10754d;

    public r0(t0 t0Var, long j, Object obj, eg.l lVar) {
        this.f10751a = t0Var;
        this.f10752b = j;
        this.f10753c = obj;
        this.f10754d = lVar;
    }

    @Override // eg.o0
    public final void b() {
        t0 t0Var = this.f10751a;
        synchronized (t0Var) {
            if (this.f10752b < t0Var.p()) {
                return;
            }
            Object[] objArr = t0Var.f10770h;
            Intrinsics.checkNotNull(objArr);
            if (u0.c(objArr, this.f10752b) != this) {
                return;
            }
            u0.d(objArr, this.f10752b, u0.f10777a);
            t0Var.k();
            Unit unit = Unit.f19194a;
        }
    }
}
