package com.plaid.internal;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.protobuf.ProtoConverterFactory;

@SourceDebugExtension({"SMAP\nPlaidRetrofitFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidRetrofitFactory.kt\ncom/plaid/internal/core/networking/PlaidRetrofitFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,129:1\n1#2:130\n563#3:131\n*S KotlinDebug\n*F\n+ 1 PlaidRetrofitFactory.kt\ncom/plaid/internal/core/networking/PlaidRetrofitFactory\n*L\n60#1:131\n*E\n"})
/* loaded from: classes3.dex */
public final class E5 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f39229c = new a();

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile E5 f39230d;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f39231a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f39232b = new LinkedHashMap();

    @SourceDebugExtension({"SMAP\nPlaidRetrofitFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidRetrofitFactory.kt\ncom/plaid/internal/core/networking/PlaidRetrofitFactory$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class a {
        @NotNull
        public final E5 a(@Nullable String str) {
            E5 e52;
            E5 e53 = E5.f39230d;
            if (e53 != null) {
                return e53;
            }
            synchronized (this) {
                e52 = E5.f39230d;
                if (e52 == null) {
                    e52 = new E5(str);
                    E5.f39230d = e52;
                }
            }
            return e52;
        }
    }

    public E5(String str) {
        this.f39231a = str;
    }

    @NotNull
    public final Retrofit a(@NotNull String baseUrl, @NotNull G5 options) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Retrofit retrofit = (Retrofit) this.f39232b.get(baseUrl);
        if (retrofit != null) {
            return retrofit;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new F5(this));
        builder.readTimeout(10L, TimeUnit.MINUTES);
        SocketFactory socketFactory = options.f39262b;
        if (socketFactory != null) {
            builder.socketFactory(socketFactory);
        }
        OkHttpClient build = builder.build();
        Gson gson = options.f39261a;
        GsonConverterFactory create = gson == null ? GsonConverterFactory.create() : GsonConverterFactory.create(gson);
        Retrofit.Builder addCallAdapterFactory = new Retrofit.Builder().client(build).addCallAdapterFactory(new T());
        Intrinsics.checkNotNullExpressionValue(addCallAdapterFactory, "addCallAdapterFactory(...)");
        addCallAdapterFactory.baseUrl(baseUrl);
        addCallAdapterFactory.addConverterFactory(ProtoConverterFactory.create());
        addCallAdapterFactory.addConverterFactory(create);
        Retrofit build2 = addCallAdapterFactory.build();
        LinkedHashMap linkedHashMap = this.f39232b;
        Intrinsics.checkNotNull(build2);
        linkedHashMap.put(baseUrl, build2);
        return build2;
    }
}
