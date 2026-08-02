package Yd;

import Ae.a;
import Zd.a;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.room.v;
import androidx.room.w;
import com.google.gson.Gson;
import com.zoho.livechat.android.modules.common.data.local.MobilistenDatabase;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.Q;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import le.C5461a;
import le.C5462b;
import od.m;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import rd.C6218a;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import yd.C6876a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14134a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14135b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14136c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Gson f14137d;

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f14138e;

    /* renamed from: f, reason: collision with root package name */
    public static MobilistenDatabase f14139f;

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f14140g;

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f14141h;

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f14142i;

    /* renamed from: j, reason: collision with root package name */
    public static SharedPreferences f14143j;

    /* renamed from: k, reason: collision with root package name */
    public static SharedPreferences f14144k;

    /* renamed from: Yd.a$a, reason: collision with other inner class name */
    public static final class C0293a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0293a f14145d = new C0293a();

        public C0293a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GsonConverterFactory invoke() {
            return GsonConverterFactory.create();
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f14146d = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C5462b invoke() {
            C5462b c5462b = new C5462b(null, 1, 0 == true ? 1 : 0);
            c5462b.c(C5462b.a.BODY);
            return c5462b;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f14147d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder addInterceptor = builder.connectTimeout(30L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).addInterceptor(new C5461a());
            a.C0010a c0010a = Ae.a.f447b;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            OkHttpClient.Builder addInterceptor2 = addInterceptor.addInterceptor(new le.c(c0010a.b(e10), C6876a.f68336f.a()));
            if (Intrinsics.areEqual("true", System.getProperty("enable_salesiq_network_logs"))) {
                addInterceptor2.addInterceptor(a.l());
            }
            return addInterceptor2.build();
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f14148d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Retrofit invoke() {
            return new Retrofit.Builder().baseUrl(sd.d.d()).addConverterFactory(a.f14134a.k()).client(a.m()).build();
        }
    }

    static {
        Gson b10 = new com.google.gson.d().j(com.google.gson.b.f38070a).d().c().b();
        Intrinsics.checkNotNullExpressionValue(b10, "create(...)");
        f14137d = b10;
        f14138e = LazyKt.lazy(C0293a.f14145d);
        f14140g = LazyKt.lazy(b.f14146d);
        f14141h = LazyKt.lazy(c.f14147d);
        f14142i = LazyKt.lazy(d.f14148d);
    }

    public static final HttpUrl.Builder d(String baseUrl, String str, String... path) {
        HttpUrl.Builder newBuilder;
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(path, "path");
        HttpUrl parse = HttpUrl.INSTANCE.parse(baseUrl);
        if (parse == null || (newBuilder = parse.newBuilder()) == null) {
            return null;
        }
        if (str != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(path, path.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            newBuilder.addPathSegments(format);
        }
        return newBuilder;
    }

    public static final HttpUrl.Builder e(String baseUrl, String... path) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(path, "path");
        return f(baseUrl, null, path, 2, null);
    }

    public static /* synthetic */ HttpUrl.Builder f(String str, String str2, String[] strArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d(str, str2, strArr);
    }

    public static final HttpUrl.Builder g(String endPoint, String... path) {
        HttpUrl.Builder newBuilder;
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(path, "path");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String d10 = sd.d.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getServiceUrl(...)");
        HttpUrl parse = companion.parse(d10);
        if (parse == null || (newBuilder = parse.newBuilder()) == null) {
            return null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] copyOf = Arrays.copyOf(path, path.length);
        String format = String.format(endPoint, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return newBuilder.addPathSegments(format);
    }

    public static final MobilistenDatabase h() {
        MobilistenDatabase mobilistenDatabase;
        synchronized (f14136c) {
            mobilistenDatabase = f14139f;
            if (mobilistenDatabase == null) {
                Application e10 = MobilistenInitProvider.INSTANCE.e();
                Intrinsics.checkNotNull(e10);
                w.a a10 = v.a(e10, MobilistenDatabase.class, "mobilisten_zoho_salesiq.db");
                MobilistenDatabase.a aVar = MobilistenDatabase.a.f42591a;
                w d10 = a10.b(aVar.a()).b(aVar.b()).b(aVar.c()).b(aVar.d()).b(aVar.e()).d();
                f14139f = (MobilistenDatabase) d10;
                mobilistenDatabase = (MobilistenDatabase) d10;
            }
        }
        return mobilistenDatabase;
    }

    public static final SharedPreferences i() {
        SharedPreferences sharedPreferences;
        Resources resources;
        synchronized (f14135b) {
            try {
                MobilistenInitProvider.Companion companion = MobilistenInitProvider.INSTANCE;
                Application e10 = companion.e();
                Q.f44460u = (e10 == null || (resources = e10.getResources()) == null) ? false : resources.getBoolean(m.f59916c);
                sharedPreferences = f14144k;
                if (sharedPreferences == null) {
                    Application e11 = companion.e();
                    Intrinsics.checkNotNull(e11);
                    SharedPreferences f10 = new Zd.a(e11, o()).f();
                    if (f10 == null) {
                        f14134a.p();
                        f10 = o();
                    }
                    sharedPreferences = f10;
                    f14144k = sharedPreferences;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    public static final Gson j() {
        return f14137d;
    }

    public static final C5462b l() {
        return (C5462b) f14140g.getValue();
    }

    public static final OkHttpClient m() {
        return (OkHttpClient) f14141h.getValue();
    }

    public static final Retrofit n() {
        Object value = f14142i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Retrofit) value;
    }

    public static final SharedPreferences o() {
        SharedPreferences sharedPreferences;
        synchronized (f14135b) {
            try {
                sharedPreferences = f14143j;
                if (sharedPreferences == null) {
                    sharedPreferences = C6218a.M();
                    if (sharedPreferences == null) {
                        Application e10 = MobilistenInitProvider.INSTANCE.e();
                        Intrinsics.checkNotNull(e10);
                        sharedPreferences = e10.getSharedPreferences("siq_session", 0);
                    }
                    f14143j = sharedPreferences;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "synchronized(...)");
        return sharedPreferences;
    }

    public final GsonConverterFactory k() {
        return (GsonConverterFactory) f14138e.getValue();
    }

    public final void p() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        Resources resources;
        a.C0309a c0309a = Zd.a.f14774f;
        if (!c0309a.b() || (edit = o().edit()) == null || (putBoolean = edit.putBoolean("is_encrypted_shared_preference_failure_acknowledged", false)) == null) {
            return;
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if ((e10 != null && (resources = e10.getResources()) != null && resources.getBoolean(m.f59914a)) || c0309a.a() >= 3) {
            putBoolean.remove("encrypted_data_version");
            putBoolean.putBoolean("are_new_encrypted_keys_present_in_default_preferences", true);
        }
        putBoolean.apply();
    }
}
