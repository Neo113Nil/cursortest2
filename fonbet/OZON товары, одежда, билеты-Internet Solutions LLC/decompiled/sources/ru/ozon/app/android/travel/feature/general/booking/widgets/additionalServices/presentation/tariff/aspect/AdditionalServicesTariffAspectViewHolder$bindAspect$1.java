package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.aspect;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AdditionalServicesTariffAspectViewHolder$bindAspect$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AdditionalServicesTariffAspectVO $item;
    final /* synthetic */ AdditionalServicesTariffAspectViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalServicesTariffAspectViewHolder$bindAspect$1(AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO, AdditionalServicesTariffAspectViewHolder additionalServicesTariffAspectViewHolder) {
        super(1);
        this.$item = additionalServicesTariffAspectVO;
        this.this$0 = additionalServicesTariffAspectViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        int i11;
        Function1 function12;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(it, "it");
        CommonControlSettings common = this.$item.getAspect().getCommon();
        function1 = this.this$0.onTariffActionWrapperClicked;
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo());
        i11 = this.this$0.cellId;
        AdditionalServicesTariffAspectVO additionalServicesTariffAspectVO = this.$item;
        function12 = this.this$0.actionHandler;
        function1.invoke(new AdditionalServicesTariffActionWrapper(atomAction, i11, additionalServicesTariffAspectVO, function12));
    }
}
