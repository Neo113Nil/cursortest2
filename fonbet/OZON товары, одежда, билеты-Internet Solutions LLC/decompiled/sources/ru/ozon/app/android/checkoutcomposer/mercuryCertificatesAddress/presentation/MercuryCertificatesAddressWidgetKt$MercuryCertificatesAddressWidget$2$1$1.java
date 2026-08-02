package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.ViewIntent;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.MercuryCertificatesAddressVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$2$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ MercuryCertificatesAddressVO $state;
    final /* synthetic */ MercuryCertificatesAddressViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressWidgetKt$MercuryCertificatesAddressWidget$2$1$1(MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel, MercuryCertificatesAddressVO mercuryCertificatesAddressVO) {
        super(1);
        this.$viewModel = mercuryCertificatesAddressViewModel;
        this.$state = mercuryCertificatesAddressVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$viewModel.onViewIntent$checkout_prodGoogleAllVendorsRelease(new ViewIntent.AddressInputUpdated(this.$state.getSearchAction(), value));
    }
}
