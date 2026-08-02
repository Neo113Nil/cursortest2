package ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.content;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.DatesElementVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DateSlotViewHolder$bind$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ DatesElementVO.DateVO $item;
    final /* synthetic */ DateSlotViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateSlotViewHolder$bind$1(DatesElementVO.DateVO dateVO, DateSlotViewHolder dateSlotViewHolder) {
        super(1);
        this.$item = dateVO;
        this.this$0 = dateSlotViewHolder;
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
        Intrinsics.checkNotNullParameter(it, "it");
        CommonControlSettings common = this.$item.getWrapper().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null) {
            return;
        }
        function1 = this.this$0.clickListener;
        function1.invoke(atomAction);
    }
}
