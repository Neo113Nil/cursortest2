package kotlinx.coroutines.flow.internal;

import Ph.P;
import Ph.Q;
import Ph.S;
import Ph.U;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public abstract class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f54709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54710b;

    /* renamed from: c, reason: collision with root package name */
    public final Rh.d f54711c;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54712n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54713o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5322g f54714p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ e f54715q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5322g interfaceC5322g, e eVar, Continuation continuation) {
            super(2, continuation);
            this.f54714p = interfaceC5322g;
            this.f54715q = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f54714p, this.f54715q, continuation);
            aVar.f54713o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54712n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.f54713o;
                InterfaceC5322g interfaceC5322g = this.f54714p;
                Rh.A m10 = this.f54715q.m(p10);
                this.f54712n = 1;
                if (AbstractC5323h.o(interfaceC5322g, m10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54716n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54717o;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = e.this.new b(continuation);
            bVar.f54717o = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Rh.y yVar, Continuation continuation) {
            return ((b) create(yVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54716n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Rh.y yVar = (Rh.y) this.f54717o;
                e eVar = e.this;
                this.f54716n = 1;
                if (eVar.f(yVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public e(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        this.f54709a = coroutineContext;
        this.f54710b = i10;
        this.f54711c = dVar;
    }

    public static /* synthetic */ Object e(e eVar, InterfaceC5322g interfaceC5322g, Continuation continuation) {
        Object g10 = Q.g(new a(interfaceC5322g, eVar, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        CoroutineContext plus = coroutineContext.plus(this.f54709a);
        if (dVar == Rh.d.f10307a) {
            int i11 = this.f54710b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            dVar = this.f54711c;
        }
        return (Intrinsics.areEqual(plus, this.f54709a) && i10 == this.f54710b && dVar == this.f54711c) ? this : i(plus, i10, dVar);
    }

    public String c() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        return e(this, interfaceC5322g, continuation);
    }

    public abstract Object f(Rh.y yVar, Continuation continuation);

    public abstract e i(CoroutineContext coroutineContext, int i10, Rh.d dVar);

    public InterfaceC5321f j() {
        return null;
    }

    public final Function2 k() {
        return new b(null);
    }

    public final int l() {
        int i10 = this.f54710b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public Rh.A m(P p10) {
        return Rh.w.d(p10, this.f54709a, l(), this.f54711c, S.f9049c, null, k(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c10 = c();
        if (c10 != null) {
            arrayList.add(c10);
        }
        if (this.f54709a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f54709a);
        }
        if (this.f54710b != -3) {
            arrayList.add("capacity=" + this.f54710b);
        }
        if (this.f54711c != Rh.d.f10307a) {
            arrayList.add("onBufferOverflow=" + this.f54711c);
        }
        return U.a(this) + '[' + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
