package id;

import eg.f0;
import eg.g0;
import java.util.Iterator;
import k2.b0;
import k2.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m2.e0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11162b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f11163c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11165e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Integer num, boolean z5, l1.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f11168h = num;
        this.f11165e = z5;
        this.f11167g = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f11162b) {
            case 0:
                i iVar = new i((Integer) this.f11168h, this.f11165e, (l1.a) this.f11167g, continuation);
                iVar.f11164d = obj;
                return iVar;
            default:
                i iVar2 = new i((k2.w) this.f11167g, continuation, (Function1) this.f11168h, this.f11165e);
                iVar2.f11164d = obj;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11162b) {
            case 0:
                return ((i) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((i) create((c0) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148 A[LOOP:0: B:49:0x0142->B:51:0x0148, LOOP_END] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        b0 b0Var;
        b0 b0Var2;
        c0 c0Var;
        c0 c0Var2;
        Object obj2;
        int i5 = this.f11162b;
        boolean z5 = this.f11165e;
        Object obj3 = this.f11167g;
        Continuation continuation = null;
        Object obj4 = this.f11168h;
        int i10 = 1;
        switch (i5) {
            case 0:
                Integer num = (Integer) obj4;
                l1.a aVar = (l1.a) obj3;
                eg.z zVar = (eg.z) this.f11164d;
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f11163c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    if (num.intValue() <= 0) {
                        return Unit.f19194a;
                    }
                    g0 e7 = eg.c0.e(zVar, null, new h(aVar, num, continuation, 0), 3);
                    if (z5) {
                        this.f11164d = null;
                        this.f11166f = aVar;
                        this.f11163c = 1;
                        obj = e7.m(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        l1.a.g(aVar, ((Number) obj).intValue());
                    } else {
                        f0[] f0VarArr = {e7, eg.c0.e(zVar, null, new h(aVar, num, continuation, i10), 3)};
                        this.f11164d = null;
                        this.f11166f = null;
                        this.f11163c = 2;
                        obj = eg.c0.f(f0VarArr, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                        }
                    }
                } else if (i11 == 1) {
                    aVar = (l1.a) this.f11166f;
                    h8.b.B(obj);
                    l1.a.g(aVar, ((Number) obj).intValue());
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    it = ((Iterable) obj).iterator();
                    while (it.hasNext()) {
                        l1.a.g(aVar, ((Number) it.next()).intValue());
                    }
                }
                return Unit.f19194a;
            default:
                Function1 function1 = (Function1) obj4;
                k2.w wVar = (k2.w) obj3;
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f11163c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    c0 c0Var3 = (c0) this.f11164d;
                    Intrinsics.checkNotNull(c0Var3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return function1.invoke(((e0) c0Var3).d());
                }
                if (i12 == 1) {
                    b0Var = (b0) this.f11166f;
                    c0 c0Var4 = (c0) this.f11164d;
                    h8.b.B(obj);
                    if (((Boolean) obj).booleanValue()) {
                        b0Var2 = b0Var;
                        c0Var = c0Var4;
                        p2.a aVar4 = new p2.a(1, null, function1);
                        this.f11164d = c0Var;
                        this.f11166f = null;
                        this.f11163c = 3;
                        obj = c0Var.b(b0Var2, aVar4, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        if (z5) {
                        }
                    } else {
                        k2.i g10 = wVar.g();
                        this.f11164d = c0Var4;
                        this.f11166f = b0Var;
                        this.f11163c = 2;
                        Object f6 = g10.f18677b.f(this);
                        if (f6 != aVar3) {
                            f6 = Unit.f19194a;
                        }
                        if (f6 == aVar3) {
                            return aVar3;
                        }
                        c0Var2 = c0Var4;
                    }
                } else if (i12 == 2) {
                    b0Var = (b0) this.f11166f;
                    c0Var2 = (c0) this.f11164d;
                    h8.b.B(obj);
                } else {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f11164d;
                        h8.b.B(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return obj2;
                        }
                        k2.i g11 = wVar.g();
                        g11.f18677b.e(g11.f18680e, g11.f18681f);
                        return obj2;
                    }
                    c0Var = (c0) this.f11164d;
                    h8.b.B(obj);
                    if (z5) {
                        return obj;
                    }
                    this.f11164d = obj;
                    this.f11163c = 4;
                    Boolean a7 = c0Var.a(this);
                    if (a7 == aVar3) {
                        return aVar3;
                    }
                    obj2 = obj;
                    obj = a7;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                b0Var2 = b0Var;
                c0Var = c0Var2;
                p2.a aVar42 = new p2.a(1, null, function1);
                this.f11164d = c0Var;
                this.f11166f = null;
                this.f11163c = 3;
                obj = c0Var.b(b0Var2, aVar42, this);
                if (obj == aVar3) {
                }
                if (z5) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k2.w wVar, Continuation continuation, Function1 function1, boolean z5) {
        super(2, continuation);
        this.f11165e = z5;
        this.f11167g = wVar;
        this.f11168h = function1;
    }
}
