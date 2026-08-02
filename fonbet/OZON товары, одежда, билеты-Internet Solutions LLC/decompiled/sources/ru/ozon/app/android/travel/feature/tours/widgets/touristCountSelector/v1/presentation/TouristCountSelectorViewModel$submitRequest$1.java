package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/AtomAction;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponse;)Lru/ozon/uni/atoms/af/AtomAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountSelectorViewModel$submitRequest$1 extends AbstractC7737t implements Function1<TravelCommonActionResponse, AtomAction> {
    public static final TouristCountSelectorViewModel$submitRequest$1 INSTANCE = new TouristCountSelectorViewModel$submitRequest$1();

    TouristCountSelectorViewModel$submitRequest$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AtomAction invoke(TravelCommonActionResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AtomActionMapperKt.toAtomAction(it.getAction(), null);
    }
}
