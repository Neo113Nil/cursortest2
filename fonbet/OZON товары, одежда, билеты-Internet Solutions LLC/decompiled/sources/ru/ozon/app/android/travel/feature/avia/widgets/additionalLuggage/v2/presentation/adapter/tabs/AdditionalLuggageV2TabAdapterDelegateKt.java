package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t*\f\b\u0002\u0010\n\"\u00020\u00062\u00020\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "", "", "onTabClickedListener", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/tabs/PassengerVO;", "additionalLuggageV2TabAdapterDelegate", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "PassengerVO", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2TabAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AdditionalLuggageV2VO.PassengerTabVO>> additionalLuggageV2TabAdapterDelegate(@NotNull Function1<? super Integer, Unit> onTabClickedListener) {
        Intrinsics.checkNotNullParameter(onTabClickedListener, "onTabClickedListener");
        return new DslViewBindingListAdapterDelegate(AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$1.INSTANCE, AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2(onTabClickedListener), AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
