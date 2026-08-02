package ru.ozon.app.android.ugc.core.widgets.stickyCell.core;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellVO;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellViewModel;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class StickyCellComposeWidgetKt$StickyCellWidget$1$3$3$1$1$1 extends AbstractC7737t implements Function1<b, Unit> {
    final /* synthetic */ i<StickyCellVO> $this_content;
    final /* synthetic */ StickyCellViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyCellComposeWidgetKt$StickyCellWidget$1$3$3$1$1$1(i<StickyCellVO> iVar, StickyCellViewModel stickyCellViewModel) {
        super(1);
        this.$this_content = iVar;
        this.$viewModel = stickyCellViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b action) {
        String shownKey;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.ViewAction) || Intrinsics.d(action.getId(), "hideStickyCell") || (shownKey = this.$this_content.b().getShownKey()) == null) {
            return;
        }
        this.$viewModel.hideStickyCell(shownKey);
    }
}
