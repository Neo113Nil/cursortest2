package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.TravelDocumentsToEmailViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TravelDocumentsToEmailListWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ TravelDocumentsToEmailListWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelDocumentsToEmailListWidgetViewHolder$actionHandler$1(TravelDocumentsToEmailListWidgetViewHolder travelDocumentsToEmailListWidgetViewHolder) {
        super(1);
        this.this$0 = travelDocumentsToEmailListWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        TravelDocumentsToEmailViewModel travelDocumentsToEmailViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        travelDocumentsToEmailViewModel = this.this$0.viewModel;
        String actionName = it.getActionName();
        Map<String, String> params = it.getParams();
        if (params == null) {
            params = U.c();
        }
        travelDocumentsToEmailViewModel.performAction(actionName, params);
    }
}
