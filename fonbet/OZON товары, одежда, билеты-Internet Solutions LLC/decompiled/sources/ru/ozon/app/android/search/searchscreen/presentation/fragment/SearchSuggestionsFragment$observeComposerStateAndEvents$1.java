package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.s;
import i10.C6997c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li10/c;", "Lru/ozon/composer/ui/widget/l;", "state", "", "<anonymous>", "(Li10/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$observeComposerStateAndEvents$1", f = "SearchSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchSuggestionsFragment$observeComposerStateAndEvents$1 extends j implements Function2<C6997c<l>, d<? super Unit>, Object> {
    final /* synthetic */ I $shouldShowShimmer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchSuggestionsFragment this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$observeComposerStateAndEvents$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, SearchSuggestionsFragment.class, "showShimmer", "showShimmer()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SearchSuggestionsFragment) this.receiver).showShimmer();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment$observeComposerStateAndEvents$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ C6997c<l> $state;
        final /* synthetic */ SearchSuggestionsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SearchSuggestionsFragment searchSuggestionsFragment, C6997c<l> c6997c) {
            super(1);
            this.this$0 = searchSuggestionsFragment;
            this.$state = c6997c;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            ActiveSearchBarVO updatedSearchBarVO;
            StaticNavBarModel navBarModel;
            NavBarViewDelegate navBarViewDelegate;
            SearchBarViewDelegate searchBarViewDelegate;
            SearchBarViewDelegate searchBarViewDelegate2;
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.showComposer();
            updatedSearchBarVO = this.this$0.getUpdatedSearchBarVO(this.$state);
            if (updatedSearchBarVO != null) {
                SearchSuggestionsFragment searchSuggestionsFragment = this.this$0;
                navBarModel = searchSuggestionsFragment.getNavBarModel();
                searchSuggestionsFragment._navBarModel = StaticNavBarModel.copy$default(navBarModel, updatedSearchBarVO, false, false, false, null, null, null, 126, null);
                navBarViewDelegate = searchSuggestionsFragment.navBarViewDelegate;
                if (navBarViewDelegate != null) {
                    navBarViewDelegate.setSearchHint(updatedSearchBarVO.getHint());
                }
                searchBarViewDelegate = searchSuggestionsFragment.searchBarViewDelegate;
                if (searchBarViewDelegate != null) {
                    searchBarViewDelegate.updateSearchModel(updatedSearchBarVO);
                }
                searchBarViewDelegate2 = searchSuggestionsFragment.searchBarViewDelegate;
                if (searchBarViewDelegate2 != null) {
                    searchBarViewDelegate2.updatePhotoSearchIconVisibility(updatedSearchBarVO.getSearchByImage());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSuggestionsFragment$observeComposerStateAndEvents$1(I i11, SearchSuggestionsFragment searchSuggestionsFragment, d<? super SearchSuggestionsFragment$observeComposerStateAndEvents$1> dVar) {
        super(2, dVar);
        this.$shouldShowShimmer = i11;
        this.this$0 = searchSuggestionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchSuggestionsFragment$observeComposerStateAndEvents$1 searchSuggestionsFragment$observeComposerStateAndEvents$1 = new SearchSuggestionsFragment$observeComposerStateAndEvents$1(this.$shouldShowShimmer, this.this$0, dVar);
        searchSuggestionsFragment$observeComposerStateAndEvents$1.L$0 = obj;
        return searchSuggestionsFragment$observeComposerStateAndEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C6997c<l> c6997c, d<? super Unit> dVar) {
        return ((SearchSuggestionsFragment$observeComposerStateAndEvents$1) create(c6997c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r0 = r4.this$0.searchBarViewDelegate;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchBarViewDelegate searchBarViewDelegate;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C6997c c6997c = (C6997c) this.L$0;
        if (c6997c.o().c() != null) {
            this.$shouldShowShimmer.f71783a = true;
        }
        if (!c6997c.o().b().c() && searchBarViewDelegate != null) {
            searchBarViewDelegate.observePrefetchLoad(new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0, c6997c));
        }
        return Unit.f71690a;
    }
}
