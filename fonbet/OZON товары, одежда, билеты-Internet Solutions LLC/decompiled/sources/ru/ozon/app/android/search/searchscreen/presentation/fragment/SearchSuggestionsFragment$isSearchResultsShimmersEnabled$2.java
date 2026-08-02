package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.SearchResultsShimmersEnabled;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchSuggestionsFragment$isSearchResultsShimmersEnabled$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ SearchSuggestionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSuggestionsFragment$isSearchResultsShimmersEnabled$2(SearchSuggestionsFragment searchSuggestionsFragment) {
        super(0);
        this.this$0 = searchSuggestionsFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.featureChecker;
        if (featureChecker != null) {
            return Boolean.valueOf(featureChecker.isEnabled(SearchResultsShimmersEnabled.INSTANCE));
        }
        Intrinsics.n("featureChecker");
        throw null;
    }
}
