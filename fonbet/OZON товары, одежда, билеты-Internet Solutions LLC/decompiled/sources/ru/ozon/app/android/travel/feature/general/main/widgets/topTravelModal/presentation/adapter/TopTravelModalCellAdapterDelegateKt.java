package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.TopTravelModalVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\bH\u0000¨\u0006\t"}, d2 = {"topTravelModalCellAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO$TopTravelItem;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopTravelModalCellAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<TopTravelModalVO.TopTravelItem>> topTravelModalCellAdapterDelegate(Function1<? super AtomAction, Unit> function1) {
        return new DslViewBindingListAdapterDelegate(TopTravelModalCellAdapterDelegateKt$topTravelModalCellAdapterDelegate$1.INSTANCE, TopTravelModalCellAdapterDelegateKt$topTravelModalCellAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new TopTravelModalCellAdapterDelegateKt$topTravelModalCellAdapterDelegate$2(function1), TopTravelModalCellAdapterDelegateKt$topTravelModalCellAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
