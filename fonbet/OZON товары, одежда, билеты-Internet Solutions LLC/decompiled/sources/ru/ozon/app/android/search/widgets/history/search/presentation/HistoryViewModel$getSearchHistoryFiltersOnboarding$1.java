package ru.ozon.app.android.search.widgets.history.search.presentation;

import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.history.common.data.SearchSuggestionsOnboardingRequest;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryMapper;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.FiltersOnboardingLoaded;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel$getSearchHistoryFiltersOnboarding$1", f = "HistoryViewModel.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewModel$getSearchHistoryFiltersOnboarding$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $id;
    int label;
    final /* synthetic */ HistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewModel$getSearchHistoryFiltersOnboarding$1(HistoryViewModel historyViewModel, Long l11, d<? super HistoryViewModel$getSearchHistoryFiltersOnboarding$1> dVar) {
        super(2, dVar);
        this.this$0 = historyViewModel;
        this.$id = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HistoryViewModel$getSearchHistoryFiltersOnboarding$1(this.this$0, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SearchHistoryRepository searchHistoryRepository;
        Object mo973getSearchSuggestionsOnboardinggIAlus;
        InterfaceC7851b interfaceC7851b;
        HistoryMapper historyMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            searchHistoryRepository = this.this$0.searchHistoryRepository;
            SearchSuggestionsOnboardingRequest searchSuggestionsOnboardingRequest = new SearchSuggestionsOnboardingRequest("search_history_filters");
            this.label = 1;
            mo973getSearchSuggestionsOnboardinggIAlus = searchHistoryRepository.mo973getSearchSuggestionsOnboardinggIAlus(searchSuggestionsOnboardingRequest, this);
            if (mo973getSearchSuggestionsOnboardinggIAlus == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo973getSearchSuggestionsOnboardinggIAlus = ((r) obj).getF26106a();
        }
        HistoryViewModel historyViewModel = this.this$0;
        Long l11 = this.$id;
        r.Companion companion = r.INSTANCE;
        if (!(mo973getSearchSuggestionsOnboardinggIAlus instanceof r.b)) {
            interfaceC7851b = historyViewModel.composerController;
            long longValue = l11.longValue();
            historyMapper = historyViewModel.mapper;
            interfaceC7851b.update(new FiltersOnboardingLoaded(longValue, historyMapper.mapFiltersOnboardingToVO((HistoryDTO.Onboarding) mo973getSearchSuggestionsOnboardinggIAlus)));
        }
        a.b bVar = Lm0.a.f17149a;
        Throwable b11 = r.b(mo973getSearchSuggestionsOnboardinggIAlus);
        if (b11 != null) {
            bVar.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HistoryViewModel$getSearchHistoryFiltersOnboarding$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
