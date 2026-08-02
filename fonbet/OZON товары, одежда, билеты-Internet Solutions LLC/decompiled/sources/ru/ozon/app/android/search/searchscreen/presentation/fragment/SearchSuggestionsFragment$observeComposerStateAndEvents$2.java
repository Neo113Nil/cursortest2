package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import ru.ozon.app.android.search.databinding.FragmentSearchSuggestionsBinding;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SearchSkeleton;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$observeComposerStateAndEvents$2", f = "SearchSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchSuggestionsFragment$observeComposerStateAndEvents$2 extends j implements Function2<A00.a, d<? super Unit>, Object> {
    final /* synthetic */ I $pageWasRestored;
    final /* synthetic */ I $shouldShowShimmer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchSuggestionsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSuggestionsFragment$observeComposerStateAndEvents$2(I i11, SearchSuggestionsFragment searchSuggestionsFragment, I i12, d<? super SearchSuggestionsFragment$observeComposerStateAndEvents$2> dVar) {
        super(2, dVar);
        this.$pageWasRestored = i11;
        this.this$0 = searchSuggestionsFragment;
        this.$shouldShowShimmer = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchSuggestionsFragment$observeComposerStateAndEvents$2 searchSuggestionsFragment$observeComposerStateAndEvents$2 = new SearchSuggestionsFragment$observeComposerStateAndEvents$2(this.$pageWasRestored, this.this$0, this.$shouldShowShimmer, dVar);
        searchSuggestionsFragment$observeComposerStateAndEvents$2.L$0 = obj;
        return searchSuggestionsFragment$observeComposerStateAndEvents$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(A00.a aVar, d<? super Unit> dVar) {
        return ((SearchSuggestionsFragment$observeComposerStateAndEvents$2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentSearchSuggestionsBinding binding;
        SearchSkeleton searchSkeleton;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        A00.a aVar2 = (A00.a) this.L$0;
        if (aVar2 instanceof a.B) {
            this.$pageWasRestored.f71783a = true;
        } else if (aVar2 instanceof a.u.C0013a) {
            if (!this.$pageWasRestored.f71783a) {
                this.this$0.showShimmer();
            }
        } else if ((aVar2 instanceof a.u.b) && this.$shouldShowShimmer.f71783a) {
            binding = this.this$0.getBinding();
            SearchShimmer searchShimmer = binding.shimmer;
            searchSkeleton = this.this$0.getSearchSkeleton();
            searchShimmer.addView(searchSkeleton);
            this.this$0.showShimmer();
            this.$shouldShowShimmer.f71783a = false;
        }
        return Unit.f71690a;
    }
}
