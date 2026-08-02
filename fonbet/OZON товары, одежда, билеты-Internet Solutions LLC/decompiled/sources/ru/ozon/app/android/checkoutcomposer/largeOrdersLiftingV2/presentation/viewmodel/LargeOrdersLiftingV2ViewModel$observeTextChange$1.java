package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel;

import B0.C2454a;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.FloorChangeResultModel;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.InputVO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.LargeOrdersLiftingV2VO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LargeOrdersLiftingV2ViewModel$observeTextChange$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ LargeOrdersLiftingV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LargeOrdersLiftingV2ViewModel$observeTextChange$1(LargeOrdersLiftingV2ViewModel largeOrdersLiftingV2ViewModel) {
        super(1);
        this.this$0 = largeOrdersLiftingV2ViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        LargeOrdersLiftingV2VO largeOrdersLiftingV2VO;
        InputVO input;
        AtomActionDTO textChangeAction;
        V<FloorChangeResultModel> floorChange = this.this$0.getFloorChange();
        largeOrdersLiftingV2VO = this.this$0.vo;
        String link = (largeOrdersLiftingV2VO == null || (input = largeOrdersLiftingV2VO.getInput()) == null || (textChangeAction = input.getTextChangeAction()) == null) ? null : textChangeAction.getLink();
        if (link == null) {
            link = "";
        }
        floorChange.setValue(new FloorChangeResultModel(link, C2454a.b("address_floor", str)));
    }
}
