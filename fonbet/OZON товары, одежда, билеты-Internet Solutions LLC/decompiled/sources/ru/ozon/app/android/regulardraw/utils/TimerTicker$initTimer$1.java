package ru.ozon.app.android.regulardraw.utils;

import Ae.C;
import Ae.C2380A;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import fd.InterfaceC6511n;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1", f = "TimerTicker.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TimerTicker$initTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ TimerTicker<T, R> this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TimerTicker<T, R> this$0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$1", f = "TimerTicker.kt", l = {57}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18361 extends j implements Function2<InterfaceC2397i<? super Long>, d<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C18361(d<? super C18361> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C18361 c18361 = new C18361(dVar);
                c18361.L$0 = obj;
                return c18361;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC2397i<? super Long> interfaceC2397i, d<? super Unit> dVar) {
                return ((C18361) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
                    Long l11 = new Long(0L);
                    this.label = 1;
                    if (interfaceC2397i.emit(l11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R, T] */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0003H\n"}, d2 = {"<anonymous>", "R", "", "T", "<unused var>", "", DynamicElementDTO.TIMER}, k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$2", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$2, reason: invalid class name */
        static final class AnonymousClass2<R, T> extends j implements InterfaceC6511n<Long, T, d<? super R>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TimerTicker<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TimerTicker<T, R> timerTicker, d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.this$0 = timerTicker;
            }

            public final Object invoke(long j11, T t2, d<? super R> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
                anonymousClass2.L$0 = t2;
                return anonymousClass2.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Function1 function1;
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Object obj2 = this.L$0;
                if (obj2 == null) {
                    return null;
                }
                function1 = ((TimerTicker) this.this$0).transform;
                return function1.invoke(obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj, Object obj2) {
                return invoke(l11.longValue(), (long) obj, (d) obj2);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n"}, d2 = {"<anonymous>", "", "R", "", "result"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$3", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$3, reason: invalid class name */
        static final class AnonymousClass3<R> extends j implements Function2<R, d<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TimerTicker<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TimerTicker<T, R> timerTicker, d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.this$0 = timerTicker;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, dVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, d<? super Unit> dVar) {
                return invoke2((AnonymousClass3<R>) obj, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Function1 function1;
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Object obj2 = this.L$0;
                if (obj2 != null) {
                    function1 = ((TimerTicker) this.this$0).timerResultListener;
                    function1.invoke(obj2);
                }
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(R r11, d<? super Unit> dVar) {
                return ((AnonymousClass3) create(r11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [R] */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "LAe/i;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$4", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.regulardraw.utils.TimerTicker$initTimer$1$1$4, reason: invalid class name */
        static final class AnonymousClass4<R> extends j implements InterfaceC6511n<InterfaceC2397i<? super R>, Throwable, d<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(d<? super AnonymousClass4> dVar) {
                super(3, dVar);
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(InterfaceC2397i<? super R> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
                anonymousClass4.L$0 = th2;
                return anonymousClass4.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Lm0.a.f17149a.e((Throwable) this.L$0);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TimerTicker<T, R> timerTicker, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = timerTicker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j11;
            x0 x0Var;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            M m11 = (M) this.L$0;
            TimerTicker<T, R> timerTicker = this.this$0;
            j11 = ((TimerTicker) timerTicker).intervalMs;
            C2380A c2380a = new C2380A(CoroutineUtilsKt.interval(j11, TimeUnit.MILLISECONDS), new C18361(null));
            x0Var = ((TimerTicker) this.this$0).timerHolder;
            ((TimerTicker) timerTicker).job = C2399j.C(new C(new C2408n0(C2399j.o(new C2417s0(c2380a, x0Var, new AnonymousClass2(this.this$0, null))), new AnonymousClass3(this.this$0, null)), new AnonymousClass4(null)), m11);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerTicker$initTimer$1(TimerTicker<T, R> timerTicker, d<? super TimerTicker$initTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = timerTicker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TimerTicker$initTimer$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        J j11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = ((TimerTicker) this.this$0).lifecycleOwner;
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C5412d0.b(j11, bVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TimerTicker$initTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
