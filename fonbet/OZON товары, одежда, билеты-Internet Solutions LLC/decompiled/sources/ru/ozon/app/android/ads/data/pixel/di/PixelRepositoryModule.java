package ru.ozon.app.android.ads.data.pixel.di;

import Ld0.c;
import Ve.C4598rp;
import We.E;
import We.InterfaceC4875q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.InterfaceC8924g;
import pf0.h;
import pf0.i;
import retrofit2.Retrofit;
import ru.ozon.app.android.ads.data.pixel.PixelHeadersInterceptor;
import ru.ozon.app.android.ads.data.pixel.data.PixelApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.ExtentionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryModule;", "", "Companion", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PixelRepositoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/ads/data/pixel/PixelHeadersInterceptor;", "interceptor", "LWe/q;", "cookieJar", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LLd0/c;", "ozonLimbDiStore", "LWe/E;", "providePixelOkHttpClient", "(Lru/ozon/app/android/ads/data/pixel/PixelHeadersInterceptor;LWe/q;Lru/ozon/app/android/network/abtool/FeatureChecker;LLd0/c;)LWe/E;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "pixelOkHttpClient", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "providePixelRetrofitClient", "(Lru/ozon/app/android/network/di/NetworkComponentConfig;LWe/E;)Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/ads/data/pixel/data/PixelApi;", "providePixelApi", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/ads/data/pixel/data/PixelApi;", "pixel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final PixelApi providePixelApi(@NotNull Retrofit retrofit) {
            return (PixelApi) C4598rp.b(retrofit, "retrofit", PixelApi.class, "create(...)");
        }

        @NotNull
        public final E providePixelOkHttpClient(@NotNull final PixelHeadersInterceptor interceptor, @NotNull InterfaceC4875q cookieJar, @NotNull FeatureChecker featureChecker, @NotNull c ozonLimbDiStore) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
            if (featureChecker.isEnabled(BxSdkOzonNetworkEnabledFlag.INSTANCE)) {
                return ((InterfaceC8924g) ozonLimbDiStore.e(h.class)).y(new i(interceptor) { // from class: ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryModule$Companion$providePixelOkHttpClient$1
                    private final AbstractC8919b.a consumer = AbstractC8919b.a.f80501a;
                    private final List<AbstractC8922e> interceptors;

                    {
                        this.interceptors = C7714v.a0(ExtentionsKt.toAppInterceptor(interceptor));
                    }

                    @Override // pf0.i
                    public List<AbstractC8922e> getInterceptors() {
                        return this.interceptors;
                    }

                    @Override // pf0.i
                    public AbstractC8919b.a getConsumer() {
                        return this.consumer;
                    }
                });
            }
            E.a aVar = new E.a();
            aVar.h(cookieJar);
            aVar.a(interceptor);
            return new E(aVar);
        }

        public final Retrofit providePixelRetrofitClient(@NotNull NetworkComponentConfig config, @NotNull E pixelOkHttpClient) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pixelOkHttpClient, "pixelOkHttpClient");
            return new Retrofit.Builder().client(pixelOkHttpClient).baseUrl(config.getApiUrl()).build();
        }
    }
}
