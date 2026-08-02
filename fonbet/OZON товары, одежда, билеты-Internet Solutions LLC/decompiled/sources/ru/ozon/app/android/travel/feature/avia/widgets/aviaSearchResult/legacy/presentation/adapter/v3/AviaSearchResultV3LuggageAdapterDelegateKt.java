package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\t0\b20\u0010\u0007\u001a,\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0000H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function4;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "onBadgeSelectedListener", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/LuggageTabVO;", "aviaSearchResultV3BonusAdapterDelegate", "(Lfd/o;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV3LuggageAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO>> aviaSearchResultV3BonusAdapterDelegate(@NotNull InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> onBadgeSelectedListener) {
        Intrinsics.checkNotNullParameter(onBadgeSelectedListener, "onBadgeSelectedListener");
        return new DslViewBindingListAdapterDelegate(AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1.INSTANCE, AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2(onBadgeSelectedListener), AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
