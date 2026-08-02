package ru.ozon.app.android.search.widgets.history.search.presentation;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HistoryViewHolder$itemActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$itemActionHandler$1(HistoryViewHolder historyViewHolder) {
        super(1);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction action) {
        boolean z11;
        List<HistoryItem> historyItems;
        HistoryViewModel historyViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            if (Intrinsics.d(composerAction.getActionName(), "deleteSearchHistory") || Intrinsics.d(composerAction.getActionName(), "deleteCatalogHistory")) {
                Map<String, String> params = composerAction.getParams();
                if (params == null) {
                    return Boolean.FALSE;
                }
                HistoryVO boundData = this.this$0.getBoundData();
                if (boundData == null || (historyItems = boundData.getHistoryItems()) == null) {
                    return Boolean.FALSE;
                }
                historyViewModel = this.this$0.historyViewModel;
                String actionName = composerAction.getActionName();
                HistoryVO boundData2 = this.this$0.getBoundData();
                historyViewModel.onRemoveTagHistory(params, actionName, historyItems, boundData2 != null ? Long.valueOf(boundData2.getId()) : null);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
