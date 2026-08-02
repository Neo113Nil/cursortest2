package Sj;

import com.google.gson.Gson;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.RestServiceProvider;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10837a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OkHttpClient a(RestServiceProvider restServiceProvider, h interceptor) {
            Intrinsics.checkNotNullParameter(restServiceProvider, "restServiceProvider");
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            return Sj.a.f10836a.a(restServiceProvider.getCoreOkHttpClient().newBuilder().addInterceptor(interceptor)).build();
        }

        public final Retrofit b(Gson gson, ApplicationConfiguration applicationConfiguration, OkHttpClient okHttpClient) {
            Intrinsics.checkNotNullParameter(gson, "gson");
            Intrinsics.checkNotNullParameter(applicationConfiguration, "applicationConfiguration");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Retrofit build = new Retrofit.Builder().baseUrl(applicationConfiguration.getZendeskUrl()).client(okHttpClient).addConverterFactory(GsonConverterFactory.create(gson)).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final h c() {
            return new h("1.4.0", "Talk");
        }

        public a() {
        }
    }

    public static final OkHttpClient a(RestServiceProvider restServiceProvider, h hVar) {
        return f10837a.a(restServiceProvider, hVar);
    }

    public static final Retrofit b(Gson gson, ApplicationConfiguration applicationConfiguration, OkHttpClient okHttpClient) {
        return f10837a.b(gson, applicationConfiguration, okHttpClient);
    }

    public static final h c() {
        return f10837a.c();
    }
}
