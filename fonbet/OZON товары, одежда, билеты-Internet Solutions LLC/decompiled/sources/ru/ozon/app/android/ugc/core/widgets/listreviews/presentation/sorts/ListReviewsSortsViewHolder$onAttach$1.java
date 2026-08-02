package ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ListReviewsSortsViewHolder$onAttach$1 extends AbstractC7737t implements Function1<ListReviewSortsViewModel.Action, Unit> {
    final /* synthetic */ ListReviewsSortsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListReviewsSortsViewHolder$onAttach$1(ListReviewsSortsViewHolder listReviewsSortsViewHolder) {
        super(1);
        this.this$0 = listReviewsSortsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ListReviewSortsViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ListReviewSortsViewModel.Action action) {
        ComposerReferences composerReferences;
        ReviewsSortsBottomSheetDialogFragment reviewsSortsBottomSheetDialogFragment;
        ComposerReferences composerReferences2;
        ReviewsSortsBottomSheetDialogFragment reviewsSortsBottomSheetDialogFragment2;
        Function1 function1;
        composerReferences = this.this$0.references;
        TokenizedAnalyticsExtKt.processNonViewEvents(composerReferences.getTokenizedAnalytics(), action.getEvent());
        if (action instanceof ListReviewSortsViewModel.Action.SortAction) {
            reviewsSortsBottomSheetDialogFragment2 = this.this$0.sortsFragment;
            if (reviewsSortsBottomSheetDialogFragment2 != null) {
                reviewsSortsBottomSheetDialogFragment2.dismiss();
            }
            function1 = this.this$0.actionHandler;
            function1.invoke(((ListReviewSortsViewModel.Action.SortAction) action).getAction());
            return;
        }
        if (!(action instanceof ListReviewSortsViewModel.Action.SortDeeplink)) {
            throw new o();
        }
        reviewsSortsBottomSheetDialogFragment = this.this$0.sortsFragment;
        if (reviewsSortsBottomSheetDialogFragment != null) {
            reviewsSortsBottomSheetDialogFragment.dismiss();
        }
        composerReferences2 = this.this$0.references;
        InterfaceC7851b.a.a(composerReferences2.getController(), ((ListReviewSortsViewModel.Action.SortDeeplink) action).getDeeplink(), null, null, null, 14);
    }
}
