package ru.ozon.app.android.whitelist.data;

import Sc.InterfaceC4008j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.whitelist.common.NetworkRequestDomainsProvider;
import ru.ozon.app.android.whitelist.common.utils.StringArraysUtils;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/whitelist/data/NetworkRequestDomainsProviderImpl;", "Lru/ozon/app/android/whitelist/common/NetworkRequestDomainsProvider;", "Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;", "stringArraysUtils", "<init>", "(Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;)V", "", "", "provideNetworkRequestDomains", "()Ljava/util/Set;", "cachedNetworkRequestDomains$delegate", "LSc/j;", "getCachedNetworkRequestDomains", "cachedNetworkRequestDomains", "prod_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequestDomainsProviderImpl extends NetworkRequestDomainsProvider {

    /* renamed from: cachedNetworkRequestDomains$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cachedNetworkRequestDomains;

    public NetworkRequestDomainsProviderImpl(@NotNull StringArraysUtils stringArraysUtils) {
        Intrinsics.checkNotNullParameter(stringArraysUtils, "stringArraysUtils");
        this.cachedNetworkRequestDomains = UtilsKt.unsafeLazy(new NetworkRequestDomainsProviderImpl$cachedNetworkRequestDomains$2(stringArraysUtils));
    }

    private final Set<String> getCachedNetworkRequestDomains() {
        return (Set) this.cachedNetworkRequestDomains.getValue();
    }

    @Override // ru.ozon.app.android.whitelist.common.NetworkRequestDomainsProvider
    @NotNull
    public Set<String> provideNetworkRequestDomains() {
        return getCachedNetworkRequestDomains();
    }
}
