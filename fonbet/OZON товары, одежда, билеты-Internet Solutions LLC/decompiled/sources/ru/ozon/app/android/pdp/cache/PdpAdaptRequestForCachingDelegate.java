package ru.ozon.app.android.pdp.cache;

import B0.C2454a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.AdaptRequestForCachingDelegate;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pdp.flags.CachePdpIgnoredQueryParamsFlag;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/cache/PdpAdaptRequestForCachingDelegate;", "Lru/ozon/app/android/composer/network/cache/AdaptRequestForCachingDelegate;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "urlIgnoreQueryParams", "", "", "getUrlIgnoreQueryParams", "()Ljava/util/Set;", "pageUrlIgnoreQueryParams", "getPageUrlIgnoreQueryParams", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpAdaptRequestForCachingDelegate extends AdaptRequestForCachingDelegate {

    @NotNull
    private final Set<String> pageUrlIgnoreQueryParams;

    @NotNull
    private final Set<String> urlIgnoreQueryParams;

    public PdpAdaptRequestForCachingDelegate(@NotNull FeatureService featureService) {
        Set Y02;
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        String stringKey = featureService.getStringKey(CachePdpIgnoredQueryParamsFlag.INSTANCE);
        if (stringKey.length() == 0) {
            Y02 = M.f71699a;
        } else {
            List l11 = h.l(stringKey, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                C2454a.g((String) it.next(), arrayList);
            }
            Y02 = C7714v.Y0(arrayList);
        }
        this.urlIgnoreQueryParams = e0.f(Y02, super.getUrlIgnoreQueryParams());
        this.pageUrlIgnoreQueryParams = e0.f(Y02, super.getPageUrlIgnoreQueryParams());
    }

    @Override // ru.ozon.app.android.composer.network.cache.AdaptRequestForCachingDelegate
    @NotNull
    protected Set<String> getPageUrlIgnoreQueryParams() {
        return this.pageUrlIgnoreQueryParams;
    }

    @Override // ru.ozon.app.android.composer.network.cache.AdaptRequestForCachingDelegate
    @NotNull
    protected Set<String> getUrlIgnoreQueryParams() {
        return this.urlIgnoreQueryParams;
    }
}
