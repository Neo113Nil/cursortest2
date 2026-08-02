package c4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3608b;

    /* renamed from: c, reason: collision with root package name */
    public int f3609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f3610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q4.h f3611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, q4.h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3608b = i5;
        this.f3610d = vVar;
        this.f3611e = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3608b) {
            case 0:
                return new s(this.f3610d, this.f3611e, continuation, 0);
            default:
                return new s(this.f3610d, this.f3611e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3608b) {
        }
        return ((s) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3608b;
        q4.h hVar = this.f3611e;
        v vVar = this.f3610d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f3609c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f3609c = 1;
                int i11 = v.f3627f;
                Object b10 = vVar.b(hVar, 0, this);
                return b10 == aVar ? aVar : b10;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f3609c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f3609c = 1;
                int i13 = v.f3627f;
                Object b11 = vVar.b(hVar, 1, this);
                return b11 == aVar2 ? aVar2 : b11;
        }
    }
}
