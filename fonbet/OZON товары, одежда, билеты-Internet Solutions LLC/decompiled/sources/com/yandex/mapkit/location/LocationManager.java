package com.yandex.mapkit.location;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface LocationManager {
    void requestSingleUpdate(@NonNull LocationListener locationListener);

    void resume();

    void subscribeForLocationUpdates(@NonNull SubscriptionSettings subscriptionSettings, @NonNull LocationListener locationListener);

    void suspend();

    void unsubscribe(@NonNull LocationListener locationListener);
}
