package ru.ozon.app.android.domain.flags;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/domain/flags/AccountTabIndicatorStringFlag;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "<init>", "()V", "", "serviceName", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "featureName", "getFeatureName", "flags_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccountTabIndicatorStringFlag implements FeatureFlag {

    @NotNull
    public static final AccountTabIndicatorStringFlag INSTANCE = new AccountTabIndicatorStringFlag();

    @NotNull
    private static final String serviceName = "mobile_catalog";

    @NotNull
    private static final String featureName = "account_tab_indicator_without_auth";

    private AccountTabIndicatorStringFlag() {
    }

    @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
    @NotNull
    public String getFeatureName() {
        return featureName;
    }

    @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
    @NotNull
    public String getServiceName() {
        return serviceName;
    }
}
