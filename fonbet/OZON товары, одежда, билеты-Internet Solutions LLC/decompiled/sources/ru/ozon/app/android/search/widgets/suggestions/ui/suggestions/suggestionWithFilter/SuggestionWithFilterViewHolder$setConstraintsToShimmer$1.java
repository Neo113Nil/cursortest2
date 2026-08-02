package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.databinding.SuggestFilterItemsBinding;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SuggestionWithFilterViewHolder$setConstraintsToShimmer$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ SuggestionWithFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewHolder$setConstraintsToShimmer$1(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder) {
        super(1);
        this.this$0 = suggestionWithFilterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        SearchShimmer shimmerView;
        SuggestFilterItemsBinding suggestFilterItemsBinding;
        SearchShimmer shimmerView2;
        SuggestFilterItemsBinding suggestFilterItemsBinding2;
        SearchShimmer shimmerView3;
        SuggestFilterItemsBinding suggestFilterItemsBinding3;
        SearchShimmer shimmerView4;
        SuggestFilterItemsBinding suggestFilterItemsBinding4;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        shimmerView = this.this$0.getShimmerView();
        suggestFilterItemsBinding = this.this$0.binding;
        RecyclerView valuesRv = suggestFilterItemsBinding.valuesRv;
        Intrinsics.checkNotNullExpressionValue(valuesRv, "valuesRv");
        ConstraintSetExtKt.layoutConstraintTopToTopOf(updateConstraints, shimmerView, valuesRv);
        shimmerView2 = this.this$0.getShimmerView();
        suggestFilterItemsBinding2 = this.this$0.binding;
        RecyclerView valuesRv2 = suggestFilterItemsBinding2.valuesRv;
        Intrinsics.checkNotNullExpressionValue(valuesRv2, "valuesRv");
        ConstraintSetExtKt.layoutConstraintStartToStartOf(updateConstraints, shimmerView2, valuesRv2);
        shimmerView3 = this.this$0.getShimmerView();
        suggestFilterItemsBinding3 = this.this$0.binding;
        RecyclerView valuesRv3 = suggestFilterItemsBinding3.valuesRv;
        Intrinsics.checkNotNullExpressionValue(valuesRv3, "valuesRv");
        ConstraintSetExtKt.layoutConstraintEndToEndOf(updateConstraints, shimmerView3, valuesRv3);
        shimmerView4 = this.this$0.getShimmerView();
        suggestFilterItemsBinding4 = this.this$0.binding;
        RecyclerView valuesRv4 = suggestFilterItemsBinding4.valuesRv;
        Intrinsics.checkNotNullExpressionValue(valuesRv4, "valuesRv");
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(updateConstraints, shimmerView4, valuesRv4);
    }
}
