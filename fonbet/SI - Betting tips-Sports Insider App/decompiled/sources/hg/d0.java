package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends mf.i implements vf.a {

    /* renamed from: b, reason: collision with root package name */
    public int f10668b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ h f10669c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf.i f10671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.f10671e = (mf.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d0 d0Var = new d0(this.f10671e, (Continuation) obj3);
        d0Var.f10669c = (h) obj;
        d0Var.f10670d = obj2;
        return d0Var.invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.d(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f10668b;
        if (i5 == 0) {
            h8.b.B(obj);
            hVar = this.f10669c;
            Object obj2 = this.f10670d;
            this.f10669c = hVar;
            this.f10668b = 1;
            obj = this.f10671e.invoke(obj2, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return Unit.f19194a;
            }
            hVar = this.f10669c;
            h8.b.B(obj);
        }
        this.f10669c = null;
        this.f10668b = 2;
    }
}
