package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CommonBarcodeV2VO $item;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$1$1$1(CommonBarcodeV2VO commonBarcodeV2VO, Function1<? super AtomAction, Unit> function1) {
        super(0);
        this.$item = commonBarcodeV2VO;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction atomAction;
        CommonControlSettings common = this.$item.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        this.$onAction.invoke(atomAction);
    }
}
