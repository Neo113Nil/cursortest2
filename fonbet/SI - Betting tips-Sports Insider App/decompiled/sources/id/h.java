package id;

import eg.c0;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11158b;

    /* renamed from: c, reason: collision with root package name */
    public int f11159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.a f11160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f11161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l1.a aVar, Integer num, Continuation continuation, int i5) {
        super(2, continuation);
        this.f11158b = i5;
        this.f11160d = aVar;
        this.f11161e = num;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11158b) {
            case 0:
                return new h(this.f11160d, this.f11161e, continuation, 0);
            default:
                return new h(this.f11160d, this.f11161e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f11158b) {
        }
        return ((h) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f11158b;
        Integer num = this.f11161e;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f11159c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                int intValue = num.intValue();
                this.f11159c = 1;
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new j(false, this.f11160d, intValue, null, 1), this);
                return A == aVar ? aVar : A;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f11159c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                int intValue2 = num.intValue();
                this.f11159c = 1;
                lg.e eVar2 = m0.f9201a;
                Object A2 = c0.A(lg.d.f20063c, new j(true, this.f11160d, intValue2, null, 1), this);
                return A2 == aVar2 ? aVar2 : A2;
        }
    }
}
