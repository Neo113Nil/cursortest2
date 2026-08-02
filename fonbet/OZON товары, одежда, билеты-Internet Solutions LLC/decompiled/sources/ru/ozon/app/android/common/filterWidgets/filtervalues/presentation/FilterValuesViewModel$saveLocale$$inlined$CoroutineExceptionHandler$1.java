package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import xe.J;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/common/filterWidgets/filtervalues/presentation/FilterValuesViewModel$saveLocale$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FilterValuesViewModel$saveLocale$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements J {
    final /* synthetic */ FilterValuesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterValuesViewModel$saveLocale$$inlined$CoroutineExceptionHandler$1(J.a aVar, FilterValuesViewModel filterValuesViewModel) {
        super(aVar);
        this.this$0 = filterValuesViewModel;
    }

    @Override // xe.J
    public void handleException(CoroutineContext context, Throwable exception) {
        this.this$0.getViewModelAction().setValue(FilterValuesViewModel.Action.ErrorAndClose.INSTANCE);
        Lm0.a.f17149a.e(exception);
    }
}
