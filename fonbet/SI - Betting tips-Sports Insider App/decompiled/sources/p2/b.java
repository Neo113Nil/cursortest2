package p2;

import k2.b0;
import k2.c0;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2.e0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public b0 f21449b;

    /* renamed from: c, reason: collision with root package name */
    public int f21450c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f21453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f21454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f21455h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, Continuation continuation, Function1 function1, boolean z5, boolean z7) {
        super(2, continuation);
        this.f21452e = z5;
        this.f21453f = z7;
        this.f21454g = wVar;
        this.f21455h = function1;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.f21454g, continuation, this.f21455h, this.f21452e, this.f21453f);
        bVar.f21451d = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((c0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r12 != r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        c0 c0Var;
        b0 b0Var2;
        c0 c0Var2;
        c0 c0Var3;
        Object obj2;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21450c;
        Function1 function1 = this.f21455h;
        w wVar = this.f21454g;
        boolean z5 = this.f21453f;
        if (i5 == 0) {
            h8.b.B(obj);
            c0 c0Var4 = (c0) this.f21451d;
            if (!this.f21452e) {
                Intrinsics.checkNotNull(c0Var4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(((e0) c0Var4).d());
            }
            b0Var = z5 ? b0.f18650a : b0.f18651b;
            if (!z5) {
                this.f21451d = c0Var4;
                this.f21449b = b0Var;
                this.f21450c = 1;
                Boolean a7 = c0Var4.a(this);
                if (a7 != aVar) {
                    c0Var2 = c0Var4;
                    obj = a7;
                }
                return aVar;
            }
            b0 b0Var3 = b0Var;
            c0Var = c0Var4;
            b0Var2 = b0Var3;
            a aVar2 = new a(0, null, function1);
            this.f21451d = c0Var;
            this.f21449b = null;
            this.f21450c = 3;
            obj = c0Var.b(b0Var2, aVar2, this);
        } else if (i5 == 1) {
            b0Var = this.f21449b;
            c0Var2 = (c0) this.f21451d;
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f21451d;
                    h8.b.B(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        k2.i g10 = wVar.g();
                        g10.f18677b.e(g10.f18680e, g10.f18681f);
                    }
                    return obj2;
                }
                c0Var = (c0) this.f21451d;
                h8.b.B(obj);
                if (z5) {
                    return obj;
                }
                this.f21451d = obj;
                this.f21450c = 4;
                Boolean a10 = c0Var.a(this);
                if (a10 != aVar) {
                    obj2 = obj;
                    obj = a10;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return aVar;
            }
            b0Var = this.f21449b;
            c0Var3 = (c0) this.f21451d;
            h8.b.B(obj);
            b0Var2 = b0Var;
            c0Var = c0Var3;
            a aVar22 = new a(0, null, function1);
            this.f21451d = c0Var;
            this.f21449b = null;
            this.f21450c = 3;
            obj = c0Var.b(b0Var2, aVar22, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            k2.i g11 = wVar.g();
            this.f21451d = c0Var2;
            this.f21449b = b0Var;
            this.f21450c = 2;
            Object f6 = g11.f18677b.f(this);
            if (f6 != aVar) {
                f6 = Unit.f19194a;
            }
            if (f6 != aVar) {
                c0Var3 = c0Var2;
                b0Var2 = b0Var;
                c0Var = c0Var3;
                a aVar222 = new a(0, null, function1);
                this.f21451d = c0Var;
                this.f21449b = null;
                this.f21450c = 3;
                obj = c0Var.b(b0Var2, aVar222, this);
            }
            return aVar;
        }
        b0Var2 = b0Var;
        c0Var = c0Var2;
        a aVar2222 = new a(0, null, function1);
        this.f21451d = c0Var;
        this.f21449b = null;
        this.f21450c = 3;
        obj = c0Var.b(b0Var2, aVar2222, this);
    }
}
