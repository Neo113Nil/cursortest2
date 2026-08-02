package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\n0\t2(\u0010\u0006\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0004\u0012\u00020\u00050\u00002\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/Function3;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onBonusPayStateChangeListener", "Lkotlin/Function1;", "processViewEvent", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "aviaSearchResultV3BonusAdapterDelegate", "(Lfd/n;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV3BonusPayAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AviaSearchResultVO.AviaSearchResultItemVO>> aviaSearchResultV3BonusAdapterDelegate(@NotNull InterfaceC6511n<? super Boolean, ? super AtomAction, ? super t, Unit> onBonusPayStateChangeListener, @NotNull Function1<? super t, Unit> processViewEvent) {
        Intrinsics.checkNotNullParameter(onBonusPayStateChangeListener, "onBonusPayStateChangeListener");
        Intrinsics.checkNotNullParameter(processViewEvent, "processViewEvent");
        return new DslViewBindingListAdapterDelegate(AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$1.INSTANCE, AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2(onBonusPayStateChangeListener, processViewEvent), AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
