package gg;

import eg.f2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f10056a = new d(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return kotlin.Unit.f19194a;
     */
    @Override // vf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        mg.f fVar = (mg.f) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f10064b;
        hVar.getClass();
        p pVar2 = (p) h.f10069g.get(hVar);
        while (true) {
            if (hVar.w()) {
                ((mg.e) fVar).f20728e = j.f10084l;
                break;
            }
            long andIncrement = h.f10065c.getAndIncrement(hVar);
            long j = j.f10075b;
            long j6 = andIncrement / j;
            int i5 = (int) (andIncrement % j);
            if (pVar2.f18527c != j6) {
                p p10 = hVar.p(j6, pVar2);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar2;
            }
            Object H = hVar.H(pVar, i5, andIncrement, fVar);
            p pVar3 = pVar;
            if (H == j.f10085m) {
                f2 f2Var = fVar instanceof f2 ? (f2) fVar : null;
                if (f2Var != null) {
                    f2Var.b(pVar3, i5);
                }
            } else if (H == j.f10087o) {
                if (andIncrement < hVar.t()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else {
                if (H == j.f10086n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.b();
                ((mg.e) fVar).f20728e = H;
            }
        }
    }
}
