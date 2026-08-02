package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.addToComparision.AddToComparisonUpdateKey;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/comparison/AddToComparisonResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation.AddToComparisonButtonViewHolder$addToComparison$1", f = "AddToComparisonButtonViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToComparisonButtonViewHolder$addToComparison$1 extends j implements Function2<AddToComparisonResponse, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToComparisonButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToComparisonButtonViewHolder$addToComparison$1(AddToComparisonButtonViewHolder addToComparisonButtonViewHolder, d<? super AddToComparisonButtonViewHolder$addToComparison$1> dVar) {
        super(2, dVar);
        this.this$0 = addToComparisonButtonViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToComparisonButtonViewHolder$addToComparison$1 addToComparisonButtonViewHolder$addToComparison$1 = new AddToComparisonButtonViewHolder$addToComparison$1(this.this$0, dVar);
        addToComparisonButtonViewHolder$addToComparison$1.L$0 = obj;
        return addToComparisonButtonViewHolder$addToComparison$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComparisonRefreshViewModel comparisonRefreshViewModel;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddToComparisonResponse addToComparisonResponse = (AddToComparisonResponse) this.L$0;
        if (addToComparisonResponse.isInCompare()) {
            comparisonRefreshViewModel = this.this$0.refreshViewModel;
            comparisonRefreshViewModel.setRefreshState(new Long(addToComparisonResponse.getSku()), true);
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().update(new AddToComparisonUpdateKey(addToComparisonResponse.getSku(), true, false, 4, null));
        } else {
            this.this$0.showError(addToComparisonResponse);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddToComparisonResponse addToComparisonResponse, d<? super Unit> dVar) {
        return ((AddToComparisonButtonViewHolder$addToComparison$1) create(addToComparisonResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
