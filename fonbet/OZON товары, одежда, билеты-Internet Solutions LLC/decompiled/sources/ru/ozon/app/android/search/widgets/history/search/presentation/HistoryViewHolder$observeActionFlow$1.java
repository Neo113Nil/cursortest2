package ru.ozon.app.android.search.widgets.history.search.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.commonTapTags.DialogSearchClearHistory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewHolder$observeActionFlow$1", f = "HistoryViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewHolder$observeActionFlow$1 extends j implements Function2<ActiveSearchBarViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$observeActionFlow$1(HistoryViewHolder historyViewHolder, d<? super HistoryViewHolder$observeActionFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HistoryViewHolder$observeActionFlow$1 historyViewHolder$observeActionFlow$1 = new HistoryViewHolder$observeActionFlow$1(this.this$0, dVar);
        historyViewHolder$observeActionFlow$1.L$0 = obj;
        return historyViewHolder$observeActionFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((ActiveSearchBarViewModel.Action) this.L$0) instanceof ActiveSearchBarViewModel.Action.SilentRefresh) {
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().update(DialogSearchClearHistory.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActiveSearchBarViewModel.Action action, d<? super Unit> dVar) {
        return ((HistoryViewHolder$observeActionFlow$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
