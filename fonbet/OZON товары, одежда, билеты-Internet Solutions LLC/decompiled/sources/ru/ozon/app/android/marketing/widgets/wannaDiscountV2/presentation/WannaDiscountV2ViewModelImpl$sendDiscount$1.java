package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Response;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Result;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WannaDiscountV2ViewModelImpl$sendDiscount$1 extends AbstractC7737t implements Function1<WannaDiscountV2Response, Unit> {
    final /* synthetic */ WannaDiscountV2ViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewModelImpl$sendDiscount$1(WannaDiscountV2ViewModelImpl wannaDiscountV2ViewModelImpl) {
        super(1);
        this.this$0 = wannaDiscountV2ViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WannaDiscountV2Response wannaDiscountV2Response) {
        invoke2(wannaDiscountV2Response);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WannaDiscountV2Response wannaDiscountV2Response) {
        WannaDiscountV2Result wannaDiscountV2Result;
        WannaDiscountV2ViewModelImpl wannaDiscountV2ViewModelImpl = this.this$0;
        String message = wannaDiscountV2Response.getMessage();
        if (message == null || message.length() == 0) {
            wannaDiscountV2Result = WannaDiscountV2Result.SendDiscountError.INSTANCE;
        } else {
            String message2 = wannaDiscountV2Response.getMessage();
            WannaDiscountV2Response.NotificationButton notificationButton = wannaDiscountV2Response.getNotificationButton();
            wannaDiscountV2Result = new WannaDiscountV2Result.SendDiscountSuccess(message2, notificationButton != null ? new WannaDiscountV2Result.SendDiscountSuccess.NotificationButton(notificationButton.getTitle(), AtomActionMapperKt.toAtomAction(notificationButton.getAction(), null)) : null);
        }
        wannaDiscountV2ViewModelImpl.addEventToQueue(wannaDiscountV2Result);
    }
}
