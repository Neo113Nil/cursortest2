package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppType $appType;
    final /* synthetic */ CommonBarcodeV2VO $item;
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ CommonBarcodeV2ViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonBarcodeV2ComposableKt$CommonBarcodeV2Composable$2(CommonBarcodeV2VO commonBarcodeV2VO, CommonBarcodeV2ViewModel commonBarcodeV2ViewModel, AppType appType, String str, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$item = commonBarcodeV2VO;
        this.$viewModel = commonBarcodeV2ViewModel;
        this.$appType = appType;
        this.$miniAppName = str;
        this.$onAction = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CommonBarcodeV2ComposableKt.CommonBarcodeV2Composable(this.$item, this.$viewModel, this.$appType, this.$miniAppName, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
