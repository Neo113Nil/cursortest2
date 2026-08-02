package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterSharedViewModel;
import ru.ozon.app.android.utils.WhenExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1", f = "SuggestionWithFilterViewHolder.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuggestionWithFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder, d<? super SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = suggestionWithFilterViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            suggestionWithFilterSharedViewModel = this.this$0.viewModel;
            InterfaceC2395h<SuggestionWithFilterSharedViewModel.PresentationEvents> presentationEventsFlow = suggestionWithFilterSharedViewModel.getPresentationEventsFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (presentationEventsFlow.collect(anonymousClass1, this) == aVar) {
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
        return ((SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents;", "it", "", "emit", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterSharedViewModel$PresentationEvents;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements InterfaceC2397i {
        final /* synthetic */ SuggestionWithFilterViewHolder this$0;

        AnonymousClass1(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder) {
            this.this$0 = suggestionWithFilterViewHolder;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(SuggestionWithFilterSharedViewModel.PresentationEvents presentationEvents, d<? super Unit> dVar) {
            SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1 suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1;
            int i11;
            Object showOnboardingWithDebounce;
            if (dVar instanceof SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1) {
                suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1 = (SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1) dVar;
                int i12 = suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        if (!(presentationEvents instanceof SuggestionWithFilterSharedViewModel.PresentationEvents.ShowOnboarding)) {
                            throw new o();
                        }
                        SuggestionWithFilterViewHolder suggestionWithFilterViewHolder = this.this$0;
                        suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.label = 1;
                        showOnboardingWithDebounce = suggestionWithFilterViewHolder.showOnboardingWithDebounce(suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1);
                        if (showOnboardingWithDebounce == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    WhenExtKt.getExhaustive(unit);
                    return unit;
                }
            }
            suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1 = new SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1(this, dVar);
            Object obj2 = suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.result;
            a aVar2 = a.COROUTINE_SUSPENDED;
            i11 = suggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1.label;
            if (i11 != 0) {
            }
            Unit unit2 = Unit.f71690a;
            WhenExtKt.getExhaustive(unit2);
            return unit2;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((SuggestionWithFilterSharedViewModel.PresentationEvents) obj, (d<? super Unit>) dVar);
        }
    }
}
