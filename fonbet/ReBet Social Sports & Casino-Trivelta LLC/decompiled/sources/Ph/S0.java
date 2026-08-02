package Ph;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes5.dex */
public final class S0 extends H0 {

    /* renamed from: e, reason: collision with root package name */
    public final C1469p f9052e;

    public S0(C1469p c1469p) {
        this.f9052e = c1469p;
    }

    @Override // Ph.H0
    public boolean u() {
        return false;
    }

    @Override // Ph.H0
    public void v(Throwable th2) {
        Object V10 = t().V();
        if (V10 instanceof C) {
            C1469p c1469p = this.f9052e;
            Result.Companion companion = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(((C) V10).f9000a)));
        } else {
            C1469p c1469p2 = this.f9052e;
            Result.Companion companion2 = Result.INSTANCE;
            c1469p2.resumeWith(Result.m147constructorimpl(J0.h(V10)));
        }
    }
}
