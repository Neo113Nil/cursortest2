package wc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25102b;

    /* renamed from: c, reason: collision with root package name */
    public int f25103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.h0 f25104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ic.h0 h0Var, Continuation continuation, int i5) {
        super(2, continuation);
        this.f25102b = i5;
        this.f25104d = h0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f25102b) {
            case 0:
                return new h(this.f25104d, continuation, 0);
            case 1:
                return new h(this.f25104d, continuation, 1);
            default:
                return new h(this.f25104d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f25102b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25102b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f25103c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                ic.h0 h0Var = this.f25104d;
                if (h0Var == null) {
                    return new Integer(400);
                }
                c cVar = new c();
                String str = h0Var.f11122b;
                String str2 = h0Var.f11124d;
                this.f25103c = 1;
                Object b10 = cVar.b(str, str2, this);
                return b10 == aVar ? aVar : b10;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f25103c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                ic.h0 h0Var2 = this.f25104d;
                if (h0Var2 == null) {
                    return new Integer(400);
                }
                c cVar2 = new c();
                String str3 = h0Var2.f11122b;
                String str4 = h0Var2.f11124d;
                this.f25103c = 1;
                Object b11 = cVar2.b(str3, str4, this);
                return b11 == aVar2 ? aVar2 : b11;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f25103c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                c cVar3 = new c();
                ic.h0 h0Var3 = this.f25104d;
                String str5 = h0Var3.f11122b;
                h0Var3.getClass();
                String str6 = h0Var3.f11124d;
                this.f25103c = 1;
                Object b12 = cVar3.b(str5, str6, this);
                return b12 == aVar3 ? aVar3 : b12;
        }
    }
}
