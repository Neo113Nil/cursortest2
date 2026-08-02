package ru.ozon.app.android.network.interceptors;

import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import ie0.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/network/interceptors/GeoRequestsLogInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/G;", "request", "", "logGeoRequest", "(LWe/G;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeoRequestsLogInterceptor extends BXInterceptor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String[] URLS = {"geoProvidersV2", "mapKeys", "suggest", "disallowedCountries"};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/network/interceptors/GeoRequestsLogInterceptor$Companion;", "", "<init>", "()V", "", "GEO_PROVIDERS_URL", "Ljava/lang/String;", "MAP_KEYS_URL", "SUGGEST_URL", "DISALLOWED_COUNTRIES_URL", "EVENT_NAME", "REQUEST_URL_KEY", "URL_KEY", "REQUEST_METHOD", "BODY_KEY", "CLIENT_NAME_KEY", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void logGeoRequest(G request) {
        String str;
        String uri = Uri.parse(request.j().toString()).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        for (String str2 : URLS) {
            if (h.t(uri, str2, false)) {
                Pair pair = new Pair("requestUrl", request.j().toString());
                Pair pair2 = new Pair(ImagesContract.URL, request.j().toString());
                Pair pair3 = new Pair("requestMethod", request.h());
                Pair pair4 = new Pair("body", String.valueOf(request.a()));
                g.f66321a.getClass();
                GeoProxyConfig c11 = g.c();
                if (c11 == null || (str = c11.getAppName()) == null) {
                    str = "";
                }
                OzonLogger.DefaultImpls.logEvent$default(BxLogger.INSTANCE, "map_sdk_request_sending", U.j(pair, pair2, pair3, pair4, new Pair("clientName", str)), null, 5, 4, null);
            }
        }
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        logGeoRequest(proceed.L());
        return proceed;
    }
}
