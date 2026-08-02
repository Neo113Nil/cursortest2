package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.response.LargeOrdersLiftingData;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.response.LargeOrdersLiftingResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LargeOrdersLiftingV2ViewModel$onLiftingConfirm$1 extends AbstractC7737t implements Function1<LargeOrdersLiftingResponse, Unit> {
    final /* synthetic */ LargeOrdersLiftingV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LargeOrdersLiftingV2ViewModel$onLiftingConfirm$1(LargeOrdersLiftingV2ViewModel largeOrdersLiftingV2ViewModel) {
        super(1);
        this.this$0 = largeOrdersLiftingV2ViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LargeOrdersLiftingResponse largeOrdersLiftingResponse) {
        invoke2(largeOrdersLiftingResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LargeOrdersLiftingResponse largeOrdersLiftingResponse) {
        AtomActionDTO action;
        LargeOrdersLiftingData data = largeOrdersLiftingResponse.getData();
        AtomAction atomAction = null;
        if (data != null && (action = data.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, null);
        }
        if (atomAction != null) {
            this.this$0.getConfirmAction().setValue(atomAction);
        }
        String error = largeOrdersLiftingResponse.getError();
        if (error == null || error.length() == 0) {
            return;
        }
        this.this$0.getMessage().setValue(error);
    }
}
