package id;

import eg.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.k0;
import la.m0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11154b;

    /* renamed from: c, reason: collision with root package name */
    public int f11155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.a f11156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l1.a aVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f11154b = i10;
        this.f11156d = aVar;
        this.f11157e = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11154b) {
            case 0:
                return new g(this.f11156d, this.f11157e, continuation, 0);
            default:
                return new g(this.f11156d, this.f11157e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11154b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11154b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f11155c;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                m0 r5 = l1.a.r();
                this.f11155c = 1;
                r5.getClass();
                Object A = c0.A(eg.m0.f9201a, new k0(r5, this.f11157e, null), this);
                return A == aVar ? aVar : A;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f11155c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                m0 r6 = l1.a.r();
                this.f11155c = 1;
                r6.getClass();
                Object A2 = c0.A(eg.m0.f9201a, new bd.i(this.f11157e, 9, r6, (Continuation) null), this);
                return A2 == aVar2 ? aVar2 : A2;
        }
    }
}
