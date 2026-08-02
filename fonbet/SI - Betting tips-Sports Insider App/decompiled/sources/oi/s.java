package oi;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends t {

    /* renamed from: d, reason: collision with root package name */
    public final f f21332d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21333e;

    public s(r0 r0Var, gh.d dVar, m mVar, f fVar, boolean z5) {
        super(r0Var, dVar, mVar);
        this.f21332d = fVar;
        this.f21333e = z5;
    }

    @Override // oi.t
    public final Object a(a0 a0Var, Object[] objArr) {
        d dVar = (d) this.f21332d.c(a0Var);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            if (!this.f21333e) {
                return z0.b(dVar, continuation);
            }
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return z0.c(dVar, continuation);
        } catch (LinkageError e7) {
            throw e7;
        } catch (ThreadDeath e9) {
            throw e9;
        } catch (VirtualMachineError e10) {
            throw e10;
        } catch (Throwable th2) {
            z0.p(th2, continuation);
            return lf.a.f20034a;
        }
    }
}
