package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w {

    public static final class a implements InterfaceC5321f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54955a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5321f f54956b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function3 f54957c;

        public a(InterfaceC5321f interfaceC5321f, InterfaceC5321f interfaceC5321f2, Function3 function3) {
            this.f54955a = interfaceC5321f;
            this.f54956b = interfaceC5321f2;
            this.f54957c = function3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            Object a10 = kotlinx.coroutines.flow.internal.l.a(interfaceC5322g, new InterfaceC5321f[]{this.f54955a, this.f54956b}, w.c(), new b(this.f54957c, null), continuation);
            return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f54958n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54959o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f54960p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function3 f54961q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.f54961q = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object[] objArr, Continuation continuation) {
            b bVar = new b(this.f54961q, continuation);
            bVar.f54959o = interfaceC5322g;
            bVar.f54960p = objArr;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5322g interfaceC5322g;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54958n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC5322g = (InterfaceC5322g) this.f54959o;
                Object[] objArr = (Object[]) this.f54960p;
                Function3 function3 = this.f54961q;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f54959o = interfaceC5322g;
                this.f54958n = 1;
                obj = function3.invoke(obj2, obj3, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                interfaceC5322g = (InterfaceC5322g) this.f54959o;
                ResultKt.throwOnFailure(obj);
            }
            this.f54959o = null;
            this.f54958n = 2;
        }
    }

    public static final class c implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f54962a = new c();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final InterfaceC5321f b(InterfaceC5321f interfaceC5321f, InterfaceC5321f interfaceC5321f2, Function3 function3) {
        return new a(interfaceC5321f, interfaceC5321f2, function3);
    }

    public static final Function0 c() {
        return c.f54962a;
    }
}
