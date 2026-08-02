package ru.ozon.app.android.travel.actionhandler.travelResultAction;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionResponseVO;", "kotlin.jvm.PlatformType", "response", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;)Lru/ozon/app/android/travel/actionhandler/travelResultAction/TravelResultActionResponseVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelResultActionHandler$processAction$1 extends AbstractC7737t implements Function1<TravelCommonActionWithErrorResponse, TravelResultActionResponseVO> {
    public static final TravelResultActionHandler$processAction$1 INSTANCE = new TravelResultActionHandler$processAction$1();

    TravelResultActionHandler$processAction$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TravelResultActionResponseVO invoke(TravelCommonActionWithErrorResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AtomActionDTO action = response.getAction();
        return new TravelResultActionResponseVO(action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, response.getError());
    }
}
