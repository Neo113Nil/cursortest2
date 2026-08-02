package I0;

import Ph.AbstractC1488z;
import Ph.InterfaceC1484x;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final Wh.a f5302a = Wh.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1484x f5303b = AbstractC1488z.b(null, 1, null);

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5304n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5305o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5306p;

        /* renamed from: r, reason: collision with root package name */
        public int f5308r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5306p = obj;
            this.f5308r |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(Continuation continuation) {
        Object await = this.f5303b.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    public abstract Object b(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        a aVar;
        int i10;
        Wh.a aVar2;
        z zVar;
        Wh.a aVar3;
        Throwable th2;
        z zVar2;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f5308r;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f5308r = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f5306p;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f5308r;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.f5303b.isCompleted()) {
                            return Unit.INSTANCE;
                        }
                        aVar2 = this.f5302a;
                        aVar.f5304n = this;
                        aVar.f5305o = aVar2;
                        aVar.f5308r = 1;
                        if (aVar2.f(null, aVar) != coroutine_suspended) {
                            zVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (Wh.a) aVar.f5305o;
                        zVar2 = (z) aVar.f5304n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC1484x interfaceC1484x = zVar2.f5303b;
                            Unit unit = Unit.INSTANCE;
                            interfaceC1484x.A0(unit);
                            aVar3.g(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            aVar3.g(null);
                            throw th2;
                        }
                    }
                    Wh.a aVar4 = (Wh.a) aVar.f5305o;
                    zVar = (z) aVar.f5304n;
                    ResultKt.throwOnFailure(obj);
                    aVar2 = aVar4;
                    if (!zVar.f5303b.isCompleted()) {
                        Unit unit2 = Unit.INSTANCE;
                        aVar2.g(null);
                        return unit2;
                    }
                    aVar.f5304n = zVar;
                    aVar.f5305o = aVar2;
                    aVar.f5308r = 2;
                    if (zVar.b(aVar) != coroutine_suspended) {
                        aVar3 = aVar2;
                        zVar2 = zVar;
                        InterfaceC1484x interfaceC1484x2 = zVar2.f5303b;
                        Unit unit3 = Unit.INSTANCE;
                        interfaceC1484x2.A0(unit3);
                        aVar3.g(null);
                        return unit3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!zVar.f5303b.isCompleted()) {
            }
        } catch (Throwable th4) {
            aVar3 = aVar2;
            th2 = th4;
            aVar3.g(null);
            throw th2;
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f5306p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f5308r;
        if (i10 != 0) {
        }
    }
}
