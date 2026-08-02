package oi;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r extends t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21320d;

    /* renamed from: e, reason: collision with root package name */
    public final f f21321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(r0 r0Var, gh.d dVar, m mVar, f fVar, int i5) {
        super(r0Var, dVar, mVar);
        this.f21320d = i5;
        this.f21321e = fVar;
    }

    @Override // oi.t
    public final Object a(a0 a0Var, Object[] objArr) {
        switch (this.f21320d) {
            case 0:
                return this.f21321e.c(a0Var);
            default:
                d dVar = (d) this.f21321e.c(a0Var);
                Continuation frame = (Continuation) objArr[objArr.length - 1];
                try {
                    eg.l lVar = new eg.l(1, lf.d.b(frame));
                    lVar.s();
                    lVar.u(new v(dVar, 2));
                    dVar.o0(new w(lVar, 2));
                    Object r5 = lVar.r();
                    if (r5 != lf.a.f20034a) {
                        return r5;
                    }
                    Intrinsics.checkNotNullParameter(frame, "frame");
                    return r5;
                } catch (Exception e7) {
                    z0.p(e7, frame);
                    return lf.a.f20034a;
                }
        }
    }
}
