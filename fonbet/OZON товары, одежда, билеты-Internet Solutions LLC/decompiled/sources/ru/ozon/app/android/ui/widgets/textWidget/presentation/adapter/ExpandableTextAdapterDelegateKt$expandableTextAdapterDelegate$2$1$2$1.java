package ru.ozon.app.android.ui.widgets.textWidget.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateLayoutContainerViewHolder;
import ru.ozon.app.android.ui.widgets.textWidget.presentation.TextWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$2$1$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ Function1<TextWidgetVO.TextWidgetItemVO.TextExpandableVO, Unit> $changeExpandedState;
    final /* synthetic */ AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.TextExpandableVO> $this_adapterDelegateLayoutContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExpandableTextAdapterDelegateKt$expandableTextAdapterDelegate$2$1$2$1(AdapterDelegateLayoutContainerViewHolder<TextWidgetVO.TextWidgetItemVO.TextExpandableVO> adapterDelegateLayoutContainerViewHolder, Function1<? super TextWidgetVO.TextWidgetItemVO.TextExpandableVO, Unit> function1, Function1<? super AtomAction, Unit> function12) {
        super(0);
        this.$this_adapterDelegateLayoutContainer = adapterDelegateLayoutContainerViewHolder;
        this.$changeExpandedState = function1;
        this.$actionHandler = function12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomActionDTO action = this.$this_adapterDelegateLayoutContainer.getItem().getText().getAction();
        if (action != null) {
            this.$actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, this.$this_adapterDelegateLayoutContainer.getItem().getText().getTrackingInfo()));
        }
        this.$changeExpandedState.invoke(this.$this_adapterDelegateLayoutContainer.getItem());
    }
}
