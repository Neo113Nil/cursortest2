package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesControlActionWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesCellViewHolder$bindButton$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AdditionalServicesCellVO.ControlType.Button $button;
    final /* synthetic */ int $cellId;
    final /* synthetic */ AdditionalServicesCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesCellViewHolder$bindButton$1$1(AdditionalServicesCellVO.ControlType.Button button, AdditionalServicesCellViewHolder additionalServicesCellViewHolder, int i11) {
        super(1);
        this.$button = button;
        this.this$0 = additionalServicesCellViewHolder;
        this.$cellId = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        AtomActionDTO action;
        AtomAction atomAction;
        Function1 function1;
        Function1 function12;
        Intrinsics.checkNotNullParameter(it, "it");
        CommonControlSettings common = this.$button.getButtonV3DTO().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        AdditionalServicesCellViewHolder additionalServicesCellViewHolder = this.this$0;
        int i11 = this.$cellId;
        function1 = additionalServicesCellViewHolder.onControlActionWrapperClicked;
        function1.invoke(new AdditionalServicesControlActionWrapper.Button(atomAction, i11));
        function12 = additionalServicesCellViewHolder.actionHandler;
        function12.invoke(atomAction);
    }
}
