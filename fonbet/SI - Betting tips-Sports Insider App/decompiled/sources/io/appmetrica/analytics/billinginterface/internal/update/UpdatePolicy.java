package io.appmetrica.analytics.billinginterface.internal.update;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface UpdatePolicy {
    @NonNull
    Map<String, BillingInfo> getBillingInfoToUpdate(@NonNull BillingConfig billingConfig, @NonNull Map<String, BillingInfo> map, @NonNull BillingInfoManager billingInfoManager);
}
