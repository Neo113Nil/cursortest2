package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/luggage/AdditionalLuggageV2FlightSegmentsAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "", "onLuggageOptionClicked", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function2;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2FlightSegmentsAdapter extends CoroutineListDifferAdapter<AdditionalLuggageV2VO.LuggageItem> {

    @NotNull
    private final Function2<Integer, AdditionalLuggageV2VO.LuggageOptionItem, Unit> onLuggageOptionClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalLuggageV2FlightSegmentsAdapter(@NotNull Function2<? super Integer, ? super AdditionalLuggageV2VO.LuggageOptionItem, Unit> onLuggageOptionClicked) {
        super(new AdditionalLuggageV2FlightSegmentItemCallback());
        Intrinsics.checkNotNullParameter(onLuggageOptionClicked, "onLuggageOptionClicked");
        this.onLuggageOptionClicked = onLuggageOptionClicked;
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        this.delegatesManager.addDelegate(AdditionalLuggageV2RouteAdapterDelegateKt.additionalLuggageV2RouteAdapterDelegate()).addDelegate(AdditionalLuggageV2BaseTariffInfoAdapterDelegateKt.additionalLuggageV2BaseTariffInfoAdapterDelegate(roundedBackgroundProducer)).addDelegate(AdditionalLuggageV2HeaderAdapterDelegateKt.additionalLuggageV2HeaderAdapterDelegate(roundedBackgroundProducer)).addDelegate(R$layout.item_luggage_option_v2, AdditionalLuggageV2OptionAdapterDelegateKt.additionalLuggageV2OptionAdapterDelegate()).addDelegate(AdditionalLuggageV2InfoAdapterDelegateKt.additionalLuggageV2InfoAdapterDelegate()).addDelegate(AdditionalLuggageV2TransportationDelegateKt.additionalLuggageV2TransportationDelegate(roundedBackgroundProducer)).addDelegate(AdditionalLuggageV2BottomAdapterDelegateKt.additionalLuggageV2BottomAdapterDelegate(roundedBackgroundProducer));
    }

    @Override // ru.ozon.app.android.adapterdelegates.AbsDelegationAdapter, androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        if (holder.getItemViewType() == R$layout.item_luggage_option_v2) {
            Object obj = ((List) this.items).get(position);
            AdditionalLuggageV2VO.LuggageOptionItem luggageOptionItem = obj instanceof AdditionalLuggageV2VO.LuggageOptionItem ? (AdditionalLuggageV2VO.LuggageOptionItem) obj : null;
            if (luggageOptionItem == null) {
                return;
            }
            View view = holder.itemView;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            KeyEvent.Callback childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            CellWithSubtitleCheckboxRadioCounterView cellWithSubtitleCheckboxRadioCounterView = childAt instanceof CellWithSubtitleCheckboxRadioCounterView ? (CellWithSubtitleCheckboxRadioCounterView) childAt : null;
            if (cellWithSubtitleCheckboxRadioCounterView != null) {
                cellWithSubtitleCheckboxRadioCounterView.setOnCheckedChangeListener(new AdditionalLuggageV2FlightSegmentsAdapter$onBindViewHolder$1(this, holder, luggageOptionItem));
            }
        }
    }
}
