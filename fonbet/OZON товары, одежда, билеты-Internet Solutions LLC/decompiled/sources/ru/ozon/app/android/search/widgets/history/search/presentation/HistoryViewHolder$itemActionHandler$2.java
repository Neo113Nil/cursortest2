package ru.ozon.app.android.search.widgets.history.search.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.commonTapTags.DialogSearchHistoryTapTagClickKey;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HistoryViewHolder$itemActionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ HistoryViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewHolder$itemActionHandler$2(HistoryViewHolder historyViewHolder) {
        super(1);
        this.this$0 = historyViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        ComposerReferences composerReferences;
        HistoryViewModel historyViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.d(action.getLink(), "refreshWidgetAsync")) {
            historyViewModel = this.this$0.historyViewModel;
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = U.c();
            }
            HistoryVO boundData = this.this$0.getBoundData();
            Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
            HistoryVO boundData2 = this.this$0.getBoundData();
            historyViewModel.processAsyncEvent(params, valueOf, boundData2 != null ? boundData2.getAsyncData() : null);
        }
        if (Intrinsics.d(action.getId(), "applyTextSearchTapTag")) {
            this.this$0.applyTapTag(action);
        }
        if (Intrinsics.d(action.getId(), "applyHistoryTag")) {
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().update(new DialogSearchHistoryTapTagClickKey(action));
        }
    }
}
