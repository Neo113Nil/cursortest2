package ru.ozon.app.android.travel.utils.asyncWidget;

import Ae.InterfaceC2397i;
import Ae.w0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1", f = "AbstractAsyncMultipleRequestsWidgetViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AsyncMultipleRequestsWidgetCallbacks<VO> $callbacksHolder;
    final /* synthetic */ J $lifecycleOwner;
    int label;
    final /* synthetic */ AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1$1", f = "AbstractAsyncMultipleRequestsWidgetViewModel.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AsyncMultipleRequestsWidgetCallbacks<VO> $callbacksHolder;
        int label;
        final /* synthetic */ AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel, AsyncMultipleRequestsWidgetCallbacks<VO> asyncMultipleRequestsWidgetCallbacks, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = abstractAsyncMultipleRequestsWidgetViewModel;
            this.$callbacksHolder = asyncMultipleRequestsWidgetCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$callbacksHolder, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                w0Var = ((AbstractAsyncMultipleRequestsWidgetViewModel) this.this$0).fetchingEvents;
                final AsyncMultipleRequestsWidgetCallbacks<VO> asyncMultipleRequestsWidgetCallbacks = this.$callbacksHolder;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncMultipleRequestsWidgetViewModel.observeEvents.1.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((AbstractAsyncMultipleRequestsWidgetViewModel.Event) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(AbstractAsyncMultipleRequestsWidgetViewModel.Event<VO> event, d<? super Unit> dVar) {
                        if (event instanceof AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetched) {
                            AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetched onWidgetFetched = (AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetched) event;
                            asyncMultipleRequestsWidgetCallbacks.onAsyncWidgetFetched(onWidgetFetched.getFetchedModel(), onWidgetFetched.getAsyncData());
                        } else if (event instanceof AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetchingFailed) {
                            AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetchingFailed onWidgetFetchingFailed = (AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetFetchingFailed) event;
                            asyncMultipleRequestsWidgetCallbacks.onAsyncWidgetFetchingFailed(onWidgetFetchingFailed.getThrowable(), onWidgetFetchingFailed.getAsyncData());
                        } else {
                            if (!(event instanceof AbstractAsyncMultipleRequestsWidgetViewModel.Event.OnWidgetSkipped)) {
                                throw new o();
                            }
                            asyncMultipleRequestsWidgetCallbacks.onAsyncWidgetSkipped();
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (w0Var.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1(J j11, AbstractAsyncMultipleRequestsWidgetViewModel<DTO, VO> abstractAsyncMultipleRequestsWidgetViewModel, AsyncMultipleRequestsWidgetCallbacks<VO> asyncMultipleRequestsWidgetCallbacks, d<? super AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1> dVar) {
        super(2, dVar);
        this.$lifecycleOwner = j11;
        this.this$0 = abstractAsyncMultipleRequestsWidgetViewModel;
        this.$callbacksHolder = asyncMultipleRequestsWidgetCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1(this.$lifecycleOwner, this.this$0, this.$callbacksHolder, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            J j11 = this.$lifecycleOwner;
            AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$callbacksHolder, null);
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
        return ((AbstractAsyncMultipleRequestsWidgetViewModel$observeEvents$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
