package ru.ozon.app.android.network.di.module;

import Mc.a;
import We.B;
import We.C4871m;
import We.C4876s;
import We.E;
import We.InterfaceC4875q;
import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pf0.InterfaceC8924g;
import pf0.h;
import qj.C9067a;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ru.ozon.app.android.network.CustomConnectionPoolProvider;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.NetworkBaseTimeoutSec;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.flags.BxSdkOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.flags.BxSocketClientFromOzonNetworkEnabledFlag;
import ru.ozon.app.android.network.gnc.GncOkHttpClientBuilder;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkModule;", "", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NetworkModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001IB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u0016H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010+JO\u00108\u001a\u0002072\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u000e\b\u0001\u00103\u001a\b\u0012\u0004\u0012\u000202012\u000e\b\u0001\u00104\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00106\u001a\u0002052\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020/2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u000205H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020@2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\bA\u0010BJ\u001b\u0010H\u001a\u00020C*\u00020C2\u0006\u0010E\u001a\u00020DH\u0000¢\u0006\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkModule$Companion;", "", "<init>", "()V", "", "isGncClient", "Lru/ozon/app/android/network/di/module/NetworkModule$Companion$OkHttpClientParams;", "okHttpClientParams", "LWe/E;", "createOkHttpClient", "(ZLru/ozon/app/android/network/di/module/NetworkModule$Companion$OkHttpClientParams;)LWe/E;", "Landroid/content/Context;", "context", "Lqj/a;", "provideNetworkInfoProvider", "(Landroid/content/Context;)Lqj/a;", "", "adapters", "Lcom/squareup/moshi/Moshi;", "provideMoshi", "(Ljava/util/Set;)Lcom/squareup/moshi/Moshi;", "moshi", "Lretrofit2/converter/moshi/MoshiConverterFactory;", "provideMoshiConverterFactory", "(Lcom/squareup/moshi/Moshi;)Lretrofit2/converter/moshi/MoshiConverterFactory;", "Lretrofit2/CallAdapter$Factory;", "provideRxJavaCallAdapterFactory", "()Lretrofit2/CallAdapter$Factory;", "Lretrofit2/converter/scalars/ScalarsConverterFactory;", "provideScalarsConverterFactory", "()Lretrofit2/converter/scalars/ScalarsConverterFactory;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "okHttpClient", "callAdapterFactory", "scalarsConverterFactory", "moshiConverterFactory", "Lretrofit2/Retrofit;", "provideMoshiRetrofit", "(Lru/ozon/app/android/network/di/NetworkComponentConfig;LWe/E;Lretrofit2/CallAdapter$Factory;Lretrofit2/converter/scalars/ScalarsConverterFactory;Lretrofit2/converter/moshi/MoshiConverterFactory;)Lretrofit2/Retrofit;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "provideOkHttpClient", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/di/module/NetworkModule$Companion$OkHttpClientParams;)LWe/E;", "provideOkHttpClientForSocket", "LLd0/c;", "ozonLimbDiStore", "LWe/m;", "connectionPool", "", "LWe/B;", "mainInterceptors", "networkInterceptors", "LWe/s;", "dispatcher", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "provideGncOkHttpClientBuilder", "(LLd0/c;LWe/m;Ljava/util/List;Ljava/util/List;LWe/s;Lru/ozon/app/android/network/abtool/FeatureService;)Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "Lru/ozon/app/android/network/CustomConnectionPoolProvider;", "connectionPoolProvider", "provideConnectionPool", "(Lru/ozon/app/android/network/CustomConnectionPoolProvider;)LWe/m;", "provideDispatcher", "()LWe/s;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "provideDomainsInteractor", "(Landroid/content/Context;)Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "LWe/E$a;", "Lkotlin/time/b;", "timeoutSec", "setTimeout-HG0u8IE$network_prodGoogleAllVendorsRelease", "(LWe/E$a;J)LWe/E$a;", "setTimeout", "OkHttpClientParams", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/network/di/module/NetworkModule$Companion$OkHttpClientParams;", "", "LWe/q;", "cookieJar", "LWe/m;", "connectionPool", "", "LWe/B;", "mainInterceptors", "networkInterceptors", "LWe/s;", "dispatcher", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "gncOkHttpClientBuilder", "<init>", "(LWe/q;LWe/m;Ljava/util/List;Ljava/util/List;LWe/s;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;)V", "LWe/q;", "getCookieJar", "()LWe/q;", "LWe/m;", "getConnectionPool", "()LWe/m;", "Ljava/util/List;", "getMainInterceptors", "()Ljava/util/List;", "getNetworkInterceptors", "LWe/s;", "getDispatcher", "()LWe/s;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "getGncOkHttpClientBuilder", "()Lru/ozon/app/android/network/gnc/GncOkHttpClientBuilder;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class OkHttpClientParams {

            @NotNull
            private final C4871m connectionPool;

            @NotNull
            private final InterfaceC4875q cookieJar;

            @NotNull
            private final C4876s dispatcher;

            @NotNull
            private final FeatureService featureService;

            @NotNull
            private final GncOkHttpClientBuilder gncOkHttpClientBuilder;

            @NotNull
            private final List<B> mainInterceptors;

            @NotNull
            private final List<B> networkInterceptors;

            public OkHttpClientParams(@NotNull InterfaceC4875q cookieJar, @NotNull C4871m connectionPool, @NotNull List<B> mainInterceptors, @NotNull List<B> networkInterceptors, @NotNull C4876s dispatcher, @NotNull FeatureService featureService, @NotNull GncOkHttpClientBuilder gncOkHttpClientBuilder) {
                Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
                Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
                Intrinsics.checkNotNullParameter(mainInterceptors, "mainInterceptors");
                Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
                Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
                Intrinsics.checkNotNullParameter(featureService, "featureService");
                Intrinsics.checkNotNullParameter(gncOkHttpClientBuilder, "gncOkHttpClientBuilder");
                this.cookieJar = cookieJar;
                this.connectionPool = connectionPool;
                this.mainInterceptors = mainInterceptors;
                this.networkInterceptors = networkInterceptors;
                this.dispatcher = dispatcher;
                this.featureService = featureService;
                this.gncOkHttpClientBuilder = gncOkHttpClientBuilder;
            }

            @NotNull
            public final C4871m getConnectionPool() {
                return this.connectionPool;
            }

            @NotNull
            public final InterfaceC4875q getCookieJar() {
                return this.cookieJar;
            }

            @NotNull
            public final C4876s getDispatcher() {
                return this.dispatcher;
            }

            @NotNull
            public final FeatureService getFeatureService() {
                return this.featureService;
            }

            @NotNull
            public final GncOkHttpClientBuilder getGncOkHttpClientBuilder() {
                return this.gncOkHttpClientBuilder;
            }

            @NotNull
            public final List<B> getMainInterceptors() {
                return this.mainInterceptors;
            }

            @NotNull
            public final List<B> getNetworkInterceptors() {
                return this.networkInterceptors;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final E createOkHttpClient(boolean isGncClient, OkHttpClientParams okHttpClientParams) {
            if (isGncClient) {
                return okHttpClientParams.getGncOkHttpClientBuilder().build();
            }
            Companion companion = NetworkModule.INSTANCE;
            E.a aVar = new E.a();
            aVar.h(okHttpClientParams.getCookieJar());
            aVar.g(okHttpClientParams.getConnectionPool());
            Iterator<T> it = okHttpClientParams.getMainInterceptors().iterator();
            while (it.hasNext()) {
                aVar.a((B) it.next());
            }
            Iterator<T> it2 = okHttpClientParams.getNetworkInterceptors().iterator();
            while (it2.hasNext()) {
                aVar.b((B) it2.next());
            }
            b.Companion companion2 = b.INSTANCE;
            E.a m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease = companion.m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease(aVar, c.h(okHttpClientParams.getFeatureService().getLongKey(NetworkBaseTimeoutSec.INSTANCE), EnumC10311b.SECONDS));
            m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease.i(okHttpClientParams.getDispatcher());
            return new E(m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease);
        }

        @NotNull
        public final C4871m provideConnectionPool(@NotNull CustomConnectionPoolProvider connectionPoolProvider) {
            Intrinsics.checkNotNullParameter(connectionPoolProvider, "connectionPoolProvider");
            return connectionPoolProvider.provideConnectionPool();
        }

        @NotNull
        public final C4876s provideDispatcher() {
            return new C4876s();
        }

        @NotNull
        public final DomainsInteractor provideDomainsInteractor(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
            }
            C6740b dependencyStorage = C6739a.a(context, WhitelistComponentApi.class).getDependencyStorage();
            if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
            }
            return ((WhitelistComponentApi) dependencyStorage.b(WhitelistComponentApi.class)).getDomainsInteractor();
        }

        @NotNull
        public final GncOkHttpClientBuilder provideGncOkHttpClientBuilder(@NotNull Ld0.c ozonLimbDiStore, @NotNull C4871m connectionPool, @NotNull List<B> mainInterceptors, @NotNull List<B> networkInterceptors, @NotNull C4876s dispatcher, @NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(mainInterceptors, "mainInterceptors");
            Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            GncOkHttpClientBuilder gncOkHttpClientBuilder = new GncOkHttpClientBuilder((InterfaceC8924g) ozonLimbDiStore.e(h.class), false, null, null, null, null, null, null, 254, null);
            GncOkHttpClientBuilder connectionPool2 = gncOkHttpClientBuilder.connectionPool(connectionPool);
            b.Companion companion = b.INSTANCE;
            connectionPool2.m846timeoutSecLRDsOJo(c.h(featureService.getLongKey(NetworkBaseTimeoutSec.INSTANCE), EnumC10311b.SECONDS)).dispatcher(dispatcher);
            Iterator<T> it = mainInterceptors.iterator();
            while (it.hasNext()) {
                GncOkHttpClientBuilder.addAppInterceptor$default(gncOkHttpClientBuilder, (B) it.next(), 0, 2, null);
            }
            Iterator<T> it2 = networkInterceptors.iterator();
            while (it2.hasNext()) {
                GncOkHttpClientBuilder.addNetworkInterceptor$default(gncOkHttpClientBuilder, (B) it2.next(), 0, 2, null);
            }
            return gncOkHttpClientBuilder;
        }

        @NotNull
        public final Moshi provideMoshi(@NotNull Set<Object> adapters) {
            Intrinsics.checkNotNullParameter(adapters, "adapters");
            Moshi.a aVar = new Moshi.a();
            for (Object obj : adapters) {
                if (obj instanceof JsonAdapter.a) {
                    aVar.a((JsonAdapter.a) obj);
                } else {
                    aVar.b(obj);
                }
            }
            return new Moshi(aVar);
        }

        @NotNull
        public final MoshiConverterFactory provideMoshiConverterFactory(@NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            MoshiConverterFactory create = MoshiConverterFactory.create(moshi);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        @NotNull
        public final Retrofit provideMoshiRetrofit(@NotNull NetworkComponentConfig config, @NotNull E okHttpClient, @NotNull CallAdapter.Factory callAdapterFactory, @NotNull ScalarsConverterFactory scalarsConverterFactory, @NotNull MoshiConverterFactory moshiConverterFactory) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
            Intrinsics.checkNotNullParameter(scalarsConverterFactory, "scalarsConverterFactory");
            Intrinsics.checkNotNullParameter(moshiConverterFactory, "moshiConverterFactory");
            Retrofit build = new Retrofit.Builder().addConverterFactory(scalarsConverterFactory).addConverterFactory(moshiConverterFactory).addCallAdapterFactory(callAdapterFactory).baseUrl(config.getApiUrl()).client(okHttpClient).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        @NotNull
        public final C9067a provideNetworkInfoProvider(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C9067a(context);
        }

        @NotNull
        public final E provideOkHttpClient(@NotNull FeatureService featureService, @NotNull OkHttpClientParams okHttpClientParams) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(okHttpClientParams, "okHttpClientParams");
            return createOkHttpClient(featureService.getBooleanKey(BxSdkOzonNetworkEnabledFlag.INSTANCE), okHttpClientParams);
        }

        @NotNull
        public final E provideOkHttpClientForSocket(@NotNull FeatureService featureService, @NotNull OkHttpClientParams okHttpClientParams) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            Intrinsics.checkNotNullParameter(okHttpClientParams, "okHttpClientParams");
            return createOkHttpClient(featureService.getBooleanKey(BxSocketClientFromOzonNetworkEnabledFlag.INSTANCE), okHttpClientParams);
        }

        @NotNull
        public final CallAdapter.Factory provideRxJavaCallAdapterFactory() {
            RxJava2CallAdapterFactory createWithScheduler = RxJava2CallAdapterFactory.createWithScheduler(a.b());
            Intrinsics.checkNotNullExpressionValue(createWithScheduler, "createWithScheduler(...)");
            return createWithScheduler;
        }

        @NotNull
        public final ScalarsConverterFactory provideScalarsConverterFactory() {
            ScalarsConverterFactory create = ScalarsConverterFactory.create();
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        @NotNull
        /* renamed from: setTimeout-HG0u8IE$network_prodGoogleAllVendorsRelease, reason: not valid java name */
        public final E.a m843setTimeoutHG0u8IE$network_prodGoogleAllVendorsRelease(@NotNull E.a setTimeout, long j11) {
            Intrinsics.checkNotNullParameter(setTimeout, "$this$setTimeout");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            setTimeout.f(0L, timeUnit);
            setTimeout.X(0L, timeUnit);
            setTimeout.b0(0L, timeUnit);
            b.Companion companion = b.INSTANCE;
            setTimeout.d(b.o(j11, EnumC10311b.SECONDS), timeUnit);
            return setTimeout;
        }

        private Companion() {
        }
    }
}
