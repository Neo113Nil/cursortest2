package ru.ozon.app.android.error.summary.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryAdapter;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment$observeState$1", f = "ErrorSummaryFragment.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ErrorSummaryFragment$observeState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ErrorSummaryFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment$observeState$1$1", f = "ErrorSummaryFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment$observeState$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<ErrorSummaryViewState, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ErrorSummaryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ErrorSummaryFragment errorSummaryFragment, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = errorSummaryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ErrorSummaryAdapter errorSummaryAdapter;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ErrorSummaryViewState errorSummaryViewState = (ErrorSummaryViewState) this.L$0;
            errorSummaryAdapter = this.this$0.adapter;
            errorSummaryAdapter.submitList(errorSummaryViewState.getItems());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorSummaryViewState errorSummaryViewState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(errorSummaryViewState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryFragment$observeState$1(ErrorSummaryFragment errorSummaryFragment, d<? super ErrorSummaryFragment$observeState$1> dVar) {
        super(2, dVar);
        this.this$0 = errorSummaryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ErrorSummaryFragment$observeState$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ErrorSummaryViewModel screenViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            screenViewModel = this.this$0.getScreenViewModel();
            C2408n0 c2408n0 = new C2408n0(screenViewModel.getViewStateFlow(), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            if (C2399j.g(c2408n0, this) == aVar) {
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
        return ((ErrorSummaryFragment$observeState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
