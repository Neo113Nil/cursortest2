package c1;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3342b;

    /* renamed from: c, reason: collision with root package name */
    public int f3343c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f3344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f3345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3346f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(i0 i0Var, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3342b = i10;
        this.f3345e = i0Var;
        this.f3346f = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3342b) {
            case 0:
                c0 c0Var = new c0(this.f3345e, this.f3346f, continuation, 0);
                c0Var.f3344d = ((Boolean) obj).booleanValue();
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f3345e, this.f3346f, continuation, 1);
                c0Var2.f3344d = ((Boolean) obj).booleanValue();
                return c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i5 = this.f3342b;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i5) {
        }
        return ((c0) create(bool, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int i5;
        boolean z5;
        c1 c1Var;
        boolean z7;
        boolean z10;
        Object obj2;
        int i10;
        switch (this.f3342b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                boolean z11 = this.f3343c;
                i0 i0Var = this.f3345e;
                try {
                } catch (Throwable th3) {
                    if (z11 != 0) {
                        b1 g10 = i0Var.g();
                        this.f3347g = th3;
                        this.f3344d = z11;
                        this.f3343c = 2;
                        Integer a7 = g10.a();
                        if (a7 == aVar) {
                            return aVar;
                        }
                        z5 = z11;
                        th2 = th3;
                        obj = a7;
                    } else {
                        boolean z12 = z11;
                        th2 = th3;
                        i5 = this.f3346f;
                        z5 = z12;
                    }
                }
                if (z11 == 0) {
                    h8.b.B(obj);
                    boolean z13 = this.f3344d;
                    this.f3344d = z13;
                    this.f3343c = 1;
                    obj = i0.f(i0Var, z13, this);
                    z11 = z13;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z11 != 1) {
                        if (z11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z5 = this.f3344d;
                        th2 = (Throwable) this.f3347g;
                        h8.b.B(obj);
                        i5 = ((Number) obj).intValue();
                        w0 w0Var = new w0(th2, i5);
                        z7 = z5;
                        c1Var = w0Var;
                        return new Pair(c1Var, Boolean.valueOf(z7));
                    }
                    boolean z14 = this.f3344d;
                    h8.b.B(obj);
                    z11 = z14;
                }
                c1Var = (c1) obj;
                z7 = z11;
                return new Pair(c1Var, Boolean.valueOf(z7));
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f3343c;
                i0 i0Var2 = this.f3345e;
                if (i11 == 0) {
                    h8.b.B(obj);
                    z10 = this.f3344d;
                    this.f3344d = z10;
                    this.f3343c = 1;
                    obj = i0Var2.i(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f3347g;
                        h8.b.B(obj);
                        i10 = ((Number) obj).intValue();
                        return new d(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
                    }
                    z10 = this.f3344d;
                    h8.b.B(obj);
                }
                if (!z10) {
                    obj2 = obj;
                    i10 = this.f3346f;
                    return new d(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
                }
                b1 g11 = i0Var2.g();
                this.f3347g = obj;
                this.f3343c = 2;
                Integer a10 = g11.a();
                if (a10 == aVar2) {
                    return aVar2;
                }
                obj2 = obj;
                obj = a10;
                i10 = ((Number) obj).intValue();
                return new d(obj2 != null ? obj2.hashCode() : 0, i10, obj2);
        }
    }
}
