package wc;

import eg.b2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25119b;

    /* renamed from: c, reason: collision with root package name */
    public int f25120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.x f25121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.google.firebase.messaging.x xVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f25119b = i5;
        this.f25121d = xVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f25119b) {
            case 0:
                return new j(this.f25121d, continuation, 0);
            case 1:
                return new j(this.f25121d, continuation, 1);
            case 2:
                return new j(this.f25121d, continuation, 2);
            default:
                return new j(this.f25121d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f25119b) {
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f25119b;
        Continuation continuation = null;
        com.google.firebase.messaging.x xVar = this.f25121d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f25120c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                xVar.getClass();
                pc.u v5 = com.google.firebase.messaging.x.v();
                this.f25120c = 1;
                Object j = v5.j(this);
                return j == aVar ? aVar : j;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f25120c;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        j jVar = new j(xVar, continuation, 0);
                        this.f25120c = 1;
                        obj = b2.b(5000L, jVar, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (String) obj;
                } catch (Exception unused) {
                    return null;
                }
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f25120c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    pc.u v10 = com.google.firebase.messaging.x.v();
                    this.f25120c = 1;
                    if (d9.e.c(v10, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                Object obj2 = lf.a.f20034a;
                int i13 = this.f25120c;
                int i14 = 2;
                if (i13 == 0 || i13 == 1) {
                    h8.b.B(obj);
                    this.f25120c = 2;
                    xVar.getClass();
                    lg.e eVar = eg.m0.f9201a;
                    Object A = eg.c0.A(lg.d.f20063c, new j(xVar, continuation, i14), this);
                    if (A != obj2) {
                        A = Unit.f19194a;
                    }
                    if (A == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
