package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import xe.M;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\f\b\u0002\u0010\u0013\"\u00020\u00122\u00020\u0012¨\u0006\u0014"}, d2 = {"Lxe/M;", "scope", "Landroidx/recyclerview/widget/RecyclerView$u;", "recyclerViewPool", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "", "onLuggageOptionClicked", "Lkotlin/Function1;", "", "onVerticalScrollListener", "radiusCompensation", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "additionalLuggageV2FlightsAdapterDelegate", "(Lxe/M;Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;I)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "FlightVO", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2FlightsAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AdditionalLuggageV2VO.FlightItem>> additionalLuggageV2FlightsAdapterDelegate(@NotNull M scope, @NotNull RecyclerView.u recyclerViewPool, @NotNull Function2<? super Integer, ? super AdditionalLuggageV2VO.LuggageOptionItem, Unit> onLuggageOptionClicked, @NotNull Function1<? super Boolean, Unit> onVerticalScrollListener, int i11) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(recyclerViewPool, "recyclerViewPool");
        Intrinsics.checkNotNullParameter(onLuggageOptionClicked, "onLuggageOptionClicked");
        Intrinsics.checkNotNullParameter(onVerticalScrollListener, "onVerticalScrollListener");
        return new DslViewBindingListAdapterDelegate(AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$1.INSTANCE, AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2(onLuggageOptionClicked, recyclerViewPool, i11, onVerticalScrollListener, scope), AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
