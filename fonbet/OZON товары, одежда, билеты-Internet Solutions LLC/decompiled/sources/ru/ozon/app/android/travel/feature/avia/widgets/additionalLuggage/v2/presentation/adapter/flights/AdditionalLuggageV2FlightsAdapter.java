package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.emptyState.AdditionalLuggageV2EmptyStateAdapterDelegateKt;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.skeleton.AdditionalLuggageV2SkeletonAdapterDelegateKt;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import xe.M;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/AdditionalLuggageV2FlightsAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "Lxe/M;", "scope", "Landroidx/recyclerview/widget/RecyclerView$u;", "recyclerViewPool", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "", "onLuggageOptionClicked", "Lkotlin/Function1;", "", "onVerticalScrollListener", "radiusCompensation", "<init>", "(Lxe/M;Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;I)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2FlightsAdapter extends CoroutineListDifferAdapter<AdditionalLuggageV2VO.FlightItem> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalLuggageV2FlightsAdapter(@NotNull M scope, @NotNull RecyclerView.u recyclerViewPool, @NotNull Function2<? super Integer, ? super AdditionalLuggageV2VO.LuggageOptionItem, Unit> onLuggageOptionClicked, @NotNull Function1<? super Boolean, Unit> onVerticalScrollListener, int i11) {
        super(new AdditionalLuggageV2FlightItemCallback());
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(recyclerViewPool, "recyclerViewPool");
        Intrinsics.checkNotNullParameter(onLuggageOptionClicked, "onLuggageOptionClicked");
        Intrinsics.checkNotNullParameter(onVerticalScrollListener, "onVerticalScrollListener");
        this.delegatesManager.addDelegate(AdditionalLuggageV2EmptyStateAdapterDelegateKt.additionalLuggageV2EmptyStateAdapterDelegate());
        this.delegatesManager.addDelegate(AdditionalLuggageV2SkeletonAdapterDelegateKt.additionalLuggageV2SkeletonAdapterDelegate());
        this.delegatesManager.addDelegate(AdditionalLuggageV2FlightsAdapterDelegateKt.additionalLuggageV2FlightsAdapterDelegate(scope, recyclerViewPool, onLuggageOptionClicked, onVerticalScrollListener, i11));
    }
}
