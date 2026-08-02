package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PromoStickyBubbleViewHolder$processViewEvents$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PromoStickyBubbleV0 $item;
    final /* synthetic */ PromoStickyBubbleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleViewHolder$processViewEvents$2(PromoStickyBubbleV0 promoStickyBubbleV0, PromoStickyBubbleViewHolder promoStickyBubbleViewHolder) {
        super(0);
        this.$item = promoStickyBubbleV0;
        this.this$0 = promoStickyBubbleViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        i iVar;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 actionHandler;
        CommonControlSettings common = this.$item.getCloseButton().getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, null)) != null) {
            actionHandler = this.this$0.getActionHandler();
            actionHandler.invoke(atomAction);
        }
        long id2 = this.$item.getId();
        iVar = this.this$0.container;
        iVar.M().m(id2);
    }
}
