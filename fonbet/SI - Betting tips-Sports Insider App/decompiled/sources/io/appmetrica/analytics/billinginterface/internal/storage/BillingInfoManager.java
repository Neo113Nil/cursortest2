package io.appmetrica.analytics.billinginterface.internal.storage;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface BillingInfoManager {
    BillingInfo get(@NonNull String str);

    boolean isFirstInappCheckOccurred();

    void markFirstInappCheckOccurred();

    void update(@NonNull Map<String, BillingInfo> map);
}
