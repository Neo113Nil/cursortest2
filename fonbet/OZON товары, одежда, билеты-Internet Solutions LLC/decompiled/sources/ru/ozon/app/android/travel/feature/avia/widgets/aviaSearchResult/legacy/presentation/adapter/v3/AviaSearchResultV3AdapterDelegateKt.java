package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00110\u00102\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000720\u0010\u000f\u001a,\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "aviaSearchResultViewPool", "Landroidx/recyclerview/widget/RecyclerView$u;", "luggageViewPool", "Lkotlin/Function4;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onBadgeSelectedListener", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "aviaSearchResultV3AdapterDelegate", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;Landroidx/recyclerview/widget/RecyclerView$u;Lfd/o;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV3AdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AviaSearchResultVO.AviaSearchResultItemVO>> aviaSearchResultV3AdapterDelegate(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull AviaSearchResultViewPool aviaSearchResultViewPool, @NotNull RecyclerView.u luggageViewPool, @NotNull InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> onBadgeSelectedListener) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(aviaSearchResultViewPool, "aviaSearchResultViewPool");
        Intrinsics.checkNotNullParameter(luggageViewPool, "luggageViewPool");
        Intrinsics.checkNotNullParameter(onBadgeSelectedListener, "onBadgeSelectedListener");
        return new DslViewBindingListAdapterDelegate(AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$1.INSTANCE, AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$2(aviaSearchResultViewPool, onBadgeSelectedListener, actionHandler, luggageViewPool), AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
