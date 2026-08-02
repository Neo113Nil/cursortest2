package com.usercentrics.sdk.services.billing;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.core.time.DateTime;
import com.usercentrics.sdk.services.api.BillingApi;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BillingService.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/usercentrics/sdk/services/billing/BillingServiceImpl;", "Lcom/usercentrics/sdk/services/billing/BillingService;", "dispatcher", "Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;", "storageInstance", "Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;", "billingApi", "Lcom/usercentrics/sdk/services/api/BillingApi;", "(Lcom/usercentrics/sdk/v2/async/dispatcher/Dispatcher;Lcom/usercentrics/sdk/services/deviceStorage/DeviceStorage;Lcom/usercentrics/sdk/services/api/BillingApi;)V", "dispatchSessionBuffer", "", "reportSession", "settingsId", "", "timestamp", "", "shouldReportNewSession", "", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BillingServiceImpl implements BillingService {
    private static final int BILLING_PERIOD_IN_DAYS = 1;
    private final BillingApi billingApi;
    private final Dispatcher dispatcher;
    private final DeviceStorage storageInstance;

    public BillingServiceImpl(Dispatcher dispatcher, DeviceStorage storageInstance, BillingApi billingApi) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(storageInstance, "storageInstance");
        Intrinsics.checkNotNullParameter(billingApi, "billingApi");
        this.dispatcher = dispatcher;
        this.storageInstance = storageInstance;
        this.billingApi = billingApi;
    }

    @Override // com.usercentrics.sdk.services.billing.BillingService
    public void reportSession(String settingsId) {
        Intrinsics.checkNotNullParameter(settingsId, "settingsId");
        if (shouldReportNewSession()) {
            reportSession(settingsId, new DateTime().timestamp());
        }
    }

    @Override // com.usercentrics.sdk.services.billing.BillingService
    public void dispatchSessionBuffer() {
        this.dispatcher.dispatch(new BillingServiceImpl$dispatchSessionBuffer$1(this, null));
    }

    private final boolean shouldReportNewSession() {
        Long sessionTimestamp = this.storageInstance.getSessionTimestamp();
        if (sessionTimestamp != null) {
            return new DateTime().atMidnight().diffInDays(new DateTime(sessionTimestamp.longValue()).atMidnight()) >= 1;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportSession(String settingsId, long timestamp) {
        try {
            this.billingApi.report(settingsId);
            this.storageInstance.setSessionTimestamp(timestamp);
        } catch (Throwable unused) {
            this.dispatcher.dispatch(new BillingServiceImpl$reportSession$1(this, timestamp, settingsId, null));
        }
    }
}
