package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Function3 f54788a;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3, SuspendFunction {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54789a = new a();

        public a() {
            super(3, InterfaceC5322g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Object obj, Continuation continuation) {
            return interfaceC5322g.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f54789a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f54788a = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(aVar, 3);
    }
}
