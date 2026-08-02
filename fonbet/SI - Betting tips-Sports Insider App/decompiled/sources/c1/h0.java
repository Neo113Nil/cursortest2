package c1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.IntRef f3394b;

    /* renamed from: c, reason: collision with root package name */
    public int f3395c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f3397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f3398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Ref.IntRef intRef, i0 i0Var, Object obj, boolean z5, Continuation continuation) {
        super(2, continuation);
        this.f3397e = intRef;
        this.f3398f = i0Var;
        this.f3399g = obj;
        this.f3400h = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        h0 h0Var = new h0(this.f3397e, this.f3398f, this.f3399g, this.f3400h, continuation);
        h0Var.f3396d = obj;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((r0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8 == r0) goto L21;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Ref.IntRef intRef;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f3395c;
        Object obj2 = this.f3399g;
        i0 i0Var = this.f3398f;
        Ref.IntRef intRef2 = this.f3397e;
        if (i5 == 0) {
            h8.b.B(obj);
            r0 r0Var2 = (r0) this.f3396d;
            b1 g10 = i0Var.g();
            this.f3396d = r0Var2;
            this.f3394b = intRef2;
            this.f3395c = 1;
            Integer num = new Integer(((AtomicInteger) g10.f3340b.f10430b).incrementAndGet());
            if (num != aVar) {
                r0Var = r0Var2;
                obj = num;
                intRef = intRef2;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
            if (this.f3400h) {
                i0Var.f3408h.d(new d(obj2 != null ? obj2.hashCode() : 0, intRef2.element, obj2));
            }
            return Unit.f19194a;
        }
        intRef = this.f3394b;
        r0Var = (r0) this.f3396d;
        h8.b.B(obj);
        intRef.element = ((Number) obj).intValue();
        this.f3396d = null;
        this.f3394b = null;
        this.f3395c = 2;
        if (r0Var.f3421b.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        Object F = f3.x.F(r0Var.f3420a, new f0(r0Var, obj2, null), this);
        if (F != aVar) {
            F = Unit.f19194a;
        }
    }
}
