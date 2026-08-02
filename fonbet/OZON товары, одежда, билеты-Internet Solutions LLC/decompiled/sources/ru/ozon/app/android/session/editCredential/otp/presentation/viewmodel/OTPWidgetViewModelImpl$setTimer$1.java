package ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel;

import Ae.C;
import Ae.C2401k;
import Ae.C2408n0;
import Ae.C2425z;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.h;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1", f = "OTPWidgetViewModelImpl.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OTPWidgetViewModelImpl$setTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $repeatMsg;
    final /* synthetic */ int $seconds;
    final /* synthetic */ OTPWidgetDTO.RetryButton $timer;
    int label;
    final /* synthetic */ OTPWidgetViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$1", f = "OTPWidgetViewModelImpl.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Integer, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        public final Object invoke(int i11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
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
        public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
            return invoke(num.intValue(), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$2", f = "OTPWidgetViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Integer>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Integer> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$3", f = "OTPWidgetViewModelImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements InterfaceC6511n<InterfaceC2397i<? super Integer>, Throwable, d<? super Unit>, Object> {
        final /* synthetic */ String $repeatMsg;
        int label;
        final /* synthetic */ OTPWidgetViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(OTPWidgetViewModelImpl oTPWidgetViewModelImpl, String str, d<? super AnonymousClass3> dVar) {
            super(3, dVar);
            this.this$0 = oTPWidgetViewModelImpl;
            this.$repeatMsg = str;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Integer> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            return new AnonymousClass3(this.this$0, this.$repeatMsg, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.onTimerCompleted(this.$repeatMsg);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OTPWidgetViewModelImpl$setTimer$1(int i11, OTPWidgetViewModelImpl oTPWidgetViewModelImpl, String str, OTPWidgetDTO.RetryButton retryButton, d<? super OTPWidgetViewModelImpl$setTimer$1> dVar) {
        super(2, dVar);
        this.$seconds = i11;
        this.this$0 = oTPWidgetViewModelImpl;
        this.$repeatMsg = str;
        this.$timer = retryButton;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OTPWidgetViewModelImpl$setTimer$1(this.$seconds, this.this$0, this.$repeatMsg, this.$timer, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C2425z c2425z = new C2425z(new C(new C2408n0(new C2401k(h.j(this.$seconds, 0)), new AnonymousClass1(null)), new AnonymousClass2(null)), new AnonymousClass3(this.this$0, this.$repeatMsg, null));
            final OTPWidgetViewModelImpl oTPWidgetViewModelImpl = this.this$0;
            final OTPWidgetDTO.RetryButton retryButton = this.$timer;
            final String str = this.$repeatMsg;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl$setTimer$1.4
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit(((Number) obj2).intValue(), (d<? super Unit>) dVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Object emit(int i12, d<? super Unit> dVar) {
                    x0 x0Var;
                    Object value;
                    int i13 = i12 - 1;
                    OTPWidgetViewModelImpl.this.updateTimer(i13, retryButton.getSubtitle(), str);
                    x0Var = OTPWidgetViewModelImpl.this.durationFlow;
                    OTPWidgetDTO.RetryButton retryButton2 = retryButton;
                    do {
                        value = x0Var.getValue();
                    } while (!x0Var.b(value, ((TimerState) value).copy(retryButton2.getAction(), i13)));
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (c2425z.collect(interfaceC2397i, this) == aVar) {
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
        return ((OTPWidgetViewModelImpl$setTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
