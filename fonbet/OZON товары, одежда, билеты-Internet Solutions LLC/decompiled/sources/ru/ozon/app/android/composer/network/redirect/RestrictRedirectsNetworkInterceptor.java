package ru.ozon.app.android.composer.network.redirect;

import We.B;
import We.G;
import We.L;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy;", "strategy", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "redirectsLimitCount", "I", "getRedirectsLimitCount", "()I", "setRedirectsLimitCount", "(I)V", "RedirectLimitException", "Strategy", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RestrictRedirectsNetworkInterceptor extends BXInterceptor {
    private int redirectsLimitCount;

    @NotNull
    private Strategy strategy = Strategy.Disabled.INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$RedirectLimitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "requestUrl", "", "<init>", "(Ljava/lang/String;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class RedirectLimitException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectLimitException(@NotNull String requestUrl) {
            super("Reached redirect limit for request url = " + requestUrl);
            Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy;", "", "LWe/L;", "response", "", "handle", "(LWe/L;)V", "Disabled", "Enabled", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy$Disabled;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy$Enabled;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface Strategy {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy$Disabled;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy;", "<init>", "()V", "LWe/L;", "response", "", "handle", "(LWe/L;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Disabled implements Strategy {

            @NotNull
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
            }

            @Override // ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor.Strategy
            public void handle(@NotNull L response) {
                Intrinsics.checkNotNullParameter(response, "response");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy$Enabled;", "Lru/ozon/app/android/composer/network/redirect/RestrictRedirectsNetworkInterceptor$Strategy;", "", "redirectsLimitCount", "<init>", "(I)V", "LWe/L;", "response", "", "handle", "(LWe/L;)V", "I", "Ljava/util/concurrent/ConcurrentHashMap;", "", "redirectDepths", "Ljava/util/concurrent/ConcurrentHashMap;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Enabled implements Strategy {

            @NotNull
            private final ConcurrentHashMap<String, Integer> redirectDepths = new ConcurrentHashMap<>();
            private final int redirectsLimitCount;

            public Enabled(int i11) {
                this.redirectsLimitCount = i11;
            }

            @Override // ru.ozon.app.android.composer.network.redirect.RestrictRedirectsNetworkInterceptor.Strategy
            public void handle(@NotNull L response) {
                Intrinsics.checkNotNullParameter(response, "response");
                G L11 = response.L();
                if (!response.t()) {
                    this.redirectDepths.remove(L11.j().toString());
                    return;
                }
                String c11 = response.r().c("location");
                if (c11 == null) {
                    return;
                }
                String a11 = L11.j().toString();
                int intValue = this.redirectDepths.getOrDefault(a11, 0).intValue() + 1;
                if (intValue <= this.redirectsLimitCount) {
                    this.redirectDepths.remove(a11);
                    this.redirectDepths.put(c11, Integer.valueOf(intValue));
                } else {
                    RedirectLimitException redirectLimitException = new RedirectLimitException(a11);
                    BxLogger bxLogger = BxLogger.INSTANCE;
                    bxLogger.putKey("request url", a11);
                    bxLogger.putKey("location", c11);
                    bxLogger.putKey("redirects count", Integer.valueOf(intValue));
                    bxLogger.logException(redirectLimitException);
                    throw redirectLimitException;
                }
            }
        }

        void handle(@NotNull L response);
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        this.strategy.handle(proceed);
        return proceed;
    }

    public final void setRedirectsLimitCount(int i11) {
        this.redirectsLimitCount = i11;
        this.strategy = i11 > 0 ? new Strategy.Enabled(i11) : Strategy.Disabled.INSTANCE;
    }
}
