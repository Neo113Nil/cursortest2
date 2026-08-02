package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public final class K implements I {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f54645n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f54646o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ L f54647p;

        /* renamed from: kotlinx.coroutines.flow.K$a$a, reason: collision with other inner class name */
        public static final class C0785a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f54648a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC5322g f54649b;

            /* renamed from: kotlinx.coroutines.flow.K$a$a$a, reason: collision with other inner class name */
            public static final class C0786a extends ContinuationImpl {

                /* renamed from: n, reason: collision with root package name */
                public /* synthetic */ Object f54650n;

                /* renamed from: p, reason: collision with root package name */
                public int f54652p;

                public C0786a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f54650n = obj;
                    this.f54652p |= Integer.MIN_VALUE;
                    return C0785a.this.b(0, this);
                }
            }

            public C0785a(Ref.BooleanRef booleanRef, InterfaceC5322g interfaceC5322g) {
                this.f54648a = booleanRef;
                this.f54649b = interfaceC5322g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(int i10, Continuation continuation) {
                C0786a c0786a;
                int i11;
                if (continuation instanceof C0786a) {
                    c0786a = (C0786a) continuation;
                    int i12 = c0786a.f54652p;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c0786a.f54652p = i12 - Integer.MIN_VALUE;
                        Object obj = c0786a.f54650n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i11 = c0786a.f54652p;
                        if (i11 != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (i10 > 0) {
                                Ref.BooleanRef booleanRef = this.f54648a;
                                if (!booleanRef.element) {
                                    booleanRef.element = true;
                                    InterfaceC5322g interfaceC5322g = this.f54649b;
                                    G g10 = G.f54633a;
                                    c0786a.f54652p = 1;
                                    if (interfaceC5322g.emit(g10, c0786a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                }
                c0786a = new C0786a(continuation);
                Object obj2 = c0786a.f54650n;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = c0786a.f54652p;
                if (i11 != 0) {
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return b(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L l10, Continuation continuation) {
            super(2, continuation);
            this.f54647p = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f54647p, continuation);
            aVar.f54646o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            return ((a) create(interfaceC5322g, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f54645n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f54646o;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                L l10 = this.f54647p;
                C0785a c0785a = new C0785a(booleanRef, interfaceC5322g);
                this.f54645n = 1;
                if (l10.collect(c0785a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.coroutines.flow.I
    public InterfaceC5321f a(L l10) {
        return AbstractC5323h.x(new a(l10, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
