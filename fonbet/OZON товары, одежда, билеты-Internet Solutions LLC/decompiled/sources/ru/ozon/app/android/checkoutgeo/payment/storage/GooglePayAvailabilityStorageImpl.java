package ru.ozon.app.android.checkoutgeo.payment.storage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorageImpl;", "Lru/ozon/app/android/checkoutgeo/payment/storage/GooglePayAvailabilityStorage;", "<init>", "()V", "isGooglePayReady", "", "isGooglePaySupported", "setGooglePayReady", "", "isReady", "setGooglePaySupported", "isSupported", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayAvailabilityStorageImpl implements GooglePayAvailabilityStorage {
    private boolean isGooglePayReady;
    private boolean isGooglePaySupported;

    @Override // ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage
    /* renamed from: isGooglePayReady, reason: from getter */
    public boolean getIsGooglePayReady() {
        return this.isGooglePayReady;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage
    /* renamed from: isGooglePaySupported, reason: from getter */
    public boolean getIsGooglePaySupported() {
        return this.isGooglePaySupported;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage
    public void setGooglePayReady(boolean isReady) {
        this.isGooglePayReady = isReady;
    }

    @Override // ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage
    public void setGooglePaySupported(boolean isSupported) {
        this.isGooglePaySupported = isSupported;
    }
}
