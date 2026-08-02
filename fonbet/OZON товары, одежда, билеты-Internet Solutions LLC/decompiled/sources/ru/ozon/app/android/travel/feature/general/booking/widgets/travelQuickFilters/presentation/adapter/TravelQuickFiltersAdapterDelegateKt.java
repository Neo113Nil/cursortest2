package ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0000¨\u0006\t"}, d2 = {"travelQuickFiltersAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelQuickFiltersAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AtomDTO>> travelQuickFiltersAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return new DslViewBindingListAdapterDelegate(new TravelQuickFiltersAdapterDelegateKt$travelQuickFiltersAdapterDelegate$1(onAction), TravelQuickFiltersAdapterDelegateKt$travelQuickFiltersAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, TravelQuickFiltersAdapterDelegateKt$travelQuickFiltersAdapterDelegate$2.INSTANCE, TravelQuickFiltersAdapterDelegateKt$travelQuickFiltersAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
