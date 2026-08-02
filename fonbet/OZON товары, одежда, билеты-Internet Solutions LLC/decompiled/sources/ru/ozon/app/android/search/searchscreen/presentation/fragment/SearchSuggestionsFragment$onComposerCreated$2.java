package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchSuggestionsFragment$onComposerCreated$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ SearchSuggestionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSuggestionsFragment$onComposerCreated$2(SearchSuggestionsFragment searchSuggestionsFragment) {
        super(1);
        this.this$0 = searchSuggestionsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String query) {
        StaticNavBarModel staticNavBarModel;
        ActiveSearchBarVO copy;
        Intrinsics.checkNotNullParameter(query, "query");
        staticNavBarModel = this.this$0._navBarModel;
        if (staticNavBarModel != null) {
            SearchSuggestionsFragment searchSuggestionsFragment = this.this$0;
            copy = r2.copy((r35 & 1) != 0 ? r2.id : 0L, (r35 & 2) != 0 ? r2.searchText : query, (r35 & 4) != 0 ? r2.hint : null, (r35 & 8) != 0 ? r2.deeplink : null, (r35 & 16) != 0 ? r2.link : null, (r35 & 32) != 0 ? r2.returnKeyType : null, (r35 & 64) != 0 ? r2.keyboardSearchTrackingInfo : null, (r35 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r2.searchDelay : null, (r35 & 256) != 0 ? r2.cornerRadius : 0.0f, (r35 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r2.backgroundColor : null, (r35 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r2.searchBarTintColor : null, (r35 & 2048) != 0 ? r2.maxSearchQueryTextLength : null, (r35 & 4096) != 0 ? r2.isDynamicUpdateDisabled : null, (r35 & 8192) != 0 ? r2.searchByImage : null, (r35 & 16384) != 0 ? staticNavBarModel.getSearchBarVo().minTextLength : null);
            searchSuggestionsFragment._navBarModel = StaticNavBarModel.copy$default(staticNavBarModel, copy, false, false, false, null, null, null, 126, null);
        }
    }
}
