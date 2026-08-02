package ru.ozon.uni.android.ds.compose.component.button;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.time.b;
import m0.Y;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1", f = "ButtonUtils.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ButtonUtilsKt$rememberIndicationTransition$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $delayToReset;
    final /* synthetic */ InterfaceC3978p0<Boolean> $needReset$delegate;
    final /* synthetic */ Y<Boolean> $transition;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {
        final /* synthetic */ Y<Boolean> $transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Y<Boolean> y11) {
            super(0);
            this.$transition = y11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$transition.h());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "emit", "(ZLkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$3, reason: invalid class name */
    static final class AnonymousClass3<T> implements InterfaceC2397i {
        final /* synthetic */ long $delayToReset;
        final /* synthetic */ InterfaceC3978p0<Boolean> $needReset$delegate;
        final /* synthetic */ Y<Boolean> $transition;

        AnonymousClass3(long j11, Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0) {
            this.$delayToReset = j11;
            this.$transition = y11;
            this.$needReset$delegate = interfaceC3978p0;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit(((Boolean) obj).booleanValue(), (d<? super Unit>) dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(boolean z11, d<? super Unit> dVar) {
            ButtonUtilsKt$rememberIndicationTransition$1$1$3$emit$1 buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1;
            int i11;
            AnonymousClass3<T> anonymousClass3;
            if (dVar instanceof ButtonUtilsKt$rememberIndicationTransition$1$1$3$emit$1) {
                buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1 = (ButtonUtilsKt$rememberIndicationTransition$1$1$3$emit$1) dVar;
                int i12 = buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        long j11 = this.$delayToReset;
                        b.INSTANCE.getClass();
                        if (!b.g(j11, 0L)) {
                            long j12 = this.$delayToReset;
                            buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.L$0 = this;
                            buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.label = 1;
                            if (xe.Y.c(j12, buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1) == aVar) {
                                return aVar;
                            }
                        }
                        anonymousClass3 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass3 = (AnonymousClass3) buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.L$0;
                        s.b(obj);
                    }
                    ButtonUtilsKt.rememberIndicationTransition_FbhrOv8$lambda$2(anonymousClass3.$needReset$delegate, false);
                    anonymousClass3.$transition.i(Boolean.FALSE);
                    return Unit.f71690a;
                }
            }
            buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1 = new ButtonUtilsKt$rememberIndicationTransition$1$1$3$emit$1(this, dVar);
            Object obj2 = buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = buttonUtilsKt$rememberIndicationTransition$1$1$3$emit$1.label;
            if (i11 != 0) {
            }
            ButtonUtilsKt.rememberIndicationTransition_FbhrOv8$lambda$2(anonymousClass3.$needReset$delegate, false);
            anonymousClass3.$transition.i(Boolean.FALSE);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonUtilsKt$rememberIndicationTransition$1$1(Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0, long j11, d<? super ButtonUtilsKt$rememberIndicationTransition$1$1> dVar) {
        super(2, dVar);
        this.$transition = y11;
        this.$needReset$delegate = interfaceC3978p0;
        this.$delayToReset = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ButtonUtilsKt$rememberIndicationTransition$1$1(this.$transition, this.$needReset$delegate, this.$delayToReset, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final InterfaceC2395h m11 = n1.m(new AnonymousClass1(this.$transition));
            final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$needReset$delegate;
            InterfaceC2395h<Boolean> interfaceC2395h = new InterfaceC2395h<Boolean>() { // from class: ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1

                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                /* renamed from: ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC3978p0 $needReset$delegate$inlined;
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1$2", f = "ButtonUtils.kt", l = {223}, m = "emit")
                    /* renamed from: ru.ozon.uni.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= LinearLayoutManager.INVALID_OFFSET;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, InterfaceC3978p0 interfaceC3978p0) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.$needReset$delegate$inlined = interfaceC3978p0;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, @NotNull d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        boolean rememberIndicationTransition_FbhrOv8$lambda$1;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    if (((Boolean) obj).booleanValue()) {
                                        rememberIndicationTransition_FbhrOv8$lambda$1 = ButtonUtilsKt.rememberIndicationTransition_FbhrOv8$lambda$1(this.$needReset$delegate$inlined);
                                        if (rememberIndicationTransition_FbhrOv8$lambda$1) {
                                            anonymousClass1.label = 1;
                                            if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(@NotNull InterfaceC2397i<? super Boolean> interfaceC2397i, @NotNull d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, interfaceC3978p0), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$delayToReset, this.$transition, this.$needReset$delegate);
            this.label = 1;
            if (interfaceC2395h.collect(anonymousClass3, this) == aVar) {
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
        return ((ButtonUtilsKt$rememberIndicationTransition$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
