package j3;

import android.os.Build;
import com.google.gson.Gson;
import com.google.gson.d;
import java.util.concurrent.TimeUnit;
import l3.InterfaceC5396a;
import n3.C5664a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import zendesk.core.Constants;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5091a {

    /* renamed from: b, reason: collision with root package name */
    public static String f53660b = "https://standard.paystack.co/";

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5396a f53661a;

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    public class C0774a implements Interceptor {
        public C0774a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Request request = chain.request();
            return chain.proceed(request.newBuilder().header(Constants.USER_AGENT_HEADER_KEY, "Android_" + Build.VERSION.SDK_INT + "_Paystack_3.1.3").header("X-Paystack-Build", String.valueOf(-1)).header(Constants.ACCEPT_HEADER, "application/json").method(request.method(), request.body()).build());
        }
    }

    public C5091a() {
        Gson b10 = new d().i("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").b();
        C5664a c5664a = new C5664a();
        OkHttpClient.Builder sslSocketFactory = new OkHttpClient.Builder().addInterceptor(new C0774a()).sslSocketFactory(c5664a, c5664a.b());
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f53661a = (InterfaceC5396a) new Retrofit.Builder().baseUrl(f53660b).client(sslSocketFactory.connectTimeout(5L, timeUnit).readTimeout(5L, timeUnit).writeTimeout(5L, timeUnit).build()).addConverterFactory(GsonConverterFactory.create(b10)).build().create(InterfaceC5396a.class);
    }

    public InterfaceC5396a a() {
        return this.f53661a;
    }
}
