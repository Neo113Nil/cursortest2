package c1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ng.a f3434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f3435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f3436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f3437d;

    public n(ng.a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, i0 i0Var) {
        this.f3434a = aVar;
        this.f3435b = booleanRef;
        this.f3436c = objectRef;
        this.f3437d = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g gVar, mf.c cVar) {
        m mVar;
        int i5;
        ng.a aVar;
        i0 i0Var;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Function2 function2;
        ng.a aVar2;
        ng.a aVar3;
        i0 i0Var2;
        T t3;
        Ref.ObjectRef objectRef2;
        try {
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i10 = mVar.f3429h;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    mVar.f3429h = i10 - Integer.MIN_VALUE;
                    Object obj = mVar.f3427f;
                    lf.a aVar4 = lf.a.f20034a;
                    i5 = mVar.f3429h;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        mVar.f3422a = gVar;
                        aVar = this.f3434a;
                        mVar.f3423b = aVar;
                        Ref.BooleanRef booleanRef2 = this.f3435b;
                        mVar.f3424c = booleanRef2;
                        Ref.ObjectRef objectRef3 = this.f3436c;
                        mVar.f3425d = objectRef3;
                        i0Var = this.f3437d;
                        mVar.f3426e = i0Var;
                        mVar.f3429h = 1;
                        if (aVar.c(mVar) != aVar4) {
                            booleanRef = booleanRef2;
                            objectRef = objectRef3;
                            function2 = gVar;
                        }
                        return aVar4;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = mVar.f3424c;
                            objectRef2 = (Ref.ObjectRef) mVar.f3423b;
                            aVar2 = (ng.a) mVar.f3422a;
                            try {
                                h8.b.B(obj);
                                t3 = obj2;
                                objectRef2.element = t3;
                                objectRef = objectRef2;
                                T t5 = objectRef.element;
                                aVar2.k(null);
                                return t5;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.k(null);
                                throw th;
                            }
                        }
                        i0Var2 = (i0) mVar.f3424c;
                        objectRef = (Ref.ObjectRef) mVar.f3423b;
                        aVar3 = (ng.a) mVar.f3422a;
                        try {
                            h8.b.B(obj);
                            if (!Intrinsics.areEqual(obj, objectRef.element)) {
                                aVar2 = aVar3;
                                T t52 = objectRef.element;
                                aVar2.k(null);
                                return t52;
                            }
                            mVar.f3422a = aVar3;
                            mVar.f3423b = objectRef;
                            mVar.f3424c = obj;
                            mVar.f3429h = 3;
                            if (i0Var2.j(obj, false, mVar) != aVar4) {
                                t3 = obj;
                                objectRef2 = objectRef;
                                aVar2 = aVar3;
                                objectRef2.element = t3;
                                objectRef = objectRef2;
                                T t522 = objectRef.element;
                                aVar2.k(null);
                                return t522;
                            }
                            return aVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar3;
                            aVar2.k(null);
                            throw th;
                        }
                    }
                    i0 i0Var3 = mVar.f3426e;
                    objectRef = mVar.f3425d;
                    booleanRef = (Ref.BooleanRef) mVar.f3424c;
                    ng.a aVar5 = (ng.a) mVar.f3423b;
                    Function2 function22 = (Function2) mVar.f3422a;
                    h8.b.B(obj);
                    i0Var = i0Var3;
                    function2 = function22;
                    aVar = aVar5;
                    if (!booleanRef.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj3 = objectRef.element;
                    mVar.f3422a = aVar;
                    mVar.f3423b = objectRef;
                    mVar.f3424c = i0Var;
                    mVar.f3425d = null;
                    mVar.f3426e = null;
                    mVar.f3429h = 2;
                    Object invoke = function2.invoke(obj3, mVar);
                    if (invoke != aVar4) {
                        aVar3 = aVar;
                        obj = invoke;
                        i0Var2 = i0Var;
                        if (!Intrinsics.areEqual(obj, objectRef.element)) {
                        }
                    }
                    return aVar4;
                }
            }
            if (!booleanRef.element) {
            }
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.k(null);
            throw th;
        }
        mVar = new m(this, cVar);
        Object obj4 = mVar.f3427f;
        lf.a aVar42 = lf.a.f20034a;
        i5 = mVar.f3429h;
        if (i5 != 0) {
        }
    }
}
