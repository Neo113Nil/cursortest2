package ru.ozon.app.android.bank.push.handler;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.app.Application;
import eh0.c;
import eh0.d;
import fh0.C6568c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.push.domain.NotificationServiceInteractor;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/bank/push/handler/OzonBankPushHandler;", "Leh0/d;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lfh0/c;", "pushModel", "Leh0/c;", "handle", "(Lfh0/c;)Leh0/c;", "", "shouldHandle", "(Lfh0/c;)Z", "Landroid/app/Application;", "Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractor;", "notificationServiceInteractor$delegate", "LSc/j;", "getNotificationServiceInteractor", "()Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractor;", "notificationServiceInteractor", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonBankPushHandler implements d {

    @NotNull
    private final Application application;

    /* renamed from: notificationServiceInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationServiceInteractor;

    public OzonBankPushHandler(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.notificationServiceInteractor = k.a(n.PUBLICATION, new OzonBankPushHandler$notificationServiceInteractor$2(this));
    }

    private final NotificationServiceInteractor getNotificationServiceInteractor() {
        return (NotificationServiceInteractor) this.notificationServiceInteractor.getValue();
    }

    @Override // eh0.d
    @NotNull
    public c handle(@NotNull C6568c pushModel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        return getNotificationServiceInteractor().handleNotificationPushModel(pushModel);
    }

    @Override // eh0.d
    public boolean shouldHandle(@NotNull C6568c pushModel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        return getNotificationServiceInteractor().shouldInterceptMessage(pushModel);
    }
}
