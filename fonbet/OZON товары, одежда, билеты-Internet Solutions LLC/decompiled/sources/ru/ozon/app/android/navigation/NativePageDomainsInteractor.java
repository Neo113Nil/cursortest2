package ru.ozon.app.android.navigation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J+\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "", "isHostContainsInNativePageDomains", "", "host", "", "isHostContainsInNativePageDomainsByApps", "apps", "", "Lru/ozon/app/android/utils/AppType;", "(Ljava/lang/String;[Lru/ozon/app/android/utils/AppType;)Z", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NativePageDomainsInteractor {
    boolean isHostContainsInNativePageDomains(@NotNull String host);

    boolean isHostContainsInNativePageDomainsByApps(String host, @NotNull AppType... apps);
}
