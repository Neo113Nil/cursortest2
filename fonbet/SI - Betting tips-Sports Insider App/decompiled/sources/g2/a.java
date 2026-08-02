package g2;

import com.google.android.gms.internal.measurement.d5;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9709b;

    /* renamed from: c, reason: collision with root package name */
    public int f9710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f9711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f9709b = i5;
        this.f9711d = bVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f9709b) {
            case 0:
                return new a(this.f9711d, continuation, 0);
            case 1:
                return new a(this.f9711d, continuation, 1);
            case 2:
                return new a(this.f9711d, continuation, 2);
            case 3:
                return new a(this.f9711d, continuation, 3);
            default:
                return new a(this.f9711d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f9709b) {
        }
        return ((a) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9709b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f9710c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    d5 d5Var = this.f9711d.f9712a;
                    this.f9710c = 1;
                    if (d5Var.n(null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f9710c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                d5 d5Var2 = this.f9711d.f9712a;
                this.f9710c = 1;
                Object v5 = d5Var2.v(this);
                return v5 == aVar2 ? aVar2 : v5;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f9710c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    d5 d5Var3 = this.f9711d.f9712a;
                    this.f9710c = 1;
                    if (d5Var3.M(null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f9710c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    d5 d5Var4 = this.f9711d.f9712a;
                    this.f9710c = 1;
                    if (d5Var4.O(null, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f9710c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    d5 d5Var5 = this.f9711d.f9712a;
                    this.f9710c = 1;
                    if (d5Var5.P(null, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
