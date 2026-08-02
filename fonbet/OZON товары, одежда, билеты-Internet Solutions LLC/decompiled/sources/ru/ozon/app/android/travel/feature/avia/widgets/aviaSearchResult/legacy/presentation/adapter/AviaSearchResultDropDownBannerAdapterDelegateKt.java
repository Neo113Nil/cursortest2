package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u001a6\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006H\u0000¨\u0006\u000b"}, d2 = {"aviaSearchResultDropDownBannerAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "onBannerClickedListener", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/DropDownBannerItem;", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultDropDownBannerAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AviaSearchResultVO.AviaSearchResultItemVO>> aviaSearchResultDropDownBannerAdapterDelegate(@NotNull Function2<? super AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem, ? super Integer, Unit> onBannerClickedListener) {
        Intrinsics.checkNotNullParameter(onBannerClickedListener, "onBannerClickedListener");
        return new DslViewBindingListAdapterDelegate(AviaSearchResultDropDownBannerAdapterDelegateKt$aviaSearchResultDropDownBannerAdapterDelegate$1.INSTANCE, AviaSearchResultDropDownBannerAdapterDelegateKt$aviaSearchResultDropDownBannerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AviaSearchResultDropDownBannerAdapterDelegateKt$aviaSearchResultDropDownBannerAdapterDelegate$2(onBannerClickedListener), AviaSearchResultDropDownBannerAdapterDelegateKt$aviaSearchResultDropDownBannerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
