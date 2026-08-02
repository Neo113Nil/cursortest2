package ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl;

import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\f\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LWe/G;", "Lru/ozon/app/android/composer/network/cache/util/Url;", "originalUrl", "(LWe/G;)Ljava/lang/String;", "Lru/ozon/app/android/composer/network/cache/util/AdaptedUrl;", "adaptedUrl", "withAdaptedUrl-hU-d_yQ", "(LWe/G;Ljava/lang/String;Ljava/lang/String;)LWe/G;", "withAdaptedUrl", "LWe/L;", "withOriginalUrl", "(LWe/L;)LWe/L;", "(LWe/G;)LWe/G;", "Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/UrlChanges;", "getChanges", "(LWe/G;)Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/UrlChanges;", "LWe/G$a;", "changes", "saveChanges", "(LWe/G$a;Lru/ozon/app/android/composer/network/cache/interceptor/adaptUrl/UrlChanges;)LWe/G$a;", "clearChanges", "(LWe/G$a;)LWe/G$a;", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UrlChangesKt {
    private static final G.a clearChanges(G.a aVar) {
        aVar.i(UrlChanges.class, null);
        return aVar;
    }

    private static final UrlChanges getChanges(G g10) {
        return (UrlChanges) g10.i(UrlChanges.class);
    }

    public static final String originalUrl(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        UrlChanges changes = getChanges(g10);
        if (changes != null) {
            return changes.getOriginalUrl();
        }
        return null;
    }

    private static final G.a saveChanges(G.a aVar, UrlChanges urlChanges) {
        aVar.i(UrlChanges.class, urlChanges);
        return aVar;
    }

    @NotNull
    /* renamed from: withAdaptedUrl-hU-d_yQ, reason: not valid java name */
    public static final G m642withAdaptedUrlhUd_yQ(@NotNull G withAdaptedUrl, @NotNull String adaptedUrl, @NotNull String originalUrl) {
        Intrinsics.checkNotNullParameter(withAdaptedUrl, "$this$withAdaptedUrl");
        Intrinsics.checkNotNullParameter(adaptedUrl, "adaptedUrl");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        UrlChanges urlChanges = new UrlChanges(originalUrl, adaptedUrl, null);
        withAdaptedUrl.getClass();
        G.a saveChanges = saveChanges(new G.a(withAdaptedUrl), urlChanges);
        saveChanges.k(adaptedUrl);
        return saveChanges.b();
    }

    @NotNull
    public static final L withOriginalUrl(@NotNull L l11) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        G withOriginalUrl = withOriginalUrl(l11.L());
        if (withOriginalUrl == l11.L()) {
            return l11;
        }
        L.a aVar = new L.a(l11);
        aVar.r(withOriginalUrl);
        return aVar.c();
    }

    @NotNull
    public static final G withOriginalUrl(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        UrlChanges changes = getChanges(g10);
        if (changes == null) {
            return g10;
        }
        g10.getClass();
        G.a clearChanges = clearChanges(new G.a(g10));
        if (Intrinsics.d(g10.j().toString(), changes.getAdaptedUrl())) {
            clearChanges.k(changes.getOriginalUrl());
        }
        return clearChanges.b();
    }
}
