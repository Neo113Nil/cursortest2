package ru.ozon.app.android.whitelist.data;

import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.whitelist.common.NativePageDomainsProvider;
import ru.ozon.app.android.whitelist.common.utils.StringArraysUtils;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\n\"\u00020\bH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/whitelist/data/NativePageDomainsProviderImpl;", "Lru/ozon/app/android/whitelist/common/NativePageDomainsProvider;", "stringArraysUtils", "Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;", "<init>", "(Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;)V", "provideNativePageDomainsByApps", "", "", "appNames", "", "([Ljava/lang/String;)Ljava/util/Set;", "prod_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NativePageDomainsProviderImpl extends NativePageDomainsProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePageDomainsProviderImpl(@NotNull StringArraysUtils stringArraysUtils) {
        super(stringArraysUtils);
        Intrinsics.checkNotNullParameter(stringArraysUtils, "stringArraysUtils");
    }

    @Override // ru.ozon.app.android.whitelist.common.NativePageDomainsProvider
    @NotNull
    public Set<String> provideNativePageDomainsByApps(@NotNull String... appNames) {
        Intrinsics.checkNotNullParameter(appNames, "appNames");
        return C7714v.Y0(getWhitelistedDomains("prod_native_domains", (String[]) Arrays.copyOf(appNames, appNames.length)));
    }
}
