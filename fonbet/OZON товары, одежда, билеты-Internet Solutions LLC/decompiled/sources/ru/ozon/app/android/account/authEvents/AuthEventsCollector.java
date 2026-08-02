package ru.ozon.app.android.account.authEvents;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "", "", "collect", "()V", "Lru/ozon/app/android/account/authEvents/AuthResultActions;", "getAuthResultActions", "()Lru/ozon/app/android/account/authEvents/AuthResultActions;", "setAuthResultActions", "(Lru/ozon/app/android/account/authEvents/AuthResultActions;)V", "authResultActions", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthEventsCollector {
    void collect();

    void setAuthResultActions(AuthResultActions authResultActions);
}
