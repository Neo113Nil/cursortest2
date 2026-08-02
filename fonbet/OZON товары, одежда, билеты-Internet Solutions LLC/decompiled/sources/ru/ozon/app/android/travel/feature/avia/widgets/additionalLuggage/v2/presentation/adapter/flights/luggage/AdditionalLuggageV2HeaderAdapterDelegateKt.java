package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000*\f\b\u0002\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\b"}, d2 = {"LuggageHeaderItem", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageHeaderItem;", "additionalLuggageV2HeaderAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "backgroundProducer", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2HeaderAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AdditionalLuggageV2VO.LuggageItem>> additionalLuggageV2HeaderAdapterDelegate(@NotNull RoundedBackgroundProducer backgroundProducer) {
        Intrinsics.checkNotNullParameter(backgroundProducer, "backgroundProducer");
        return new DslViewBindingListAdapterDelegate(AdditionalLuggageV2HeaderAdapterDelegateKt$additionalLuggageV2HeaderAdapterDelegate$1.INSTANCE, AdditionalLuggageV2HeaderAdapterDelegateKt$additionalLuggageV2HeaderAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AdditionalLuggageV2HeaderAdapterDelegateKt$additionalLuggageV2HeaderAdapterDelegate$2(backgroundProducer), AdditionalLuggageV2HeaderAdapterDelegateKt$additionalLuggageV2HeaderAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
