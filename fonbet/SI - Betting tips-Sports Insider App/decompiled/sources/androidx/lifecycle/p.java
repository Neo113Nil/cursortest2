package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2229b;

    /* renamed from: c, reason: collision with root package name */
    public int f2230c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.g f2232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(hg.g gVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2229b = i5;
        this.f2232e = gVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2229b) {
            case 0:
                p pVar = new p(this.f2232e, continuation, 0);
                pVar.f2231d = obj;
                return pVar;
            default:
                p pVar2 = new p(this.f2232e, continuation, 1);
                pVar2.f2231d = obj;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2229b) {
            case 0:
                return ((p) create((o0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((p) create((gg.w) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2229b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f2230c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    n nVar = new n(1, (o0) this.f2231d);
                    this.f2230c = 1;
                    if (this.f2232e.a(nVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f2230c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    c1.y yVar = new c1.y(1, (gg.w) this.f2231d);
                    this.f2230c = 1;
                    if (this.f2232e.a(yVar, this) == aVar2) {
                        return aVar2;
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
