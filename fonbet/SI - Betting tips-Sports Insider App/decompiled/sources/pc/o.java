package pc;

import eg.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21680b;

    /* renamed from: c, reason: collision with root package name */
    public int f21681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f21682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f21683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(u uVar, List list, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21680b = i5;
        this.f21682d = uVar;
        this.f21683e = list;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21680b) {
            case 0:
                return new o(this.f21682d, this.f21683e, continuation, 0);
            case 1:
                return new o(this.f21682d, this.f21683e, continuation, 1);
            case 2:
                return new o(this.f21682d, this.f21683e, continuation, 2);
            case 3:
                return new o(this.f21682d, this.f21683e, continuation, 3);
            default:
                return new o(this.f21682d, this.f21683e, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21680b) {
        }
        return ((o) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21680b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f21681c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f21681c = 1;
                    if (u.e(this.f21682d, this.f21683e, this) == aVar) {
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
                int i10 = this.f21681c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f21681c = 1;
                    if (u.f(this.f21682d, this.f21683e, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f21681c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f21681c = 1;
                    if (u.c(this.f21682d, this.f21683e, this) == aVar3) {
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
                int i12 = this.f21681c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f21681c = 1;
                    if (u.c(this.f21682d, this.f21683e, this) == aVar4) {
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
                int i13 = this.f21681c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f21681c = 1;
                    if (u.d(this.f21682d, this.f21683e, this) == aVar5) {
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
