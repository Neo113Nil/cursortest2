package sc;

import eg.c0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23429b;

    /* renamed from: c, reason: collision with root package name */
    public int f23430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f23431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23429b = i5;
        this.f23431d = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23429b) {
            case 0:
                return new c(this.f23431d, continuation, 0);
            default:
                return new c(this.f23431d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23429b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23429b) {
            case 0:
                h hVar = this.f23431d;
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f23430c;
                try {
                    if (i5 == 0) {
                        h8.b.B(obj);
                        m a7 = h.a();
                        this.f23430c = 1;
                        obj = a7.a(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                    }
                    ha.a aVar2 = (ha.a) obj;
                    if (aVar2 == null) {
                        return null;
                    }
                    this.f23430c = 2;
                    if (hVar.c(aVar2, this) == aVar) {
                        return aVar;
                    }
                    return Unit.f19194a;
                } catch (Exception unused) {
                    return Unit.f19194a;
                }
            default:
                Object obj2 = lf.a.f20034a;
                int i10 = this.f23430c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    m a10 = h.a();
                    this.f23430c = 1;
                    a10.getClass();
                    Object i11 = c0.i(new la.l(a10, null, 1), this);
                    if (i11 != obj2) {
                        i11 = Unit.f19194a;
                    }
                    if (i11 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
