package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0000¨\u0006\t"}, d2 = {"travelPaymentV3PaymentsCardAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPaymentV3PaymentsCardAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TravelPaymentV3VO.PaymentMethodItemVO>> travelPaymentV3PaymentsCardAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return new DslViewBindingListAdapterDelegate(TravelPaymentV3PaymentsCardAdapterDelegateKt$travelPaymentV3PaymentsCardAdapterDelegate$1.INSTANCE, TravelPaymentV3PaymentsCardAdapterDelegateKt$travelPaymentV3PaymentsCardAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new TravelPaymentV3PaymentsCardAdapterDelegateKt$travelPaymentV3PaymentsCardAdapterDelegate$2(onAction), TravelPaymentV3PaymentsCardAdapterDelegateKt$travelPaymentV3PaymentsCardAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
