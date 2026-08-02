package ru.ozon.app.android.button.presentation.adapter;

import a00.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.button.actions.BaseActionConfig;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.button.presentation.ActionButtonVO;
import ru.ozon.app.android.button.presentation.adapter.ButtonsAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ButtonsAdapter$ButtonViewHolder$bind$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ActionButtonVO.Button $item;
    final /* synthetic */ Long $widgetId;
    final /* synthetic */ ButtonsAdapter.ButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonsAdapter$ButtonViewHolder$bind$1$1(ButtonsAdapter.ButtonViewHolder buttonViewHolder, ActionButtonVO.Button button, Long l11) {
        super(1);
        this.this$0 = buttonViewHolder;
        this.$item = button;
        this.$widgetId = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Map map;
        h hVar;
        Intrinsics.checkNotNullParameter(it, "it");
        map = this.this$0.actions;
        BaseActionConfig baseActionConfig = (BaseActionConfig) map.get(this.$item.getType());
        if (baseActionConfig != null) {
            ActionButtonDTO.ButtonsItem.Action action = this.$item.getAction();
            hVar = this.this$0.viewModelOwnerProvider;
            baseActionConfig.onAction(action, hVar, this.$widgetId);
        }
    }
}
