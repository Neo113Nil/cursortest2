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
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u001a2\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0000¨\u0006\n"}, d2 = {"aviaSearchResultBannerAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "onAction", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultBannerAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AviaSearchResultVO.AviaSearchResultItemVO>> aviaSearchResultBannerAdapterDelegate(@NotNull Function2<? super AtomAction, ? super Integer, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return new DslViewBindingListAdapterDelegate(AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$1.INSTANCE, AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$2(onAction), AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
