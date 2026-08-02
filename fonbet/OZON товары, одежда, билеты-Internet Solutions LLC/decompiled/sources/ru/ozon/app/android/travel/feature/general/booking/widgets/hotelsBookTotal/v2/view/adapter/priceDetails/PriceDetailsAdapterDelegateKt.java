package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.adapter.priceDetails;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a,\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u00050\u00040\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000*\f\b\u0002\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\n"}, d2 = {"PriceDetailsItem", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "priceDetailsAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/adapter/priceDetails/PriceDetailsItem;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PriceDetailsAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<HotelsBookTotalV2VO.PriceDetailItemVO>> priceDetailsAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return new DslViewBindingListAdapterDelegate(PriceDetailsAdapterDelegateKt$priceDetailsAdapterDelegate$1.INSTANCE, PriceDetailsAdapterDelegateKt$priceDetailsAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new PriceDetailsAdapterDelegateKt$priceDetailsAdapterDelegate$2(actionHandler), PriceDetailsAdapterDelegateKt$priceDetailsAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
