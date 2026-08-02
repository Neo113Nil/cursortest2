package p3;

import android.os.Build;
import com.google.gson.Gson;
import com.google.gson.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import l3.InterfaceC5397b;
import m3.C5547a;
import n3.C5664a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import zendesk.core.Constants;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6042a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6042a f63028a = new C6042a();

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    public static final class C0870a implements Interceptor {

        /* renamed from: a, reason: collision with root package name */
        public static final C0870a f63029a = new C0870a();

        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            return chain.proceed(request.newBuilder().header(Constants.USER_AGENT_HEADER_KEY, "Android_" + Build.VERSION.SDK_INT + "_Paystack_3.1.3").header("X-Paystack-Build", String.valueOf(-1)).header(Constants.ACCEPT_HEADER, "application/json").method(request.method(), request.body()).build());
        }
    }

    public final InterfaceC5397b a() {
        Gson b10 = new d().i("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").b();
        C5664a c5664a = new C5664a();
        OkHttpClient.Builder sslSocketFactory = new OkHttpClient.Builder().addInterceptor(C0870a.f63029a).sslSocketFactory(c5664a, c5664a.b());
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Object create = new Retrofit.Builder().baseUrl("https://api.paystack.co/").client(sslSocketFactory.connectTimeout(1L, timeUnit).readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).build()).addConverterFactory(new C5547a.C0811a()).addConverterFactory(GsonConverterFactory.create(b10)).build().create(InterfaceC5397b.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "retrofit.create(PaystackApiService::class.java)");
        return (InterfaceC5397b) create;
    }
}
