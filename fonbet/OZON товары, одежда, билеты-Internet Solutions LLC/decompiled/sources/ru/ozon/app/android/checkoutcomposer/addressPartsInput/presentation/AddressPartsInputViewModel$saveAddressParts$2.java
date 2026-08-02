package ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputResponse;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/addressPartsInput/data/api/AddressPartsInputResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressPartsInputViewModel$saveAddressParts$2 extends AbstractC7737t implements Function1<AddressPartsInputResponse, Unit> {
    final /* synthetic */ boolean $dismiss;
    final /* synthetic */ AddressPartsInputViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressPartsInputViewModel$saveAddressParts$2(boolean z11, AddressPartsInputViewModel addressPartsInputViewModel) {
        super(1);
        this.$dismiss = z11;
        this.this$0 = addressPartsInputViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressPartsInputResponse addressPartsInputResponse) {
        invoke2(addressPartsInputResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressPartsInputResponse addressPartsInputResponse) {
        SingleLiveEvent singleLiveEvent;
        SingleLiveEvent singleLiveEvent2;
        SingleLiveEvent singleLiveEvent3;
        if (this.$dismiss) {
            singleLiveEvent3 = this.this$0.mutableWidgetState;
            singleLiveEvent3.postValue(AddressPartsInputViewModel.WidgetState.Dismiss.INSTANCE);
        } else {
            singleLiveEvent = this.this$0.mutableWidgetState;
            singleLiveEvent.postValue(new AddressPartsInputViewModel.WidgetState.Loading(false));
        }
        singleLiveEvent2 = this.this$0.mutableState;
        singleLiveEvent2.postValue(new AddressPartsInputViewModel.State.Action(AtomActionMapperKt.toAtomAction(addressPartsInputResponse.getAction(), null)));
    }
}
