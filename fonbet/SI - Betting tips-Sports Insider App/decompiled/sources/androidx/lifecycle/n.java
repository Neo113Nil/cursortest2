package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2208b;

    public /* synthetic */ n(int i5, Object obj) {
        this.f2207a = i5;
        this.f2208b = obj;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f2207a) {
            case 0:
                Object h10 = ((gg.v) ((gg.w) this.f2208b)).f10105d.h(obj, continuation);
                if (h10 != lf.a.f20034a) {
                    break;
                }
                break;
            default:
                o0 o0Var = (o0) this.f2208b;
                Object A = eg.c0.A(o0Var.f2227b, new c(o0Var, obj, null, 2, false), continuation);
                lf.a aVar = lf.a.f20034a;
                if (A != aVar) {
                    A = Unit.f19194a;
                }
                if (A != aVar) {
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
