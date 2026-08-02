package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewObject.ItemVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnCreationItemViewHolder$actionSelect$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ReturnCreationItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationItemViewHolder$actionSelect$1(ReturnCreationItemViewHolder returnCreationItemViewHolder) {
        super(0);
        this.this$0 = returnCreationItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CommonControlSettings common;
        AtomActionDTO action;
        Function1 function1;
        CommonControlSettings common2;
        ItemVO boundedData = this.this$0.getBoundedData();
        if (boundedData != null && (common = boundedData.getCommon()) != null && (action = common.getAction()) != null) {
            ItemVO boundedData2 = this.this$0.getBoundedData();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, (boundedData2 == null || (common2 = boundedData2.getCommon()) == null) ? null : common2.getTrackingInfo());
            if (atomAction != null) {
                function1 = this.this$0.actionHandler;
                function1.invoke(atomAction);
                return Unit.f71690a;
            }
        }
        return null;
    }
}
