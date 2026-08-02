package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.network;

import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.featureChecker.FailedExternalLinkRetryFeatureChecker;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/network/FailedExternalLinkRetryInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "failedExternalLinkRetryInteractor", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "failedExternalLinkRetryFeatureChecker", "<init>", "(Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;)V", "LWe/L;", "", "isFailed", "(LWe/L;)Z", "LWe/B$a;", "chain", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/featureChecker/FailedExternalLinkRetryFeatureChecker;", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FailedExternalLinkRetryInterceptor extends BXInterceptor {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker;

    @NotNull
    private final FailedExternalLinkRetryInteractor failedExternalLinkRetryInteractor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/network/FailedExternalLinkRetryInterceptor$Companion;", "", "<init>", "()V", "HEADER_LOCATION", "", "QUERY_URL", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FailedExternalLinkRetryInterceptor(@NotNull FailedExternalLinkRetryInteractor failedExternalLinkRetryInteractor, @NotNull FailedExternalLinkRetryFeatureChecker failedExternalLinkRetryFeatureChecker) {
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryInteractor, "failedExternalLinkRetryInteractor");
        Intrinsics.checkNotNullParameter(failedExternalLinkRetryFeatureChecker, "failedExternalLinkRetryFeatureChecker");
        this.failedExternalLinkRetryInteractor = failedExternalLinkRetryInteractor;
        this.failedExternalLinkRetryFeatureChecker = failedExternalLinkRetryFeatureChecker;
    }

    private final boolean isFailed(L l11) {
        int m11 = l11.m();
        return 400 <= m11 && m11 < 600;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            G request = chain.request();
            L proceed = chain.proceed(request);
            if (!this.failedExternalLinkRetryFeatureChecker.isEnabled()) {
                return proceed;
            }
            if (proceed.t()) {
                String p11 = request.j().p(ImagesContract.URL);
                String str = "";
                if (p11 == null) {
                    p11 = "";
                }
                String c11 = proceed.r().c("location");
                if (c11 != null) {
                    str = c11;
                }
                String queryParameter = Uri.parse(str).getQueryParameter(ImagesContract.URL);
                if (queryParameter != null) {
                    str = queryParameter;
                }
                if (!p11.equals(str)) {
                    this.failedExternalLinkRetryInteractor.modifyRedirectLink(p11, str);
                    return proceed;
                }
            } else if (proceed.v()) {
                String p12 = request.j().p(ImagesContract.URL);
                if (p12 != null) {
                    this.failedExternalLinkRetryInteractor.setSuccessLink(p12);
                    return proceed;
                }
            } else if (isFailed(proceed)) {
                this.failedExternalLinkRetryInteractor.markFailedLink();
            }
            return proceed;
        } catch (Throwable th2) {
            this.failedExternalLinkRetryInteractor.markFailedLink();
            throw th2;
        }
    }
}
