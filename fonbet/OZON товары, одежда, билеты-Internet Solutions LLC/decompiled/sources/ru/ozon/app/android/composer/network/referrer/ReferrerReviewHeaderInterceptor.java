package ru.ozon.app.android.composer.network.referrer;

import G.g;
import Sc.r;
import Sc.s;
import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/network/referrer/ReferrerReviewHeaderInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "", "rawUrl", "formatUrl", "(Ljava/lang/String;)Ljava/lang/String;", "queryUrl", "extractReviewPath", ImagesContract.URL, "decodeUrl", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "previousUrl", "Ljava/lang/String;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReferrerReviewHeaderInterceptor extends BXInterceptor {
    private String previousUrl;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/referrer/ReferrerReviewHeaderInterceptor$Companion;", "", "<init>", "()V", "HEADER_REFERER", "", "PRODUCT_REVIEW_PATH_REGEX", "TRAVEL_REVIEW_PATH_REGEX", "QUERY_URL", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.r$b] */
    private final String decodeUrl(String url) {
        String str;
        try {
            r.Companion companion = r.INSTANCE;
            str = URLDecoder.decode(url, StandardCharsets.UTF_8.name());
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            str = s.a(th2);
        }
        if (!(str instanceof r.b)) {
            url = str;
        }
        return url;
    }

    private final String extractReviewPath(String queryUrl) {
        Uri parse;
        String path;
        if (queryUrl != null && (parse = Uri.parse(queryUrl)) != null && (path = parse.getPath()) != null) {
            if (!new Regex("/products/\\d+/review/new").f(path) && !new Regex("/travel/hotels/product/\\d+/review/new").f(path)) {
                path = null;
            }
            if (path != null) {
                return h.S(path, "/");
            }
        }
        return null;
    }

    private final String formatUrl(String rawUrl) {
        List m11 = h.m(rawUrl, new String[]{"?"}, 2, 2);
        return g.c((String) m11.get(0), "?", h.X((String) m11.get(1), "?", "&", false));
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        String formatUrl;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        String a11 = request.j().toString();
        if (extractReviewPath(request.j().p(ImagesContract.URL)) == null) {
            this.previousUrl = a11;
            return chain.proceed(request);
        }
        String str = this.previousUrl;
        if (str == null || (formatUrl = formatUrl(decodeUrl(str))) == null) {
            return chain.proceed(request);
        }
        G.a aVar = new G.a(request);
        aVar.a("Referer", formatUrl);
        return chain.proceed(aVar.b());
    }
}
