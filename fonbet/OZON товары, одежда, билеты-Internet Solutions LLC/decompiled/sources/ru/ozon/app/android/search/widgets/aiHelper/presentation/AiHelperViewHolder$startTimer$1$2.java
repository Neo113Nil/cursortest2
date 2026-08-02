package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AiHelperViewHolder$startTimer$1$2 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ AiHelperVO $item;
    final /* synthetic */ AiHelperViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AiHelperViewHolder$startTimer$1$2(AiHelperViewHolder aiHelperViewHolder, AiHelperVO aiHelperVO) {
        super(1);
        this.this$0 = aiHelperViewHolder;
        this.$item = aiHelperVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        SearchAiViewModel searchAiViewModel;
        Map<String, String> params;
        searchAiViewModel = this.this$0.viewModel;
        AtomActionDTO pollingAction = this.$item.getPollingAction();
        String str = (pollingAction == null || (params = pollingAction.getParams()) == null) ? null : params.get("aiResultId");
        if (str == null) {
            str = "";
        }
        searchAiViewModel.pollSearchAi(str);
    }
}
