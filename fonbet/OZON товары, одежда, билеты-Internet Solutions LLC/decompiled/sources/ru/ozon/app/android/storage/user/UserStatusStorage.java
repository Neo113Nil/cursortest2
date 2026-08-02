package ru.ozon.app.android.storage.user;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\u000bR\u001c\u0010\u0003\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0004\"\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storage/user/UserStatusStorage;", "", "", "isOzonEmployee", "()Z", "setOzonEmployee", "(Z)V", "isOzonQa", "setOzonQa", "isAutoTestUser", "setAutoTestUser", "OnAutoTestUserChanged", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UserStatusStorage {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storage/user/UserStatusStorage$OnAutoTestUserChanged;", "", "onChanged", "", "isAutoTestUser", "", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface OnAutoTestUserChanged {
        void onChanged(boolean isAutoTestUser);
    }

    boolean isAutoTestUser();

    boolean isOzonEmployee();

    boolean isOzonQa();

    void setAutoTestUser(boolean z11);

    void setOzonEmployee(boolean z11);

    void setOzonQa(boolean z11);
}
