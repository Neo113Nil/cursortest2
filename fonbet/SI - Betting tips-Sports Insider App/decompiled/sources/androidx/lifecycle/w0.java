package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Ref.ObjectRef f2246b;

    /* renamed from: c, reason: collision with root package name */
    public Ref.ObjectRef f2247c;

    /* renamed from: d, reason: collision with root package name */
    public int f2248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f2249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f2250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eg.z f2251g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf.i f2252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(y yVar, x xVar, eg.z zVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2249e = yVar;
        this.f2250f = xVar;
        this.f2251g = zVar;
        this.f2252h = (mf.i) function2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new w0(this.f2249e, this.f2250f, this.f2251g, this.f2252h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.d0, androidx.lifecycle.v0, java.lang.Object] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Throwable th2;
        Ref.ObjectRef objectRef2;
        eg.e1 e1Var;
        c0 c0Var;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2248d;
        y yVar = this.f2249e;
        if (i5 == 0) {
            h8.b.B(obj);
            if (((g0) yVar).f2169d == x.f2253a) {
                return Unit.f19194a;
            }
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            try {
                x xVar = this.f2250f;
                eg.z zVar = this.f2251g;
                ?? r11 = this.f2252h;
                this.f2246b = objectRef3;
                this.f2247c = objectRef;
                this.f2248d = 1;
                eg.l lVar = new eg.l(1, lf.d.b(this));
                lVar.s();
                w.Companion.getClass();
                ?? v0Var = new v0(u.c(xVar), objectRef3, zVar, u.a(xVar), lVar, new ng.c(), r11);
                objectRef.element = v0Var;
                Intrinsics.checkNotNull(v0Var, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                yVar.a(v0Var);
                Object r5 = lVar.r();
                if (r5 == aVar) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (r5 == aVar) {
                    return aVar;
                }
                objectRef2 = objectRef3;
            } catch (Throwable th3) {
                th2 = th3;
                objectRef2 = objectRef3;
                e1Var = (eg.e1) objectRef2.element;
                if (e1Var != null) {
                }
                c0Var = (c0) objectRef.element;
                if (c0Var != null) {
                }
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f2247c;
            objectRef2 = this.f2246b;
            try {
                h8.b.B(obj);
            } catch (Throwable th4) {
                th2 = th4;
                e1Var = (eg.e1) objectRef2.element;
                if (e1Var != null) {
                    e1Var.k(null);
                }
                c0Var = (c0) objectRef.element;
                if (c0Var != null) {
                    throw th2;
                }
                yVar.b(c0Var);
                throw th2;
            }
        }
        eg.e1 e1Var2 = (eg.e1) objectRef2.element;
        if (e1Var2 != null) {
            e1Var2.k(null);
        }
        c0 c0Var2 = (c0) objectRef.element;
        if (c0Var2 != null) {
            yVar.b(c0Var2);
        }
        return Unit.f19194a;
    }
}
