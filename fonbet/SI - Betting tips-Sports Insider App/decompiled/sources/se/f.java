package se;

import eg.z;
import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23527b;

    /* renamed from: c, reason: collision with root package name */
    public int f23528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f23529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f23527b = i10;
        this.f23529d = pVar;
        this.f23530e = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23527b) {
            case 0:
                return new f(this.f23529d, this.f23530e, continuation, 0);
            case 1:
                return new f(this.f23529d, this.f23530e, continuation, 1);
            default:
                return new f(this.f23529d, this.f23530e, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23527b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23527b) {
            case 0:
                p pVar = this.f23529d;
                d1 d1Var = pVar.H;
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f23528c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    ic.g gVar = (ic.g) d1Var.getValue();
                    if (gVar == null) {
                        return Unit.f19194a;
                    }
                    wc.i iVar = pVar.A;
                    ic.c cVar = (ic.c) gVar;
                    ic.b bVar = cVar.f11085a;
                    ic.b bVar2 = cVar.f11086b;
                    Integer num = cVar.f11088d;
                    this.f23528c = 1;
                    iVar.getClass();
                    obj = wc.i.d(bVar, bVar2, this.f23530e, num, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                d1Var.j((ic.g) obj);
                return Unit.f19194a;
            case 1:
                p pVar2 = this.f23529d;
                d1 d1Var2 = pVar2.G;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f23528c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    ic.g gVar2 = (ic.g) d1Var2.getValue();
                    if (gVar2 == null) {
                        return Unit.f19194a;
                    }
                    wc.i iVar2 = pVar2.A;
                    ic.c cVar2 = (ic.c) gVar2;
                    ic.b bVar3 = cVar2.f11085a;
                    ic.b bVar4 = cVar2.f11086b;
                    Integer num2 = cVar2.f11088d;
                    this.f23528c = 1;
                    iVar2.getClass();
                    obj = wc.i.d(bVar3, bVar4, this.f23530e, num2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                d1Var2.j((ic.g) obj);
                return Unit.f19194a;
            default:
                p pVar3 = this.f23529d;
                d1 d1Var3 = pVar3.F;
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f23528c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    ic.g gVar3 = (ic.g) d1Var3.getValue();
                    if (gVar3 == null) {
                        return Unit.f19194a;
                    }
                    wc.i iVar3 = pVar3.A;
                    ic.c cVar3 = (ic.c) gVar3;
                    ic.b bVar5 = cVar3.f11085a;
                    ic.b bVar6 = cVar3.f11086b;
                    Integer num3 = cVar3.f11088d;
                    this.f23528c = 1;
                    iVar3.getClass();
                    obj = wc.i.d(bVar5, bVar6, this.f23530e, num3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                d1Var3.j((ic.g) obj);
                return Unit.f19194a;
        }
    }
}
