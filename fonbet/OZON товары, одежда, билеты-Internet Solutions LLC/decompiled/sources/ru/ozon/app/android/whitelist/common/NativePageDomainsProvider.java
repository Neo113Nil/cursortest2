package ru.ozon.app.android.whitelist.common;

import G.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.whitelist.common.utils.StringArraysUtils;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\n\"\u00020\bH&¢\u0006\u0002\u0010\u000bJ/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\n\"\u00020\bH\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/whitelist/common/NativePageDomainsProvider;", "", "stringArraysUtils", "Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;", "<init>", "(Lru/ozon/app/android/whitelist/common/utils/StringArraysUtils;)V", "provideNativePageDomainsByApps", "", "", "appNames", "", "([Ljava/lang/String;)Ljava/util/Set;", "getWhitelistedDomains", "", "key", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;", "Companion", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NativePageDomainsProvider {

    @NotNull
    protected static final Companion Companion = new Companion(null);

    @NotNull
    private final StringArraysUtils stringArraysUtils;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/whitelist/common/NativePageDomainsProvider$Companion;", "", "<init>", "()V", "KEY_PROD_NATIVE_DOMAINS", "", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativePageDomainsProvider(@NotNull StringArraysUtils stringArraysUtils) {
        Intrinsics.checkNotNullParameter(stringArraysUtils, "stringArraysUtils");
        this.stringArraysUtils = stringArraysUtils;
    }

    @NotNull
    protected final List<String> getWhitelistedDomains(@NotNull String key, @NotNull String... appNames) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(appNames, "appNames");
        ArrayList arrayList = new ArrayList();
        for (String str : appNames) {
            C7714v.p(this.stringArraysUtils.getStringArray(g.c(str, "_", key)), arrayList);
        }
        return NativePageDomainsProviderKt.duplicateWithWww(arrayList);
    }

    @NotNull
    public abstract Set<String> provideNativePageDomainsByApps(@NotNull String... appNames);
}
