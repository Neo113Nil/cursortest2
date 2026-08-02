package ru.ozon.app.android.search.widgets.history.search.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HistoryViewHolder$clearButtonActionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$clearButtonActionHandler$1(HistoryViewHolder historyViewHolder) {
        super(1);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        CommonControlSettings common;
        AtomActionDTO action;
        String link;
        Map<String, String> params;
        ActiveSearchBarViewModel activeSearchBarViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        HistoryVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            HistoryViewHolder historyViewHolder = this.this$0;
            ButtonV3DTO deleteButton = boundData.getDeleteButton();
            if (deleteButton == null || (common = deleteButton.getCommon()) == null || (action = common.getAction()) == null || (link = action.getLink()) == null || (params = action.getParams()) == null) {
                return;
            }
            activeSearchBarViewModel = historyViewHolder.searchBarViewModel;
            activeSearchBarViewModel.onRemoveAllHistory(params, link);
        }
    }
}
