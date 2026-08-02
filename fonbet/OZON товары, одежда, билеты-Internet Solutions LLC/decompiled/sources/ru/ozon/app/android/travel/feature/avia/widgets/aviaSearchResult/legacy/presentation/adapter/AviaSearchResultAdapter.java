package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter;

import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3AdapterDelegateKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3BonusPayAdapterDelegateKt;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001Bï\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00120\u0010\u0013\u001a,\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00060\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012(\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u001c\u0010\u001b\u001a\u0018\u0012\b\u0012\u00060\u0019j\u0002`\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001a\u0010\u001d\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchResultAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "", "onBannerClick", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "aviaSearchResultViewPool", "Lkotlin/Function4;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onBadgeSelectedListener", "Landroidx/recyclerview/widget/RecyclerView$u;", "luggageViewPool", "Lkotlin/Function3;", "", "onBonusPayStateChangeListener", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/DropDownBannerItem;", "onDropDownBannerClickedListener", "onImageBannerClickedListener", "processViewEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;Lfd/o;Landroidx/recyclerview/widget/RecyclerView$u;Lfd/n;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultAdapter extends CoroutineListDifferAdapter<AviaSearchResultVO.AviaSearchResultItemVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super AtomAction, ? super Integer, Unit> onBannerClick, @NotNull AviaSearchResultViewPool aviaSearchResultViewPool, @NotNull InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> onBadgeSelectedListener, @NotNull RecyclerView.u luggageViewPool, @NotNull InterfaceC6511n<? super Boolean, ? super AtomAction, ? super t, Unit> onBonusPayStateChangeListener, @NotNull Function2<? super AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem, ? super Integer, Unit> onDropDownBannerClickedListener, @NotNull Function1<? super AtomAction, Unit> onImageBannerClickedListener, @NotNull Function1<? super t, Unit> processViewEvent) {
        super(new AviaSearchResultDiffUtilItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBannerClick, "onBannerClick");
        Intrinsics.checkNotNullParameter(aviaSearchResultViewPool, "aviaSearchResultViewPool");
        Intrinsics.checkNotNullParameter(onBadgeSelectedListener, "onBadgeSelectedListener");
        Intrinsics.checkNotNullParameter(luggageViewPool, "luggageViewPool");
        Intrinsics.checkNotNullParameter(onBonusPayStateChangeListener, "onBonusPayStateChangeListener");
        Intrinsics.checkNotNullParameter(onDropDownBannerClickedListener, "onDropDownBannerClickedListener");
        Intrinsics.checkNotNullParameter(onImageBannerClickedListener, "onImageBannerClickedListener");
        Intrinsics.checkNotNullParameter(processViewEvent, "processViewEvent");
        this.delegatesManager.addDelegate(AviaSearchResultV3AdapterDelegateKt.aviaSearchResultV3AdapterDelegate(actionHandler, aviaSearchResultViewPool, luggageViewPool, onBadgeSelectedListener)).addDelegate(AviaSearchResultV3BonusPayAdapterDelegateKt.aviaSearchResultV3BonusAdapterDelegate(onBonusPayStateChangeListener, processViewEvent)).addDelegate(AviaSearchResultDropDownBannerAdapterDelegateKt.aviaSearchResultDropDownBannerAdapterDelegate(onDropDownBannerClickedListener)).addDelegate(AviaSearchResultImageBannerAdapterDelegateKt.aviaSearchResultImageBannerAdapterDelegate(onImageBannerClickedListener)).addDelegate(AviaSearchResultBannerAdapterDelegateKt.aviaSearchResultBannerAdapterDelegate(onBannerClick));
    }
}
