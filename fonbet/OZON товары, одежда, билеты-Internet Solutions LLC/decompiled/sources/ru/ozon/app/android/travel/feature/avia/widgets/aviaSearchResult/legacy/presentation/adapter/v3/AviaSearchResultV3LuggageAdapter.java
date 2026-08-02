package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.avia.R$layout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u00120\u0010\n\u001a,\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/v3/AviaSearchResultV3LuggageAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "Lkotlin/Function4;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "onBadgeSelectedListener", "<init>", "(Lfd/o;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV3LuggageAdapter extends AsyncListDifferDelegationAdapter<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV3LuggageAdapter(@NotNull InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> onBadgeSelectedListener) {
        super(new i.d<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3LuggageAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO oldItem, AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO oldItem, AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(onBadgeSelectedListener, "onBadgeSelectedListener");
        this.delegatesManager.addDelegate(R$layout.view_luggage_tab_v3, AviaSearchResultV3LuggageAdapterDelegateKt.aviaSearchResultV3BonusAdapterDelegate(onBadgeSelectedListener));
    }
}
