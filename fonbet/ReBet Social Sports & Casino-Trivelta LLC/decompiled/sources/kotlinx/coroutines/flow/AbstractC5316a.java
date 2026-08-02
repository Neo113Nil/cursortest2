package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: kotlinx.coroutines.flow.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5316a implements InterfaceC5321f {

    /* renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    public static final class C0787a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54667n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54668o;

        /* renamed from: q, reason: collision with root package name */
        public int f54670q;

        public C0787a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54668o = obj;
            this.f54670q |= Integer.MIN_VALUE;
            return AbstractC5316a.this.collect(null, this);
        }
    }

    public abstract Object c(InterfaceC5322g interfaceC5322g, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.InterfaceC5321f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        C0787a c0787a;
        int i10;
        Throwable th2;
        kotlinx.coroutines.flow.internal.v vVar;
        if (continuation instanceof C0787a) {
            c0787a = (C0787a) continuation;
            int i11 = c0787a.f54670q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0787a.f54670q = i11 - Integer.MIN_VALUE;
                Object obj = c0787a.f54668o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0787a.f54670q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.internal.v vVar2 = new kotlinx.coroutines.flow.internal.v(interfaceC5322g, c0787a.getContext());
                    try {
                        c0787a.f54667n = vVar2;
                        c0787a.f54670q = 1;
                        if (c(vVar2, c0787a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        vVar = vVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        vVar = vVar2;
                        vVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (kotlinx.coroutines.flow.internal.v) c0787a.f54667n;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        vVar.releaseIntercepted();
                        throw th2;
                    }
                }
                vVar.releaseIntercepted();
                return Unit.INSTANCE;
            }
        }
        c0787a = new C0787a(continuation);
        Object obj2 = c0787a.f54668o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0787a.f54670q;
        if (i10 != 0) {
        }
        vVar.releaseIntercepted();
        return Unit.INSTANCE;
    }
}
