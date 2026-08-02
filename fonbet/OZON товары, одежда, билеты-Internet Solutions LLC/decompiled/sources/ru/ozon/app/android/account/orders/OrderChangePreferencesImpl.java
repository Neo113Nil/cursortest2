package ru.ozon.app.android.account.orders;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/OrderChangePreferencesImpl;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "<init>", "()V", "lastUpdated", "", "markAsUpdated", "", "getLastUpdateTime", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderChangePreferencesImpl implements OrderChangePreferences {
    private long lastUpdated;

    @Override // ru.ozon.app.android.account.orders.OrderChangePreferences
    /* renamed from: getLastUpdateTime, reason: from getter */
    public long getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // ru.ozon.app.android.account.orders.OrderChangePreferences
    public void markAsUpdated() {
        this.lastUpdated = System.currentTimeMillis();
    }
}
