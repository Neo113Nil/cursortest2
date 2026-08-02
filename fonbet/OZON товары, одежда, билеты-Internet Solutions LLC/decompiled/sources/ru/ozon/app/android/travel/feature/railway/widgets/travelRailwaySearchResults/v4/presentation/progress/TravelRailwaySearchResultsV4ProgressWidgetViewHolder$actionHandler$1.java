package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4ProgressWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ TravelRailwaySearchResultsV4ProgressWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV4ProgressWidgetViewHolder$actionHandler$1(TravelRailwaySearchResultsV4ProgressWidgetViewHolder travelRailwaySearchResultsV4ProgressWidgetViewHolder) {
        super(1);
        this.this$0 = travelRailwaySearchResultsV4ProgressWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        TravelRailwaySearchResultsV4ProgressViewModel travelRailwaySearchResultsV4ProgressViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        travelRailwaySearchResultsV4ProgressViewModel = this.this$0.viewModel;
        travelRailwaySearchResultsV4ProgressViewModel.performAction(it.getActionName(), it.getParams());
    }
}
