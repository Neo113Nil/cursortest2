package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer;

import Ae.C;
import Ae.C2380A;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.protobuf.DescriptorProtos$FileOptions;
import fd.InterfaceC6511n;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BA\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerTicker;", "", "T", "R", "", "intervalMs", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "transform", "", "timerResultListener", "<init>", "(JLandroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", DynamicElementDTO.TIMER, "bind", "(Ljava/lang/Object;)V", "unbind", "()V", "Lkotlin/jvm/functions/Function1;", "LAe/x0;", "timerHolder", "LAe/x0;", "Lxe/B0;", "job", "Lxe/B0;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerTicker<T, R> {
    private B0 job;

    @NotNull
    private final x0<T> timerHolder;

    @NotNull
    private final Function1<R, Unit> timerResultListener;

    @NotNull
    private final Function1<T, R> transform;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1", f = "TimerTicker.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ long $intervalMs;
        final /* synthetic */ J $lifecycleOwner;
        int label;
        final /* synthetic */ TimerTicker<T, R> this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17561 extends j implements Function2<M, d<? super Unit>, Object> {
            final /* synthetic */ long $intervalMs;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TimerTicker<T, R> this$0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$1", f = "TimerTicker.kt", l = {41}, m = "invokeSuspend")
            /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C17571 extends j implements Function2<InterfaceC2397i<? super Long>, d<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C17571(d<? super C17571> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    C17571 c17571 = new C17571(dVar);
                    c17571.L$0 = obj;
                    return c17571;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC2397i<? super Long> interfaceC2397i, d<? super Unit> dVar) {
                    return ((C17571) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
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

            @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0003H\n"}, d2 = {"<anonymous>", "R", "", "T", "<unused var>", "", DynamicElementDTO.TIMER}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$2", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends j implements InterfaceC6511n<Long, T, d<? super R>, Object> {
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
                    a aVar = a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Object obj2 = this.L$0;
                    if (obj2 != null) {
                        return ((TimerTicker) this.this$0).transform.invoke(obj2);
                    }
                    return null;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj, Object obj2) {
                    return invoke(l11.longValue(), (long) obj, (d) obj2);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n"}, d2 = {"<anonymous>", "", "R", "", "result"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$3", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends j implements Function2<R, d<? super Unit>, Object> {
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

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, d<? super Unit> dVar) {
                    return invoke2((AnonymousClass3) obj, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    a aVar = a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Object obj2 = this.L$0;
                    if (obj2 != null) {
                        ((TimerTicker) this.this$0).timerResultListener.invoke(obj2);
                    }
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(R r11, d<? super Unit> dVar) {
                    return ((AnonymousClass3) create(r11, dVar)).invokeSuspend(Unit.f71690a);
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "R", "LAe/i;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
            @e(c = "ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$4", f = "TimerTicker.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer.TimerTicker$1$1$4, reason: invalid class name */
            static final class AnonymousClass4 extends j implements InterfaceC6511n<InterfaceC2397i<? super R>, Throwable, d<? super Unit>, Object> {
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
            C17561(long j11, TimerTicker<T, R> timerTicker, d<? super C17561> dVar) {
                super(2, dVar);
                this.$intervalMs = j11;
                this.this$0 = timerTicker;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                C17561 c17561 = new C17561(this.$intervalMs, this.this$0, dVar);
                c17561.L$0 = obj;
                return c17561;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                C2399j.C(new C(new C2408n0(C2399j.o(new C2417s0(new C2380A(CoroutineUtilsKt.interval(this.$intervalMs, TimeUnit.MILLISECONDS), new C17571(null)), ((TimerTicker) this.this$0).timerHolder, new AnonymousClass2(this.this$0, null))), new AnonymousClass3(this.this$0, null)), new AnonymousClass4(null)), (M) this.L$0);
                return Unit.f71690a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Unit> dVar) {
                return ((C17561) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(J j11, long j12, TimerTicker<T, R> timerTicker, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$lifecycleOwner = j11;
            this.$intervalMs = j12;
            this.this$0 = timerTicker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$lifecycleOwner, this.$intervalMs, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                J j11 = this.$lifecycleOwner;
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                C17561 c17561 = new C17561(this.$intervalMs, this.this$0, null);
                this.label = 1;
                if (C5412d0.b(j11, bVar, c17561, this) == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TimerTicker(long j11, @NotNull J lifecycleOwner, @NotNull Function1<? super T, ? extends R> transform, @NotNull Function1<? super R, Unit> timerResultListener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(timerResultListener, "timerResultListener");
        this.transform = transform;
        this.timerResultListener = timerResultListener;
        this.timerHolder = O0.a(null);
        this.job = C10727i.c(K.a(lifecycleOwner), null, null, new AnonymousClass1(lifecycleOwner, j11, this, null), 3);
    }

    public final void bind(@NotNull T timer) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timerResultListener.invoke(this.transform.invoke(timer));
        this.timerHolder.setValue(timer);
    }

    public final void unbind() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    public /* synthetic */ TimerTicker(long j11, J j12, Function1 function1, Function1 function12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1000L : j11, j12, function1, function12);
    }
}
