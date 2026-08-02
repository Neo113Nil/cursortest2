package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "changedVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OpenRangeFilterView$bind$1 extends AbstractC7737t implements Function1<OpenRangeFilterVO, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ OpenRangeFilterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OpenRangeFilterView$bind$1(OpenRangeFilterView openRangeFilterView, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.this$0 = openRangeFilterView;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OpenRangeFilterVO openRangeFilterVO) {
        invoke2(openRangeFilterVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OpenRangeFilterVO changedVO) {
        AtomActionDTO extractAction;
        Intrinsics.checkNotNullParameter(changedVO, "changedVO");
        OpenRangeFilterView openRangeFilterView = this.this$0;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        CommonControlSettings common = changedVO.getCommon();
        extractAction = openRangeFilterView.extractAction(common != null ? common.getAction() : null, changedVO);
        if (extractAction != null) {
            CommonControlSettings common2 = changedVO.getCommon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(extractAction, common2 != null ? common2.getTrackingInfo() : null);
            if (atomAction != null) {
                function1.invoke(atomAction);
            }
        }
    }
}
