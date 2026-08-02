package eb;

import eg.z;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.d f8832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc.f f8833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(y8.d dVar, nc.f fVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8831b = i5;
        this.f8832c = dVar;
        this.f8833d = fVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8831b) {
            case 0:
                return new n(this.f8832c, this.f8833d, continuation, 0);
            case 1:
                return new n(this.f8832c, this.f8833d, continuation, 1);
            case 2:
                return new n(this.f8832c, this.f8833d, continuation, 2);
            case 3:
                return new n(this.f8832c, this.f8833d, continuation, 3);
            case 4:
                return new n(this.f8832c, this.f8833d, continuation, 4);
            case 5:
                return new n(this.f8832c, this.f8833d, continuation, 5);
            default:
                return new n(this.f8832c, this.f8833d, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8831b) {
        }
        return ((n) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f8831b;
        nc.f fVar = this.f8833d;
        y8.d dVar = this.f8832c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                m d10 = y8.d.d(dVar);
                d10.getClass();
                if (fVar != null) {
                    String[] id2 = {fVar.getStandardPrice(), fVar.getCurrentPrice()};
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Iterator it = kotlin.collections.p.q(id2).iterator();
                    while (it.hasNext()) {
                        d10.f(3, 2, (String) it.next());
                    }
                    if (fVar.getStandardPrice() != null) {
                        d10.b(5, fVar);
                    }
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                m d11 = y8.d.d(dVar);
                d11.getClass();
                if (fVar != null) {
                    String[] id3 = {fVar.getStandardPrice(), fVar.getCurrentPrice()};
                    Intrinsics.checkNotNullParameter(id3, "id");
                    Iterator it2 = kotlin.collections.p.q(id3).iterator();
                    while (it2.hasNext()) {
                        d11.f(2, 2, (String) it2.next());
                    }
                    if (fVar.getStandardPrice() != null) {
                        d11.b(4, fVar);
                    }
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                m d12 = y8.d.d(dVar);
                d12.getClass();
                if (fVar != null) {
                    String[] id4 = {fVar.getStandardPrice(), fVar.getCurrentPrice()};
                    Intrinsics.checkNotNullParameter(id4, "id");
                    Iterator it3 = kotlin.collections.p.q(id4).iterator();
                    while (it3.hasNext()) {
                        d12.f(2, 0, (String) it3.next());
                    }
                    if (fVar.getStandardPrice() != null) {
                        d12.b(2, fVar);
                    }
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                m d13 = y8.d.d(dVar);
                d13.getClass();
                if (fVar != null) {
                    d13.g(fVar.getStandardPrice(), fVar.getCurrentPrice());
                    if (fVar.getStandardPrice() != null) {
                        d13.b(7, fVar);
                    }
                }
                break;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                m d14 = y8.d.d(dVar);
                d14.getClass();
                if (fVar != null) {
                    d14.g(fVar.getStandardPrice(), fVar.getCurrentPrice());
                    if (fVar.getStandardPrice() != null) {
                        d14.b(6, fVar);
                    }
                }
                break;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                m d15 = y8.d.d(dVar);
                d15.getClass();
                if (fVar != null) {
                    String[] id5 = {fVar.getStandardPrice(), fVar.getCurrentPrice()};
                    Intrinsics.checkNotNullParameter(id5, "id");
                    Iterator it4 = kotlin.collections.p.q(id5).iterator();
                    while (it4.hasNext()) {
                        d15.f(1, 2, (String) it4.next());
                    }
                    if (fVar.getStandardPrice() != null) {
                        d15.b(3, fVar);
                    }
                }
                break;
            default:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                m d16 = y8.d.d(dVar);
                d16.getClass();
                if (fVar != null) {
                    String[] id6 = {fVar.getStandardPrice(), fVar.getCurrentPrice()};
                    Intrinsics.checkNotNullParameter(id6, "id");
                    Iterator it5 = kotlin.collections.p.q(id6).iterator();
                    while (it5.hasNext()) {
                        d16.f(1, 0, (String) it5.next());
                    }
                    if (fVar.getStandardPrice() != null) {
                        d16.b(1, fVar);
                    }
                }
                break;
        }
        return Unit.f19194a;
    }
}
