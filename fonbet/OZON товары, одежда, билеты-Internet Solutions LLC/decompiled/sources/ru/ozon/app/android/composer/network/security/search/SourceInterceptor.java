package ru.ozon.app.android.composer.network.security.search;

import We.A;
import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/network/security/search/SourceInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/G;", "origin", "modifyRequestIfNeeded", "(LWe/G;)LWe/G;", "LWe/A;", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setParameter", "(LWe/A;Ljava/lang/String;Ljava/lang/String;)LWe/A;", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceInterceptor extends BXInterceptor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/security/search/SourceInterceptor$Companion;", "", "<init>", "()V", "SOURCE_QUERY_PARAMETER_NAME", "", "REQUIRED_SOURCE_QUERY_PARAMETER", "URL_QUERY_PARAMETER_NAME", "SOURCE_HEADER_NAME", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final G modifyRequestIfNeeded(G origin) {
        Uri parse;
        String queryParameter;
        String p11 = origin.j().p(ImagesContract.URL);
        if (p11 == null || !h.t(p11, "source=", false) || (queryParameter = (parse = Uri.parse(p11)).getQueryParameter("source")) == null) {
            return origin;
        }
        String uri = UriExtKt.removeQueryParameter(parse, "source").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        A parameter = setParameter(origin.j(), ImagesContract.URL, uri);
        G.a aVar = new G.a(origin);
        aVar.j(parameter);
        aVar.a("x-o3-mobile-source", queryParameter);
        return aVar.b();
    }

    private final A setParameter(A a11, String str, String str2) {
        A.a j11 = a11.j();
        j11.y(str, str2);
        return j11.e();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(modifyRequestIfNeeded(chain.request()));
    }
}
