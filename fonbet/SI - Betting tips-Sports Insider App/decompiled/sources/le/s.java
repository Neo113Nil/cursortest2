package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19928b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.p0 f19929c;

    /* renamed from: d, reason: collision with root package name */
    public int f19930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f19931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f19932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.a f19933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(z zVar, ic.a aVar, ic.a aVar2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19928b = i5;
        this.f19931e = zVar;
        this.f19932f = aVar;
        this.f19933g = aVar2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19928b) {
            case 0:
                return new s(this.f19931e, this.f19932f, this.f19933g, continuation, 0);
            default:
                return new s(this.f19931e, this.f19932f, this.f19933g, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19928b) {
        }
        return ((s) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.p0 p0Var;
        androidx.lifecycle.p0 p0Var2;
        switch (this.f19928b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19930d;
                if (i5 == 0) {
                    h8.b.B(obj);
                    z zVar = this.f19931e;
                    ic.a aVar2 = this.f19932f;
                    zVar.f20020r = aVar2;
                    ic.a aVar3 = this.f19933g;
                    zVar.f20021s = aVar3;
                    androidx.lifecycle.p0 p0Var3 = zVar.f20025w;
                    com.google.firebase.messaging.x xVar = zVar.f20027y;
                    this.f19929c = p0Var3;
                    this.f19930d = 1;
                    xVar.getClass();
                    obj = eg.c0.A(eg.m0.f9201a, new hd.e(xVar, aVar2, false, aVar3, null, 1), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    p0Var = p0Var3;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var = this.f19929c;
                    h8.b.B(obj);
                }
                p0Var.h(obj);
                return Unit.f19194a;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i10 = this.f19930d;
                boolean z5 = true;
                if (i10 == 0) {
                    h8.b.B(obj);
                    z zVar2 = this.f19931e;
                    ic.a aVar5 = this.f19932f;
                    zVar2.f20019p = aVar5;
                    ic.a aVar6 = this.f19933g;
                    zVar2.q = aVar6;
                    androidx.lifecycle.p0 p0Var4 = zVar2.f20024v;
                    com.google.firebase.messaging.x xVar2 = zVar2.f20027y;
                    this.f19929c = p0Var4;
                    this.f19930d = 1;
                    xVar2.getClass();
                    obj = eg.c0.A(eg.m0.f9201a, new hd.e(xVar2, aVar5, z5, aVar6, null, 1), this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    p0Var2 = p0Var4;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var2 = this.f19929c;
                    h8.b.B(obj);
                }
                p0Var2.h(obj);
                return Unit.f19194a;
        }
    }
}
