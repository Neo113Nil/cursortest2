package ru.ozon.app.android.whitelist.data;

import YY.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.whitelist.common.StaticsWhitelistDomainsProvider;
import ru.ozon.app.android.whitelist.common.utils.CdnChooserSdkWhiteListDomainDelegate;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/whitelist/data/CdnChooserSdkWhitelistDomainProvider;", "Lru/ozon/app/android/whitelist/common/StaticsWhitelistDomainsProvider;", "LYY/a;", "cdnChooserSdk", "<init>", "(LYY/a;)V", "", "", "provideStaticsWhitelistDomains", "()Ljava/util/Set;", "LYY/a;", "prod_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CdnChooserSdkWhitelistDomainProvider extends StaticsWhitelistDomainsProvider {

    @NotNull
    private final a cdnChooserSdk;

    public CdnChooserSdkWhitelistDomainProvider(@NotNull a cdnChooserSdk) {
        Intrinsics.checkNotNullParameter(cdnChooserSdk, "cdnChooserSdk");
        this.cdnChooserSdk = cdnChooserSdk;
    }

    @Override // ru.ozon.app.android.whitelist.common.StaticsWhitelistDomainsProvider
    @NotNull
    public Set<String> provideStaticsWhitelistDomains() {
        return CdnChooserSdkWhiteListDomainDelegate.INSTANCE.getWhitelistDomains((ZY.a) this.cdnChooserSdk.a().getValue());
    }
}
