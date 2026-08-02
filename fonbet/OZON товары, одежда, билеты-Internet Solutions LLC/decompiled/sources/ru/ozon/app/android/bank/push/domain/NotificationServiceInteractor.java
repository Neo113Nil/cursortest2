package ru.ozon.app.android.bank.push.domain;

import eh0.c;
import fh0.C6568c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/bank/push/domain/NotificationServiceInteractor;", "", "Lfh0/c;", "pushModel", "", "shouldInterceptMessage", "(Lfh0/c;)Z", "Leh0/c;", "handleNotificationPushModel", "(Lfh0/c;)Leh0/c;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface NotificationServiceInteractor {
    @NotNull
    c handleNotificationPushModel(@NotNull C6568c pushModel);

    boolean shouldInterceptMessage(@NotNull C6568c pushModel);
}
