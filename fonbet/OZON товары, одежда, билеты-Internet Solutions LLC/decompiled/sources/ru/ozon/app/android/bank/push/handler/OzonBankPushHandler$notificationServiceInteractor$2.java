package ru.ozon.app.android.bank.push.handler;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.bank.push.di.FintechNotificationServiceApi;
import ru.ozon.app.android.bank.push.domain.NotificationServiceInteractor;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractor;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OzonBankPushHandler$notificationServiceInteractor$2 extends AbstractC7737t implements Function0<NotificationServiceInteractor> {
    final /* synthetic */ OzonBankPushHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonBankPushHandler$notificationServiceInteractor$2(OzonBankPushHandler ozonBankPushHandler) {
        super(0);
        this.this$0 = ozonBankPushHandler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationServiceInteractor invoke() {
        Application application;
        application = this.this$0.application;
        if (FintechNotificationServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechNotificationServiceApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, FintechNotificationServiceApi.class).getDependencyStorage();
        if (FintechNotificationServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FintechNotificationServiceApi is not DiComponent");
        }
        return ((FintechNotificationServiceApi) dependencyStorage.b(FintechNotificationServiceApi.class)).provideNotificationServiceInteractor();
    }
}
