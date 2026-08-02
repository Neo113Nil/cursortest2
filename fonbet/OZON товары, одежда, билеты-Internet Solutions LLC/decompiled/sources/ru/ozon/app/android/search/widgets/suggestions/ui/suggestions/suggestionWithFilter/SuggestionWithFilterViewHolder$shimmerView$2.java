package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/views/searchShimmer/SearchShimmer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SuggestionWithFilterViewHolder$shimmerView$2 extends AbstractC7737t implements Function0<SearchShimmer> {
    final /* synthetic */ SuggestionWithFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewHolder$shimmerView$2(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder) {
        super(0);
        this.this$0 = suggestionWithFilterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchShimmer invoke() {
        SuggestionWithFilterViewHolder.Companion companion;
        Context context = this.this$0.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SearchShimmer searchShimmer = new SearchShimmer(context, null, 0, 6, null);
        SuggestionWithFilterViewHolder suggestionWithFilterViewHolder = this.this$0;
        searchShimmer.setId(R$id.onboardingShimmer);
        companion = SuggestionWithFilterViewHolder.Companion;
        searchShimmer.setLayoutParams(new ViewGroup.LayoutParams(0, companion.getONBOARDING_SHIMMER_HEIGHT()));
        View view = new View(suggestionWithFilterViewHolder.itemView.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(suggestionWithFilterViewHolder.itemView.getResources().getColor(R$color.transparent));
        searchShimmer.addView(view);
        return searchShimmer;
    }
}
