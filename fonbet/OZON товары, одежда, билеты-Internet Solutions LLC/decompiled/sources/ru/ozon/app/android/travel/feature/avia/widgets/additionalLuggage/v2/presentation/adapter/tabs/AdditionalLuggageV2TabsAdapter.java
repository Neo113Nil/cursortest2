package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/tabs/AdditionalLuggageV2TabsAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "onTabClickedListener", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2TabsAdapter extends CoroutineListDifferAdapter<AdditionalLuggageV2VO.PassengerTabVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalLuggageV2TabsAdapter(@NotNull Function1<? super Integer, Unit> onTabClickedListener) {
        super(new AdditionalLuggageV2PassengerTabItemCallback());
        Intrinsics.checkNotNullParameter(onTabClickedListener, "onTabClickedListener");
        this.delegatesManager.addDelegate(AdditionalLuggageV2TabAdapterDelegateKt.additionalLuggageV2TabAdapterDelegate(onTabClickedListener));
    }
}
